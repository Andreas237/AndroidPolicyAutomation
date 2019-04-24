.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private answers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;>;"
        }
    .end annotation
.end field

.field private questionId:Ljava/lang/Integer;

.field private questionType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public changeQuestionAnswerDeviceInfo()V
    .locals 0

    .line 78
    return-void
.end method

.method public contrustQuestionAnswerHeadImage()V
    .locals 0

    .line 74
    return-void
.end method

.method public dealWithQuestionAnswerResetFactory()V
    .locals 0

    .line 62
    return-void
.end method

.method public downloadQuestionAnswerNameUrl()V
    .locals 0

    .line 46
    return-void
.end method

.method public getAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->answers:Ljava/util/List;

    return-object v0
.end method

.method public getQuestionAnswerName()V
    .locals 0

    .line 38
    return-void
.end method

.method public getQuestionId()Ljava/lang/Integer;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->questionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQuestionType()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->questionType:Ljava/lang/String;

    return-object v0
.end method

.method public judgeQuestionAnswerWeightBySomeInfo()V
    .locals 0

    .line 50
    return-void
.end method

.method public queryQuestionAnswerProcessData()V
    .locals 0

    .line 70
    return-void
.end method

.method public refreshQuestionAnswerInitData()V
    .locals 0

    .line 66
    return-void
.end method

.method public requestQuestionAnswerHeadUrl()V
    .locals 0

    .line 42
    return-void
.end method

.method public setAnswers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->answers:Ljava/util/List;

    .line 33
    return-void
.end method

.method public setQuestionAnswerSwitchUpload()V
    .locals 0

    .line 54
    return-void
.end method

.method public setQuestionId(Ljava/lang/Integer;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->questionId:Ljava/lang/Integer;

    .line 17
    return-void
.end method

.method public setQuestionType(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->questionType:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public updataQuestionAnswerLocalTable()V
    .locals 0

    .line 58
    return-void
.end method
