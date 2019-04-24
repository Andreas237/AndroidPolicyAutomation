.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;
.super Ljava/lang/Object;
.source "MyOffersGalleryReducer.java"


# instance fields
.field private final galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

.field private final galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private adjustAllSubSectionForTracking(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 202
    new-instance v0, Lcom/ibotta/android/view/model/GallerySection;

    invoke-direct {v0, p2}, Lcom/ibotta/android/view/model/GallerySection;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    const/4 p2, 0x1

    .line 203
    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/model/GallerySection;->setAllSection(Z)V

    .line 204
    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/model/GallerySection;->setModuleIndex(I)V

    .line 206
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 207
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 211
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 212
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 214
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 219
    invoke-virtual {v0}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 220
    invoke-virtual {v0, p4}, Lcom/ibotta/android/view/model/GallerySection;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    return-object p1
.end method

.method private createDataMapFromSections(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/LinkedHashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;"
        }
    .end annotation

    .line 118
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 120
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/model/GallerySection;

    .line 121
    new-instance v2, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {v1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    .line 123
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v3

    sget-object v4, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {v4}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getId()I

    move-result v4

    if-ne v3, v4, :cond_0

    .line 124
    invoke-direct {p0, v1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createOfferRowsForSection(Lcom/ibotta/android/view/model/GallerySection;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createRebatesRows(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private createOfferRowsForSection(Lcom/ibotta/android/view/model/GallerySection;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/view/model/GallerySection;",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;"
        }
    .end annotation

    .line 153
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createOffersMap(Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferCategoryModel;

    .line 160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 163
    invoke-direct {p0, v1, v3, v2, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->adjustAllSubSectionForTracking(ILcom/ibotta/api/model/OfferCategoryModel;Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/List;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 166
    new-instance v4, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v3

    invoke-direct {v4, v3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 167
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    invoke-direct {p0, v2, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createRebatesRows(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private createOffersMap(Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 6
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

    .line 178
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 182
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    if-eqz v1, :cond_0

    .line 183
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v4

    invoke-virtual {v3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v5

    invoke-interface {v5}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v5

    if-eq v4, v5, :cond_1

    .line 184
    :cond_0
    invoke-virtual {v3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    .line 185
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-virtual {v0, v1, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private createRebateCard(ILcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;
    .locals 1

    .line 239
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;-><init>()V

    .line 240
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->setOfferCategoryItem(Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;)V

    .line 241
    invoke-virtual {v0, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V

    .line 242
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->setIndex(I)V

    return-object v0
.end method

.method private createRebatesRows(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;"
        }
    .end annotation

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 230
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 231
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 232
    invoke-direct {p0, v1, v2, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createRebateCard(ILcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getDataMap(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/LinkedHashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;"
        }
    .end annotation

    .line 99
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 101
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 105
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->hasOffers(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->removeSynthesizedCategories(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 107
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->getGallerySections(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;

    move-result-object p1

    .line 108
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$D6_9DreZkraoqY9gZ9j6Z6bDa4Q;

    invoke-direct {v1, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$D6_9DreZkraoqY9gZ9j6Z6bDa4Q;-><init>(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 109
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->createDataMapFromSections(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/LinkedHashMap;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private getGallerySections(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;->setSourceData(Lcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)V

    .line 144
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->galleryOrganizer:Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;

    invoke-interface {p1}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;->getGallerySections()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private getOffersCount(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)I"
        }
    .end annotation

    .line 89
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$GLJsJog5BfjzhNkdxkovbLMBquI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$GLJsJog5BfjzhNkdxkovbLMBquI;

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->mapToInt(Ljava9/util/function/ToIntFunction;)Ljava9/util/stream/IntStream;

    move-result-object p1

    invoke-interface {p1}, Ljava9/util/stream/IntStream;->sum()I

    move-result p1

    return p1
.end method

.method private getSelectedCategory(Ljava/util/Set;Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 254
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    .line 255
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v2, v3, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method private hasOffers(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)Z"
        }
    .end annotation

    .line 93
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$UvuwVUJ-dISRqGnyG3yo0-zDUB4;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$UvuwVUJ-dISRqGnyG3yo0-zDUB4;

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method private initGalleryHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .locals 6
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->galleryHeaderReducer:Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;ZZ)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getDataMap$2(Lcom/ibotta/android/tracking/proprietary/event/EventChain;Lcom/ibotta/android/view/model/GallerySection;)V
    .locals 0

    .line 108
    invoke-virtual {p1, p0}, Lcom/ibotta/android/view/model/GallerySection;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    return-void
.end method

.method static synthetic lambda$getOffersCount$0(Lcom/ibotta/api/model/OfferCategoryModel;)I
    .locals 0

    .line 89
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method static synthetic lambda$hasOffers$1(Lcom/ibotta/api/model/OfferCategoryModel;)Z
    .locals 0

    .line 93
    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static synthetic lambda$removeSynthesizedCategories$3(Lcom/ibotta/api/model/OfferCategoryModel;)Z
    .locals 1

    .line 136
    sget-object v0, Lcom/ibotta/api/model/offer/CategoryType;->SYNTHESIZED:Lcom/ibotta/api/model/offer/CategoryType;

    invoke-interface {p0}, Lcom/ibotta/api/model/OfferCategoryModel;->getCategoryTypeEnum()Lcom/ibotta/api/model/offer/CategoryType;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/api/model/offer/CategoryType;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private removeSynthesizedCategories(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation

    .line 135
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$gbJC6oR7OQbYfxl-3CgVTNCrfxo;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryReducer$gbJC6oR7OQbYfxl-3CgVTNCrfxo;

    .line 136
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 137
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/im/ImConnectionStatus;Ljava/util/List;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
    .locals 0
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Lcom/ibotta/api/model/customer/Customer;",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 63
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    return-object p1

    .line 66
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->initGalleryHeaderViewState(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object p3

    .line 68
    invoke-direct {p0, p5, p1, p7}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->getDataMap(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)Ljava/util/LinkedHashMap;

    move-result-object p1

    .line 71
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p7

    .line 72
    invoke-virtual {p7, p3}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->galleryHeaderViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p3

    .line 73
    invoke-virtual {p3, p4}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p3

    .line 74
    invoke-virtual {p3, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p2

    .line 75
    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->dataMap(Ljava/util/LinkedHashMap;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p2

    .line 76
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1, p6}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->getSelectedCategory(Ljava/util/Set;Ljava/lang/Integer;)Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->selectedCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p1

    .line 77
    invoke-direct {p0, p5}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryReducer;->getOffersCount(Ljava/util/List;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->totalOffers(I)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    move-result-object p1

    return-object p1
.end method
