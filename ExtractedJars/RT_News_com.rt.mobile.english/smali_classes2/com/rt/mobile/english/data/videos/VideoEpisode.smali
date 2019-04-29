.class public Lcom/rt/mobile/english/data/videos/VideoEpisode;
.super Ljava/lang/Object;
.source "VideoEpisode.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;
    }
.end annotation


# instance fields
.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private summary:Ljava/lang/String;

.field private time:Lorg/joda/time/DateTime;

.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private video:Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getSummary()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Lorg/joda/time/DateTime;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->time:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getURL()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVideo()Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode;->video:Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;

    return-object v0
.end method
