.class Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;
.super Ljava/lang/Object;
.source "QuickReturnRecyclerView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->setReturningView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 5

    .line 78
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$102(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I

    .line 79
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getPaddingTop()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-virtual {v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-static {v2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I

    move-result v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-virtual {v3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getPaddingTop()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    .line 81
    invoke-virtual {v3}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;

    invoke-virtual {v4}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getPaddingBottom()I

    move-result v4

    .line 80
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->setPadding(IIII)V

    :cond_0
    return-void
.end method
