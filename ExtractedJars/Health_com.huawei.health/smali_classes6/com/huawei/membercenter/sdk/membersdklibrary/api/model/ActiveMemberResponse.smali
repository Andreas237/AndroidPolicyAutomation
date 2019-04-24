.class public Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private endDate:Ljava/lang/String;

.field private gradeId:I

.field private growthValue:I

.field private leaguerId:Ljava/lang/String;

.field private startDate:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->leaguerId:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->growthValue:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->gradeId:I

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->startDate:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->endDate:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public getEndDate()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->endDate:Ljava/lang/String;

    .line 71
    return-object v0
.end method

.method public getGradeId()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->gradeId:I

    .line 53
    return v0
.end method

.method public getGrowthValue()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->growthValue:I

    .line 44
    return v0
.end method

.method public getLeaguerId()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->leaguerId:Ljava/lang/String;

    .line 35
    return-object v0
.end method

.method public getStartDate()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->startDate:Ljava/lang/String;

    .line 62
    return-object v0
.end method

.method public setEndDate(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->endDate:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setGradeId(I)V
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->gradeId:I

    .line 58
    return-void
.end method

.method public setGrowthValue(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->growthValue:I

    .line 49
    return-void
.end method

.method public setLeaguerId(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->leaguerId:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setStartDate(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/ActiveMemberResponse;->startDate:Ljava/lang/String;

    .line 67
    return-void
.end method
