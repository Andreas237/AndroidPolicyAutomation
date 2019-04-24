.class public Lcom/ibotta/android/notification/StatusBarNotification;
.super Ljava/lang/Object;
.source "StatusBarNotification.java"


# instance fields
.field private actions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation
.end field

.field private light:Z

.field private message:Ljava/lang/String;

.field private pendingIntent:Landroid/app/PendingIntent;

.field private smallIcon:I

.field private sound:Landroid/net/Uri;

.field private vibrate:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->actions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/support/v4/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->actions:Ljava/util/List;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingIntent()Landroid/app/PendingIntent;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->pendingIntent:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public getSmallIcon()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->smallIcon:I

    return v0
.end method

.method public getSound()Landroid/net/Uri;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->sound:Landroid/net/Uri;

    return-object v0
.end method

.method public isLight()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->light:Z

    return v0
.end method

.method public isVibrate()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->vibrate:Z

    return v0
.end method

.method public setActions(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/support/v4/app/NotificationCompat$Action;",
            ">;)V"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->actions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/notification/StatusBarNotification;->actions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public setLight(Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->light:Z

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->message:Ljava/lang/String;

    return-void
.end method

.method public setPendingIntent(Landroid/app/PendingIntent;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->pendingIntent:Landroid/app/PendingIntent;

    return-void
.end method

.method public setSmallIcon(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->smallIcon:I

    return-void
.end method

.method public setSound(Landroid/net/Uri;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->sound:Landroid/net/Uri;

    return-void
.end method

.method public setVibrate(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lcom/ibotta/android/notification/StatusBarNotification;->vibrate:Z

    return-void
.end method
