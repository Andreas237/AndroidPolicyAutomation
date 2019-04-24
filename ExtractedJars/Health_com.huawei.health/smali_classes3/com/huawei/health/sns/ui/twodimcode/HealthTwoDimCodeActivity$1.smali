.class Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

.field final synthetic e:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->e:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 349
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 10

    .line 323
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web/html/groupShare.html?healthgroup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->a:Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;->e:Landroid/graphics/Bitmap;

    move-object v6, v9

    new-instance v7, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;

    invoke-direct {v7, p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1$2;-><init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;)V

    const/4 v2, 0x2

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 345
    return-void
.end method
