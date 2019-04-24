.class public Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;
.super Ljava/lang/Object;
.source "GalleryPresenterHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelper;


# instance fields
.field private buyableGiftCardModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation
.end field

.field private final contentModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation
.end field

.field private copyOfferCategoryItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation
.end field

.field private customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

.field private final galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private offerCategoryModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation
.end field

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->offerCategoryModels:Ljava/util/List;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->copyOfferCategoryItems:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->buyableGiftCardModels:Ljava/util/List;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->contentModels:Ljava/util/List;

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    .line 52
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 53
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 54
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    return-void
.end method

.method private createCustomGallerySection(Lcom/ibotta/api/model/OfferCategoryModel;I)V
    .locals 1

    .line 206
    new-instance v0, Lcom/ibotta/android/view/model/GallerySection;

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/model/GallerySection;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    .line 207
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/model/GallerySection;->setAllSection(Z)V

    .line 208
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/view/model/GallerySection;->setModuleIndex(I)V

    return-void
.end method

.method private createOfferCard(ILcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;
    .locals 1

    .line 138
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;-><init>()V

    .line 139
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setOfferCategoryItem(Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)V

    .line 140
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 141
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->setIndex(I)V

    return-object v0
.end method

.method private isNewCurrentCategory(Lcom/ibotta/api/model/OfferCategoryModel;Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)Z
    .locals 0

    if-eqz p1, :cond_1

    .line 180
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object p2

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result p2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public clearBuyableGiftCardModels()V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->buyableGiftCardModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public createBannersRow(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;"
        }
    .end annotation

    .line 112
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;-><init>()V

    .line 113
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setFeatures(Ljava/util/List;)V

    .line 114
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->GALLERY:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 115
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setRetailerId(Ljava/lang/Integer;)V

    if-eqz p3, :cond_0

    .line 118
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/BannersRow;->setRetailerCategoryId(I)V

    :cond_0
    return-object v0
.end method

.method public createOffersMap(Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;>;"
        }
    .end annotation

    .line 150
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 155
    invoke-direct {p0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->isNewCurrentCategory(Lcom/ibotta/api/model/OfferCategoryModel;Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 156
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    .line 157
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    :cond_0
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public createOffersRows(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;"
        }
    .end annotation

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 129
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 130
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->createOfferCard(ILcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public createSpecialConditionsRows(Ljava/util/List;Ljava/lang/String;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;"
        }
    .end annotation

    .line 101
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;-><init>()V

    .line 102
    invoke-virtual {p1, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 103
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/SpecialConditionsRow;->setMessage(Ljava/lang/String;)V

    return-object p1
.end method

.method public createTitleBarRow(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;"
        }
    .end annotation

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p2

    .line 170
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;

    invoke-direct {v0, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 172
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 v1, 0x1

    if-nez p2, :cond_0

    .line 173
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 172
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/row/TitleBarRow;->setUnderBannerOrCards(Z)V

    return-object v0
.end method

.method public getBuyableGiftCardModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->buyableGiftCardModels:Ljava/util/List;

    return-object v0
.end method

.method public getContentModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->contentModels:Ljava/util/List;

    return-object v0
.end method

.method public getCopyOfferCategoryItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->copyOfferCategoryItems:Ljava/util/List;

    return-object v0
.end method

.method public getCustomGallerySection()Lcom/ibotta/android/view/model/GallerySection;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    return-object v0
.end method

.method public getGalleryParcelFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/FeatureModel;",
            ">;"
        }
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getGalleryFeatures()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getGallerySections()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->offerCategoryModels:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;->setSourceData(Lcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)V

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    invoke-interface {v0}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;->getGallerySections()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public getRetailerParcelFromRetailerModel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 2

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    return-object v0
.end method

.method public setModels(Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;)V
    .locals 2

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->offerCategoryModels:Ljava/util/List;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->contentModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->contentModels:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->contentModels:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getDealsAsModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->clearBuyableGiftCardModels()V

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->buyableGiftCardModels:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/offercontainers/OfferCategoriesContainerGraphQLResponse;->getBuyableGiftCardsAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method

.method public setupAllSubSections(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;)V"
        }
    .end annotation

    .line 187
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->createCustomGallerySection(Lcom/ibotta/api/model/OfferCategoryModel;I)V

    .line 189
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->copyOfferCategoryItems:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 190
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 194
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 195
    invoke-virtual {p3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 197
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->copyOfferCategoryItems:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    invoke-virtual {p3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 201
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    invoke-virtual {p2}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 202
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->customGallerySection:Lcom/ibotta/android/view/model/GallerySection;

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->copyOfferCategoryItems:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;)Z
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/helpers/GalleryPresenterHelperImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result p1

    return p1
.end method
