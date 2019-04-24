.class public Lcom/huawei/hihealthservice/old/db/DataBaseHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/db/DataBaseHelper$Instance;
    }
.end annotation


# static fields
.field public static final DATABASE_NAME:Ljava/lang/String; = "health_cloud.db"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_DataBaseHelper"

.field public static final VERSION:I = 0xf

.field private static mContext:Landroid/content/Context; = null

.field private static final obj:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->obj:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 61
    const-string v0, "health_cloud.db"

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 62
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/huawei/hihealthservice/old/db/DataBaseHelper$1;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000()Landroid/content/Context;
    .locals 1

    .line 46
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;
    .locals 1

    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    .line 76
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper$Instance;->helper:Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    return-object v0
.end method

.method private initSystemAppInfo(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 269
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getAesCbcKey(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;

    move-result-object v1

    .line 270
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->initTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 271
    return-void
.end method

.method private newVerSion2to3(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 297
    sget-object v0, Lcom/huawei/hihealthservice/old/db/dao/LogTempBase;->createTableSQL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 298
    return-void
.end method

.method private newVerSion3to4(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 289
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 290
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getTableName()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/threetofour/EncryptSwitchUtil;->newVerSion3to4(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)V

    .line 291
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 292
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVerSion3to4  time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    return-void
.end method

.method private newVerSion4to5(ILandroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 276
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 277
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 279
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getTableName()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p2, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->newVerSion4to5(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)V

    .line 281
    :cond_0
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchSystemAppInfo;->encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 282
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchAppInfo;->encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 283
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 284
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVerSion4to5  time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    return-void
.end method

.method private newVersion10to11(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 220
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getAesCbcKey(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;

    move-result-object v3

    .line 222
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.camera"

    .line 225
    const/4 v2, 0x4

    invoke-static {v2, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getCameraAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v1

    .line 222
    invoke-static {v0, p1, v3, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->insertAppInfoTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V

    .line 226
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    const-string v1, "com.android.gallery3d"

    const/4 v2, 0x5

    invoke-static {v2, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getGalleryAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v1

    invoke-static {v0, p1, v3, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->insertAppInfoTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V

    .line 227
    return-void
.end method

.method private newVersion11to12(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 211
    const-string v0, "upgradeappversion"

    const-string v1, "0"

    .line 212
    invoke-static {v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInitSysProData(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v2

    .line 214
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v3

    .line 215
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 216
    return-void
.end method

.method private newVersion13to14(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 200
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getAesCbcKey(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;

    move-result-object v3

    .line 201
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    const-string v1, "com.android.keyguard"

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getKeyguardAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v1

    invoke-static {v0, p1, v3, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->insertAppInfoTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V

    .line 202
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    const-string v1, "com.android.systemui"

    const/4 v2, 0x6

    invoke-static {v2, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getKeyguardAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v1

    invoke-static {v0, p1, v3, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->insertAppInfoTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V

    .line 203
    return-void
.end method

.method private newVersion1to2(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5

    .line 302
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getTableName()Ljava/util/List;

    move-result-object v2

    .line 303
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 305
    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 307
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 308
    const-string v0, "android_metadata"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "sqlite_sequence"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "drop table \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 305
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 314
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 315
    return-void
.end method

.method private newVersion6to7(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8

    .line 255
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 256
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getTableName()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hihealthservice/old/db/upgrade/fourtofive/EncryptSwitchUtilFourToFive;->newVerSion4to5(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)V

    .line 258
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/sixtoseven/EncryptSwitchAppInfoSixToSeven;->encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 259
    const-string v0, "DROP TABLE  IF EXISTS  system_app_info"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 260
    sget-object v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->createTableSQL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 261
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->initSystemAppInfo(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 262
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->initVerify(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 263
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 264
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newVersion6to7  time= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v6, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-void
.end method

.method private newVersion7to8(ILandroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 241
    const/4 v0, 0x7

    if-ne v0, p1, :cond_0

    .line 243
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getInItAnroidIdTable(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;

    move-result-object v2

    .line 244
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 246
    invoke-static {v2}, Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyData;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemPropertyDataTable;)Landroid/content/ContentValues;

    move-result-object v3

    .line 247
    const-string v0, "system_property_data"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 250
    :cond_0
    return-void
.end method

.method private newVersion8to9(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 236
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/eighttonine/InfoDeviceEightToNine;->encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 237
    return-void
.end method

.method private newVersion9to10(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 231
    sget-object v0, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/huawei/hihealthservice/old/db/upgrade/ninetoten/InfoDeviceNineToTen;->encryptSwitch(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    .line 232
    return-void
.end method


# virtual methods
.method public getTableName()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 169
    sget-object v4, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->obj:Ljava/lang/Object;

    monitor-enter v4

    .line 170
    const/4 v5, 0x0

    .line 171
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 172
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v7

    .line 174
    const-string v0, "select name from sqlite_master where type=\'table\' order by name"

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v7, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 175
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 176
    move-object v8, v6

    .line 187
    if-eqz v5, :cond_0

    .line 188
    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    monitor-exit v4

    .line 176
    return-object v8

    .line 179
    :cond_1
    :goto_0
    :try_start_3
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 181
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 182
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 183
    goto :goto_0

    .line 187
    :cond_2
    if-eqz v5, :cond_4

    .line 188
    :try_start_4
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 184
    :catch_0
    move-exception v8

    .line 185
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x2

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SQLException is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 187
    if-eqz v5, :cond_4

    .line 188
    :try_start_6
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    .line 187
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_3

    .line 188
    :try_start_7
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 190
    :cond_3
    throw v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 191
    :cond_4
    :goto_1
    monitor-exit v4

    return-object v6

    .line 192
    :catchall_1
    move-exception v10

    monitor-exit v4

    throw v10
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 83
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 9

    .line 88
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,newVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 90
    move v6, p2

    .line 91
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 93
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion1to2(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 95
    return-void

    .line 98
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 100
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVerSion2to3(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 101
    const/4 p2, 0x3

    .line 104
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p2, :cond_2

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVerSion3to4(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 107
    const/4 p2, 0x4

    .line 110
    :cond_2
    const/4 v0, 0x4

    if-ne v0, p2, :cond_3

    .line 112
    invoke-direct {p0, v6, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVerSion4to5(ILandroid/database/sqlite/SQLiteDatabase;)V

    .line 113
    const/4 p2, 0x5

    .line 116
    :cond_3
    const/4 v0, 0x5

    if-ne v0, p2, :cond_4

    .line 118
    const/4 p2, 0x6

    .line 121
    :cond_4
    const/4 v0, 0x6

    if-ne v0, p2, :cond_5

    .line 123
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion6to7(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 124
    const/4 p2, 0x7

    .line 127
    :cond_5
    const/4 v0, 0x7

    if-ne v0, p2, :cond_6

    .line 129
    invoke-direct {p0, v6, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion7to8(ILandroid/database/sqlite/SQLiteDatabase;)V

    .line 130
    const/16 p2, 0x8

    .line 133
    :cond_6
    const/16 v0, 0x8

    if-ne v0, p2, :cond_7

    .line 135
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion8to9(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 136
    const/16 p2, 0x9

    .line 138
    :cond_7
    const/16 v0, 0x9

    if-ne v0, p2, :cond_8

    .line 140
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion9to10(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 141
    const/16 p2, 0xa

    .line 143
    :cond_8
    const/16 v0, 0xa

    if-ne v0, p2, :cond_9

    .line 145
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion10to11(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 146
    const/16 p2, 0xb

    .line 148
    :cond_9
    const/16 v0, 0xb

    if-ne v0, p2, :cond_a

    .line 150
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion11to12(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 151
    const/16 p2, 0xc

    .line 154
    :cond_a
    const/16 v0, 0xc

    if-ne v0, p2, :cond_b

    .line 156
    const/16 p2, 0xd

    .line 158
    :cond_b
    const/16 v0, 0xd

    if-ne v0, p2, :cond_c

    .line 160
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->newVersion13to14(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 161
    const/16 p2, 0xe

    .line 163
    :cond_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v7, v0, v4

    .line 164
    const-string v0, "Debug_DB_DataBaseHelper"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade end  oldVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,newVersion = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void
.end method
