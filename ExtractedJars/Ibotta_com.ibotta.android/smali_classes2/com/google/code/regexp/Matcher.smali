.class public Lcom/google/code/regexp/Matcher;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/code/regexp/MatchResult;


# instance fields
.field private matcher:Ljava/util/regex/Matcher;

.field private parentPattern:Lcom/google/code/regexp/Pattern;


# direct methods
.method constructor <init>(Lcom/google/code/regexp/Pattern;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {p1}, Lcom/google/code/regexp/Pattern;->pattern()Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iput-object p1, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    return-void
.end method

.method constructor <init>(Lcom/google/code/regexp/Pattern;Ljava/util/regex/MatchResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    check-cast p2, Ljava/util/regex/Matcher;

    iput-object p2, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    return-void
.end method

.method private groupIndex(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v0, p1}, Lcom/google/code/regexp/Pattern;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method public appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;
    .locals 2

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1, p2}, Lcom/google/code/regexp/Pattern;->replaceProperties(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    return-object p0
.end method

.method public appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    return-object p1
.end method

.method public end()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    return v0
.end method

.method public end(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->end(I)I

    move-result p1

    return p1
.end method

.method public end(Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/code/regexp/Matcher;->groupIndex(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/code/regexp/Matcher;->end(I)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    instance-of v1, p1, Lcom/google/code/regexp/Matcher;

    if-nez v1, :cond_2

    return v0

    :cond_2
    check-cast p1, Lcom/google/code/regexp/Matcher;

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    iget-object v2, p1, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1, v2}, Lcom/google/code/regexp/Pattern;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    iget-object p1, p1, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public find()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    return v0
.end method

.method public find(I)Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    return p1
.end method

.method public group()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public group(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public group(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/code/regexp/Matcher;->groupIndex(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/code/regexp/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No group \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public groupCount()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    return v0
.end method

.method public hasAnchoringBounds()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->hasAnchoringBounds()Z

    move-result v0

    return v0
.end method

.method public hasTransparentBounds()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->hasTransparentBounds()Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v0}, Lcom/google/code/regexp/Pattern;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public hitEnd()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->hitEnd()Z

    move-result v0

    return v0
.end method

.method public lookingAt()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v0

    return v0
.end method

.method public matches()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method public namedGroups()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->find(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1}, Lcom/google/code/regexp/Pattern;->groupNames()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-direct {p0, v2}, Lcom/google/code/regexp/Matcher;->groupIndex(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public namedPattern()Lcom/google/code/regexp/Pattern;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    return-object v0
.end method

.method public orderedGroups()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/code/regexp/Matcher;->groupCount()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x1

    :goto_0
    if-gt v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lcom/google/code/regexp/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public region(II)Lcom/google/code/regexp/Matcher;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1, p2}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    return-object p0
.end method

.method public regionEnd()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->regionEnd()I

    move-result v0

    return v0
.end method

.method public regionStart()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->regionStart()I

    move-result v0

    return v0
.end method

.method public replaceAll(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v0, p1}, Lcom/google/code/regexp/Pattern;->replaceProperties(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public replaceFirst(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->replaceProperties(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public requireEnd()Z
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->requireEnd()Z

    move-result v0

    return v0
.end method

.method public reset()Lcom/google/code/regexp/Matcher;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->reset()Ljava/util/regex/Matcher;

    return-object p0
.end method

.method public reset(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    return-object p0
.end method

.method public standardPattern()Ljava/util/regex/Pattern;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method

.method public start()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    return v0
.end method

.method public start(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->start(I)I

    move-result p1

    return p1
.end method

.method public start(Ljava/lang/String;)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/code/regexp/Matcher;->groupIndex(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/code/regexp/Matcher;->start(I)I

    move-result p1

    return p1
.end method

.method public toMatchResult()Lcom/google/code/regexp/MatchResult;
    .locals 3

    new-instance v0, Lcom/google/code/regexp/Matcher;

    iget-object v1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    iget-object v2, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->toMatchResult()Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/code/regexp/Matcher;-><init>(Lcom/google/code/regexp/Pattern;Ljava/util/regex/MatchResult;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public useAnchoringBounds(Z)Lcom/google/code/regexp/Matcher;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->useAnchoringBounds(Z)Ljava/util/regex/Matcher;

    return-object p0
.end method

.method public usePattern(Lcom/google/code/regexp/Pattern;)Lcom/google/code/regexp/Matcher;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/code/regexp/Matcher;->parentPattern:Lcom/google/code/regexp/Pattern;

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Lcom/google/code/regexp/Pattern;->pattern()Ljava/util/regex/Pattern;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "newPattern cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public useTransparentBounds(Z)Lcom/google/code/regexp/Matcher;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Matcher;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->useTransparentBounds(Z)Ljava/util/regex/Matcher;

    return-object p0
.end method
