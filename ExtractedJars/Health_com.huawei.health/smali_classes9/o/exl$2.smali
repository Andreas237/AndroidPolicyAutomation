.class Lo/exl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exl;->b(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/exl;


# direct methods
.method constructor <init>(Lo/exl;Lo/egg;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/exl$2;->c:Lo/exl;

    iput-object p2, p0, Lo/exl$2;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 7

    .line 128
    iget-object v0, p0, Lo/exl$2;->c:Lo/exl;

    invoke-static {v0}, Lo/exl;->d(Lo/exl;)I

    .line 129
    const/4 v4, -0x1

    .line 130
    move-object v5, p2

    .line 131
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestTodayCoreSleepFitnessDataList requestLastHeartRateDetail mRequsetNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$2;->c:Lo/exl;

    invoke-static {v3}, Lo/exl;->c(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 133
    const/4 v4, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    if-eqz v0, :cond_0

    .line 136
    move-object v6, p2

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    .line 139
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 140
    iget-object v0, p0, Lo/exl$2;->c:Lo/exl;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->getHeartRate()I

    move-result v1

    invoke-static {v0, v1}, Lo/exl;->b(Lo/exl;I)I

    .line 143
    :cond_1
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestTodayCoreSleepFitnessDataList requestLastHeartRateDetail resultCode 0 mHeartRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$2;->c:Lo/exl;

    invoke-static {v3}, Lo/exl;->b(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :cond_2
    iget-object v0, p0, Lo/exl$2;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/exl$2;->c:Lo/exl;

    invoke-static {v0}, Lo/exl;->c(Lo/exl;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_3

    .line 147
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestTodayFitnessDataList requestLastHeartRateDetail onResponse sucess mRequsetNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$2;->c:Lo/exl;

    invoke-static {v3}, Lo/exl;->c(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lo/exl$2;->b:Lo/egg;

    invoke-interface {v0, v4, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 150
    :cond_3
    return-void
.end method
