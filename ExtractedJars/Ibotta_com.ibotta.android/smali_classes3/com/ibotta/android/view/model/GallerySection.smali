.class public Lcom/ibotta/android/view/model/GallerySection;
.super Ljava/lang/Object;
.source "GallerySection.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/EventContributor;


# instance fields
.field private allSection:Z

.field private final contentModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation
.end field

.field private eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

.field private moduleIndex:I

.field private final offerCategoryItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation
.end field

.field private final offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/OfferCategoryModel;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryItems:Ljava/util/List;

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->contentModels:Ljava/util/List;

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 5

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferCategoryId(Ljava/lang/Integer;)V

    .line 72
    iget v0, p0, Lcom/ibotta/android/view/model/GallerySection;->moduleIndex:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleIndex(Ljava/lang/Integer;)V

    .line 74
    iget-boolean v0, p0, Lcom/ibotta/android/view/model/GallerySection;->allSection:Z

    if-eqz v0, :cond_0

    .line 75
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    const v1, 0x7f1102fb

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v4}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleName(Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleName(Ljava/lang/String;)V

    :goto_0
    return-void
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

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->contentModels:Ljava/util/List;

    return-object v0
.end method

.method public getEventChain()Lcom/ibotta/android/tracking/proprietary/event/EventChain;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    return-object v0
.end method

.method public getModuleIndex()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/ibotta/android/view/model/GallerySection;->moduleIndex:I

    return v0
.end method

.method public getOfferCategoryItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryItems:Ljava/util/List;

    return-object v0
.end method

.method public getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-object v0
.end method

.method public setAllSection(Z)V
    .locals 0

    .line 66
    iput-boolean p1, p0, Lcom/ibotta/android/view/model/GallerySection;->allSection:Z

    return-void
.end method

.method public setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 2

    .line 56
    invoke-virtual {p1, p0}, Lcom/ibotta/android/tracking/proprietary/event/EventChain;->createLink(Lcom/ibotta/android/tracking/proprietary/event/EventContributor;)Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/view/model/GallerySection;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    const/4 p1, 0x0

    .line 58
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/view/model/GallerySection;->offerCategoryItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/view/model/GallerySection;->eventChain:Lcom/ibotta/android/tracking/proprietary/event/EventChain;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setEventChain(Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->setIndex(Ljava/lang/Integer;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setModuleIndex(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/ibotta/android/view/model/GallerySection;->moduleIndex:I

    return-void
.end method
