.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerAccountsAddResponse.java"


# instance fields
.field private customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerAccount()Lcom/ibotta/api/model/customer/CustomerAccount;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;->customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

    return-object v0
.end method

.method public setCustomerAccount(Lcom/ibotta/api/model/customer/CustomerAccount;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsAddResponse;->customerAccount:Lcom/ibotta/api/model/customer/CustomerAccount;

    return-void
.end method
