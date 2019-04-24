.class public abstract Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;
.super Ljava/lang/Object;
.source "BuyableGiftCardsResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;
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


# virtual methods
.method public abstract bgcTransactions(Ljava/util/List;)Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;)",
            "Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;"
        }
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;
.end method
