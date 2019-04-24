.class public Lcom/shopkick/app/feed/QuickKicksAdapter;
.super Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.source "QuickKicksAdapter.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final EVENT_ALL_PROGRAMMATIC_VIDEO_COMPLETED:Ljava/lang/String; = "EventAllVideoCompleted"

.field private static final MOVE_ITEM_ANIM_DELAY:I = 0x190

.field public static final PARAM_WIDGET_ID:Ljava/lang/String; = "ParamWidgetId"


# instance fields
.field private handler:Landroid/os/Handler;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private widgetId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/logging/IUserEventCoordinator;",
            ">;)V"
        }
    .end annotation

    .line 51
    invoke-direct/range {p0 .. p6}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$IFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;)V

    .line 57
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->handler:Landroid/os/Handler;

    .line 59
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$processVideoCompletion$76(Lcom/shopkick/app/feed/QuickKicksAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/Boolean;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 177
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 178
    iget-object p3, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p3, v0, p4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 179
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/QuickKicksAdapter;->notifyItemInserted(I)V

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, p2, 0x1

    .line 186
    :cond_0
    iget-object p3, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 187
    iget-object p3, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p3, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 188
    invoke-virtual {p0, v0, p2}, Lcom/shopkick/app/feed/QuickKicksAdapter;->notifyItemMoved(II)V

    .line 194
    iget-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->recyclerViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz p1, :cond_1

    .line 195
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    if-ne p2, v0, :cond_1

    .line 196
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz p2, :cond_1

    .line 201
    invoke-virtual {p2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 205
    invoke-virtual {p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->getDecoratedLeft(Landroid/view/View;)I

    move-result p4

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->getLeftDecorationWidth(Landroid/view/View;)I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getPaddingLeft()I

    move-result p1

    sub-int/2addr p4, p1

    .line 206
    invoke-virtual {p2, v0, p4}, Landroid/support/v7/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    :cond_1
    return-void
.end method


# virtual methods
.method public addTiles(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 66
    check-cast p1, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    return-void
.end method

.method public clear()V
    .locals 2

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 74
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 80
    invoke-super {p0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->destroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6bae06a8

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {p0, p2}, Lcom/shopkick/app/feed/QuickKicksAdapter;->processVideoCompletion(Ljava/util/HashMap;)V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->isAllProgramaticVideoTileCompleted(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 106
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "ParamWidgetId"

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->widgetId:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    iget-object p2, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EventAllVideoCompleted"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_3
    :goto_2
    return-void
.end method

.method public processVideoCompletion(Ljava/util/HashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "ParamVideoId"

    .line 119
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "ParamProgrammaticVideoDisabled"

    .line 120
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    const-string v2, "ParamProgrammaticVideoGenerateNewTile"

    .line 121
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/Boolean;

    const-string v2, "ParamProgrammaticVideoNextUrl"

    .line 122
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "ParamProgrammaticVideoNextRequestId"

    .line 123
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz v0, :cond_c

    if-eqz v1, :cond_c

    if-nez v7, :cond_1

    goto/16 :goto_5

    :cond_1
    const/high16 v3, -0x80000000

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v4

    move v4, v5

    .line 132
    :goto_0
    iget-object v8, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v9, 0x53

    if-ge v4, v8, :cond_4

    .line 133
    iget-object v6, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 134
    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v8, v9, :cond_2

    goto :goto_1

    .line 135
    :cond_2
    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    invoke-static {v8}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    move v3, v4

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    if-gez v3, :cond_5

    return-void

    .line 143
    :cond_5
    invoke-static {v6}, Lcom/shopkick/app/util/TileUtils;->shallowCopyTileInfoV2(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v8

    .line 146
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 147
    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 148
    iput-object v2, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoUrl:Ljava/lang/String;

    .line 150
    :cond_6
    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 151
    iput-object p1, v8, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoRequestId:Ljava/lang/String;

    .line 155
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    .line 157
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v6, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->programmaticVideoCompleted:Ljava/lang/Boolean;

    .line 158
    invoke-virtual {p0, v3}, Lcom/shopkick/app/feed/QuickKicksAdapter;->notifyItemChanged(I)V

    const/4 p1, -0x1

    :goto_3
    add-int/lit8 v0, p1, 0x1

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_8

    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 164
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v9, :cond_8

    move p1, v0

    goto :goto_3

    :cond_8
    if-gez p1, :cond_9

    move p1, v5

    .line 173
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;

    move-object v3, v1

    move-object v4, p0

    move-object v5, v6

    move v6, p1

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/feed/-$$Lambda$QuickKicksAdapter$X2q84QFoQCEaE-Kg6Gx3Qt62XOM;-><init>(Lcom/shopkick/app/feed/QuickKicksAdapter;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/Boolean;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4

    .line 212
    :cond_a
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v3, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 214
    invoke-virtual {p0, v3}, Lcom/shopkick/app/feed/QuickKicksAdapter;->notifyItemInserted(I)V

    :cond_b
    :goto_4
    return-void

    :cond_c
    :goto_5
    return-void
.end method

.method public setWidgetId(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->widgetId:Ljava/lang/String;

    return-void
.end method

.method public updateSurveyTile(Ljava/lang/String;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 88
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 89
    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 90
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    .line 91
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/feed/QuickKicksAdapter;->feedTiles:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->surveyTileStatus:Ljava/lang/Integer;

    .line 93
    invoke-virtual {p0, v0}, Lcom/shopkick/app/feed/QuickKicksAdapter;->notifyItemChanged(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
