.class Lcom/usebutton/sdk/internal/WebViewPresenter$1;
.super Ljava/lang/Object;
.source "WebViewPresenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageCommitVisible(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Ljava/lang/String;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 358
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->val$url:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->access$100(Lcom/usebutton/sdk/internal/WebViewPresenter;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->this$0:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/WebViewPresenter;->stateMachine:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;->val$url:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;->commit(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
