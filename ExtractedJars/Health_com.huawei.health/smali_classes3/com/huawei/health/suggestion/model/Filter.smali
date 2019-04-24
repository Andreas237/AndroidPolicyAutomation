.class public Lcom/huawei/health/suggestion/model/Filter;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private classes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private levels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private trainingPoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method public getClasses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Filter;->classes:Ljava/util/List;

    return-object v0
.end method

.method public getLevels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Filter;->levels:Ljava/util/List;

    return-object v0
.end method

.method public getParts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Filter;->trainingPoints:Ljava/util/List;

    return-object v0
.end method

.method public setClasses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Filter;->classes:Ljava/util/List;

    .line 24
    return-void
.end method

.method public setLevels(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)V"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Filter;->levels:Ljava/util/List;

    .line 40
    return-void
.end method

.method public setParts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)V"
        }
    .end annotation

    .line 31
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Filter;->trainingPoints:Ljava/util/List;

    .line 32
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Filter{classes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Filter;->classes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trainingPoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Filter;->trainingPoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", levels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/Filter;->levels:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 54
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 58
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 62
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 66
    return-void
.end method
