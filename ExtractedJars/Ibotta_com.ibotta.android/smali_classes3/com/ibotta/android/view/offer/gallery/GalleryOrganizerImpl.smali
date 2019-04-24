.class public Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;
.super Ljava/lang/Object;
.source "GalleryOrganizerImpl.java"

# interfaces
.implements Lcom/ibotta/android/view/offer/gallery/GalleryOrganizer;


# static fields
.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final allGalleryCategoryVariant:Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private offerCategoryModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

.field private verificationType:Lcom/ibotta/api/model/common/VerificationType;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/features/variant/pwi/PwiVariant;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->allGalleryCategoryVariant:Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "GalleryOrganizerImpl.java"

    const-class v1, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "createGallerySections"

    const-string v3, "com.ibotta.android.view.offer.gallery.GalleryOrganizerImpl"

    const-string v4, "java.util.List"

    const-string v5, "offerCategoryModels"

    const-string v6, ""

    const-string v7, "java.util.List"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x3f

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private convertToDealItems(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/DealModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 110
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/DealModel;

    .line 111
    new-instance v2, Lcom/ibotta/android/view/model/content/DealItem;

    invoke-direct {v2, v1}, Lcom/ibotta/android/view/model/content/DealItem;-><init>(Lcom/ibotta/api/model/DealModel;)V

    .line 112
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 114
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private convertToOfferItems(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 121
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 124
    new-instance v2, Lcom/ibotta/android/view/model/content/OfferItem;

    invoke-direct {v2, v1}, Lcom/ibotta/android/view/model/content/OfferItem;-><init>(Lcom/ibotta/api/model/OfferModel;)V

    .line 126
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v1

    sget-object v3, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    if-ne v1, v3, :cond_0

    .line 127
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    goto :goto_1

    .line 129
    :cond_0
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setStyle(Lcom/ibotta/android/views/content/ContentStyle;)V

    .line 132
    :goto_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private createAllGallerySection(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation

    .line 139
    new-instance v0, Lcom/ibotta/android/view/model/GallerySection;

    sget-object v1, Lcom/ibotta/android/view/offer/category/OfferCategory;->ALL:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {v1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->toCategory(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/api/model/offer/Category;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/model/GallerySection;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/GallerySection;->setAllSection(Z)V

    .line 142
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/model/GallerySection;

    .line 145
    invoke-virtual {v2}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v3

    .line 146
    invoke-virtual {v2}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v2

    .line 148
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 149
    invoke-virtual {v5, v3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setOfferCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)V

    goto :goto_1

    .line 152
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 155
    invoke-interface {v1, p1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object v1
.end method

.method private createGallerySections(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation runtime Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingBefore;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->DUPLICATE_OFFER_CATEGORY:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 63
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAspect;->before(Lorg/aspectj/lang/JoinPoint;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferCategoryModel;

    .line 66
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getOffers()Ljava/util/List;

    move-result-object v2

    .line 67
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getDeals()Ljava/util/List;

    move-result-object v3

    .line 68
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferCategoryModel;->getBuyableGiftCards()Ljava/util/List;

    move-result-object v4

    .line 70
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 71
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 72
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v5}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->showBuyableGiftCards()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 74
    :cond_1
    new-instance v5, Lcom/ibotta/android/view/model/GallerySection;

    invoke-direct {v5, v1}, Lcom/ibotta/android/view/model/GallerySection;-><init>(Lcom/ibotta/api/model/OfferCategoryModel;)V

    .line 76
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 77
    invoke-virtual {v5}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v2}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->convertToOfferItems(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 78
    invoke-virtual {v5}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-eqz v3, :cond_3

    .line 82
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 83
    invoke-virtual {v5}, Lcom/ibotta/android/view/model/GallerySection;->getOfferCategoryItems()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v3}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->convertToDealItems(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 84
    invoke-virtual {v5}, Lcom/ibotta/android/view/model/GallerySection;->getContentModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 88
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v1, v5, v4}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->addBuyableGiftCardsToGallerySection(Lcom/ibotta/android/view/model/GallerySection;Ljava/util/List;)V

    .line 90
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 94
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_5

    invoke-direct {p0}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->showAllCategory()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 95
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->createAllGallerySection(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :cond_5
    const/4 p1, 0x0

    .line 100
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/model/GallerySection;

    add-int/lit8 v3, p1, 0x1

    .line 101
    invoke-virtual {v2, p1}, Lcom/ibotta/android/view/model/GallerySection;->setModuleIndex(I)V

    move p1, v3

    goto :goto_1

    :cond_6
    return-object v0
.end method

.method private showAllCategory()Z
    .locals 2

    .line 163
    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    iget-object v1, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_0

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->allGalleryCategoryTabMvtEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->allGalleryCategoryVariant:Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/gallery/allcategory/AllGalleryCategoryVariant;->hideAllGalleryCategory()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method


# virtual methods
.method public getGallerySections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/GallerySection;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->offerCategoryModels:Ljava/util/List;

    if-nez v0, :cond_0

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 58
    :cond_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->createGallerySections(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public setSourceData(Lcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/common/VerificationType;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            ">;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->verificationType:Lcom/ibotta/api/model/common/VerificationType;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/view/offer/gallery/GalleryOrganizerImpl;->offerCategoryModels:Ljava/util/List;

    return-void
.end method
