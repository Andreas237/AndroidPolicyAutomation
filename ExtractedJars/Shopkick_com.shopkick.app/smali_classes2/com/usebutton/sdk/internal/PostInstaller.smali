.class public Lcom/usebutton/sdk/internal/PostInstaller;
.super Ljava/lang/Object;
.source "PostInstaller.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;
    }
.end annotation


# static fields
.field private static final NOTIFICATION_CHANNEL_ID:I
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation
.end field

.field private static final NOTIFICATION_ID:I = 0x7c1

.field private static final TAG:Ljava/lang/String; = "AppInstaller"

.field private static final TIME_DEFAULT:Lcom/usebutton/sdk/internal/util/TimeProvider;


# instance fields
.field private mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

.field private final mContext:Landroid/content/Context;

.field private final mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

.field private final mInstallStart:J

.field private final mLegacyNotificationFactory:Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;

.field private final mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

.field private final mNotificationFactory:Lcom/usebutton/sdk/internal/NotificationFactory;

.field private final mTargetIntent:Landroid/content/Intent;

.field private final mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

.field private mUsed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    sget v0, Lcom/usebutton/sdk/R$string;->btn_notification_channel_id:I

    sput v0, Lcom/usebutton/sdk/internal/PostInstaller;->NOTIFICATION_CHANNEL_ID:I

    .line 51
    new-instance v0, Lcom/usebutton/sdk/internal/PostInstaller$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/PostInstaller$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/PostInstaller;->TIME_DEFAULT:Lcom/usebutton/sdk/internal/util/TimeProvider;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;Lcom/usebutton/sdk/internal/events/EventTracker;)V
    .locals 9

    .line 71
    sget-object v3, Lcom/usebutton/sdk/internal/PostInstaller;->TIME_DEFAULT:Lcom/usebutton/sdk/internal/util/TimeProvider;

    new-instance v7, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;

    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    invoke-direct {v7, p1, v0, p2}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;-><init>(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/usebutton/sdk/internal/models/Configuration;)V

    .line 73
    invoke-static {p1}, Lcom/usebutton/sdk/internal/NotificationFactory;->getInstance(Landroid/content/Context;)Lcom/usebutton/sdk/internal/NotificationFactory;

    move-result-object v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 71
    invoke-direct/range {v0 .. v8}, Lcom/usebutton/sdk/internal/PostInstaller;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/util/TimeProvider;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;Lcom/usebutton/sdk/internal/NotificationFactory;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/util/TimeProvider;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;Lcom/usebutton/sdk/internal/NotificationFactory;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 67
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mUsed:Z

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mContext:Landroid/content/Context;

    .line 82
    iput-object p5, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTargetIntent:Landroid/content/Intent;

    .line 83
    iput-object p2, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    .line 84
    iput-object p3, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    .line 85
    iput-object p4, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 86
    iput-object p6, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 87
    iget-object p1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mInstallStart:J

    .line 88
    iput-object p7, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mLegacyNotificationFactory:Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;

    .line 89
    iput-object p8, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mNotificationFactory:Lcom/usebutton/sdk/internal/NotificationFactory;

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    .line 47
    sget v0, Lcom/usebutton/sdk/internal/PostInstaller;->NOTIFICATION_CHANNEL_ID:I

    return v0
.end method

.method private eventProperties()Lorg/json/JSONObject;
    .locals 3

    const/16 v0, 0x8

    .line 167
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "action"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTargetIntent:Landroid/content/Intent;

    .line 168
    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "promotion_source_token"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 169
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string/jumbo v1, "target"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 170
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getTarget()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "app_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 171
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 167
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method private shouldOpen()Z
    .locals 11

    .line 136
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTimeProvider:Lcom/usebutton/sdk/internal/util/TimeProvider;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/util/TimeProvider;->getTimeInMs()J

    move-result-wide v0

    .line 137
    iget-wide v2, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mInstallStart:J

    sub-long/2addr v0, v2

    .line 138
    iget-object v2, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    .line 139
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getAttendedInstallAutoOpenSeconds()I

    move-result v2

    .line 140
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v4, v2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    cmp-long v3, v0, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-gez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    const-string v6, "AppInstaller"

    const-string v7, "Time since install started %.1fs, threshold %d, open: %b"

    const/4 v8, 0x3

    .line 141
    new-array v8, v8, [Ljava/lang/Object;

    long-to-double v0, v0

    const-wide v9, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v9

    .line 142
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v8, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v4

    const/4 v0, 0x2

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v8, v0

    .line 141
    invoke-static {v6, v7, v8}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v3
.end method

.method private showNotification()V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isInstallNotificationDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppInstaller"

    const-string v1, "Install notifications disabled, do nothing."

    .line 148
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mLegacyNotificationFactory:Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTargetIntent:Landroid/content/Intent;

    .line 153
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/PostInstaller$LegacyNotificationFactory;->getNotification(Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/content/Intent;)Landroid/app/Notification;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 158
    :cond_1
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mContext:Landroid/content/Context;

    const-string v2, "notification"

    .line 159
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    const/16 v2, 0x7c1

    .line 160
    invoke-virtual {v1, v2}, Landroid/app/NotificationManager;->cancel(I)V

    .line 161
    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 162
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:app-install-notification-displayed"

    .line 163
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller;->eventProperties()Lorg/json/JSONObject;

    move-result-object v2

    .line 162
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public onInstalled()V
    .locals 7

    .line 101
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mUsed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 104
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mUsed:Z

    .line 106
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v2, "btn:app-install-success"

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller;->eventProperties()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v1, "Store Install completed (Action ID: %s)"

    .line 107
    new-array v2, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller;->shouldOpen()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "AppInstaller"

    const-string v2, "Fast install, let\'s open commerce app."

    .line 109
    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTargetIntent:Landroid/content/Intent;

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->safelyOpenIntent(Landroid/content/Context;Landroid/content/Intent;)V

    .line 112
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mConfiguration:Lcom/usebutton/sdk/internal/models/Configuration;

    .line 113
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isAppToAppNotificationEnabled()Z

    move-result v1

    .line 115
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller;->eventProperties()Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v1, :cond_1

    :try_start_0
    const-string v1, "notifications_enabled"

    .line 119
    iget-object v3, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mNotificationFactory:Lcom/usebutton/sdk/internal/NotificationFactory;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/NotificationFactory;->areNotificationsEnabled()Z

    move-result v3

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :catch_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mNotificationFactory:Lcom/usebutton/sdk/internal/NotificationFactory;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mTargetIntent:Landroid/content/Intent;

    invoke-virtual {v1, v3}, Lcom/usebutton/sdk/internal/NotificationFactory;->displayAppToAppNotification(Landroid/content/Intent;)V

    .line 124
    iget-object v1, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v3, "btn:notified-tracking-active"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "promotion_source_token"

    aput-object v6, v5, v4

    iget-object v4, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v0

    invoke-virtual {v1, v3, v5}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/PostInstaller;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:app-deeplink"

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_2
    const-string v0, "AppInstaller"

    const-string v1, "Install took too long, post notification."

    .line 130
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verbose(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/PostInstaller;->showNotification()V

    :goto_0
    return-void
.end method
