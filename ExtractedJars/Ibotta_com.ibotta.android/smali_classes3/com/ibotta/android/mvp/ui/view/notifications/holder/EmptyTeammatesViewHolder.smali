.class public Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
.source "EmptyTeammatesViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/empty/EmptyView;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;-><init>(Landroid/view/View;)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    return-void
.end method

.method public static synthetic lambda$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;)V
    .locals 0

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->onActionButtonClicked()V

    return-void
.end method

.method private onActionButtonClicked()V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;->onInviteFriendsClicked()V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 3

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    .line 26
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 28
    invoke-virtual {p2}, Lcom/ibotta/android/views/empty/EmptyView;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f11048e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;->getInviteFriendsCta()Ljava/lang/String;

    move-result-object p1

    const v2, 0x7f0802a4

    invoke-direct {v0, v2, v1, p1}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {p2, v0}, Lcom/ibotta/android/views/empty/EmptyView;->updateViewState(Lcom/ibotta/android/views/empty/EmptyViewState;)V

    .line 30
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;->evEmpty:Lcom/ibotta/android/views/empty/EmptyView;

    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyTeammatesViewHolder$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/-$$Lambda$EmptyTeammatesViewHolder$lwp0Kgc-8IVJ-TRmmvEGHOQcSU4;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/empty/EmptyView;->bindViewEvents(Lcom/ibotta/android/views/empty/EmptyViewEvents;)V

    return-void
.end method
