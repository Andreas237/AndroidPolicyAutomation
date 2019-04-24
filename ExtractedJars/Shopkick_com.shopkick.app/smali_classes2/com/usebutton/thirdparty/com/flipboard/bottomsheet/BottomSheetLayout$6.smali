.class Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;
.super Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$CancelDetectionAnimationListener;
.source "BottomSheetLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

.field final synthetic val$sheetView:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)V
    .locals 0

    .line 830
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->val$sheetView:Landroid/view/View;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$CancelDetectionAnimationListener;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 833
    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->canceled:Z

    if-nez p1, :cond_1

    .line 834
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$402(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 835
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-static {p1, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$700(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 836
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$800(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;I)V

    .line 837
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->val$sheetView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 840
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$900(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;

    .line 841
    iget-object v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-interface {v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;->onDismissed(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V

    goto :goto_0

    .line 845
    :cond_0
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$1002(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    .line 846
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$1100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Ljava/lang/Runnable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 847
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$1100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 848
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$1102(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    :cond_1
    return-void
.end method
