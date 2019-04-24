.class public Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final WAKE_LOCK_TIMEOUT:I = 0xea60

.field private static nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock; = null

.field private static final wakeLockSync:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->wakeLockSync:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static acquireWakeLock(Landroid/content/Context;)V
    .locals 6

    .line 55
    sget-object v3, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->wakeLockSync:Ljava/lang/Object;

    monitor-enter v3

    .line 57
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 59
    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/PowerManager;

    .line 60
    const-string v0, "beginWakeLock"

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 63
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 67
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 69
    :goto_0
    return-void
.end method

.method static releaseLostTaskWakeLock()V
    .locals 3

    .line 76
    const-string v0, "releaseLostTaskWakeLock"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 77
    sget-object v1, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->wakeLockSync:Ljava/lang/Object;

    monitor-enter v1

    .line 79
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_1

    .line 81
    const-string v0, "release the wake lock now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 82
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 87
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->nullifyServiceWakeLock:Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 90
    :goto_0
    return-void
.end method

.method public static startNullifyAccountManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 43
    const-string v0, "startNullifyAccountManageService"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 44
    invoke-static {p0}, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyServiceManager;->acquireWakeLock(Landroid/content/Context;)V

    .line 45
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 46
    const-string v0, "user"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    const-string v0, "cplc"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    const-string v0, "sign"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    const-class v0, Lcom/huawei/nfc/carrera/lifecycle/nullifyservice/NullifyAccountManagerService;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 50
    invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 51
    return-void
.end method
