.class public Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerRetailerLaunchesResponse.java"


# instance fields
.field private customerRetailerLaunch:Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 30
    instance-of v0, p1, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    if-eqz v0, :cond_1

    .line 31
    check-cast p1, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;->customerRetailerLaunch:Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;->setCustomerRetailerLaunch(Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;)V

    :cond_1
    return-void
.end method

.method public getCustomerRetailerLaunch()Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;->customerRetailerLaunch:Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    return-object v0
.end method

.method public setCustomerRetailerLaunch(Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/CustomerRetailerLaunchesResponse;->customerRetailerLaunch:Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    return-void
.end method
