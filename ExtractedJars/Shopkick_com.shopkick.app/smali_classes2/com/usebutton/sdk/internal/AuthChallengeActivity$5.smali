.class Lcom/usebutton/sdk/internal/AuthChallengeActivity$5;
.super Ljava/lang/Object;
.source "AuthChallengeActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/AuthChallengeActivity;->showWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/AuthChallengeActivity;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$5;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/usebutton/sdk/internal/AuthChallengeActivity$5;->this$0:Lcom/usebutton/sdk/internal/AuthChallengeActivity;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/AuthChallengeActivity;->webView:Lcom/usebutton/sdk/internal/views/OverlayWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/OverlayWebView;->setVisibility(I)V

    return-void
.end method
