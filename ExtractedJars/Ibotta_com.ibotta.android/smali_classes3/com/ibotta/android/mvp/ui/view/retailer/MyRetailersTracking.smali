.class public Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;
.super Ljava/lang/Object;
.source "MyRetailersTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

.field protected myRebatesEventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "MyRebatesEventContextProvider"
    .end annotation
.end field

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    .line 33
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;)V

    return-void
.end method

.method private createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;
    .locals 3

    .line 86
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->myRebatesEventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getModuleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleName(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getModuleIndex()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 v1, 0x1

    .line 91
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setCounter(I)V

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->getIndex()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setEventAt(J)V

    return-object v0
.end method

.method private trackRetailerVisible(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V
    .locals 3

    .line 66
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->myRebatesEventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    const-string v0, "Tracking Retailer Visible: %1$s"

    const/4 v1, 0x1

    .line 69
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;)V
    .locals 1

    .line 60
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    if-eqz v0, :cond_0

    .line 61
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->trackRetailerVisible(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onInsufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSufficientlyVisible(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onTrackChildren(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 51
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->adapter:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 54
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->trackVisible(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackRetailerCardClicked(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)V
    .locals 3

    .line 75
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->myRebatesEventContextProvider:Lcom/ibotta/android/tracking/EventContextProvider;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/EventContextProvider;->provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 78
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 v0, 0x1

    .line 79
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string v1, "Tracking Retailer Clicked: %1$s"

    .line 81
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/MyRetailersTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
