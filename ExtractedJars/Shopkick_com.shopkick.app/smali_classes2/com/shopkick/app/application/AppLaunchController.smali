.class public Lcom/shopkick/app/application/AppLaunchController;
.super Ljava/lang/Object;
.source "AppLaunchController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appInfo:Lcom/shopkick/app/application/AppInfo;

.field private appLaunchAlreadySent:Z

.field private appLaunchLogged:Z

.field private appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

.field private appLaunchedRespondReceived:Z

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private appboyClientLaunchLogged:Z

.field private badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

.field private badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

.field private context:Landroid/content/Context;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private hasHomeactivityResumedOnce:Z

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private pushEventDispatcher:Lcom/shopkick/app/gcm/PushEventDispatcher;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/gcm/PushEventDispatcher;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/gcm/GCMLifeCycle;Lcom/shopkick/app/util/badge/IBadgeProvider;Lcom/shopkick/app/controllers/BadgeManager;Landroid/content/Context;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 60
    iput-object p2, p0, Lcom/shopkick/app/application/AppLaunchController;->pushEventDispatcher:Lcom/shopkick/app/gcm/PushEventDispatcher;

    .line 61
    iput-object p3, p0, Lcom/shopkick/app/application/AppLaunchController;->appInfo:Lcom/shopkick/app/application/AppInfo;

    .line 62
    iput-object p4, p0, Lcom/shopkick/app/application/AppLaunchController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 63
    iput-object p5, p0, Lcom/shopkick/app/application/AppLaunchController;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 64
    iput-object p6, p0, Lcom/shopkick/app/application/AppLaunchController;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 65
    iput-object p7, p0, Lcom/shopkick/app/application/AppLaunchController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 66
    iput-object p9, p0, Lcom/shopkick/app/application/AppLaunchController;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    .line 67
    iput-object p10, p0, Lcom/shopkick/app/application/AppLaunchController;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    .line 68
    iput-object p11, p0, Lcom/shopkick/app/application/AppLaunchController;->context:Landroid/content/Context;

    const/4 p1, 0x0

    .line 70
    iput-boolean p1, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchedRespondReceived:Z

    .line 71
    new-instance p1, Lcom/shopkick/app/application/AppLaunchState;

    invoke-direct {p1, p7, p8}, Lcom/shopkick/app/application/AppLaunchState;-><init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/gcm/GCMLifeCycle;)V

    iput-object p1, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    return-void
.end method

.method private isPnsPending()Z
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private logAppboyClientLaunch()V
    .locals 7

    .line 207
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v4

    const v0, 0x927c6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    const/4 v0, 0x1

    .line 209
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appboyClientLaunchLogged:Z

    return-void
.end method

.method private logSessionStart()V
    .locals 2

    .line 119
    iget-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchLogged:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchLogged:Z

    .line 124
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x388

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 125
    invoke-direct {p0, v0}, Lcom/shopkick/app/application/AppLaunchController;->setClientLogRecordSource(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 127
    iget-object v1, p0, Lcom/shopkick/app/application/AppLaunchController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private setClientLogRecordSource(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PHONE_VERIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchSource(Ljava/lang/Integer;)V

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->WEB_REG:Lcom/shopkick/app/application/AppLaunchState$Source;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x2

    .line 134
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchSource(Ljava/lang/Integer;)V

    goto :goto_0

    .line 135
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    .line 136
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchSource(Ljava/lang/Integer;)V

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->getPushMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchParam(Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v1, Lcom/shopkick/app/application/AppLaunchState$Source;->LOCAL_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x5

    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchSource(Ljava/lang/Integer;)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->localNotifId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchParam(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 142
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLaunchSource(Ljava/lang/Integer;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 182
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/application/AppLaunchController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->setPostFirstLaunch()V

    .line 184
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedResponse;

    if-eqz p1, :cond_0

    .line 185
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedResponse;->inAppBadgeValues:Ljava/util/Map;

    if-eqz p2, :cond_0

    .line 186
    iget-object p2, p0, Lcom/shopkick/app/application/AppLaunchController;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedResponse;->inAppBadgeValues:Ljava/util/Map;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/controllers/BadgeManager;->updateBadgeValues(Ljava/util/Map;)V

    :cond_0
    const/4 p1, 0x1

    .line 188
    iput-boolean p1, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchedRespondReceived:Z

    .line 189
    iget-boolean p1, p0, Lcom/shopkick/app/application/AppLaunchController;->hasHomeactivityResumedOnce:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/shopkick/app/application/AppLaunchController;->appboyClientLaunchLogged:Z

    if-nez p1, :cond_1

    .line 190
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchController;->logAppboyClientLaunch()V

    :cond_1
    return-void
.end method

.method public getAlarmId()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->localNotifId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppLaunchState()Lcom/shopkick/app/application/AppLaunchState;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    return-object v0
.end method

.method public handlePNS()Z
    .locals 2

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchController;->isPnsPending()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->pushEventDispatcher:Lcom/shopkick/app/gcm/PushEventDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->isHandlingEvents()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v0, v0, Lcom/shopkick/app/application/AppLaunchState;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/application/AppLaunchController;->pushEventDispatcher:Lcom/shopkick/app/gcm/PushEventDispatcher;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->setPushMessage(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)V

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->pushEventDispatcher:Lcom/shopkick/app/gcm/PushEventDispatcher;

    invoke-virtual {v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->handleEvents()Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    if-ne v0, v1, :cond_1

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->reset()V

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public onHomescreenResumed()V
    .locals 1

    .line 200
    iget-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchedRespondReceived:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appboyClientLaunchLogged:Z

    if-nez v0, :cond_0

    .line 201
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchController;->logAppboyClientLaunch()V

    :cond_0
    const/4 v0, 0x1

    .line 203
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->hasHomeactivityResumedOnce:Z

    return-void
.end method

.method public parseIntent(Landroid/content/Intent;)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppLaunchState;->parseIntent(Landroid/content/Intent;)V

    .line 148
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x387

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 149
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/AppLaunchController;->setClientLogRecordSource(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public recordAppLaunchTimestamp()V
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appInfo:Lcom/shopkick/app/application/AppInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppInfo;->setAppLaunchedTimestamp(J)V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppLaunchState;->reset()V

    const/4 v0, 0x0

    .line 80
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchAlreadySent:Z

    .line 81
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchLogged:Z

    return-void
.end method

.method public sendAppLaunchedRequest()V
    .locals 6

    .line 96
    iget-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchAlreadySent:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchAlreadySent:Z

    .line 98
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;-><init>()V

    .line 99
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    iget-object v2, v2, Lcom/shopkick/app/application/AppLaunchState;->source:Lcom/shopkick/app/application/AppLaunchState$Source;

    sget-object v3, Lcom/shopkick/app/application/AppLaunchState$Source;->PUSH_NOTIFICATION:Lcom/shopkick/app/application/AppLaunchState$Source;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsInitiated:Ljava/lang/Boolean;

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppLaunchState;->getPushMessageId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsParam:Ljava/lang/String;

    .line 101
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppLaunchState;->getPnsSource()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsSource:Ljava/lang/Integer;

    .line 102
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppPreferences;->arePushNotificationsEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->pnsEnabled:Ljava/lang/Boolean;

    .line 103
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->btEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->btEnabled:Ljava/lang/Boolean;

    .line 104
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getAndroidId()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->androidId:Ljava/lang/String;

    .line 105
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const v3, 0x7f10000a

    invoke-virtual {v2, v3}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->kcid:Ljava/lang/String;

    .line 106
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v2}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->add:Ljava/lang/String;

    .line 107
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppLaunchState;->getBadgeValue()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->currentBadgeValue:Ljava/lang/Integer;

    .line 108
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appLaunchState:Lcom/shopkick/app/application/AppLaunchState;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppLaunchState;->getBadgeDisplayType()Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->androidBadgeDisplayType:Ljava/lang/Integer;

    .line 109
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    invoke-interface {v2}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->supportsAppIconBadging:Ljava/lang/Boolean;

    .line 110
    iget-object v2, p0, Lcom/shopkick/app/application/AppLaunchController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppPreferences;->isFirstLaunch()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 111
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/UserAppLaunchedRequest;->isFreshInstall:Ljava/lang/Boolean;

    .line 113
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "AppLaunchController: FIRED APP LAUNCHED REQUEST"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v5, v4}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method

.method public startAppSession()V
    .locals 1

    .line 89
    invoke-virtual {p0}, Lcom/shopkick/app/application/AppLaunchController;->recordAppLaunchTimestamp()V

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/application/AppLaunchController;->badgeManager:Lcom/shopkick/app/controllers/BadgeManager;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/BadgeManager;->clearExternalBadgeValue()V

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/application/AppLaunchController;->sendAppLaunchedRequest()V

    .line 92
    invoke-direct {p0}, Lcom/shopkick/app/application/AppLaunchController;->logSessionStart()V

    return-void
.end method
