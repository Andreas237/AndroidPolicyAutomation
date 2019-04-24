.class public Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field static final CHANNEL_STATE_SWITCH_CLOSE:I = 0x3

.field static final CHANNEL_STATE_SWITCH_OPEN_BY_VERIFY_FINGER:I = 0x1

.field static final CHANNEL_STATE_SWITCH_OPEN_BY_VERIFY_PASSWORD:I = 0x2

.field static final DEFAULT_CARD:I = 0x8

.field static final DISABLE_EMULATION:I = 0x7

.field static final ENABLE_EMULATION:I = 0x6

.field static final GET_DEFAULT_CARD:I = 0x5

.field static final SET_DEFAULT_CARD:I = 0x51

.field static final SET_DEFAULT_CARD_RFCONF:I = 0x53


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 1

    .line 102
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 103
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    .line 104
    return-void
.end method

.method private activateCard(I)Z
    .locals 4

    .line 306
    invoke-static {}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isDevicesNeedPowerOn()Z

    move-result v3

    .line 308
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCard is DevicesNeedPowerOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 309
    if-eqz v3, :cond_0

    .line 312
    const-string v0, "activateCard esePowerOn begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOn()Z

    .line 314
    const-string v0, "activateCard esePowerOn end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 317
    const-string v0, "activateCard activateCardByPayPwd begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 318
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->activateCardByPayPwd(I)Z

    move-result v2

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCard activateCardByPayPwd end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 322
    const-string v0, "activateCard esePowerOff begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOff()Z

    .line 324
    const-string v0, "activateCard esePowerOff end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 328
    :cond_0
    const-string v0, "activateCard activateCardByPayPwd begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 329
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->activateCardByPayPwd(I)Z

    move-result v2

    .line 330
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCard activateCardByPayPwd end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 332
    :goto_0
    return v2
.end method

.method private activateCardByFpPwd(I)Z
    .locals 7

    .line 378
    const/4 v4, 0x0

    .line 381
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->activateCardByFpPwd(I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_3

    .line 382
    const/4 v4, 0x1

    .line 415
    goto/16 :goto_0

    .line 384
    :catch_0
    move-exception v5

    .line 387
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 388
    const-string v0, "fail_reason"

    const-string v1, "fingerId is mismatch"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    const-string v0, "activateCardByFpPwd failed, fingerId is mismatch"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 415
    goto/16 :goto_0

    .line 392
    :catch_1
    move-exception v5

    .line 395
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 396
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "system errorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCardByFpPwd failed, system error, errorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 415
    goto :goto_0

    .line 400
    :catch_2
    move-exception v5

    .line 403
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 404
    const-string v0, "fail_reason"

    const-string v1, "default card not exist"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    const-string v0, "activateCardByFpPwd failed, default card is not exist"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 415
    goto :goto_0

    .line 408
    :catch_3
    move-exception v5

    .line 411
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 412
    const-string v0, "fail_reason"

    const-string v1, "card is not exist"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    const-string v0, "activateCardByFpPwd failed, card is not exist"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 417
    :goto_0
    return v4
.end method

.method private activateCardByPayPwd(I)Z
    .locals 7

    .line 428
    const/4 v4, 0x0

    .line 431
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->activateCardByPayPwd(I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_2

    .line 432
    const/4 v4, 0x1

    .line 457
    goto/16 :goto_0

    .line 434
    :catch_0
    move-exception v5

    .line 437
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 438
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "system errorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCardByPayPwd system errorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 457
    goto :goto_0

    .line 442
    :catch_1
    move-exception v5

    .line 445
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 446
    const-string v0, "fail_reason"

    const-string v1, "default card not exist"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    const-string v0, "activateCardByPayPwd failed, default card is not exist"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 457
    goto :goto_0

    .line 450
    :catch_2
    move-exception v5

    .line 453
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 454
    const-string v0, "fail_reason"

    const-string v1, "card is not exist"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    const-string v0, "fail_code"

    const-string v1, "activateCardByFpPwd failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    const-string v0, "activateCardByPayPwd failed, card is not exist"

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 459
    :goto_0
    return v4
.end method

.method private deActivateCard(I)Z
    .locals 7

    .line 470
    const/4 v4, 0x0

    .line 473
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->deactivateCard(I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_0

    .line 474
    const/4 v4, 0x1

    .line 483
    goto :goto_0

    .line 476
    :catch_0
    move-exception v5

    .line 479
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 480
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "system errorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    const-string v0, "fail_code"

    const-string v1, "deActivateCard failed"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activateCard failed code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;->getCode()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3611a3ed

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 485
    :goto_0
    return v4
.end method

.method private deactivateCard(I)Z
    .locals 4

    .line 344
    invoke-static {}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isDevicesNeedPowerOn()Z

    move-result v3

    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deactivateCard is DevicesNeedPowerOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 347
    if-eqz v3, :cond_0

    .line 350
    const-string v0, "deactivateCard esePowerOn begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOn()Z

    .line 352
    const-string v0, "deactivateCard esePowerOn end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 354
    const-string v0, "deactivateCard deActivateCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 355
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->deActivateCard(I)Z

    move-result v2

    .line 356
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deactivateCard deActivateCard end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 358
    const-string v0, "deactivateCard esePowerOff begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 359
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOff()Z

    .line 360
    const-string v0, "deactivateCard esePowerOff end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 364
    :cond_0
    const-string v0, "deactivateCard deActivateCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 365
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->deActivateCard(I)Z

    move-result v2

    .line 366
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deactivateCard deActivateCard end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 368
    :goto_0
    return v2
.end method

.method private disable(I)Z
    .locals 5

    .line 240
    const-string v0, "disable Card Emulation begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isSelectSE(Landroid/content/Context;)I

    move-result v2

    .line 251
    invoke-static {}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isDevicesNeedPowerOn()Z

    move-result v3

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "disable is DevicesNeedPowerOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 254
    if-eqz v3, :cond_0

    .line 257
    const-string v0, "disableTransactionChannel esePowerOn begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOff()Z

    .line 259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOn()Z

    .line 260
    const-string v0, "disableTransactionChannel esePowerOn end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 263
    const-string v0, "disable deActivateCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 264
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->deActivateCard(I)Z

    move-result v4

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "disable deActivateCard end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 268
    const-string v0, "disableTransactionChannel esePowerOff begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOff()Z

    .line 270
    const-string v0, "disableTransactionChannel esePowerOff end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 274
    :cond_0
    const-string v0, "disable deActivateCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 275
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->deActivateCard(I)Z

    move-result v4

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "disable deActivateCard end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 278
    :goto_0
    return v4
.end method

.method private disableCardEmulation()V
    .locals 1

    .line 292
    const-string v0, "disableCardEmulation disable Card Emulation begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->disable(Landroid/content/Context;)V

    .line 294
    const-string v0, "disableCardEmulation disable Card Emulation end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 295
    return-void
.end method

.method private enableByFinger(I)Z
    .locals 4

    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-static {}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isDevicesNeedPowerOn()Z

    move-result v3

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enableByFinger is DevicesNeedPowerOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 177
    if-eqz v3, :cond_0

    .line 180
    const-string v0, "enableByFinger esePowerOn begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOn()Z

    .line 182
    const-string v0, "enableByFinger esePowerOn end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 185
    :cond_0
    const-string v0, "enableByFinger activateCardByFpPwd begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 186
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->activateCardByFpPwd(I)Z

    move-result v2

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enableByFinger activateCardByFpPwd end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 189
    if-eqz v2, :cond_1

    .line 192
    const-string v0, "enableByFinger enable Card Emulation begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->enable(Landroid/content/Context;)V

    .line 194
    const-string v0, "enableByFinger enable Card Emulation end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 197
    :cond_1
    return v2
.end method

.method private enableByPassword(I)Z
    .locals 4

    .line 202
    const/4 v2, 0x0

    .line 204
    invoke-static {}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isDevicesNeedPowerOn()Z

    move-result v3

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enableByFinger is DevicesNeedPowerOn: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 208
    if-eqz v3, :cond_0

    .line 211
    const-string v0, "enableByPassword esePowerOn begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOn()Z

    .line 213
    const-string v0, "enableByPassword esePowerOn end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 216
    :cond_0
    const-string v0, "enableByPassword activateCardByPayPwd begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 217
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->activateCardByPayPwd(I)Z

    move-result v2

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enableByPassword activateCardByPayPwd end, isSuccess: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 220
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    if-eqz v3, :cond_1

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enableByPassword esePoweroff cardType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->esePowerOff()Z

    .line 226
    :cond_1
    if-eqz v2, :cond_2

    .line 229
    const-string v0, "enableByPassword enable Card Emulation begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->enable(Landroid/content/Context;)V

    .line 231
    const-string v0, "enableByPassword enable Card Emulation end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 234
    :cond_2
    return v2
.end method

.method private enableCardEmulation()V
    .locals 1

    .line 284
    const-string v0, "enableCardEmulation enable Card Emulation begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/CardEmulationSwitch;->enable(Landroid/content/Context;)V

    .line 286
    const-string v0, "enableCardEmulation enable Card Emulation end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 287
    return-void
.end method

.method private handleDefaultCardMessage(Landroid/os/Message;)V
    .locals 5

    .line 568
    iget v0, p1, Landroid/os/Message;->arg1:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 572
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 573
    const/4 v0, 0x0

    aget-object v0, v1, v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 574
    const/4 v0, 0x1

    aget-object v0, v1, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/swipe/channel/SetDefaultCardCallback;

    .line 576
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->setDefaultCard(Ljava/lang/String;)Z

    move-result v4

    .line 578
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->setDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/SetDefaultCardCallback;Z)V

    .line 579
    goto :goto_0

    .line 583
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 584
    const/4 v0, 0x0

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 585
    const/4 v0, 0x1

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 586
    const/4 v0, 0x1

    if-eq v2, v0, :cond_0

    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 589
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/huawei/nfc/carrera/logic/swipe/channel/RFConfChangeManager;->setDefaultCardRFConf(IZ)V

    .line 596
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x51 -> :sswitch_0
        0x53 -> :sswitch_1
    .end sparse-switch
.end method

.method private setDefaultCard(Ljava/lang/String;)Z
    .locals 8

    .line 498
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 500
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 503
    invoke-static {}, Lcom/huawei/nfc/util/NFCFragmentUtil;->isPhoneSupportShutdownSwipe()Z

    move-result v0

    if-nez v0, :cond_0

    .line 505
    const-string v0, "phone not support shutdown swipe card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 506
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->deactivateCard(I)Z

    goto :goto_0

    .line 512
    :cond_0
    const-string v0, "phone support shutdown swipe card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 516
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 519
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->setDefaultCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 536
    goto :goto_1

    .line 521
    :catch_0
    move-exception v6

    .line 523
    const/4 v5, 0x0

    .line 525
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 526
    const-string v0, "fail_code"

    const-string v1, "setDefaultCard WalletTaCardNotExistException"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    const-string v0, "setCardDefaultInTA WalletTaCardNotExistException"

    const v1, 0x3611a3ec

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v7, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 536
    goto :goto_1

    .line 529
    :catch_1
    move-exception v6

    .line 531
    const/4 v5, 0x0

    .line 533
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 534
    const-string v0, "fail_code"

    const-string v1, "setDefaultCard WalletTaSystemErrorException"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    const-string v0, "setCardDefaultInTA WalletTaSystemErrorException"

    const v1, 0x3611a3ec

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v7, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 538
    :goto_1
    if-eqz v5, :cond_3

    .line 540
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v6

    .line 542
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    iget v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 545
    invoke-static {}, Lcom/huawei/nfc/util/NFCFragmentUtil;->isPhoneSupportShutdownSwipe()Z

    move-result v0

    if-nez v0, :cond_2

    .line 547
    const-string v0, "phone not support shutdown swipe card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 548
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->activateCard(I)Z

    goto :goto_2

    .line 554
    :cond_2
    const-string v0, "phone support shutdown swipe card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 559
    :cond_3
    :goto_2
    return v5
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 109
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 110
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 114
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->enableByFinger(I)Z

    move-result v4

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelOpenCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;ZI)V

    .line 117
    goto/16 :goto_0

    .line 121
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->enableByPassword(I)Z

    move-result v4

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelOpenCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;ZI)V

    .line 124
    goto/16 :goto_0

    .line 128
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->disable(I)Z

    move-result v4

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelCloseCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;ZI)V

    .line 131
    goto :goto_0

    .line 135
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->enableCardEmulation()V

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;

    iget v2, p1, Landroid/os/Message;->arg1:I

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelOpenCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;ZI)V

    .line 138
    goto :goto_0

    .line 142
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->disableCardEmulation()V

    .line 144
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;

    iget v2, p1, Landroid/os/Message;->arg1:I

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelCloseCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;ZI)V

    .line 145
    goto :goto_0

    .line 149
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getDefaultCard()Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;

    invoke-virtual {v0, v1, v4}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 152
    goto :goto_0

    .line 156
    :pswitch_6
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;->handleDefaultCardMessage(Landroid/os/Message;)V

    .line 157
    .line 162
    :goto_0
    :pswitch_7
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_7
        :pswitch_5
        :pswitch_3
        :pswitch_4
        :pswitch_6
    .end packed-switch
.end method
