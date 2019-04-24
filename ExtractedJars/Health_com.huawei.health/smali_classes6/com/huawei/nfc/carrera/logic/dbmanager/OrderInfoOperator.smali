.class Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;
.super Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;-><init>(Landroid/content/ContentResolver;)V

    .line 32
    return-void
.end method

.method private iteratorCardOrderinfoCursor(Landroid/database/Cursor;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;"
        }
    .end annotation

    .line 190
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 191
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 193
    :cond_0
    const-string v0, "CardInfoDBManager"

    const-string v1, "iteratorCardOrderinfoCursor the cursor is empty"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-object v2

    .line 196
    :cond_1
    const-string v0, "reference_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 197
    const-string v0, "timestamp"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 199
    const/4 v5, 0x0

    .line 200
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 202
    new-instance v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>()V

    .line 203
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setReference_id(Ljava/lang/String;)V

    .line 204
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->setTimestamp(J)V

    .line 205
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 207
    :cond_2
    return-object v2
.end method


# virtual methods
.method public deleteAllCardOrderInfos()V
    .locals 7

    .line 75
    const-string v0, "CardInfoDBManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteAllCardOrderInfos"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v4

    .line 78
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    const-string v0, "deleteCardOrderInfos, info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 81
    return-void

    .line 84
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    .line 86
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    const-string v0, "deleteCardOrderInfos, ignore this card info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 89
    goto :goto_0

    .line 91
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "reference_id"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->deleteRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    goto :goto_0

    .line 93
    :cond_3
    return-void
.end method

.method public deleteCardOrderItem(Ljava/lang/String;)V
    .locals 2

    .line 104
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "reference_id"

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->isRecordInfoExist(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "reference_id"

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->deleteRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :cond_0
    return-void
.end method

.method public insertOrUpdateCardOrderInfos(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;)V"
        }
    .end annotation

    .line 42
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    :cond_0
    const-string v0, "insertOrUpdateCardOrderInfos, info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 45
    return-void

    .line 47
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

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    .line 49
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    const-string v0, "insertOrUpdateCardOrderInfos, ignore this card info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 52
    goto :goto_0

    .line 54
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "reference_id"

    .line 55
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v2

    .line 54
    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->isRecordInfoExist(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 57
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "reference_id"

    .line 58
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v3

    .line 57
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->updateRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    goto :goto_1

    .line 62
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->insertRecordInfo(Landroid/net/Uri;Landroid/content/ContentValues;)V

    .line 64
    :goto_1
    goto :goto_0

    .line 65
    :cond_4
    return-void
.end method

.method public queryCardOrderInfo()Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;"
        }
    .end annotation

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 123
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 124
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->iteratorCardOrderinfoCursor(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 132
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 134
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 135
    const/4 v7, 0x0

    goto :goto_0

    .line 126
    :catch_0
    move-exception v8

    .line 128
    const-string v0, "CardInfoDBManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryCardOrderInfo sql exception. "

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

    .line 132
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 134
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 135
    const/4 v7, 0x0

    goto :goto_0

    .line 132
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 134
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 135
    const/4 v7, 0x0

    .line 137
    :cond_0
    throw v9

    .line 138
    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 139
    const-string v0, "CardInfoDBManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryCardOrderInfo  items="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :cond_2
    return-object v6
.end method

.method public queryCardOrderInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;
    .locals 11

    .line 153
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const/4 v0, 0x0

    return-object v0

    .line 157
    :cond_0
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v8, v0

    .line 163
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardOrderColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v3, "reference_id = ?"

    move-object v4, v8

    .line 164
    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 165
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->iteratorCardOrderinfoCursor(Landroid/database/Cursor;)Ljava/util/ArrayList;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 173
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 175
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 176
    const/4 v7, 0x0

    goto :goto_0

    .line 167
    :catch_0
    move-exception v9

    .line 169
    const-string v0, "CardInfoDBManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryCardOrderInfoById sql exception. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v9}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 175
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 176
    const/4 v7, 0x0

    goto :goto_0

    .line 173
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 175
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 176
    const/4 v7, 0x0

    .line 178
    :cond_1
    throw v10

    .line 180
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 182
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    return-object v0

    .line 185
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public updateDefalutCardOrderInfo(Ljava/lang/String;)V
    .locals 10

    .line 218
    const-string v0, "CardInfoDBManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDefalutCardOrderInfo  reference_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v4

    .line 220
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    :cond_0
    return-void

    .line 227
    :cond_1
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderItemComparator;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderItemComparator;-><init>()V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 228
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 230
    add-int/lit8 v0, v5, -0x1

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    return-void

    .line 234
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_5

    .line 239
    if-eqz v7, :cond_3

    .line 241
    new-instance v9, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v8, -0x1

    .line 242
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v1

    invoke-direct {v9, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>(Ljava/lang/String;J)V

    .line 243
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    :cond_3
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 247
    const/4 v7, 0x1

    .line 248
    new-instance v9, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getReference_id()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v5, -0x1

    .line 249
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v1

    invoke-direct {v9, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;-><init>(Ljava/lang/String;J)V

    .line 250
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 254
    :cond_5
    invoke-virtual {p0, v6}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 255
    return-void
.end method
