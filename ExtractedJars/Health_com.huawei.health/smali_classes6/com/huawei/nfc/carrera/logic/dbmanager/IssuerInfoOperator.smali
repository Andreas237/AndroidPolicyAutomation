.class Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;
.super Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/BaseOperator;-><init>(Landroid/content/ContentResolver;)V

    .line 30
    return-void
.end method

.method private iteratorIssuerInfoCursor(Landroid/database/Cursor;)Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation

    .line 107
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 108
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-gtz v0, :cond_1

    .line 110
    :cond_0
    const-string v0, "CardInfoDBManager"

    const-string v1, "iteratorIssuerInfoCursor the cursor is empty"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    return-object v3

    .line 113
    :cond_1
    const-string v0, "issuer_id"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 114
    const-string v0, "name"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 115
    const-string v0, "description"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 116
    const-string v0, "logo_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 117
    const-string v0, "issuer_type"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 118
    const-string v0, "support_card_type"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 119
    const-string v0, "mode"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 120
    const-string v0, "wallet_version"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 121
    const-string v0, "contact_num"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 122
    const-string v0, "debit_callcenter_num"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 123
    const-string v0, "credit_call_center_num"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 124
    const-string v0, "debit_tcurl"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 125
    const-string v0, "credit_tcurl"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 126
    const-string v0, "timestamp"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 127
    const-string v0, "reserved_info"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 128
    const-string v0, "debit_website_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 129
    const-string v0, "credit_website_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 130
    const-string v0, "app_info"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 131
    const-string v0, "sn"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 132
    const-string v0, "city_code"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 133
    const-string v0, "pay_type"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 134
    const/16 v25, 0x0

    .line 135
    :goto_0
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    new-instance v25, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;-><init>()V

    .line 138
    move-object/from16 v0, p1

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setIssuerId(Ljava/lang/String;)V

    .line 139
    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setName(Ljava/lang/String;)V

    .line 140
    move-object/from16 v0, p1

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setDescription(Ljava/lang/String;)V

    .line 141
    move-object/from16 v0, p1

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setLogoUrl(Ljava/lang/String;)V

    .line 142
    move-object/from16 v0, p1

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setIssuerType(I)V

    .line 143
    move-object/from16 v0, p1

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setSupportType(I)V

    .line 144
    move-object/from16 v0, p1

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setMode(I)V

    .line 145
    move-object/from16 v0, p1

    move/from16 v1, v22

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setSn(I)V

    .line 146
    move-object/from16 v0, p1

    move/from16 v1, v23

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setCityCode(Ljava/lang/String;)V

    .line 147
    move-object/from16 v0, p1

    move/from16 v1, v24

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setPayTypeString(Ljava/lang/String;)V

    .line 151
    move-object/from16 v0, p1

    :try_start_0
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setWalletVersion(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_1

    .line 153
    :catch_0
    move-exception v26

    .line 155
    move-object/from16 v0, v25

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setWalletVersion(I)V

    .line 158
    :goto_1
    move-object/from16 v0, p1

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setContactNumber(Ljava/lang/String;)V

    .line 159
    move-object/from16 v0, p1

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setDebitCallCenterNumber(Ljava/lang/String;)V

    .line 160
    move-object/from16 v0, p1

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setCreditCallCenterNumber(Ljava/lang/String;)V

    .line 161
    move-object/from16 v0, p1

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setDebitTcUrl(Ljava/lang/String;)V

    .line 162
    move-object/from16 v0, p1

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setCreditTcUrl(Ljava/lang/String;)V

    .line 163
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setDebitWebsite(Ljava/lang/String;)V

    .line 164
    move-object/from16 v0, p1

    move/from16 v1, v20

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setCreditWebsite(Ljava/lang/String;)V

    .line 165
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-object/from16 v2, v25

    invoke-virtual {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setTimeStamp(J)V

    .line 166
    move-object/from16 v0, p1

    move/from16 v1, v18

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setReservedInfo(Ljava/lang/String;)V

    .line 167
    invoke-virtual/range {v25 .. v25}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->parseReservedJson()V

    .line 168
    move-object/from16 v0, p1

    move/from16 v1, v21

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->setAppInfo(Ljava/lang/String;)V

    .line 169
    invoke-virtual/range {v25 .. v25}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->parseAppInfoJson()V

    .line 170
    move-object/from16 v0, v25

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 172
    :cond_2
    return-object v3
.end method


# virtual methods
.method insertOrUpdateIssuerInfos(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;)V"
        }
    .end annotation

    .line 177
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    :cond_0
    const-string v0, "insertOrUpdateIssuerInfos, info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 180
    return-void

    .line 182
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

    check-cast v5, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 184
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    const-string v0, "insertOrUpdateIssuerInfos, ignore this card info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 187
    goto :goto_0

    .line 189
    :cond_2
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "issuer_id"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->isRecordInfoExist(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v1, "issuer_id"

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    .line 192
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v3

    .line 191
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->updateRecordInfo(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    goto :goto_1

    .line 196
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->toContentValues()Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->insertRecordInfo(Landroid/net/Uri;Landroid/content/ContentValues;)V

    .line 198
    :goto_1
    goto :goto_0

    .line 199
    :cond_4
    return-void
.end method

.method queryIssuerInfo()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 45
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->iteratorIssuerInfoCursor(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 53
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 55
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 56
    const/4 v7, 0x0

    goto :goto_0

    .line 47
    :catch_0
    move-exception v8

    .line 49
    const-string v0, "CardInfoDBManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryIssuerInfo sql exception. "

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

    .line 53
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 55
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 56
    const/4 v7, 0x0

    goto :goto_0

    .line 53
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 55
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 56
    const/4 v7, 0x0

    .line 58
    :cond_0
    throw v9

    .line 59
    :cond_1
    :goto_0
    return-object v6
.end method

.method queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
    .locals 11

    .line 71
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v8, v0

    .line 81
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$IssuerInfoColumns;->CONTENT_URI:Landroid/net/Uri;

    const-string v3, "issuer_id = ?"

    move-object v4, v8

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 82
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->iteratorIssuerInfoCursor(Landroid/database/Cursor;)Ljava/util/List;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 90
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 92
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 93
    const/4 v7, 0x0

    goto :goto_0

    .line 84
    :catch_0
    move-exception v9

    .line 86
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

    .line 90
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 92
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 93
    const/4 v7, 0x0

    goto :goto_0

    .line 90
    :catchall_0
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 92
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 93
    const/4 v7, 0x0

    .line 95
    :cond_1
    throw v10

    .line 97
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 99
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    return-object v0

    .line 102
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
