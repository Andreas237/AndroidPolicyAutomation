.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbs$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->c(Lo/ezk;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

.field final synthetic c:Lo/ezk;

.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;Lo/ezk;Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;)V
    .locals 0

    .line 958
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->c:Lo/ezk;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 961
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/util/Map;)V
    .locals 7

    .line 966
    if-nez p1, :cond_0

    .line 967
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/fbs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbs;->e(Ljava/util/Map;)V

    .line 968
    return-void

    .line 970
    :cond_0
    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 971
    if-nez v4, :cond_1

    .line 972
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/fbs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fbs;->e(Ljava/util/Map;)V

    .line 973
    return-void

    .line 975
    :cond_1
    const/4 v5, 0x0

    .line 977
    move-object v0, v4

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 980
    goto :goto_0

    .line 978
    :catch_0
    move-exception v6

    .line 979
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 982
    :goto_0
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 983
    :cond_2
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Step Goal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 984
    return-void

    .line 987
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v6, v0

    .line 989
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->c:Lo/ezk;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->a:Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;

    int-to-float v3, v6

    invoke-interface {v2, v3}, Lcom/huawei/ui/main/stories/fitness/base/BaseStepDetailActivity$a;->a(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$11;->d:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    .line 990
    invoke-virtual {v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 989
    invoke-virtual {v0, v1}, Lo/ezk;->b(Ljava/lang/String;)V

    .line 991
    return-void
.end method
