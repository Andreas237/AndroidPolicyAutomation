.class public Lcom/shopkick/app/activities/DetailsActivity;
.super Lcom/shopkick/app/activities/MultiScreenActivity;
.source "DetailsActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;-><init>()V

    return-void
.end method

.method private goToOfferDetailsScreenFromOfferDetailsScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 4

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DetailsActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    .line 62
    iget-boolean v1, p0, Lcom/shopkick/app/activities/DetailsActivity;->isChangingScreens:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 66
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DetailsActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 68
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/DetailsActivity;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v2

    .line 69
    invoke-virtual {p0, v2}, Lcom/shopkick/app/activities/DetailsActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    .line 72
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 73
    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v3, 0x7f090197

    .line 74
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, v2, p1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 81
    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->screenWillShow()V

    .line 82
    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->screenDidShow()V

    return v3
.end method


# virtual methods
.method public acceptAppboyIAM()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 5

    .line 24
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DetailsActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/products/ProductDetailsScreen;

    if-ne v1, v2, :cond_2

    .line 26
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/products/ProductDetailsScreen;

    if-ne v1, v2, :cond_2

    .line 27
    iget-boolean v1, p0, Lcom/shopkick/app/activities/DetailsActivity;->isChangingScreens:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DetailsActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 32
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 33
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/DetailsActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    return v3

    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/DetailsActivity;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v2

    .line 37
    invoke-virtual {p0, v2}, Lcom/shopkick/app/activities/DetailsActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    .line 40
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 41
    invoke-virtual {v4, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v4, 0x7f090197

    .line 42
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, v2, p1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/activities/DetailsActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 49
    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->screenWillShow()V

    .line 50
    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->screenDidShow()V

    return v3

    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/products/OfferDetailsScreen;

    if-ne v0, v1, :cond_3

    .line 53
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/products/OfferDetailsScreen;

    if-ne v0, v1, :cond_3

    .line 54
    invoke-direct {p0, p1}, Lcom/shopkick/app/activities/DetailsActivity;->goToOfferDetailsScreenFromOfferDetailsScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    return p1

    .line 56
    :cond_3
    invoke-super {p0, p1}, Lcom/shopkick/app/activities/MultiScreenActivity;->goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    return p1
.end method

.method public supportsToolbar()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
