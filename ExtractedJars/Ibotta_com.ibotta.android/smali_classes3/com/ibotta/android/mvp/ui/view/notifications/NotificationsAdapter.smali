.class public Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "NotificationsAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private factory:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;

.field private listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

.field private rows:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 18
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItem(I)Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;->getType()I

    move-result p1

    return p1
.end method

.method public getRows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;I)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    invoke-virtual {p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->factory:Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->listener:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    goto :goto_0

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->rows:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->notifyDataSetChanged()V

    return-void
.end method
