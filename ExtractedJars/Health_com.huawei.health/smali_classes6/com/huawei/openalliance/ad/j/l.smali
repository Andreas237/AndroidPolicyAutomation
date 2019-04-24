.class public Lcom/huawei/openalliance/ad/j/l;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/views/interfaces/c;>;Lcom/huawei/openalliance/ad/j/a/h<Lcom/huawei/openalliance/ad/views/interfaces/c;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/e/a/e;

.field private b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/l;->a(Lcom/huawei/openalliance/ad/i/b;)V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->a:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/j/l;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->a:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method private d()V
    .locals 2

    const-string v0, "SplashPresenter"

    const-string v1, "notifyAdDismissed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/listeners/AdListener;->onAdDismissed()V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    const-string v0, "SplashPresenter"

    const-string v1, "notifyNotSupport"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/l;->b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    const/16 v1, 0x3e9

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/listeners/AdListener;->onAdFailedToLoad(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/l;->b:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    return-void
.end method

.method public b()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/j/l$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/l$1;-><init>(Lcom/huawei/openalliance/ad/j/l;)V

    sget-object v1, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/l;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/c;

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(Lcom/huawei/openalliance/ad/constant/AdLoadMode;)V

    return-void
.end method

.method public c()Z
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/l;->e()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/j/l;->d()V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
