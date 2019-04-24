.class Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "EarningsListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->initScrollListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 90
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 92
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->access$000(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 93
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;->access$100(Lcom/ibotta/android/mvp/ui/view/earnings/EarningsListView;)V

    :cond_0
    return-void
.end method
