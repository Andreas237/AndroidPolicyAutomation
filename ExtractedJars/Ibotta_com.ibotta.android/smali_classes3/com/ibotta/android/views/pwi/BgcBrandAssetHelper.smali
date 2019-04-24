.class public final Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;
.super Ljava/lang/Object;
.source "BgcBrandAssetHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;",
        "",
        "()V",
        "BRAND_RESOURCE_MAP",
        "com/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1",
        "Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;",
        "getBrandResId",
        "",
        "cardBrand",
        "",
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
.field private static final BRAND_RESOURCE_MAP:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;

.field public static final INSTANCE:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;

    invoke-direct {v0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->INSTANCE:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;

    .line 14
    new-instance v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;

    invoke-direct {v0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->BRAND_RESOURCE_MAP:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBrandResId(Ljava/lang/String;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->BRAND_RESOURCE_MAP:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget p1, Lcom/ibotta/views/R$drawable;->svg_icon_unknown:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    const-string v0, "BRAND_RESOURCE_MAP[cardB\u2026drawable.svg_icon_unknown"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
