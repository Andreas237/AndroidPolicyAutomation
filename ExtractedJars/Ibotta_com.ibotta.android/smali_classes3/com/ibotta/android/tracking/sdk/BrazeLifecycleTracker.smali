.class public Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "BrazeLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final app:Lcom/ibotta/android/App;

.field private final appboy:Lcom/appboy/Appboy;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/appboy/Appboy;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->app:Lcom/ibotta/android/App;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->appboy:Lcom/appboy/Appboy;

    return-void
.end method


# virtual methods
.method public trackAppPause(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 45
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppPause(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppPause"

    const/4 v1, 0x0

    .line 47
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-static {}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->getInstance()Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->unregisterInAppMessageManager(Landroid/app/Activity;)V

    return-void
.end method

.method public trackAppResume(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 37
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppResume(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppResume"

    const/4 v1, 0x0

    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->getInstance()Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->registerInAppMessageManager(Landroid/app/Activity;)V

    return-void
.end method

.method public trackAppStart(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 29
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppStart(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppStart"

    const/4 v1, 0x0

    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->openSession(Landroid/app/Activity;)V

    return-void
.end method

.method public trackAppStop(Landroid/support/v4/app/FragmentActivity;)V
    .locals 2

    .line 53
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppStop(Landroid/support/v4/app/FragmentActivity;)V

    const-string v0, "trackAppStop"

    const/4 v1, 0x0

    .line 55
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->closeSession(Landroid/app/Activity;)V

    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 1

    .line 61
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    const-string p2, "trackCustomer"

    const/4 v0, 0x0

    .line 63
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object p2, p0, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->appboy:Lcom/appboy/Appboy;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/sdk/BrazeLifecycleTracker;->getCustomerIdAsString(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/appboy/Appboy;->changeUser(Ljava/lang/String;)V

    return-void
.end method
