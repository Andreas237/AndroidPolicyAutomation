.class public Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;
.super Ljava/lang/Object;
.source "ShowEpisode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/shows/ShowEpisode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Video"
.end annotation


# instance fields
.field size:Ljava/lang/String;

.field url:Ljava/lang/String;

.field youtube_id:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSize()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;->size:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getYoutubeId()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/rt/mobile/english/data/shows/ShowEpisode$Video;->youtube_id:Ljava/lang/String;

    return-object v0
.end method
