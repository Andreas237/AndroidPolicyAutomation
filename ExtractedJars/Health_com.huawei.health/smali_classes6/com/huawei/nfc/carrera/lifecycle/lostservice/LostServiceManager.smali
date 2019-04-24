.class public Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final WAKE_LOCK_TIMEOUT:I = 0xea60

.field private static lostServiceWakeLock:Landroid/os/PowerManager$WakeLock; = null

.field private static final wakeLockSync:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->wakeLockSync:Ljava/lang/Object;

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

    .line 75
    sget-object v3, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->wakeLockSync:Ljava/lang/Object;

    monitor-enter v3

    .line 77
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 79
    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/PowerManager;

    .line 80
    const-string v0, "beginWakeLock"

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 83
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 87
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 89
    :goto_0
    return-void
.end method

.method static releaseLostTaskWakeLock()V
    .locals 3

    .line 96
    const-string v0, "releaseLostTaskWakeLock"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 97
    sget-object v1, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->wakeLockSync:Ljava/lang/Object;

    monitor-enter v1

    .line 99
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_1

    .line 101
    const-string v0, "release the wake lock now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 102
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 107
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->lostServiceWakeLock:Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 110
    :goto_0
    return-void
.end method

.method public static startCardLostManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 43
    const-string v0, "startCCLostManageService"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 44
    invoke-static {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->acquireWakeLock(Landroid/content/Context;)V

    .line 45
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 46
    const-string v0, "aid"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    const-string v0, "status"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    const-string v0, "cplc"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    const-string v0, "dpanid"

    invoke-virtual {v1, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    const-class v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 51
    invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 52
    return-void
.end method

.method public static startDevicesLostManageService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 63
    const-string v0, "startCCLostManageService  devices Lost mode "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 64
    invoke-static {p0}, Lcom/huawei/nfc/carrera/lifecycle/lostservice/LostServiceManager;->acquireWakeLock(Landroid/content/Context;)V

    .line 65
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 66
    const-string v0, "sign"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    const-string v0, "cplc"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    const-string v0, "mode"

    const-string v1, "devices_lost"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    const-class v0, Lcom/huawei/nfc/carrera/lifecycle/lostservice/CardLostManagerService;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 70
    invoke-virtual {p0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 71
    return-void
.end method
