.class public final Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;
.super Ljava/lang/Object;
.source "CollapsingToolbarAttributeGenerator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;",
        "",
        "()V",
        "collapsedTitleTypeface",
        "Landroid/graphics/Typeface;",
        "kotlin.jvm.PlatformType",
        "getCollapsedTitleTypeface",
        "()Landroid/graphics/Typeface;",
        "getExpandedTitleMarginStart",
        "",
        "retailerLogoLayoutParams",
        "Landroid/support/constraint/ConstraintLayout$LayoutParams;",
        "headerStartPadding",
        "getExpandedTitleMarginTop",
        "headerLayoutParams",
        "Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;",
        "tvSubtitle",
        "Landroid/widget/TextView;",
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
.field public static final INSTANCE:Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

.field private static final collapsedTitleTypeface:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    new-instance v0, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

    invoke-direct {v0}, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->INSTANCE:Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

    const-string v0, "sans-serif"

    const/4 v1, 0x1

    .line 11
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->collapsedTitleTypeface:Landroid/graphics/Typeface;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCollapsedTitleTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->collapsedTitleTypeface:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final getExpandedTitleMarginStart(Landroid/support/constraint/ConstraintLayout$LayoutParams;I)I
    .locals 1
    .param p1    # Landroid/support/constraint/ConstraintLayout$LayoutParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "retailerLogoLayoutParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget v0, p1, Landroid/support/constraint/ConstraintLayout$LayoutParams;->width:I

    add-int/2addr v0, p2

    iget p1, p1, Landroid/support/constraint/ConstraintLayout$LayoutParams;->rightMargin:I

    add-int/2addr v0, p1

    return v0
.end method

.method public final getExpandedTitleMarginTop(Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;Landroid/widget/TextView;)I
    .locals 1
    .param p1    # Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "headerLayoutParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tvSubtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 18
    invoke-virtual {p2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 19
    iget p1, p1, Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;->topMargin:I

    iget v0, p2, Landroid/support/constraint/ConstraintLayout$LayoutParams;->height:I

    iget p2, p2, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, p2

    add-int/2addr p1, v0

    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    iget p1, p1, Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;->topMargin:I

    :goto_0
    return p1
.end method
