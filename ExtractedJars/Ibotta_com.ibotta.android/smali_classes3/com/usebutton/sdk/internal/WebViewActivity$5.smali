.class Lcom/usebutton/sdk/internal/WebViewActivity$5;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->onShowCta(Lcom/usebutton/sdk/purchasepath/CallToAction;)V
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

    .line 465
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$5;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 469
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$5;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result p1

    if-nez p1, :cond_0

    .line 470
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$5;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$200(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    const-string v0, "btn:cta-tapped"

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEvent(Ljava/lang/String;)V

    .line 473
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$5;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$5;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onCtaClicked(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    return-void
.end method
