.class public final Lcom/huawei/qrcode/decode/InactivityTimer;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;,
        Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;
    }
.end annotation


# static fields
.field private static final INACTIVITY_DELAY_MS:J = 0x493e0L

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private inactivityTask:Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;

.field private isUnRegister:Z

.field private final powerStatusReceiver:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/decode/InactivityTimer;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/decode/InactivityTimer;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->activity:Landroid/app/Activity;

    new-instance v0, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/decode/InactivityTimer$PowerStatusReceiver;-><init>(Lcom/huawei/qrcode/decode/InactivityTimer;Lcom/huawei/qrcode/decode/InactivityTimer$1;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->powerStatusReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onActivity()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/qrcode/decode/InactivityTimer;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->cancel()V

    return-void
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/decode/InactivityTimer;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/qrcode/decode/InactivityTimer;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method private cancel()V
    .locals 2

    iget-object v1, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->inactivityTask:Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->inactivityTask:Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;

    :cond_0
    return-void
.end method


# virtual methods
.method public onActivity()V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->cancel()V

    new-instance v0, Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;-><init>(Lcom/huawei/qrcode/decode/InactivityTimer;Lcom/huawei/qrcode/decode/InactivityTimer$1;)V

    iput-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->inactivityTask:Lcom/huawei/qrcode/decode/InactivityTimer$InactivityAsyncTask;

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->cancel()V

    iget-boolean v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->isUnRegister:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->isUnRegister:Z

    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->powerStatusReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->isUnRegister:Z

    iget-object v0, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/qrcode/decode/InactivityTimer;->powerStatusReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->onActivity()V

    return-void
.end method

.method public shutdown()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/decode/InactivityTimer;->cancel()V

    return-void
.end method
