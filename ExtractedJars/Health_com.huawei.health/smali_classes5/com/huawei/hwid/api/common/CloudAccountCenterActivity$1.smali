.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 106
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    .line 110
    return-void
.end method

.method public a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    return-void
.end method
