.class public abstract Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
.super Ljava/lang/Object;
.source "BgcPaymentAccount.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getCreatedAt()J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation
.end method

.method public abstract getEphemeralKey()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "key"
    .end annotation
.end method

.method public abstract getStripeToken()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "stripe_token"
    .end annotation
.end method

.method public abstract getUpdatedAt()J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated"
    .end annotation
.end method
