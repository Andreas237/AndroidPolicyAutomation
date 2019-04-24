.class public Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
.source "NotificationRowViewHolder.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;",
        ">;"
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

.field private final nrvNotificationRow:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->nrvNotificationRow:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    return-void
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Landroid/view/View;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->onNotificationClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    return-void
.end method

.method private onNotificationClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;->onNotificationRowClicked(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 2

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    .line 24
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->nrvNotificationRow:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->getNotification()Lcom/ibotta/android/notification/model/Notification;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->isEnabled()Z

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setNotification(Lcom/ibotta/android/notification/model/Notification;Z)V

    .line 25
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;->nrvNotificationRow:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$NotificationRowViewHolder$k2j2HrGTFqzK8njl10yZ7QjT6E0;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
