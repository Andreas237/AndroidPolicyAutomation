.class public abstract Lcom/shopkick/app/view/PagingReloadAdapter;
.super Lcom/shopkick/app/view/PagingListAdapter;
.source "PagingReloadAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/shopkick/app/view/PagingListAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract handleReloadClick()V
.end method

.method public notifyMayHaveMorePages()V
    .locals 1

    .line 36
    invoke-super {p0}, Lcom/shopkick/app/view/PagingListAdapter;->notifyMayHaveMorePages()V

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->hideReloadFooter()V

    :cond_1
    return-void
.end method

.method public notifyPagingFailed()V
    .locals 1

    .line 24
    invoke-virtual {p0}, Lcom/shopkick/app/view/PagingReloadAdapter;->notifyNoMorePages()V

    .line 26
    iget-object v0, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->showReloadFooter()V

    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 15
    iget-object p1, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/view/SKListView;

    .line 16
    iget-object v0, p0, Lcom/shopkick/app/view/PagingReloadAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKListView;->hideReloadFooter()V

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/view/PagingReloadAdapter;->notifyMayHaveMorePages()V

    .line 20
    invoke-virtual {p0}, Lcom/shopkick/app/view/PagingReloadAdapter;->handleReloadClick()V

    return-void
.end method
