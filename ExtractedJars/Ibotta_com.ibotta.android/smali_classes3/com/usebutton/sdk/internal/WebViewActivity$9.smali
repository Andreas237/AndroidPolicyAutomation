.class Lcom/usebutton/sdk/internal/WebViewActivity$9;
.super Ljava/lang/Object;
.source "WebViewActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/WebViewActivity;->configureChrome()V
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

    .line 658
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$9;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 661
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$9;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->access$802(Lcom/usebutton/sdk/internal/WebViewActivity;Z)Z

    .line 662
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity$9;->this$0:Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->finish()V

    return-void
.end method
