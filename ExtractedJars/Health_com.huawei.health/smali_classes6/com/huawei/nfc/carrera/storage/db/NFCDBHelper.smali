.class public Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "wallet_nfc.db"

.field private static final DATABASE_VERSION:I = 0x18

.field private static final TAG:Ljava/lang/String; = "NFCDBHelper"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 46
    const-string v0, "wallet_nfc.db"

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 47
    return-void
.end method

.method private createCardOrderTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 144
    const-string v0, "NFCDBHelper"

    const-string v1, "createCardOrderTable begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v0, "CREATE TABLE card_order_info (reference_id TEXT PRIMARY KEY NOT NULL,timestamp LONG);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 148
    const-string v0, "NFCDBHelper"

    const-string v1, "createCardOrderTable end"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method private createCardProductInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 85
    const-string v0, "NFCDBHelper"

    const-string v1, "createCardProductInfosTable begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "CREATE TABLE card_product_info (product_id TEXT PRIMARY KEY NOT NULL,name TEXT,pic_url TEXT,description TEXT,card_type INTEGER,timestamp LONG,version TEXT,issuer_id TEXT,mkt_info TEXT,reserved_info TEXT,font_color TEXT,reserved_1 TEXT,reserved_2 TEXT,reserved_3 TEXT,reserved_4 TEXT,reserved_5 TEXT,reserved_6 TEXT);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 104
    const-string v0, "NFCDBHelper"

    const-string v1, "createCardProductInfosTable end"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void
.end method

.method private createIssuerInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 108
    const-string v0, "NFCDBHelper"

    const-string v1, "createCardProductInfosTable begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "CREATE TABLE issuer_info (issuer_id TEXT PRIMARY KEY NOT NULL,name TEXT,description TEXT,logo_url TEXT,issuer_type INTEGER,support_card_type INTEGER,mode INTEGER,wallet_version TEXT,contact_num TEXT,debit_callcenter_num TEXT,credit_call_center_num TEXT,debit_tcurl TEXT,credit_tcurl TEXT,debit_website_url TEXT,credit_website_url TEXT,app_info TEXT,timestamp LONG,sn INTEGER ,reserved_info TEXT, city_code TEXT, pay_type TEXT );"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 122
    const-string v0, "NFCDBHelper"

    const-string v1, "createIssuerInfosTable end"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return-void
.end method

.method private createRFConfInfoTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 158
    const-string v0, "NFCDBHelper"

    const-string v1, "createRFConfInfoTable begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "CREATE TABLE rf_conf_info (issuer_id TEXT PRIMARY KEY NOT NULL,model TEXT,rom_version TEXT,rf_conf_url TEXT,timestamp LONG);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 167
    const-string v0, "NFCDBHelper"

    const-string v1, "createRFConfInfoTable end"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    return-void
.end method

.method private createReportStatusInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 131
    const-string v0, "NFCDBHelper"

    const-string v1, "createReportCardInfosTable begin"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "CREATE TABLE report_status_info (aid TEXT PRIMARY KEY NOT NULL,user_id TEXT,status TEXT,extra INTEGER,dpanid TEXT,card_name TEXT,card_number TEXT,issuserid TEXT,card_type INTEGER);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 139
    const-string v0, "NFCDBHelper"

    const-string v1, "createReportCardInfosTable end"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return-void
.end method

.method private isExistField(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 430
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    const-string v0, "name = \'"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' AND sql LIKE \'%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    const/4 v9, 0x0

    .line 435
    move-object v0, p1

    const-string v1, "sqlite_master"

    :try_start_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 436
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 444
    :goto_0
    if-eqz v9, :cond_1

    .line 446
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 436
    :cond_1
    return v10

    .line 438
    :catch_0
    move-exception v10

    .line 440
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DB does not contain file : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 444
    if-eqz v9, :cond_3

    .line 446
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 444
    :catchall_0
    move-exception v11

    if-eqz v9, :cond_2

    .line 446
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 448
    :cond_2
    throw v11

    .line 449
    :cond_3
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private updateDBToVer24IssueInfo(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 411
    const-string v0, "NFCDBHelper updateDBToVer24IssueInfo"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 412
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 413
    const-string v1, "DROP TABLE IF EXISTS issuer_info"

    .line 414
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 415
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createIssuerInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 416
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 417
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 418
    const-string v0, "NFCDBHelper updateDBToVer24IssueInfo end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method private upgradeDBToVer16(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 258
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 259
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createCardProductInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 260
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createIssuerInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 262
    const-string v0, "drop table user_card_info;"

    .line 263
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 264
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 265
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 266
    return-void
.end method

.method private upgradeDBToVer17(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 275
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 276
    const-string v0, "alter table report_status_info add extra INTEGER"

    .line 278
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 279
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 280
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 281
    return-void
.end method

.method private upgradeDBToVer18(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 290
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 291
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createCardOrderTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 292
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 293
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 294
    return-void
.end method

.method private upgradeDBToVer19(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 303
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 304
    const-string v0, "alter table report_status_info add dpanid TEXT"

    .line 306
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 307
    const-string v0, "alter table report_status_info add card_name TEXT"

    .line 309
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 310
    const-string v0, "alter table report_status_info add card_number TEXT"

    .line 312
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 313
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 314
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 315
    return-void
.end method

.method private upgradeDBToVer20(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 324
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 325
    const-string v0, "drop table issuer_info"

    .line 326
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 327
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createIssuerInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 329
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 330
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 331
    return-void
.end method

.method private upgradeDBToVer21(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 340
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 341
    const-string v0, "alter table report_status_info add issuserid TEXT"

    .line 343
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 344
    const-string v0, "alter table report_status_info add card_type INTEGER"

    .line 346
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 347
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 348
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 349
    return-void
.end method

.method private upgradeDBToVer22(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 358
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 359
    const-string v0, "alter table issuer_info add sn INTEGER"

    .line 361
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 362
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 363
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 364
    return-void
.end method

.method private upgradeDBToVer23(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    .line 373
    const-string v0, "NFCDBHelper"

    const-string v1, " enter upgradeDBToVer23"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    const-string v0, "card_product_info"

    const-string v1, "font_color"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->isExistField(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 376
    const-string v0, "NFCDBHelper"

    const-string v1, " upgradeDBToVer23 begin "

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 378
    const-string v2, "alter table card_product_info add font_color TEXT"

    .line 380
    invoke-virtual {p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 381
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 382
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 389
    :cond_0
    const-string v0, "NFCDBHelper"

    const-string v1, " upgradeDBToVer23 end "

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    return-void
.end method

.method private upgradeDBToVer24(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 398
    const-string v0, "NFCDBHelper upgradeDBToVer24"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 399
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 400
    const-string v1, "DROP TABLE IF EXISTS card_product_info"

    .line 401
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 402
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createCardProductInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 403
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 404
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 405
    const-string v0, "NFCDBHelper upgradeDBToVer24 end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 407
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->updateDBToVer24IssueInfo(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 408
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 63
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createCardProductInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createIssuerInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createReportStatusInfosTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createCardOrderTable(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->createRFConfInfoTable(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 80
    goto :goto_0

    .line 76
    :catch_0
    move-exception v3

    .line 77
    const-string v0, "NFCDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SQLException e \uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    goto :goto_0

    .line 78
    :catch_1
    move-exception v3

    .line 79
    const-string v0, "NFCDBHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception e : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :goto_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2

    .line 176
    const-string v0, "NFCDBHelper onUpgrade."

    :try_start_0
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 178
    const/16 v0, 0x10

    if-ge p2, v0, :cond_0

    .line 180
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer16(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 183
    :cond_0
    const/16 v0, 0x11

    if-ge p2, v0, :cond_1

    .line 185
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer17(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 188
    :cond_1
    const/16 v0, 0x12

    if-ge p2, v0, :cond_2

    .line 190
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer18(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 193
    :cond_2
    const/16 v0, 0x13

    if-ge p2, v0, :cond_3

    .line 195
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer19(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 198
    :cond_3
    const/16 v0, 0x14

    if-ge p2, v0, :cond_4

    .line 200
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer20(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 203
    :cond_4
    const/16 v0, 0x15

    if-ge p2, v0, :cond_5

    .line 205
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer21(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 207
    :cond_5
    const/16 v0, 0x16

    if-ge p2, v0, :cond_6

    .line 209
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer22(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 212
    :cond_6
    const/16 v0, 0x17

    if-ge p2, v0, :cond_7

    .line 213
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer23(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 216
    :cond_7
    const/16 v0, 0x18

    if-ge p2, v0, :cond_8

    .line 217
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;->upgradeDBToVer24(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 223
    :cond_8
    goto :goto_0

    .line 219
    :catch_0
    move-exception v1

    .line 220
    const-string v0, "OnUpgrade : Update db failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 223
    goto :goto_0

    .line 221
    :catch_1
    move-exception v1

    .line 222
    const-string v0, "OnUpgrade : Exception Update db failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 225
    :goto_0
    return-void
.end method
