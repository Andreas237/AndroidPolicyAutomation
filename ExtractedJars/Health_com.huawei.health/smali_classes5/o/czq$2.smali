.class Lo/czq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czq;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic e:Lo/czq;


# direct methods
.method constructor <init>(Lo/czq;Ljava/lang/String;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lo/czq$2;->e:Lo/czq;

    iput-object p2, p0, Lo/czq$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 7

    .line 418
    move-object v4, p1

    check-cast v4, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 419
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v5

    .line 420
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLoginFailed errcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lo/czq$2;->e:Lo/czq;

    invoke-virtual {v0}, Lo/czq;->d()V

    .line 422
    const/16 v0, 0xbba

    if-ne v5, v0, :cond_0

    .line 423
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 424
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 425
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 427
    :cond_0
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 7

    .line 405
    iget-object v0, p0, Lo/czq$2;->e:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 406
    iget-object v0, p0, Lo/czq$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lo/czq$2;->e:Lo/czq;

    invoke-virtual {v0}, Lo/czq;->d()V

    goto :goto_0

    .line 409
    :cond_0
    iget-object v0, p0, Lo/czq$2;->e:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    const-string v2, "0"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 410
    iget-object v0, p0, Lo/czq$2;->e:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/app/NotificationManager;

    .line 411
    const/16 v0, 0x79

    invoke-virtual {v6, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 412
    return-void

    .line 414
    :goto_0
    return-void
.end method
