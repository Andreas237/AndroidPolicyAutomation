.class public interface abstract Lcom/usebutton/sdk/purchasepath/CardList;
.super Ljava/lang/Object;
.source "CardList.java"


# virtual methods
.method public abstract addCard(Lcom/usebutton/sdk/purchasepath/Card;)V
.end method

.method public abstract getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCards()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V
.end method

.method public abstract removeAllCards()V
.end method

.method public abstract removeCard(Ljava/lang/Object;)V
.end method

.method public abstract replaceCard(Lcom/usebutton/sdk/purchasepath/Card;Ljava/lang/Object;)V
.end method

.method public abstract setCards(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;)V"
        }
    .end annotation
.end method
