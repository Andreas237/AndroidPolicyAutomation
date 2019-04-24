.class Lo/ale$22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->am()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 1862
    iput-object p1, p0, Lo/ale$22;->a:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 6

    .line 1896
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;Z)Z

    .line 1897
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;Z)Z

    .line 1898
    move-object v4, p1

    check-cast v4, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 1899
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login loginResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1900
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v5

    .line 1901
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

    .line 1902
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    invoke-virtual {v0, v5}, Lo/ale;->e(I)V

    .line 1903
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1865
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====login onLoginSuccess====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1866
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;Z)Z

    .line 1867
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;Z)Z

    .line 1869
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1870
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid mExecutorService is null or shutdown "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1871
    return-void

    .line 1874
    :cond_1
    iget-object v0, p0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$22$2;

    invoke-direct {v1, p0}, Lo/ale$22$2;-><init>(Lo/ale$22;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1893
    return-void
.end method
