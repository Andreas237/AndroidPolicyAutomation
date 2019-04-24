.class public Lcom/shopkick/app/logging/UserEventViewCore;
.super Ljava/lang/Object;
.source "UserEventViewCore.java"

# interfaces
.implements Lcom/shopkick/app/logging/IUserEventView;


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field public static final ADVERTISEMENTID_KEY:Ljava/lang/String; = "moatClientLevel3"

.field public static final ZMOATIID_KEY:Ljava/lang/String; = "zMoatIID"


# instance fields
.field private adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

.field private constraintKeys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private displayPos:Ljava/lang/Integer;

.field private elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

.field private eventCoordinatorRefs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;>;"
        }
    .end annotation
.end field

.field private horizontalDisplayPos:Ljava/lang/Integer;

.field private repeatableLogActions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private suppressActionUntilManuallyTriggered:Z

.field private suppressImpressions:Z

.field private trackingUrlList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private useZMoatIID:Z

.field private userEventLoggerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            ">;"
        }
    .end annotation
.end field

.field private verticalDisplayPos:Ljava/lang/Integer;

.field private viewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    .line 53
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->viewRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private generateZMoatIIDWithAdvertisementID(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 245
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "yyyy-MM-dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "UTC"

    .line 246
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 247
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 249
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/UserEventLogger;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, ""

    if-eqz v1, :cond_1

    .line 252
    invoke-virtual {v1}, Lcom/shopkick/app/logging/UserEventLogger;->getDeviceID()Ljava/lang/String;

    move-result-object v2

    .line 255
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v3, "%s-%s-%s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object p1, v4, v0

    const/4 p1, 0x2

    aput-object v2, v4, p1

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private processTrackingUrl(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 335
    new-instance v0, Ljava/util/ArrayList;

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 336
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 337
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 338
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 339
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p1
.end method


# virtual methods
.method public addImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 265
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventViewCore;->stopMoatTracking()V

    return-void
.end method

.method public canRepeatLogAction(Ljava/lang/Integer;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->repeatableLogActions:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    .line 284
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getDisplayPos()Ljava/lang/Integer;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->displayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHorizontalDisplayPos()Ljava/lang/Integer;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->horizontalDisplayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method public getVerticalDisplayPos()Ljava/lang/Integer;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->verticalDisplayPos:Ljava/lang/Integer;

    return-object v0
.end method

.method public recordPotentialScreenTransitionPerformClick()V
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventLogger;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 330
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedPerformClick(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_1
    return-void
.end method

.method public removeImpressionConstraintKey(Ljava/lang/String;)V
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 272
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventViewCore;->tryTriggeringShowElement()V

    :cond_0
    return-void
.end method

.method public setRepeatableLogActions(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 277
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->repeatableLogActions:Ljava/util/ArrayList;

    return-void
.end method

.method public setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V
    .locals 2

    .line 82
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    .line 83
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    .line 84
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->eventCoordinatorRefs:Ljava/util/ArrayList;

    .line 85
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    .line 86
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->trackingUrlList:Ljava/util/ArrayList;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    const/4 v0, 0x0

    .line 88
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressImpressions:Z

    .line 89
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressActionUntilManuallyTriggered:Z

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->verticalDisplayPos:Ljava/lang/Integer;

    .line 91
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->horizontalDisplayPos:Ljava/lang/Integer;

    .line 92
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->displayPos:Ljava/lang/Integer;

    .line 93
    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 94
    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->useZMoatIID:Z

    goto :goto_0

    .line 96
    :cond_0
    iget-boolean v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressImpressions:Z

    .line 97
    iget-boolean v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressActionUntilManuallyTriggered:Z

    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressActionUntilManuallyTriggered:Z

    .line 98
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->verticalDisplayPos:Ljava/lang/Integer;

    .line 99
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListDisplayPos:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->horizontalDisplayPos:Ljava/lang/Integer;

    .line 100
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 102
    invoke-direct {p0, v0}, Lcom/shopkick/app/logging/UserEventViewCore;->processTrackingUrl(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->trackingUrlList:Ljava/util/ArrayList;

    .line 104
    :cond_1
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->displayPos:Ljava/lang/Integer;

    .line 105
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    .line 106
    iget-boolean v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    iput-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->useZMoatIID:Z

    .line 110
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressImpressions:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    if-nez p2, :cond_3

    return-void

    .line 118
    :cond_3
    invoke-virtual {p2}, Lcom/shopkick/app/logging/UserEventLogger;->getSingleUserEventCoordinator()Lcom/shopkick/app/logging/IUserEventCoordinator;

    move-result-object p2

    if-eqz p3, :cond_5

    .line 121
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    if-eqz p1, :cond_4

    .line 122
    iget-object p2, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinator:Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 124
    :cond_4
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->userEventCoordinators:Ljava/util/ArrayList;

    goto :goto_1

    .line 126
    :cond_5
    new-instance p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p3}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    :goto_1
    if-eqz p1, :cond_7

    .line 131
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/logging/IUserEventCoordinator;

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->eventCoordinatorRefs:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 134
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    invoke-interface {p2, p0, v0}, Lcom/shopkick/app/logging/IUserEventCoordinator;->registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;)V

    goto :goto_2

    .line 136
    :cond_6
    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    iget-object v1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListViewCell:Landroid/view/View;

    invoke-interface {p2, p0, v0, v1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;Landroid/view/View;)V

    goto :goto_2

    .line 142
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->eventCoordinatorRefs:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    if-eqz p1, :cond_8

    .line 144
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    invoke-interface {p2, p0, p1}, Lcom/shopkick/app/logging/IUserEventCoordinator;->registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;)V

    goto :goto_3

    .line 146
    :cond_8
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListViewCell:Landroid/view/View;

    iget-object v0, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->horizontalListViewCell:Landroid/view/View;

    invoke-interface {p2, p0, p1, v0}, Lcom/shopkick/app/logging/IUserEventCoordinator;->registerEventViewCore(Lcom/shopkick/app/logging/UserEventViewCore;Landroid/view/View;Landroid/view/View;)V

    :cond_9
    :goto_3
    if-eqz p3, :cond_a

    .line 153
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    if-eqz p1, :cond_a

    .line 154
    iget-object p1, p3, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 155
    invoke-virtual {p0, p2}, Lcom/shopkick/app/logging/UserEventViewCore;->addImpressionConstraintKey(Ljava/lang/String;)V

    goto :goto_4

    .line 160
    :cond_a
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventViewCore;->tryTriggeringShowElement()V

    return-void
.end method

.method public setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V
    .locals 0

    .line 174
    invoke-static {p2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 175
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    .line 176
    iput-boolean p3, p0, Lcom/shopkick/app/logging/UserEventViewCore;->useZMoatIID:Z

    .line 177
    invoke-virtual {p0, p1}, Lcom/shopkick/app/logging/UserEventViewCore;->startMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    :cond_0
    return-void
.end method

.method protected startMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V
    .locals 5

    if-eqz p1, :cond_5

    .line 188
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityProvider:Ljava/lang/Integer;

    .line 189
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->viewRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    return-void

    .line 197
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_2

    return-void

    .line 203
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    if-eqz v1, :cond_3

    return-void

    .line 208
    :cond_3
    iget-boolean v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->useZMoatIID:Z

    if-eqz v1, :cond_4

    .line 209
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityParams:Ljava/util/Map;

    const-string/jumbo v2, "zMoatIID"

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityParams:Ljava/util/Map;

    const-string v4, "moatClientLevel3"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {p0, v3}, Lcom/shopkick/app/logging/UserEventViewCore;->generateZMoatIIDWithAdvertisementID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    :cond_4
    invoke-static {}, Lcom/moat/analytics/mobile/spck/MoatFactory;->create()Lcom/moat/analytics/mobile/spck/MoatFactory;

    move-result-object v1

    .line 213
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;->viewabilityParams:Ljava/util/Map;

    invoke-virtual {v1, v0, p1}, Lcom/moat/analytics/mobile/spck/MoatFactory;->createNativeDisplayTracker(Landroid/view/View;Ljava/util/Map;)Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    .line 214
    iget-object p1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    invoke-interface {p1}, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;->startTracking()V

    return-void

    :cond_5
    :goto_0
    return-void
.end method

.method public stopMoatTracking()V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    if-eqz v0, :cond_0

    .line 235
    invoke-interface {v0}, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;->stopTracking()V

    const/4 v0, 0x0

    .line 236
    iput-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    :cond_0
    return-void
.end method

.method public triggerEvent()V
    .locals 3

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventLogger;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 321
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getAction()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 322
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->toString()Ljava/lang/String;

    move-result-object v1

    .line 323
    iget-object v2, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-virtual {v0, p0, v2, v1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method public triggerMoatClick()V
    .locals 2

    .line 226
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    if-nez v0, :cond_0

    return-void

    .line 230
    :cond_0
    sget-object v1, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;->CLICK:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;

    invoke-interface {v0, v1}, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;->reportUserInteractionEvent(Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;)V

    return-void
.end method

.method public triggerMoatTouch()V
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->adTracker:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;

    if-nez v0, :cond_0

    return-void

    .line 222
    :cond_0
    sget-object v1, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;->TOUCH:Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;

    invoke-interface {v0, v1}, Lcom/moat/analytics/mobile/spck/NativeDisplayTracker;->reportUserInteractionEvent(Lcom/moat/analytics/mobile/spck/NativeDisplayTracker$MoatUserInteractionType;)V

    return-void
.end method

.method public tryTriggeringEvent()V
    .locals 1

    .line 314
    iget-boolean v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressActionUntilManuallyTriggered:Z

    if-nez v0, :cond_0

    .line 315
    invoke-virtual {p0}, Lcom/shopkick/app/logging/UserEventViewCore;->triggerEvent()V

    :cond_0
    return-void
.end method

.method public tryTriggeringShowElement()V
    .locals 4

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/logging/UserEventViewCore;->userEventLoggerRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventLogger;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 289
    :goto_0
    iget-boolean v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->suppressImpressions:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->constraintKeys:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 292
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 293
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    iget-object v3, p0, Lcom/shopkick/app/logging/UserEventViewCore;->elementRecord:Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const/4 v2, 0x3

    .line 295
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 296
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->toString()Ljava/lang/String;

    move-result-object v2

    .line 297
    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 301
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->trackingUrlList:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 302
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 303
    invoke-virtual {v0, v2}, Lcom/shopkick/app/logging/UserEventLogger;->launchTrackingUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 308
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/logging/UserEventViewCore;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->maybeStartMoatTracking(Lcom/shopkick/app/logging/UserEventViewCore;Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;)V

    :cond_2
    return-void
.end method
