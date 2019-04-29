.class public Lcom/rt/mobile/english/data/galleries/GalleryPhoto;
.super Ljava/lang/Object;
.source "GalleryPhoto.java"


# instance fields
.field private author:Ljava/lang/String;

.field private galleryId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gallery"
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthor()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->author:Ljava/lang/String;

    return-object v0
.end method

.method public getGalleryId()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->galleryId:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/GalleryPhoto;->url:Ljava/lang/String;

    return-object v0
.end method
