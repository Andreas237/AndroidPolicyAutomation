.class public interface abstract Lcom/ibotta/api/helper/bonus/BonusHelper;
.super Ljava/lang/Object;
.source "BonusHelper.java"


# virtual methods
.method public abstract findAccessibleBonuses(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findBonusById(Ljava/util/List;I)Lcom/ibotta/api/model/BonusModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;I)",
            "Lcom/ibotta/api/model/BonusModel;"
        }
    .end annotation
.end method

.method public abstract getAmountString(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;
.end method

.method public abstract getDisplayAmount(Lcom/ibotta/api/model/BonusModel;Ljava/text/Format;)Ljava/lang/String;
.end method

.method public abstract getDisplayAmount(Ljava/lang/Float;Ljava/text/Format;)Ljava/lang/String;
.end method

.method public abstract isCompleted(Lcom/ibotta/api/model/BonusModel;)Z
.end method

.method public abstract isFeatured(Lcom/ibotta/api/model/BonusModel;)Z
.end method
