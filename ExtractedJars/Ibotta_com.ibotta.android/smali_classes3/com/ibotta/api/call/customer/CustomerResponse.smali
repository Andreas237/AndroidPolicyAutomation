.class public Lcom/ibotta/api/call/customer/CustomerResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerResponse.java"


# instance fields
.field private customer:Lcom/ibotta/api/model/customer/Customer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomer()Lcom/ibotta/api/model/customer/Customer;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerResponse;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-object v0
.end method

.method public setCustomer(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerResponse;->customer:Lcom/ibotta/api/model/customer/Customer;

    return-void
.end method
