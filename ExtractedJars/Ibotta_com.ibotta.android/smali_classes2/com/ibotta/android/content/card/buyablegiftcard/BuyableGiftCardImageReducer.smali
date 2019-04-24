.class public final Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
.super Ljava/lang/Object;
.source "BuyableGiftCardImageReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "isShopNow",
        "",
        "create",
        "Lcom/ibotta/android/views/content/ContentImageViewState;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getImageHeight",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final isShopNow:Z

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->resources:Landroid/content/res/Resources;

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->isShopNow:Z

    return-void
.end method

.method private final getImageHeight(Landroid/content/res/Resources;Lcom/ibotta/android/views/content/ContentStyle;)I
    .locals 2

    .line 29
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x1

    if-eq p2, v0, :cond_1

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-ne v0, v1, :cond_2

    const/4 p1, -0x2

    goto :goto_2

    :cond_2
    if-nez v0, :cond_3

    .line 31
    sget-object v0, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/views/util/CardHelper;->getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I

    move-result p1

    :goto_2
    return p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 7
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buyableGiftCardModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState;

    .line 21
    invoke-static {p2}, Lcom/ibotta/android/content/card/ContentImageUtilKt;->getGlideSize(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/images/Sizes;

    move-result-object v6

    .line 22
    iget-object v1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->resources:Landroid/content/res/Resources;

    invoke-direct {p0, v1, p2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->getImageHeight(Landroid/content/res/Resources;Lcom/ibotta/android/views/content/ContentStyle;)I

    move-result v4

    .line 23
    iget-object v1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->resources:Landroid/content/res/Resources;

    iget-boolean v2, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->isShopNow:Z

    invoke-static {p2, v1, v2}, Lcom/ibotta/android/content/card/ContentImageUtilKt;->getImagePaddingRLT(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;Z)I

    move-result v3

    .line 24
    sget-object v5, Lcom/ibotta/android/views/content/ScaleType;->FIT_CENTER:Lcom/ibotta/android/views/content/ScaleType;

    .line 25
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    move-object v1, v0

    .line 20
    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V

    return-object v0
.end method
