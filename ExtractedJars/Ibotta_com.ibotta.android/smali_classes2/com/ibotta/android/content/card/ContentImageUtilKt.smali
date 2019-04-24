.class public final Lcom/ibotta/android/content/card/ContentImageUtilKt;
.super Ljava/lang/Object;
.source "ContentImageUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u000b"
    }
    d2 = {
        "glideSize",
        "Lcom/ibotta/android/views/images/Sizes;",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getGlideSize",
        "(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/images/Sizes;",
        "getImagePaddingRLT",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "isShopNow",
        "",
        "ibotta-reducers_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final getGlideSize(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/images/Sizes;
    .locals 1
    .param p0    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Lcom/ibotta/android/views/images/Sizes;->OFFER_FULL_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    :goto_1
    return-object p0
.end method

.method public static final getImagePaddingRLT(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;Z)I
    .locals 3
    .param p0    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p0, v0, :cond_1

    :cond_0
    if-eqz p2, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-ne p0, v1, :cond_2

    goto :goto_1

    :cond_2
    if-nez p0, :cond_3

    .line 13
    sget p0, Lcom/ibotta/android/reducers/R$dimen;->offer_image_padding:I

    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :goto_1
    return v2

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
