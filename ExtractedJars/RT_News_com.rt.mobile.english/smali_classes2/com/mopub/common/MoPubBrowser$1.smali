.class Lcom/mopub/common/MoPubBrowser$1;
.super Landroid/webkit/WebChromeClient;
.source "MoPubBrowser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/common/MoPubBrowser;->initializeWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/common/MoPubBrowser;


# direct methods
.method constructor <init>(Lcom/mopub/common/MoPubBrowser;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/mopub/common/MoPubBrowser$1;->this$0:Lcom/mopub/common/MoPubBrowser;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/mopub/common/MoPubBrowser$1;->this$0:Lcom/mopub/common/MoPubBrowser;

    const-string v1, "Loading..."

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubBrowser;->setTitle(Ljava/lang/CharSequence;)V

    .line 115
    iget-object v0, p0, Lcom/mopub/common/MoPubBrowser$1;->this$0:Lcom/mopub/common/MoPubBrowser;

    mul-int/lit8 v1, p2, 0x64

    invoke-virtual {v0, v1}, Lcom/mopub/common/MoPubBrowser;->setProgress(I)V

    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 117
    iget-object p2, p0, Lcom/mopub/common/MoPubBrowser$1;->this$0:Lcom/mopub/common/MoPubBrowser;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/mopub/common/MoPubBrowser;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
