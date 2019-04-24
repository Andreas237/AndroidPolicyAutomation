.class public Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private activityDate:Ljava/lang/String;

.field private actualValue:D

.field private completeFlag:I

.field private lessthan:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityDate()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->activityDate:Ljava/lang/String;

    return-object v0
.end method

.method public getActualValue()D
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->actualValue:D

    return-wide v0
.end method

.method public getCompleteFlag()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->completeFlag:I

    return v0
.end method

.method public getLessthan()D
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->lessthan:D

    return-wide v0
.end method

.method public setActivityDate(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->activityDate:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public setActualValue(D)V
    .locals 0

    .line 26
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->actualValue:D

    .line 27
    return-void
.end method

.method public setCompleteFlag(I)V
    .locals 0

    .line 34
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->completeFlag:I

    .line 35
    return-void
.end method

.method public setLessthan(D)V
    .locals 0

    .line 42
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;->lessthan:D

    .line 43
    return-void
.end method
