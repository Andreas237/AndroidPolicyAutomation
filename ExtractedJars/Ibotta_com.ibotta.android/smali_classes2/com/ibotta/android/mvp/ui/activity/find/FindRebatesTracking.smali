.class public Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;
.super Ljava/lang/Object;
.source "FindRebatesTracking.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

.field private final eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

.field private final trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;Lcom/ibotta/android/tracking/proprietary/event/EventContributor;Lcom/ibotta/android/tracking/proprietary/TrackingQueue;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    return-void
.end method

.method private createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;
    .locals 2

    .line 86
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->eventContributor:Lcom/ibotta/android/tracking/proprietary/event/EventContributor;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/EventContributor;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getModuleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleName(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->getModuleIndex()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setModuleIndex(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 91
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setCounter(I)V

    .line 92
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 93
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setEventAt(J)V

    return-object v0
.end method


# virtual methods
.method public onInsufficientlyVisible(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 40
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

    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 48
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->setVisible(Z)V

    goto :goto_0

    :cond_2
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

    .line 55
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

    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->adapter:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 63
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;->setVisible(Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public trackRetailerClicked(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    .line 78
    sget-object p2, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->RETAILER:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    const/4 p2, 0x1

    .line 79
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;->setClicked(Ljava/lang/Boolean;)V

    const-string p3, "Tracking Retailer Clicked: %1$s"

    .line 81
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p3, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public trackSubListContentVisible(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)V
    .locals 1

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->createBasicRetailerEvent(Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;Lcom/ibotta/android/apiandroid/content/ContentId;I)Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    move-result-object p1

    const-string p2, "Tracking Retailer Visible: %1$s"

    const/4 p3, 0x1

    .line 71
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesTracking;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
