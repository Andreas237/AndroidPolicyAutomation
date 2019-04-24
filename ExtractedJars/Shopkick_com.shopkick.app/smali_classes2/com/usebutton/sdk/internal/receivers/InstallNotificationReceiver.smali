.class public Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;
.super Landroid/content/BroadcastReceiver;
.source "InstallNotificationReceiver.java"


# static fields
.field public static final ACTION_CANCEL:Ljava/lang/String; = "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CANCEL"

.field public static final ACTION_CONTENT:Ljava/lang/String; = "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CONTENT"

.field private static final EXTRA_TARGET:Ljava/lang/String; = "target"

.field private static final TAG:Ljava/lang/String; = "InstallNotification"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static cancelIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 1

    const-string v0, "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CANCEL"

    .line 110
    invoke-static {p0, v0, p1}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->intentFor(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method private static eventPropertiesForIntent(Landroid/content/Intent;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x6

    .line 114
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "action"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 115
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "promotion_source_token"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "promotion_source_token"

    .line 117
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string/jumbo v1, "target"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string/jumbo v1, "target"

    .line 118
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x5

    aput-object p0, v0, v1

    .line 114
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private getConfigurationParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
    .locals 1

    .line 94
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    return-object v0
.end method

.method private getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 1

    .line 90
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    return-object v0
.end method

.method private handleCancel(Landroid/content/Intent;)V
    .locals 2

    .line 84
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:app-install-notification-dismissed"

    .line 86
    invoke-static {p1}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->eventPropertiesForIntent(Landroid/content/Intent;)Lorg/json/JSONObject;

    move-result-object p1

    .line 85
    invoke-virtual {v0, v1, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private handleOpen(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 49
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    .line 50
    invoke-static {p1}, Lcom/usebutton/sdk/internal/NotificationFactory;->getInstance(Landroid/content/Context;)Lcom/usebutton/sdk/internal/NotificationFactory;

    move-result-object v1

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v2

    .line 52
    invoke-static {}, Lcom/usebutton/sdk/internal/util/TestUtils;->isNotTesting()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const-string p1, "InstallNotification"

    const-string v0, "Nothing to open target app, uninstalled? intent: %s"

    .line 54
    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v3

    invoke-static {p1, v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 58
    :cond_0
    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->safelyOpenIntent(Landroid/content/Context;Landroid/content/Intent;)V

    .line 60
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->getConfigurationParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isAppToAppNotificationEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 61
    invoke-virtual {v1, p2}, Lcom/usebutton/sdk/internal/NotificationFactory;->displayAppToAppNotification(Landroid/content/Intent;)V

    const-string p1, "btn:notified-tracking-active"

    const/4 v2, 0x2

    .line 62
    new-array v2, v2, [Ljava/lang/String;

    const-string v5, "promotion_source_token"

    aput-object v5, v2, v3

    const-string v3, "promotion_source_token"

    .line 64
    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    .line 62
    invoke-virtual {v0, p1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    .line 68
    :cond_1
    invoke-static {p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->eventPropertiesForIntent(Landroid/content/Intent;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "btn:app-install-notification-action"

    .line 69
    invoke-virtual {v0, p2, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 74
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string p1, "notifications_enabled"

    .line 75
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/NotificationFactory;->areNotificationsEnabled()Z

    move-result v1

    invoke-virtual {p2, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-object p2, p1

    :catch_1
    :goto_0
    const-string p1, "btn:app-deeplink"

    .line 80
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private static intentFor(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 2

    .line 103
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 104
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo p0, "target"

    .line 105
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static openIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 1

    const-string v0, "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CONTENT"

    .line 98
    invoke-static {p0, v0, p1}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->intentFor(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 31
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "target"

    .line 32
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    .line 33
    const-class v1, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_3

    .line 34
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CONTENT"

    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->handleOpen(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    const-string p1, "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CANCEL"

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 42
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/receivers/InstallNotificationReceiver;->handleCancel(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const-string p1, "InstallNotification"

    const-string p2, "Got unknown action %s"

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-static {p1, p2, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    const-string p1, "InstallNotification"

    const-string v0, "Invalid intent, no target intent with data with %s"

    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    invoke-static {p1, v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
