.class Lcom/usebutton/sdk/internal/views/PopupWebView$2;
.super Ljava/lang/Object;
.source "PopupWebView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/PopupWebView;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/PopupWebView;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$2;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 97
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$2;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/PopupWebView;->access$000(Lcom/usebutton/sdk/internal/views/PopupWebView;)V

    .line 98
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$2;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/PopupWebView;->access$100(Lcom/usebutton/sdk/internal/views/PopupWebView;)Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 99
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView$2;->this$0:Lcom/usebutton/sdk/internal/views/PopupWebView;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/PopupWebView;->access$100(Lcom/usebutton/sdk/internal/views/PopupWebView;)Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;->onPopupClosed()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
