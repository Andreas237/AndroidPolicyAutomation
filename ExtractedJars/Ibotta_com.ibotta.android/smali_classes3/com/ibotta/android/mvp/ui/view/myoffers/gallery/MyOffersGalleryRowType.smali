.class public final enum Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;
.super Ljava/lang/Enum;
.source "MyOffersGalleryRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

.field public static final enum REBATE_CARD:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

.field public static final enum TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;


# instance fields
.field private final maxRecycledViews:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    const-string v1, "TITLE_BAR"

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    const-string v1, "REBATE_CARD"

    const/4 v3, 0x1

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->REBATE_CARD:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->REBATE_CARD:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 14
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->maxRecycledViews:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;

    return-object v0
.end method


# virtual methods
.method public getMaxRecycledViews()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryRowType;->maxRecycledViews:I

    return v0
.end method
