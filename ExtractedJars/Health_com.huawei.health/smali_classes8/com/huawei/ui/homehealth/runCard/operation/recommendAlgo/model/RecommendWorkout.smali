.class public Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mRestWeight:I

.field private mWeight:I

.field private mWorkoutId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p2, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWeight:I

    .line 16
    iput p2, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mRestWeight:I

    .line 18
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWorkoutId:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public acquireRestWeight()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mRestWeight:I

    return v0
.end method

.method public acquireWeight()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWeight:I

    return v0
.end method

.method public acquireWorkoutId()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWorkoutId:Ljava/lang/String;

    return-object v0
.end method

.method public resetWeight()V
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWeight:I

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mRestWeight:I

    .line 24
    return-void
.end method

.method public saveRestWeight(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mRestWeight:I

    .line 40
    return-void
.end method

.method public saveWeight(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWeight:I

    .line 32
    return-void
.end method

.method public saveWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->mWorkoutId:Ljava/lang/String;

    .line 48
    return-void
.end method
