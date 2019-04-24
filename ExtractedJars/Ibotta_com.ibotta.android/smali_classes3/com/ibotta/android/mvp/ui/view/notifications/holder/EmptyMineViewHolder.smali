.class public Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
.source "EmptyMineViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/empty/EmptyView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    return-void
.end method

.method public static synthetic lambda$TKvEHL4D8An-E-ftrGfstPFPMms(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;)V
    .locals 0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->onActionButtonClicked()V

    return-void
.end method

.method private onActionButtonClicked()V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;->onFindRebatesClicked()V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 3

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance p2, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f11048c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    .line 30
    invoke-virtual {v1}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f110488

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0802a4

    invoke-direct {p2, v2, v0, v1}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    .line 31
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyMineViewHolder$TKvEHL4D8An-E-ftrGfstPFPMms;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyMineViewHolder$TKvEHL4D8An-E-ftrGfstPFPMms;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method
