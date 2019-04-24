.class public Lcom/ibotta/android/commons/view/TintableImageButton;
.super Landroid/widget/ImageButton;
.source "TintableImageButton.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0016\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001a\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/TintableImageButton;",
        "Landroid/widget/ImageButton;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "disabledTint",
        "hasClickListener",
        "",
        "overrideDraw",
        "pressedTint",
        "supportedColorTypes",
        "",
        "touching",
        "getColor",
        "value",
        "Landroid/util/TypedValue;",
        "onDraw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "setEnabled",
        "enabled",
        "setOnClickListener",
        "l",
        "Landroid/view/View$OnClickListener;",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final disabledTint:I

.field private hasClickListener:Z

.field private overrideDraw:Z

.field private final pressedTint:I

.field private final supportedColorTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private touching:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/view/TintableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/commons/view/TintableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x4

    .line 33
    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->supportedColorTypes:Ljava/util/Set;

    .line 43
    sget-object v0, Lcom/ibotta/android/commons/R$styleable;->CommonsTintable:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 45
    sget p3, Lcom/ibotta/android/commons/R$styleable;->CommonsTintable_pressedTint:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/commons/view/TintableImageButton;->getColor(Landroid/content/Context;Landroid/util/TypedValue;)I

    move-result p3

    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    sget p3, Lcom/ibotta/android/commons/R$color;->commons_image_button_pressed_tint_default:I

    invoke-static {p1, p3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    .line 48
    :goto_0
    iput p3, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->pressedTint:I

    .line 51
    sget p3, Lcom/ibotta/android/commons/R$styleable;->CommonsTintable_disabledTint:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/commons/view/TintableImageButton;->getColor(Landroid/content/Context;Landroid/util/TypedValue;)I

    move-result p3

    if-eq p3, v0, :cond_1

    goto :goto_1

    .line 55
    :cond_1
    sget p3, Lcom/ibotta/android/commons/R$color;->commons_image_button_disabled_tint_default:I

    invoke-static {p1, p3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    .line 54
    :goto_1
    iput p3, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->disabledTint:I

    .line 57
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 28
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 29
    sget p3, Lcom/ibotta/android/commons/R$attr;->commons_image_button_style:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/commons/view/TintableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected final getColor(Landroid/content/Context;Landroid/util/TypedValue;)I
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/TypedValue;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->supportedColorTypes:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    if-eqz p2, :cond_0

    iget v1, p2, Landroid/util/TypedValue;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_1

    .line 112
    :try_start_0
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    invoke-static {p1, p2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_2
    const/4 p1, -0x1

    :goto_1
    return p1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-boolean v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->overrideDraw:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->disabledTint:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 97
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->touching:Z

    if-eqz v0, :cond_1

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->pressedTint:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 100
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 104
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 68
    iput-boolean v1, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->touching:Z

    .line 69
    iget v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->pressedTint:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/commons/view/TintableImageButton;->setColorFilter(I)V

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->buildDrawingCache()V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->invalidate()V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->touching:Z

    const/4 v0, 0x0

    .line 74
    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/commons/view/TintableImageButton;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->buildDrawingCache()V

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/TintableImageButton;->invalidate()V

    .line 80
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 81
    iget-boolean p1, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->hasClickListener:Z

    return p1
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 85
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_0

    .line 87
    iget p1, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->disabledTint:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/TintableImageButton;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 89
    check-cast p1, Landroid/graphics/ColorFilter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/TintableImageButton;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :goto_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 61
    :goto_0
    iput-boolean v0, p0, Lcom/ibotta/android/commons/view/TintableImageButton;->hasClickListener:Z

    .line 62
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
