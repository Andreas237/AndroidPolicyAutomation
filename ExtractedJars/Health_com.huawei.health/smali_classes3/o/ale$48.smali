.class Lo/ale$48;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 3619
    iput-object p1, p0, Lo/ale$48;->b:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 3621
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick(): cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3624
    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 3625
    const-string v0, "0"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 3626
    const-string v0, "0"

    invoke-static {v0}, Lo/dbf;->e(Ljava/lang/String;)V

    .line 3627
    const-string v0, "0"

    invoke-static {v0}, Lo/dbf;->c(Ljava/lang/String;)V

    .line 3629
    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "0"

    invoke-static {v0, v1}, Lo/abi;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 3631
    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    const-string v1, "if_need_set_account_login_entry"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/ale;->c(Lo/ale;Ljava/lang/String;Z)V

    .line 3632
    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3633
    iget-object v0, p0, Lo/ale$48;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$48$5;

    invoke-direct {v1, p0}, Lo/ale$48$5;-><init>(Lo/ale$48;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 3640
    :cond_0
    return-void
.end method
