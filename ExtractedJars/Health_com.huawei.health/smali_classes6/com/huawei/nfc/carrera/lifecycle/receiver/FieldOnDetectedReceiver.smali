.class public Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static final ACTION_RF_FIELD_ON_DETECTED:Ljava/lang/String; = "com.android.nfc_extras.action.RF_FIELD_ON_DETECTED"

.field private static final WAKE_LOCK_TIMEOUT:I = 0xbb8

.field private static swipeWakeLock:Landroid/os/PowerManager$WakeLock; = null

.field private static final wakeLockSync:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->wakeLockSync:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private acquireFieldOnWakelock(Landroid/content/Context;)V
    .locals 6

    .line 89
    sget-object v3, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->wakeLockSync:Ljava/lang/Object;

    monitor-enter v3

    .line 91
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->swipeWakeLock:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 93
    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/PowerManager;

    .line 94
    const-string v0, "swipeWakeLock"

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->swipeWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 97
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->swipeWakeLock:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 100
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->swipeWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->swipeWakeLock:Landroid/os/PowerManager$WakeLock;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :cond_1
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 106
    :goto_0
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 55
    const-string v0, "detect in field broadcast intent is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 56
    return-void

    .line 59
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FieldOnDetectedReceiver onReceive  action=="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 61
    const-string v0, "com.android.nfc_extras.action.RF_FIELD_ON_DETECTED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    const-string v0, "The action is not field on action, ignore it."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 64
    return-void

    .line 67
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/lifecycle/receiver/FieldOnDetectedReceiver;->acquireFieldOnWakelock(Landroid/content/Context;)V

    .line 69
    invoke-static {p1}, Lcom/huawei/wallet/utils/nversion/NversionUtil;->c(Landroid/content/Context;)Z

    move-result v3

    .line 71
    if-nez v3, :cond_2

    .line 73
    const-string v0, "FieldOnDetectedReceiver, N version isUserUnLocked is false"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 74
    return-void

    .line 77
    :cond_2
    invoke-static {p1}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isMatchPayCondition(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 79
    return-void

    .line 82
    :cond_3
    return-void
.end method
