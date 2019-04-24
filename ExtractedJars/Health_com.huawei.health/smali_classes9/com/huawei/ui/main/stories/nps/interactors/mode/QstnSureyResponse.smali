.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private id:Ljava/lang/Integer;

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;>;"
        }
    .end annotation
.end field

.field private pictureUrl:Ljava/lang/String;

.field private question:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public QSRData1()V
    .locals 0

    .line 63
    return-void
.end method

.method public QSRData2()V
    .locals 0

    .line 64
    return-void
.end method

.method public QSRData3()V
    .locals 0

    .line 65
    return-void
.end method

.method public QSRData4()V
    .locals 0

    .line 66
    return-void
.end method

.method public QSRData5()V
    .locals 0

    .line 67
    return-void
.end method

.method public QSRData6()V
    .locals 0

    .line 68
    return-void
.end method

.method public QSRData7()V
    .locals 0

    .line 69
    return-void
.end method

.method public QSRData8()V
    .locals 0

    .line 70
    return-void
.end method

.method public QSRData9()V
    .locals 0

    .line 71
    return-void
.end method

.method public getChoose()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->options:Ljava/util/List;

    return-object v0
.end method

.method public getId()Ljava/lang/Integer;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPictureUrl()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->pictureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestion()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->question:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionType()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public setChoose(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;>;)V"
        }
    .end annotation

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->options:Ljava/util/List;

    .line 54
    return-void
.end method

.method public setId(Ljava/lang/Integer;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->id:Ljava/lang/Integer;

    .line 38
    return-void
.end method

.method public setPictureUrl(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->pictureUrl:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setQuestion(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->question:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public setQuestionType(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->type:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->subTitle:Ljava/lang/String;

    .line 46
    return-void
.end method
