.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerLoyaltiesPostResponse.java"


# instance fields
.field private customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostResponse;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-object v0
.end method

.method public setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostResponse;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    return-void
.end method
