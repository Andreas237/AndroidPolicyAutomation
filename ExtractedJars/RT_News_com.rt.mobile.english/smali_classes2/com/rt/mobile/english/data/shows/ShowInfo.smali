.class public Lcom/rt/mobile/english/data/shows/ShowInfo;
.super Ljava/lang/Object;
.source "ShowInfo.java"


# instance fields
.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "imageUrl"
    .end annotation
.end field

.field private text:Ljava/lang/String;

.field private time:Lorg/joda/time/DateTime;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowInfo;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowInfo;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Lorg/joda/time/DateTime;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowInfo;->time:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowInfo;->title:Ljava/lang/String;

    return-object v0
.end method
