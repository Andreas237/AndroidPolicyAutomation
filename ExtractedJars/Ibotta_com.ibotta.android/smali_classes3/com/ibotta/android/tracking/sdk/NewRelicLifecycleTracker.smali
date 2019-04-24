.class public Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;
.super Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.source "NewRelicLifecycleTracker.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    return-void
.end method


# virtual methods
.method public trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    .line 26
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->onAppActive()V

    return-void
.end method

.method public trackAppResume(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    .line 32
    invoke-super {p0, p1}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackAppResume(Landroid/support/v4/app/FragmentActivity;)V

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/NewRelic;->recordBreadcrumb(Ljava/lang/String;)Z

    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 1

    .line 38
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    .line 39
    iget-object p2, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->isSuperUser()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->setSuperUser(Z)V

    .line 40
    iget-object p2, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->hasEmployeeTesterRole()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->setEmployeeTester(Z)V

    .line 41
    iget-object p2, p0, Lcom/ibotta/android/tracking/sdk/NewRelicLifecycleTracker;->newRelicSessionAttributes:Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->setEmployeeId(I)V

    return-void
.end method
