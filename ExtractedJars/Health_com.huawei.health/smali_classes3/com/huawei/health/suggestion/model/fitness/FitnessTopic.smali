.class public Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private iRecomandNumber:I

.field private iSequence:I

.field private iTotalNumber:I

.field private strName:Ljava/lang/String;

.field private tsCourseId:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method public addTsCourseId(Ljava/lang/String;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->tsCourseId:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 98
    return-void
.end method

.method public getCourseIdbyOrder(B)Ljava/lang/String;
    .locals 4

    .line 77
    const/4 v1, 0x0

    .line 78
    const/4 v2, 0x0

    .line 79
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->tsCourseId:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 81
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    if-ne v2, p1, :cond_0

    .line 85
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 86
    goto :goto_1

    .line 90
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 93
    :cond_1
    :goto_1
    return-object v1
.end method

.method public getStrName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->strName:Ljava/lang/String;

    return-object v0
.end method

.method public getTsCourseId()Ljava/util/TreeSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/TreeSet<Ljava/lang/String;>;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->tsCourseId:Ljava/util/TreeSet;

    return-object v0
.end method

.method public getiRecomandNumber()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iRecomandNumber:I

    return v0
.end method

.method public getiSequence()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iSequence:I

    return v0
.end method

.method public getiTotalNumber()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iTotalNumber:I

    return v0
.end method

.method public setStrName(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->strName:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setTsCourseId(Ljava/util/TreeSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 105
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->tsCourseId:Ljava/util/TreeSet;

    .line 106
    return-void
.end method

.method public setiRecomandNumber(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iRecomandNumber:I

    .line 56
    return-void
.end method

.method public setiSequence(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iSequence:I

    .line 72
    return-void
.end method

.method public setiTotalNumber(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessTopic;->iTotalNumber:I

    .line 64
    return-void
.end method
