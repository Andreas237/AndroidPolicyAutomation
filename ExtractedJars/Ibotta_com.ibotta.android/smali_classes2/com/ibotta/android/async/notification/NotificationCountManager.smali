.class public Lcom/ibotta/android/async/notification/NotificationCountManager;
.super Ljava/lang/Object;
.source "NotificationCountManager.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private clearTask:Landroid/os/AsyncTask;
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

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/async/notification/NotificationCountManager;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/notification/NotificationCountManager;->setCount(I)V

    return-void
.end method

.method static synthetic access$102(Lcom/ibotta/android/async/notification/NotificationCountManager;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->clearTask:Landroid/os/AsyncTask;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/async/notification/NotificationCountManager;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-object p0
.end method

.method private setCount(I)V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setCustomerNotificationCount(I)V

    return-void
.end method


# virtual methods
.method public cancelNotificationsClear()V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->clearTask:Landroid/os/AsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 74
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->clearTask:Landroid/os/AsyncTask;

    return-void
.end method

.method public checkNotificationCount()Z
    .locals 1

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public doNotificationsClear()V
    .locals 3

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->getCount()I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->cancelNotificationsClear()V

    .line 43
    new-instance v0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/async/notification/NotificationCountManager$1;-><init>(Lcom/ibotta/android/async/notification/NotificationCountManager;)V

    iput-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->clearTask:Landroid/os/AsyncTask;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->clearTask:Landroid/os/AsyncTask;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    instance-of v2, v0, Landroid/os/AsyncTask;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerNotificationCount()I

    move-result v0

    return v0
.end method
