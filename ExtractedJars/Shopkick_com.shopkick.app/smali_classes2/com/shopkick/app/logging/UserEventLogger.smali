.class public Lcom/shopkick/app/logging/UserEventLogger;
.super Ljava/lang/Object;
.source "UserEventLogger.java"

# interfaces
.implements Lcom/shopkick/app/view/ISKListViewModule;
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# static fields
.field private static final ALWAYS_ACTIVE_KEY:Ljava/lang/String; = "AlwaysActive"


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private didShowPage:Z

.field private eventCoordinators:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field public overlayEnum:Ljava/lang/Integer;

.field private pageAction:Ljava/lang/Integer;

.field private pageHideAction:Ljava/lang/Integer;

.field public primaryDirection:I

.field private recordsByPrimaryDisplayPos:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public screenEnum:Ljava/lang/Integer;

.field private screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

.field private screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

.field private singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

.field private trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

.field private uiEventLogUpdateCallbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/UIEventLogUpdateCallback;",
            ">;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;Ljava/lang/Integer;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->primaryDirection:I

    .line 84
    invoke-direct {p0, p1, p4, p5, p6}, Lcom/shopkick/app/logging/UserEventLogger;->init(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;)V

    .line 85
    iput-object p7, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    .line 87
    iput-object p2, p0, Lcom/shopkick/app/logging/UserEventLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 88
    iput-object p3, p0, Lcom/shopkick/app/logging/UserEventLogger;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const/4 p1, 0x1

    .line 90
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageAction:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Ljava/lang/Integer;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->primaryDirection:I

    const/4 v0, 0x0

    .line 101
    invoke-direct {p0, p1, p4, v0, v0}, Lcom/shopkick/app/logging/UserEventLogger;->init(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;)V

    .line 102
    iput-object p5, p0, Lcom/shopkick/app/logging/UserEventLogger;->overlayEnum:Ljava/lang/Integer;

    .line 104
    iput-object p2, p0, Lcom/shopkick/app/logging/UserEventLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 105
    iput-object p3, p0, Lcom/shopkick/app/logging/UserEventLogger;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const/4 p1, 0x2

    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageAction:Ljava/lang/Integer;

    const/16 p1, 0x26

    .line 108
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageHideAction:Ljava/lang/Integer;

    return-void
.end method

.method private addParam(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-eqz p3, :cond_1

    .line 135
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private addParams(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_2

    .line 114
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string/jumbo v2, "user_id"

    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 116
    iget-object v2, p0, Lcom/shopkick/app/logging/UserEventLogger;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 118
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "friend_id"

    .line 119
    invoke-direct {p0, p1, v2, v1}, Lcom/shopkick/app/logging/UserEventLogger;->addParam(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 122
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, p1, v1, v2}, Lcom/shopkick/app/logging/UserEventLogger;->addParam(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private init(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 58
    iput-object p2, p0, Lcom/shopkick/app/logging/UserEventLogger;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 59
    iput-object p3, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    .line 60
    iput-object p4, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    .line 62
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    .line 63
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    return-void
.end method

.method private primaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;
    .locals 2

    .line 435
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getDisplayPos()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    .line 437
    iget v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->primaryDirection:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getHorizontalDisplayPos()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 438
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getVerticalDisplayPos()Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "AlwaysActive"

    :goto_1
    move-object v0, p1

    :cond_2
    return-object v0
.end method

.method private secondaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;
    .locals 2

    .line 445
    iget v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->primaryDirection:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getVerticalDisplayPos()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 446
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventViewCore;->getHorizontalDisplayPos()Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "AlwaysActive"

    :cond_1
    return-object p1
.end method


# virtual methods
.method public addUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 1

    const/4 v0, 0x0

    .line 178
    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 182
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    if-eqz v0, :cond_0

    .line 183
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onShowPage()V

    goto :goto_0

    .line 185
    :cond_0
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onHidePage()V

    :cond_1
    :goto_0
    return-void
.end method

.method public appLaunchRecordedForSession()Z
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {v0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->isAppLaunchRecordedForSession()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public clearRecords()V
    .locals 1

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public clearRecordsForPrimaryPos(I)V
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 329
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getScreen()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "If screen is not null in the record, do not use detectedEvent."

    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 333
    invoke-virtual {p0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public detectedHidePage()V
    .locals 2

    .line 224
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    if-nez v0, :cond_0

    return-void

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageHideAction:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 229
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 230
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageHideAction:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 231
    invoke-virtual {p0, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    if-eqz v0, :cond_2

    .line 235
    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onHidePage()V

    .line 237
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 238
    invoke-interface {v1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onHidePage()V

    goto :goto_0

    .line 241
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 243
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    return-void
.end method

.method public detectedPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    if-eqz v0, :cond_0

    .line 248
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, p1, v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->recordPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedScreenResponsive()V
    .locals 4

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    if-eqz v0, :cond_1

    .line 254
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->uiEventLogUpdateCallbackWeakReference:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 258
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;

    .line 259
    invoke-interface {v1, v0}, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;->updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 260
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getOriginScreen()Ljava/lang/Integer;

    move-result-object v2

    .line 261
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getOriginElement()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    .line 264
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    iget-object v3, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v1, v2, v0, v3}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->recordScreenResponsive(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method public detectedShowPage()V
    .locals 2

    .line 206
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 209
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    .line 211
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->pageAction:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 213
    invoke-virtual {p0, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    if-eqz v0, :cond_1

    .line 216
    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onShowPage()V

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 219
    invoke-interface {v1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onShowPage()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public detectedUIEventEnd(Ljava/lang/Integer;)V
    .locals 2

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 308
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 314
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1, p2}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedUIEventEnd(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 302
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventEnd(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedUIEventStart(Ljava/lang/Integer;)V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 290
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 296
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1, p2}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public detectedUIEventStart(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenUIPerformanceLogger:Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;

    if-eqz v0, :cond_0

    .line 284
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1, p1, p2}, Lcom/shopkick/app/logging/ScreenUIPerformanceLogger;->recordUIEventStart(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public didLogRecord(Lcom/shopkick/app/logging/UserEventViewCore;Ljava/lang/String;)V
    .locals 3

    .line 402
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->primaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;

    move-result-object v0

    .line 403
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->secondaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;

    move-result-object p1

    .line 404
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 406
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 407
    iget-object v2, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-nez v0, :cond_1

    .line 411
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 412
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected getDeviceID()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 202
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    return-object v0
.end method

.method public launchTrackingUrl(Ljava/lang/String;)V
    .locals 1

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {v0, p1}, Lcom/shopkick/app/tracking/TrackingUrlManager;->sendTrackingUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 3

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->uiEventLogUpdateCallbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 368
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 369
    invoke-interface {v0, p1}, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 371
    :cond_1
    invoke-interface {v0, p1}, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;->updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 372
    invoke-interface {v0, p1}, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 373
    invoke-interface {v0, p1}, Lcom/shopkick/app/screens/UIEventLogUpdateCallback;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 376
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 377
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScreen(Ljava/lang/Integer;)V

    .line 379
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->overlayEnum:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 380
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 382
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method public logEventRecord(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/String;)Z
    .locals 1

    .line 349
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/logging/UserEventLogger;->shouldLogRecord(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    invoke-virtual {p0, p2}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 351
    invoke-virtual {p0, p1, p3}, Lcom/shopkick/app/logging/UserEventLogger;->didLogRecord(Lcom/shopkick/app/logging/UserEventViewCore;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public maybeDetectedAppLaunchSIP()Z
    .locals 2

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    if-eqz v0, :cond_0

    .line 270
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->maybeRecordAppLaunchSIP(Ljava/lang/Integer;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public maybeStartMoatTracking(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->startMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    :cond_0
    return-void
.end method

.method public onAttach(Lcom/shopkick/app/logging/IUserEventListView;)V
    .locals 0

    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;I)V
    .locals 1

    .line 419
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 420
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventListView;->getDirection()I

    move-result p3

    iget v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->primaryDirection:I

    if-ne p3, v0, :cond_0

    .line 421
    iget-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 423
    :cond_0
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventListView;->getDisplayPositionWithinParent()Ljava/lang/Integer;

    move-result-object p1

    .line 424
    iget-object p3, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/HashMap;

    if-eqz p3, :cond_1

    .line 426
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    invoke-virtual {p3}, Ljava/util/HashMap;->size()I

    move-result p2

    if-gtz p2, :cond_1

    .line 428
    iget-object p2, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 499
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 500
    iget-object p2, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onMovedToScrapHeap(Lcom/shopkick/app/logging/IUserEventListView;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onScroll(Lcom/shopkick/app/logging/IUserEventListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/logging/IUserEventListView;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method

.method public removeParams(Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 144
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 145
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setSingleUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    if-eq v0, p1, :cond_1

    .line 161
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->singleEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->eventCoordinators:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    if-eqz p1, :cond_1

    .line 165
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->didShowPage:Z

    if-eqz v0, :cond_0

    .line 166
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onShowPage()V

    goto :goto_0

    .line 168
    :cond_0
    invoke-interface {p1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->onHidePage()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventLogger;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    return-void
.end method

.method public setUiEventLogUpdateCallback(Lcom/shopkick/app/screens/UIEventLogUpdateCallback;)V
    .locals 1

    .line 71
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventLogger;->uiEventLogUpdateCallbackWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public shouldLogRecord(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/String;)Z
    .locals 2

    .line 386
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->canRepeatLogAction(Ljava/lang/Integer;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    .line 389
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->primaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;

    move-result-object p2

    .line 390
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->secondaryDataPosForCore(Lcom/shopkick/app/logging/UserEventViewCore;)Ljava/lang/Object;

    move-result-object p1

    .line 391
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventLogger;->recordsByPrimaryDisplayPos:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/HashMap;

    if-eqz p2, :cond_1

    .line 393
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    if-eqz p1, :cond_1

    .line 395
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    return p1

    :cond_1
    return v0
.end method
