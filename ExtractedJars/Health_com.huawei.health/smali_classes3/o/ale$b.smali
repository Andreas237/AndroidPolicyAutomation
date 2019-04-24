.class Lo/ale$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ale;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ale;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ale;)V
    .locals 1

    .line 2200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2201
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ale$b;->a:Ljava/lang/ref/WeakReference;

    .line 2202
    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 7

    .line 2217
    iget-object v0, p0, Lo/ale$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ale;

    .line 2218
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2219
    return-void

    .line 2222
    :cond_0
    move-object v5, p1

    check-cast v5, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 2223
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLogin login loginResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2224
    invoke-virtual {v5}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v6

    .line 2225
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLogin login errcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2226
    invoke-virtual {v4, v6}, Lo/ale;->e(I)V

    .line 2227
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 5

    .line 2206
    iget-object v0, p0, Lo/ale$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ale;

    .line 2207
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2208
    return-void

    .line 2211
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====login onLoginSuccess====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2212
    invoke-static {v4}, Lo/ale;->B(Lo/ale;)V

    .line 2213
    return-void
.end method
