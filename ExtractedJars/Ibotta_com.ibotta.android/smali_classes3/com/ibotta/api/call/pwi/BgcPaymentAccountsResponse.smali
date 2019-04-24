.class public abstract Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BgcPaymentAccountsResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
    .locals 1

    .line 15
    new-instance v0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract isResponse404()Z
.end method
