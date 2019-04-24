.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 273
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 274
    const-string v0, "action_unfollow_success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->finish()V

    .line 281
    :cond_0
    return-void
.end method
