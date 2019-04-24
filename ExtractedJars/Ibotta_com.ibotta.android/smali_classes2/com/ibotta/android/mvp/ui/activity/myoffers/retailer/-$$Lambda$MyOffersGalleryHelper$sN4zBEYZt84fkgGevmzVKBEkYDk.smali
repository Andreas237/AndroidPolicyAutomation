.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ToIntFunction;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/-$$Lambda$MyOffersGalleryHelper$sN4zBEYZt84fkgGevmzVKBEkYDk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryHelper;->lambda$getOffersCount$1(Lcom/ibotta/api/model/OfferCategoryModel;)I

    move-result p1

    return p1
.end method
