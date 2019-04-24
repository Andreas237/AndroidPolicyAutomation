.class public Lcom/shopkick/app/gcm/GCMLifeCycle;
.super Ljava/lang/Object;
.source "GCMLifeCycle.java"

# interfaces
.implements Lcom/shopkick/app/gcm/GCMConstants;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "GCMLifeCycle"


# instance fields
.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private context:Landroid/content/Context;

.field private gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

.field private gcmPreferences:Lcom/shopkick/app/gcm/GCMPreferences;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field regId:Ljava/lang/String;

.field private final userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/gcm/GCMDataSource;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    .line 41
    iput-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->context:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    .line 43
    iput-object p3, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 44
    iput-object p5, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 45
    iput-object p4, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 46
    iget-object p2, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p3, "UserAccountIdChangedEvent"

    const/4 p4, 0x0

    invoke-virtual {p2, p0, p3, p4}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 48
    new-instance p2, Lcom/shopkick/app/gcm/GCMPreferences;

    invoke-direct {p2, p1}, Lcom/shopkick/app/gcm/GCMPreferences;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmPreferences:Lcom/shopkick/app/gcm/GCMPreferences;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/gcm/GCMLifeCycle;)Landroid/content/Context;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/gcm/GCMLifeCycle;)Lcom/shopkick/app/gcm/GCMDataSource;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    return-object p0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/GCMDataSource;->onDestroy()V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 55
    :try_start_0
    invoke-static {}, Lcom/google/firebase/iid/FirebaseInstanceId;->getInstance()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->deleteInstanceId()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 57
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public getLastPushMessageJSON()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmPreferences:Lcom/shopkick/app/gcm/GCMPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/GCMPreferences;->getLastPushMessageJSON()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    const-string p2, "gcm_register_failed"

    if-ne p1, p2, :cond_0

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_succeeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_failed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setFcmFailedRegistering(Z)V

    .line 103
    invoke-virtual {p0}, Lcom/shopkick/app/gcm/GCMLifeCycle;->unregister()V

    goto :goto_0

    :cond_0
    const-string p2, "gcm_register_succeeded"

    if-ne p1, p2, :cond_2

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_succeeded"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "gcm_register_failed"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Got empty FCM registration ID after GCMDataSource notifying registration success"

    .line 110
    invoke-static {p1}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    .line 117
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public register()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->arePushNotificationsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    :cond_1
    invoke-static {}, Lcom/google/firebase/iid/FirebaseInstanceId;->getInstance()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->getInstanceId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/gcm/GCMLifeCycle$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/gcm/GCMLifeCycle$1;-><init>(Lcom/shopkick/app/gcm/GCMLifeCycle;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "gcm_register_failed"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "gcm_register_succeeded"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method public setLastPushMessageJSON(Ljava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmPreferences:Lcom/shopkick/app/gcm/GCMPreferences;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/gcm/GCMPreferences;->setLastPushMessageJSON(Ljava/lang/String;)V

    return-void
.end method

.method public setSoundEnabled(Z)V
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmPreferences:Lcom/shopkick/app/gcm/GCMPreferences;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/gcm/GCMPreferences;->setSoundEnabled(Z)V

    return-void
.end method

.method public unregister()V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->gcmDataSource:Lcom/shopkick/app/gcm/GCMDataSource;

    iget-object v1, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/shopkick/app/gcm/GCMLifeCycle;->regId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/gcm/GCMDataSource;->unregister(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
