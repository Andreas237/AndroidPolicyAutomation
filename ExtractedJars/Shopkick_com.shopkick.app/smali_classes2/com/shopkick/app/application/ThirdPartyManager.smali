.class public Lcom/shopkick/app/application/ThirdPartyManager;
.super Ljava/lang/Object;
.source "ThirdPartyManager.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static final ANR_TAG:Ljava/lang/String; = "ANRWatchdog"

.field private static final ENABLE_BRANCH_CUSTOM_EVENT_TRACKING:Z = true

.field private static volatile Instance:Lcom/shopkick/app/application/ThirdPartyManager; = null

.field private static final InstanceLock:Ljava/lang/Object;

.field private static final TAG:Ljava/lang/String; = "ThirdPartyManager"


# instance fields
.field private anrExceptionListener:Lcom/github/anrwatchdog/ANRWatchDog$ANRListener;

.field private appContext:Landroid/content/Context;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/application/ThirdPartyManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/content/Context;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 83
    iput-object p1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 84
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->appContext:Landroid/content/Context;

    .line 85
    iput-object p3, p0, Lcom/shopkick/app/application/ThirdPartyManager;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 86
    iput-object p4, p0, Lcom/shopkick/app/application/ThirdPartyManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 87
    new-instance p1, Lcom/shopkick/app/application/ThirdPartyManager$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/application/ThirdPartyManager$1;-><init>(Lcom/shopkick/app/application/ThirdPartyManager;)V

    iput-object p1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->anrExceptionListener:Lcom/github/anrwatchdog/ANRWatchDog$ANRListener;

    .line 96
    invoke-direct {p0}, Lcom/shopkick/app/application/ThirdPartyManager;->setup()V

    return-void

    .line 81
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Initialize wth null notificationCenter or context instance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static getInstance()Lcom/shopkick/app/application/ThirdPartyManager;
    .locals 2

    .line 49
    sget-object v0, Lcom/shopkick/app/application/ThirdPartyManager;->Instance:Lcom/shopkick/app/application/ThirdPartyManager;

    if-eqz v0, :cond_0

    .line 53
    sget-object v0, Lcom/shopkick/app/application/ThirdPartyManager;->Instance:Lcom/shopkick/app/application/ThirdPartyManager;

    return-object v0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ThirdpartyEventDispacher has not been initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static init(Lcom/shopkick/app/util/NotificationCenter;Landroid/content/Context;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)Lcom/shopkick/app/application/ThirdPartyManager;
    .locals 2

    .line 65
    sget-object v0, Lcom/shopkick/app/application/ThirdPartyManager;->Instance:Lcom/shopkick/app/application/ThirdPartyManager;

    if-nez v0, :cond_0

    .line 69
    sget-object v0, Lcom/shopkick/app/application/ThirdPartyManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 70
    :try_start_0
    new-instance v1, Lcom/shopkick/app/application/ThirdPartyManager;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/shopkick/app/application/ThirdPartyManager;-><init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/content/Context;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V

    sput-object v1, Lcom/shopkick/app/application/ThirdPartyManager;->Instance:Lcom/shopkick/app/application/ThirdPartyManager;

    .line 71
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    sget-object p0, Lcom/shopkick/app/application/ThirdPartyManager;->Instance:Lcom/shopkick/app/application/ThirdPartyManager;

    return-object p0

    :catchall_0
    move-exception p0

    .line 71
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 66
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo p1, "trying to initialize ThirdPartyManager twice."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private onUserLogoutOrDelete(Ljava/lang/String;)V
    .locals 0

    .line 158
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object p1

    invoke-virtual {p1}, Lio/branch/referral/Branch;->logout()V

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/RadarSDKUtils;->stopRadarTracking(Lcom/shopkick/app/application/ClientFlagsManager;)V

    return-void
.end method

.method private setup()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LogoutRequestSuccess"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "DeleteAccountRequestSuccess"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 110
    new-instance v0, Lcom/github/anrwatchdog/ANRWatchDog;

    invoke-direct {v0}, Lcom/github/anrwatchdog/ANRWatchDog;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->anrExceptionListener:Lcom/github/anrwatchdog/ANRWatchDog$ANRListener;

    invoke-virtual {v0, v1}, Lcom/github/anrwatchdog/ANRWatchDog;->setANRListener(Lcom/github/anrwatchdog/ANRWatchDog$ANRListener;)Lcom/github/anrwatchdog/ANRWatchDog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/anrwatchdog/ANRWatchDog;->start()V

    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 119
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x494aad42

    if-eq p2, v0, :cond_2

    const v0, -0x36d94b0a

    if-eq p2, v0, :cond_1

    const v0, 0x44e6563

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    const-string p2, "DeleteAccountRequestSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x2

    goto :goto_1

    :cond_2
    const-string p2, "LogoutRequestSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    .line 125
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/ThirdPartyManager;->onUserLogoutOrDelete(Ljava/lang/String;)V

    goto :goto_2

    .line 121
    :pswitch_1
    invoke-virtual {p0}, Lcom/shopkick/app/application/ThirdPartyManager;->onUserIDRefresh()Z

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onUserIDRefresh()Z
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->appContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;)V

    .line 146
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/Branch;->isUserIdentified()Z

    move-result v0

    if-nez v0, :cond_1

    .line 147
    invoke-static {}, Lio/branch/referral/Branch;->getInstance()Lio/branch/referral/Branch;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/branch/referral/Branch;->setIdentity(Ljava/lang/String;)V

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/ThirdPartyManager;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/application/ThirdPartyManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/RadarSDKUtils;->updateRadarTracking(Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V

    const/4 v0, 0x1

    return v0
.end method
