.class public final Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/oma/IOmaService;


# static fields
.field private static final SYNC_LOCK:[B

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;


# instance fields
.field private final lock:Ljava/lang/Object;

.field private mOmaService:Lcom/huawei/nfc/carrera/logic/oma/OmaService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->lock:Ljava/lang/Object;

    .line 35
    new-instance v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->mOmaService:Lcom/huawei/nfc/carrera/logic/oma/OmaService;

    .line 36
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;
    .locals 4

    .line 45
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->instance:Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 46
    sget-object v2, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 47
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->instance:Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 48
    new-instance v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->instance:Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 52
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->instance:Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    return-object v0
.end method


# virtual methods
.method public closeChannel(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V
    .locals 3

    .line 72
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->mOmaService:Lcom/huawei/nfc/carrera/logic/oma/OmaService;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->closeChannel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 75
    :goto_0
    return-void
.end method

.method public excuteApduList(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation

    .line 58
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->mOmaService:Lcom/huawei/nfc/carrera/logic/oma/OmaService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->excuteApduList(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 60
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public excuteApduListEx(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation

    .line 65
    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->mOmaService:Lcom/huawei/nfc/carrera/logic/oma/OmaService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->excuteApduListEx(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 67
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
