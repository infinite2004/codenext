package com.example.android.spotifly;

public class Album {
    private int AlbumCover;
    private String AlbumNmae;
    private String ArtistName;

    public Album(int albumCover, String albumNmae, String artistName) {
        AlbumCover = albumCover;
        AlbumNmae = albumNmae;
        ArtistName = artistName;
    }

    public int getAlbumCover() {
        return AlbumCover;
    }

    public String getAlbumNmae() {
        return AlbumNmae;
    }

    public String getArtistName() {
        return ArtistName;
    }
}

