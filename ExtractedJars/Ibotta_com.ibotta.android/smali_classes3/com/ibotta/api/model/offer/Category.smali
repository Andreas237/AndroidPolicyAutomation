.class public Lcom/ibotta/api/model/offer/Category;
.super Ljava/lang/Object;
.source "Category.java"

# interfaces
.implements Lcom/ibotta/api/model/OfferCategoryModel;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/model/OfferCategoryModel;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/api/model/offer/Category;",
        ">;"
    }
.end annotation


# static fields
.field public static final DEFAULT_NAME:Ljava/lang/String; = "NONE"


# instance fields
.field private contentIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private defaultViewState:Ljava/lang/String;

.field private id:I

.field private name:Ljava/lang/String;

.field private offers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private sortData:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Category;->contentIds:Ljava/util/Set;

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Category;->offers:Ljava/util/List;

    return-void
.end method

.method public static createEmptyCategory()Lcom/ibotta/api/model/offer/Category;
    .locals 2

    .line 235
    new-instance v0, Lcom/ibotta/api/model/offer/Category;

    invoke-direct {v0}, Lcom/ibotta/api/model/offer/Category;-><init>()V

    const-string v1, ""

    .line 237
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setName(Ljava/lang/String;)V

    const-string v1, "zzzzzzzzzz"

    .line 238
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setSortData(Ljava/lang/String;)V

    const/16 v1, -0x64

    .line 239
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setId(I)V

    .line 240
    sget-object v1, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->PREVIEW:Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setDefaultViewState(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/api/model/offer/Category;)I
    .locals 1

    .line 193
    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/offer/Category;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/Category;->getSortData()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/api/model/offer/Category;

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/offer/Category;->compareTo(Lcom/ibotta/api/model/offer/Category;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 222
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 225
    :cond_2
    check-cast p1, Lcom/ibotta/api/model/offer/Category;

    .line 226
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget v1, p0, Lcom/ibotta/api/model/offer/Category;->id:I

    iget v2, p1, Lcom/ibotta/api/model/offer/Category;->id:I

    .line 227
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->name:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/api/model/offer/Category;->name:Ljava/lang/String;

    .line 228
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    .line 229
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    .line 230
    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 231
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getBuyableGiftCards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCategoryType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getCategoryTypeEnum()Lcom/ibotta/api/model/offer/CategoryType;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getContentIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->contentIds:Ljava/util/Set;

    return-object v0
.end method

.method public getDeals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDefaultViewState()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    return-object v0
.end method

.method public getDefaultViewStateEnum()Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    move-result-object v0

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getExpiration()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/api/model/offer/Category;->id:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNumPreviewItems()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->offers:Ljava/util/List;

    return-object v0
.end method

.method public getRawCategoryType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetailers()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSortData()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getStartTime()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 206
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    const/16 v1, 0x1615

    const/16 v2, 0x577

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget v1, p0, Lcom/ibotta/api/model/offer/Category;->id:I

    .line 207
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->name:Ljava/lang/String;

    .line 208
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    .line 209
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    .line 210
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 211
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public isCollapsible()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isLaunch()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setBuyableGiftCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setDeals(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public setDefaultViewState(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Category;->defaultViewState:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/api/model/offer/Category;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Category;->name:Ljava/lang/String;

    return-void
.end method

.method public setOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 162
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Category;->offers:Ljava/util/List;

    return-void
.end method

.method public setSortData(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Category;->sortData:Ljava/lang/String;

    return-void
.end method
