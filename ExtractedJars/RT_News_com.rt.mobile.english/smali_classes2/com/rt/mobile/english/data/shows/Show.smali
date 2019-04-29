.class public Lcom/rt/mobile/english/data/shows/Show;
.super Ljava/lang/Object;
.source "Show.java"


# instance fields
.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "imageUrl"
    .end annotation
.end field

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/Show;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/Show;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/Show;->title:Ljava/lang/String;

    return-object v0
.end method
