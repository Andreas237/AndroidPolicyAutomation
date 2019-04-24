.class Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;
.super Ljava/lang/Object;
.source "RecyclerScrollableViewWrapper.java"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


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

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;->this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;->this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-static {p1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->access$100(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V

    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 49
    iget-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper$2;->this$0:Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;

    invoke-static {p1}, Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;->access$100(Lcom/ibotta/android/tracking/scrolltracking/RecyclerScrollableViewWrapper;)V

    return-void
.end method
