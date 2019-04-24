.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private questionnaireId:Ljava/lang/Integer;

.field private questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;>;"
        }
    .end annotation
.end field

.field private userId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public changeAnswerSheetDeviceInfo()V
    .locals 0

    .line 78
    return-void
.end method

.method public contrustAnswerSheetHeadImage()V
    .locals 0

    .line 74
    return-void
.end method

.method public dealWithAnswerSheetResetFactory()V
    .locals 0

    .line 62
    return-void
.end method

.method public downloadAnswerSheetNameUrl()V
    .locals 0

    .line 46
    return-void
.end method

.method public getAnswerSheetName()V
    .locals 0

    .line 38
    return-void
.end method

.method public getQuestionnaireId()Ljava/lang/Integer;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->questionnaireId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->questions:Ljava/util/List;

    return-object v0
.end method

.method public getUserId()Ljava/lang/Integer;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public judgeAnswerSheetWeightBySomeInfo()V
    .locals 0

    .line 50
    return-void
.end method

.method public queryAnswerSheetProcessData()V
    .locals 0

    .line 70
    return-void
.end method

.method public refreshAnswerSheetInitData()V
    .locals 0

    .line 66
    return-void
.end method

.method public requestAnswerSheetHeadUrl()V
    .locals 0

    .line 42
    return-void
.end method

.method public setAnswerSheetSwitchUpload()V
    .locals 0

    .line 54
    return-void
.end method

.method public setQuestionnaireId(Ljava/lang/Integer;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->questionnaireId:Ljava/lang/Integer;

    .line 25
    return-void
.end method

.method public setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->questions:Ljava/util/List;

    .line 33
    return-void
.end method

.method public setUserId(Ljava/lang/Integer;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateAnswerSheetRequest;->userId:Ljava/lang/Integer;

    .line 17
    return-void
.end method

.method public updataAnswerSheetLocalTable()V
    .locals 0

    .line 58
    return-void
.end method
