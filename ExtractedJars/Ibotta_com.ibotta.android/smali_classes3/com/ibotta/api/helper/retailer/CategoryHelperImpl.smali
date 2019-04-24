.class public Lcom/ibotta/api/helper/retailer/CategoryHelperImpl;
.super Ljava/lang/Object;
.source "CategoryHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/retailer/CategoryHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findById(Ljava/util/List;I)Lcom/ibotta/api/model/retailer/Category;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;I)",
            "Lcom/ibotta/api/model/retailer/Category;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 25
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 26
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findByType(Ljava/util/List;Lcom/ibotta/api/model/retailer/CategoryType;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Lcom/ibotta/api/model/retailer/CategoryType;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 55
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 58
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 60
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getCategoryTypeEnum()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v2

    if-ne v2, p2, :cond_1

    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findFirstByType(Ljava/util/List;Lcom/ibotta/api/model/retailer/CategoryType;)Lcom/ibotta/api/model/retailer/Category;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;",
            "Lcom/ibotta/api/model/retailer/CategoryType;",
            ")",
            "Lcom/ibotta/api/model/retailer/Category;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 42
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 43
    invoke-virtual {v1}, Lcom/ibotta/api/model/retailer/Category;->getCategoryTypeEnum()Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method
