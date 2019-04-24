.class Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->b(Ljava/util/Date;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Lo/egg;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->d:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 107
    if-nez p1, :cond_4

    .line 108
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->d:Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 112
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepAdviceFromLib ret = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strAdvice is Empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 116
    return-void

    .line 118
    :cond_0
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 119
    const-class v0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;

    invoke-virtual {v6, v5, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;

    .line 120
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 121
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 123
    return-void

    .line 125
    :cond_1
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data.toString() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_1()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_2()I

    move-result v0

    if-nez v0, :cond_3

    .line 127
    :cond_2
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all strAdvice content is Empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 129
    return-void

    .line 132
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 133
    const-string v0, "PressureMeasureAdviceMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPressureAdviceFromLib() ,adviceNum1 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_1()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",adviceNum2 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_2()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    goto :goto_0

    .line 136
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureMeasureAdviceMgr$4;->e:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 138
    :goto_0
    return-void
.end method
