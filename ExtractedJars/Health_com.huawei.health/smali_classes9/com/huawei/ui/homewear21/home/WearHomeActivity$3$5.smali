.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dgg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;)V
    .locals 0

    .line 1231
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;)V
    .locals 5

    .line 1234
    move-object v4, p1

    check-cast v4, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;

    .line 1235
    if-eqz v4, :cond_1

    .line 1236
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1237
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/enz;

    move-result-object v0

    const-string v1, "=="

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;

    iget-object v2, v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/enz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1238
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "releaseDeviceLinkage is success "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;->getResultDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1240
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "releaseDeviceLinkage is fail "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;->getResultDesc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1243
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "releaseDeviceLinkage is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1246
    :goto_0
    return-void
.end method
