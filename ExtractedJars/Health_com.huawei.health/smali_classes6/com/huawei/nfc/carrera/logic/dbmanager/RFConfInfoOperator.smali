.class public Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;
.super Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;-><init>(Landroid/content/ContentResolver;)V

    .line 22
    return-void
.end method

.method private iteratorRFConfInfoCursor(Landroid/database/Cursor;)Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;"
        }
    .end annotation

    .line 78
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 79
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 81
    :cond_0
    const-string v0, "CardInfoDBManager"

    const-string v1, "iteratorCardProductCursor the cursor is empty"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-object v3

    .line 86
    :cond_1
    const-string v0, "issuer_id"

    :try_start_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 87
    const-string v0, "model"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 88
    const-string v0, "rf_conf_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 89
    const-string v0, "rom_version"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 90
    const-string v0, "timestamp"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 92
    const/4 v9, 0x0

    .line 93
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    new-instance v9, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;

    invoke-direct {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;-><init>()V

    .line 96
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->setIssuerId(Ljava/lang/String;)V

    .line 97
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->setModel(Ljava/lang/String;)V

    .line 98
    invoke-interface {p1, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->setRfURL(Ljava/lang/String;)V

    .line 99
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->setRomVersion(Ljava/lang/String;)V

    .line 100
    invoke-interface {p1, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->setTimeStamp(J)V

    .line 101
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 107
    :cond_2
    goto :goto_1

    .line 104
    :catch_0
    move-exception v4

    .line 106
    const-string v0, "CardInfoDBManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "iteratorCardProductCursor sql exception. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    :goto_1
    return-object v3
.end method


# virtual methods
.method public insertOrUpdateRFConfInfos(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;)V"
        }
    .end annotation

    .line 50
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    const-string v0, "insertOrUpdateRFConfInfos, info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 53
    return-void

    .line 55
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;

    .line 57
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    const-string v0, "insertOrUpdateRFConfInfos, ignore this card info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 62
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "issuer_id"

    .line 63
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->isRecordInfoExist(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 65
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "issuer_id"

    .line 66
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v3

    .line 65
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->updateRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    goto :goto_1

    .line 70
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->insertRecordInfo(Landroid/net/Uri;Landroid/content/ContentValues;)V

    .line 72
    :goto_1
    goto :goto_0

    .line 74
    :cond_4
    return-void
.end method

.method public queryRFConfInfo()Ljava/util/HashMap;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;"
        }
    .end annotation

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 30
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$RFConfInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 31
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->iteratorRFConfInfoCursor(Landroid/database/Cursor;)Ljava/util/HashMap;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 39
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 41
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 42
    const/4 v7, 0x0

    goto :goto_0

    .line 33
    :catch_0
    move-exception v8

    .line 35
    const-string v0, "CardInfoDBManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryCardProductInfo sql exception. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v8}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 41
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 42
    const/4 v7, 0x0

    goto :goto_0

    .line 39
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 41
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 42
    const/4 v7, 0x0

    .line 44
    :cond_0
    throw v9

    .line 45
    :cond_1
    :goto_0
    return-object v6
.end method
