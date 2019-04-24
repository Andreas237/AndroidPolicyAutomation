.class final Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;
.super Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
.source "AutoValue_MyOffersGalleryViewState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;
    }
.end annotation


# instance fields
.field private final dataMap:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;"
        }
    .end annotation
.end field

.field private final galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

.field private final imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field private final retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

.field private final totalOffers:I


# direct methods
.method private constructor <init>(Lcom/ibotta/api/model/im/ImConnectionStatus;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;Ljava/util/LinkedHashMap;Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;I)V
    .locals 0
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "I)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->dataMap:Ljava/util/LinkedHashMap;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    .line 37
    iput p6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->totalOffers:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/api/model/im/ImConnectionStatus;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;Ljava/util/LinkedHashMap;Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$1;)V
    .locals 0

    .line 16
    invoke-direct/range {p0 .. p6}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;-><init>(Lcom/ibotta/api/model/im/ImConnectionStatus;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;Ljava/util/LinkedHashMap;Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;I)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 89
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 90
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getImConnectionStatus()Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/api/model/im/ImConnectionStatus;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v1, :cond_1

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getGalleryHeaderViewState()Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->dataMap:Ljava/util/LinkedHashMap;

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getDataMap()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    if-nez v1, :cond_2

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getSelectedCategory()Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getSelectedCategory()Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->totalOffers:I

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->getTotalOffers()I

    move-result p1

    if-ne v1, p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public getDataMap()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->dataMap:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public getGalleryHeaderViewState()Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    return-object v0
.end method

.method public getImConnectionStatus()Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getSelectedCategory()Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    return-object v0
.end method

.method public getTotalOffers()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->totalOffers:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {v0}, Lcom/ibotta/api/model/im/ImConnectionStatus;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 107
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 109
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 111
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->dataMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 113
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 115
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->totalOffers:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MyOffersGalleryViewState{imConnectionStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerParcel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", galleryHeaderViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dataMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->dataMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedCategory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalOffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;->totalOffers:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
