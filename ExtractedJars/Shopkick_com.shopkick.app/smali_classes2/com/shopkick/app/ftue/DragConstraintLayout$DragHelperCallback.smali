.class public Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "DragConstraintLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/ftue/DragConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DragHelperCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/ftue/DragConstraintLayout;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$200(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p1

    .line 78
    iget-object p3, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p3}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$200(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p3

    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$300(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result v0

    add-int/2addr p3, v0

    add-int/lit8 p3, p3, 0x32

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->calculateMainLayoutInitialY()V

    .line 80
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public getViewVerticalDragRange(Landroid/view/View;)I
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$600(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onViewDragStateChanged(I)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$000(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {v0, p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$002(Lcom/shopkick/app/ftue/DragConstraintLayout;I)I

    return-void
.end method

.method public onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1, p3}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$102(Lcom/shopkick/app/ftue/DragConstraintLayout;I)I

    .line 50
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$200(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p1

    iget-object p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$300(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p2

    add-int/2addr p1, p2

    if-le p3, p1, :cond_0

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$500(Lcom/shopkick/app/ftue/DragConstraintLayout;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$502(Lcom/shopkick/app/ftue/DragConstraintLayout;Z)Z

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;->onClose()V

    :cond_0
    return-void
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$600(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p1

    int-to-float p1, p1

    .line 89
    iget-object p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$100(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p2

    int-to-float p2, p2

    cmpl-float p2, p2, p1

    if-nez p2, :cond_0

    return-void

    :cond_0
    float-to-double p2, p3

    const-wide/high16 v0, 0x4089000000000000L    # 800.0

    cmpl-double p2, p2, v0

    if-lez p2, :cond_2

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;->onClose()V

    :cond_1
    return-void

    .line 98
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$100(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x40000000    # 2.0f

    sub-float/2addr p1, p3

    cmpl-float p1, p2, p1

    if-lez p1, :cond_4

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;->onClose()V

    :cond_3
    return-void

    .line 105
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->calculateMainLayoutInitialY()V

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$200(Lcom/shopkick/app/ftue/DragConstraintLayout;)I

    move-result p1

    .line 108
    iget-object p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p2}, Lcom/shopkick/app/ftue/DragConstraintLayout;->access$700(Lcom/shopkick/app/ftue/DragConstraintLayout;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3, p1}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;->this$0:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    :cond_5
    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const p2, 0x7f09045f

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
