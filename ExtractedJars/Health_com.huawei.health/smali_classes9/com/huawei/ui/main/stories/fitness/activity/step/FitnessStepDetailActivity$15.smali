.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;
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
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 945
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 948
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/util/Map;)V
    .locals 4

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->s(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$15;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/clq;->d(IILo/clz;)V

    .line 955
    return-void
.end method
