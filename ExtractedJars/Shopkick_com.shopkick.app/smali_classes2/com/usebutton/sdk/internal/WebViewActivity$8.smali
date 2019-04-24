.class Lcom/usebutton/sdk/internal/WebViewActivity$8;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->onConfigureDismissAllCards(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

.field final synthetic val$dismiss:Landroid/widget/ImageButton;

.field final synthetic val$dismissAnim:Landroid/view/animation/Animation;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/widget/ImageButton;Landroid/view/animation/Animation;)V
    .locals 0

    .line 576
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->val$dismiss:Landroid/widget/ImageButton;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->val$dismissAnim:Landroid/view/animation/Animation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 579
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    .line 580
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->val$dismiss:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$8;->val$dismissAnim:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
