.class final Lcom/huawei/operation/utils/WebViewUtils$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/utils/WebViewUtils;->gotoPkgAppDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$mContext:Landroid/content/Context;

.field final synthetic val$pageRouter:Ljava/lang/String;

.field final synthetic val$pkgName:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pageRouter:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$mContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pkgName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 314
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoPkgAppDialog  setPositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pageRouter:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 317
    const/4 v5, 0x0

    .line 318
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pkgName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    .line 319
    if-nez v5, :cond_0

    .line 320
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoPkgAppDialog  intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$mContext:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 324
    :goto_0
    goto :goto_1

    .line 326
    :cond_1
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 327
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pkgName:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$pageRouter:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    iget-object v0, p0, Lcom/huawei/operation/utils/WebViewUtils$2;->val$mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    goto :goto_1

    .line 329
    :catch_0
    move-exception v4

    .line 330
    const-string v0, "Opera_WebViewUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    :goto_1
    return-void
.end method
