.class public final enum Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;
.super Ljava/lang/Enum;
.source "GalleryRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum BANNERS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum DIVIDER:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum PRODUCT_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum REBATE_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum SPECIAL_CONDITIONS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

.field public static final enum TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;


# instance fields
.field private final maxRecycledViews:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "BANNERS"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "TITLE_BAR"

    const/4 v4, 0x1

    const/16 v5, 0x8

    invoke-direct {v0, v1, v4, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "OFFER_CARD"

    const/16 v5, 0x1e

    invoke-direct {v0, v1, v3, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "REBATE_ROW"

    const/16 v5, 0x14

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->REBATE_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "PRODUCT_ROW"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v5}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->PRODUCT_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "SPECIAL_CONDITIONS"

    const/4 v5, 0x5

    invoke-direct {v0, v1, v5, v3}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const-string v1, "DIVIDER"

    const/4 v8, 0x6

    const/16 v9, 0xa

    invoke-direct {v0, v1, v8, v9}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->DIVIDER:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->REBATE_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->PRODUCT_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->SPECIAL_CONDITIONS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->DIVIDER:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    aput-object v1, v0, v8

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->maxRecycledViews:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    return-object v0
.end method


# virtual methods
.method public getMaxRecycledViews()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->maxRecycledViews:I

    return v0
.end method
