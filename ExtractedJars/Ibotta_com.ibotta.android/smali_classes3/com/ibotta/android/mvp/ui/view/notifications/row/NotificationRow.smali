.class public Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;
.super Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
.source "NotificationRow.java"


# instance fields
.field private enabled:Z

.field private listIndex:I

.field private notification:Lcom/ibotta/android/notification/model/Notification;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->NOTIFICATION:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V

    return-void
.end method


# virtual methods
.method public getListIndex()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->listIndex:I

    return v0
.end method

.method public getNotification()Lcom/ibotta/android/notification/model/Notification;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->notification:Lcom/ibotta/android/notification/model/Notification;

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->enabled:Z

    return v0
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->enabled:Z

    return-void
.end method

.method public setListIndex(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->listIndex:I

    return-void
.end method

.method public setNotification(Lcom/ibotta/android/notification/model/Notification;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/NotificationRow;->notification:Lcom/ibotta/android/notification/model/Notification;

    return-void
.end method
