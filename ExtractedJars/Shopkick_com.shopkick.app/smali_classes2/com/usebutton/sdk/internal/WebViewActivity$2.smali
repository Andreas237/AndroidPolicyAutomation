.class Lcom/usebutton/sdk/internal/WebViewActivity$2;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->setupNavBar()V
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

    .line 237
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$2;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 240
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$2;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity$2;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->browserChromeClient:Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onSubtitleClick(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V

    return-void
.end method
