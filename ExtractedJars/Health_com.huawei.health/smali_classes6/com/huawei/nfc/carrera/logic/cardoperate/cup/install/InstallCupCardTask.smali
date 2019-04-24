.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;
.super Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ENCRYPT_INFO_SEPARATOR:Ljava/lang/String; = "|"

.field private static final TAG:Ljava/lang/String; = "InstallCupCardTask"


# instance fields
.field private final cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

.field private final inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

.field private final mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1, p5, p6, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/DownloadObserver;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPCardOperator;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;)V

    .line 78
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 79
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    .line 80
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    .line 81
    return-void
.end method

.method private addCardIntoTa(Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;)I
    .locals 7

    .line 310
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    .line 311
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardNum:Ljava/lang/String;

    .line 312
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    :cond_0
    const-string v0, "addCardIntoTa virtualCardMetadata response illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 316
    const/16 v0, -0x63

    return v0

    .line 319
    :cond_1
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v3, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    .line 320
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 321
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "apply cup card, but the card existed in ta.refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    return v0

    .line 327
    :cond_2
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->getCardProductId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 330
    :cond_3
    const-string v0, "addCardIntoTa cardMetadata response illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 331
    const/16 v0, -0x63

    return v0

    .line 334
    :cond_4
    new-instance v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;-><init>()V

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 336
    const/4 v0, 0x1

    iput v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/SHA_256;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanDigest:Ljava/lang/String;

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->getCardNumEndFour(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    .line 339
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 340
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardNum:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->getCardNumEndFour(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanFour:Ljava/lang/String;

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardType()I

    move-result v0

    iput v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    .line 342
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    .line 343
    iget-object v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->getCardProductId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_icon_watch.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->background_file_name:Ljava/lang/String;

    .line 346
    const/16 v0, 0x62

    iput v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 348
    const/4 v5, 0x0

    .line 351
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->addCard(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_3

    .line 372
    goto :goto_0

    .line 353
    :catch_0
    move-exception v6

    .line 355
    const-string v0, "addCardIntoTa, card already exist"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 356
    const/16 v5, -0x63

    .line 372
    goto :goto_0

    .line 358
    :catch_1
    move-exception v6

    .line 360
    const-string v0, "addCardIntoTa, reach max exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 361
    const/4 v5, -0x6

    .line 372
    goto :goto_0

    .line 363
    :catch_2
    move-exception v6

    .line 365
    const-string v0, "addCardIntoTa, bad param exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 366
    const/4 v5, -0x4

    .line 372
    goto :goto_0

    .line 368
    :catch_3
    move-exception v6

    .line 370
    const-string v0, "addCardIntoTa, bad param exception"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 371
    const/16 v5, -0x63

    .line 374
    :goto_0
    return v5
.end method

.method private checkApplyCardResponse(Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;)I
    .locals 7

    .line 239
    const/16 v4, -0x63

    .line 240
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    const-string v0, "checkApplyCardResponse, response is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 243
    return v4

    .line 245
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===checkApplyCardResponse response = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 246
    iget v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 249
    :sswitch_0
    const/4 v4, 0x0

    .line 250
    goto/16 :goto_1

    .line 252
    :sswitch_1
    const/4 v4, -0x3

    .line 253
    goto/16 :goto_1

    .line 255
    :sswitch_2
    const/4 v4, -0x4

    .line 256
    goto/16 :goto_1

    .line 259
    :sswitch_3
    const/4 v4, -0x8

    .line 260
    goto/16 :goto_1

    .line 264
    :sswitch_4
    const/4 v4, -0x7

    .line 265
    goto/16 :goto_1

    .line 268
    :sswitch_5
    const/16 v4, -0x9

    .line 269
    goto/16 :goto_1

    .line 271
    :sswitch_6
    const/16 v4, -0xb

    .line 272
    goto/16 :goto_1

    .line 274
    :sswitch_7
    const/16 v4, -0xd

    .line 275
    goto/16 :goto_1

    .line 277
    :sswitch_8
    const/16 v4, -0xc

    .line 278
    goto :goto_1

    .line 280
    :sswitch_9
    const/16 v4, -0x14

    .line 281
    goto :goto_1

    .line 283
    :sswitch_a
    const/4 v4, -0x4

    .line 284
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 285
    const-string v0, "fail_reason"

    const-string v1, "InstallCupCardTask server overload 503"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "checkApplyCardResponse retrun code server overload"

    const v1, 0x3611a442

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 288
    goto :goto_1

    .line 290
    :goto_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 291
    const-string v0, "fail_code"

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->returnCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    const-string v0, "issuerID"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    const-string v0, "cardType"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    const-string v0, "apply card err"

    const v1, 0x3611a3fd

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 295
    const/16 v4, -0x63

    .line 299
    :goto_1
    return v4

    :sswitch_data_0
    .sparse-switch
        -0x4 -> :sswitch_a
        -0x2 -> :sswitch_2
        -0x1 -> :sswitch_1
        0x0 -> :sswitch_0
        0x51d -> :sswitch_4
        0x525 -> :sswitch_3
        0x76d -> :sswitch_9
        0xcf5 -> :sswitch_3
        0xe11 -> :sswitch_5
        0xe12 -> :sswitch_5
        0xe13 -> :sswitch_4
        0xe15 -> :sswitch_4
        0xe18 -> :sswitch_6
        0xe19 -> :sswitch_8
        0xe1a -> :sswitch_7
    .end sparse-switch
.end method

.method private checkEncrytedResponseCode(Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;)I
    .locals 3

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encrypt response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 210
    const/16 v2, -0x63

    .line 211
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 213
    const/4 v2, 0x0

    goto :goto_0

    .line 215
    :cond_0
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    const/4 v1, -0x3

    if-ne v1, v0, :cond_1

    .line 217
    const/4 v2, -0x4

    goto :goto_0

    .line 219
    :cond_1
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 221
    const/4 v2, -0x5

    goto :goto_0

    .line 225
    :cond_2
    const/16 v2, -0x63

    .line 228
    :goto_0
    return v2
.end method

.method private getCardNumEndFour(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 385
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getInputInfoStr()Ljava/lang/String;
    .locals 3

    .line 186
    const-string v0, "enter getInputInfoStr"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 187
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getPhone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCardType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCvv2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getPhone()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 194
    :cond_1
    const-string v0, "getInputInfoStr, illegal card type."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 198
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method cleanUnstartedData(Ljava/lang/String;)V
    .locals 8

    .line 391
    const-string v0, "===123====cleanUnstartedData"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 392
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 393
    const-string v0, "fail_reason"

    const-string v1, "InstallCupCardTask, does not receive download push!"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    const-string v0, "refID"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    const v0, 0x3611a401

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 397
    new-instance v5, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;-><init>()V

    .line 398
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cplc:Ljava/lang/String;

    .line 399
    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setRsaKeyIndex(I)V

    .line 400
    const-string v0, "260086000000068459"

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 401
    const-string v0, "260086000000068459"

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 402
    iput-object p1, v5, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cardRefId:Ljava/lang/String;

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v5}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->a(Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    move-result-object v6

    .line 405
    if-eqz v6, :cond_0

    iget v0, v6, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    if-nez v0, :cond_0

    .line 407
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===\u670d\u52a1\u5668\u5220\u9664  response.returnCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v6, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 410
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V

    .line 411
    const-string v0, "===123===removeCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 420
    goto :goto_0

    .line 413
    :catch_0
    move-exception v7

    .line 415
    const-string v0, "cleanUnstartedData WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 420
    goto :goto_0

    .line 417
    :catch_1
    move-exception v7

    .line 419
    const-string v0, "cleanUnstartedData WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 422
    :cond_0
    :goto_0
    return-void
.end method

.method public run()V
    .locals 15

    .line 92
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->getInputInfoStr()Ljava/lang/String;

    move-result-object v4

    .line 93
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "input info illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 96
    const/16 v0, -0x63

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 97
    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->cupServiceApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-interface {v0, v4}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;->encryptCardInfo(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;

    move-result-object v5

    .line 102
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->checkEncrytedResponseCode(Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;)I

    move-result v6

    .line 103
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 105
    const-string v0, "encrypt info failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 106
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 107
    return-void

    .line 110
    :cond_1
    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->encrytedStr:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    const-string v0, "encrypt response illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 113
    const/16 v0, -0x63

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 114
    return-void

    .line 121
    :cond_2
    new-instance v7, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->encrytedStr:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getPwd()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    new-instance v8, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getCaptureMethod()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->inputCardInfo:Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/model/OpenCardInfo;->getLocation()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v9, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;

    invoke-direct {v9}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;-><init>()V

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setCplc(Ljava/lang/String;)V

    .line 126
    const/4 v0, -0x1

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setRsaKeyIndex(I)V

    .line 127
    const-string v0, "260086000000068459"

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 128
    const-string v0, "260086000000068459"

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v9, v7}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setCardInfor(Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;)V

    .line 130
    invoke-virtual {v9, v8}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->setRiskInfo(Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v9}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->a(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;

    move-result-object v10

    .line 132
    invoke-direct {p0, v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->checkApplyCardResponse(Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;)I

    move-result v6

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===leibinsheng \u7533\u5361\u7ed3\u679capply cup card apply result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 136
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void

    .line 140
    :cond_3
    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    .line 141
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardNum:Ljava/lang/String;

    .line 142
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    .line 143
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->getCardProductId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v11, 0x1

    goto :goto_0

    :cond_5
    const/4 v11, 0x0

    .line 144
    :goto_0
    if-eqz v11, :cond_6

    .line 146
    const-string v0, "apply cup card, virtual card info illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 147
    const/16 v0, -0x63

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void

    .line 151
    :cond_6
    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v12, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    .line 152
    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->getCardProductId()Ljava/lang/String;

    move-result-object v13

    .line 153
    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;->virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;->virtualCardRefId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->isCardDownload(Ljava/lang/String;)Z

    move-result v14

    .line 154
    if-eqz v14, :cond_7

    .line 156
    const-string v0, "The card already download, return success."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 157
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v13, v12}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    .line 158
    return-void

    .line 162
    :cond_7
    const-string v0, "InstallCupCardTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InstallCupCardTask CardEvent DOWNLOAD bank cardEvent START_LOCK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v12, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->cardEvent(Ljava/lang/String;I)V

    .line 166
    invoke-direct {p0, v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->addCardIntoTa(Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;)I

    move-result v6

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===leibinsheng \u6dfb\u52a0\u5230TA\u7ed3\u679c add cup card into ta result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 168
    const/4 v0, 0x0

    if-eq v0, v6, :cond_8

    .line 170
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->handleResult(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 174
    :cond_8
    const-string v0, "===123===leibinsheng\u8fdb\u5165\u7ed1\u5b9a observeDownloadResult"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 175
    invoke-virtual {p0, v12, v13}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/InstallCupCardTask;->observeDownloadResult(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :goto_1
    return-void
.end method
