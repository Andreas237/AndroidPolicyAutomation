.class Lo/ale$26;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->h(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 1918
    iput-object p1, p0, Lo/ale$26;->e:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 6

    .line 1937
    move-object v4, p1

    check-cast v4, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 1938
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login loginResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1939
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v5

    .line 1940
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login errcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1941
    iget-object v0, p0, Lo/ale$26;->e:Lo/ale;

    invoke-virtual {v0, v5}, Lo/ale;->e(I)V

    .line 1942
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1921
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) hmsHasLoginedLogin onLoginSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1922
    iget-object v0, p0, Lo/ale$26;->e:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale$26;->e:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1923
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid mExecutorService is null or shutdown "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1924
    return-void

    .line 1926
    :cond_1
    iget-object v0, p0, Lo/ale$26;->e:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$26$1;

    invoke-direct {v1, p0}, Lo/ale$26$1;-><init>(Lo/ale$26;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1933
    return-void
.end method
