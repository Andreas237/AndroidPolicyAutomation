.class public abstract Lcom/ibotta/api/model/content/TaskContent;
.super Ljava/lang/Object;
.source "TaskContent.java"

# interfaces
.implements Lcom/ibotta/api/model/TaskModel;


# instance fields
.field private answer:I

.field private content:Ljava/lang/String;

.field private finished:Z

.field private id:I

.field private legal:Ljava/lang/String;

.field private linkedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private options:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/OptionContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private questions:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
        contentAs = Lcom/ibotta/api/model/content/QuestionContent;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;"
        }
    .end annotation
.end field

.field private response:Ljava/lang/String;

.field private thumb:Ljava/lang/String;

.field private trackingClickUrl:Ljava/lang/String;

.field private trackingImpressionUrl:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->linkedOfferIds:Ljava/util/Set;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->options:Ljava/util/List;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->questions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAnswer()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/ibotta/api/model/content/TaskContent;->answer:I

    return v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/ibotta/api/model/content/TaskContent;->id:I

    return v0
.end method

.method public getLegal()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->legal:Ljava/lang/String;

    return-object v0
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

    .line 130
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->linkedOfferIds:Ljava/util/Set;

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

    .line 139
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->options:Ljava/util/List;

    return-object v0
.end method

.method public getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;"
        }
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->questions:Ljava/util/List;

    return-object v0
.end method

.method public getResponse()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->response:Ljava/lang/String;

    return-object v0
.end method

.method public getThumb()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->thumb:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingClickUrl()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->trackingClickUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTrackingImpressionUrl()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->trackingImpressionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/api/model/content/TaskContent;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/TaskModel$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/api/model/content/TaskContent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isFinished()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/TaskContent;->finished:Z

    return v0
.end method

.method public setAnswer(I)V
    .locals 0

    .line 57
    iput p1, p0, Lcom/ibotta/api/model/content/TaskContent;->answer:I

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->content:Ljava/lang/String;

    return-void
.end method

.method public setFinished(Z)V
    .locals 0

    .line 75
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/TaskContent;->finished:Z

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/ibotta/api/model/content/TaskContent;->id:I

    return-void
.end method

.method public setLegal(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->legal:Ljava/lang/String;

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

    .line 134
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->linkedOfferIds:Ljava/util/Set;

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

    .line 143
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->options:Ljava/util/List;

    return-void
.end method

.method public setQuestions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/QuestionModel;",
            ">;)V"
        }
    .end annotation

    .line 152
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->questions:Ljava/util/List;

    return-void
.end method

.method public setResponse(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->response:Ljava/lang/String;

    return-void
.end method

.method public setThumb(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->thumb:Ljava/lang/String;

    return-void
.end method

.method public setTrackingClickUrl(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->trackingClickUrl:Ljava/lang/String;

    return-void
.end method

.method public setTrackingImpressionUrl(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->trackingImpressionUrl:Ljava/lang/String;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->type:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/model/content/TaskContent;->url:Ljava/lang/String;

    return-void
.end method
