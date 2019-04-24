.class public Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ReportCardDBManager"


# instance fields
.field private final mContentResolver:Landroid/content/ContentResolver;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContext:Landroid/content/Context;

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    .line 52
    return-void
.end method

.method private isCardStatusInfoExist(Ljava/lang/String;)Z
    .locals 10

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 105
    const/4 v0, 0x1

    :try_start_0
    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "aid"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    move-object v2, v8

    const-string v3, "aid=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 112
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    .line 114
    const/4 v6, 0x1

    .line 123
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 125
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 126
    const/4 v7, 0x0

    goto :goto_0

    .line 117
    :catch_0
    move-exception v8

    .line 119
    const-string v0, "ReportCardDBManager"

    const-string v1, "isCardStatusInfoExist sql exception."

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 125
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 126
    const/4 v7, 0x0

    goto :goto_0

    .line 123
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 125
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 126
    const/4 v7, 0x0

    .line 128
    :cond_1
    throw v9

    .line 130
    :cond_2
    :goto_0
    return v6
.end method


# virtual methods
.method public insertOrUpdateOneCardReportInfo(Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;)V
    .locals 7

    .line 61
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardStatus()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 63
    :cond_0
    const-string v0, "insertOrUpdateOneCardReportInfo, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 64
    return-void

    .line 67
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "insertOrUpdateOneCardReportInfo, card aid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 68
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 70
    const-string v0, "aid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v0, "status"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "dpanid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getDpanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "card_name"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "card_number"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "issuserid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getIssuerID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "card_type"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getCardType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 79
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->isCardStatusInfoExist(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 81
    const-string v0, "insertOrUpdateOneCardReportInfo, card info existed, update now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    const-string v2, "aid=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->getAid()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 82
    invoke-virtual {v0, v1, v6, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    .line 88
    :cond_2
    const-string v0, "insertOrUpdateOneCardReportInfo, card info not existed, insert now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    invoke-virtual {v0, v1, v6}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 91
    :goto_0
    return-void
.end method

.method public queryReportStatusList()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;>;"
        }
    .end annotation

    .line 140
    const-string v0, "queryReportStatusList begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v7, 0x0

    .line 145
    const/16 v0, 0x8

    :try_start_0
    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "aid"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "user_id"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const-string v0, "status"

    const/4 v1, 0x2

    aput-object v0, v8, v1

    const-string v0, "dpanid"

    const/4 v1, 0x3

    aput-object v0, v8, v1

    const-string v0, "card_name"

    const/4 v1, 0x4

    aput-object v0, v8, v1

    const-string v0, "card_number"

    const/4 v1, 0x5

    aput-object v0, v8, v1

    const-string v0, "issuserid"

    const/4 v1, 0x6

    aput-object v0, v8, v1

    const-string v0, "card_type"

    const/4 v1, 0x7

    aput-object v0, v8, v1

    .line 151
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_7

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v6, v0

    .line 157
    const-string v0, "aid"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 158
    const-string v0, "user_id"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 159
    const-string v0, "status"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 160
    const-string v0, "dpanid"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 161
    const-string v0, "card_name"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 162
    const-string v0, "card_number"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 163
    const-string v0, "issuserid"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 164
    const-string v0, "card_type"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 168
    :cond_0
    new-instance v9, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;

    invoke-direct {v9}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;-><init>()V

    .line 170
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setAid(Ljava/lang/String;)V

    .line 171
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardStatus(Ljava/lang/String;)V

    .line 173
    invoke-interface {v7, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setUserId(Ljava/lang/String;)V

    .line 178
    :cond_1
    invoke-interface {v7, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 180
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setDpanId(Ljava/lang/String;)V

    .line 183
    :cond_2
    invoke-interface {v7, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 185
    invoke-interface {v7, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardName(Ljava/lang/String;)V

    .line 188
    :cond_3
    invoke-interface {v7, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 190
    invoke-interface {v7, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardNumber(Ljava/lang/String;)V

    .line 193
    :cond_4
    move/from16 v0, v16

    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 195
    move/from16 v0, v16

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setIssuerID(Ljava/lang/String;)V

    .line 198
    :cond_5
    move/from16 v0, v17

    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 200
    move/from16 v0, v17

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->setCardType(I)V

    .line 203
    :cond_6
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 214
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v7, :cond_9

    .line 216
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 217
    const/4 v7, 0x0

    goto :goto_0

    .line 208
    :catch_0
    move-exception v8

    .line 210
    const-string v0, "ReportCardDBManager"

    const-string v1, "queryReportStatusList sql exception."

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 214
    const/4 v0, 0x0

    if-eq v0, v7, :cond_9

    .line 216
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 217
    const/4 v7, 0x0

    goto :goto_0

    .line 214
    :catchall_0
    move-exception v18

    const/4 v0, 0x0

    if-eq v0, v7, :cond_8

    .line 216
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 217
    const/4 v7, 0x0

    .line 219
    :cond_8
    throw v18

    .line 221
    :cond_9
    :goto_0
    return-object v6
.end method

.method public removeOneReportStatusInfo(Ljava/lang/String;)V
    .locals 5

    .line 231
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    const-string v0, "removeOneReportStatusInfo, aid is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 234
    return-void

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->mContentResolver:Landroid/content/ContentResolver;

    sget-object v1, Lcom/huawei/nfc/carrera/storage/db/DataModel$ReportCardInfo;->CONTENT_URI:Landroid/net/Uri;

    const-string v2, "aid=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 239
    return-void
.end method
