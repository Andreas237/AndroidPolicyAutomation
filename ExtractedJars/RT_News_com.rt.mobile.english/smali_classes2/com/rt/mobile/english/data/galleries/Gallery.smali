.class public Lcom/rt/mobile/english/data/galleries/Gallery;
.super Ljava/lang/Object;
.source "Gallery.java"


# instance fields
.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/Gallery;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/Gallery;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/Gallery;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/data/galleries/Gallery;->url:Ljava/lang/String;

    return-object v0
.end method
