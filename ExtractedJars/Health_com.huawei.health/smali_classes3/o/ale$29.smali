.class Lo/ale$29;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->l(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 2026
    iput-object p1, p0, Lo/ale$29;->d:Lo/ale;

    iput p2, p0, Lo/ale$29;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 7

    .line 2039
    move-object v4, p1

    check-cast v4, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 2040
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v5

    .line 2041
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "branchGuidUserDownLoadHMS() errcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2042
    const/16 v0, 0xbba

    if-ne v5, v0, :cond_0

    .line 2043
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "branchGuidUserDownLoadHMS() errcode == ERROR_OPER_CANCEL"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2044
    invoke-static {}, Lo/ale;->h()V

    goto/16 :goto_0

    .line 2045
    :cond_0
    const v0, 0x186a2

    if-ne v5, v0, :cond_1

    .line 2046
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 2047
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x139b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 2048
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2049
    goto/16 :goto_0

    .line 2050
    :cond_1
    const/16 v0, 0x22

    if-ne v5, v0, :cond_2

    .line 2051
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "branchGuidUserDownLoadHMS() errcode == ERROR_HWID_IS_NOT_EXIT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2052
    new-instance v6, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dcy;-><init>(I)V

    .line 2053
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    iget v1, p0, Lo/ale$29;->a:I

    invoke-static {v0, v6, v1}, Lo/ale;->b(Lo/ale;Lo/dcy;I)V

    .line 2054
    goto :goto_0

    :cond_2
    const/16 v0, 0x28

    if-ne v0, v5, :cond_3

    .line 2055
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "errcode == BIND_SERVICE_SYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2056
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 2057
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x139d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 2058
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2059
    goto :goto_0

    .line 2061
    :cond_3
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    iget-object v1, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2062
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2063
    return-void

    .line 2066
    :cond_4
    :goto_0
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 2029
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "branchGuidUserDownLoadHMS() onLoginSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2030
    iget v0, p0, Lo/ale$29;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2031
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->o(Lo/ale;)V

    goto :goto_0

    .line 2032
    :cond_0
    iget v0, p0, Lo/ale$29;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2033
    iget-object v0, p0, Lo/ale$29;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->A(Lo/ale;)V

    .line 2035
    :cond_1
    :goto_0
    return-void
.end method
