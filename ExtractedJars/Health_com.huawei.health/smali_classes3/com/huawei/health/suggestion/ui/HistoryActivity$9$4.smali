.class Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->b(Lo/bvr;ILcom/huawei/health/suggestion/model/PlanRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bvr;

.field final synthetic b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

.field final synthetic e:Lcom/huawei/health/suggestion/model/PlanRecord;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity$9;Lcom/huawei/health/suggestion/model/PlanRecord;Lo/bvr;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->a:Lo/bvr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 217
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "retrain\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 220
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    const-string v0, "1120014"

    invoke-static {v0, v4}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v5

    .line 224
    if-nez v5, :cond_0

    .line 225
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-static {v1}, Lo/buc;->b(Lcom/huawei/health/suggestion/model/PlanRecord;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/RunPlanParams;)Lcom/huawei/health/suggestion/model/RunPlanParams;

    goto/16 :goto_0

    .line 226
    :cond_0
    const/4 v0, 0x3

    if-ne v5, v0, :cond_1

    .line 227
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 229
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    .line 230
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireExcludedDates()Ljava/util/TreeSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->setExcludedDate(Ljava/util/TreeSet;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWeekTimes()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->setTimes(I)V

    .line 232
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->setType(I)V

    .line 233
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireDifficulty()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->setDifficulty(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->a(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/helper/FitnessPlanParams;->setBeginDate(J)V

    .line 237
    :goto_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v6

    .line 238
    if-nez v6, :cond_2

    .line 239
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current has no plans"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->a:Lo/bvr;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d(Lcom/huawei/health/suggestion/ui/HistoryActivity;ILo/bvr;)V

    goto/16 :goto_1

    .line 242
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v7

    .line 243
    invoke-static {v7}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v0, v1, :cond_4

    .line 244
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current only exist fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    const/4 v0, 0x3

    if-ne v5, v0, :cond_3

    .line 246
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0, v6}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 247
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    goto/16 :goto_1

    .line 249
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->a:Lo/bvr;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d(Lcom/huawei/health/suggestion/ui/HistoryActivity;ILo/bvr;)V

    goto/16 :goto_1

    .line 252
    :cond_4
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current has run plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0, v6}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 254
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->d()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v8

    .line 255
    if-eqz v8, :cond_6

    .line 256
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current has run plan and fitness plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x3

    if-ne v5, v0, :cond_5

    .line 258
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0, v8}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->b(Lcom/huawei/health/suggestion/ui/HistoryActivity;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;

    .line 260
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_1

    .line 262
    :cond_6
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current only has run plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v0, 0x3

    if-ne v5, v0, :cond_7

    .line 264
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->e:Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->a:Lo/bvr;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->d(Lcom/huawei/health/suggestion/ui/HistoryActivity;ILo/bvr;)V

    goto :goto_1

    .line 266
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;->b:Lcom/huawei/health/suggestion/ui/HistoryActivity$9;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->c(Lcom/huawei/health/suggestion/ui/HistoryActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 272
    :goto_1
    return-void
.end method
