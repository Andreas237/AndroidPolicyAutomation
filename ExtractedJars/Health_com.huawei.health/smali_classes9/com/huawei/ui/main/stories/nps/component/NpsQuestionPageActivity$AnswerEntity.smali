.class Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AnswerEntity"
.end annotation


# instance fields
.field answer:Ljava/lang/String;

.field questionId:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 304
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->questionId:I

    .line 305
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->answer:Ljava/lang/String;

    .line 308
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->questionId:I

    .line 309
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->answer:Ljava/lang/String;

    .line 310
    return-void
.end method


# virtual methods
.method public getAnswer()Ljava/lang/String;
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->answer:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionId()I
    .locals 1

    .line 313
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->questionId:I

    return v0
.end method

.method public setAnswer(Ljava/lang/String;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->answer:Ljava/lang/String;

    .line 326
    return-void
.end method

.method public setQuestionId(I)V
    .locals 0

    .line 317
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;->questionId:I

    .line 318
    return-void
.end method
