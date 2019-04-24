.class public final Lcom/ibotta/android/views/util/IbottaViewsUtilKt;
.super Ljava/lang/Object;
.source "IbottaViewsUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000c\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\r"
    }
    d2 = {
        "getDimensionPxForLayout",
        "",
        "layoutAttribute",
        "Lcom/ibotta/android/views/generic/LayoutAttribute;",
        "convertToLayoutParams",
        "Landroid/view/ViewGroup$LayoutParams;",
        "Lcom/ibotta/android/views/generic/LayoutViewState;",
        "enableBackgroundRipple",
        "",
        "Landroid/view/View;",
        "borderless",
        "",
        "enableForegroundRipple",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final convertToLayoutParams(Lcom/ibotta/android/views/generic/LayoutViewState;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .param p0    # Lcom/ibotta/android/views/generic/LayoutViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/android/views/generic/LayoutViewState;->getWidth()Lcom/ibotta/android/views/generic/LayoutAttribute;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->getDimensionPxForLayout(Lcom/ibotta/android/views/generic/LayoutAttribute;)I

    move-result v0

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/views/generic/LayoutViewState;->getHeight()Lcom/ibotta/android/views/generic/LayoutAttribute;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->getDimensionPxForLayout(Lcom/ibotta/android/views/generic/LayoutAttribute;)I

    move-result p0

    .line 45
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v0, p0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    return-object v1
.end method

.method public static final enableBackgroundRipple(Landroid/view/View;Z)V
    .locals 3
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    if-eqz p1, :cond_0

    const p1, 0x101045c

    goto :goto_0

    :cond_0
    const p1, 0x101030e

    .line 23
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "this.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 24
    iget p1, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method

.method public static final enableForegroundRipple(Landroid/view/View;Z)V
    .locals 3
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 30
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    if-eqz p1, :cond_0

    const p1, 0x101045c

    goto :goto_0

    :cond_0
    const p1, 0x101030e

    .line 35
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "this.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "this.context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 37
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "this.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method private static final getDimensionPxForLayout(Lcom/ibotta/android/views/generic/LayoutAttribute;)I
    .locals 1

    .line 49
    sget-object v0, Lcom/ibotta/android/views/generic/MatchParent;->INSTANCE:Lcom/ibotta/android/views/generic/MatchParent;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    .line 50
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/generic/WrapContent;->INSTANCE:Lcom/ibotta/android/views/generic/WrapContent;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, -0x2

    goto :goto_0

    .line 51
    :cond_1
    instance-of v0, p0, Lcom/ibotta/android/views/generic/Hardcoded;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/ibotta/android/views/generic/Hardcoded;

    invoke-virtual {p0}, Lcom/ibotta/android/views/generic/Hardcoded;->getPx()I

    move-result p0

    :goto_0
    return p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
