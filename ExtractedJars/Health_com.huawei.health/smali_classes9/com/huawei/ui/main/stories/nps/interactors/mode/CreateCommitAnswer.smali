.class public Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private answer:Ljava/lang/String;

.field private questionId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAnswer()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionId()Ljava/lang/Integer;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->questionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->answer:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public setQuestionId(Ljava/lang/Integer;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->questionId:Ljava/lang/Integer;

    .line 14
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CreateCommitAnswer{questionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->questionId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", answer=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->answer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
