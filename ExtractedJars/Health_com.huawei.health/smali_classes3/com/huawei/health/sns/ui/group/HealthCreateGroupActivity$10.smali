.class Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/aog<Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 505
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 3

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->l(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->o(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/boa;->a(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->finish()V

    .line 513
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 7

    .line 517
    const/4 v4, 0x0

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->p(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 521
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 523
    :try_start_0
    const-class v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-static {p2, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    .line 524
    if-eqz v5, :cond_1

    .line 525
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->getResultCode()Ljava/lang/String;

    move-result-object v6

    .line 526
    const-string v0, "21083"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x527b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 529
    :cond_0
    const/4 v4, 0x1

    .line 531
    :goto_0
    goto :goto_1

    .line 532
    :cond_1
    const/4 v4, 0x1

    .line 537
    :goto_1
    goto :goto_2

    .line 534
    :catch_0
    move-exception v5

    .line 535
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addGroupInfo:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    const/4 v4, 0x1

    .line 537
    goto :goto_2

    .line 539
    :cond_2
    const/4 v4, 0x1

    .line 541
    :goto_2
    if-eqz v4, :cond_3

    .line 542
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->b:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->g(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x70

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 544
    :cond_3
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 505
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$10;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
