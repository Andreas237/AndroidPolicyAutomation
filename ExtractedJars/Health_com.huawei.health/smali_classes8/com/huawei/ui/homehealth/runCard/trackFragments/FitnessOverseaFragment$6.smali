.class Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 531
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Lcom/huawei/health/suggestion/model/Topic;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 536
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 537
    const-string v0, "intent_key_topicid"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Lcom/huawei/health/suggestion/model/Topic;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 539
    const-string v0, "intent_key_topicname"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Lcom/huawei/health/suggestion/model/Topic;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$6;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->startActivity(Landroid/content/Intent;)V

    .line 542
    :cond_0
    return-void
.end method
