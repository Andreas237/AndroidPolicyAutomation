.class Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(Ljava/util/Date;Ljava/util/Date;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Lo/egg;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->c:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 147
    if-nez p1, :cond_3

    .line 148
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->c:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    const/4 v1, 0x0

    invoke-static {v0, v1, v4}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->a(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 151
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepAdviceFromLib ret = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strAdvice is Empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->d:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 155
    return-void

    .line 157
    :cond_0
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 158
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    invoke-virtual {v6, v5, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    .line 159
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;->getAd_num_0()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;->getAd_num_1()I

    move-result v0

    if-nez v0, :cond_2

    .line 160
    :cond_1
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strAdvice is Empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->d:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 162
    return-void

    .line 164
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->d:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 165
    const-string v0, "SleepAdviceMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepAdviceFromLib() ,mTotalSleepAdvice = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->c:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->b(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",mDetailSleepAdvice = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->c:Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;->e(Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    goto :goto_0

    .line 168
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/interactors/SleepAdviceMgr$3;->d:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 170
    :goto_0
    return-void
.end method
