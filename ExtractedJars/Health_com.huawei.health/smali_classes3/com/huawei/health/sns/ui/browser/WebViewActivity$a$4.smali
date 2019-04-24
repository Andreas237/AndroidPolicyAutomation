.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;)V
    .locals 0

    .line 662
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$4;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 666
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$4;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->invalidateOptionsMenu()V

    .line 667
    return-void
.end method
