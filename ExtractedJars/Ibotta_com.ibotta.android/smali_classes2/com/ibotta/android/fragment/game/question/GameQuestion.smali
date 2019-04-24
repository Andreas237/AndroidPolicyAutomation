.class public Lcom/ibotta/android/fragment/game/question/GameQuestion;
.super Ljava/lang/Object;
.source "GameQuestion.java"


# instance fields
.field private answer:I

.field private content:Ljava/lang/String;

.field private id:J

.field private mode:Lcom/ibotta/android/fragment/game/question/Mode;

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private weight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->options:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAnswer()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->answer:I

    return v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->id:J

    return-wide v0
.end method

.method public getMode()Lcom/ibotta/android/fragment/game/question/Mode;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->mode:Lcom/ibotta/android/fragment/game/question/Mode;

    return-object v0
.end method

.method public getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->options:Ljava/util/List;

    return-object v0
.end method

.method public getWeight()Ljava/lang/Integer;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public setAnswer(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->answer:I

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->content:Ljava/lang/String;

    return-void
.end method

.method public setId(J)V
    .locals 0

    .line 24
    iput-wide p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->id:J

    return-void
.end method

.method public setMode(Lcom/ibotta/android/fragment/game/question/Mode;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->mode:Lcom/ibotta/android/fragment/game/question/Mode;

    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->options:Ljava/util/List;

    return-void
.end method

.method public setWeight(Ljava/lang/Integer;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/fragment/game/question/GameQuestion;->weight:Ljava/lang/Integer;

    return-void
.end method
