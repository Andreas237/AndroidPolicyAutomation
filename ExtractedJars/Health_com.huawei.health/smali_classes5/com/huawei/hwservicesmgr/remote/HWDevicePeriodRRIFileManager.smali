.class public Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static final Column_Device_ID:Ljava/lang/String; = "Device_ID"

.field private static final Column_ID:Ljava/lang/String; = "_id"

.field private static final Column_Time_Stamp:Ljava/lang/String; = "Time_Stamp"

.field private static final MAX_RRI:I = 0x7d0

.field private static final TAG:Ljava/lang/String; = "HWDevicePeriodRRIFileManager"

.field private static final TableID:Ljava/lang/String; = "HWDevicePeriodRRIFileManager"

.field private static mInstance:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager; = null


# instance fields
.field private isRunning:Z

.field private lock:Ljava/lang/Object;

.field private mCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private newestDirtyStartTime:J

.field private periodFileCallBack:Lo/djv$d;

.field service:Ljava/util/concurrent/ExecutorService;

.field private uploadLastTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 56
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 79
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->lock:Ljava/lang/Object;

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isRunning:Z

    .line 62
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->newestDirtyStartTime:J

    .line 64
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->service:Ljava/util/concurrent/ExecutorService;

    .line 85
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->periodFileCallBack:Lo/djv$d;

    .line 80
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mContext:Landroid/content/Context;

    .line 81
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->createDBTable()V

    .line 82
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getMaxTime(Lcom/huawei/datatype/PeriodRRIEntity;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Lcom/huawei/datatype/PeriodRRIEntity;)Z
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->checkData(Lcom/huawei/datatype/PeriodRRIEntity;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->nullErrorSync(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Lo/djv$d;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->periodFileCallBack:Lo/djv$d;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    return-wide v0
.end method

.method static synthetic access$202(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)J
    .locals 0

    .line 53
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    return-wide p1
.end method

.method static synthetic access$300(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->newestDirtyStartTime:J

    return-wide v0
.end method

.method static synthetic access$400(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->setLastTimeStamp(J)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z
    .locals 1

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->onRespose(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J
    .locals 2

    .line 53
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getLastTimeStamp()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$700(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Z
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isAlreadyDoPressureAdjust()Z

    move-result v0

    return v0
.end method

.method static synthetic access$800(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)[I
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getLastSyncTimeAndNowTime()[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)Landroid/content/Context;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private checkData(Lcom/huawei/datatype/PeriodRRIEntity;)Z
    .locals 10

    .line 302
    const/4 v4, 0x1

    .line 303
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 304
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v5

    .line 305
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 306
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 307
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    .line 308
    invoke-direct {p0, v8}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isDirtyData(Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;)Z

    move-result v9

    .line 309
    if-eqz v9, :cond_1

    .line 310
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ready remove dirtyData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    invoke-virtual {v8}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->newestDirtyStartTime:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {v8}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v0

    goto :goto_1

    :cond_0
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->newestDirtyStartTime:J

    :goto_1
    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->newestDirtyStartTime:J

    goto :goto_2

    .line 313
    :cond_1
    const/4 v4, 0x0

    .line 315
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    :goto_2
    goto :goto_0

    :cond_2
    goto :goto_3

    .line 319
    :cond_3
    const/4 v4, 0x0

    .line 320
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entity has no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :goto_3
    invoke-virtual {p1, v6}, Lcom/huawei/datatype/PeriodRRIEntity;->configRriDataList(Ljava/util/List;)V

    .line 323
    goto :goto_4

    .line 324
    :cond_4
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == entity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    const/4 v4, 0x0

    .line 327
    :goto_4
    return v4
.end method

.method private createDBTable()V
    .locals 3

    .line 515
    const-string v2, "HWDevicePeriodRRIFileManager"

    .line 516
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getCreateSQLCmd()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v2, v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 517
    return-void
.end method

.method private finishSync()V
    .locals 1

    .line 382
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isRunning:Z

    .line 383
    return-void
.end method

.method private getAndFillDataTable(Landroid/database/Cursor;)J
    .locals 2

    .line 502
    const-string v0, "Time_Stamp"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private getContentValues(JLjava/lang/String;)Landroid/content/ContentValues;
    .locals 3

    .line 506
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 508
    const-string v0, "Device_ID"

    invoke-virtual {v2, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    const-string v0, "Time_Stamp"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 511
    return-object v2
.end method

.method private getCreateSQLCmd()Ljava/lang/String;
    .locals 2

    .line 520
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 521
    const-string v0, "_id integer primary key autoincrement,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 522
    const-string v0, "Device_ID NVARCHAR(300) not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 523
    const-string v0, "Time_Stamp integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 524
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getLastSyncTimeAndNowTime()[I
    .locals 6

    .line 272
    const/4 v0, 0x2

    new-array v4, v0, [I

    .line 273
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v5, v0

    .line 274
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getLastTimeStamp()J

    move-result-wide v0

    long-to-int v0, v0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 275
    const/4 v0, 0x1

    aput v5, v4, v0

    .line 276
    int-to-long v0, v5

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    .line 277
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lastSyncTime \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v4, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " now : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-object v4
.end method

.method private getLastTimeStamp()J
    .locals 9

    .line 457
    const-wide/16 v4, 0x0

    .line 459
    const-string v7, "HWDevicePeriodRRIFileManager"

    .line 460
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device_ID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Device_ID"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 462
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 461
    const/4 v1, 0x1

    invoke-virtual {p0, v7, v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 463
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 464
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get lastTimeStamp query error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    return-wide v4

    .line 467
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 468
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastTimeStamp moveToNext() is not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    invoke-direct {p0, v6}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getAndFillDataTable(Landroid/database/Cursor;)J

    move-result-wide v4

    .line 471
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 472
    const-string v0, "HWDevicePeriodRRIFileManager"

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

    .line 473
    return-wide v4
.end method

.method private getMaxTime(Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 8

    .line 423
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v5

    .line 424
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 425
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    .line 426
    if-ltz v6, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lt v6, v0, :cond_1

    .line 427
    :cond_0
    return-void

    .line 429
    :cond_1
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    .line 431
    invoke-virtual {v7}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    .line 432
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Get data max time : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " last data time is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchStartTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    return-void

    .line 435
    :cond_2
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no rri data. update time by press time."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchPressDataList()Ljava/util/List;

    move-result-object v6

    .line 439
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 440
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v7, v0, -0x1

    .line 442
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_end_time()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    .line 443
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Get data max time : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->uploadLastTime:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " last data time is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_end_time()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    return-void

    .line 446
    :cond_3
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Data is wrong, upload time by app system time."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    return-void
.end method

.method public static declared-synchronized getmInstance()Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;
    .locals 4

    const-class v2, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    monitor-enter v2

    .line 72
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 73
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    .line 75
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private isAlreadyDoPressureAdjust()Z
    .locals 9

    .line 534
    const/4 v4, 0x5

    .line 535
    const/4 v0, 0x1

    new-array v5, v0, [Z

    .line 536
    new-instance v6, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 537
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v7

    .line 538
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$3;

    invoke-direct {v0, p0, v5, v6}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$3;-><init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;[ZLjava/util/concurrent/Semaphore;)V

    invoke-virtual {v7, v0}, Lo/dgx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 560
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v6, v1, v2, v0}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v8

    .line 561
    if-eqz v8, :cond_0

    .line 562
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore tryAcquire()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 564
    :cond_0
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "semaphore tryAcquire() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 568
    :goto_0
    goto :goto_1

    .line 566
    :catch_0
    move-exception v8

    .line 567
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    :goto_1
    const/4 v0, 0x0

    aget-boolean v0, v5, v0

    return v0
.end method

.method private isDirtyData(Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;)Z
    .locals 8

    .line 331
    const/4 v4, 0x0

    .line 332
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 333
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->fetchRriList()Ljava/util/List;

    move-result-object v5

    .line 334
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 335
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 336
    const/16 v0, 0x7d0

    if-le v7, v0, :cond_0

    .line 337
    const/4 v4, 0x1

    .line 338
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "This is dirty data : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    goto :goto_1

    .line 341
    :cond_0
    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    .line 343
    :cond_2
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "This data has no dirty data : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :goto_2
    goto :goto_3

    .line 346
    :cond_3
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataEntity == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    :goto_3
    return v4
.end method

.method private nullErrorSync(Ljava/lang/String;)V
    .locals 4

    .line 392
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-ne v2, p1, :cond_0

    const-string v2, "null exception"

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    const v0, 0x186a1

    invoke-direct {p0, v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->onRespose(ILjava/lang/Object;)Z

    .line 394
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 395
    return-void
.end method

.method private onRespose(ILjava/lang/Object;)Z
    .locals 9

    .line 398
    const/4 v4, 0x0

    .line 400
    iget-object v5, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->lock:Ljava/lang/Object;

    monitor-enter v5

    .line 401
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 403
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 404
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 405
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "return data to ui"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    invoke-interface {v7, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 407
    const/4 v4, 0x1

    goto :goto_1

    .line 409
    :cond_0
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse fail callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    :goto_1
    goto :goto_0

    :cond_1
    goto :goto_2

    .line 415
    :cond_2
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse fail mCallbacks == null or mCallbacks.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 417
    :goto_2
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 418
    :goto_3
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRespose isSuccess : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    return v4
.end method

.method private setLastTimeStamp(J)V
    .locals 8

    .line 482
    const-string v5, "HWDevicePeriodRRIFileManager"

    .line 483
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 484
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device_ID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v5, v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 485
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 486
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 488
    const-string v0, "Time_Stamp"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 489
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device_ID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v5, v1, v7, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    .line 490
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastTimeStamp update "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    goto :goto_0

    .line 492
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->getContentValues(JLjava/lang/String;)Landroid/content/ContentValues;

    move-result-object v7

    .line 493
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v0, v7}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 494
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLastTimeStamp new "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 498
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device_ID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v5, v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    .line 499
    return-void
.end method


# virtual methods
.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 355
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getPeriodRRIFileFromDevice()V
    .locals 5

    .line 196
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPeriodRRIFileFromDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isRunning:Z

    if-eqz v0, :cond_0

    .line 198
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sync Period RRI file..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    return-void

    .line 201
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->isRunning:Z

    .line 202
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 203
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 204
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == capability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->finishSync()V

    .line 206
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->onRespose(ILjava/lang/Object;)Z

    .line 207
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 208
    return-void

    .line 210
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v0

    if-nez v0, :cond_2

    .line 211
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->finishSync()V

    .line 212
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0d\u652f\u6301 5.32.9 -- \u7ee7\u7eed\u540c\u6b65\u5176\u5b83\u7684\u6570\u636e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const v0, 0x186a3

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->onRespose(ILjava/lang/Object;)Z

    .line 214
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 215
    return-void

    .line 217
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->service:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$2;-><init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 263
    return-void
.end method

.method public notifyOtherSyncTask()V
    .locals 5

    .line 286
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sending broadcast to notify other task. The action is  : ACTION_CORE_PERIOD_RRI_SYNC_COMPLETED : com.huawei.bone.action.CORE_PERIOD_RRI_SYNC_COMPLETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_PERIOD_RRI_SYNC_COMPLETED"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 288
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 289
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 290
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->finishSync()V

    .line 291
    return-void
.end method

.method public registerCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 364
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallback -- \u6ce8\u518c Period\u5468\u671f\u6587\u4ef6\u7684callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v4, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 366
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 368
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 370
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->mCallbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add callback success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 373
    :cond_0
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "add callback fail  callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    :cond_1
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 377
    :goto_1
    return-void
.end method

.method public unRegisterCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 389
    return-void
.end method
