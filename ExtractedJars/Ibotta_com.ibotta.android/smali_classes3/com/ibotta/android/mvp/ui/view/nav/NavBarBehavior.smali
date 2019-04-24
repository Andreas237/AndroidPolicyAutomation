.class public Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;
.super Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;
.source "NavBarBehavior.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final ALPHA_INVISIBLE:F = 0.0f

.field private static final SCROLL_THRESHOLD:I = 0x5

.field private static final TRANSLATION_SHOW:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x1

    .line 28
    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100d0

    aput v2, v0, v1

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private animateOffset(Landroid/view/View;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;FF)V"
        }
    .end annotation

    .line 81
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->animate(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object p1

    .line 82
    invoke-virtual {p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->translationY(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object p1

    .line 83
    invoke-virtual {p1, p3}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->alpha(F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object p1

    const-wide/16 p2, 0x1f4

    .line 84
    invoke-virtual {p1, p2, p3}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setDuration(J)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->INTERPOLATOR:Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;

    .line 85
    invoke-virtual {p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->setInterpolator(Landroid/view/animation/Interpolator;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->start()V

    return-void
.end method

.method public static from(Landroid/view/View;)Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ">(TV;)",
            "Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior<",
            "TV;>;"
        }
    .end annotation

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    .line 34
    instance-of v0, p0, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;

    if-eqz v0, :cond_1

    .line 37
    check-cast p0, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;

    .line 38
    invoke-virtual {p0}, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroid/support/design/widget/CoordinatorLayout$Behavior;

    move-result-object p0

    .line 39
    instance-of v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;

    if-eqz v0, :cond_0

    .line 43
    check-cast p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;

    return-object p0

    .line 40
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The view is not associated with BottomNavigationBehavior"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 35
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The view is not a child of CoordinatorLayout"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private handleDirection(Landroid/view/View;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;II)V"
        }
    .end annotation

    .line 60
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    const/4 v0, 0x5

    if-le p3, v0, :cond_1

    .line 61
    move-object p3, p1

    check-cast p3, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    .line 62
    invoke-virtual {p3}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->isHidden()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    .line 63
    invoke-virtual {p3, p2}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setHidden(Z)V

    const/high16 p2, 0x3f800000    # 1.0f

    .line 64
    invoke-direct {p0, p1, v1, p2}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;->animateOffset(Landroid/view/View;FF)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 65
    invoke-virtual {p3}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->isHidden()Z

    move-result p2

    if-nez p2, :cond_1

    .line 66
    invoke-virtual {p3, v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->setHidden(Z)V

    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    invoke-direct {p0, p1, p2, v1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;->animateOffset(Landroid/view/View;FF)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onDirectionNestedPreScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p2, p7, p5}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;->handleDirection(Landroid/view/View;II)V

    return-void
.end method

.method protected onNestedDirectionFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFI)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FFI)Z"
        }
    .end annotation

    float-to-int p1, p5

    .line 76
    invoke-direct {p0, p2, p6, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarBehavior;->handleDirection(Landroid/view/View;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public onNestedVerticalOverScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;III)V"
        }
    .end annotation

    return-void
.end method
