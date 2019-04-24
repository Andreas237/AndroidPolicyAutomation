.class Lcom/shopkick/app/widget/ToolTipView$2;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/ToolTipView;->setupTooltipView(Landroid/view/ViewGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/ToolTipView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-static {p1}, Lcom/shopkick/app/widget/ToolTipView;->access$000(Lcom/shopkick/app/widget/ToolTipView;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-static {p1}, Lcom/shopkick/app/widget/ToolTipView;->access$100(Lcom/shopkick/app/widget/ToolTipView;)Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 99
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    .line 101
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    .line 100
    invoke-static {v2, v3, v4, v1}, Lcom/shopkick/app/widget/ToolTipView;->access$200(Lcom/shopkick/app/widget/ToolTipView;FFLandroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/ToolTipView;->dismiss()V

    return v0

    .line 107
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$2;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/ToolTipView;->useBlocker()Z

    move-result p1

    return p1

    :cond_2
    return v0
.end method
