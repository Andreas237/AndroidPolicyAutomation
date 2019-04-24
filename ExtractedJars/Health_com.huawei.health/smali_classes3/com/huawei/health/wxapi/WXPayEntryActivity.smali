.class public Lcom/huawei/health/wxapi/WXPayEntryActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# instance fields
.field private c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 31
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const-string v0, "WXPayEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getAppId()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXPayEntryActivity;->finish()V

    .line 36
    return-void

    .line 38
    :cond_0
    const-string v0, "WXPayEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WXPayEntryActivity onPayFinish, appId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    invoke-static {p0, v4}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 40
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXPayEntryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    .line 43
    :cond_1
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 47
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 48
    invoke-virtual {p0, p1}, Lcom/huawei/health/wxapi/WXPayEntryActivity;->setIntent(Landroid/content/Intent;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    .line 52
    :cond_0
    return-void
.end method

.method public onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 0

    .line 56
    return-void
.end method

.method public onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 4

    .line 60
    const-string v0, "WXPayEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WXPayEntryActivity onPayFinish, errCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; resp.errStr"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errStr:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; resp.checkArgs()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->checkArgs()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; transaction "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->transaction:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; openId :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->openId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 63
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    const-string v0, "WXPayEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WXPayEntryActivity onPayFinish, set isRequest false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 67
    :cond_0
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    sget-object v1, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->EVENT_ID:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->h:Lcom/huawei/wallet/logic/event/IEventType;

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 69
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    if-eqz v0, :cond_2

    .line 70
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXPayEntryActivity;->c:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->unregisterApp()V

    .line 72
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXPayEntryActivity;->finish()V

    .line 73
    return-void
.end method
