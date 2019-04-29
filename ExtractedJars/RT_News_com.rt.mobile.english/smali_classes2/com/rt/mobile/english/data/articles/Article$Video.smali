.class public Lcom/rt/mobile/english/data/articles/Article$Video;
.super Ljava/lang/Object;
.source "Article.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/articles/Article;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Video"
.end annotation


# instance fields
.field private size:J

.field private url:Ljava/lang/String;

.field private youtube_id:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSize()J
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/rt/mobile/english/data/articles/Article$Video;->size:J

    return-wide v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article$Video;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getYoutubeId()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/rt/mobile/english/data/articles/Article$Video;->youtube_id:Ljava/lang/String;

    return-object v0
.end method

.method public setSize(J)V
    .locals 0

    .line 24
    iput-wide p1, p0, Lcom/rt/mobile/english/data/articles/Article$Video;->size:J

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/rt/mobile/english/data/articles/Article$Video;->url:Ljava/lang/String;

    return-void
.end method
