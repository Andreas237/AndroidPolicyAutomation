.class public Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
.super Ljava/lang/Object;
.source "SimpleTimeFormat.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeFormat;


# instance fields
.field private futurePluralName:Ljava/lang/String;

.field private futurePrefix:Ljava/lang/String;

.field private futureSingularName:Ljava/lang/String;

.field private futureSuffix:Ljava/lang/String;

.field private pastPluralName:Ljava/lang/String;

.field private pastPrefix:Ljava/lang/String;

.field private pastSingularName:Ljava/lang/String;

.field private pastSuffix:Ljava/lang/String;

.field private pattern:Ljava/lang/String;

.field private pluralName:Ljava/lang/String;

.field private roundingTolerance:I

.field private singularName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 34
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->singularName:Ljava/lang/String;

    const-string v0, ""

    .line 35
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pluralName:Ljava/lang/String;

    const-string v0, ""

    .line 36
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSingularName:Ljava/lang/String;

    const-string v0, ""

    .line 37
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePluralName:Ljava/lang/String;

    const-string v0, ""

    .line 38
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSingularName:Ljava/lang/String;

    const-string v0, ""

    .line 39
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPluralName:Ljava/lang/String;

    const-string v0, ""

    .line 41
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pattern:Ljava/lang/String;

    const-string v0, ""

    .line 42
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePrefix:Ljava/lang/String;

    const-string v0, ""

    .line 43
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSuffix:Ljava/lang/String;

    const-string v0, ""

    .line 44
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPrefix:Ljava/lang/String;

    const-string v0, ""

    .line 45
    iput-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSuffix:Ljava/lang/String;

    const/16 v0, 0x32

    .line 46
    iput v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->roundingTolerance:I

    return-void
.end method

.method private applyPattern(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 2

    .line 93
    invoke-virtual {p0, p3, p4}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getPattern(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "%s"

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "%n"

    .line 94
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v0, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "%u"

    .line 95
    invoke-virtual {p1, p3, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private format(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;
    .locals 2

    .line 84
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getSign(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;

    move-result-object v0

    .line 85
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getGramaticallyCorrectName(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J

    move-result-wide p1

    .line 88
    invoke-direct {p0, v0, v1, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->applyPattern(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getPluralName(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 1

    .line 145
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInFuture()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePluralName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSingularName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 146
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePluralName:Ljava/lang/String;

    return-object p1

    .line 147
    :cond_0
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPluralName:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSingularName:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 148
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPluralName:Ljava/lang/String;

    return-object p1

    .line 150
    :cond_1
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pluralName:Ljava/lang/String;

    return-object p1
.end method

.method private getSign(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 4

    .line 126
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getQuantity()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const-string p1, "-"

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private getSingularName(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 1

    .line 135
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInFuture()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSingularName:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 136
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSingularName:Ljava/lang/String;

    return-object p1

    .line 137
    :cond_0
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSingularName:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 138
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSingularName:Ljava/lang/String;

    return-object p1

    .line 140
    :cond_1
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->singularName:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 66
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPrefix:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSuffix:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 70
    :cond_0
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePrefix:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSuffix:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\s+"

    const-string v0, " "

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public decorateUnrounded(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 79
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 51
    invoke-direct {p0, p1, v0}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->format(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatUnrounded(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->format(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getGramaticallyCorrectName(Lorg/ocpsoft/prettytime/Duration;Z)Ljava/lang/String;
    .locals 6

    .line 116
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getSingularName(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long p2, v1, v3

    if-lez p2, :cond_1

    .line 119
    :cond_0
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->getPluralName(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getPattern()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pattern:Ljava/lang/String;

    return-object v0
.end method

.method protected getPattern(J)Ljava/lang/String;
    .locals 0

    .line 101
    iget-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pattern:Ljava/lang/String;

    return-object p1
.end method

.method protected getQuantity(Lorg/ocpsoft/prettytime/Duration;Z)J
    .locals 0

    if-eqz p2, :cond_0

    .line 111
    iget p2, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->roundingTolerance:I

    invoke-interface {p1, p2}, Lorg/ocpsoft/prettytime/Duration;->getQuantityRounded(I)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getQuantity()J

    move-result-wide p1

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public setFuturePrefix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 164
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePrefix:Ljava/lang/String;

    return-object p0
.end method

.method public setFutureSuffix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 170
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSuffix:Ljava/lang/String;

    return-object p0
.end method

.method public setPastPrefix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 176
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPrefix:Ljava/lang/String;

    return-object p0
.end method

.method public setPastSuffix(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 182
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSuffix:Ljava/lang/String;

    return-object p0
.end method

.method public setPattern(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 158
    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pattern:Ljava/lang/String;

    return-object p0
.end method

.method public setPluralName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 206
    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pluralName:Ljava/lang/String;

    return-object p0
.end method

.method public setSingularName(Ljava/lang/String;)Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;
    .locals 0

    .line 200
    iput-object p1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->singularName:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SimpleTimeFormat [pattern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pattern:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futurePrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futurePrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", futureSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->futureSuffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastPrefix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pastSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->pastSuffix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", roundingTolerance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/ocpsoft/prettytime/format/SimpleTimeFormat;->roundingTolerance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
