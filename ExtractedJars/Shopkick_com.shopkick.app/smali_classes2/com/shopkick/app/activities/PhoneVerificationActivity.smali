.class public Lcom/shopkick/app/activities/PhoneVerificationActivity;
.super Lcom/shopkick/app/activities/MultiScreenActivity;
.source "PhoneVerificationActivity.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected handleOnCreate()V
    .locals 2

    .line 13
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnCreate()V

    .line 14
    iget-object v0, p0, Lcom/shopkick/app/activities/PhoneVerificationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "VerifyPhoneCompleteEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method protected handleOnDestroy()V
    .locals 1

    .line 19
    invoke-super {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->handleOnDestroy()V

    .line 20
    iget-object v0, p0, Lcom/shopkick/app/activities/PhoneVerificationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x733d7e8c

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/activities/PhoneVerificationActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/activities/PhoneVerificationActivity;->finish()V

    :goto_2
    return-void
.end method

.method public supportsToolbar()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
