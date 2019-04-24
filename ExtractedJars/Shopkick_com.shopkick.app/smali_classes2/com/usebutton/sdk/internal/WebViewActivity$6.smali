.class Lcom/usebutton/sdk/internal/WebViewActivity$6;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->onShowAllCard(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V
    .locals 0

    .line 521
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 524
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$102(Lcom/usebutton/sdk/internal/WebViewActivity;Z)Z

    .line 525
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object p1

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v1, :cond_0

    .line 526
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$600(Lcom/usebutton/sdk/internal/WebViewActivity;)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    .line 527
    invoke-static {v2}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$700(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    move-result-object v2

    .line 526
    invoke-virtual {p1, v1, v2, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V

    goto :goto_0

    .line 528
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object p1

    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_1

    .line 529
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->expandSheet()V

    goto :goto_0

    .line 531
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$6;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    :goto_0
    return-void
.end method
