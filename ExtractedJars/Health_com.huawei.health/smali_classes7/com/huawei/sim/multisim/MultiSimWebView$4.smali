.class Lcom/huawei/sim/multisim/MultiSimWebView$4;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimWebView;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/multisim/MultiSimWebView;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimWebView;)V
    .locals 0

    .line 412
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimWebView$4;->e:Lcom/huawei/sim/multisim/MultiSimWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 415
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView$4;->e:Lcom/huawei/sim/multisim/MultiSimWebView;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimWebView;->b(Lcom/huawei/sim/multisim/MultiSimWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 417
    invoke-virtual {p1}, Landroid/webkit/WebView;->requestFocus()Z

    .line 418
    return-void
.end method
