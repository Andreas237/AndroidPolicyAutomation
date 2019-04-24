.class public Lcom/shopkick/app/invite/InvitePromoCodeScreen;
.super Lcom/shopkick/app/tabs/TabScreen;
.source "InvitePromoCodeScreen.java"


# static fields
.field private static final CLOSE_DISCOVERY_LESSON_DELAY:I = 0x1f4

.field public static final PROMO_CODE_CLIP_DATA_LABEL:Ljava/lang/String; = "promo_code"

.field public static final SHIMMER_LOADING_DURATION:I = 0x640


# instance fields
.field private invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

.field private invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/shopkick/app/tabs/TabScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->shareNatively(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;
    .locals 0

    .line 63
    iget-object p0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Landroid/view/ViewGroup;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startShimmerAnimation(Landroid/view/ViewGroup;)V

    return-void
.end method

.method private closeDiscoveryLesson()V
    .locals 5

    .line 337
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 338
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 339
    new-instance v2, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Landroid/os/Handler;)V

    const-wide/16 v3, 0x1f4

    .line 355
    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public static synthetic lambda$setupSeeAllOnClick$110(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Lcom/shopkick/app/widget/SKButton;Landroid/view/View;)V
    .locals 1

    .line 149
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 150
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object p1, p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendsList:Landroid/databinding/ObservableList;

    invoke-interface {p1}, Landroid/databinding/ObservableList;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 151
    const-class p1, Lcom/shopkick/app/activities/DetailsActivity;

    const-class p2, Lcom/shopkick/app/invite/InvitedFriendsScreen;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method private setupEventLog(Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;)V
    .locals 3

    .line 304
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->shareEmailButton:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x162

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 305
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->shareFbButton:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x163

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 306
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->shareNativeButton:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x164

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 307
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->shareSmsButton:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x161

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 310
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->promoCodeSectionCtaButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x143

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 313
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->bottomFixedCtaButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x165

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 316
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->promoCodeSectionShareIcon:Lcom/shopkick/app/logging/UserEventImageView;

    const/16 v1, 0x141

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 317
    iget-object v0, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->promoCodeSectionPromoCodeTextButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x142

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 320
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x14e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 321
    iget-object p1, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->invitedFriendSeeAllButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupEventLogForShareEventView(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 2

    .line 331
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 332
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupSeeAllOnClick()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    iget-object v0, v0, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->invitedFriendSeeAllButton:Lcom/shopkick/app/widget/SKButton;

    .line 148
    new-instance v1, Lcom/shopkick/app/invite/-$$Lambda$InvitePromoCodeScreen$yW-jMR1YFsCXxxn_oekHXARWbLs;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/invite/-$$Lambda$InvitePromoCodeScreen$yW-jMR1YFsCXxxn_oekHXARWbLs;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Lcom/shopkick/app/widget/SKButton;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    .line 92
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    invoke-static {v0, v1}, Lcom/shopkick/app/invite/ViewModelFactory;->getViewModelFactory(Landroid/app/Application;Lcom/shopkick/app/application/ScreenGlobals;)Lcom/shopkick/app/invite/ViewModelFactory;

    move-result-object v0

    .line 94
    invoke-static {p0, v0}, Landroid/arch/lifecycle/ViewModelProviders;->of(Landroid/support/v4/app/Fragment;Landroid/arch/lifecycle/ViewModelProvider$Factory;)Landroid/arch/lifecycle/ViewModelProvider;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iput-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    const/4 v0, 0x0

    .line 97
    invoke-static {p1, p2, v0}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->setViewmodel(Lcom/shopkick/app/invite/InvitePromoCodeViewModel;)V

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->loadData()V

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->getShareEvent()Lcom/shopkick/app/invite/SingleLiveEvent;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$1;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)V

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/invite/SingleLiveEvent;->observe(Landroid/arch/lifecycle/LifecycleOwner;Landroid/arch/lifecycle/Observer;)V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {p1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->getDataLoading()Landroid/arch/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance p2, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$2;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;)V

    invoke-virtual {p1, p0, p2}, Landroid/arch/lifecycle/MutableLiveData;->observe(Landroid/arch/lifecycle/LifecycleOwner;Landroid/arch/lifecycle/Observer;)V

    .line 122
    new-instance p1, Lcom/shopkick/app/invite/InvitedFriendsAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v2, 0x0

    invoke-direct {p1, p2, v0, v2, v1}, Lcom/shopkick/app/invite/InvitedFriendsAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    iget-object p2, p2, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->invitedFriendsSectionRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    iget-object p1, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->invitedFriendsSectionRecyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance p2, Lcom/shopkick/app/invite/InvitePromoCodeScreen$3;

    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, p0, v0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen$3;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    const p1, 0x7f0600c5

    .line 134
    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getResourceColor(I)I

    move-result p1

    .line 135
    new-instance p2, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;

    invoke-direct {p2, p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/ColorDividerItemDecoration;-><init>(ILjava/util/HashSet;)V

    .line 136
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    iget-object p1, p1, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->invitedFriendsSectionRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 139
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    invoke-direct {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupEventLog(Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;)V

    .line 141
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupSeeAllOnClick()V

    .line 143
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeScreenBinding:Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;

    invoke-virtual {p1}, Lcom/shopkick/app/databinding/InvitePromoCodeScreenBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method private shareNatively(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V
    .locals 6

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    .line 223
    invoke-virtual {v0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->getInvitePromoCodeInfoDisplayData()Landroid/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroid/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 232
    sget-object p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->NATIVE:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    .line 234
    :cond_1
    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeScreen$5;->$SwitchMap$com$shopkick$app$invite$InvitePromoCodeViewModel$ShareChannel:[I

    invoke-virtual {p1}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 273
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string v2, "clipboard"

    .line 276
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    const-string v3, "promo_code"

    .line 278
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->promoCode:Ljava/lang/String;

    invoke-static {v3, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 279
    invoke-virtual {v2, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    const v0, 0x7f110352

    .line 281
    invoke-virtual {p0, v0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 283
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    .line 284
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1

    .line 248
    :pswitch_1
    new-instance p1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, "text/plain"

    .line 249
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.TEXT"

    .line 250
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralSmsCopyText:Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 252
    invoke-virtual {v2, p1, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 254
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 255
    iget-object v4, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    const-string v5, "facebook"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v1, 0x1

    .line 257
    iget-object v2, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 258
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, v2, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v4, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "android.intent.category.LAUNCHER"

    .line 259
    invoke-virtual {p1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10200000

    .line 260
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 261
    invoke-virtual {p1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 262
    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startActivity(Landroid/content/Intent;)V

    :cond_3
    if-nez v1, :cond_5

    .line 266
    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->facebookInviteLink:Ljava/lang/String;

    if-eqz p1, :cond_5

    .line 267
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 268
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->facebookInviteLink:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 269
    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 242
    :pswitch_2
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    const-string v2, "mailto:"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "android.intent.extra.SUBJECT"

    .line 243
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralEmailSubjectText:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    .line 244
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralSmsCopyText:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "Chooser Title"

    .line 245
    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 236
    :pswitch_3
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "sms:"

    .line 237
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string/jumbo v1, "sms_body"

    .line 238
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralSmsCopyText:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 288
    :cond_4
    :goto_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    .line 289
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    .line 290
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralEmailSubjectText:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    .line 291
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->referralSmsCopyText:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string/jumbo v1, "text/plain"

    .line 292
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;->CTAButtonText:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->startActivity(Landroid/content/Intent;)V

    :cond_5
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private startShimmerAnimation(Landroid/view/ViewGroup;)V
    .locals 3

    const/4 v0, 0x0

    .line 206
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 207
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 208
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v2, v2, Lcom/facebook/shimmer/ShimmerFrameLayout;

    if-eqz v2, :cond_0

    .line 209
    check-cast v1, Lcom/facebook/shimmer/ShimmerFrameLayout;

    const/16 v2, 0x640

    .line 210
    invoke-virtual {v1, v2}, Lcom/facebook/shimmer/ShimmerFrameLayout;->setDuration(I)V

    .line 211
    invoke-virtual {v1}, Lcom/facebook/shimmer/ShimmerFrameLayout;->startShimmerAnimation()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const p3, 0x7f11035b

    .line 80
    invoke-virtual {p0, p3}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setAppScreenTitle(I)V

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public createTabScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->setupView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
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

    return-void
.end method

.method public initTabScreen(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
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

    return-void
.end method

.method public onRefreshSelected()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 166
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onResume()V

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object v0, v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object v0, v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareInitiated:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object v0, v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->loadData()V

    .line 176
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "paramBadgeContextName"

    const-string v2, "invite"

    .line 177
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "EventBadgeHide"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method protected onScreenDidShow()V
    .locals 4

    .line 184
    invoke-super {p0}, Lcom/shopkick/app/tabs/TabScreen;->onScreenDidShow()V

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v2, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 189
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 191
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->closeDiscoveryLesson()V

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 2

    .line 196
    invoke-super {p0, p1}, Lcom/shopkick/app/tabs/TabScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->invitePromoCodeViewModel:Lcom/shopkick/app/invite/InvitePromoCodeViewModel;

    iget-object v0, v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->params:Ljava/util/Map;

    const-string v1, "flow_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 199
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 200
    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
