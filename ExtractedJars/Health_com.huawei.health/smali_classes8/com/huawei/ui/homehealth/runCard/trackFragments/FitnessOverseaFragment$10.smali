.class Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 477
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/health/suggestion/model/Topic;)Lcom/huawei/health/suggestion/model/Topic;

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 484
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessCourseTopicList() onfalure errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorinfo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 477
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e(Ljava/util/List;)V

    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 491
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 492
    :cond_0
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRunCourseTopic data null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/health/suggestion/model/Topic;)Lcom/huawei/health/suggestion/model/Topic;

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 499
    :cond_1
    return-void

    .line 501
    :cond_2
    const/4 v4, 0x1

    .line 502
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/Topic;

    .line 504
    const-string v0, "SF006"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Topic;->acquireSerialNum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0, v6}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/health/suggestion/model/Topic;)Lcom/huawei/health/suggestion/model/Topic;

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 510
    const/4 v4, 0x0

    .line 511
    goto :goto_1

    .line 514
    :cond_3
    goto :goto_0

    .line 516
    :cond_4
    :goto_1
    if-eqz v4, :cond_5

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$10;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 524
    :cond_5
    return-void
.end method
