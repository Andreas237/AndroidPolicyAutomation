.class public Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;
.super Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSumFragment;-><init>()V

    return-void
.end method


# virtual methods
.method protected m()I
    .locals 1

    .line 21
    const/16 v0, 0x102

    return v0
.end method

.method public n()Z
    .locals 1

    .line 26
    const/4 v0, 0x0

    return v0
.end method

.method protected o()V
    .locals 1

    .line 11
    const-string v0, "Track_Run_Abnormal_Count_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->ab:Ljava/lang/String;

    .line 12
    const-string v0, "Track_Run_Step_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->U:Ljava/lang/String;

    .line 13
    const-string v0, "Track_Run_Distance_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->W:Ljava/lang/String;

    .line 14
    const-string v0, "Track_Run_Calorie_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->X:Ljava/lang/String;

    .line 15
    const-string v0, "Track_Run_Duration_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->T:Ljava/lang/String;

    .line 16
    const-string v0, "Track_Run_Count_Sum"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/RunSportDataSumFragment;->V:Ljava/lang/String;

    .line 17
    return-void
.end method
