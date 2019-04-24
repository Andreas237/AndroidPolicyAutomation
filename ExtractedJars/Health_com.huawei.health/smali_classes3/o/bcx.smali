.class public Lo/bcx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/bcw;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/bcw;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bcx;->e:Ljava/lang/ref/WeakReference;

    .line 34
    return-void
.end method

.method private c()Lo/bcr;
    .locals 2

    .line 41
    iget-object v0, p0, Lo/bcx;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bcw;

    .line 42
    if-nez v1, :cond_0

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    invoke-interface {v1}, Lo/bcw;->a()Lo/bcr;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getAuthInfo()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 58
    invoke-direct {p0}, Lo/bcx;->c()Lo/bcr;

    move-result-object v2

    .line 59
    if-nez v2, :cond_0

    .line 61
    const-string v0, "webview"

    const-string v1, "get param failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, ""

    return-object v0

    .line 66
    :cond_0
    invoke-virtual {v2}, Lo/bcr;->a()Ljava/lang/String;

    move-result-object v3

    .line 67
    return-object v3
.end method
