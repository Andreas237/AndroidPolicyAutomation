.class public Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;
    }
.end annotation


# static fields
.field public static final LOG_BT_DEBUG:I = 0x4

.field public static final LOG_LEVEL_ALL:I = 0x0

.field public static final LOG_LEVEL_DEBUG:I = 0x2

.field public static final LOG_LEVEL_DUMP:I = 0x3

.field public static final LOG_LEVEL_EVENT:I = 0x1

.field public static final LOG_MCU_DEBUG:I = 0x5

.field public static final LOG_PATH:Ljava/lang/String;

.field public static final LOG_PATH_TEMP:Ljava/lang/String;

.field private static final MAC_ENERY_LENGTH:I = 0x18

.field private static final MAC_LENGTH:I = 0xc

.field private static final MAINT_KEY_CHECK_TIME:Ljava/lang/String; = "MAINT_KEY_CHECK_TIME"

.field private static final MAINT_KEY_RESULT:Ljava/lang/String; = "MAINT_KEY_RESULT"

.field private static final MAINT_KEY_RETRY_TIME:Ljava/lang/String; = "MAINT_KEY_RETRY_TIME"

.field private static final MAX_DATA_SIZE:I = 0x30d40

.field private static final RETRYTIME:I = 0xc8

.field private static final TAG:Ljava/lang/String; = "MaintenanceUtil"

.field private static instance:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil; = null


# instance fields
.field private buff:Ljava/nio/ByteBuffer;

.field private catchLogs:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<[B>;"
        }
    .end annotation
.end field

.field private dataSize:J

.field private deviceMac:Ljava/lang/String;

.field private deviceType:I

.field private deviceVersion:Ljava/lang/String;

.field executor:Ljava/util/concurrent/Executor;

.field private fc:Ljava/nio/channels/FileChannel;

.field private fileName:Ljava/lang/String;

.field private fileOutputStream:Ljava/io/FileOutputStream;

.field private isWrite:Z

.field private logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

.field private mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mDate:Ljava/util/Date;

.field final maintLogs2:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private queLogs:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<[B>;"
        }
    .end annotation
.end field

.field private tmpDate:Ljava/util/Date;

.field private tmpFileName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/dhu;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MaintenanceLogTemp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/dhu;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MaintenanceLog"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->queLogs:Ljava/util/Queue;

    .line 63
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->catchLogs:Ljava/util/Queue;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    .line 78
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileName:Ljava/lang/String;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mDate:Ljava/util/Date;

    .line 80
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceType:I

    .line 81
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    .line 82
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->maintLogs2:Ljava/util/ArrayList;

    .line 86
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpFileName:Ljava/lang/String;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpDate:Ljava/util/Date;

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    .line 352
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->executor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/io/FileOutputStream;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->writeLog(Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    return v0
.end method

.method static synthetic access$202(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Z)Z
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    return p1
.end method

.method static synthetic access$300(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/channels/FileChannel;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    return-object p1
.end method

.method static synthetic access$400(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/util/Queue;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->queLogs:Ljava/util/Queue;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/nio/ByteBuffer;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->buff:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method static synthetic access$602(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->buff:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method static synthetic access$702(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;J)J
    .locals 0

    .line 46
    iput-wide p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    return-wide p1
.end method

.method static synthetic access$800(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/util/Date;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpDate:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpFileName:Ljava/lang/String;

    return-object v0
.end method

.method private getFileName()Ljava/lang/String;
    .locals 10

    .line 131
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceType:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getDeviceName(I)Ljava/lang/String;

    move-result-object v5

    .line 133
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getFileName()  deviceName "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+ deviceMac "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+ deviceVersion"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v6, 0x0

    .line 136
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    invoke-static {v0}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 138
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    .line 139
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 140
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 141
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc

    if-le v0, v1, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    invoke-static {v0}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 145
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 146
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 148
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    const-string v1, ":"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 150
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 151
    :cond_3
    const-string v0, "00.00.00"

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    .line 153
    :cond_4
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mDate:Ljava/util/Date;

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 155
    const/4 v9, 0x0

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_WearableBeta_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 168
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getFileName()  deviceVersion targetPath "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-object v9
.end method

.method public static getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;
    .locals 2

    .line 90
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 91
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-direct {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    .line 93
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    return-object v0
.end method

.method private getStorageFileList()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/io/File;>;"
        }
    .end annotation

    .line 336
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 337
    new-instance v5, Ljava/io/File;

    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 338
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    .line 339
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    array-length v0, v6

    if-nez v0, :cond_1

    .line 340
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 342
    :cond_1
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStorageFileList(), size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_3

    .line 344
    aget-object v0, v6, v7

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_2

    .line 345
    aget-object v0, v6, v7

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 347
    :cond_2
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getStorageFileList(), is error file = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v6, v7

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 350
    :cond_3
    return-object v4
.end method

.method private writeLog(Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Date;Ljava/util/ArrayList<[B>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 386
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    .line 387
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 388
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mDate:Ljava/util/Date;

    .line 391
    :cond_0
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " writeLogToFile(), maintLogs = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+file_name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p1, :cond_1

    const-string v3, "null"

    goto :goto_0

    :cond_1
    move-object v3, p1

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 393
    :cond_2
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",+file_name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    iput-object p3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileName:Ljava/lang/String;

    .line 395
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->initMaintenanceFile()V

    .line 398
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->queLogs:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 399
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->catchLogs:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    .line 401
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 402
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [B

    .line 404
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->catchLogs:Ljava/util/Queue;

    invoke-interface {v0, v5}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 401
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 406
    :cond_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 407
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->catchLogs:Ljava/util/Queue;

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->queLogs:Ljava/util/Queue;

    .line 410
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 411
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;-><init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    .line 412
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;->start()V

    goto :goto_2

    .line 414
    :cond_5
    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 415
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 416
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->logThread:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$LogThread;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 418
    :cond_6
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    :try_start_2
    throw v6
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 426
    :goto_2
    goto :goto_3

    .line 420
    :catch_0
    move-exception v4

    .line 421
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    goto :goto_3

    .line 422
    :catch_1
    move-exception v4

    .line 423
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IndexOutOfBoundsException: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    goto :goto_3

    .line 424
    :catch_2
    move-exception v4

    .line 425
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    :goto_3
    return-void
.end method


# virtual methods
.method public cutFolder(Ljava/lang/String;Ljava/lang/String;)V
    .locals 23

    .line 508
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cutFolder old "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " newPath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 510
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 511
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cutFolder old file is not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    return-void

    .line 515
    :cond_0
    new-instance v5, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 516
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 517
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v6

    .line 518
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "newFile.mkdirs result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", newFile path = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v6

    .line 523
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 524
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cutFolder old file list = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    return-void

    .line 528
    :cond_2
    const/4 v7, 0x0

    .line 529
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_d

    .line 530
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 531
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 534
    :cond_3
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 537
    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 538
    const/4 v9, 0x0

    .line 539
    const/4 v10, 0x0

    .line 541
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v9, v0

    .line 542
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v10, v0

    .line 543
    const/16 v0, 0x1400

    new-array v11, v0, [B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 546
    :goto_2
    :try_start_1
    invoke-virtual {v9, v11}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v12, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 547
    const/4 v0, 0x0

    invoke-virtual {v10, v11, v0, v12}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_2

    .line 549
    :cond_4
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 553
    :try_start_2
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    .line 554
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 555
    goto :goto_3

    .line 550
    :catch_0
    move-exception v13

    .line 551
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "copy crashLog failed"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 553
    :try_start_4
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    .line 554
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 555
    goto :goto_3

    .line 553
    :catchall_0
    move-exception v14

    :try_start_5
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    .line 554
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V

    .line 555
    throw v14
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 560
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v9, :cond_5

    .line 561
    :try_start_6
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 566
    :cond_5
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_4

    .line 563
    :catch_1
    move-exception v11

    .line 564
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 566
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_4

    .line 566
    :catchall_1
    move-exception v15

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    throw v15

    .line 570
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v10, :cond_6

    .line 571
    :try_start_8
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 576
    :cond_6
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_5

    .line 573
    :catch_2
    move-exception v11

    .line 574
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 576
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_5

    .line 576
    :catchall_2
    move-exception v16

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    throw v16

    .line 578
    :goto_5
    goto/16 :goto_a

    .line 556
    :catch_3
    move-exception v11

    .line 557
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_a
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 560
    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    .line 561
    :try_start_b
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 566
    :cond_7
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_6

    .line 563
    :catch_4
    move-exception v11

    .line 564
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_c
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 566
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_6

    .line 566
    :catchall_3
    move-exception v17

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    throw v17

    .line 570
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v10, :cond_8

    .line 571
    :try_start_d
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 576
    :cond_8
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_7

    .line 573
    :catch_5
    move-exception v11

    .line 574
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_e
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 576
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_7

    .line 576
    :catchall_4
    move-exception v18

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    throw v18

    .line 578
    :goto_7
    goto/16 :goto_a

    .line 559
    :catchall_5
    move-exception v19

    .line 560
    const/4 v0, 0x0

    if-eq v0, v9, :cond_9

    .line 561
    :try_start_f
    invoke-virtual {v9}, Ljava/io/FileInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 566
    :cond_9
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_8

    .line 563
    :catch_6
    move-exception v20

    .line 564
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_10
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v20 .. v20}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 566
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_8

    .line 566
    :catchall_6
    move-exception v21

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder input close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    throw v21

    .line 570
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v10, :cond_a

    .line 571
    :try_start_11
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 576
    :cond_a
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_9

    .line 573
    :catch_7
    move-exception v20

    .line 574
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x2

    :try_start_12
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v20 .. v20}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 576
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    goto :goto_9

    .line 576
    :catchall_7
    move-exception v22

    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copyFolder output close finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    throw v22

    .line 578
    :goto_9
    throw v19

    .line 579
    :goto_a
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v11

    .line 580
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFolder file name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", result = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    goto :goto_b

    :cond_b
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 582
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, v6, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 585
    :cond_c
    :goto_b
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v9

    .line 586
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteFolder file name = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", result = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 588
    :cond_d
    return-void
.end method

.method public deleteTenDayFile()V
    .locals 18

    .line 305
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getStorageFileList()Ljava/util/ArrayList;

    move-result-object v5

    .line 306
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 307
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteTenDayFile(), not have ten days log"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    return-void

    .line 310
    :cond_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 311
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 312
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteTenDayFile(), newDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    const-string v8, ""

    .line 314
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 315
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/io/File;

    .line 316
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    .line 317
    const-string v0, "_"

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 318
    array-length v0, v12

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    .line 319
    const/4 v0, 0x4

    aget-object v8, v12, v0

    .line 322
    :cond_1
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v8}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v13, v0, v2

    .line 323
    const-wide/32 v0, 0x5265c00

    div-long v15, v13, v0

    .line 324
    const-wide/16 v0, 0xa

    cmp-long v0, v15, v0

    if-lez v0, :cond_2

    .line 325
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteTenDayFile(), delete days = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, v15

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+file = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    move-result v17

    .line 327
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteTenDayFile isDelete"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    :cond_2
    goto :goto_1

    .line 329
    :catch_0
    move-exception v13

    .line 330
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteTenDayFile(), Exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 333
    :cond_3
    return-void
.end method

.method public filtertFile(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 7

    .line 97
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Enter filtertFile() logLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 121
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 122
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Enter filterEventFile()  fileList.get(l) "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const-string v0, "event"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "error"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "dump.log"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    :cond_0
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 127
    :cond_2
    return-object v4
.end method

.method public getDayDateTime()Ljava/lang/String;
    .locals 7

    .line 286
    const-string v0, "Utils"

    const-string v1, "getCurrentTime: strCurTime"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 294
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    .line 295
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 296
    const-string v0, "Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getCurrentTime: strCurTime = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 298
    :catch_0
    move-exception v4

    .line 299
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceName(I)Ljava/lang/String;
    .locals 1

    .line 211
    const-string v0, "HUAWEI WEAR"

    .line 213
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 215
    :pswitch_0
    const-string v0, "B0"

    .line 216
    goto :goto_1

    .line 218
    :pswitch_1
    const-string v0, "B2"

    .line 219
    goto :goto_1

    .line 221
    :pswitch_2
    const-string v0, "Gemini"

    .line 222
    goto :goto_1

    .line 224
    :pswitch_3
    const-string v0, "GRUS"

    .line 225
    goto :goto_1

    .line 227
    :pswitch_4
    const-string v0, "K1"

    .line 228
    goto :goto_1

    .line 230
    :pswitch_5
    const-string v0, "W1"

    .line 231
    goto :goto_1

    .line 233
    :pswitch_6
    const-string v0, "Metis"

    .line 234
    goto :goto_1

    .line 237
    :pswitch_7
    const-string v0, "NYX"

    .line 238
    goto :goto_1

    .line 240
    :pswitch_8
    const-string v0, "Eris"

    .line 241
    goto :goto_1

    .line 243
    :pswitch_9
    const-string v0, "Janus"

    .line 244
    goto :goto_1

    .line 246
    :pswitch_a
    const-string v0, "Leo"

    .line 247
    goto :goto_1

    .line 249
    :pswitch_b
    const-string v0, "Crius"

    .line 250
    goto :goto_1

    .line 252
    :pswitch_c
    const-string v0, "Terra"

    .line 253
    goto :goto_1

    .line 255
    :pswitch_d
    const-string v0, "Talos"

    .line 256
    goto :goto_1

    .line 258
    :pswitch_e
    const-string v0, "Fortuna"

    .line 259
    goto :goto_1

    .line 261
    :pswitch_f
    const-string v0, "AW70"

    .line 262
    goto :goto_1

    .line 264
    :pswitch_10
    const-string v0, "AW70"

    .line 265
    goto :goto_1

    .line 267
    :goto_0
    :pswitch_11
    const-string v0, "HUAWEI WEAR"

    .line 270
    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_11
        :pswitch_0
        :pswitch_11
        :pswitch_2
        :pswitch_6
        :pswitch_11
        :pswitch_a
        :pswitch_11
        :pswitch_11
        :pswitch_7
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_11
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_11
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method

.method public getMaintCheckTime()Ljava/lang/String;
    .locals 5

    .line 694
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_CHECK_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 696
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintCheckTime,maintCheckTime-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    return-object v4
.end method

.method public getMaintRetryNum()I
    .locals 5

    .line 740
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_RETRY_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 742
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintRetryTime,retry-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 743
    return v4

    .line 744
    :catch_0
    move-exception v4

    .line 745
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintRetryTime: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 746
    const/4 v0, 0x0

    return v0
.end method

.method public getMaintRetryResult()Z
    .locals 3

    .line 718
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_RESULT"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    .line 719
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 720
    const/4 v0, 0x1

    return v0

    .line 722
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getmTransferDataContentPath()Ljava/lang/String;
    .locals 1

    .line 765
    const/4 v0, 0x0

    return-object v0
.end method

.method public getmTransferStateContentPath()Ljava/lang/String;
    .locals 1

    .line 770
    const/4 v0, 0x0

    return-object v0
.end method

.method public initMaintenanceFile()V
    .locals 7

    .line 430
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 431
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMaintenanceFile isWrite"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->isWrite:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    if-eqz v0, :cond_1

    .line 437
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V

    .line 438
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    goto :goto_0

    .line 439
    :catch_0
    move-exception v4

    .line 440
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    :cond_1
    :goto_0
    :try_start_1
    new-instance v4, Ljava/io/File;

    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 448
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 449
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v5

    .line 450
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 451
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMaintenanceFile isMk"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    :cond_2
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getFileName()Ljava/lang/String;

    move-result-object v5

    .line 455
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 456
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 457
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    move-result v6

    .line 458
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 459
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMaintenanceFile isCreN"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    :cond_3
    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v1, 0x1

    invoke-direct {v0, v5, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    .line 464
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 479
    goto :goto_1

    .line 465
    :catch_1
    move-exception v4

    .line 466
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    :try_start_2
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    if-eqz v0, :cond_4

    .line 469
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V

    .line 471
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 472
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->valid()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_5

    .line 473
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 478
    :cond_5
    goto :goto_1

    .line 476
    :catch_2
    move-exception v5

    .line 477
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    :goto_1
    return-void
.end method

.method public initMaintenanceParame(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 274
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " initMaintenanceParame(), device"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+mac "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, p2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceType:I

    .line 276
    iput-object p3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceVersion:Ljava/lang/String;

    .line 277
    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->deviceMac:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public maintParametersCommand()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 5

    .line 750
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 751
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 752
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 754
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintenanceParameters  deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    return-object v4
.end method

.method public onDestroyMaintenance()V
    .locals 5

    .line 483
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestroyMaintenance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 490
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->valid()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 491
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fileOutputStream:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 496
    :cond_1
    goto :goto_0

    .line 494
    :catch_0
    move-exception v4

    .line 495
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->fc:Ljava/nio/channels/FileChannel;

    .line 498
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->maintLogs2:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 499
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    .line 500
    return-void
.end method

.method public save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 776
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save2File: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 778
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpDate:Ljava/util/Date;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 779
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 780
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "Failed"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 783
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    const-wide/32 v2, 0x30d40

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    if-eqz p2, :cond_3

    .line 785
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->executor:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 786
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->executor:Ljava/util/concurrent/Executor;

    .line 788
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->executor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;

    invoke-direct {v1, p0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;-><init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 795
    :cond_3
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 796
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 800
    :cond_4
    :goto_0
    return-void
.end method

.method public setMaintCheckTime(Ljava/lang/String;)V
    .locals 5

    .line 684
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setMaintCheckTime,time-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 689
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_CHECK_TIME"

    invoke-static {v0, v1, v2, p1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 691
    return-void
.end method

.method public setMaintRetryNum(I)V
    .locals 5

    .line 729
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setMaintRetryTime,retry-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 734
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_RETRY_TIME"

    .line 735
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 734
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 736
    return-void
.end method

.method public setMaintRetryResult(Z)V
    .locals 5

    .line 706
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setMaintRetryResult,result-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 708
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 712
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "MAINT_KEY_RESULT"

    .line 713
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    .line 712
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 715
    return-void
.end method

.method public transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 1

    .line 760
    const/4 v0, 0x0

    return-object v0
.end method

.method public writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/lang/String;Ljava/util/Date;)V"
        }
    .end annotation

    .line 354
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter writeLogToFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 356
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 357
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [B

    .line 358
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 359
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    array-length v2, v6

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    .line 356
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 362
    :cond_1
    const-string v0, "MaintenanceUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeLogToFile dataSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->dataSize:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->maintLogs2:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 364
    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpFileName:Ljava/lang/String;

    .line 365
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 366
    invoke-virtual {p3}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->tmpDate:Ljava/util/Date;

    .line 381
    :cond_2
    return-void
.end method
