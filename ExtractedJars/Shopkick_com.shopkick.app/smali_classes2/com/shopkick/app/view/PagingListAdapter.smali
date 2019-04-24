.class public abstract Lcom/shopkick/app/view/PagingListAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "PagingListAdapter.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field page:I

.field pageRequestOffset:I

.field protected pagingListViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKListView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->page:I

    return-void
.end method


# virtual methods
.method public abstract getRowView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 34
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/view/PagingListAdapter;->getRowView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/view/PagingListAdapter;->getCount()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    iget v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->pageRequestOffset:I

    sub-int/2addr p3, v0

    if-lt p1, p3, :cond_0

    .line 37
    iget p1, p0, Lcom/shopkick/app/view/PagingListAdapter;->page:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/view/PagingListAdapter;->onNextPageRequested(I)V

    :cond_0
    return-object p2
.end method

.method public invalidateViews()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 81
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->invalidateViews()V

    :cond_1
    return-void
.end method

.method public nextPage()V
    .locals 1

    .line 25
    iget v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->page:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->page:I

    return-void
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 50
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->resetActiveViewMarking()V

    .line 52
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/adapter/SKAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public notifyMayHaveMorePages()V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->showLoadingFooter()V

    :cond_1
    return-void
.end method

.method public notifyNoMorePages()V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/shopkick/app/view/PagingListAdapter;->pagingListViewRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKListView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKListView;->hideLoadingFooter()V

    :cond_1
    return-void
.end method

.method public abstract onNextPageRequested(I)V
.end method

.method public setPageRequestOffset(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/shopkick/app/view/PagingListAdapter;->pageRequestOffset:I

    return-void
.end method
