package com.example.recycleviewlistener;

public class Model {
    int image;
    String album, info;

    public Model(int image, String album, String info)
    {
        this.image=image;
        this.album=album;
        this.info=info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
