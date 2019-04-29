.class public Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;
.super Ljava/lang/Object;
.source "VideoEpisode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/videos/VideoEpisode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Video"
.end annotation


# instance fields
.field private size:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field youtube_id:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSize()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->size:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getYoutubeId()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/rt/mobile/english/data/videos/VideoEpisode$Video;->youtube_id:Ljava/lang/String;

    return-object v0
.end method
