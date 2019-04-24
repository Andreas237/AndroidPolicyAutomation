.class Lcom/usebutton/sdk/internal/WebViewActivity$1;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->onCreate(Landroid/os/Bundle;)V
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

    .line 151
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSheetReady(Z)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$300(Lcom/usebutton/sdk/internal/WebViewActivity;Z)V

    return-void
.end method

.method public onSheetStateChanged(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 5

    .line 154
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onStateChanged(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 155
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$000(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/views/ViewCoordinator;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->animateMargins(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 157
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_1

    .line 158
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$200(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    const-string v0, "btn:all-cards-viewed"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "interaction"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    .line 160
    invoke-static {v4}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$100(Lcom/usebutton/sdk/internal/WebViewActivity;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "tap"

    goto :goto_0

    :cond_0
    const-string v4, "swipe"

    :goto_0
    aput-object v4, v1, v2

    .line 158
    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    .line 161
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$1;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-static {p1, v3}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$102(Lcom/usebutton/sdk/internal/WebViewActivity;Z)Z

    :cond_1
    return-void
.end method
