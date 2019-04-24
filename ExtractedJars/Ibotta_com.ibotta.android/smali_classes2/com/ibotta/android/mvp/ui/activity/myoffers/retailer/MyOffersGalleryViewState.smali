.class public abstract Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;
.super Ljava/lang/Object;
.source "MyOffersGalleryViewState.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->EMPTY:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    .line 20
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->galleryHeaderViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->retailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    sget-object v2, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    .line 22
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->imConnectionStatus(Lcom/ibotta/api/model/im/ImConnectionStatus;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->dataMap(Ljava/util/LinkedHashMap;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->selectedCategory(Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->totalOffers(I)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;

    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryViewState$Builder;
    .locals 1

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/AutoValue_MyOffersGalleryViewState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getDataMap()Ljava/util/LinkedHashMap;
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
.end method

.method public abstract getGalleryHeaderViewState()Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
.end method

.method public abstract getImConnectionStatus()Lcom/ibotta/api/model/im/ImConnectionStatus;
.end method

.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSelectedCategory()Lcom/ibotta/android/mvp/ui/adapter/OfferCategoryTab;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTotalOffers()I
.end method
