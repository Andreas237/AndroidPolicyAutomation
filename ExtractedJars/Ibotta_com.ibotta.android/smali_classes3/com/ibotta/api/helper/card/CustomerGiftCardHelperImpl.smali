.class public Lcom/ibotta/api/helper/card/CustomerGiftCardHelperImpl;
.super Ljava/lang/Object;
.source "CustomerGiftCardHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/card/CustomerGiftCardHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findById(Ljava/util/List;I)Lcom/ibotta/api/model/customer/CustomerGiftCard;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerGiftCard;",
            ">;I)",
            "Lcom/ibotta/api/model/customer/CustomerGiftCard;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/customer/CustomerGiftCard;

    .line 20
    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/CustomerGiftCard;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method
