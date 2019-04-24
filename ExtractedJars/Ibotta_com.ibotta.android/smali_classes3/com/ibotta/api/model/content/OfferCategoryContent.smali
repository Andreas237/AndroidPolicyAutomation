.class public Lcom/ibotta/api/model/content/OfferCategoryContent;
.super Ljava/lang/Object;
.source "OfferCategoryContent.java"

# interfaces
.implements Lcom/ibotta/api/model/OfferCategoryModel;
.implements Ljava/lang/Cloneable;


# instance fields
.field private buyableGiftCardModels:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation
.end field

.field private categoryType:Ljava/lang/String;

.field private categoryTypeEnum:Lcom/ibotta/api/model/offer/CategoryType;

.field private collapsible:Z

.field private contentIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private deals:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/DealContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;"
        }
    .end annotation
.end field

.field private defaultViewState:Ljava/lang/String;

.field private endTime:Ljava/lang/String;

.field private expiration:Ljava/lang/String;

.field private iconUrl:Ljava/lang/String;

.field private id:I

.field private imageUrl:Ljava/lang/String;

.field private launch:Z

.field private name:Ljava/lang/String;

.field private numPreviewItems:I

.field private offers:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/OfferContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field

.field private rawCategoryType:Ljava/lang/String;

.field private retailers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private shortName:Ljava/lang/String;

.field private sortOrder:I

.field private startTime:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->contentIds:Ljava/util/Set;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->offers:Ljava/util/List;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->deals:Ljava/util/List;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->buyableGiftCardModels:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->retailers:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 249
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
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

    .line 230
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->buyableGiftCardModels:Ljava/util/List;

    return-object v0
.end method

.method public getCategoryType()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryType:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryTypeEnum()Lcom/ibotta/api/model/offer/CategoryType;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryTypeEnum:Lcom/ibotta/api/model/offer/CategoryType;

    if-nez v0, :cond_0

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/OfferCategoryContent;->getCategoryType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/offer/CategoryType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/CategoryType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryTypeEnum:Lcom/ibotta/api/model/offer/CategoryType;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryTypeEnum:Lcom/ibotta/api/model/offer/CategoryType;

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

    .line 204
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->contentIds:Ljava/util/Set;

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

    .line 221
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->deals:Ljava/util/List;

    return-object v0
.end method

.method public getDefaultViewState()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->defaultViewState:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->expiration:Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->id:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNumPreviewItems()I
    .locals 1

    .line 150
    iget v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->numPreviewItems:I

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

    .line 213
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->offers:Ljava/util/List;

    return-object v0
.end method

.method public getRawCategoryType()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->rawCategoryType:Ljava/lang/String;

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

    .line 240
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->retailers:Ljava/util/Set;

    return-object v0
.end method

.method public getShortName()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->shortName:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()I
    .locals 1

    .line 177
    iget v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->sortOrder:I

    return v0
.end method

.method public getStartTime()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public isCollapsible()Z
    .locals 1

    .line 78
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->collapsible:Z

    return v0
.end method

.method public isLaunch()Z
    .locals 1

    .line 132
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->launch:Z

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

    .line 235
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->buyableGiftCardModels:Ljava/util/List;

    return-void
.end method

.method public setCategoryType(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryType:Ljava/lang/String;

    const/4 p1, 0x0

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->categoryTypeEnum:Lcom/ibotta/api/model/offer/CategoryType;

    return-void
.end method

.method public setCollapsible(Z)V
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->collapsible:Z

    return-void
.end method

.method public setContentIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 208
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->contentIds:Ljava/util/Set;

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

    .line 225
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->deals:Ljava/util/List;

    return-void
.end method

.method public setDefaultViewState(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->defaultViewState:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->endTime:Ljava/lang/String;

    return-void
.end method

.method public setExpiration(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->expiration:Ljava/lang/String;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->id:I

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->imageUrl:Ljava/lang/String;

    return-void
.end method

.method public setLaunch(Z)V
    .locals 0

    .line 136
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->launch:Z

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setNumPreviewItems(I)V
    .locals 0

    .line 154
    iput p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->numPreviewItems:I

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

    .line 217
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->offers:Ljava/util/List;

    return-void
.end method

.method public setRawCategoryType(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->rawCategoryType:Ljava/lang/String;

    return-void
.end method

.method public setRetailers(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 244
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->retailers:Ljava/util/Set;

    return-void
.end method

.method public setShortName(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->shortName:Ljava/lang/String;

    return-void
.end method

.method public setSortOrder(I)V
    .locals 0

    .line 181
    iput p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->sortOrder:I

    return-void
.end method

.method public setStartTime(Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->startTime:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/ibotta/api/model/content/OfferCategoryContent;->type:Ljava/lang/String;

    return-void
.end method
