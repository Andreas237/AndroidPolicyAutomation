.class synthetic Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;
.super Ljava/lang/Object;
.source "NotificationsPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 139
    invoke-static {}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->values()[Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    sget-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenterImpl$1;->$SwitchMap$com$ibotta$android$notification$call$BaseNotificationsCall$NotificationFilter:[I

    sget-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
