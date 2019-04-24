.class public Lcom/ibotta/api/call/customer/CustomerByIdResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerByIdResponse.java"


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 23
    instance-of v0, p1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->setCustomer(Lcom/ibotta/api/model/customer/Customer;)V

    :cond_1
    return-void
.end method

.method public getCustomer()Lcom/ibotta/api/model/customer/Customer;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-object v0
.end method

.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-void
.end method
