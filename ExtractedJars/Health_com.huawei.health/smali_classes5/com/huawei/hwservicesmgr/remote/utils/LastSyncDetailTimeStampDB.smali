.class public Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Column_Device_ID:Ljava/lang/String; = "Device_ID"

.field private static final Column_ID:Ljava/lang/String; = "_id"

.field private static final Column_Time_Stamp:Ljava/lang/String; = "Time_Stamp"

.field private static INSTANCE:Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB; = null

.field private static final TAG:Ljava/lang/String; = "LastSyncDetailTimeStampDB"

.field public static final TableID:Ljava/lang/String; = "LastSyncDetailTimeStampDB"


# instance fields
.field private hwFitnessMgr:Lo/dez;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->INSTANCE:Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    return-void
.end method

.method private constructor <init>(Lo/dez;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    .line 50
    return-void
.end method

.method private getAndFillDataTable(Landroid/database/Cursor;)J
    .locals 2

    .line 72
    const-string v0, "Time_Stamp"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private getCreateSQLCmd()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 35
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 36
    const-string v0, "Device_ID NVARCHAR(300) not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    const-string v0, "Time_Stamp integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getCurrDataTableID()Ljava/lang/String;
    .locals 1

    .line 54
    const-string v0, "LastSyncDetailTimeStampDB"

    return-object v0
.end method

.method public static declared-synchronized getInstance()Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;
    .locals 4

    const-class v2, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    monitor-enter v2

    .line 42
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->INSTANCE:Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 43
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;-><init>(Lo/dez;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->INSTANCE:Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    .line 45
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->INSTANCE:Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public createDBTable()V
    .locals 4

    .line 58
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getCurrDataTableID()Ljava/lang/String;

    move-result-object v3

    .line 59
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getCreateSQLCmd()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v2, v1}, Lo/dez;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 60
    return-void
.end method

.method public getContentValues(JLjava/lang/String;)Landroid/content/ContentValues;
    .locals 3

    .line 63
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 65
    const-string v0, "Device_ID"

    invoke-virtual {v2, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "Time_Stamp"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 68
    return-object v2
.end method

.method public getLastTimeStamp(Ljava/lang/String;)J
    .locals 9

    .line 76
    const-wide/16 v4, 0x0

    .line 78
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getCurrDataTableID()Ljava/lang/String;

    move-result-object v7

    .line 79
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 80
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device_ID=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v7, v2, v1}, Lo/dez;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 81
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 82
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get lastTimeStamp query error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-wide v4

    .line 85
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTimeStamp moveToNext() is not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-direct {p0, v6}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getAndFillDataTable(Landroid/database/Cursor;)J

    move-result-wide v4

    .line 89
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 90
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLastTimeStamp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-wide v4
.end method

.method public setLastTimeStamp(JLjava/lang/String;)V
    .locals 8

    .line 108
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getCurrDataTableID()Ljava/lang/String;

    move-result-object v5

    .line 109
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 110
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device_ID=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v2, v1}, Lo/dez;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 111
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 112
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 114
    const-string v0, "Time_Stamp"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device_ID=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v2, v7, v1}, Lo/dez;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    .line 116
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastTimeStamp update "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    goto :goto_0

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getContentValues(JLjava/lang/String;)Landroid/content/ContentValues;

    move-result-object v7

    .line 119
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    const/4 v1, 0x1

    invoke-virtual {v0, v5, v1, v7}, Lo/dez;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 120
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastTimeStamp new "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 124
    :cond_1
    return-void
.end method

.method public updateDetailLastTime(Ljava/lang/String;)V
    .locals 6

    .line 95
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    invoke-virtual {v0}, Lo/dez;->l()J

    move-result-wide v4

    .line 96
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    .line 97
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastDetailSyncTime == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->hwFitnessMgr:Lo/dez;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dez;->d(J)V

    .line 101
    const-string v0, "LastSyncDetailTimeStampDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastDetailSyncTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->createDBTable()V

    .line 103
    invoke-virtual {p0, v4, v5, p1}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->setLastTimeStamp(JLjava/lang/String;)V

    .line 104
    return-void
.end method
