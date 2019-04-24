.class public Lcom/shopkick/app/FCMIntentService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "FCMIntentService.java"

# interfaces
.implements Lcom/shopkick/app/gcm/GCMConstants;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "FCMIntentService"


# instance fields
.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 29
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 30
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    .line 31
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getData()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 34
    :cond_0
    sget-object p1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    invoke-virtual {p1, v0, v1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 35
    new-instance v0, Lcom/shopkick/app/gcm/PushEventDispatcher;

    invoke-virtual {p0}, Lcom/shopkick/app/FCMIntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/FCMIntentService;->handler:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/gcm/PushEventDispatcher;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 36
    new-instance v1, Lcom/shopkick/app/gcm/OsNotificationHandler;

    invoke-direct {v1, v0}, Lcom/shopkick/app/gcm/OsNotificationHandler;-><init>(Lcom/shopkick/app/gcm/PushEventDispatcher;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/gcm/PushEventDispatcher;->registerHandler(Lcom/shopkick/app/gcm/PushEventHandler;)V

    .line 37
    invoke-virtual {v0, p1}, Lcom/shopkick/app/gcm/PushEventDispatcher;->setPushMessage(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)V

    .line 38
    invoke-virtual {v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->handleEvents()Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    :cond_1
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 2

    .line 44
    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->onNewToken(Ljava/lang/String;)V

    .line 48
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/FCMIntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->registerAppboyPushMessages(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "FCMIntentService"

    const-string v1, "Exception while automatically registering Firebase token with Appboy."

    .line 50
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/FCMIntentService;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/SKApp;

    iget-object p1, p1, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-virtual {p1}, Lcom/shopkick/app/gcm/GCMLifeCycle;->register()V

    return-void
.end method
