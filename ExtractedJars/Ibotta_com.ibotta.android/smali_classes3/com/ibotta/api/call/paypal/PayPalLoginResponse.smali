.class public abstract Lcom/ibotta/api/call/paypal/PayPalLoginResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "PayPalLoginResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method

.method public static create(Ljava/lang/String;)Lcom/ibotta/api/call/paypal/PayPalLoginResponse;
    .locals 1

    .line 11
    new-instance v0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract getPayPalUrl()Ljava/lang/String;
.end method
