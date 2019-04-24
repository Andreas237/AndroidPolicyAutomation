.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final PRODUCT_ID_SHANGHAI:Ljava/lang/String;

.field private cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    const-string v0, "P0000012"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->PRODUCT_ID_SHANGHAI:Ljava/lang/String;

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    .line 56
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 57
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    .line 58
    return-void
.end method

.method private convertParams(Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;>;)Ljava/util/Set<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 413
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 414
    if-nez p1, :cond_0

    .line 416
    return-object v1

    .line 418
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    .line 420
    if-nez v3, :cond_1

    .line 422
    goto :goto_0

    .line 424
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;->convert2Map()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 425
    goto :goto_0

    .line 426
    :cond_2
    return-object v1
.end method

.method private getAllCardRequestParam(Ljava/util/Map;Ljava/util/Map;)Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;"
        }
    .end annotation

    .line 291
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;-><init>()V

    .line 292
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 293
    const-wide/16 v0, 0x0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setTimeStamp(J)V

    .line 294
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->convertParams(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setFilters(Ljava/util/Set;)V

    .line 295
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 296
    :cond_0
    return-object v3

    .line 298
    :cond_1
    const-wide/16 v5, 0x0

    .line 299
    const/4 v7, 0x0

    .line 300
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 301
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 302
    if-nez v9, :cond_2

    .line 303
    goto :goto_0

    .line 305
    :cond_2
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getTimeStamp()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-lez v0, :cond_3

    move-wide v0, v5

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getTimeStamp()J

    move-result-wide v0

    :goto_1
    move-wide v5, v0

    .line 306
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 307
    if-nez v10, :cond_4

    .line 308
    goto :goto_0

    .line 310
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v11

    .line 311
    const-string v0, "63020000"

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 312
    const/16 v11, 0xd

    .line 314
    :cond_5
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getType()I

    move-result v1

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v0, v11, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 315
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 316
    goto/16 :goto_0

    .line 317
    :cond_6
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getAllTrafficCardReqestParams(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v8

    .line 318
    invoke-interface {v4, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 319
    invoke-virtual {v3, v5, v6}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setTimeStamp(J)V

    .line 320
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->convertParams(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setFilters(Ljava/util/Set;)V

    .line 321
    return-object v3
.end method

.method private getAllTrafficCardReqestParams(Ljava/util/Map;)Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;)Ljava/util/Set<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;>;"
        }
    .end annotation

    .line 325
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 326
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 328
    :cond_0
    return-object v4

    .line 330
    :cond_1
    const/4 v5, 0x0

    .line 331
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 333
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 334
    if-nez v7, :cond_2

    .line 336
    goto :goto_0

    .line 338
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 340
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v1

    .line 341
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb

    invoke-direct {v5, v0, v1, v3, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 342
    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 344
    :cond_3
    goto :goto_0

    .line 345
    :cond_4
    return-object v4
.end method

.method private getNewOpenCardRequestParam(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Set;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)Ljava/util/Set<Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;>;"
        }
    .end annotation

    .line 254
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 255
    const/4 v4, 0x0

    .line 256
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 258
    :cond_0
    return-object v3

    .line 260
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v5

    .line 261
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 263
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 265
    if-nez v7, :cond_2

    .line 267
    goto :goto_0

    .line 269
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    goto :goto_0

    .line 273
    :cond_3
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 274
    const/4 v0, 0x0

    if-ne v0, v8, :cond_4

    .line 276
    goto :goto_0

    .line 278
    :cond_4
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v9

    .line 279
    const-string v0, "63020000"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 281
    const/16 v9, 0xd

    .line 283
    :cond_5
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardType()I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v0, v9, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RequestParam;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 284
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 285
    goto/16 :goto_0

    .line 287
    :cond_6
    return-object v3
.end method

.method private getinfoFromDic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 228
    const/4 v2, 0x0

    .line 229
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;-><init>()V

    .line 230
    iput-object p1, v3, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->dicName:Ljava/lang/String;

    .line 231
    iput-object p2, v3, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->itemName:Ljava/lang/String;

    .line 232
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryDics(Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v4

    .line 233
    if-eqz v4, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 234
    const-string v0, "queryDics SUCCESS"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 235
    iget-object v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 236
    iget-object v0, v4, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;->dicItems:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/server/card/response/DicItem;

    .line 237
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/DicItem;->getValue()Ljava/lang/String;

    move-result-object v6

    .line 238
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryDics info : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 240
    move-object v2, v6

    .line 242
    :cond_0
    goto :goto_0

    .line 243
    :cond_1
    const-string v0, "queryDics The size of result\'s dictory is zero"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 246
    :cond_2
    const-string v0, "queryDics Response is null object"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 248
    :goto_0
    return-object v2
.end method

.method private saveCardInfoToDB(Ljava/util/Set;Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;)V"
        }
    .end annotation

    .line 356
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 358
    const/4 v4, 0x0

    .line 359
    const/4 v5, 0x0

    .line 360
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;

    .line 361
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 362
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 363
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 364
    const/4 v9, 0x0

    .line 366
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "productid"

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;->getProductId()Ljava/lang/String;

    move-result-object v9

    .line 370
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 372
    new-instance v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    invoke-direct {v4, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;-><init>(Lcom/huawei/nfc/carrera/server/card/response/CardProductInfoServerItem;)V

    .line 373
    iput-object v9, v4, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    .line 374
    const-string v0, "P0000012"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setMktInfo(Ljava/lang/String;)V

    .line 377
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReservedInfo(Ljava/lang/String;)V

    .line 378
    const/4 v5, 0x1

    .line 380
    :cond_1
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    goto :goto_2

    .line 383
    :cond_2
    goto :goto_1

    .line 384
    :cond_3
    :goto_2
    goto/16 :goto_0

    .line 385
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveCardInfoToDB ,isShangHaiUpdate= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 386
    if-nez v5, :cond_6

    .line 387
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardProductInfo()Ljava/util/List;

    move-result-object v6

    .line 388
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 389
    const-string v0, "P0000012"

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 391
    const-string v0, ""

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setMktInfo(Ljava/lang/String;)V

    .line 392
    const-string v0, ""

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReservedInfo(Ljava/lang/String;)V

    .line 393
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 395
    :cond_5
    goto :goto_3

    .line 397
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveCardInfoToDB ,insertDBItems.isEmpty()= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 398
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 399
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveCardInfoToDB ,insertDBItems.response()= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 402
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 403
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->updateMtkinfoAndreserved(Ljava/util/List;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateCardProductInfos(Ljava/util/List;)V

    .line 406
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    if-eqz v0, :cond_8

    if-lez v6, :cond_8

    .line 407
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    invoke-interface {v0, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;->syncCardProductInfosFromServerResult(Ljava/util/List;)V

    .line 409
    :cond_8
    return-void
.end method

.method private updateMtkinfoAndreserved(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)V"
        }
    .end annotation

    .line 201
    const-string v0, "updateMtkinfoAndreserved enter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 202
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 203
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 204
    goto :goto_0

    .line 206
    :cond_0
    const-string v0, "P0000012"

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 208
    const-string v4, "P0000012_mktInfo"

    .line 209
    const-string v5, "P0000012_reserved"

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v6

    .line 211
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    const-string v0, "updateMtkinfoAndreserved,deviceModel is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 213
    return-void

    .line 215
    :cond_1
    invoke-direct {p0, v4, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getinfoFromDic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 216
    invoke-direct {p0, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getinfoFromDic(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 217
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 218
    invoke-virtual {v3, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setMktInfo(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v3, v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReservedInfo(Ljava/lang/String;)V

    .line 224
    :cond_2
    goto :goto_0

    .line 225
    :cond_3
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 433
    const-string v0, "sync infos from server begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 435
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncIssuerInfoFromServer()V

    .line 437
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->syncCardProductInfoFromServer()V

    .line 438
    const-string v0, "sync infos from server end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 439
    return-void
.end method

.method public syncCardProductInfoFromServer()V
    .locals 14

    .line 122
    const-string v0, "syncCardProductInfoFromServer begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryCardProductInfo()Ljava/util/List;

    move-result-object v3

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfo()Ljava/util/List;

    move-result-object v4

    .line 126
    if-eqz v3, :cond_0

    if-nez v4, :cond_1

    .line 128
    :cond_0
    return-void

    .line 130
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 131
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 132
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 134
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    goto :goto_0

    .line 136
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 138
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    .line 141
    new-instance v8, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;

    invoke-direct {v8}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;-><init>()V

    .line 143
    invoke-direct {p0, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getNewOpenCardRequestParam(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Set;

    move-result-object v9

    .line 144
    invoke-interface {v9}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 148
    invoke-direct {p0, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getAllCardRequestParam(Ljava/util/Map;Ljava/util/Map;)Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;

    move-result-object v8

    goto :goto_2

    .line 150
    :cond_4
    if-eqz v7, :cond_5

    .line 153
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->getAllTrafficCardReqestParams(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v10

    .line 154
    invoke-interface {v9, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 155
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setTimeStamp(J)V

    .line 157
    invoke-direct {p0, v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->convertParams(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setFilters(Ljava/util/Set;)V

    .line 158
    goto :goto_2

    .line 161
    :cond_5
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setTimeStamp(J)V

    .line 162
    invoke-direct {p0, v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->convertParams(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setFilters(Ljava/util/Set;)V

    .line 164
    :goto_2
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v8}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryCardProductInfoList(Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;

    move-result-object v10

    .line 166
    iget-object v0, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    .line 167
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncCardProductInfoFromServer queryCardProductInfoList response.returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 169
    iget v0, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    if-nez v0, :cond_6

    .line 171
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->getFilters()Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0, v10}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->saveCardInfoToDB(Ljava/util/Set;Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;)V

    goto/16 :goto_3

    .line 174
    :cond_6
    iget v0, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    const/4 v1, -0x4

    if-ne v0, v1, :cond_7

    .line 176
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 177
    const-string v13, "refreshLocalCardProductInfo QueryCardProductInfo server overload 503"

    .line 178
    const-string v0, "fail_reason"

    invoke-interface {v12, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const v0, 0x3611a442

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v12, v13, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 180
    goto :goto_3

    .line 183
    :cond_7
    iget v0, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    iget v0, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_8

    .line 186
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshLocalCardProductInfo QueryCardProductInfo fail code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 189
    const-string v0, "fail_reason"

    invoke-interface {v12, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    const v0, 0x3611a443

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v12, v13, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 191
    goto :goto_3

    .line 194
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncCardProductInfoFromServer returnCode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v10, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 197
    :goto_3
    const-string v0, "syncCardProductInfoFromServer end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method public syncIssuerInfoFromServer()V
    .locals 13

    .line 67
    const-string v0, "syncIssuerInfoFromServer begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfo()Ljava/util/List;

    move-result-object v3

    .line 69
    const-wide/16 v4, 0x0

    .line 70
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 72
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getTimeStamp()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    move-wide v0, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getTimeStamp()J

    move-result-wide v0

    :goto_1
    move-wide v4, v0

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;-><init>()V

    .line 75
    iput-wide v4, v6, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->timeStamp:J

    .line 76
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryIssuerInfo(Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    move-result-object v7

    .line 78
    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->issueInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syncIssuerInfoFromServer queryIssuerInfo response.returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " size : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 80
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    if-nez v0, :cond_4

    .line 82
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 83
    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->issueInfos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;

    .line 85
    new-instance v12, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-direct {v12, v11}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;-><init>(Lcom/huawei/nfc/carrera/server/card/response/IssuerInfoServerItem;)V

    .line 86
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->cardDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0, v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateIssuerInfos(Ljava/util/List;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    if-eqz v0, :cond_3

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncInfosFromServerTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;

    invoke-interface {v0, v9}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncInfosFromServerCallback;->syncIssuerInfosFromServerResult(Ljava/util/List;)V

    .line 96
    :cond_3
    goto :goto_3

    .line 98
    :cond_4
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    const/4 v1, -0x4

    if-ne v0, v1, :cond_5

    .line 100
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 101
    const-string v10, "refreshLocalIssuerInfo queryIssuerInfo server overload 503"

    .line 102
    const-string v0, "fail_reason"

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const v0, 0x3611a442

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v10, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 104
    goto :goto_3

    .line 107
    :cond_5
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshLocalIssuerInfo queryIssuerInfo fail, errorcode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 109
    const-string v0, "fail_reason"

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const v0, 0x3611a443

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v10, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 112
    :goto_3
    const-string v0, "syncIssuerInfoFromServer end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 113
    return-void
.end method
