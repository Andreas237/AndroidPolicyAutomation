.class public Lorg/apache/commons/cli/Options;
.super Ljava/lang/Object;
.source "Options.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private longOpts:Ljava/util/Map;

.field private optionGroups:Ljava/util/Map;

.field private requiredOpts:Ljava/util/List;

.field private shortOpts:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/Options;->longOpts:Ljava/util/Map;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/Options;->optionGroups:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public addOption(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lorg/apache/commons/cli/Options;
    .locals 1

    .line 131
    new-instance v0, Lorg/apache/commons/cli/Option;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/apache/commons/cli/Option;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lorg/apache/commons/cli/Options;->addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;

    return-object p0
.end method

.method public addOption(Ljava/lang/String;ZLjava/lang/String;)Lorg/apache/commons/cli/Options;
    .locals 1

    const/4 v0, 0x0

    .line 114
    invoke-virtual {p0, p1, v0, p2, p3}, Lorg/apache/commons/cli/Options;->addOption(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lorg/apache/commons/cli/Options;

    return-object p0
.end method

.method public addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;
    .locals 3

    .line 144
    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->hasLongOpt()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 149
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->longOpts:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getLongOpt()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_0
    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->isRequired()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 155
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 157
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 159
    :cond_1
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_2
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public addOptionGroup(Lorg/apache/commons/cli/OptionGroup;)Lorg/apache/commons/cli/Options;
    .locals 3

    .line 70
    invoke-virtual {p1}, Lorg/apache/commons/cli/OptionGroup;->getOptions()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 72
    invoke-virtual {p1}, Lorg/apache/commons/cli/OptionGroup;->isRequired()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 74
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/commons/cli/Option;

    const/4 v2, 0x0

    .line 84
    invoke-virtual {v1, v2}, Lorg/apache/commons/cli/Option;->setRequired(Z)V

    .line 85
    invoke-virtual {p0, v1}, Lorg/apache/commons/cli/Options;->addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;

    .line 87
    iget-object v2, p0, Lorg/apache/commons/cli/Options;->optionGroups:Ljava/util/Map;

    invoke-virtual {v1}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public getOption(Ljava/lang/String;)Lorg/apache/commons/cli/Option;
    .locals 1

    .line 206
    invoke-static {p1}, Lorg/apache/commons/cli/Util;->stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 208
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/commons/cli/Option;

    return-object p1

    .line 213
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->longOpts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/commons/cli/Option;

    return-object p1
.end method

.method public getOptionGroup(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/OptionGroup;
    .locals 1

    .line 239
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->optionGroups:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/commons/cli/OptionGroup;

    return-object p1
.end method

.method getOptionGroups()Ljava/util/Collection;
    .locals 2

    .line 100
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lorg/apache/commons/cli/Options;->optionGroups:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getOptions()Ljava/util/Collection;
    .locals 1

    .line 174
    invoke-virtual {p0}, Lorg/apache/commons/cli/Options;->helpOptions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getRequiredOptions()Ljava/util/List;
    .locals 1

    .line 194
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->requiredOpts:Ljava/util/List;

    return-object v0
.end method

.method public hasOption(Ljava/lang/String;)Z
    .locals 1

    .line 225
    invoke-static {p1}, Lorg/apache/commons/cli/Util;->stripLeadingHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 227
    iget-object v0, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/commons/cli/Options;->longOpts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method helpOptions()Ljava/util/List;
    .locals 2

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 249
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "[ Options: [ short "

    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 252
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->shortOpts:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " ] [ long "

    .line 253
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 254
    iget-object v1, p0, Lorg/apache/commons/cli/Options;->longOpts:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v1, " ]"

    .line 255
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 257
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
