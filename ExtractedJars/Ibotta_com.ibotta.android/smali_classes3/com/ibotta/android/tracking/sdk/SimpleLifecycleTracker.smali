.class public abstract Lcom/ibotta/android/tracking/sdk/SimpleLifecycleTracker;
.super Ljava/lang/Object;
.source "SimpleLifecycleTracker.java"

# interfaces
.implements Lcom/ibotta/android/tracking/sdk/LifecycleTracker;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected getCustomerId(Lcom/ibotta/api/model/customer/Customer;)I
    .locals 0

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected getCustomerIdAsString(Lcom/ibotta/api/model/customer/Customer;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public init()V
    .locals 0

    return-void
.end method

.method protected isSuperUser(Lcom/ibotta/api/model/customer/Customer;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->isSuperUser()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppPause(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppResume(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppStart(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppStop(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
    .locals 0

    return-void
.end method

.method public trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0

    return-void
.end method

.method public trackRegistration()V
    .locals 0

    return-void
.end method
