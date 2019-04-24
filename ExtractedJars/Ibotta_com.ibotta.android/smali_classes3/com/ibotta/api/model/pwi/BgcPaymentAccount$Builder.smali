.class public abstract Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
.super Ljava/lang/Object;
.source "BgcPaymentAccount.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
.end method

.method public abstract createdAt(J)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation
.end method

.method public abstract ephemeralKey(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "key"
    .end annotation
.end method

.method public abstract stripeToken(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "stripe_token"
    .end annotation
.end method

.method public abstract updatedAt(J)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated"
    .end annotation
.end method
