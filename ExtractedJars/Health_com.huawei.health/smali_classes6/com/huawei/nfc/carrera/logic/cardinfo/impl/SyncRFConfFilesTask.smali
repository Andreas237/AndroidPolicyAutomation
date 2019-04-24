.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DELETE_CONF_FAILED:I = -0x1

.field private static final DELETE_CONF_NOT_EXISTS:I = 0x1

.field private static final DELETE_CONF_SUCCESS:I = 0x0

.field private static final DEVICE_SN_OF_RF:Ljava/lang/String; = "DEVICE_SN_OF_RF"

.field private static final HUAWEI_HEALTH:Ljava/lang/String; = "HUAWEI-HEALTH"

.field private static final TAG:Ljava/lang/String; = "SyncRFConfFilesTask"


# instance fields
.field private cardInfoDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

.field private cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

.field private mContext:Landroid/content/Context;

.field private mRFSyncCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

.field private mResultCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

.field private mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mRFSyncCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    .line 68
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    .line 69
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    .line 70
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 71
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardInfoDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    .line 72
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    return-object v0
.end method

.method private createQueryRFConfRequset()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;>;"
        }
    .end annotation

    .line 239
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter createQueryRFConfRequset "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v6

    .line 241
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 245
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardInfoDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryRFConfInfo()Ljava/util/HashMap;

    move-result-object v7

    .line 247
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "  queryRFConfInfo end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    if-nez v7, :cond_2

    .line 251
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 253
    :cond_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 254
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_3
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 256
    if-eqz v10, :cond_3

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 258
    goto :goto_0

    .line 261
    :cond_4
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 263
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    :cond_5
    goto :goto_0

    .line 266
    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 268
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getWearModle()Ljava/lang/String;

    move-result-object v10

    .line 270
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getWearRomVersion()Ljava/lang/String;

    move-result-object v11

    .line 272
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getDeviceSN()Ljava/lang/String;

    move-result-object v12

    .line 273
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "DEVICE_SN_OF_RF"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 274
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  issuerIds is :  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 279
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v14

    .line 280
    const/4 v15, 0x0

    .line 282
    :goto_1
    if-eqz v14, :cond_9

    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 284
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;

    .line 285
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getTimeStamp()J

    move-result-wide v16

    .line 288
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getRomVersion()Ljava/lang/String;

    move-result-object v18

    .line 289
    move-object/from16 v0, v18

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 291
    move-object/from16 v0, v18

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 293
    const-wide/16 v16, 0x0

    .line 296
    :cond_7
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 297
    const-wide/16 v16, 0x0

    .line 299
    :cond_8
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;

    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v3

    move-object v1, v10

    move-object v2, v11

    move-wide/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 300
    goto :goto_1

    .line 301
    :cond_9
    goto :goto_3

    .line 304
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 306
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;

    move-object v1, v10

    move-object v2, v11

    move-object v3, v15

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 307
    goto :goto_2

    .line 309
    :cond_b
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "DEVICE_SN_OF_RF"

    invoke-virtual {v0, v1, v12}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 311
    return-object v9
.end method

.method private deleteRFConf(Ljava/lang/String;)I
    .locals 3

    .line 423
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardRFConfFilePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 424
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 425
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 427
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0

    .line 429
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private getDeviceSN()Ljava/lang/String;
    .locals 5

    .line 433
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getDeviceSN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 435
    const-string v0, ""

    return-object v0

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v4

    .line 438
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 439
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceSN watchModle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    const-string v0, ""

    return-object v0

    .line 442
    :cond_1
    return-object v4
.end method

.method private getVersionStr(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 355
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 356
    const-string v3, ""

    .line 357
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 358
    return-object v3

    .line 360
    :cond_0
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 362
    array-length v0, v4

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 363
    return-object p1

    .line 365
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "."

    .line 366
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v4, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 368
    return-object v3
.end method

.method private getWearBTVersion()Ljava/lang/String;
    .locals 5

    .line 322
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearBTVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 325
    const-string v0, ""

    return-object v0

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceBTVersion()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getVersionStr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 330
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 331
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearBTVersion btVersion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const-string v0, ""

    return-object v0

    .line 334
    :cond_1
    return-object v4
.end method

.method private getWearModle()Ljava/lang/String;
    .locals 5

    .line 339
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearModle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 342
    const-string v0, ""

    return-object v0

    .line 345
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    .line 346
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearModle watchModle is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const-string v0, ""

    return-object v0

    .line 350
    :cond_1
    return-object v4
.end method

.method private getWearRomVersion()Ljava/lang/String;
    .locals 5

    .line 315
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getWearRomVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 317
    const-string v0, "HUAWEI-HEALTH"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getWearModle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->getWearBTVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 318
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private syncRFConfURLInfoFromServer()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;"
        }
    .end annotation

    .line 151
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 153
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->createQueryRFConfRequset()Ljava/util/List;

    move-result-object v5

    .line 154
    if-nez v5, :cond_0

    .line 156
    return-object v4

    .line 158
    :cond_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/ServerServiceFactory;->createCardServerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/huawei/nfc/carrera/server/card/CardServerApi;->queryRFConfURL(Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    move-result-object v9

    .line 162
    if-eqz v9, :cond_1

    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    if-eqz v0, :cond_3

    .line 164
    :cond_1
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " syncRFConfURLInfoFromServer failed. query server failed. retCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez v9, :cond_2

    const-string v3, "response is null"

    goto :goto_1

    :cond_2
    iget v3, v9, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->returnCode:I

    .line 165
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 164
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    goto :goto_0

    .line 168
    :cond_3
    iget-object v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->rfConfInfos:Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;

    if-nez v0, :cond_4

    .line 170
    goto :goto_0

    .line 172
    :cond_4
    iget-object v0, v9, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;->rfConfInfos:Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    goto :goto_0

    .line 174
    :cond_5
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 176
    return-object v4

    .line 178
    :cond_6
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;

    .line 180
    if-nez v8, :cond_7

    .line 182
    goto :goto_2

    .line 184
    :cond_7
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->deleteRFConf(Ljava/lang/String;)I

    move-result v9

    .line 186
    if-eqz v9, :cond_8

    const/4 v0, 0x1

    if-ne v9, v0, :cond_9

    .line 189
    :cond_8
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;

    invoke-direct {v1, v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;-><init>(Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;)V

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    :cond_9
    goto :goto_2

    .line 192
    :cond_a
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardInfoDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->insertOrUpdateRFConfInfos(Ljava/util/List;)V

    .line 193
    return-object v4
.end method


# virtual methods
.method public refreshRFConfFiles()V
    .locals 9

    .line 109
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshRFConfFiles begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->syncRFConfURLInfoFromServer()Ljava/util/HashMap;

    move-result-object v4

    .line 112
    const/4 v5, 0x0

    .line 113
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    goto :goto_0

    .line 119
    :cond_0
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " syncRFConfURLInfoFromServer no newer records get from server."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardInfoDBManager:Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryRFConfInfo()Ljava/util/HashMap;

    move-result-object v6

    .line 121
    if-nez v6, :cond_1

    .line 123
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 125
    :cond_1
    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 127
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 131
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 132
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 133
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;

    .line 134
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " refreshRFConfFiles issuerId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->cardPicRescManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getRfURL()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mRFSyncCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;

    invoke-virtual {v0, v7, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->refreshLocalRFConfFiles(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;)V

    .line 136
    goto :goto_1

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    if-eqz v0, :cond_3

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mUIHandler:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const-string v1, ""

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleSyncRFConfFileResult(ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;)V

    .line 146
    :cond_3
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshRFConfFiles end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    return-void
.end method
