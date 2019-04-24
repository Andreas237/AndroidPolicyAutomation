.class Lcom/huawei/ui/commonui/webview/WebViewActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/webview/WebViewActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/commonui/webview/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 288
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$3;->a:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$3;->a:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->e(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$3;->a:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->finish()V

    .line 293
    return-void
.end method
