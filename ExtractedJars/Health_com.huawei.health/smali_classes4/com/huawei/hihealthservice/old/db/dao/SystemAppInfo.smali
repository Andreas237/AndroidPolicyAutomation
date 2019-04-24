.class public Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_appId:Ljava/lang/String; = "appId"

.field private static final Column_authorization:Ljava/lang/String; = "authorization"

.field private static final Column_createTime:Ljava/lang/String; = "createTime"

.field private static final Column_defaultAuthority:Ljava/lang/String; = "defaultAuthority"

.field private static final Column_iconUrl:Ljava/lang/String; = "iconUrl"

.field private static final Column_lastModifyVersion:Ljava/lang/String; = "lastModifyVersion"

.field private static final Column_nameBundle:Ljava/lang/String; = "nameBundle"

.field private static final Column_packageName:Ljava/lang/String; = "packageName"

.field private static final Column_systemRating:Ljava/lang/String; = "systemRating"

.field private static final Column_type:Ljava/lang/String; = "type"

.field private static final Column_verifyCode:Ljava/lang/String; = "verifyCode"

.field private static final LOG_TAG:Ljava/lang/String; = "Debug_DB_SystemAppInfo"

.field private static final TABLE_NAME:Ljava/lang/String; = "system_app_info"

.field private static final columns:[Ljava/lang/String;

.field public static final createTableSQL:Ljava/lang/String;

.field public static final deletTableSQL:Ljava/lang/String; = "DROP TABLE  IF EXISTS  system_app_info"


# instance fields
.field private mContext:Landroid/content/Context;

.field private writableDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 58
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "appId"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "packageName"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "type"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "authorization"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "systemRating"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "createTime"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "lastModifyVersion"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "iconUrl"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "nameBundle"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "defaultAuthority"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "verifyCode"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->columns:[Ljava/lang/String;

    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    const-string v0, "create table  IF NOT EXISTS system_app_info("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    const-string v0, "appId integer primary key not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    const-string v0, "authorization varchar(100),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    const-string v0, "createTime integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    const-string v0, "lastModifyVersion integer not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    const-string v0, "packageName varchar(100) not null,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    const-string v0, "nameBundle varchar(100),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    const-string v0, "iconUrl varchar(100),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    const-string v0, "systemRating integer,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    const-string v0, "type integer,"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    const-string v0, "defaultAuthority varchar(100),"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    const-string v0, "verifyCode varchar(100)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->createTableSQL:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 361
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->mContext:Landroid/content/Context;

    .line 362
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->mContext:Landroid/content/Context;

    .line 363
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getInstance(Landroid/content/Context;)Lcom/huawei/hihealthservice/old/db/DataBaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/DataBaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 365
    return-void
.end method

.method private addLeft(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)J
    .locals 5

    .line 392
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addLeft(SystemAppInfoTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 394
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_app_info"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private desEncrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 504
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->desEncrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 499
    invoke-static {p0, p1}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getBoneAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 14

    .line 140
    const/4 v9, 0x0

    .line 141
    const/4 v10, 0x1

    .line 142
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 149
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 168
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v13, "9dc745a5f9f60b611ab03a19166ee505834026f4f4a971aa704094f2a2c0072d"

    .line 174
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v7, v12

    move-object v8, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method public static getCameraAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 14

    .line 195
    const/4 v9, 0x0

    .line 196
    const/4 v10, 0x1

    .line 198
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 203
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 210
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v13, "fac41ea711512ad971465bacb63d269cd2fc90c7ff5c37d043d3fdd89a9e6009"

    .line 215
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v7, v12

    move-object v8, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method private getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)Landroid/content/ContentValues;
    .locals 2

    .line 475
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->getKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 476
    invoke-static {p1, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getContentValuesInit(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    return-object v0
.end method

.method private static getContentValuesInit(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 4

    .line 481
    new-instance v3, Landroid/content/ContentValues;

    const/16 v0, 0xb

    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(I)V

    .line 482
    const-string v0, "appId"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAppId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 483
    const-string v0, "authorization"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAuthority()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 485
    const-string v0, "lastModifyVersion"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getLastModifyVersion()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 486
    const-string v0, "packageName"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    const-string v0, "systemRating"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getSystemRating()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 488
    const-string v0, "type"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 489
    const-string v0, "iconUrl"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    const-string v0, "nameBundle"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getNameBundle()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    const-string v0, "defaultAuthority"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getDefaultAuthority()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    const-string v0, "verifyCode"

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getVerifyCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    return-object v3
.end method

.method public static getGalleryAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 14

    .line 229
    const/4 v9, 0x0

    .line 230
    const/4 v10, 0x1

    .line 232
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 237
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 244
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    const-string v13, "3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b"

    .line 249
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v7, v12

    move-object v8, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method private static getHealthAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 13

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x1

    .line 115
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 116
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 121
    const-string v0, "default"

    const-string v1, "Health"

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v6, v12

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method private static getIntelligentAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 14

    .line 266
    const/4 v9, 0x0

    .line 267
    const/4 v10, 0x1

    .line 269
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 274
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 282
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v13, "3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b"

    .line 288
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v7, v12

    move-object v8, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method public static getKeyguardAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 14

    .line 303
    const/4 v9, 0x0

    .line 304
    const/4 v10, 0x1

    .line 306
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 311
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 318
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    const-string v13, "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"

    .line 323
    move v0, p0

    move-object v1, v11

    move-object v3, p1

    move v4, v9

    move v5, v10

    move-object v7, v12

    move-object v8, v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method private getLeft(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 12

    .line 418
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLeft(int appid)  appid= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const-string v8, "appId=?"

    .line 420
    const/4 v0, 0x1

    new-array v9, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 421
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_app_info"

    sget-object v2, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->columns:[Ljava/lang/String;

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 423
    invoke-direct {p0, v10}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSystemAppInfoTables(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v11

    .line 424
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 426
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 428
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    return-object v0
.end method

.method private declared-synchronized getSync(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 4

    monitor-enter p0

    .line 412
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get(int appid)  appid= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getLeft(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static getSystemAppInfoTable(ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap;Ljava/util/HashMap;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/lang/String;Ljava/lang/String;IILjava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;"
        }
    .end annotation

    .line 337
    new-instance v2, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    invoke-direct {v2}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;-><init>()V

    .line 338
    invoke-virtual {v2, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAppId(I)V

    .line 339
    invoke-virtual {v2, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAuthority(Ljava/util/HashMap;)V

    .line 340
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setCreateTime(J)V

    .line 341
    invoke-virtual {v2, p2}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setIconUrl(Ljava/lang/String;)V

    .line 343
    invoke-virtual {v2, p3}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setPackageName(Ljava/lang/String;)V

    .line 344
    invoke-virtual {v2, p4}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setSystemRating(I)V

    .line 345
    invoke-virtual {v2, p5}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setType(I)V

    .line 346
    invoke-virtual {v2, p6}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setNameBundle(Ljava/util/HashMap;)V

    .line 347
    invoke-virtual {v2, p7}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setDefaultAuthority(Ljava/util/HashMap;)V

    .line 348
    invoke-virtual {v2, p8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setVerifyCode(Ljava/lang/String;)V

    .line 349
    return-object v2
.end method

.method private getSystemAppInfoTables(Landroid/database/Cursor;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;>;"
        }
    .end annotation

    .line 433
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 435
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cursor query == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const/4 v0, 0x0

    return-object v0

    .line 438
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 439
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 444
    new-instance v5, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    invoke-direct {v5}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;-><init>()V

    .line 445
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAppId(I)V

    .line 446
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setPackageName(Ljava/lang/String;)V

    .line 447
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setType(I)V

    .line 449
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$1;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$1;-><init>(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;)V

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 451
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/HashMap;

    .line 452
    invoke-virtual {v5, v7}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setAuthority(Ljava/util/HashMap;)V

    .line 453
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setSystemRating(I)V

    .line 454
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setCreateTime(J)V

    .line 455
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setLastModifyVersion(J)V

    .line 456
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setIconUrl(Ljava/lang/String;)V

    .line 458
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$2;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$2;-><init>(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;)V

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 459
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/HashMap;

    .line 460
    invoke-virtual {v5, v8}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setNameBundle(Ljava/util/HashMap;)V

    .line 462
    new-instance v0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$3;

    invoke-direct {v0, p0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$3;-><init>(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;)V

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo$3;->getType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 463
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/HashMap;

    .line 464
    invoke-virtual {v5, v9}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setDefaultAuthority(Ljava/util/HashMap;)V

    .line 465
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->desEncrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->setVerifyCode(Ljava/lang/String;)V

    .line 467
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    goto/16 :goto_0

    .line 469
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 470
    return-object v4
.end method

.method public static initTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 6

    .line 86
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->initSecretKeyS(Landroid/content/Context;)V

    .line 89
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 91
    const-string v0, "com.huawei.health"

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getHealthAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    const-string v0, "com.huawei.bone"

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getBoneAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    const-string v0, "com.huawei.intelligent"

    const/4 v1, 0x3

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getIntelligentAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    const-string v0, "com.huawei.camera"

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getCameraAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    const-string v0, "com.android.gallery3d"

    const/4 v1, 0x5

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getGalleryAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    const-string v0, "com.android.keyguard"

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getKeyguardAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    const-string v0, "com.android.systemui"

    const/4 v1, 0x6

    invoke-static {v1, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getKeyguardAppInfoTable(ILjava/lang/String;)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 103
    const-string v0, "system_app_info"

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    invoke-static {v1, p2}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getContentValuesInit(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 100
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 106
    :cond_0
    return-void
.end method

.method public static insertAppInfoTable(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V
    .locals 3

    .line 187
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 188
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->initSecretKeyS(Landroid/content/Context;)V

    .line 189
    const-string v0, "system_app_info"

    invoke-static {p3, p2}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getContentValuesInit(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 190
    return-void
.end method

.method private declared-synchronized saveSync(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V
    .locals 3

    monitor-enter p0

    .line 373
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAppId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getLeft(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v2

    .line 374
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 376
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->addLeft(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)J

    goto :goto_0

    .line 380
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->update(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 382
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private update(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)I
    .locals 7

    .line 399
    const-string v0, "Debug_DB_SystemAppInfo"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update(SystemAppInfoTable t)  t= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getContentValues(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)Landroid/content/ContentValues;

    move-result-object v4

    .line 401
    const-string v5, "appId=?"

    .line 402
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->getAppId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 403
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->writableDatabase:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "system_app_info"

    invoke-virtual {v0, v1, v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public get(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
    .locals 1

    .line 407
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->getSync(I)Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;

    move-result-object v0

    return-object v0
.end method

.method public save(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V
    .locals 0

    .line 368
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfo;->saveSync(Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;)V

    .line 369
    return-void
.end method
