.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field private static final HANDLER_BANK_QUERY_BANK_CARD_RESULT:I = 0x12f

.field private static final HANDLER_BANK_QUERY_BANK_ISSUERINFO_RESULT:I = 0x12e

.field private static final HANDLER_BANK_QUERY_SUPPORTED_CARD_RESULT:I = 0x12d

.field private static final HANDLER_QUERY_CARD_NOTICE:I = 0xce

.field private static final HANDLER_QUERY_PAYABLE_CARD_RESULT:I = 0x2

.field private static final HANDLER_TAG_BANK_CARD_RESULT:I = 0x12c

.field private static final HANDLER_TAG_TRAFFIC_CARD_RESULT:I = 0xc8

.field private static final HANDLER_TRAFFIC_QUERY_CARDINFO_RESULT:I = 0xca

.field private static final HANDLER_TRAFFIC_QUERY_SUPPORTED_CARDS_RESULT:I = 0xc9

.field private static final HANDLER_TRAFFIC_QUERY_TRANSFER_ABILITY_RESULT:I = 0xcc

.field private static final HANDLER_TRAFFIC_SYNC_RFCONF_RESULT:I = 0xcb

.field private static final listInfoListenersLock:Ljava/lang/Object;


# instance fields
.field private listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 109
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListenersLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 113
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 114
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Ljava/util/List;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->refreshCardListInfos(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->refreshCardListFailed(I)V

    return-void
.end method

.method private handleBankCardMessage(Landroid/os/Message;)V
    .locals 5

    .line 361
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 365
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 366
    const/4 v0, 0x0

    aget-object v0, v1, v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;

    .line 367
    const/4 v0, 0x1

    aget-object v0, v1, v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 368
    invoke-interface {v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;->queryResultCallback(Ljava/util/Map;)V

    .line 369
    goto :goto_0

    .line 373
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 374
    iget v2, p1, Landroid/os/Message;->arg2:I

    .line 375
    const/4 v0, 0x0

    aget-object v0, v1, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;

    .line 376
    const/4 v0, 0x1

    aget-object v0, v1, v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;

    .line 377
    invoke-interface {v3, v2, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;->queryBankIssuerInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;)V

    .line 378
    goto :goto_0

    .line 382
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 383
    iget v2, p1, Landroid/os/Message;->arg2:I

    .line 384
    const/4 v0, 0x0

    aget-object v0, v1, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;

    .line 385
    const/4 v0, 0x1

    aget-object v0, v1, v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;

    .line 386
    invoke-interface {v3, v2, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;->queryBankCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;)V

    .line 387
    .line 394
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x12d
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleTrafficCardMessage(Landroid/os/Message;)V
    .locals 6

    .line 404
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 408
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    .line 409
    const/4 v0, 0x0

    aget-object v0, v2, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;

    .line 410
    const/4 v0, 0x1

    aget-object v0, v2, v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map;

    .line 411
    invoke-interface {v3, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;->querySupportedTrafficCardListCallback(Ljava/util/Map;)V

    .line 412
    goto/16 :goto_0

    .line 416
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    .line 417
    const/4 v0, 0x0

    aget-object v0, v2, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;

    .line 418
    const/4 v0, 0x1

    aget-object v0, v2, v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 419
    iget v5, p1, Landroid/os/Message;->arg2:I

    .line 420
    invoke-interface {v3, v5, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;->queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V

    .line 421
    goto/16 :goto_0

    .line 425
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    .line 426
    const/4 v0, 0x0

    aget-object v0, v2, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    .line 427
    const/4 v0, 0x1

    aget-object v0, v2, v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 428
    iget v5, p1, Landroid/os/Message;->arg2:I

    .line 429
    invoke-interface {v3, v4, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;->syncRFConfFilesResult(Ljava/lang/String;I)V

    .line 430
    goto :goto_0

    .line 434
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    .line 435
    const/4 v0, 0x0

    aget-object v0, v2, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;

    .line 436
    const/4 v0, 0x1

    aget-object v0, v2, v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 437
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 438
    invoke-interface {v3, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;->queryCardNoticeCallback(Ljava/util/List;)V

    goto :goto_0

    .line 444
    :pswitch_4
    const-string v0, "Start to process HANDLER_TAG_TRAFFIC_CARD_RESULT message, arg1 is HANDLER_TRAFFIC_QUERY_TRANSFER_ABILITY_RESULT."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 445
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, [Ljava/lang/Object;

    .line 446
    const/4 v0, 0x0

    aget-object v0, v2, v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

    .line 447
    const/4 v0, 0x1

    aget-object v0, v2, v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;

    .line 448
    iget v5, p1, Landroid/os/Message;->arg2:I

    .line 449
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 451
    invoke-interface {v3, v5, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;->queryCardTransferAbilityCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V

    .line 458
    :cond_0
    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method

.method private refreshCardListFailed(I)V
    .locals 4

    .line 202
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListenersLock:Ljava/lang/Object;

    monitor-enter v2

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    invoke-interface {v0, p1}, Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 208
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 209
    :goto_0
    return-void
.end method

.method private refreshCardListInfos(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 184
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListenersLock:Ljava/lang/Object;

    monitor-enter v2

    .line 186
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1}, Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;->d(ILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 193
    :goto_0
    return-void
.end method


# virtual methods
.method addCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 2

    .line 123
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListenersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 125
    :try_start_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 127
    :goto_0
    return-void
.end method

.method cardListRefreshFailed(I)V
    .locals 1

    .line 169
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;I)V

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->post(Ljava/lang/Runnable;)Z

    .line 177
    return-void
.end method

.method cardListRefreshed(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;)V"
        }
    .end annotation

    .line 152
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->post(Ljava/lang/Runnable;)Z

    .line 160
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 326
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 327
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 331
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    .line 332
    const/4 v0, 0x0

    aget-object v0, v1, v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;

    .line 333
    const/4 v0, 0x1

    aget-object v0, v1, v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 334
    invoke-interface {v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;->queryPayableCardCallback(Ljava/util/List;)V

    .line 335
    goto :goto_0

    .line 339
    :sswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleTrafficCardMessage(Landroid/os/Message;)V

    .line 340
    goto :goto_0

    .line 344
    :sswitch_2
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleBankCardMessage(Landroid/os/Message;)V

    .line 345
    .line 350
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0xc8 -> :sswitch_1
        0x12c -> :sswitch_2
    .end sparse-switch
.end method

.method public handleQueryBankCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankCardInfoCallback;)V
    .locals 3

    .line 287
    const/16 v0, 0x12c

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 288
    const/16 v0, 0x12f

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 289
    iput p1, v1, Landroid/os/Message;->arg2:I

    .line 290
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 291
    const/4 v0, 0x0

    aput-object p3, v2, v0

    .line 292
    const/4 v0, 0x1

    aput-object p2, v2, v0

    .line 293
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 294
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 295
    return-void
.end method

.method public handleQueryBankIssuerInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/BankIssuerInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryBankIssuerInfoCallback;)V
    .locals 3

    .line 275
    const/16 v0, 0x12c

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 276
    const/16 v0, 0x12e

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 277
    iput p1, v1, Landroid/os/Message;->arg2:I

    .line 278
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 279
    const/4 v0, 0x0

    aput-object p3, v2, v0

    .line 280
    const/4 v0, 0x1

    aput-object p2, v2, v0

    .line 281
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 282
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 283
    return-void
.end method

.method public handleQueryBusCardTransferAbilityResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V
    .locals 4

    .line 312
    const/16 v0, 0xc8

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 313
    const/16 v0, 0xcc

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 314
    iput p1, v2, Landroid/os/Message;->arg2:I

    .line 315
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    .line 316
    const/4 v0, 0x0

    aput-object p3, v3, v0

    .line 317
    const/4 v0, 0x1

    aput-object p2, v3, v0

    .line 318
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Send HANDLER_TAG_TRAFFIC_CARD_RESULT message to target, arg1 is HANDLER_TRAFFIC_QUERY_TRANSFER_ABILITY_RESULT, resultCode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 320
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 321
    return-void
.end method

.method public handleQueryCardNoticeResult(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V"
        }
    .end annotation

    .line 463
    const/16 v0, 0xc8

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 464
    const/16 v0, 0xce

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 465
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 466
    const/4 v0, 0x0

    aput-object p2, v2, v0

    .line 467
    const/4 v0, 0x1

    aput-object p1, v2, v0

    .line 468
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 469
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 470
    return-void
.end method

.method public handleQueryPayableCardInfo(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;>;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryPayableCardCallback;)V"
        }
    .end annotation

    .line 232
    const/4 v0, 0x2

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 233
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 234
    const/4 v0, 0x0

    aput-object p2, v2, v0

    .line 235
    const/4 v0, 0x1

    aput-object p1, v2, v0

    .line 236
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 238
    return-void
.end method

.method public handleQuerySupportedBankCardInfoResult(Ljava/util/Map;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;>;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V"
        }
    .end annotation

    .line 263
    const/16 v0, 0x12c

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 264
    const/16 v0, 0x12d

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 265
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 266
    const/4 v0, 0x0

    aput-object p2, v2, v0

    .line 267
    const/4 v0, 0x1

    aput-object p1, v2, v0

    .line 268
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 269
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 270
    return-void
.end method

.method public handleQuerySupportedTrafficCardsResult(Ljava/util/Map;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V"
        }
    .end annotation

    .line 221
    const/16 v0, 0xc8

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 222
    const/16 v0, 0xc9

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 223
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 224
    const/4 v0, 0x0

    aput-object p2, v2, v0

    .line 225
    const/4 v0, 0x1

    aput-object p1, v2, v0

    .line 226
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 228
    return-void
.end method

.method public handleQueryTrafficCardInfoResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V
    .locals 3

    .line 250
    const/16 v0, 0xc8

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 251
    const/16 v0, 0xca

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 252
    iput p1, v1, Landroid/os/Message;->arg2:I

    .line 253
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 254
    const/4 v0, 0x0

    aput-object p3, v2, v0

    .line 255
    const/4 v0, 0x1

    aput-object p2, v2, v0

    .line 256
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 257
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 258
    return-void
.end method

.method public handleSyncRFConfFileResult(ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;)V
    .locals 3

    .line 299
    const/16 v0, 0xc8

    invoke-static {p0, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 300
    const/16 v0, 0xcb

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 301
    iput p1, v1, Landroid/os/Message;->arg2:I

    .line 302
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 303
    const/4 v0, 0x0

    aput-object p3, v2, v0

    .line 304
    const/4 v0, 0x1

    aput-object p2, v2, v0

    .line 305
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 306
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 307
    return-void
.end method

.method removeCardListInfoListener(Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;)V
    .locals 4

    .line 136
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListenersLock:Ljava/lang/Object;

    monitor-enter v2

    .line 138
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;

    if-ne v0, p1, :cond_0

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->listInfoListener:Lcom/huawei/wallet/ui/carddisplay/CardListInfoListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 143
    :goto_0
    return-void
.end method
