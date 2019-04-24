.class public abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
.super Ljava/lang/Object;
.source "MyOffersGalleryViewState.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
.end method

.method public abstract dataMap(Ljava/util/LinkedHashMap;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
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
.end method

.method public abstract galleryHeaderViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
.end method

.method public abstract imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
.end method

.method public abstract retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract selectedCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .param p1    # Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract totalOffers(I)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
.end method
