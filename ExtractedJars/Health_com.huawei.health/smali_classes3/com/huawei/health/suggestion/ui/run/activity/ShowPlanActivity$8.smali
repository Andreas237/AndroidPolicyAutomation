.class Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 146
    const-string v0, "Suggestion_ShowPlanActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initPlanFinishedDialog onClick not remind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_0

    .line 149
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "runplanoverdue"

    .line 150
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    .line 149
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->a(Ljava/lang/String;Ljava/lang/String;I)I

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity$8;->b:Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;->c(Lcom/huawei/health/suggestion/ui/run/activity/ShowPlanActivity;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bya;->d(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x66

    if-ne v1, v0, :cond_1

    .line 152
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "fitnessplanoverdue"

    .line 153
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    .line 152
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->a(Ljava/lang/String;Ljava/lang/String;I)I

    .line 156
    :cond_1
    :goto_0
    return-void
.end method
