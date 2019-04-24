.class public abstract Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;
.super Landroid/support/design/widget/CoordinatorLayout$Behavior;
.source "VerticalScrollingBehavior.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior$ScrollDirection;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroid/support/design/widget/CoordinatorLayout$Behavior<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private overScrollDirection:I

.field private scrollDirection:I

.field private totalDy:I

.field private totalDyUnconsumed:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/support/design/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    .line 21
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    .line 22
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    .line 24
    iput v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    .line 21
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    .line 22
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    .line 24
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    return-void
.end method


# virtual methods
.method public getOverScrollDirection()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    return v0
.end method

.method public getScrollDirection()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    return v0
.end method

.method public onApplyWindowInsets(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/support/v4/view/WindowInsetsCompat;)Landroid/support/v4/view/WindowInsetsCompat;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/support/v4/view/WindowInsetsCompat;",
            ")",
            "Landroid/support/v4/view/WindowInsetsCompat;"
        }
    .end annotation

    .line 147
    invoke-super {p0, p1, p2, p3}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onApplyWindowInsets(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/support/v4/view/WindowInsetsCompat;)Landroid/support/v4/view/WindowInsetsCompat;

    move-result-object p1

    return-object p1
.end method

.method public abstract onDirectionNestedPreScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation
.end method

.method protected abstract onNestedDirectionFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFI)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FFI)Z"
        }
    .end annotation
.end method

.method public onNestedFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFZ)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FFZ)Z"
        }
    .end annotation

    .line 130
    invoke-super/range {p0 .. p6}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onNestedFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFZ)Z

    const/4 p6, 0x0

    cmpl-float p6, p5, p6

    if-lez p6, :cond_0

    const/4 p6, 0x1

    goto :goto_0

    :cond_0
    const/4 p6, -0x1

    .line 131
    :goto_0
    iput p6, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    .line 132
    iget v6, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->onNestedDirectionFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFI)Z

    move-result p1

    return p1
.end method

.method public onNestedPreFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FF)Z"
        }
    .end annotation

    .line 141
    invoke-super/range {p0 .. p5}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onNestedPreFling(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation

    .line 115
    invoke-super/range {p0 .. p7}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onNestedPreScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V

    const/4 p7, 0x0

    if-lez p5, :cond_0

    .line 116
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    if-gez v0, :cond_0

    .line 117
    iput p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    const/4 p7, 0x1

    .line 118
    iput p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    goto :goto_0

    :cond_0
    if-gez p5, :cond_1

    .line 119
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    if-lez v0, :cond_1

    .line 120
    iput p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    const/4 p7, -0x1

    .line 121
    iput p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    .line 123
    :cond_1
    :goto_0
    iget p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    add-int/2addr p7, p5

    iput p7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDy:I

    .line 124
    iget v7, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->scrollDirection:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->onDirectionNestedPreScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "IIIII)V"
        }
    .end annotation

    .line 100
    invoke-super/range {p0 .. p8}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onNestedScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII)V

    const/4 p3, 0x0

    if-lez p7, :cond_0

    .line 101
    iget p4, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    if-gez p4, :cond_0

    .line 102
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    const/4 p3, 0x1

    .line 103
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    goto :goto_0

    :cond_0
    if-gez p7, :cond_1

    .line 104
    iget p4, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    if-lez p4, :cond_1

    .line 105
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    const/4 p3, -0x1

    .line 106
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    .line 108
    :cond_1
    :goto_0
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    add-int/2addr p3, p7

    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    .line 109
    iget v3, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->overScrollDirection:I

    iget v5, p0, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->totalDyUnconsumed:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/view/nav/VerticalScrollingBehavior;->onNestedVerticalOverScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "II)V"
        }
    .end annotation

    .line 89
    invoke-super/range {p0 .. p6}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onNestedScrollAccepted(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public abstract onNestedVerticalOverScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;III)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;III)V"
        }
    .end annotation
.end method

.method public onSaveInstanceState(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation

    .line 152
    invoke-super {p0, p1, p2}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onSaveInstanceState(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object p1

    return-object p1
.end method

.method public onStartNestedScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "II)Z"
        }
    .end annotation

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onStopNestedScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/design/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    .line 94
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/design/widget/CoordinatorLayout$Behavior;->onStopNestedScroll(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V

    return-void
.end method
