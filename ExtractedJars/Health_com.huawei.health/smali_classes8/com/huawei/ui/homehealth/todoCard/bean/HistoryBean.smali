.class public Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private activityBtn:Ljava/lang/String;

.field private activityBtnLink:Ljava/lang/String;

.field private activityStatus:I

.field private activityTarget:I

.field private continuity:I

.field private histories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;>;"
        }
    .end annotation
.end field

.field private pageNo:I

.field private pageSize:I

.field private resultCode:I

.field private status:I

.field private targetDays:I

.field private targetDesc:Ljava/lang/String;

.field private targetValue:D

.field private totalCount:I

.field private unit:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityBtn()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityBtn:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityBtnLink()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityBtnLink:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityStatus()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityStatus:I

    return v0
.end method

.method public getActivityTarget()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityTarget:I

    return v0
.end method

.method public getContinuity()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->continuity:I

    return v0
.end method

.method public getHistories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;>;"
        }
    .end annotation

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->histories:Ljava/util/List;

    return-object v0
.end method

.method public getPageNo()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->pageNo:I

    return v0
.end method

.method public getPageSize()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->pageSize:I

    return v0
.end method

.method public getResultCode()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->resultCode:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->status:I

    return v0
.end method

.method public getTargetDays()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetDays:I

    return v0
.end method

.method public getTargetDesc()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getTargetValue()D
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetValue:D

    return-wide v0
.end method

.method public getTotalCount()I
    .locals 1

    .line 123
    iget v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->totalCount:I

    return v0
.end method

.method public getUnit()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public setActivityBtn(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityBtn:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setActivityBtnLink(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityBtnLink:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setActivityStatus(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityStatus:I

    .line 48
    return-void
.end method

.method public setActivityTarget(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->activityTarget:I

    .line 56
    return-void
.end method

.method public setContinuity(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->continuity:I

    .line 64
    return-void
.end method

.method public setHistories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/homehealth/todoCard/bean/HistoriesDetailsBean;>;)V"
        }
    .end annotation

    .line 143
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->histories:Ljava/util/List;

    .line 144
    return-void
.end method

.method public setPageNo(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->pageNo:I

    .line 72
    return-void
.end method

.method public setPageSize(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->pageSize:I

    .line 80
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->resultCode:I

    .line 88
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->status:I

    .line 96
    return-void
.end method

.method public setTargetDays(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetDays:I

    .line 104
    return-void
.end method

.method public setTargetDesc(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetDesc:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setTargetValue(D)V
    .locals 0

    .line 119
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->targetValue:D

    .line 120
    return-void
.end method

.method public setTotalCount(I)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->totalCount:I

    .line 128
    return-void
.end method

.method public setUnit(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->unit:Ljava/lang/String;

    .line 136
    return-void
.end method
