.class Lcom/usebutton/sdk/internal/WebViewActivity$7;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

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


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/widget/ImageButton;)V
    .locals 0

    .line 548
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$7;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewActivity$7;->val$dismiss:Landroid/widget/ImageButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 556
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$7;->val$dismiss:Landroid/widget/ImageButton;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 551
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$7;->val$dismiss:Landroid/widget/ImageButton;

    instance-of v0, p1, Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
