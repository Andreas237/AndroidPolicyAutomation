.class Lorg/researchstack/backbone/ui/views/LocalWebView$1;
.super Landroid/webkit/WebViewClient;
.source "LocalWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/views/LocalWebView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/views/LocalWebView;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/views/LocalWebView;

    .prologue
    .line 52
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5, p2}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/Class;Ljava/lang/String;)V

    .line 59
    const-string v5, "file:///android_asset/"

    invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 61
    sget-char v5, Ljava/io/File;->separatorChar:C

    invoke-virtual {p2, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 62
    .local v3, "index":I
    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 64
    .local v1, "file":Ljava/lang/String;
    const-string v5, ".pdf"

    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 66
    new-instance v5, Ljava/lang/UnsupportedOperationException;

    const-string v6, "LocalWebView does not currently support viewing PDF files. Its suggested you generate HTML version of PDF for viewing"

    invoke-direct {v5, v6}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 70
    :cond_0
    const-string v5, ".mp4"

    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 72
    const/4 v5, 0x0

    const-string v6, "."

    invoke-virtual {v1, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 73
    .local v2, "fileName":Ljava/lang/String;
    invoke-static {}, Lorg/researchstack/backbone/ResourcePathManager;->getInstance()Lorg/researchstack/backbone/ResourcePathManager;

    move-result-object v5

    const/4 v6, 0x3

    .line 74
    invoke-virtual {v5, v6, v2}, Lorg/researchstack/backbone/ResourcePathManager;->generatePath(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    .local v0, "absVideoFilePath":Ljava/lang/String;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-virtual {v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v0}, Lorg/researchstack/backbone/ui/ViewVideoActivity;->newIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 76
    .local v4, "intent":Landroid/content/Intent;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-virtual {v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 92
    .end local v0    # "absVideoFilePath":Ljava/lang/String;
    .end local v1    # "file":Ljava/lang/String;
    .end local v2    # "fileName":Ljava/lang/String;
    .end local v3    # "index":I
    :goto_0
    const/4 v5, 0x1

    return v5

    .line 80
    .end local v4    # "intent":Landroid/content/Intent;
    .restart local v1    # "file":Ljava/lang/String;
    .restart local v3    # "index":I
    :cond_1
    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-virtual {v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getContext()Landroid/content/Context;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v6, p2}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 83
    .restart local v4    # "intent":Landroid/content/Intent;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-virtual {v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 88
    .end local v1    # "file":Ljava/lang/String;
    .end local v3    # "index":I
    .end local v4    # "intent":Landroid/content/Intent;
    :cond_2
    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 89
    .restart local v4    # "intent":Landroid/content/Intent;
    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;->this$0:Lorg/researchstack/backbone/ui/views/LocalWebView;

    invoke-virtual {v5}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
