.class Lo/ale$59;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnm;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/ale;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/ale;Lo/dnm;ZLjava/lang/String;)V
    .locals 0

    .line 676
    iput-object p1, p0, Lo/ale$59;->d:Lo/ale;

    iput-object p2, p0, Lo/ale$59;->a:Lo/dnm;

    iput-boolean p3, p0, Lo/ale$59;->e:Z

    iput-object p4, p0, Lo/ale$59;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 700
    iget-boolean v0, p0, Lo/ale$59;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale$59;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 701
    iget-object v0, p0, Lo/ale$59;->a:Lo/dnm;

    invoke-virtual {v0}, Lo/dnm;->d()V

    .line 704
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 680
    iget-object v0, p0, Lo/ale$59;->a:Lo/dnm;

    invoke-virtual {v0}, Lo/dnm;->d()V

    .line 681
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    iget-object v0, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->d(Lo/ale;)Lo/ali;

    move-result-object v0

    iget-object v1, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ali;->e(Landroid/content/Context;)V

    .line 683
    iget-object v0, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 684
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit isLoginedByWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    iget-object v0, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->h(Lo/ale;)Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 686
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: hiloginAndPluginInit null == accountAidlInfoWear mExecutorService.isShutdown() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v3}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    return-void

    .line 689
    :cond_1
    iget-object v0, p0, Lo/ale$59;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$59$3;

    invoke-direct {v1, p0}, Lo/ale$59$3;-><init>(Lo/ale$59;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 696
    :cond_2
    return-void
.end method
