.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;Ljava/lang/String;)V
    .locals 0

    .line 912
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;)V
    .locals 5

    .line 915
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 916
    const/16 v0, 0x1a6

    iput v0, v2, Landroid/os/Message;->what:I

    .line 917
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getFileTagList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 918
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getFileTagList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 919
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;->getFileTagList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/FileTagListBean;->getTag()Ljava/lang/String;

    move-result-object v3

    .line 920
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 921
    const-string v0, "posterFilePath"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->a:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 922
    const-string v0, "posterFileTag"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 923
    invoke-virtual {v2, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 927
    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 931
    const-string v0, "Group_HealthGroupHeadImageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 932
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1a7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 933
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->e:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->b(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;I)V

    .line 935
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 912
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$4;->a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthGetUploadUrlBean;)V

    return-void
.end method
