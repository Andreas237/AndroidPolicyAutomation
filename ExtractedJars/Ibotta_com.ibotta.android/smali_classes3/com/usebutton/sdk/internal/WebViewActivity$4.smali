.class Lcom/usebutton/sdk/internal/WebViewActivity$4;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->setCustomActionView(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/view/View;)V
    .locals 0

    .line 363
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$4;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewActivity$4;->val$view:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 366
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$4;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$4;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->browserChromeClient:Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$4;->val$view:Landroid/view/View;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onCustomActionClick(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;Landroid/view/View;)V

    return-void
.end method
