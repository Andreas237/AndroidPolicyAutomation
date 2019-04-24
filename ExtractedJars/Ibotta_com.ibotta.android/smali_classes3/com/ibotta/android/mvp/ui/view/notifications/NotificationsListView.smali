.class public Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;
.super Landroid/support/v7/widget/RecyclerView;
.source "NotificationsListView.java"

# interfaces
.implements Lcom/ibotta/android/views/util/VisibilityListener;


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

.field private filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

.field private layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

.field private loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

.field private trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

.field private visible:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Landroid/support/v7/widget/LinearLayoutManager;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-object p0
.end method

.method private initAdapter()V
    .locals 1

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initDivider()V
    .locals 3

    .line 83
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 84
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 85
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 86
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 88
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initLayout()V
    .locals 0

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initLayoutManager()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initDivider()V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initAdapter()V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initScrollListener()V

    return-void
.end method

.method private initLayoutManager()V
    .locals 4

    .line 78
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->layoutManager:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    return-void
.end method

.method private initScrollListener()V
    .locals 2

    .line 99
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 115
    new-instance v0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    .line 117
    new-instance v1, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    invoke-direct {v1, v0, p0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;-><init>(Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;Landroid/view/View;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Notifications"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->visible:Z

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    return-void
.end method

.method private initScrollTracking()V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v1, :cond_0

    .line 124
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public hideLoading()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->notifyDataSetChanged()V

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    :cond_0
    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 1

    .line 150
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->visible:Z

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->trackingScrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v0, p1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 1

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;)V"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->setRows(Ljava/util/List;)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initScrollTracking()V

    return-void
.end method

.method public setVisibilityTrackingListener(Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->visibilityTrackingListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityTrackingListener;

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initScrollTracking()V

    return-void
.end method

.method public showLoading()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    if-nez v0, :cond_0

    .line 130
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->loadingRow:Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->notifyDataSetChanged()V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->adapter:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method
