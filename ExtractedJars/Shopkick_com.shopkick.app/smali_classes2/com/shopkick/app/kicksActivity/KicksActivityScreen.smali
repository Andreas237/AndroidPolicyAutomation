.class public Lcom/shopkick/app/kicksActivity/KicksActivityScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "KicksActivityScreen.java"

# interfaces
.implements Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;


# static fields
.field public static final ITEM_LAYOUT_VERSION_WITHOUT_TOP_HR:I = -0x28

.field public static final ITEM_LAYOUT_VERSION_WITH_TOP_HR:I = -0x14

.field private static final LOG_TAG:Ljava/lang/String; = "KicksActivityScreen"

.field private static final SupportedTileTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private firstFetchMade:Z

.field private fromNotificationScreen:Z

.field private mainView:Landroid/widget/LinearLayout;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

.field private recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xd

    .line 56
    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x20

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x25

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x36

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/16 v1, 0x37

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/16 v1, 0x3b

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/16 v1, 0x24

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/16 v1, 0x21

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/16 v1, 0x26

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v1, 0x27

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v1, 0x29

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/16 v1, 0x3ed

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/4 v1, -0x1

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const/4 v1, -0x2

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 56
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->SupportedTileTypes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 73
    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->fromNotificationScreen:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->startRequest()V

    return-void
.end method

.method private endRequest()V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setRefreshing(Z)V

    :cond_0
    return-void
.end method

.method private startRequest()V
    .locals 2

    .line 209
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setRefreshing(Z)V

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    .line 213
    iput-boolean v1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->firstFetchMade:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 216
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->endRequest()V

    .line 217
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 123
    iget-boolean p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->fromNotificationScreen:Z

    if-nez p2, :cond_0

    const p2, 0x7f11036f

    invoke-virtual {p0, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->setAppScreenTitle(I)V

    :cond_0
    const p2, 0x7f0c0101

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 125
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const p2, 0x7f090574

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setEnabled(Z)V

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    new-instance p3, Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;

    invoke-direct {p3, p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;-><init>(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)V

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/SKSwipeRefreshLayout;->setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const p3, 0x7f0903b2

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    .line 140
    new-instance p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    iget-object v1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-boolean p3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->fromNotificationScreen:Z

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 141
    invoke-virtual {p3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/screens/AppScreen;

    move-object v2, p3

    goto :goto_0

    :cond_1
    move-object v2, p0

    :goto_0
    iget-object v4, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    sget-object v5, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->SupportedTileTypes:Ljava/util/List;

    const/4 v6, 0x0

    move-object v0, p1

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeDefaultItemDecoration()V

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 148
    new-instance p1, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;

    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Lcom/shopkick/app/view/SKRecyclerView/SmoothScrollingLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 149
    invoke-virtual {p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 150
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->recyclerView:Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->pullToRefresh:Lcom/shopkick/app/widget/SKSwipeRefreshLayout;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->addModule(Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;)V

    .line 154
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const p2, 0x7f0903af

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const p3, 0x7f0903ac

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 156
    iget-object p3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const v0, 0x7f0903b0

    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    const v1, 0x7f0903ad

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 158
    iget-object v1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    if-eqz v1, :cond_2

    .line 159
    invoke-virtual {v1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v1

    .line 160
    iget-object v2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v2}, Lcom/shopkick/app/points/ProfilePoints;->getLifetimeCoins()I

    move-result v2

    .line 161
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 163
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v3, 0x7f0f000e

    .line 164
    invoke-virtual {p1, v3, v1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    .line 162
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 167
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 168
    invoke-virtual {p1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    .line 166
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    const-string p3, "0"

    .line 170
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p1, "0"

    .line 171
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 174
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->mainView:Landroid/widget/LinearLayout;

    return-object p1
.end method

.method public getPageRequest(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->useKicksActivityV2(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequestV2;-><init>()V

    .line 229
    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequestV2;

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequestV2;->previousPageKey:Ljava/lang/String;

    goto :goto_0

    .line 231
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequest;-><init>()V

    .line 232
    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequest;

    iput-object p1, v1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesRequest;->previousPageKey:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 87
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 88
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 89
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 90
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const/4 p1, 0x1

    .line 91
    iput-boolean p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->fromNotificationScreen:Z

    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 107
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 108
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->adapter:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    .line 183
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 189
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 190
    iget-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->firstFetchMade:Z

    if-nez v0, :cond_0

    .line 191
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->startRequest()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    .line 96
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onStart()V

    .line 97
    iget-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->fromNotificationScreen:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->firstFetchMade:Z

    if-nez v0, :cond_0

    .line 98
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->startRequest()V

    :cond_0
    return-void
.end method

.method public processResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
    .locals 5

    const/4 p1, 0x0

    .line 244
    :try_start_0
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesResponse;

    if-eqz v0, :cond_0

    .line 245
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesResponse;

    .line 248
    :cond_0
    new-instance v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;

    invoke-direct {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;-><init>()V

    .line 249
    iget-boolean p2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p2, :cond_5

    if-nez p1, :cond_1

    goto :goto_3

    .line 257
    :cond_1
    sget-object p2, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->SUCCESS:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    .line 258
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesResponse;->kicksActivities:Ljava/util/List;

    iput-object p2, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    .line 259
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetKicksActivitiesResponse;->pageKey:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->nextPageKey:Ljava/lang/String;

    .line 263
    iget-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->tiles:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move v1, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 264
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x24

    if-eq v3, v4, :cond_4

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x21

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    const/16 v1, -0x28

    .line 269
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    goto :goto_1

    :cond_3
    const/16 v1, -0x14

    .line 271
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->layoutVersion:Ljava/lang/Integer;

    :goto_1
    move v1, p2

    goto :goto_0

    :cond_4
    :goto_2
    const/4 v1, 0x1

    goto :goto_0

    .line 252
    :cond_5
    :goto_3
    sget-object p1, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;->FAIL_RELOAD:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

    iput-object p1, v0, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;->pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    :cond_6
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->endRequest()V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->endRequest()V

    throw p1
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 113
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getEscrowCoins()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCount(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
