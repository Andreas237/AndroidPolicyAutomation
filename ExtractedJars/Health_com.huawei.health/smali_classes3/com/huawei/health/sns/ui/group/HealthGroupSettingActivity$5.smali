.class Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aog;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g()V
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
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V
    .locals 6

    .line 379
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;->getResultCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 381
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 384
    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    .line 389
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 390
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p2, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p2

    .line 391
    const-string v0, "21083"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x354

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 394
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->e:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x355

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 397
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 376
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;->a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthResultBean;)V

    return-void
.end method
