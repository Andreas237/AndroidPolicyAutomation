.class Lo/ale$28$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$28;->onLoginSuccess(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ale$28;


# direct methods
.method constructor <init>(Lo/ale$28;)V
    .locals 0

    .line 1953
    iput-object p1, p0, Lo/ale$28$2;->d:Lo/ale$28;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1956
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->v(Lo/ale;)Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1957
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) accountInfo != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1958
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->v(Lo/ale;)Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v1, v1, Lo/ale$28;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->y(Lo/ale;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1959
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) accountInfo huid equals mLoginManager Huid old huidtag = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v2, v2, Lo/ale$28;->d:Lo/ale;

    invoke-static {v2}, Lo/ale;->x(Lo/ale;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1960
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->x(Lo/ale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1961
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfaa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1963
    :cond_0
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    iget-object v1, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v1, v1, Lo/ale$28;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    goto/16 :goto_0

    .line 1965
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) accountInfo huid not equals mLoginManager Huid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1966
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->h(Lo/ale;I)V

    goto/16 :goto_0

    .line 1968
    :cond_2
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1969
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) hiAccountInfo != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1970
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v1, v1, Lo/ale$28;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->y(Lo/ale;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1971
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) hiAccountInfo huid equals mLoginManager Huid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1972
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    iget-object v1, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v1, v1, Lo/ale$28;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    goto :goto_0

    .line 1974
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) hiAccountInfo huid not equals mLoginManager Huid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    iget-object v0, p0, Lo/ale$28$2;->d:Lo/ale$28;

    iget-object v0, v0, Lo/ale$28;->d:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->h(Lo/ale;I)V

    .line 1979
    :cond_4
    :goto_0
    return-void
.end method
