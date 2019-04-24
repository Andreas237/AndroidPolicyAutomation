.class public Lorg/apache/commons/cli/OptionGroup;
.super Ljava/lang/Object;
.source "OptionGroup.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private optionMap:Ljava/util/Map;

.field private required:Z

.field private selected:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->optionMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/OptionGroup;
    .locals 2

    .line 55
    iget-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->optionMap:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public getNames()Ljava/util/Collection;
    .locals 1

    .line 67
    iget-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->optionMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getOptions()Ljava/util/Collection;
    .locals 1

    .line 76
    iget-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->optionMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getSelected()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->selected:Ljava/lang/String;

    return-object v0
.end method

.method public isRequired()Z
    .locals 1

    .line 124
    iget-boolean v0, p0, Lorg/apache/commons/cli/OptionGroup;->required:Z

    return v0
.end method

.method public setRequired(Z)V
    .locals 0

    .line 114
    iput-boolean p1, p0, Lorg/apache/commons/cli/OptionGroup;->required:Z

    return-void
.end method

.method public setSelected(Lorg/apache/commons/cli/Option;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/AlreadySelectedException;
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lorg/apache/commons/cli/OptionGroup;->selected:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getOpt()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    new-instance v0, Lorg/apache/commons/cli/AlreadySelectedException;

    invoke-direct {v0, p0, p1}, Lorg/apache/commons/cli/AlreadySelectedException;-><init>(Lorg/apache/commons/cli/OptionGroup;Lorg/apache/commons/cli/Option;)V

    throw v0

    .line 93
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getOpt()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/cli/OptionGroup;->selected:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 134
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 136
    invoke-virtual {p0}, Lorg/apache/commons/cli/OptionGroup;->getOptions()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "["

    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 142
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/commons/cli/Option;

    .line 144
    invoke-virtual {v2}, Lorg/apache/commons/cli/Option;->getOpt()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v3, "-"

    .line 146
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 147
    invoke-virtual {v2}, Lorg/apache/commons/cli/Option;->getOpt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_1
    const-string v3, "--"

    .line 151
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 152
    invoke-virtual {v2}, Lorg/apache/commons/cli/Option;->getLongOpt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :goto_1
    const-string v3, " "

    .line 155
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 156
    invoke-virtual {v2}, Lorg/apache/commons/cli/Option;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 158
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ", "

    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_2
    const-string v1, "]"

    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
