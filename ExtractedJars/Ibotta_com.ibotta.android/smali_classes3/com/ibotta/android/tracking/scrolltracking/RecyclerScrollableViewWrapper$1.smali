.class Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$1;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "RecyclerScrollableViewWrapper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;-><init>(Landroid/support/v7/widget/RecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$1;->this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 31
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$1;->this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-static {p1, p2}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->access$000(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;I)V

    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 37
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    return-void
.end method
