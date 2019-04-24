.class public Lcom/ibotta/android/service/push/PushMessaging;
.super Ljava/lang/Object;
.source "PushMessaging.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final KEY_ACTION_TITLE:Ljava/lang/String; = "action_title"

.field private static final KEY_APP_DATA:Ljava/lang/String; = "app_data"

.field private static final KEY_CACHES:Ljava/lang/String; = "caches"

.field private static final KEY_CONTEXT:Ljava/lang/String; = "context"

.field private static final KEY_LIGHT:Ljava/lang/String; = "light"

.field private static final KEY_MESSAGE:Ljava/lang/String; = "message"

.field private static final KEY_ROUTE:Ljava/lang/String; = "route"

.field private static final KEY_SOUND:Ljava/lang/String; = "sound"

.field private static final KEY_VIBRATE:Ljava/lang/String; = "vibrate"

.field private static final SOUND_CASH_REGISTER:Ljava/lang/String; = "CashRegister.m4a"

.field private static final SOUND_WATERDROP:Ljava/lang/String; = "waterdrop.m4a"


# instance fields
.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final context:Landroid/content/Context;

.field private final fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

.field private json:Lcom/ibotta/android/json/IbottaJson;

.field private final statusBarNotificationHelper:Lcom/ibotta/android/notification/StatusBarNotificationHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/fcm/FcmState;Lcom/ibotta/android/notification/StatusBarNotificationHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/service/push/PushMessaging;->context:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/service/push/PushMessaging;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/service/push/PushMessaging;->statusBarNotificationHelper:Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/service/push/PushMessaging;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    return-void
.end method

.method private getJson()Lcom/ibotta/android/json/IbottaJson;
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/service/push/PushMessaging;->json:Lcom/ibotta/android/json/IbottaJson;

    if-nez v0, :cond_0

    .line 216
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/push/PushMessaging;->json:Lcom/ibotta/android/json/IbottaJson;

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/service/push/PushMessaging;->json:Lcom/ibotta/android/json/IbottaJson;

    return-object v0
.end method

.method private getMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 175
    :try_start_0
    sget-object v1, Lcom/ibotta/android/util/JsonHelper;->INSTANCE:Lcom/ibotta/android/util/JsonHelper;

    invoke-direct {p0}, Lcom/ibotta/android/service/push/PushMessaging;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v2

    const-class v3, Lcom/ibotta/android/service/push/PushNotification;

    invoke-virtual {v1, v2, p1, v3}, Lcom/ibotta/android/util/JsonHelper;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/service/push/PushNotification;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to parse push notification JSON."

    const/4 v2, 0x0

    .line 177
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_0

    .line 182
    invoke-virtual {p1}, Lcom/ibotta/android/service/push/PushNotification;->getBody()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method private getSound(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 223
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "CashRegister.m4a"

    .line 229
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    invoke-static {}, Lcom/ibotta/android/raw/RawResources;->getCashRegisterSoundUri()Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v0, "waterdrop.m4a"

    .line 231
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 232
    invoke-static {}, Lcom/ibotta/android/raw/RawResources;->getWaterdropSoundUri()Landroid/net/Uri;

    move-result-object v1

    :cond_2
    :goto_0
    return-object v1
.end method

.method private isLight(Ljava/lang/String;)Z
    .locals 3

    .line 254
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 260
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to parse light boolean"

    .line 262
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v1
.end method

.method private isVibrate(Ljava/lang/String;)Z
    .locals 3

    .line 239
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 245
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to parse vibrate boolean"

    .line 247
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v1
.end method

.method private processCacheClearingInfo(Landroid/content/Intent;Ljava/lang/String;)V
    .locals 3

    if-nez p2, :cond_0

    .line 196
    new-instance p2, Lcom/ibotta/android/service/push/BrazeCachesExtras;

    invoke-direct {p2, p1}, Lcom/ibotta/android/service/push/BrazeCachesExtras;-><init>(Landroid/content/Intent;)V

    invoke-virtual {p2}, Lcom/ibotta/android/service/push/BrazeCachesExtras;->getCacheFlags()Ljava/lang/String;

    move-result-object p2

    :cond_0
    const/4 p1, 0x0

    if-eqz p2, :cond_1

    .line 202
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to convert caches value to int: %1$s"

    const/4 v2, 0x1

    .line 204
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    if-lez p1, :cond_2

    .line 210
    iget-object p2, p0, Lcom/ibotta/android/service/push/PushMessaging;->context:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;->broadcast(Landroid/content/Context;I)V

    :cond_2
    return-void
.end method

.method private processSilentPush(Landroid/content/Intent;)V
    .locals 1

    .line 165
    invoke-static {p1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->create(Landroid/content/Intent;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    move-result-object p1

    .line 166
    invoke-virtual {p1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->isServerEvent()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/service/push/PushMessaging;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    invoke-virtual {p1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->getCampaignName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackSilentPush(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public buildTestIntent(Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/content/Intent;
    .locals 5

    .line 82
    new-instance v0, Lcom/ibotta/android/service/push/PushNotification;

    invoke-direct {v0}, Lcom/ibotta/android/service/push/PushNotification;-><init>()V

    .line 83
    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/push/PushNotification;->setBody(Ljava/lang/String;)V

    .line 85
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    :try_start_0
    const-string v2, "message"

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/service/push/PushMessaging;->getJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to build test Json payload: %1$s"

    const/4 v3, 0x1

    .line 89
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v0, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const-string p1, "route"

    .line 91
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "app_data"

    const-string p2, ""

    .line 92
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "sound"

    const-string p2, "CashRegister.m4a"

    .line 93
    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "vibrate"

    .line 94
    invoke-static {p3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "light"

    .line 95
    invoke-static {p4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v1
.end method

.method public getRoute(Landroid/content/Intent;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-string v1, "route"

    .line 65
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "route"

    .line 66
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 69
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "context"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "context"

    .line 70
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    .line 73
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p1

    :cond_3
    :goto_2
    return-object v0
.end method

.method public onAppboyMessage(Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 155
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/service/push/PushMessaging;->processCacheClearingInfo(Landroid/content/Intent;Ljava/lang/String;)V

    .line 156
    invoke-direct {p0, p1}, Lcom/ibotta/android/service/push/PushMessaging;->processSilentPush(Landroid/content/Intent;)V

    return-void
.end method

.method public onMessage(Landroid/content/Intent;)V
    .locals 10

    const-string v0, "message"

    .line 100
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "route"

    .line 101
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "app_data"

    .line 102
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "sound"

    .line 103
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/ibotta/android/service/push/PushMessaging;->getSound(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v4, "vibrate"

    .line 104
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/android/service/push/PushMessaging;->isVibrate(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "light"

    .line 105
    invoke-virtual {p1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/ibotta/android/service/push/PushMessaging;->isLight(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "caches"

    .line 106
    invoke-virtual {p1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "action_title"

    .line 108
    invoke-virtual {p1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 110
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "context"

    invoke-virtual {p1, v8}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v1, "context"

    .line 111
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 114
    :cond_0
    invoke-direct {p0, p1, v6}, Lcom/ibotta/android/service/push/PushMessaging;->processCacheClearingInfo(Landroid/content/Intent;Ljava/lang/String;)V

    const-string p1, "Message       : %1$s"

    const/4 v6, 0x1

    .line 116
    new-array v8, v6, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    invoke-static {p1, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Route Name    : %1$s"

    .line 117
    new-array v8, v6, [Ljava/lang/Object;

    aput-object v1, v8, v9

    invoke-static {p1, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "App Data      : %1$s"

    .line 118
    new-array v8, v6, [Ljava/lang/Object;

    aput-object v2, v8, v9

    invoke-static {p1, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Sound         : %1$s"

    .line 119
    new-array v2, v6, [Ljava/lang/Object;

    aput-object v3, v2, v9

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Vibrate       : %1$b"

    .line 120
    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v2, v9

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Light         : %1$b"

    .line 121
    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v2, v9

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Action Title  : %1$s"

    .line 122
    new-array v2, v6, [Ljava/lang/Object;

    aput-object v7, v2, v9

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-direct {p0, v0}, Lcom/ibotta/android/service/push/PushMessaging;->getMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "Push notification received is missing a message."

    .line 127
    new-array v0, v9, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 132
    :cond_1
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    iget-object v2, p0, Lcom/ibotta/android/service/push/PushMessaging;->context:Landroid/content/Context;

    invoke-direct {v0, v2, v1, v6}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "Route for push notification: %1$s"

    .line 133
    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v9

    invoke-static {v2, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/service/push/PushMessaging;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/ibotta/android/service/push/PushMessaging;->fcmState:Lcom/ibotta/android/state/app/fcm/FcmState;

    .line 136
    invoke-interface {v2}, Lcom/ibotta/android/state/app/fcm/FcmState;->getNextPushMessageId()I

    move-result v2

    const/high16 v6, 0x10000000

    .line 135
    invoke-static {v1, v2, v0, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 137
    new-instance v1, Lcom/ibotta/android/notification/StatusBarNotification;

    invoke-direct {v1}, Lcom/ibotta/android/notification/StatusBarNotification;-><init>()V

    .line 138
    invoke-virtual {v1, v0}, Lcom/ibotta/android/notification/StatusBarNotification;->setPendingIntent(Landroid/app/PendingIntent;)V

    .line 139
    invoke-virtual {v1, p1}, Lcom/ibotta/android/notification/StatusBarNotification;->setMessage(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v1, v3}, Lcom/ibotta/android/notification/StatusBarNotification;->setSound(Landroid/net/Uri;)V

    .line 141
    invoke-virtual {v1, v4}, Lcom/ibotta/android/notification/StatusBarNotification;->setVibrate(Z)V

    .line 142
    invoke-virtual {v1, v5}, Lcom/ibotta/android/notification/StatusBarNotification;->setLight(Z)V

    .line 144
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 145
    new-instance p1, Landroid/support/v4/app/NotificationCompat$Action$Builder;

    invoke-direct {p1, v9, v7, v0}, Landroid/support/v4/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 146
    invoke-virtual {v1}, Lcom/ibotta/android/notification/StatusBarNotification;->getActions()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action$Builder;->build()Landroid/support/v4/app/NotificationCompat$Action;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/service/push/PushMessaging;->statusBarNotificationHelper:Lcom/ibotta/android/notification/StatusBarNotificationHelper;

    iget-object v0, p0, Lcom/ibotta/android/service/push/PushMessaging;->context:Landroid/content/Context;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/notification/StatusBarNotificationHelper;->notify(Landroid/content/Context;Lcom/ibotta/android/notification/StatusBarNotification;)V

    return-void
.end method
