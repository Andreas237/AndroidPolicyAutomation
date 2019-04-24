.class Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/AppDownloadButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/views/AppDownloadButton;>;"
        }
    .end annotation
.end field

.field b:Lcom/huawei/openalliance/ad/download/app/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->b:Lcom/huawei/openalliance/ad/download/app/c;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;

    :cond_0
    return-void
.end method

.method private e()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a$1;-><init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "AppDownloadButton"

    const-string v1, "onSilentInstallStart"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->b:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->f:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "AppDownloadButton"

    const-string v1, "onSystemInstallStart"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->b:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->e()V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "AppDownloadButton"

    const-string v1, "install app failed."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->b:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton$a;->e()V

    return-void
.end method
