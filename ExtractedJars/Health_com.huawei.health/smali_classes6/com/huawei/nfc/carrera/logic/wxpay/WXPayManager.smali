.class public Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/event/IEventListener;


# static fields
.field public static final EVENT_ID:Ljava/lang/String;

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "WXPayManager"

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager; = null


# instance fields
.field private isRequest:Z

.field private mAppId:Ljava/lang/String;

.field private mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->SYNC_LOCK:[B

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WXPayManager_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->EVENT_ID:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest:Z

    .line 42
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    sget-object v1, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->EVENT_ID:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->a(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventListener;)V

    .line 43
    return-void
.end method

.method public static getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;
    .locals 3

    .line 46
    sget-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->instance:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    if-nez v0, :cond_1

    .line 47
    sget-object v1, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->SYNC_LOCK:[B

    monitor-enter v1

    .line 48
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->instance:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    if-nez v0, :cond_0

    .line 49
    new-instance v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->instance:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 53
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->instance:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    return-object v0
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method public isRequest()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest:Z

    return v0
.end method

.method public onEventCallBack(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    .locals 5

    .line 86
    const-string v0, "WXPayManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onEventCallBack type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->h:Lcom/huawei/wallet/logic/event/IEventType;

    if-ne p1, v0, :cond_5

    .line 88
    if-nez p2, :cond_0

    .line 89
    return-void

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;

    if-nez v0, :cond_1

    .line 92
    return-void

    .line 94
    :cond_1
    instance-of v0, p2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;

    if-nez v0, :cond_2

    .line 95
    return-void

    .line 97
    :cond_2
    move-object v4, p2

    check-cast v4, Lcom/tencent/mm/opensdk/modelbase/BaseResp;

    .line 98
    iget v0, v4, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    if-nez v0, :cond_3

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;->onWXPaySuccess()V

    goto :goto_0

    .line 100
    :cond_3
    iget v0, v4, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_4

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;->onWXPayCancel()V

    goto :goto_0

    .line 103
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;

    iget v1, v4, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;->onWXPayFail(I)V

    .line 106
    :cond_5
    :goto_0
    return-void
.end method

.method public pay(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;)Z
    .locals 7

    .line 57
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 58
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getAppId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mAppId:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->mCallback:Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getAppId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v4

    .line 66
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 68
    new-instance v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/modelpay/PayReq;-><init>()V

    .line 69
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getAppId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->appId:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->partnerId:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getPrepayId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->prepayId:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getPackageValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->packageValue:Ljava/lang/String;

    .line 73
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getNonceStr()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;

    .line 74
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getTimeStamp()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;

    .line 75
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->getSign()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelpay/PayReq;->sign:Ljava/lang/String;

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest:Z

    .line 79
    invoke-interface {v4, v5}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result v6

    .line 80
    const-string v0, "WXPayManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wechat sendReq : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request check : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/tencent/mm/opensdk/modelpay/PayReq;->checkArgs()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return v6
.end method

.method public setRequest(Z)V
    .locals 0

    .line 117
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest:Z

    .line 118
    return-void
.end method
