.class public Lcom/huawei/openalliance/ad/j/f;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;>;Lcom/huawei/openalliance/ad/j/a/c<Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/openalliance/ad/k/c;

.field private c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/f;->a(Lcom/huawei/openalliance/ad/i/b;)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/f;->a:Landroid/content/Context;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Lcom/huawei/openalliance/ad/m/a/e;

    invoke-direct {v1, p1}, Lcom/huawei/openalliance/ad/m/a/e;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/j/f;->b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/openalliance/ad/j/f$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/openalliance/ad/j/f$2;-><init>(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V

    return-void
.end method


# virtual methods
.method public a(JJJJ)V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    move-wide v1, p1

    move-wide v3, p3

    long-to-int v5, p5

    move-wide v6, p7

    long-to-int v6, v6

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/k/c;->b(JJII)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/j/f$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/f$3;-><init>(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V
    .locals 2

    invoke-static {p1}, Lcom/huawei/openalliance/ad/k/e;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/f;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/j/f$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/f$1;-><init>(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/f;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/huawei/openalliance/ad/a/a;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/k/c;->c()V

    return-void
.end method

.method public b(JJJJ)V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    move-wide v1, p1

    move-wide v3, p3

    long-to-int v5, p5

    move-wide v6, p7

    long-to-int v6, v6

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/k/c;->a(JJII)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f;->b:Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/k/c;->d()V

    return-void
.end method
