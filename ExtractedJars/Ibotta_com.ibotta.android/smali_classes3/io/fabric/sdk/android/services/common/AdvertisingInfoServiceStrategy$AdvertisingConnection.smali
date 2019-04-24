.class final Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;
.super Ljava/lang/Object;
.source "AdvertisingInfoServiceStrategy.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "AdvertisingConnection"
.end annotation


# instance fields
.field private final queue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Landroid/os/IBinder;",
            ">;"
        }
    .end annotation
.end field

.field private retrieved:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 107
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->retrieved:Z

    .line 109
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method synthetic constructor <init>(Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$1;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;-><init>()V

    return-void
.end method


# virtual methods
.method public getBinder()Landroid/os/IBinder;
    .locals 4

    .line 126
    iget-boolean v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->retrieved:Z

    if-eqz v0, :cond_0

    .line 127
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "getBinder already called"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->retrieved:Z

    .line 135
    :try_start_0
    iget-object v0, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/16 v1, 0xc8

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 114
    :try_start_0
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 122
    iget-object p1, p0, Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection;->queue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void
.end method
