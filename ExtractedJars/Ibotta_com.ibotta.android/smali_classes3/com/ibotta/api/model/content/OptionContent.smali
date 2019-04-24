.class public Lcom/ibotta/api/model/content/OptionContent;
.super Ljava/lang/Object;
.source "OptionContent.java"

# interfaces
.implements Lcom/ibotta/api/model/OptionModel;


# instance fields
.field private clearOptions:Z

.field private content:Ljava/lang/String;

.field private id:I

.field private nextSurveyQuestion:Ljava/lang/Integer;

.field private url:Ljava/lang/String;

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/api/model/content/OptionContent;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/ibotta/api/model/content/OptionContent;->id:I

    return v0
.end method

.method public getNextSurveyQuestion()Ljava/lang/Integer;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/model/content/OptionContent;->nextSurveyQuestion:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/model/content/OptionContent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()F
    .locals 1

    .line 65
    iget v0, p0, Lcom/ibotta/api/model/content/OptionContent;->weight:F

    return v0
.end method

.method public isClearOptions()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/ibotta/api/model/content/OptionContent;->clearOptions:Z

    return v0
.end method

.method public setClearOptions(Z)V
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/ibotta/api/model/content/OptionContent;->clearOptions:Z

    return-void
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/api/model/content/OptionContent;->content:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/ibotta/api/model/content/OptionContent;->id:I

    return-void
.end method

.method public setNextSurveyQuestion(Ljava/lang/Integer;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/api/model/content/OptionContent;->nextSurveyQuestion:Ljava/lang/Integer;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/api/model/content/OptionContent;->url:Ljava/lang/String;

    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/ibotta/api/model/content/OptionContent;->weight:F

    return-void
.end method
