.class Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;
.super Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;-><init>(Landroid/content/ContentResolver;)V

    .line 26
    return-void
.end method

.method private iteratorCardProductCursor(Landroid/database/Cursor;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation

    .line 131
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 132
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 134
    :cond_0
    const-string v0, "CardInfoDBManager"

    const-string v1, "iteratorCardProductCursor the cursor is empty"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    return-object v3

    .line 139
    :cond_1
    const-string v0, "product_id"

    move-object/from16 v1, p1

    :try_start_0
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 140
    const-string v0, "name"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 141
    const-string v0, "pic_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 142
    const-string v0, "description"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 143
    const-string v0, "card_type"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 144
    const-string v0, "timestamp"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 145
    const-string v0, "version"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 146
    const-string v0, "issuer_id"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 147
    const-string v0, "mkt_info"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 148
    const-string v0, "reserved_info"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 149
    const-string v0, "font_color"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 150
    const-string v0, "reserved_1"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 151
    const-string v0, "reserved_2"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 152
    const-string v0, "reserved_3"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 153
    const-string v0, "reserved_4"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 154
    const-string v0, "reserved_5"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 155
    const-string v0, "reserved_6"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 157
    const/16 v21, 0x0

    .line 158
    :goto_0
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    new-instance v21, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    invoke-direct/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;-><init>()V

    .line 161
    move-object/from16 v0, p1

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    .line 162
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    .line 163
    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->pictureUrl:Ljava/lang/String;

    .line 164
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->description:Ljava/lang/String;

    .line 165
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v21

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->type:I

    .line 166
    move-object/from16 v0, p1

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v21

    iput-wide v0, v2, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->timeStamp:J

    .line 167
    move-object/from16 v0, p1

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->version:Ljava/lang/String;

    .line 168
    move-object/from16 v0, p1

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->issuerId:Ljava/lang/String;

    .line 169
    move-object/from16 v0, p1

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->mktInfo:Ljava/lang/String;

    .line 170
    move-object/from16 v0, p1

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->reservedInfo:Ljava/lang/String;

    .line 171
    move-object/from16 v0, p1

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setFontColor(Ljava/lang/String;)V

    .line 172
    move-object/from16 v0, p1

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved1(Ljava/lang/String;)V

    .line 173
    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved2(Ljava/lang/String;)V

    .line 174
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved3(Ljava/lang/String;)V

    .line 175
    move-object/from16 v0, p1

    move/from16 v1, v18

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved4(Ljava/lang/String;)V

    .line 176
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved5(Ljava/lang/String;)V

    .line 177
    move-object/from16 v0, p1

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->setReserved6(Ljava/lang/String;)V

    .line 178
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->parseMktInfoJson()V

    .line 179
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->parseReservedJson()V

    .line 180
    move-object/from16 v0, v21

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 186
    :cond_2
    goto :goto_1

    .line 183
    :catch_0
    move-exception v4

    .line 185
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

    .line 187
    :goto_1
    return-object v3
.end method


# virtual methods
.method insertOrUpdateCardProductInfos(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)V"
        }
    .end annotation

    .line 30
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    :cond_0
    const-string v0, "insertOrUpdateCardProductInfos, info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 33
    return-void

    .line 35
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

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    .line 37
    iget-object v0, v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    const-string v0, "insertOrUpdateCardProductInfos, ignore this card info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 40
    goto :goto_0

    .line 42
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "product_id"

    iget-object v2, v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->isRecordInfoExist(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 45
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "product_id"

    iget-object v2, v5, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productId:Ljava/lang/String;

    .line 46
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v3

    .line 45
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->updateRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    goto :goto_1

    .line 50
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->insertRecordInfo(Landroid/net/Uri;Landroid/content/ContentValues;)V

    .line 52
    :goto_1
    goto :goto_0

    .line 53
    :cond_4
    return-void
.end method

.method queryCardProductInfo()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 67
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 68
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->iteratorCardProductCursor(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 76
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 79
    const/4 v7, 0x0

    goto :goto_0

    .line 70
    :catch_0
    move-exception v8

    .line 72
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

    .line 76
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 79
    const/4 v7, 0x0

    goto :goto_0

    .line 76
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 79
    const/4 v7, 0x0

    .line 81
    :cond_0
    throw v9

    .line 82
    :cond_1
    :goto_0
    return-object v6
.end method

.method queryCardProductInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
    .locals 11

    .line 94
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 98
    :cond_0
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v8, v0

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$CardProductInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v3, "product_id = ?"

    move-object v4, v8

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 106
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->iteratorCardProductCursor(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 114
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 116
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 117
    const/4 v7, 0x0

    goto :goto_0

    .line 108
    :catch_0
    move-exception v9

    .line 110
    const-string v0, "CardInfoDBManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryIssuerInfoByIssuerId sql exception. "

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

    .line 114
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 116
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 117
    const/4 v7, 0x0

    goto :goto_0

    .line 114
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 116
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 117
    const/4 v7, 0x0

    .line 119
    :cond_1
    throw v10

    .line 121
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 123
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    return-object v0

    .line 126
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
