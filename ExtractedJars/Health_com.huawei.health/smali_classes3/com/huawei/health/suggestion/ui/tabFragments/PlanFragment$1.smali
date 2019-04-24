.class Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;Landroid/os/Looper;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 455
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 456
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 458
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 459
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duration"

    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v2}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 460
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calorie"

    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-float v2, v2

    invoke-static {v2}, Lo/bzr;->d(F)F

    move-result v2

    invoke-static {v2}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 461
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->sug_fitness_actions:I

    const-string v1, "totalPlan"

    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "totalPlan"

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 462
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->d(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 464
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment$1;->d:Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;->k(Lcom/huawei/health/suggestion/ui/tabFragments/PlanFragment;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 465
    .line 469
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
