.class public Lcom/ibotta/android/gplayservices/GPlayServicesClient;
.super Ljava/lang/Object;
.source "GPlayServicesClient.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# instance fields
.field private final apis:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Api;",
            ">;"
        }
    .end annotation
.end field

.field protected client:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private clientLock:Ljava/util/concurrent/locks/Lock;

.field private connectedCondition:Ljava/util/concurrent/locks/Condition;

.field private connectionRunnable:Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/Api;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    .line 40
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 41
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->context:Landroid/content/Context;

    .line 43
    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->apis:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Api;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->context:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->apis:Ljava/util/Set;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Landroid/content/Context;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)Ljava/util/Set;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->apis:Ljava/util/Set;

    return-object p0
.end method

.method private connectToGoogle()V
    .locals 5

    const-string v0, "connectToGoogle"

    const/4 v1, 0x0

    .line 146
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 150
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectToGoogleOnMain()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v0, "Waiting for connection..."

    .line 152
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    const-wide/16 v2, 0x1e

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v2, "Exception waiting for Google connection."

    .line 155
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private connectToGoogleOnMain()V
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    const-string v0, "Instance connectionRunnable already exists."

    const/4 v1, 0x0

    .line 167
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 171
    :cond_0
    new-instance v0, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient$1;-><init>(Lcom/ibotta/android/gplayservices/GPlayServicesClient;)V

    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    .line 199
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public connectAndWait()V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectToGoogle()V

    return-void
.end method

.method public disconnect()V
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 77
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 78
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    :cond_1
    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public getGoogleApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object v0
.end method

.method public isConnected()Z
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->client:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 64
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 1

    const-string p1, "onConnected - To Google Play Services"

    const/4 v0, 0x0

    .line 99
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectionRunnable:Ljava/lang/Runnable;

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 104
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    const-string v0, "onConnectionFailed: errorCode=%1$d"

    const/4 v1, 0x1

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 119
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public onConnectionSuspended(I)V
    .locals 1

    const-string p1, "Connection suspended"

    const/4 v0, 0x0

    .line 129
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 133
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectedCondition:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    .line 136
    invoke-direct {p0}, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->connectToGoogle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    iget-object p1, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/android/gplayservices/GPlayServicesClient;->clientLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method
