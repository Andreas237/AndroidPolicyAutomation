.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 255
    const-string v0, "FitnessTopicActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete workout error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--errorcode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 257
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 252
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;->e(Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->l(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)V

    .line 262
    invoke-static {}, Lo/bvp;->a()Lo/bvp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8$3;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity$8;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessTopicActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvp;->c(Ljava/util/List;)V

    .line 263
    return-void
.end method
