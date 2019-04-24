.class public Lcom/ibotta/api/helper/card/GiftCardHelperImpl;
.super Ljava/lang/Object;
.source "GiftCardHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/card/GiftCardHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findById(Ljava/util/List;I)Lcom/ibotta/api/model/card/GiftCard;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/card/GiftCard;",
            ">;I)",
            "Lcom/ibotta/api/model/card/GiftCard;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 22
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/card/GiftCard;

    .line 23
    invoke-virtual {v1}, Lcom/ibotta/api/model/card/GiftCard;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findFeatured(Ljava/util/List;)Ljava/util/List;
    .locals 3
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

    if-nez p1, :cond_0

    .line 35
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 38
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/card/GiftCard;

    .line 40
    invoke-virtual {v1}, Lcom/ibotta/api/model/card/GiftCard;->isFeatured()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public sort(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 0
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

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public sort(Ljava/util/List;Ljava/util/Comparator;Ljava/util/Comparator;)V
    .locals 0
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

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    .line 57
    :cond_0
    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    if-eqz p3, :cond_1

    .line 60
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/card/GiftCard;

    .line 61
    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard;->getTemplates()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, p3}, Lcom/ibotta/api/model/card/GiftCard$Template;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_1
    return-void
.end method
