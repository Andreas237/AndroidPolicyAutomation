.class public Lcom/usebutton/sdk/context/MusicArtist;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "MusicArtist.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>()V

    const-string v0, "name"

    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/MusicArtist;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "artist"

    return-object v0
.end method

.method public setGenre(Ljava/lang/String;)V
    .locals 1

    const-string v0, "genre"

    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/context/MusicArtist;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
