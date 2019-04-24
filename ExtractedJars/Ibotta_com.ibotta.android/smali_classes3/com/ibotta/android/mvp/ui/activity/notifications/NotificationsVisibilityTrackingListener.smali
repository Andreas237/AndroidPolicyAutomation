.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;
.super Ljava/lang/Object;
.source "NotificationsVisibilityTrackingListener.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

.field private final notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

.field private final tab:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->tab:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    return-void
.end method

.method private trackNotificationVisible(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->notificationTracking:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->tab:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;->onNotificationItemViewed(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    return-void
.end method

.method private trackVisible(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;)V
    .locals 1

    .line 51
    instance-of v0, p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    if-eqz v0, :cond_0

    .line 52
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->trackNotificationVisible(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

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

    .line 37
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

    .line 38
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getItemCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_0

    .line 42
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsVisibilityTrackingListener;->trackVisible(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;)V

    goto :goto_0

    :cond_2
    return-void
.end method
