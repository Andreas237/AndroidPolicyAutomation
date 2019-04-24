.class final Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;->e(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic i:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 0

    .line 1269
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->b:Landroid/graphics/Bitmap;

    iput-object p6, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1269
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 1273
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1274
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    const-class v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1275
    const-string v0, "action_shareLink"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1276
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1278
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1280
    const-string v0, "description"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 1284
    :cond_0
    const-string v0, "description"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->e:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1286
    :goto_0
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->d:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1287
    const-string v0, "linkIconData"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->b:Landroid/graphics/Bitmap;

    const/16 v2, 0x1e

    invoke-static {v1, v2}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 1288
    const-string v0, "downloadUrl"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->i:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1290
    const-string v0, "needResult"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$4;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->startActivity(Landroid/content/Intent;)V

    .line 1292
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
