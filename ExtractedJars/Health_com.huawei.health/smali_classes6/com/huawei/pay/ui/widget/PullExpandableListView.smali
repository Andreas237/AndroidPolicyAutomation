.class public Lcom/huawei/pay/ui/widget/PullExpandableListView;
.super Landroid/widget/ExpandableListView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;
    }
.end annotation


# instance fields
.field private bottom:Landroid/view/View;

.field private callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

.field private pg_bottom:Landroid/widget/ProgressBar;

.field private tv_LoadMore:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;)V

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->init(Landroid/content/Context;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->init(Landroid/content/Context;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 85
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 86
    invoke-direct {p0, p1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->init(Landroid/content/Context;)V

    .line 87
    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 4

    .line 94
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 95
    sget v0, Lcom/huawei/paycommonbase/R$layout;->mybill_list_footer:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    .line 96
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    sget v1, Lcom/huawei/paycommonbase/R$id;->listview_foot_more:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->tv_LoadMore:Landroid/widget/TextView;

    .line 97
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    sget v1, Lcom/huawei/paycommonbase/R$id;->listview_foot_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->pg_bottom:Landroid/widget/ProgressBar;

    .line 98
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->hideBottomText()V

    .line 99
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->hideBottomProgress()V

    .line 103
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 107
    invoke-virtual {p0, p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 111
    invoke-virtual {p0, p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 115
    invoke-virtual {p0, p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 116
    return-void
.end method


# virtual methods
.method public expandAllGroup()V
    .locals 4

    .line 205
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getExpandableListAdapter()Landroid/widget/ExpandableListAdapter;

    move-result-object v1

    .line 206
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 208
    invoke-interface {v1}, Landroid/widget/ExpandableListAdapter;->getGroupCount()I

    move-result v2

    .line 209
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 211
    invoke-virtual {p0, v3}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->expandGroup(I)Z

    .line 209
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 214
    :cond_0
    return-void
.end method

.method public getChildCounts()I
    .locals 5

    .line 221
    const/4 v1, 0x0

    .line 222
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getExpandableListAdapter()Landroid/widget/ExpandableListAdapter;

    move-result-object v2

    .line 223
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 225
    invoke-interface {v2}, Landroid/widget/ExpandableListAdapter;->getGroupCount()I

    move-result v3

    .line 226
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 228
    invoke-interface {v2, v4}, Landroid/widget/ExpandableListAdapter;->getChildrenCount(I)I

    move-result v0

    add-int/2addr v1, v0

    .line 226
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 231
    :cond_0
    return v1
.end method

.method public hideBottom()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 141
    return-void
.end method

.method public hideBottomProgress()V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->pg_bottom:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 198
    return-void
.end method

.method public hideBottomText()V
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->tv_LoadMore:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    return-void
.end method

.method public onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 2

    .line 284
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    invoke-interface {v0, p3, p4}, Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;->onChildItemClick(II)V

    .line 288
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 1

    .line 275
    const/4 v0, 0x1

    return v0
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 267
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .line 252
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 254
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getLastVisiblePosition()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getChildCounts()I

    move-result v0

    if-lez v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    invoke-interface {v0}, Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;->pullToLoadMore()V

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getFirstVisiblePosition()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;->onPositionChanaged(I)V

    .line 261
    :cond_1
    return-void
.end method

.method public reStorePosAfterRestart(I)V
    .locals 1

    .line 240
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getChildCounts()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getChildCounts()I

    move-result v0

    if-gt p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 242
    invoke-virtual {p0, p1}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->setSelection(I)V

    .line 244
    :cond_0
    return-void
.end method

.method public setBottomText(I)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->tv_LoadMore:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 149
    return-void
.end method

.method public setListener(Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->callBack:Lcom/huawei/pay/ui/widget/PullExpandableListView$OnListener;

    .line 125
    return-void
.end method

.method public showBottom()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->bottom:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 133
    return-void
.end method

.method public showBottomProgress()V
    .locals 2

    .line 188
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->showBottomText()V

    .line 189
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->pg_bottom:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 190
    return-void
.end method

.method public showBottomText()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/PullExpandableListView;->tv_LoadMore:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 157
    return-void
.end method

.method public showNetErrorTips()V
    .locals 3

    .line 164
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$string;->huaweipay_network_error:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;II)V

    .line 165
    return-void
.end method

.method public showloadMoreErrorTips()V
    .locals 3

    .line 172
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/PullExpandableListView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/paycommonbase/R$string;->hwpay_loadmore_error:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;II)V

    .line 173
    return-void
.end method
