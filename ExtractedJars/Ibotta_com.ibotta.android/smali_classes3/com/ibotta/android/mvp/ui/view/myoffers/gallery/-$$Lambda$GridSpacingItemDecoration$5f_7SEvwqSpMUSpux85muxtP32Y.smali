.class public final synthetic Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntFunction;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;

.field private final synthetic f$1:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

.field private final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$0:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$1:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$2:I

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$0:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$1:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;->f$2:I

    invoke-static {v0, v1, v2, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->lambda$getListOfCardPositionsThatRequireNoBottomSpacing$0(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
