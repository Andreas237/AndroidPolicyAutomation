.class public interface abstract Lcom/ibotta/api/helper/card/GiftCardHelper;
.super Ljava/lang/Object;
.source "GiftCardHelper.java"


# virtual methods
.method public abstract findById(Ljava/util/List;I)Lcom/ibotta/api/model/card/GiftCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;I)",
            "Lcom/ibotta/api/model/card/GiftCard;"
        }
    .end annotation
.end method

.method public abstract findFeatured(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;"
        }
    .end annotation
.end method

.method public abstract sort(Ljava/util/List;Ljava/util/Comparator;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract sort(Ljava/util/List;Ljava/util/Comparator;Ljava/util/Comparator;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/card/GiftCard$Template;",
            ">;)V"
        }
    .end annotation
.end method
