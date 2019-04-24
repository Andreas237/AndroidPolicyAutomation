.class public Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "ButtonLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final app:Lcom/ibotta/android/App;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->app:Lcom/ibotta/android/App;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 26
    iput-object p3, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public init()V
    .locals 3

    .line 31
    invoke-super {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->init()V

    const-string v0, "init"

    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugButtonSdkLogging()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-static {}, Lcom/usebutton/sdk/Button;->debug()Lcom/usebutton/sdk/debug/DebugInterface;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/debug/DebugInterface;->setLoggingEnabled(Z)V

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->app:Lcom/ibotta/android/App;

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1100cf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/Button;->configure(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 1

    .line 44
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    const-string p2, "trackCustomer"

    const/4 v0, 0x0

    .line 46
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 48
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p2

    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->getCustomerIdAsString(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/usebutton/sdk/user/User;->setIdentifier(Ljava/lang/String;)V

    .line 50
    iget-object p2, p0, Lcom/ibotta/android/tracking/sdk/ButtonLifecycleTracker;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {p2}, Lcom/ibotta/android/state/app/config/AppConfig;->isButtonSdkAutofillEnabled()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 51
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/usebutton/sdk/user/User;->setFirstName(Ljava/lang/String;)V

    .line 52
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/usebutton/sdk/user/User;->setLastName(Ljava/lang/String;)V

    .line 53
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/usebutton/sdk/user/User;->setEmail(Ljava/lang/String;)V

    .line 54
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/usebutton/sdk/user/User;->setAutofillEnabled(Z)V

    :cond_0
    return-void
.end method
