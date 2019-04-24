.class public Lcom/unionpay/tsmservice/SessionKeyReExchange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SessionKeyReExchange"


# instance fields
.field private mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

.field private mKeyType:I

.field private mMethodId:I

.field private mObj:Ljava/lang/Object;

.field private mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

.field private mParams:Lcom/unionpay/tsmservice/request/RequestParams;

.field private mProgressCallback:Lcom/unionpay/tsmservice/ITsmProgressCallback;

.field private mThirdPartyContext:Landroid/content/Context;

.field private mType:I

.field private mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;


# direct methods
.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/ITsmCallback;)V
    .locals 1

    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V
    .locals 6

    .line 49
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V
    .locals 7

    .line 55
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    const/16 v6, 0x3e8

    invoke-direct/range {v0 .. v6}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;I)V

    .line 56
    return-void
.end method

.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;I)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 35
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    .line 61
    iput-object p1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 62
    iput p2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 63
    iput-object p3, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    .line 64
    iput-object p4, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    .line 65
    iput-object p5, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mProgressCallback:Lcom/unionpay/tsmservice/ITsmProgressCallback;

    .line 66
    iput p6, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    .line 67
    return-void
.end method

.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 35
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    .line 73
    iput-object p1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 74
    iput p2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 75
    iput p4, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mType:I

    .line 76
    iput-object p3, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    .line 77
    iput-object p5, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

    .line 78
    iput-object p6, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mThirdPartyContext:Landroid/content/Context;

    .line 79
    return-void
.end method

.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 35
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    .line 83
    iput-object p1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 84
    iput p2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    .line 85
    iput-object p3, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mObj:Ljava/lang/Object;

    .line 86
    iput-object p4, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    .line 87
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    .line 88
    return-void
.end method

.method static synthetic access$000(Lcom/unionpay/tsmservice/SessionKeyReExchange;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->onGetPubKey(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/unionpay/tsmservice/SessionKeyReExchange;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->onExchangeKey(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/unionpay/tsmservice/SessionKeyReExchange;)Lcom/unionpay/tsmservice/ITsmCallback;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    return-object v0
.end method

.method static synthetic access$300(Lcom/unionpay/tsmservice/SessionKeyReExchange;)I
    .locals 1

    .line 28
    iget v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    return v0
.end method

.method private decryptMsg(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 609
    invoke-static {p1}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->adM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private makeSessionKey()Ljava/lang/String;
    .locals 1

    .line 601
    invoke-static {}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->amSK()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private onExchangeKey(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 316
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->decryptMsg(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 317
    iget v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    const/16 v1, 0x3e9

    if-ne v1, v0, :cond_1

    .line 318
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 319
    const-string v0, "sessionKey"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 321
    const/16 v0, 0x3e9

    invoke-direct {p0, v0, v2}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->updateSessionKeyTimestamp(ILjava/lang/String;)V

    .line 322
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-interface {v0, v3}, Lcom/unionpay/tsmservice/ITsmCallback;->onResult(Landroid/os/Bundle;)V

    .line 324
    :cond_0
    goto :goto_0

    .line 325
    :cond_1
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->setSessionKey(Ljava/lang/String;)V

    .line 326
    const/16 v0, 0x3e8

    invoke-direct {p0, v0, v2}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->updateSessionKeyTimestamp(ILjava/lang/String;)V

    .line 327
    const-string v0, "BLETEST"

    const-string v1, "=======updateSessionKeyTimestamp"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 328
    invoke-direct {p0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->reExecRemoteMethod()V

    .line 330
    :goto_0
    return-void
.end method

.method private onGetPubKey(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 306
    invoke-direct {p0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->makeSessionKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->rsaEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 307
    new-instance v4, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;

    invoke-direct {v4}, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;-><init>()V

    .line 308
    invoke-virtual {v4, v3}, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->setTempKey(Ljava/lang/String;)V

    .line 309
    iget v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mKeyType:I

    invoke-virtual {v4, v0}, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->setType(I)V

    .line 310
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    new-instance v1, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;-><init>(Lcom/unionpay/tsmservice/SessionKeyReExchange;I)V

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->exchangeKey(Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 313
    return-void
.end method

.method private reExecRemoteMethod()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 333
    iget v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mMethodId:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 335
    :pswitch_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getSupportedCardTypeList(Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 336
    goto/16 :goto_0

    .line 339
    :pswitch_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;

    .line 340
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->checkBinCode(Lcom/unionpay/tsmservice/request/CheckBinRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 341
    goto/16 :goto_0

    .line 364
    :pswitch_2
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;

    .line 365
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    iget-object v2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mProgressCallback:Lcom/unionpay/tsmservice/ITsmProgressCallback;

    invoke-virtual {v0, v4, v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->uniteAppDelete(Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    .line 367
    goto/16 :goto_0

    .line 376
    :pswitch_3
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;

    .line 377
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getActiveCode(Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 378
    goto/16 :goto_0

    .line 381
    :pswitch_4
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;

    .line 382
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->uniteCardActive(Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 384
    goto/16 :goto_0

    .line 407
    :pswitch_5
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;

    .line 408
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    iget-object v2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mProgressCallback:Lcom/unionpay/tsmservice/ITsmProgressCallback;

    invoke-virtual {v0, v4, v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->UniteAppDownload(Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    .line 410
    goto/16 :goto_0

    .line 445
    :pswitch_6
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mObj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    move-object v4, v0

    check-cast v4, [Ljava/lang/String;

    .line 446
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getCardInfo([Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 447
    goto/16 :goto_0

    .line 450
    :pswitch_7
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mObj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 451
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->setDefaultCard(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 452
    goto/16 :goto_0

    .line 467
    :pswitch_8
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    .line 468
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->bleKeyExchange(Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 469
    goto/16 :goto_0

    .line 482
    :pswitch_9
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;

    .line 483
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 485
    invoke-virtual {v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    .line 483
    invoke-virtual {v0, v4, v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->openUniteCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;Landroid/content/Context;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 486
    goto/16 :goto_0

    .line 513
    :pswitch_a
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getDefaultCard(Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 514
    goto/16 :goto_0

    .line 527
    :pswitch_b
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;

    .line 528
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getUniteAppList(Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 530
    goto/16 :goto_0

    .line 551
    :pswitch_c
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;

    .line 552
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 553
    goto/16 :goto_0

    .line 556
    :pswitch_d
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;

    .line 557
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    iget-object v2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mProgressCallback:Lcom/unionpay/tsmservice/ITsmProgressCallback;

    invoke-virtual {v0, v4, v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    .line 559
    goto :goto_0

    .line 562
    :pswitch_e
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    .line 563
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0, v4}, Lcom/unionpay/tsmservice/UPTsmAddon;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I

    .line 564
    goto :goto_0

    .line 567
    :pswitch_f
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    .line 568
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mType:I

    iget-object v2, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

    iget-object v3, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mThirdPartyContext:Landroid/content/Context;

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)I

    .line 570
    goto :goto_0

    .line 573
    :pswitch_10
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;

    .line 574
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 575
    goto :goto_0

    .line 578
    :pswitch_11
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mParams:Lcom/unionpay/tsmservice/request/RequestParams;

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/request/InitRequestParams;

    .line 579
    const-string v0, "BLETEST"

    const-string v1, "=======mUPTsmAddon.init"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 580
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mCallback:Lcom/unionpay/tsmservice/ITsmCallback;

    invoke-virtual {v0, v4, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 581
    .line 586
    :goto_0
    :pswitch_12
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_6
        :pswitch_7
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_a
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_c
        :pswitch_11
        :pswitch_d
        :pswitch_8
        :pswitch_12
        :pswitch_12
        :pswitch_1
        :pswitch_9
        :pswitch_5
        :pswitch_b
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method

.method private rsaEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 613
    invoke-static {p1, p2}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->arEWK(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private setSessionKey(Ljava/lang/String;)V
    .locals 0

    .line 605
    invoke-static {p1}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->asSK(Ljava/lang/String;)V

    .line 606
    return-void
.end method

.method private updateSessionKeyTimestamp(ILjava/lang/String;)V
    .locals 3

    .line 589
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 590
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 591
    const/16 v0, 0x3e8

    if-ne v0, p1, :cond_0

    .line 592
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->auSKT(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 593
    :cond_0
    const/16 v0, 0x3e9

    if-ne v0, p1, :cond_1

    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "passwordKeyBoard_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 595
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->auSKT(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public reGetPubKey()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 301
    iget-object v0, p0, Lcom/unionpay/tsmservice/SessionKeyReExchange;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    new-instance v1, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/SessionKeyReExchange$SessionKeyValidCallBack;-><init>(Lcom/unionpay/tsmservice/SessionKeyReExchange;I)V

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPubKey(Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 303
    return-void
.end method
