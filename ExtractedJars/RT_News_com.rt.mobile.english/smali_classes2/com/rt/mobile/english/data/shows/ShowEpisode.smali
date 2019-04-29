.class public Lcom/rt/mobile/english/data/shows/ShowEpisode;
.super Ljava/lang/Object;
.source "ShowEpisode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;
    }
.end annotation


# instance fields
.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private show:Ljava/lang/String;

.field private summary:Ljava/lang/String;

.field private time:Lorg/joda/time/DateTime;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private video:Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDate()Lorg/joda/time/DateTime;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->time:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getShow()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->show:Ljava/lang/String;

    return-object v0
.end method

.method public getShowId()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->show:Ljava/lang/String;

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideo()Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode;->video:Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;

    return-object v0
.end method
