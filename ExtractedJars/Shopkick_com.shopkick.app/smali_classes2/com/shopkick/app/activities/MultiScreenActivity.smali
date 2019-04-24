.class public abstract Lcom/shopkick/app/activities/MultiScreenActivity;
.super Lcom/shopkick/app/activities/BaseActivity;
.source "MultiScreenActivity.java"


# instance fields
.field protected appScreens:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private containerView:Landroid/view/View;

.field protected isChangingScreens:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/activities/BaseActivity;-><init>()V

    return-void
.end method

.method private addInitialScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)V
    .locals 3

    .line 61
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/MultiScreenActivity;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    .line 62
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 64
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f090197

    invoke-virtual {v1, v2, v0, p1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 65
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 66
    iget-object p1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart()V

    return-void
.end method

.method private goToScreenInCurrentActivityInternal(Lcom/shopkick/app/activities/PageIdentifierV2;Z)Z
    .locals 8

    .line 191
    iget-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 197
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/screens/AppScreen;

    .line 198
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v4, :cond_4

    .line 200
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/shopkick/app/screens/AppScreen;->setParams(Ljava/util/Map;)V

    .line 201
    invoke-virtual {v3}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 203
    iput-boolean v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    .line 204
    invoke-virtual {p0, v4}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    return v0

    .line 207
    :cond_1
    invoke-virtual {p0, v4}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    .line 208
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    if-eqz p2, :cond_2

    .line 210
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v4, p2}, Lcom/shopkick/app/screens/AppScreen;->getPopEnterAnimationRes(Ljava/lang/Class;)I

    move-result p2

    .line 211
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/shopkick/app/screens/AppScreen;->getPopExitAnimationRes(Ljava/lang/Class;)I

    move-result v5

    .line 212
    invoke-virtual {p1, p2, v5}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 214
    :cond_2
    invoke-virtual {p1, v3}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 218
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 220
    iget-object p2, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    sub-int/2addr p2, v0

    move v3, v1

    :goto_0
    if-ltz p2, :cond_6

    .line 221
    iget-object v5, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/screens/AppScreen;

    .line 222
    invoke-virtual {v5}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v3, :cond_6

    .line 225
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_2

    .line 229
    :cond_3
    invoke-virtual {p1, v5}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 230
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    move v3, v0

    goto :goto_0

    .line 236
    :cond_4
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/MultiScreenActivity;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    .line 237
    invoke-virtual {p0, v1}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    .line 238
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    if-eqz p2, :cond_5

    .line 240
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/screens/AppScreen;->getPushEnterAnimationRes(Ljava/lang/Class;)I

    move-result p2

    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/shopkick/app/screens/AppScreen;->getPushExitAnimationRes(Ljava/lang/Class;)I

    move-result v5

    .line 242
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/shopkick/app/screens/AppScreen;->getPopEnterAnimationRes(Ljava/lang/Class;)I

    move-result v6

    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/shopkick/app/screens/AppScreen;->getPopExitAnimationRes(Ljava/lang/Class;)I

    move-result v7

    .line 244
    invoke-virtual {v4, p2, v5, v6, v7}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_1

    .line 248
    :cond_5
    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart()V

    .line 250
    :goto_1
    invoke-virtual {v4, v3}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p2

    const v3, 0x7f090197

    .line 251
    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v3, v1, p1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object p1

    .line 252
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 253
    iget-object p1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v0

    .line 255
    :cond_6
    :goto_2
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    if-eqz v1, :cond_7

    .line 258
    iget-object p1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->containerView:Landroid/view/View;

    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->requestApplyInsets(Landroid/view/View;)V

    :cond_7
    return v0
.end method


# virtual methods
.method public clearActionEducationScreen()V
    .locals 5

    .line 336
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    .line 337
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 338
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 339
    instance-of v3, v2, Lcom/shopkick/app/store/ActionEducationScreen;

    if-eqz v3, :cond_0

    .line 340
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 341
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 342
    invoke-virtual {v4, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 343
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 344
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 345
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public clearAllPayPalScreens()V
    .locals 5

    .line 351
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    .line 352
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 353
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 354
    instance-of v3, v2, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    if-nez v3, :cond_0

    instance-of v3, v2, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;

    if-eqz v3, :cond_1

    .line 355
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 356
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 357
    invoke-virtual {v4, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 358
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 359
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 360
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getContextStackLog()Ljava/lang/String;
    .locals 2

    .line 314
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity [name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", screens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getDefaultInitialScreen()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTopScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    return-object v0
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 2

    .line 179
    invoke-virtual {p0, p1}, Lcom/shopkick/app/activities/MultiScreenActivity;->validatePageIdentifier(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/activities/MultiScreenActivity;->goToScreenInCurrentActivityInternal(Lcom/shopkick/app/activities/PageIdentifierV2;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method protected handleOnCreate()V
    .locals 4

    .line 36
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "page_identifier"

    .line 40
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "page_identifier"

    .line 41
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getDefaultInitialScreen()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 45
    :goto_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->addInitialScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)V

    const v0, 0x1020002

    .line 49
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 51
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->containerView:Landroid/view/View;

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->containerView:Landroid/view/View;

    if-eqz v0, :cond_1

    const v1, 0x7f09003e

    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->containerView:Landroid/view/View;

    invoke-static {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->setOnApplyWindowInsetListener(Landroid/view/View;)V

    const v0, 0x7f090197

    .line 57
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->setOnApplyWindowInsetListener(Landroid/view/View;)V

    return-void
.end method

.method protected handleOnPause()V
    .locals 1

    .line 82
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->screenWillHide()V

    .line 85
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->screenDidHide()V

    .line 87
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnPause()V

    return-void
.end method

.method protected handleOnResume()V
    .locals 1

    .line 72
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnResume()V

    .line 74
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnResume()V

    :cond_0
    return-void
.end method

.method protected handleOnStop()V
    .locals 1

    .line 92
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnStop()V

    .line 94
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->shouldTriggerLifeCycleOnStart()V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 286
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-nez v0, :cond_0

    .line 287
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->finish()V

    return-void

    .line 290
    :cond_0
    sget-object v0, Lcom/shopkick/app/activities/MultiScreenActivity$1;->$SwitchMap$com$shopkick$app$screens$AppScreen$BackPressedState:[I

    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 306
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    .line 307
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 292
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 293
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 296
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getOriginalPageIdentifierV2()Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/activities/MultiScreenActivity;->goToScreenInCurrentActivityInternal(Lcom/shopkick/app/activities/PageIdentifierV2;Z)Z

    goto :goto_0

    .line 301
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->hideKeyboard()V

    .line 302
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "page_identifier"

    .line 184
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 186
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->goToScreenInCurrentActivityInternal(Lcom/shopkick/app/activities/PageIdentifierV2;Z)Z

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 277
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    .line 278
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    .line 281
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/activities/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onScreenTransitionEnd()V
    .locals 1

    .line 165
    iget-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 166
    iput-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    :cond_0
    return-void
.end method

.method protected recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 3

    .line 265
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getParams()Ljava/util/Map;

    move-result-object v0

    const-string v1, "origin_screen"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 266
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getParams()Ljava/util/Map;

    move-result-object v1

    const-string v2, "origin_element"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 267
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    .line 268
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 269
    :goto_1
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object p1

    .line 270
    iget-object v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    invoke-virtual {v1, v0, v2, p1}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->recordGoToScreen(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public removeScreen(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 2

    .line 323
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 324
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->onBackPressed()V

    return-void

    .line 327
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 328
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 329
    invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 330
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 331
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 332
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 111
    iget-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 114
    iput-boolean v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    .line 116
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, v2, p1, p2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 117
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    .line 118
    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p2, :cond_1

    .line 119
    iget-object v2, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    invoke-virtual {v2}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    .line 121
    iput-boolean p1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->isChangingScreens:Z

    .line 122
    invoke-virtual {p0, p2}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    return-void

    .line 125
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    if-nez p2, :cond_2

    .line 127
    invoke-virtual {p0, v1}, Lcom/shopkick/app/activities/MultiScreenActivity;->createScreen(Lcom/shopkick/app/activities/PageIdentifierV2;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object p2

    .line 130
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 131
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v3, 0x7f010029

    const v4, 0x7f01002c

    .line 132
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_0

    .line 135
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const v3, 0x7f010028

    const v4, 0x7f01002d

    .line 136
    invoke-virtual {v2, v3, v4}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 138
    :goto_0
    invoke-virtual {p0, p2}, Lcom/shopkick/app/activities/MultiScreenActivity;->recordGoToScreen(Lcom/shopkick/app/screens/AppScreen;)V

    const v3, 0x7f090197

    .line 139
    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->toTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, p2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 141
    iget-object v1, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v0, :cond_5

    .line 142
    invoke-virtual {p0}, Lcom/shopkick/app/activities/MultiScreenActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 143
    iget-object v2, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_4

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 145
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/shopkick/app/screens/AppScreen;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 147
    iget-object v3, p0, Lcom/shopkick/app/activities/MultiScreenActivity;->appScreens:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 148
    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    :cond_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 151
    :cond_4
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 153
    :cond_5
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    return-void
.end method
