.class Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;
.super Ljava/lang/Object;
.source "BrowserProxy.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/BrowserText$TextChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onColorChange(I)V
    .locals 1

    .line 160
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 161
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->access$200(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->setHeaderSubtitle(Lcom/usebutton/sdk/internal/BrowserText;)V

    :cond_0
    return-void
.end method

.method public onTextChange(Ljava/lang/String;)V
    .locals 1

    .line 153
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/BrowserProxy;->access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 154
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->this$0:Lcom/usebutton/sdk/internal/BrowserProxy;

    iget-object p1, p1, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/WebViewActivity;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader$2;->this$1:Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;->access$200(Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;)Lcom/usebutton/sdk/internal/BrowserText;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->setHeaderSubtitle(Lcom/usebutton/sdk/internal/BrowserText;)V

    :cond_0
    return-void
.end method
