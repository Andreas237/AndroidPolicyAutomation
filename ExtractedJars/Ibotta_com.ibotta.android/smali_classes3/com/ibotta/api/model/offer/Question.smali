.class public Lcom/ibotta/api/model/offer/Question;
.super Ljava/lang/Object;
.source "Question.java"

# interfaces
.implements Lcom/ibotta/api/model/QuestionModel;


# instance fields
.field private amount:F

.field private answer:I

.field private content:Ljava/lang/String;

.field private id:I

.field private linkedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private multipleResponse:Z

.field private options:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/offer/Option;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private url:Ljava/lang/String;

.field private weight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Question;->options:Ljava/util/List;

    .line 28
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/Question;->linkedOfferIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/api/model/offer/Question;->amount:F

    return v0
.end method

.method public getAnswer()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/ibotta/api/model/offer/Question;->answer:I

    return v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Question;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/api/model/offer/Question;->id:I

    return v0
.end method

.method public getLinkedOfferIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Question;->linkedOfferIds:Ljava/util/Set;

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

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Question;->options:Ljava/util/List;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Question;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()Ljava/lang/Integer;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/offer/Question;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public isMultipleResponse()Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/Question;->multipleResponse:Z

    return v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/api/model/offer/Question;->amount:F

    return-void
.end method

.method public setAnswer(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/api/model/offer/Question;->answer:I

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Question;->content:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/ibotta/api/model/offer/Question;->id:I

    return-void
.end method

.method public setLinkedOfferIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 106
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Question;->linkedOfferIds:Ljava/util/Set;

    return-void
.end method

.method public setMultipleResponse(Z)V
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/Question;->multipleResponse:Z

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

    .line 98
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Question;->options:Ljava/util/List;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Question;->url:Ljava/lang/String;

    return-void
.end method

.method public setWeight(Ljava/lang/Integer;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/model/offer/Question;->weight:Ljava/lang/Integer;

    return-void
.end method
