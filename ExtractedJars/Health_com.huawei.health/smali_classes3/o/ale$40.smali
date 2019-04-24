.class Lo/ale$40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->d(Lcom/huawei/cloudservice/CloudAccount;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 3167
    iput-object p1, p0, Lo/ale$40;->d:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 5

    .line 3180
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo, errorStatus =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3181
    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const/16 v1, 0x1003

    if-ne v1, v0, :cond_0

    .line 3182
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo: 4099,st timeout."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3183
    iget-object v0, p0, Lo/ale$40;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3184
    iget-object v0, p0, Lo/ale$40;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 3186
    :cond_0
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 4

    .line 3170
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 3171
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderDialog getUser sucess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3172
    iget-object v0, p0, Lo/ale$40;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 3173
    iget-object v0, p0, Lo/ale$40;->d:Lo/ale;

    const-string v1, "userInfo"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;Lcom/huawei/hwid/core/datatype/UserInfo;)Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 3174
    iget-object v0, p0, Lo/ale$40;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3176
    :cond_0
    return-void
.end method
