.class Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;
.super Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$CancelDetectionAnimationListener;
.source "BottomSheetLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->expandSheet()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$CancelDetectionAnimationListener;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 604
    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;->canceled:Z

    if-nez p1, :cond_0

    .line 605
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->access$402(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/animation/Animator;)Landroid/animation/Animator;

    :cond_0
    return-void
.end method
