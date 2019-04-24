.class Lo/ale$22$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$22;->onLoginSuccess(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale$22;


# direct methods
.method constructor <init>(Lo/ale$22;)V
    .locals 0

    .line 1874
    iput-object p1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1877
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->u(Lo/ale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1878
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid() oldhuidhistory == 1 oldHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v2, v2, Lo/ale$22;->a:Lo/ale;

    invoke-static {v2}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " huid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v2, v2, Lo/ale$22;->a:Lo/ale;

    invoke-static {v2}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1879
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v1, v1, Lo/ale$22;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v1, v1, Lo/ale$22;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->z(Lo/ale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1880
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid() oldHuid equals "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1881
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v1, v1, Lo/ale$22;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    goto :goto_0

    .line 1883
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid() oldHuid not equals "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1884
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfaa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1885
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v1, v1, Lo/ale$22;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    goto :goto_0

    .line 1888
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid() oldhuidhistory != 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1889
    iget-object v0, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v0, v0, Lo/ale$22;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$22$2;->b:Lo/ale$22;

    iget-object v1, v1, Lo/ale$22;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    .line 1891
    :goto_0
    return-void
.end method
