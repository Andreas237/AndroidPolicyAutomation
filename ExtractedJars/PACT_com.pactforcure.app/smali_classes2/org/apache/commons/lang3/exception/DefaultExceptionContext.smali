.class public Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
.super Ljava/lang/Object;
.source "DefaultExceptionContext.java"

# interfaces
.implements Lorg/apache/commons/lang3/exception/ExceptionContext;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x132dd72L


# instance fields
.field private final contextValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
    .locals 2
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 53
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/lang3/tuple/ImmutablePair;

    invoke-direct {v1, p1, p2}, Lorg/apache/commons/lang3/tuple/ImmutablePair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    return-object p0
.end method

.method public bridge synthetic addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    move-result-object v0

    return-object v0
.end method

.method public getContextEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 111
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    return-object v0
.end method

.method public getContextLabels()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 100
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 101
    .local v1, "labels":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-object v3, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/commons/lang3/tuple/Pair;

    .line 102
    .local v2, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {v2}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 104
    .end local v2    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_0
    return-object v1
.end method

.method public getContextValues(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 75
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .local v2, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    iget-object v3, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 77
    .local v1, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {p1, v3}, Lorg/apache/commons/lang3/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 78
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    .end local v1    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_1
    return-object v2
.end method

.method public getFirstContextValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .param p1, "label"    # Ljava/lang/String;

    .prologue
    .line 88
    iget-object v2, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 89
    .local v1, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p1, v2}, Lorg/apache/commons/lang3/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 90
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 93
    .end local v1    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_0
    return-object v2

    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getFormattedExceptionMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p1, "baseMessage"    # Ljava/lang/String;

    .prologue
    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v7, 0x100

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 122
    .local v0, "buffer":Ljava/lang/StringBuilder;
    if-eqz p1, :cond_0

    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    :cond_0
    iget-object v7, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_4

    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_1

    .line 128
    const/16 v7, 0xa

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    :cond_1
    const-string v7, "Exception Context:\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    const/4 v2, 0x0

    .line 133
    .local v2, "i":I
    iget-object v7, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/tuple/Pair;

    .line 134
    .local v4, "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v7, "\t["

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    const/16 v7, 0x3a

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v4}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    const-string v7, "="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    invoke-virtual {v4}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 140
    .local v5, "value":Ljava/lang/Object;
    if-nez v5, :cond_2

    .line 141
    const-string v7, "null"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    :goto_1
    const-string v7, "]\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 145
    :cond_2
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 149
    .local v6, "valueStr":Ljava/lang/String;
    :goto_2
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 146
    .end local v6    # "valueStr":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 147
    .local v1, "e":Ljava/lang/Exception;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Exception thrown on toString(): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v1}, Lorg/apache/commons/lang3/exception/ExceptionUtils;->getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .restart local v6    # "valueStr":Ljava/lang/String;
    goto :goto_2

    .line 153
    .end local v1    # "e":Ljava/lang/Exception;
    .end local v4    # "pair":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v5    # "value":Ljava/lang/Object;
    .end local v6    # "valueStr":Ljava/lang/String;
    :cond_3
    const-string v7, "---------------------------------"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .end local v2    # "i":I
    .end local v3    # "i$":Ljava/util/Iterator;
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    return-object v7
.end method

.method public setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;
    .locals 3
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 61
    iget-object v2, p0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->contextValues:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;>;"
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 63
    .local v1, "p":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-virtual {v1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p1, v2}, Lorg/apache/commons/lang3/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 67
    .end local v1    # "p":Lorg/apache/commons/lang3/tuple/Pair;, "Lorg/apache/commons/lang3/tuple/Pair<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    .line 68
    return-object p0
.end method

.method public bridge synthetic setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    move-result-object v0

    return-object v0
.end method
