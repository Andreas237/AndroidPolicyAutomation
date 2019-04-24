.class public Lcom/shopkick/app/awards/AwardsManager;
.super Ljava/lang/Object;
.source "AwardsManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/awards/AwardsManager$AwardDetails;,
        Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;,
        Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;,
        Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;,
        Lcom/shopkick/app/awards/AwardsManager$RequestType;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final AWARD_STATE_SHOW_REMINDER:I = 0x2

.field public static final AWARD_STATE_UPDATED:I = 0x1

.field public static final AWARD_STATE_WAITING_FOR_SERVER:I = 0x0

.field private static final DEBUG:Z = false

.field public static final EARNED_ALARM_ID:Ljava/lang/String; = "OfflineAwardEarned"

.field private static final LOG_TAG:Ljava/lang/String; = "AwardsManager"

.field private static final OFFLINE_HEADER_NAME:Ljava/lang/String; = "Offline"

.field public static final OFFLINE_SCAN_FAILED:Ljava/lang/String; = "offlineScanFailed"

.field public static final OFFLINE_SCAN_SUCCEEDED:Ljava/lang/String; = "offlineScanSucceeded"

.field public static final PENDING_REQUESTS_CHANGED:Ljava/lang/String; = "pending_requests_changed"

.field public static final PRODUCT_FAMILY_IDS_KEY:Ljava/lang/String; = "productFamilyIdsKey"

.field private static final REMINDER_ALARM_ID_1:Ljava/lang/String; = "OfflineAwardReminder1"

.field private static final REMINDER_ALARM_ID_2:Ljava/lang/String; = "OfflineAwardReminder2"


# instance fields
.field private alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

.field private batchRequestWrappers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private connectivityReceiver:Landroid/content/BroadcastReceiver;

.field private contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

.field private currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private currentRetry:I

.field private delayBatchRetryRunnable:Ljava/lang/Runnable;

.field private delayUpdateAlarm:Ljava/lang/Runnable;

.field private delayUpdateVisibleRequests:Ljava/lang/Runnable;

.field private final handler:Landroid/os/Handler;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pendingAwardDetails:Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private timeoutRunnable:Ljava/lang/Runnable;

.field private typeToCallbackMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/awards/AwardsManager$RequestType;",
            "Ljava/util/HashSet<",
            "Lcom/shopkick/app/awards/IAwardsManagerCallback;",
            ">;>;"
        }
    .end annotation
.end field

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/AlarmScheduler;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/queue/SKPersistentQueue;Lcom/shopkick/app/queue/SKPersistentQueue;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/account/UserAccount;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 97
    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    .line 98
    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    .line 100
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    .line 1098
    new-instance v0, Lcom/shopkick/app/awards/AwardsManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/awards/AwardsManager$2;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateVisibleRequests:Ljava/lang/Runnable;

    .line 1111
    new-instance v0, Lcom/shopkick/app/awards/-$$Lambda$AwardsManager$M3Wjy4jwgsHaYTtgrLSnw-9Q99I;

    invoke-direct {v0, p0}, Lcom/shopkick/app/awards/-$$Lambda$AwardsManager$M3Wjy4jwgsHaYTtgrLSnw-9Q99I;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateAlarm:Ljava/lang/Runnable;

    .line 124
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->contextRef:Ljava/lang/ref/WeakReference;

    .line 125
    iput-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 126
    iput-object p3, p0, Lcom/shopkick/app/awards/AwardsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 127
    iput-object p4, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 128
    iput-object p6, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 129
    iput-object p7, p0, Lcom/shopkick/app/awards/AwardsManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 130
    iput-object p8, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 131
    iput-object p5, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    .line 132
    iput-object p9, p0, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 133
    iput-object p10, p0, Lcom/shopkick/app/awards/AwardsManager;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 134
    iput-object p11, p0, Lcom/shopkick/app/awards/AwardsManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 136
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    .line 138
    new-instance p1, Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;

    invoke-direct {p1, p0}, Lcom/shopkick/app/awards/AwardsManager$DelayBatchRetryRunnable;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    .line 139
    new-instance p1, Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;

    invoke-direct {p1, p0}, Lcom/shopkick/app/awards/AwardsManager$TimeoutRunnable;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    const/4 p1, 0x0

    .line 141
    iput p1, p0, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/awards/AwardsManager;I)I
    .locals 0

    .line 55
    iput p1, p0, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/awards/AwardsManager;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->updateVisibleRequestsTimer()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/awards/AwardsManager;Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    return-void
.end method

.method private addToResponsesMap(Lcom/shopkick/app/queue/ApiObjectWrapper;Lcom/shopkick/app/fetchers/api/IAPIObject;Ljava/util/HashMap;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/awards/AwardsManager$RequestType;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;I)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 245
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    .line 246
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashMap;

    if-nez v1, :cond_1

    .line 248
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 249
    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    :cond_1
    iget-object p1, p1, Lcom/shopkick/app/queue/ApiObjectWrapper;->identifier:Ljava/lang/String;

    if-nez p1, :cond_2

    .line 255
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "unknown:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 257
    :cond_2
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private buildOverlaySpecForBatch(Ljava/util/ArrayList;IIZII)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;IIZII)",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;"
        }
    .end annotation

    .line 1281
    const-class v0, Lcom/shopkick/app/overlays/common/BatchSKOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    .line 1282
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    .line 1283
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;-><init>()V

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    .line 1284
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    .line 1285
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    if-eqz p4, :cond_0

    if-lez p5, :cond_0

    .line 1287
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f1104ac

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    .line 1289
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f1104b0

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    goto :goto_0

    :cond_1
    if-lez p5, :cond_2

    .line 1291
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f1104a3

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    :cond_2
    :goto_0
    if-lez p5, :cond_3

    if-lez p6, :cond_3

    .line 1295
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f1104a5

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method private buildOverlaySpecForInstantWalkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 1

    .line 1303
    const-class v0, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    .line 1304
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    .line 1305
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardStoreLogo:Ljava/lang/String;

    .line 1306
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->presenceCode:Ljava/lang/String;

    return-object v0
.end method

.method private context()Landroid/content/Context;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->contextRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method private extractAwards(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;"
        }
    .end annotation

    .line 821
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 822
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 823
    iget-object v2, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object v1, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    invoke-direct {p0, v2, v1}, Lcom/shopkick/app/awards/AwardsManager;->getAwards(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 825
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getAwards(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/awards/AwardsManager$RequestType;",
            "Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;"
        }
    .end annotation

    .line 833
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    .line 834
    sget-object v0, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne p1, v0, :cond_0

    .line 835
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    if-eqz p1, :cond_1

    .line 836
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz p2, :cond_1

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    if-eqz p2, :cond_1

    .line 837
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    return-object p1

    .line 839
    :cond_0
    sget-object v0, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne p1, v0, :cond_1

    .line 840
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    if-eqz p1, :cond_1

    .line 841
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz p2, :cond_1

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    if-eqz p2, :cond_1

    .line 842
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getAwardsTotal(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;)I"
        }
    .end annotation

    .line 851
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Award;

    .line 852
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/Award;->amount:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    .line 853
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Award;->amount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private getResponseType(Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/awards/AwardsManager$RequestType;
    .locals 0

    .line 1062
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    if-eqz p1, :cond_0

    .line 1063
    sget-object p1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    return-object p1

    .line 1065
    :cond_0
    sget-object p1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->NONE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    return-object p1
.end method

.method private getValidRequests(I)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;"
        }
    .end annotation

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 307
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 308
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 310
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-lez p1, :cond_1

    .line 311
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v3, p1, :cond_1

    goto :goto_1

    .line 315
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 316
    iget-object v5, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    add-long/2addr v5, v7

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    .line 317
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    return-object v1
.end method

.method private handleOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 3

    .line 1021
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-eqz v0, :cond_0

    .line 1022
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1023
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1027
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    iget-object v1, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    new-instance v2, Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;

    invoke-direct {v2, p0}, Lcom/shopkick/app/awards/AwardsManager$PresenceRequestAPICommonCallback;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    .line 1028
    invoke-virtual {p1, v0, v1, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlays(Ljava/util/ArrayList;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z

    goto :goto_0

    .line 1035
    :cond_0
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :goto_0
    return-void
.end method

.method private isLocationCheckinRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z
    .locals 0

    .line 1114
    instance-of p1, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    return p1
.end method

.method private isScanRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z
    .locals 0

    .line 1118
    instance-of p1, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    return p1
.end method

.method public static synthetic lambda$M3Wjy4jwgsHaYTtgrLSnw-9Q99I(Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->updateAlarms()V

    return-void
.end method

.method private logAddToRequestQueue(Lcom/shopkick/app/queue/ApiObjectWrapper;)V
    .locals 2

    .line 1206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1208
    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/awards/AwardsManager;->logRecordForWrapper(Lcom/shopkick/app/queue/ApiObjectWrapper;J)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    const/16 v0, 0x70

    .line 1209
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 1210
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPendingRequestCount(Ljava/lang/Integer;)V

    .line 1211
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logCompletedRequests(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;)V"
        }
    .end annotation

    .line 1215
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1217
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 1218
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/awards/AwardsManager;->logRecordForWrapper(Lcom/shopkick/app/queue/ApiObjectWrapper;J)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    const/16 v3, 0x71

    .line 1219
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 1220
    iget-object v3, p0, Lcom/shopkick/app/awards/AwardsManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private logExpiredRequests(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;)V"
        }
    .end annotation

    .line 1225
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1227
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 1228
    invoke-direct {p0, v2, v0, v1}, Lcom/shopkick/app/awards/AwardsManager;->logRecordForWrapper(Lcom/shopkick/app/queue/ApiObjectWrapper;J)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    const/16 v3, 0x72

    .line 1229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 1230
    iget-object v3, p0, Lcom/shopkick/app/awards/AwardsManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private logRecordForWrapper(Lcom/shopkick/app/queue/ApiObjectWrapper;J)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 3

    .line 1235
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 1236
    iget-object v1, p1, Lcom/shopkick/app/queue/ApiObjectWrapper;->createdTimestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sub-long/2addr p2, v1

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRequestAgeInMs(Ljava/lang/Integer;)V

    .line 1237
    instance-of p2, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    const/4 p3, 0x3

    if-eqz p2, :cond_2

    .line 1238
    check-cast p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    .line 1239
    iget p2, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->source:I

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    .line 1240
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineAwardEventType(Ljava/lang/Integer;)V

    goto :goto_0

    .line 1241
    :cond_0
    iget p2, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->source:I

    if-ne p2, p3, :cond_1

    const/4 p2, 0x2

    .line 1242
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineAwardEventType(Ljava/lang/Integer;)V

    .line 1244
    :cond_1
    :goto_0
    iget-object p2, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPresenceCode(Ljava/lang/String;)V

    .line 1245
    iget-object p2, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object p1, p1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 1248
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    .line 1249
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setServerResponseCode(Ljava/lang/Integer;)V

    goto :goto_1

    .line 1251
    :cond_2
    instance-of p2, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    if-eqz p2, :cond_3

    .line 1252
    check-cast p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    .line 1253
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineAwardEventType(Ljava/lang/Integer;)V

    .line 1254
    iget-object p2, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->productFamilyID:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 1255
    iget-object p2, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->latitude:Ljava/lang/Double;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 1256
    iget-object p2, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->longitude:Ljava/lang/Double;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 1257
    iget-object p2, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object p1, p1, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 1260
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    .line 1261
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setServerResponseCode(Ljava/lang/Integer;)V

    :cond_3
    :goto_1
    return-object v0
.end method

.method private notifyAwardsReceived(Ljava/util/HashMap;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/awards/AwardsManager$RequestType;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;>;)V"
        }
    .end annotation

    .line 262
    invoke-static {}, Lcom/shopkick/app/awards/AwardsManager$RequestType;->values()[Lcom/shopkick/app/awards/AwardsManager$RequestType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 263
    iget-object v4, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/HashSet;

    if-eqz v4, :cond_1

    .line 266
    invoke-virtual {v4}, Ljava/util/HashSet;->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/HashSet;

    .line 267
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/awards/IAwardsManagerCallback;

    .line 268
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/HashMap;

    if-eqz v6, :cond_0

    .line 270
    invoke-interface {v5, v6}, Lcom/shopkick/app/awards/IAwardsManagerCallback;->onAwardsResponseReceived(Ljava/util/HashMap;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private notifyOfflineWalkinOrScanSuccess(ZZLjava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v1, "OfflineAwardEarned"

    .line 712
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f110765

    .line 713
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 714
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1104a0

    .line 715
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 717
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f1104ad

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 719
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f1104b1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 721
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f1104a4

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v0

    .line 724
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Z

    .line 726
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xfaa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 727
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocalPnsStatus(Ljava/lang/String;)V

    .line 728
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    if-eqz p2, :cond_3

    .line 731
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "productFamilyIdsKey"

    .line 732
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "offlineScanSucceeded"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 737
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string p1, "Product Family ID"

    .line 738
    invoke-virtual {p3}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v6, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 740
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v1

    sget-object p1, Lcom/shopkick/logging/Area;->SCAN:Lcom/shopkick/logging/Area;

    .line 741
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v4

    const p1, 0x927c2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method private parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    .line 860
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->responseBody:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    .line 864
    :cond_0
    sget-object v1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    .line 865
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->responseBody:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    move-result-object p1

    return-object p1

    .line 866
    :cond_1
    sget-object v1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne p1, v1, :cond_2

    .line 867
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->responseBody:Ljava/lang/String;

    invoke-static {p1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method private registerNetworkListener()V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->connectivityReceiver:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_0

    .line 179
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 180
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 181
    new-instance v1, Lcom/shopkick/app/awards/AwardsManager$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/awards/AwardsManager$1;-><init>(Lcom/shopkick/app/awards/AwardsManager;)V

    iput-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->connectivityReceiver:Landroid/content/BroadcastReceiver;

    .line 197
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->connectivityReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private removeExpiredRequests()V
    .locals 11

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 349
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 350
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 353
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 356
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 357
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 358
    iget-object v7, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v9, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    add-long/2addr v7, v9

    cmp-long v5, v5, v7

    if-ltz v5, :cond_0

    .line 359
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    iget-object v5, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    sget-object v6, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne v5, v6, :cond_0

    .line 361
    check-cast v4, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    const/4 v3, 0x1

    .line 363
    iget-object v4, v4, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->productFamilyID:Ljava/lang/String;

    const/16 v5, 0xf

    .line 364
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 363
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 368
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeRequests(Ljava/util/ArrayList;)V

    .line 370
    invoke-direct {p0, v1}, Lcom/shopkick/app/awards/AwardsManager;->logExpiredRequests(Ljava/util/ArrayList;)V

    :cond_2
    if-eqz v3, :cond_3

    .line 374
    invoke-direct {p0, v2}, Lcom/shopkick/app/awards/AwardsManager;->storeFailedOfflineScans(Ljava/util/HashMap;)V

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_3
    return-void
.end method

.method private retryBatch()V
    .locals 4

    .line 746
    iget v0, p0, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRetries:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 747
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineRetryIntervalSeconds:Ljava/lang/Integer;

    .line 748
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    .line 747
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private scheduleAlarm(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    if-lt p3, p2, :cond_0

    .line 1193
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    sub-int v2, p3, p2

    const/4 v5, 0x1

    move-object v1, p1

    move-object v3, p4

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Z

    :cond_0
    return-void
.end method

.method private scheduleFirstAlarm(IZZ)V
    .locals 7

    .line 1155
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "OfflineAwardReminder1"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->exists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1158
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm1:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 1159
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f110767

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 1162
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104ae

    new-array v0, v2, [Ljava/lang/Object;

    .line 1163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1162
    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 1165
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104b2

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    .line 1167
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104a6

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_3
    move-object v6, v0

    :goto_0
    const-string v2, "OfflineAwardReminder1"

    move-object v1, p0

    move v4, p1

    .line 1169
    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/awards/AwardsManager;->scheduleAlarm(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private scheduleSecondAlarm(IZZ)V
    .locals 7

    .line 1173
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "OfflineAwardReminder2"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->exists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1176
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMinsLeftToTriggerAlarm2:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 1177
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f110768

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    .line 1180
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104af

    new-array v0, v2, [Ljava/lang/Object;

    .line 1181
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1180
    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 1183
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104b3

    new-array v0, v2, [Ljava/lang/Object;

    .line 1184
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1183
    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    .line 1186
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1104a7

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-virtual {p2, p3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_0

    :cond_3
    move-object v6, v0

    :goto_0
    const-string v2, "OfflineAwardReminder2"

    move-object v1, p0

    move v4, p1

    .line 1188
    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/awards/AwardsManager;->scheduleAlarm(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private showAwardDetails(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V
    .locals 1
    .param p4    # Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 906
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-nez v0, :cond_0

    return-void

    .line 913
    :cond_0
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    .line 914
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->totalKicksThisTrip:Ljava/lang/Integer;

    .line 915
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->awards:Ljava/util/List;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    .line 916
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->errMsg:Ljava/lang/String;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardErrorMessage:Ljava/lang/String;

    .line 917
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p3, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->extraWalkinMsg:Ljava/lang/String;

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    .line 918
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-boolean p3, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->isOnline:Z

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardIsOnline:Ljava/lang/Boolean;

    .line 919
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardOverlayState:Ljava/lang/Integer;

    .line 921
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    invoke-direct {p3}, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;-><init>()V

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    .line 922
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget p3, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->delta:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    .line 923
    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget p1, p1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;->finalKicksBalance:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    .line 925
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iput-object p4, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 927
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->maybeUpdateCurrentOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    const/4 p1, 0x0

    .line 930
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 934
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    return-void
.end method

.method private storeFailedOfflineScans(Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 754
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 756
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v3, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 755
    invoke-static {v0, v1, v2, v3}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 762
    invoke-virtual {v0, p1}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->putKeyValues(Ljava/util/HashMap;)V

    :cond_0
    return-void
.end method

.method private updateAlarms()V
    .locals 11

    .line 1123
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "OfflineAwardReminder1"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 1124
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "OfflineAwardReminder2"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 1126
    invoke-virtual {p0}, Lcom/shopkick/app/awards/AwardsManager;->clearExpiredRequests()V

    .line 1128
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 1129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 1133
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move v5, v3

    move v6, v5

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-gez v4, :cond_2

    .line 1134
    invoke-direct {p0, v7}, Lcom/shopkick/app/awards/AwardsManager;->isLocationCheckinRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-direct {p0, v7}, Lcom/shopkick/app/awards/AwardsManager;->isScanRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1136
    :cond_1
    iget-object v4, v7, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    sub-long/2addr v9, v1

    long-to-int v4, v9

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    const v9, 0xea60

    div-int/2addr v4, v9

    .line 1139
    :cond_2
    invoke-direct {p0, v7}, Lcom/shopkick/app/awards/AwardsManager;->isLocationCheckinRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z

    move-result v9

    if-eqz v9, :cond_3

    move v5, v8

    goto :goto_0

    .line 1141
    :cond_3
    invoke-direct {p0, v7}, Lcom/shopkick/app/awards/AwardsManager;->isScanRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z

    move-result v7

    if-eqz v7, :cond_0

    move v6, v8

    goto :goto_0

    :cond_4
    if-lez v4, :cond_5

    .line 1148
    invoke-direct {p0, v4, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->scheduleFirstAlarm(IZZ)V

    .line 1149
    invoke-direct {p0, v4, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->scheduleSecondAlarm(IZZ)V

    .line 1150
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateAlarm:Ljava/lang/Runnable;

    add-int/2addr v4, v8

    mul-int/lit8 v4, v4, 0x3c

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void
.end method

.method private updateLastRequestDisplay(ILcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;ZLcom/shopkick/app/fetchers/api/skapi/CommonResponseData;)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    .line 945
    iget-object v5, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-nez v5, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    if-nez v2, :cond_1

    .line 953
    new-instance v1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {v0, v1, v6, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    goto/16 :goto_0

    :cond_1
    if-nez v1, :cond_4

    .line 955
    iput-object v2, v0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v3, :cond_3

    .line 956
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    if-eqz v1, :cond_3

    .line 957
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 958
    iget-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/shopkick/app/awards/AwardsManager;->getAwardsTotal(Ljava/util/List;)I

    move-result v7

    .line 959
    iget-object v1, v4, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDelta:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v7

    .line 960
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsBalance:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int v8, v4, v1

    .line 961
    move-object v1, v2

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    .line 962
    new-instance v9, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->awards:Ljava/util/List;

    const/4 v5, 0x0

    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->extraWalkinMessage:Ljava/lang/String;

    const/4 v10, 0x1

    move-object v2, v9

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v10

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->locationInfo:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocationInfo;->locationId:Ljava/lang/String;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->kicksAwardedToday:Ljava/lang/Integer;

    .line 969
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 962
    invoke-direct {v0, v9, v2, v3, v1}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    goto :goto_0

    :cond_2
    if-nez p4, :cond_5

    .line 978
    new-instance v1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/4 v11, 0x0

    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->message:Ljava/lang/String;

    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->awardsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;

    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/CommonAwardsResponse;->extraWalkinMessage:Ljava/lang/String;

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v16}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {v0, v1, v6, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    goto :goto_0

    .line 994
    :cond_3
    new-instance v1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v23}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {v0, v1, v6, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    if-nez p4, :cond_5

    .line 1000
    new-instance v1, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    invoke-direct {v0, v1, v6, v5, v6}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    :cond_5
    :goto_0
    return-void
.end method

.method private updateLastRequestOffline()V
    .locals 8

    .line 1013
    new-instance v7, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/awards/AwardsManager$AwardDetails;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZII)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v7, v0, v1, v0}, Lcom/shopkick/app/awards/AwardsManager;->updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    return-void
.end method

.method private updateLastShowingPopup(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V
    .locals 2

    .line 885
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 887
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-nez v0, :cond_0

    return-void

    .line 894
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 895
    iput-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->pendingAwardDetails:Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    return-void

    .line 899
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/awards/AwardsManager;->showAwardDetails(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    return-void
.end method

.method private updateVisibleRequestsTimer()V
    .locals 6

    .line 1074
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateVisibleRequests:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1076
    invoke-virtual {p0}, Lcom/shopkick/app/awards/AwardsManager;->getVisibleLocationRequests()Ljava/util/ArrayList;

    move-result-object v0

    .line 1077
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 1081
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    .line 1082
    invoke-direct {p0, v2}, Lcom/shopkick/app/awards/AwardsManager;->isLocationCheckinRequest(Lcom/shopkick/app/queue/ApiObjectWrapper;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    .line 1087
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    if-eqz v1, :cond_4

    .line 1089
    iget-object v0, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-gez v0, :cond_3

    goto :goto_0

    .line 1094
    :cond_3
    iget-object v0, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr v0, v2

    .line 1095
    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v3, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateVisibleRequests:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 1090
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "pending_requests_changed"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method


# virtual methods
.method public clearExpiredRequests()V
    .locals 9

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 397
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 398
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 399
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 400
    iget-object v5, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->gracePeriodDuration:Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    add-long/2addr v5, v7

    cmp-long v5, v2, v5

    if-ltz v5, :cond_0

    .line 401
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 404
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeRequests(Ljava/util/ArrayList;)V

    .line 405
    invoke-direct {p0, v1}, Lcom/shopkick/app/awards/AwardsManager;->logExpiredRequests(Ljava/util/ArrayList;)V

    return-void
.end method

.method public clearNotification()V
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v1, "OfflineAwardEarned"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 24

    move-object/from16 v6, p0

    move-object/from16 v0, p2

    .line 562
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 563
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 564
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makeBatchRequest() fetch completed"

    const/4 v7, 0x0

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v1, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    move-object/from16 v2, p1

    if-ne v2, v1, :cond_12

    .line 568
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 569
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 570
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makeBatchRequest() got response for batchRequest [batchRequestWrappers.size:%1$d]"

    const/4 v8, 0x1

    new-array v5, v8, [Ljava/lang/Object;

    iget-object v9, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    if-nez v9, :cond_0

    const-string v9, "null"

    goto :goto_0

    .line 572
    :cond_0
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :goto_0
    aput-object v9, v5, v7

    .line 570
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v9, 0x0

    .line 574
    iput-object v9, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    .line 576
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_10

    iget-object v1, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_10

    .line 577
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 578
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 579
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makeBatchRequest() successful response"

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iput v7, v6, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    .line 583
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;

    .line 584
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 585
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 589
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 592
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 594
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 595
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 596
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "AwardsManager.makeBatchRequest() [apiResponses.size:%1$d]"

    new-array v4, v8, [Ljava/lang/Object;

    iget-object v5, v10, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    if-nez v5, :cond_1

    const-string v5, "null"

    goto :goto_1

    :cond_1
    iget-object v5, v10, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    .line 598
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_1
    aput-object v5, v4, v7

    .line 596
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    move v4, v7

    move v5, v4

    move v15, v5

    move/from16 v16, v15

    .line 601
    :goto_2
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v15, v0, :cond_c

    .line 602
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 603
    iget-object v0, v10, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->apiResponses:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    .line 608
    iput-object v2, v3, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    .line 610
    iget-object v0, v3, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    invoke-direct {v6, v0, v2}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v1

    .line 611
    instance-of v0, v1, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;

    if-nez v0, :cond_2

    move-object v0, v9

    goto :goto_3

    :cond_2
    move-object v0, v1

    check-cast v0, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;

    .line 612
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;->commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    :goto_3
    if-eqz v0, :cond_3

    .line 613
    iget-object v8, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->retry:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_4

    :cond_3
    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->retry:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_5

    :cond_4
    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    move v8, v7

    .line 617
    :goto_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v17

    .line 618
    invoke-virtual/range {v17 .. v17}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v9

    sget-object v17, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 619
    invoke-virtual/range {v17 .. v17}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v18

    sget-object v17, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual/range {v17 .. v17}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v20

    move-object/from16 v17, v0

    move-object/from16 p2, v1

    or-long v0, v18, v20

    move/from16 v18, v4

    const-string v4, "AwardsManager.makeBatchRequest() attempting to update display"

    move/from16 v19, v5

    new-array v5, v7, [Ljava/lang/Object;

    invoke-virtual {v9, v0, v1, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 621
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-ne v3, v0, :cond_6

    .line 622
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 623
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 624
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v1, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v20

    or-long v4, v4, v20

    const-string v1, "AwardsManager.makeBatchRequest() apiRequestWrapper == currPopupApiRequestWrapper"

    new-array v9, v7, [Ljava/lang/Object;

    invoke-virtual {v0, v4, v5, v1, v9}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 626
    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 630
    invoke-virtual {v10}, Lcom/shopkick/app/fetchers/api/skapi/BatchResponse;->commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    move-object/from16 v9, v17

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    move-object v7, v2

    move-object v2, v4

    move-object/from16 p2, v10

    move-object v10, v3

    move-object v3, v9

    move-object v9, v4

    move/from16 v22, v18

    move v4, v8

    move/from16 v23, v19

    .line 626
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/awards/AwardsManager;->updateLastRequestDisplay(ILcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;ZLcom/shopkick/app/fetchers/api/skapi/CommonResponseData;)V

    goto/16 :goto_5

    :cond_6
    move-object/from16 v9, p2

    move-object v7, v2

    move-object/from16 p2, v10

    move/from16 v22, v18

    move/from16 v23, v19

    move-object v10, v3

    .line 631
    iget-object v0, v7, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_9

    .line 632
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 633
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 634
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "AwardsManager.makeBatchRequest() apiResponse.statusCode == SKAPI.ApiStatusCodeSuccess"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 637
    new-instance v0, Lcom/shopkick/app/queue/ApiObjectWrapper;

    invoke-direct {v0}, Lcom/shopkick/app/queue/ApiObjectWrapper;-><init>()V

    .line 638
    iget-object v1, v10, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iput-object v1, v0, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    .line 639
    iput-object v7, v0, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    .line 640
    iget-object v1, v6, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 643
    iget-object v0, v10, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    sget-object v1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne v0, v1, :cond_7

    move/from16 v5, v23

    const/4 v4, 0x1

    goto :goto_6

    .line 645
    :cond_7
    iget-object v0, v10, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    sget-object v1, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne v0, v1, :cond_9

    .line 647
    move-object v3, v10

    check-cast v3, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    .line 648
    iget-object v0, v10, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    .line 649
    invoke-direct {v6, v0, v7}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    .line 651
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_8

    .line 653
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v4, v22

    const/4 v5, 0x1

    const/16 v16, 0x1

    goto :goto_6

    .line 655
    :cond_8
    iget-object v1, v3, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->productFamilyID:Ljava/lang/String;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    .line 656
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 655
    invoke-virtual {v14, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v4, v22

    move/from16 v5, v23

    const/16 v16, 0x1

    goto :goto_6

    :cond_9
    :goto_5
    move/from16 v4, v22

    move/from16 v5, v23

    .line 662
    :goto_6
    iget-object v0, v7, Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_a

    .line 663
    invoke-direct {v6, v10, v9, v11, v15}, Lcom/shopkick/app/awards/AwardsManager;->addToResponsesMap(Lcom/shopkick/app/queue/ApiObjectWrapper;Lcom/shopkick/app/fetchers/api/IAPIObject;Ljava/util/HashMap;I)V

    :cond_a
    if-nez v8, :cond_b

    .line 668
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v10, p2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    goto/16 :goto_2

    :cond_c
    move/from16 v22, v4

    move/from16 v23, v5

    .line 672
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0, v12}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeRequests(Ljava/util/ArrayList;)V

    .line 673
    invoke-direct {v6, v12}, Lcom/shopkick/app/awards/AwardsManager;->logCompletedRequests(Ljava/util/ArrayList;)V

    const/4 v0, 0x0

    .line 674
    iput-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    .line 677
    invoke-direct {v6, v14}, Lcom/shopkick/app/awards/AwardsManager;->storeFailedOfflineScans(Ljava/util/HashMap;)V

    .line 680
    invoke-direct {v6, v11}, Lcom/shopkick/app/awards/AwardsManager;->notifyAwardsReceived(Ljava/util/HashMap;)V

    .line 681
    iget-object v1, v6, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "pending_requests_changed"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    if-eqz v16, :cond_d

    move/from16 v5, v23

    if-nez v5, :cond_e

    .line 684
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "offlineScanFailed"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_7

    :cond_d
    move/from16 v5, v23

    .line 686
    :cond_e
    :goto_7
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_f

    move/from16 v4, v22

    .line 687
    invoke-direct {v6, v4, v5, v13}, Lcom/shopkick/app/awards/AwardsManager;->notifyOfflineWalkinOrScanSuccess(ZZLjava/util/ArrayList;)V

    .line 688
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->showGrantedAwards()V

    .line 690
    :cond_f
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->updateAlarms()V

    const/4 v0, 0x0

    .line 691
    iput v0, v6, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    goto :goto_8

    .line 693
    :cond_10
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->updateLastRequestOffline()V

    .line 694
    iget v0, v6, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v6, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    .line 697
    :goto_8
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_11

    .line 698
    iget-object v1, v6, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 701
    :cond_11
    iget-object v0, v6, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 702
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->retryBatch()V

    :cond_12
    return-void
.end method

.method public containsRequestWithIdentifier(Ljava/lang/String;)Z
    .locals 2

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 384
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 385
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 386
    iget-object v1, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->identifier:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public destroy()V
    .locals 3

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 146
    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 147
    iput-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 151
    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 152
    iput-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    .line 155
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 157
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->connectivityReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->context()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->connectivityReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_4

    .line 159
    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    :cond_4
    return-void
.end method

.method public getValidRequests()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 324
    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->getValidRequests(I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getVisibleLocationRequests()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/LocationApiRequestWrapper;",
            ">;"
        }
    .end annotation

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 332
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 333
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 335
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 336
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 337
    instance-of v5, v4, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    if-eqz v5, :cond_0

    iget-object v5, v4, Lcom/shopkick/app/queue/ApiObjectWrapper;->expirationTimestamp:Ljava/lang/Long;

    .line 338
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v5, v2, v5

    if-gez v5, :cond_0

    .line 339
    check-cast v4, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public isPresenceCodeInQueue(Ljava/lang/String;Z)J
    .locals 3

    .line 287
    invoke-virtual {p0}, Lcom/shopkick/app/awards/AwardsManager;->getValidRequests()Ljava/util/ArrayList;

    move-result-object v0

    .line 288
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 289
    instance-of v2, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    if-eqz v2, :cond_0

    .line 290
    check-cast v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    if-eqz p2, :cond_1

    .line 292
    iget-object v2, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 293
    iget-object p1, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->createdTimestamp:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1

    .line 295
    :cond_1
    iget-object v2, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 296
    iget-object p1, v1, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->createdTimestamp:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1

    :cond_2
    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public makeBatchRequest()V
    .locals 14

    .line 514
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 515
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 516
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "AwardsManager.makeBatchRequest()"

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 527
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 529
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->removeExpiredRequests()V

    .line 530
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    .line 531
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;->apiRequests:Ljava/util/List;

    .line 533
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxBatchSize:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->getValidRequests(I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    .line 534
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequestWrappers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 535
    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-eqz v2, :cond_1

    if-eq v2, v1, :cond_2

    .line 536
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 537
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;-><init>()V

    const-string v5, "Offline"

    .line 538
    iput-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;->name:Ljava/lang/String;

    const-string v5, "1"

    .line 539
    iput-object v5, v3, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;->value:Ljava/lang/String;

    .line 540
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    iget-object v3, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->headers:Ljava/util/List;

    .line 543
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;->apiRequests:Ljava/util/List;

    iget-object v1, v1, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiRequest:Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 546
    :cond_3
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 547
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 548
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v1, v5

    const-string v3, "AwardsManager.makeBatchRequest() fetching"

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 549
    iget-object v6, p0, Lcom/shopkick/app/awards/AwardsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v7, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v8, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    const/4 v10, 0x0

    sget-object v11, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v12, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v13, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v9, p0

    invoke-virtual/range {v6 .. v13}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    .line 551
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 552
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 553
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v1, v5

    const-string v3, "AwardsManager.makeBatchRequest() end"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 519
    :cond_4
    :goto_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 520
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 521
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v1, v5

    const-string v3, "AwardsManager.makeBatchRequest() Returning early [batchRequest:%1$s apiRequestQueueController.hasQueuedObjects%2$s]"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/shopkick/app/awards/AwardsManager;->batchRequest:Lcom/shopkick/app/fetchers/api/skapi/BatchRequest;

    aput-object v6, v5, v4

    const/4 v4, 0x1

    iget-object v6, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 524
    invoke-virtual {v6}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v4

    .line 521
    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public makePresenceRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v8, p5

    .line 418
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 419
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 420
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makePresenceRequest() [identifier:%1$s presenceCode:%2$s locationId:%3$s locationImageURL:%4$s]"

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object p1, v5, v13

    const/4 v6, 0x1

    aput-object v10, v5, v6

    const/4 v6, 0x2

    aput-object v11, v5, v6

    const/4 v6, 0x3

    aput-object v12, v5, v6

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 427
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    move-object/from16 v3, p5

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->buildNetworkRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/network/NetworkRequest;

    move-result-object v5

    if-nez v5, :cond_0

    .line 431
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 432
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 433
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makePresenceRequest() Invalid network request, exiting"

    new-array v5, v13, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 437
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineGracePeriodMins:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    .line 438
    iget-object v3, v0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRequestAgeMins:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3c

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    .line 439
    iget-object v6, v8, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    add-long/2addr v6, v3

    .line 441
    new-instance v14, Lcom/shopkick/app/queue/LocationApiRequestWrapper;

    sget-object v9, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinRequest;->currTimestamp:Ljava/lang/Long;

    .line 447
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 448
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    move-object v1, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p6

    move-object v6, v9

    move-object v7, v8

    move-object v8, v15

    move-object/from16 v9, v16

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/queue/LocationApiRequestWrapper;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 449
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1, v14}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 450
    invoke-direct {v0, v14}, Lcom/shopkick/app/awards/AwardsManager;->logAddToRequestQueue(Lcom/shopkick/app/queue/ApiObjectWrapper;)V

    .line 451
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->updateVisibleRequestsTimer()V

    .line 453
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-nez v1, :cond_1

    .line 455
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 456
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 457
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "AwardsManager.makePresenceRequest() Setting request wrapper"

    new-array v5, v13, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iput-object v14, v0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiRequestWrapper:Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 461
    invoke-direct {v0, v11, v12, v10}, Lcom/shopkick/app/awards/AwardsManager;->buildOverlaySpecForInstantWalkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 462
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardOverlayState:Ljava/lang/Integer;

    .line 463
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0, v1}, Lcom/shopkick/app/awards/AwardsManager;->handleOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 464
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 465
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    iget-object v3, v0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineTimeoutIntervalSeconds:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 466
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentAwardOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v1, :cond_2

    .line 467
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardOverlayState:Ljava/lang/Integer;

    .line 470
    :cond_2
    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->updateAlarms()V

    .line 471
    iput v13, v0, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    .line 472
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->makeBatchRequest()V

    return-void
.end method

.method public makeScanRequest(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    .line 480
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x0

    move-object/from16 v3, p3

    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->buildNetworkRequest(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/network/NetworkRequest;

    move-result-object v14

    if-nez v14, :cond_0

    return-void

    .line 490
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineGracePeriodMins:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    .line 491
    iget-object v3, v0, Lcom/shopkick/app/awards/AwardsManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v3, v3, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->offlineMaxRequestAgeMins:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3c

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    .line 492
    iget-object v5, v8, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v5, v3

    .line 494
    new-instance v3, Lcom/shopkick/app/queue/ScanApiRequestWrapper;

    iget-object v11, v8, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    iget-object v12, v8, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lat:Ljava/lang/Double;

    iget-object v13, v8, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lng:Ljava/lang/Double;

    sget-object v15, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object v4, v8, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    .line 502
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    .line 503
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v18

    move-object v8, v3

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v16, v4

    invoke-direct/range {v8 .. v18}, Lcom/shopkick/app/queue/ScanApiRequestWrapper;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 505
    iget-object v1, v0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 506
    invoke-direct {v0, v3}, Lcom/shopkick/app/awards/AwardsManager;->logAddToRequestQueue(Lcom/shopkick/app/queue/ApiObjectWrapper;)V

    .line 508
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->updateAlarms()V

    const/4 v1, 0x0

    .line 509
    iput v1, v0, Lcom/shopkick/app/awards/AwardsManager;->currentRetry:I

    .line 510
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/awards/AwardsManager;->makeBatchRequest()V

    return-void
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

    const-string p2, "UserAccountIdChangedEvent"

    .line 203
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string p2, "OfflineAwardReminder1"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 207
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string p2, "OfflineAwardReminder2"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    .line 208
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->delayBatchRetryRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 209
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateVisibleRequests:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/awards/AwardsManager;->delayUpdateAlarm:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 212
    iget-object p1, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "pending_requests_changed"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method public onOverlayHandlingDone()V
    .locals 4

    .line 1041
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->timeoutRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1043
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "pending_requests_changed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 1044
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz v0, :cond_1

    .line 1045
    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->getResponseType(Lcom/shopkick/app/fetchers/api/IAPIObject;)Lcom/shopkick/app/awards/AwardsManager$RequestType;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_0

    .line 1048
    invoke-virtual {v0}, Ljava/util/HashSet;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 1049
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/awards/IAwardsManagerCallback;

    .line 1050
    iget-object v3, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

    invoke-interface {v1, v3}, Lcom/shopkick/app/awards/IAwardsManagerCallback;->onPopupDismissed(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    goto :goto_0

    .line 1053
    :cond_0
    iput-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->currPopupApiResponse:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 1058
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->hasQueuedObjects()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/shopkick/app/awards/AwardsManager;->showGrantedAwards()V

    :cond_2
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public registerCallback(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/awards/IAwardsManagerCallback;)V
    .locals 2

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-nez v0, :cond_0

    .line 224
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public registerListeners()V
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 173
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->registerNetworkListener()V

    .line 174
    invoke-direct {p0}, Lcom/shopkick/app/awards/AwardsManager;->updateVisibleRequestsTimer()V

    return-void
.end method

.method public showGrantedAwards()V
    .locals 10

    .line 777
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->isAppBackgrounded()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 781
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 782
    invoke-virtual {v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getObjects()Ljava/util/ArrayList;

    move-result-object v0

    .line 786
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v7, v2

    move v8, v7

    move v9, v8

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 787
    iget-object v3, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    sget-object v4, Lcom/shopkick/app/awards/AwardsManager$RequestType;->WALKIN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne v3, v4, :cond_2

    const/4 v2, 0x1

    move v7, v2

    goto :goto_0

    .line 789
    :cond_2
    iget-object v3, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    sget-object v4, Lcom/shopkick/app/awards/AwardsManager$RequestType;->SCAN_TYPE:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    if-ne v3, v4, :cond_1

    .line 792
    iget-object v3, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->requestType:Lcom/shopkick/app/awards/AwardsManager$RequestType;

    iget-object v2, v2, Lcom/shopkick/app/queue/ApiObjectWrapper;->apiResponse:Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;

    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/awards/AwardsManager;->parseResponse(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/fetchers/api/skapi/ApiResponse;)Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    if-eqz v2, :cond_3

    .line 794
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 801
    :cond_4
    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->extractAwards(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    .line 802
    invoke-direct {p0, v4}, Lcom/shopkick/app/awards/AwardsManager;->getAwardsTotal(Ljava/util/List;)I

    move-result v5

    .line 803
    iget-object v1, p0, Lcom/shopkick/app/awards/AwardsManager;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeRequests(Ljava/util/ArrayList;)V

    .line 804
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 805
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 807
    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v6

    move-object v3, p0

    .line 805
    invoke-direct/range {v3 .. v9}, Lcom/shopkick/app/awards/AwardsManager;->buildOverlaySpecForBatch(Ljava/util/ArrayList;IIZII)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    .line 811
    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->handleOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    goto :goto_1

    :cond_5
    if-lez v9, :cond_6

    if-nez v8, :cond_6

    .line 814
    const-class v0, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;

    invoke-static {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    const-string v1, "offline_scan_failure"

    .line 815
    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 816
    invoke-direct {p0, v0}, Lcom/shopkick/app/awards/AwardsManager;->handleOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public showPendingAwards()V
    .locals 3

    .line 768
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->pendingAwardDetails:Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 769
    invoke-direct {p0, v0, v2, v1, v2}, Lcom/shopkick/app/awards/AwardsManager;->showAwardDetails(Lcom/shopkick/app/awards/AwardsManager$AwardDetails;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    .line 770
    iput-object v2, p0, Lcom/shopkick/app/awards/AwardsManager;->pendingAwardDetails:Lcom/shopkick/app/awards/AwardsManager$AwardDetails;

    :cond_0
    return-void
.end method

.method public unregisterCallback(Lcom/shopkick/app/awards/AwardsManager$RequestType;Lcom/shopkick/app/awards/IAwardsManagerCallback;)V
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/awards/AwardsManager;->typeToCallbackMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    if-eqz p1, :cond_0

    .line 233
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
