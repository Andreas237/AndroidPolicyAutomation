.class public Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;
.super Landroid/widget/LinearLayout;
.source "HorizScrollingModuleView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;,
        Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;
    }
.end annotation


# instance fields
.field protected bBottomButton:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007e
    .end annotation
.end field

.field private itemDecoration:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

.field private itemSpacing:I

.field private listener:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

.field protected rvRecycler:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903db
    .end annotation
.end field

.field protected tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044d
    .end annotation
.end field

.field protected titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private visibilityScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 73
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->initLayout(Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

    return-object p0
.end method

.method private applyAttributes(Landroid/util/AttributeSet;)V
    .locals 3

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/R$styleable;->HorizScrollingModule:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 172
    :try_start_0
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-lez v0, :cond_0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    .line 175
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private attachItemDecoration()V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemDecoration:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    if-eqz v0, :cond_0

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->removeItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 157
    :cond_0
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 158
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->color(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemSpacing:I

    .line 159
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->size(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;

    .line 160
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemDecoration:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemDecoration:Lcom/yqritc/recyclerviewflexibledivider/VerticalDividerItemDecoration;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout(Landroid/util/AttributeSet;)V
    .locals 3

    .line 116
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    const/4 v0, 0x1

    .line 117
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setOrientation(I)V

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemSpacing:I

    const v1, 0x7f0600fe

    .line 121
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->setBackgroundResource(I)V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0163

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 124
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->initRecycler()V

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->initScrollListener()V

    .line 128
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->applyAttributes(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private initRecycler()V
    .locals 3

    .line 132
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 138
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->attachItemDecoration()V

    return-void
.end method

.method private initScrollListener()V
    .locals 2

    .line 142
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 144
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->visibilityScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->visibilityScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method private initScrollTracking()V
    .locals 3

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->visibilityScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$Tracking;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$1;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    return-void
.end method


# virtual methods
.method public getLayoutState()Landroid/os/Parcelable;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method protected onBottomButtonClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007e
        }
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

    if-eqz v0, :cond_0

    .line 186
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;->onBottomButtonClicked()V

    :cond_0
    return-void
.end method

.method public restoreLayoutState(Landroid/os/Parcelable;)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->initScrollTracking()V

    return-void
.end method

.method public setBottomButtonLabel(Ljava/lang/String;)V
    .locals 2

    .line 99
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->bBottomButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->bBottomButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 103
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->bBottomButton:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setItemSpacing(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->itemSpacing:I

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->attachItemDecoration()V

    return-void
.end method

.method public setListViewPadding(IIII)V
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->listener:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView$HorizScrollingModuleListener;

    return-void
.end method

.method public setTitleBarListener(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    return-void
.end method

.method public setVisibilityScrollTrackingEnabled(Z)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->visibilityScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method public updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;->tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
