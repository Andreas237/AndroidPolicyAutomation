.class Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 808
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 818
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 813
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 0

    .line 848
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 823
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 4

    .line 827
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStatusChanged "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    const/4 v0, 0x3

    if-ne v0, p2, :cond_0

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;->sendEmptyMessage(I)Z

    .line 830
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z

    goto :goto_0

    .line 831
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->k(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 832
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 834
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->e()V

    .line 835
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 837
    :cond_1
    const/16 v0, 0xe

    if-ne v0, p2, :cond_2

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z

    goto :goto_0

    .line 839
    :cond_2
    const/16 v0, 0xd

    if-ne v0, p2, :cond_3

    .line 840
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;->e:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z

    .line 843
    :cond_3
    :goto_0
    return-void
.end method
