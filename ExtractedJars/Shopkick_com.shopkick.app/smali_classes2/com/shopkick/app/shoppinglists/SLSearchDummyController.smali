.class public Lcom/shopkick/app/shoppinglists/SLSearchDummyController;
.super Ljava/lang/Object;
.source "SLSearchDummyController.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# static fields
.field private static final ANIMATION_DURATION:I = 0x12c

.field public static final HEADER_HEIGHT_DP:I = 0x32


# instance fields
.field private isSearchBarVisible:Z

.field private previousFirstVisibleItem:I

.field private searchBarAnimator:Landroid/view/animation/TranslateAnimation;

.field private searchBarDummy:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->isSearchBarVisible:Z

    .line 23
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    .line 25
    invoke-virtual {p1, p0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/SLSearchDummyController;)Landroid/view/View;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    return-object p0
.end method

.method private hideSearchBar()V
    .locals 10

    .line 53
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->isSearchBarVisible:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->isSearchBarVisible:Z

    .line 55
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    .line 62
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v9, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController$1;-><init>(Lcom/shopkick/app/shoppinglists/SLSearchDummyController;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private showSearchBar()V
    .locals 11

    .line 35
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->isSearchBarVisible:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->isSearchBarVisible:Z

    .line 37
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v7, v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v10, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    .line 45
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 46
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarDummy:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->searchBarAnimator:Landroid/view/animation/TranslateAnimation;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->cancel()V

    :cond_0
    return-void
.end method

.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    .line 95
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p1

    .line 96
    iget p2, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->previousFirstVisibleItem:I

    if-lt p1, p2, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-le p1, p2, :cond_2

    if-lez p1, :cond_2

    .line 99
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->hideSearchBar()V

    goto :goto_1

    .line 97
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->showSearchBar()V

    .line 101
    :cond_2
    :goto_1
    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLSearchDummyController;->previousFirstVisibleItem:I

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
