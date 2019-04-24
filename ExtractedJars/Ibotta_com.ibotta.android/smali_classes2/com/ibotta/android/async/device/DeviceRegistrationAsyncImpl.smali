.class public Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;
.super Ljava/lang/Object;
.source "DeviceRegistrationAsyncImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/device/DeviceRegistrationAsync;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final deviceRegistration:Lcom/ibotta/android/async/device/DeviceRegistration;

.field protected task:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/async/device/DeviceRegistration;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->deviceRegistration:Lcom/ibotta/android/async/device/DeviceRegistration;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;)Lcom/ibotta/android/async/device/DeviceRegistration;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->deviceRegistration:Lcom/ibotta/android/async/device/DeviceRegistration;

    return-object p0
.end method


# virtual methods
.method protected cleanUp()V
    .locals 2

    const-string v0, "cleanUp"

    const/4 v1, 0x0

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->task:Landroid/os/AsyncTask;

    return-void
.end method

.method protected createTask()Landroid/os/AsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;-><init>(Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;)V

    return-object v0
.end method

.method protected executeTask()V
    .locals 3

    const-string v0, "Executing device registration."

    const/4 v1, 0x0

    .line 36
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->createTask()Landroid/os/AsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->task:Landroid/os/AsyncTask;

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->task:Landroid/os/AsyncTask;

    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, v0, Landroid/os/AsyncTask;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getDeviceRegistration()Lcom/ibotta/android/async/device/DeviceRegistration;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->deviceRegistration:Lcom/ibotta/android/async/device/DeviceRegistration;

    return-object v0
.end method

.method public registerDevice()V
    .locals 2

    const-string v0, "registerDevice"

    const/4 v1, 0x0

    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->task:Landroid/os/AsyncTask;

    if-nez v0, :cond_0

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->executeTask()V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->taskAlreadyRunning()V

    :goto_0
    return-void
.end method

.method protected taskAlreadyRunning()V
    .locals 2

    const-string v0, "Device registration already being performed."

    const/4 v1, 0x0

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
