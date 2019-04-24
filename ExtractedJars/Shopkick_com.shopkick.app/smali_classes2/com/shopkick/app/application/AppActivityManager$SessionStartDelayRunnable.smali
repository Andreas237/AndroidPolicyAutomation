.class Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;
.super Ljava/lang/Object;
.source "AppActivityManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/AppActivityManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SessionStartDelayRunnable"
.end annotation


# instance fields
.field appActivityManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/AppActivityManager;",
            ">;"
        }
    .end annotation
.end field

.field private killSwitch:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 1

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 117
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->killSwitch:Z

    .line 120
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->appActivityManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 125
    iget-boolean v0, p0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->killSwitch:Z

    if-nez v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->appActivityManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/AppActivityManager;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, v0, Lcom/shopkick/app/application/AppActivityManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "AppActivityManagerSessionStartDelayedEvent"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method final setKillSwitch(Z)V
    .locals 0

    .line 134
    iput-boolean p1, p0, Lcom/shopkick/app/application/AppActivityManager$SessionStartDelayRunnable;->killSwitch:Z

    return-void
.end method
