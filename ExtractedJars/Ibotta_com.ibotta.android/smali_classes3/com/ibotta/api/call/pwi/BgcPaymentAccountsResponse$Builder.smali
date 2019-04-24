.class public abstract Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
.super Ljava/lang/Object;
.source "BgcPaymentAccountsResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract bgcPaymentAccount(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
    .param p1    # Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract build()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
.end method

.method public abstract response404(Z)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
.end method
