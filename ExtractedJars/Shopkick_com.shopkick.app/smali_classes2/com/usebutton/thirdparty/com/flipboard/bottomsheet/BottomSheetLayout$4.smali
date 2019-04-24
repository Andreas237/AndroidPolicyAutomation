.class Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;
.super Ljava/lang/Object;
.source "BottomSheetLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

.field final synthetic val$expand:Z

.field final synthetic val$sheetView:Landroid/view/View;

.field final synthetic val$viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;


# direct methods
.method constructor <init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V
    .locals 0

    .line 720
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$sheetView:Landroid/view/View;

    iput-object p3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    iput-boolean p4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$expand:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 723
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->this$0:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$sheetView:Landroid/view/View;

    iget-object v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    iget-boolean v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;->val$expand:Z

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V

    return-void
.end method
