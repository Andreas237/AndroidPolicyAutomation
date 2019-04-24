.class public abstract Lcom/ibotta/api/call/paypal/PayPalAccountResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "PayPalAccountResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method

.method public static create(Lcom/ibotta/api/model/customer/CustomerAccount;)Lcom/ibotta/api/call/paypal/PayPalAccountResponse;
    .locals 1

    .line 12
    new-instance v0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalAccountResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/api/call/paypal/AutoValue_PayPalAccountResponse;-><init>(Lcom/ibotta/api/model/customer/CustomerAccount;)V

    return-object v0
.end method


# virtual methods
.method public abstract getCustomerAccount()Lcom/ibotta/api/model/customer/CustomerAccount;
.end method
