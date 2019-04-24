.class Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;
.super Ljava/lang/Object;
.source "BrowserProxy.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/BrowserProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BrowserFooter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/BrowserProxy;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/BrowserProxy;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBackgroundColor()I
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getFooterBackgroundColor()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getTintColor()I
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getFooterTintColor()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setFooterBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setTintColor(I)V
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setFooterTintColor(I)V

    :cond_0
    return-void
.end method
