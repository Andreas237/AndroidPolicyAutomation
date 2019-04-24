.class Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;
.super Ljava/lang/Object;
.source "SwipeRefreshListView.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;->setRefreshScroll(Landroid/support/v4/widget/SwipeRefreshLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;

.field final synthetic val$srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->val$srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->val$srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    if-nez p1, :cond_0

    return-void

    .line 50
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->val$srlSwipeRefresh:Landroid/support/v4/widget/SwipeRefreshLayout;

    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;

    invoke-virtual {p3}, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;->getFirstVisiblePosition()I

    move-result p3

    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;

    .line 52
    invoke-virtual {p3, p2}, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p3

    if-nez p3, :cond_1

    const/4 p2, 0x1

    .line 51
    :cond_1
    invoke-virtual {p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    return-void
.end method
