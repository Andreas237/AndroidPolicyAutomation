.class public Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "NotificationDetailIntentCreator.java"


# instance fields
.field private final notification:Lcom/ibotta/android/notification/model/Notification;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;->notification:Lcom/ibotta/android/notification/model/Notification;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 25
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "notification"

    .line 26
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-static {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->fromNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method
