.class Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;
.super Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;
.source "MyRetailersListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->initSpanSizeLookup(Landroid/support/v7/widget/GridLayoutManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

.field final synthetic val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;Landroid/support/v7/widget/GridLayoutManager;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-direct {p0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->access$000(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;)Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView$1;->val$layoutManager:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v2

    invoke-static {v0, p1, v1, v2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;->access$100(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersListView;ILcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I

    move-result p1

    return p1
.end method
