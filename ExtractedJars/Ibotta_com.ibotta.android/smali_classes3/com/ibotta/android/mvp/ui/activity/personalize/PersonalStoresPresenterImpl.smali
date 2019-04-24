.class public Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PersonalStoresPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenter;"
    }
.end annotation


# static fields
.field private static final FAKE_LOADING_TIME:J = 0xbb8L


# instance fields
.field private final allRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;",
            ">;"
        }
    .end annotation
.end field

.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

.field private favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final personalRetailerFinderFactory:Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

.field private personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

.field private final personalStoreRows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;",
            ">;"
        }
    .end annotation
.end field

.field private final personalStoresReducer:Lcom/ibotta/android/personalize/PersonalStoresReducer;

.field private state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private welcomeBonusId:I


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/personalize/PersonalStoresReducer;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 61
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    .line 62
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    .line 88
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 89
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 90
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 91
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 92
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 93
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 94
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    .line 95
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    .line 96
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoresReducer:Lcom/ibotta/android/personalize/PersonalStoresReducer;

    .line 97
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 98
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalRetailerFinderFactory:Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    return-void
.end method

.method private applySavedState()V
    .locals 4

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    .line 224
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v2

    .line 225
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object v1

    .line 227
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->getRetailerSelections()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    .line 228
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/model/PersonalStoresItem;->setSelected(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private createPersonalStoreItems(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/PersonalStoresItem;",
            ">;"
        }
    .end annotation

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    const/4 v3, 0x0

    .line 191
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-eqz v4, :cond_0

    .line 192
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    invoke-interface {v4, v3}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result v3

    .line 194
    :cond_0
    new-instance v4, Lcom/ibotta/android/view/model/PersonalStoresItem;

    .line 195
    invoke-interface {p1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    invoke-direct {v4, v2, v3, v5}, Lcom/ibotta/android/view/model/PersonalStoresItem;-><init>(Lcom/ibotta/api/model/RetailerModel;ZI)V

    .line 197
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->getRetailerSelections()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v2, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private createRows(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/PersonalStoresItem;",
            ">;)V"
        }
    .end annotation

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 208
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/model/PersonalStoresItem;

    .line 209
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;-><init>()V

    .line 210
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->setPersonalStoresItem(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 214
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoresReducer:Lcom/ibotta/android/personalize/PersonalStoresReducer;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->getTitleTextResId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/personalize/PersonalStoresReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    .line 215
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->getHeaderPrompt(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V

    .line 217
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 218
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private initFavoriteStoresManager(Lcom/ibotta/api/call/home/HomeResponse;)V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManagerFactory:Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;

    .line 183
    invoke-virtual {p1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/favorites/FavoriteRetailersManagerFactory;->newInstance(Ljava/util/List;)Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
.end method

.method private initWelcomeBonusDialog(Lcom/ibotta/api/model/customer/PendingWelcomeBonus;)V
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->hasSeenPendingWelcomeBonusDialog()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 241
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->getHeadline()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 242
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v0, :cond_3

    if-nez v1, :cond_2

    goto :goto_0

    .line 247
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->getId()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->welcomeBonusId:I

    .line 249
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;-><init>()V

    .line 250
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->getHeadline()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->setTitle(Ljava/lang/String;)V

    .line 251
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/PendingWelcomeBonus;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->setMessage(Ljava/lang/String;)V

    .line 252
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->getWelcomeBonusDialogButtonText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->setButtonText(Ljava/lang/String;)V

    .line 253
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->getAnimationFilename()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;->setAnimationName(Ljava/lang/String;)V

    .line 255
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->markPendingWelcomeBonusDialogSeen()V

    .line 257
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->showWelcomeBonusDialog(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog$AnimatedDialogDisplayValues;Z)V

    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method private routeUserToCorrectScreen()V
    .locals 3

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->showFeatured()V

    return-void
.end method

.method private saveFavorites()V
    .locals 3

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreRows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    .line 323
    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 325
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-eqz v2, :cond_0

    .line 326
    invoke-virtual {v1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v2, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->favorite(I)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public dialogActionClicked()V
    .locals 3

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "welcome_bonus_dialog_got_it_click"

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->welcomeBonusId:I

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;I)V

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->dismissWelcomeBonusDialog()V

    return-void
.end method

.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 114
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 116
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 117
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 119
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    invoke-interface {v1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createConfigApiJob()Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 122
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 123
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 126
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    return-object v0
.end method

.method public getPersonalStoreMode()Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 136
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->configJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 137
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 340
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->routeUserToCorrectScreen()V

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_0

    .line 143
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "homeJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->finish()V

    return-void

    .line 148
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 149
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->initFavoriteStoresManager(Lcom/ibotta/api/call/home/HomeResponse;)V

    .line 151
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalRetailerFinderFactory:Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-interface {v1, v2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;->createFor(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;

    move-result-object v1

    .line 153
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;->setRetailerModels(Ljava/util/List;)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;->setFavoriteRetailersManager(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    .line 156
    invoke-interface {v1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;->findPersonalRetailerModels()Ljava/util/List;

    move-result-object v0

    .line 158
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->showFeatured()V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->finish()V

    return-void

    .line 164
    :cond_1
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->createPersonalStoreItems(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 165
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->createRows(Ljava/util/List;)V

    .line 166
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->applySavedState()V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    const/4 v0, 0x1

    .line 169
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->setNextButtonEnabled(Z)V

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->customerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_2

    .line 172
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "customerByIdJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void

    .line 176
    :cond_2
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 177
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getPendingWelcomeBonus()Lcom/ibotta/api/model/customer/PendingWelcomeBonus;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->initWelcomeBonusDialog(Lcom/ibotta/api/model/customer/PendingWelcomeBonus;)V

    return-void
.end method

.method public onNextClicked()V
    .locals 5

    .line 281
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->saveFavorites()V

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->CPG:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    if-ne v0, v1, :cond_0

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->showPersonalStoresApps()V

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->finish()V

    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->showFindingRebates()V

    .line 289
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 290
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;

    new-instance v3, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-direct {v3, v4}, Lcom/ibotta/android/api/favorites/FavoriteRetailersFlushCall;-><init>(Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;)V

    invoke-direct {v2, p0, v3, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;Lcom/ibotta/api/ApiCall;J)V

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    :goto_0
    return-void
.end method

.method public onPersonalRetailerCardClicked(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 2

    .line 333
    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/model/PersonalStoresItem;->setSelected(Z)V

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->getRetailerSelections()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/view/model/PersonalStoresItem;->isSelected()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->allRows:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->setRows(Ljava/util/List;Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 317
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 318
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->routeUserToCorrectScreen()V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 311
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 312
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->routeUserToCorrectScreen()V

    return-void
.end method

.method public setNextButtonEnabled(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 273
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->enableNextButton()V

    goto :goto_0

    .line 275
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresView;->disableNextButton()V

    :goto_0
    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 108
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresState;->getPersonalStoreModeStr()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-void
.end method

.method public setPersonalStoreMode(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresPresenterImpl;->personalStoreMode:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    return-void
.end method
