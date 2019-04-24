.class Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "NotificationsListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->initScrollListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 1

    .line 102
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    .line 104
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    .line 105
    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$000(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$100(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getItemCount()I

    move-result p2

    if-lez p2, :cond_0

    .line 106
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$200(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Landroid/support/v7/widget/LinearLayoutManager;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v7/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p2

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$100(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsAdapter;->getItemCount()I

    move-result v0

    sub-int/2addr v0, p1

    if-lt p2, v0, :cond_0

    .line 109
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$000(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;->access$300(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;->onLastItemDisplayed(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    :cond_0
    return-void
.end method
