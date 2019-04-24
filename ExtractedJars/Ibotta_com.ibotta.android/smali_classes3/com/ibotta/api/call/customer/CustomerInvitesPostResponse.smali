.class public Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerInvitesPostResponse.java"


# instance fields
.field private customerInvites:Lcom/ibotta/api/model/customer/CustomerInvites;


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
    instance-of v0, p1, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;->customerInvites:Lcom/ibotta/api/model/customer/CustomerInvites;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;->setCustomerInvites(Lcom/ibotta/api/model/customer/CustomerInvites;)V

    :cond_1
    return-void
.end method

.method public getCustomerInvites()Lcom/ibotta/api/model/customer/CustomerInvites;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;->customerInvites:Lcom/ibotta/api/model/customer/CustomerInvites;

    return-object v0
.end method

.method public setCustomerInvites(Lcom/ibotta/api/model/customer/CustomerInvites;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;->customerInvites:Lcom/ibotta/api/model/customer/CustomerInvites;

    return-void
.end method
