.class public final Lcom/ibotta/android/views/util/CardHelper;
.super Ljava/lang/Object;
.source "CardHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\rH\u0002J.\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0006\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ibotta/android/views/util/CardHelper;",
        "",
        "()V",
        "offerSsWidth",
        "",
        "getOfferSsWidth",
        "()I",
        "retailerSsWidth",
        "getRetailerSsWidth",
        "ssRetailerCardHeight",
        "getSsRetailerCardHeight",
        "getDefaultImageHeight",
        "resources",
        "Landroid/content/res/Resources;",
        "getFullBleedSSCardWidth",
        "imageView",
        "Landroid/widget/ImageView;",
        "imageHeight",
        "imageWidth",
        "getImageHeight",
        "style",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getLargeImageHeight",
        "getSSCardWidth",
        "widthPercentage",
        "",
        "getSSImageHeight",
        "updateLayoutIfFullBleed",
        "",
        "cardView",
        "Landroid/support/v7/widget/CardView;",
        "ivImage",
        "glideSize",
        "Lcom/ibotta/android/views/images/Sizes;",
        "height",
        "width",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

.field private static final offerSsWidth:I

.field private static final retailerSsWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lcom/ibotta/android/views/util/CardHelper;

    invoke-direct {v0}, Lcom/ibotta/android/views/util/CardHelper;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    const v1, 0x3ea94467    # 0.3306f

    .line 35
    invoke-direct {v0, v1}, Lcom/ibotta/android/views/util/CardHelper;->getSSCardWidth(F)I

    move-result v1

    sput v1, Lcom/ibotta/android/views/util/CardHelper;->retailerSsWidth:I

    const v1, 0x3f1212d7    # 0.5706f

    .line 36
    invoke-direct {v0, v1}, Lcom/ibotta/android/views/util/CardHelper;->getSSCardWidth(F)I

    move-result v0

    sput v0, Lcom/ibotta/android/views/util/CardHelper;->offerSsWidth:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getDefaultImageHeight(Landroid/content/res/Resources;)I
    .locals 1

    .line 62
    sget v0, Lcom/ibotta/views/R$dimen;->size_18:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 63
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 65
    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x88

    div-int/lit16 p1, p1, 0xaa

    return p1
.end method

.method private final getFullBleedSSCardWidth(Landroid/widget/ImageView;II)I
    .locals 1

    .line 69
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result p1

    sub-int/2addr v0, p1

    mul-int v0, v0, p3

    div-int/2addr v0, p2

    return v0
.end method

.method private final getLargeImageHeight(Landroid/content/res/Resources;Lcom/ibotta/android/views/content/ContentStyle;)I
    .locals 1

    .line 54
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget p2, Lcom/ibotta/views/R$dimen;->size_24:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 55
    :goto_0
    sget v0, Lcom/ibotta/views/R$dimen;->offer_image_padding:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 56
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    sub-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0xc0

    .line 58
    div-int/lit16 p1, p1, 0x15f

    add-int/2addr p1, v0

    return p1
.end method

.method private final getSSCardWidth(F)I
    .locals 1

    .line 103
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getHardware()Lcom/ibotta/android/hardware/Hardware;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v0

    .line 104
    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int p1, v0

    return p1
.end method

.method private final getSSImageHeight(Landroid/content/res/Resources;)I
    .locals 1

    .line 96
    sget v0, Lcom/ibotta/views/R$dimen;->offer_image_padding:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    const v0, 0x3f1212d7    # 0.5706f

    .line 97
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/util/CardHelper;->getSSCardWidth(F)I

    move-result v0

    mul-int/lit16 v0, v0, 0xc0

    .line 99
    div-int/lit16 v0, v0, 0x15f

    add-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public final getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I
    .locals 1
    .param p1    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SIDE_SCROLLER:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p1, v0, :cond_0

    .line 46
    invoke-direct {p0, p2}, Lcom/ibotta/android/views/util/CardHelper;->getSSImageHeight(Landroid/content/res/Resources;)I

    move-result p1

    goto :goto_1

    .line 47
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-eq p1, v0, :cond_2

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p1, v0, :cond_1

    goto :goto_0

    .line 50
    :cond_1
    invoke-direct {p0, p2}, Lcom/ibotta/android/views/util/CardHelper;->getDefaultImageHeight(Landroid/content/res/Resources;)I

    move-result p1

    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/views/util/CardHelper;->getLargeImageHeight(Landroid/content/res/Resources;Lcom/ibotta/android/views/content/ContentStyle;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public final getOfferSsWidth()I
    .locals 1

    .line 36
    sget v0, Lcom/ibotta/android/views/util/CardHelper;->offerSsWidth:I

    return v0
.end method

.method public final getRetailerSsWidth()I
    .locals 1

    .line 35
    sget v0, Lcom/ibotta/android/views/util/CardHelper;->retailerSsWidth:I

    return v0
.end method

.method public final getSsRetailerCardHeight()I
    .locals 1

    const v0, 0x3ea94467    # 0.3306f

    .line 40
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/util/CardHelper;->getSSCardWidth(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4f

    .line 41
    div-int/lit8 v0, v0, 0x7c

    return v0
.end method

.method public final updateLayoutIfFullBleed(Landroid/support/v7/widget/CardView;Landroid/widget/ImageView;Lcom/ibotta/android/views/images/Sizes;II)V
    .locals 2
    .param p1    # Landroid/support/v7/widget/CardView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/ImageView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/images/Sizes;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cardView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ivImage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "glideSize"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float v0, p4

    int-to-float v1, p5

    div-float/2addr v0, v1

    .line 78
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->OFFER_FULL_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    if-ne p3, v1, :cond_2

    const p3, 0x3f0ac083    # 0.542f

    cmpl-float p3, v0, p3

    if-ltz p3, :cond_2

    const p3, 0x3f0d4fdf    # 0.552f

    cmpg-float p3, v0, p3

    if-gtz p3, :cond_2

    .line 80
    invoke-virtual {p1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    const v0, 0x3f1212d7    # 0.5706f

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/util/CardHelper;->getSSCardWidth(F)I

    move-result v0

    if-ne p3, v0, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    .line 86
    invoke-virtual {p1}, Landroid/support/v7/widget/CardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-direct {p0, p2, p4, p5}, Lcom/ibotta/android/views/util/CardHelper;->getFullBleedSSCardWidth(Landroid/widget/ImageView;II)I

    move-result p2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {p2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/4 p2, -0x2

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_2
    :goto_1
    return-void
.end method
