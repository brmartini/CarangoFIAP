package com.fiap.mob.carango.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by doido on 19/11/2016.
 */

public class Carro implements Parcelable {

    private String nome;
    @SerializedName("desc")
    private String descricao;
    private String foto;

    protected Carro(Parcel in) {
        nome = in.readString();
        descricao = in.readString();
        foto = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(descricao);
        dest.writeString(foto);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Carro> CREATOR = new Creator<Carro>() {
        @Override
        public Carro createFromParcel(Parcel in) {
            return new Carro(in);
        }

        @Override
        public Carro[] newArray(int size) {
            return new Carro[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}
