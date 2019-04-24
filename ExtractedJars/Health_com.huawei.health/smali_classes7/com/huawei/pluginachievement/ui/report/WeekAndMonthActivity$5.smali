.class Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$5;->a:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 2

    .line 160
    const-string v0, "WeekAndMonthActivity"

    const-string v1, "fetchGoalInfo failure"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 149
    if-eqz p2, :cond_0

    .line 150
    move-object v3, p2

    check-cast v3, Ljava/util/List;

    .line 151
    const-string v0, "WeekAndMonthActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fetchGoalInfo_data_stepGoal "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$5;->a:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    const/4 v1, 0x0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;I)I

    .line 153
    goto :goto_0

    .line 154
    :cond_0
    const-string v0, "WeekAndMonthActivity"

    const-string v1, "fetchGoalInfo data is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    :goto_0
    return-void
.end method
