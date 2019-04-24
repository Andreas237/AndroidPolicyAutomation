.class public Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bChecked:Z

.field private btOrder:B

.field private fCalorie:F

.field private fDurtion:F

.field private iActionNum:I

.field private iDownloadPersons:I

.field private iUsedTimes:I

.field private iVersion:I

.field private liAction:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessAction;>;"
        }
    .end annotation
.end field

.field private strId:Ljava/lang/String;

.field private strName:Ljava/lang/String;

.field private strNote:Ljava/lang/String;

.field private strSuitPerson:Ljava/lang/String;

.field private strSumDescription:Ljava/lang/String;

.field private strSumPicture:Ljava/lang/String;

.field private strTopicDescription:Ljava/lang/String;

.field private strTopicPicture:Ljava/lang/String;

.field private strWeekTimes:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    return-void
.end method


# virtual methods
.method public getBtOrder()B
    .locals 1

    .line 93
    iget-byte v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->btOrder:B

    return v0
.end method

.method public getLiAction()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessAction;>;"
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->liAction:Ljava/util/List;

    return-object v0
.end method

.method public getStrId()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strId:Ljava/lang/String;

    return-object v0
.end method

.method public getStrName()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strName:Ljava/lang/String;

    return-object v0
.end method

.method public getStrNote()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strNote:Ljava/lang/String;

    return-object v0
.end method

.method public getStrSuitPerson()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSuitPerson:Ljava/lang/String;

    return-object v0
.end method

.method public getStrSumDescription()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSumDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getStrSumPicture()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSumPicture:Ljava/lang/String;

    return-object v0
.end method

.method public getStrTopicDescription()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strTopicDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getStrTopicPicture()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strTopicPicture:Ljava/lang/String;

    return-object v0
.end method

.method public getStrWeekTimes()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strWeekTimes:Ljava/lang/String;

    return-object v0
.end method

.method public getfCalorie()F
    .locals 1

    .line 157
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->fCalorie:F

    return v0
.end method

.method public getfDurtion()F
    .locals 1

    .line 149
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->fDurtion:F

    return v0
.end method

.method public getiActionNum()I
    .locals 1

    .line 165
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iActionNum:I

    return v0
.end method

.method public getiDownloadPersons()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iDownloadPersons:I

    return v0
.end method

.method public getiUsedTimes()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iUsedTimes:I

    return v0
.end method

.method public getiVersion()I
    .locals 1

    .line 101
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iVersion:I

    return v0
.end method

.method public isbChecked()Z
    .locals 1

    .line 189
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->bChecked:Z

    return v0
.end method

.method public setBtOrder(B)V
    .locals 0

    .line 97
    iput-byte p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->btOrder:B

    .line 98
    return-void
.end method

.method public setLiAction(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessAction;>;)V"
        }
    .end annotation

    .line 185
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->liAction:Ljava/util/List;

    .line 186
    return-void
.end method

.method public setStrId(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strId:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setStrName(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strName:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setStrNote(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strNote:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public setStrSuitPerson(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSuitPerson:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setStrSumDescription(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSumDescription:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setStrSumPicture(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strSumPicture:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setStrTopicDescription(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strTopicDescription:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setStrTopicPicture(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strTopicPicture:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setStrWeekTimes(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->strWeekTimes:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setbChecked(Z)V
    .locals 0

    .line 193
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->bChecked:Z

    .line 194
    return-void
.end method

.method public setfCalorie(F)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->fCalorie:F

    .line 162
    return-void
.end method

.method public setfDurtion(F)V
    .locals 0

    .line 153
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->fDurtion:F

    .line 154
    return-void
.end method

.method public setiActionNum(I)V
    .locals 0

    .line 169
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iActionNum:I

    .line 170
    return-void
.end method

.method public setiDownloadPersons(I)V
    .locals 0

    .line 145
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iDownloadPersons:I

    .line 146
    return-void
.end method

.method public setiUsedTimes(I)V
    .locals 0

    .line 177
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iUsedTimes:I

    .line 178
    return-void
.end method

.method public setiVersion(I)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->iVersion:I

    .line 106
    return-void
.end method
