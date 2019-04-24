.class final Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;
.super Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;
.source "AutoValue_BuyableGiftCardsResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse$Builder;
    }
.end annotation


# instance fields
.field private final bgcTransactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;->bgcTransactions:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 36
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    if-eqz v0, :cond_1

    .line 37
    check-cast p1, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    .line 38
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;->bgcTransactions:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;->getBgcTransactions()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getBgcTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;->bgcTransactions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;->bgcTransactions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BuyableGiftCardsResponse{bgcTransactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BuyableGiftCardsResponse;->bgcTransactions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
