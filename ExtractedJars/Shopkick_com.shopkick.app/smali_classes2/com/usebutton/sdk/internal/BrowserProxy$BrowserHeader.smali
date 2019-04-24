.class Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;
.super Ljava/lang/Object;
.source "BrowserProxy.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/BrowserProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BrowserHeader"
.end annotation


# instance fields
.field private subtitle:Lcom/usebutton/sdk/internal/BrowserText;

.field final synthetic this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

.field private title:Lcom/usebutton/sdk/internal/BrowserText;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/BrowserProxy;)V
    .locals 1

    .line 127
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    new-instance p1, Lcom/usebutton/sdk/internal/BrowserText;

    new-instance v0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$1;-><init>(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)V

    invoke-direct {p1, v0}, Lcom/usebutton/sdk/internal/BrowserText;-><init>(Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->title:Lcom/usebutton/sdk/internal/BrowserText;

    .line 149
    new-instance p1, Lcom/usebutton/sdk/internal/BrowserText;

    new-instance v0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;-><init>(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)V

    invoke-direct {p1, v0}, Lcom/usebutton/sdk/internal/BrowserText;-><init>(Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->subtitle:Lcom/usebutton/sdk/internal/BrowserText;

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)Lcom/usebutton/sdk/internal/BrowserText;
    .locals 0

    .line 127
    iget-object p0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->title:Lcom/usebutton/sdk/internal/BrowserText;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)Lcom/usebutton/sdk/internal/BrowserText;
    .locals 0

    .line 127
    iget-object p0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->subtitle:Lcom/usebutton/sdk/internal/BrowserText;

    return-object p0
.end method


# virtual methods
.method public getBackgroundColor()I
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getHeaderBackgroundColor()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getSubtitle()Lcom/usebutton/sdk/internal/BrowserText;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->subtitle:Lcom/usebutton/sdk/internal/BrowserText;

    return-object v0
.end method

.method public getTintColor()I
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getHeaderTintColor()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/BrowserText;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->title:Lcom/usebutton/sdk/internal/BrowserText;

    return-object v0
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setHeaderBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setCustomActionView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 189
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setCustomActionView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public setTintColor(I)V
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setHeaderTintColor(I)V

    :cond_0
    return-void
.end method
