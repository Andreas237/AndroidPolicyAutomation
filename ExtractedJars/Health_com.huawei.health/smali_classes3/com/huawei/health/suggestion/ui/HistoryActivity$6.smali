.class Lcom/huawei/health/suggestion/ui/HistoryActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bvn$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/bvn$e<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bvr;ILcom/huawei/health/suggestion/model/PlanRecord;)V
    .locals 8

    .line 286
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-class v1, Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 287
    const-string v0, "planid"

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 288
    const-string v0, "plantype"

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;->e:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 291
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 292
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 294
    const-string v0, "plan_name"

    :try_start_0
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 295
    const-string v0, "plan_type"

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 296
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    const-string v0, "plan_workout_days"

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 300
    const-string v0, "plan_finish_rate"

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 302
    :cond_0
    const-string v0, "data"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    const-string v0, "1120007"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    goto :goto_0

    .line 304
    :catch_0
    move-exception v7

    .line 305
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    :goto_0
    return-void
.end method

.method public synthetic e(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 283
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$6;->d(Lo/bvr;ILcom/huawei/health/suggestion/model/PlanRecord;)V

    return-void
.end method
