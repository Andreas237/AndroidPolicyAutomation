.class public Lcom/huawei/openalliance/ad/j/b;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/activity/a/a;>;Lcom/huawei/openalliance/ad/j/a/a<Lcom/huawei/openalliance/ad/activity/a/a;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/activity/a/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/b;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/b;->a(Lcom/huawei/openalliance/ad/i/b;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/j/b;->b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/b;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/openalliance/ad/j/b$3;

    invoke-direct {v2, p0, p1}, Lcom/huawei/openalliance/ad/j/b$3;-><init>(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/j/b$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/b$2;-><init>(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V
    .locals 2

    const-string v0, "FullVideoPlayPresenter"

    const-string v1, "checkVideoHash"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/j/b$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/b$1;-><init>(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method
