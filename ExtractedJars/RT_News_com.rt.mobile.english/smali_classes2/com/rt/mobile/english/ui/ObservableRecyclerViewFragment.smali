.class public Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;
.super Landroid/support/v4/app/Fragment;
.source "ObservableRecyclerViewFragment.java"

# interfaces
.implements Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollViewCallbacks;


# instance fields
.field private mBaseTranslationY:I

.field private recyclerView:Landroid/support/v7/widget/RecyclerView;

.field private toolbar:Landroid/support/v7/widget/Toolbar;

.field private toolbarAndTabs:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private adjustToolbar(Lcom/github/ksoichiro/android/observablescrollview/ScrollState;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    sget-object v0, Lcom/github/ksoichiro/android/observablescrollview/ScrollState;->DOWN:Lcom/github/ksoichiro/android/observablescrollview/ScrollState;

    if-ne p1, v0, :cond_1

    .line 69
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->showToolbar()V

    goto :goto_0

    .line 70
    :cond_1
    sget-object v0, Lcom/github/ksoichiro/android/observablescrollview/ScrollState;->UP:Lcom/github/ksoichiro/android/observablescrollview/ScrollState;

    if-ne p1, v0, :cond_2

    .line 71
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->hideToolbar()V

    goto :goto_0

    .line 73
    :cond_2
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarIsShown()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarIsHidden()Z

    move-result p1

    if-nez p1, :cond_3

    .line 74
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->showToolbar()V

    :cond_3
    :goto_0
    return-void
.end method

.method private hideToolbar()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    .line 106
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->cancel()V

    .line 109
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->translationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->setDuration(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->start()V

    :cond_0
    return-void
.end method

.method private toolbarIsShown()Z
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 27
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDownMotionEvent()V
    .locals 0

    return-void
.end method

.method public onScrollChanged(IZZ)V
    .locals 1

    if-eqz p3, :cond_1

    .line 116
    iget-object p3, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p3}, Landroid/support/v7/widget/Toolbar;->getHeight()I

    move-result p3

    .line 117
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    if-eqz p2, :cond_0

    neg-int p2, p3

    int-to-float p2, p2

    cmpg-float p2, p2, v0

    if-gez p2, :cond_0

    .line 120
    iput p1, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->mBaseTranslationY:I

    .line 123
    :cond_0
    iget p2, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->mBaseTranslationY:I

    sub-int/2addr p1, p2

    neg-int p1, p1

    int-to-float p1, p1

    neg-int p2, p3

    int-to-float p2, p2

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lcom/github/ksoichiro/android/observablescrollview/ScrollUtils;->getFloat(FFF)F

    move-result p1

    .line 124
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {p2}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object p2

    invoke-virtual {p2}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->cancel()V

    .line 125
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {p2, p1}, Lcom/nineoldandroids/view/ViewHelper;->setTranslationY(Landroid/view/View;F)V

    :cond_1
    return-void
.end method

.method public onUpOrCancelMotionEvent(Lcom/github/ksoichiro/android/observablescrollview/ScrollState;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    iput v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->mBaseTranslationY:I

    .line 61
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->adjustToolbar(Lcom/github/ksoichiro/android/observablescrollview/ScrollState;)V

    return-void
.end method

.method public setRecyclerViewWithCallbacks(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;Landroid/support/v7/widget/Toolbar;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 33
    iput-object p2, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    .line 34
    iput-object p3, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    .line 35
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->showToolbar()V

    return-void
.end method

.method public showToolbar()V
    .locals 3

    .line 88
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->cancel()V

    .line 91
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->translationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->setDuration(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->start()V

    :cond_0
    return-void
.end method

.method public showToolbarNoAnimation()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->animate(Landroid/view/View;)Lcom/nineoldandroids/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;->cancel()V

    .line 99
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    :cond_0
    return-void
.end method

.method toolbarIsHidden()Z
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbarAndTabs:Landroid/view/View;

    invoke-static {v0}, Lcom/nineoldandroids/view/ViewHelper;->getTranslationY(Landroid/view/View;)F

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ObservableRecyclerViewFragment;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {v1}, Landroid/support/v7/widget/Toolbar;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
