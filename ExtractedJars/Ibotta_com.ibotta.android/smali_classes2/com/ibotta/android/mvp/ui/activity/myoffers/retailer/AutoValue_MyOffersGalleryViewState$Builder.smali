.class final Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;
.super Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
.source "AutoValue_MyOffersGalleryViewState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private dataMap:Ljava/util/LinkedHashMap;
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

.field private galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

.field private imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

.field private totalOffers:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
    .locals 10

    const-string v0, ""

    .line 170
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-nez v1, :cond_0

    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " imConnectionStatus"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 173
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    if-nez v1, :cond_1

    .line 174
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " galleryHeaderViewState"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 176
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->dataMap:Ljava/util/LinkedHashMap;

    if-nez v1, :cond_2

    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " dataMap"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 179
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->totalOffers:Ljava/lang/Integer;

    if-nez v1, :cond_3

    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " totalOffers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 182
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 185
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->dataMap:Ljava/util/LinkedHashMap;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->totalOffers:Ljava/lang/Integer;

    .line 191
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState;-><init>(Lcom/ibotta/api/model/im/ImConnectionStatus;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;Ljava/util/LinkedHashMap;Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;ILcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$1;)V

    return-object v0

    .line 183
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public dataMap(Ljava/util/LinkedHashMap;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;",
            ">;>;)",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 154
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->dataMap:Ljava/util/LinkedHashMap;

    return-object p0

    .line 152
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null dataMap"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public galleryHeaderViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 146
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->galleryHeaderViewState:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    return-object p0

    .line 144
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null galleryHeaderViewState"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->imConnectionStatus:Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-object p0

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null imConnectionStatus"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 138
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object p0
.end method

.method public selectedCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 159
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->selectedCategory:Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;

    return-object p0
.end method

.method public totalOffers(I)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 0

    .line 164
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;->totalOffers:Ljava/lang/Integer;

    return-object p0
.end method
