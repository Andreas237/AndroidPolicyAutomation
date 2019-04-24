.class Lorg/jdom2/xpath/jaxen/JaxenCompiled;
.super Lorg/jdom2/xpath/util/AbstractXPathCompiled;
.source "JaxenCompiled.java"

# interfaces
.implements Lorg/jaxen/NamespaceContext;
.implements Lorg/jaxen/VariableContext;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/jdom2/xpath/util/AbstractXPathCompiled<",
        "TT;>;",
        "Lorg/jaxen/NamespaceContext;",
        "Lorg/jaxen/VariableContext;"
    }
.end annotation


# instance fields
.field private final navigator:Lorg/jdom2/xpath/jaxen/JDOM2Navigator;

.field private final xPath:Lorg/jaxen/XPath;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[",
            "Lorg/jdom2/Namespace;",
            ")V"
        }
    .end annotation

    .line 148
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/jdom2/xpath/util/AbstractXPathCompiled;-><init>(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)V

    .line 138
    new-instance p2, Lorg/jdom2/xpath/jaxen/JDOM2Navigator;

    invoke-direct {p2}, Lorg/jdom2/xpath/jaxen/JDOM2Navigator;-><init>()V

    iput-object p2, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->navigator:Lorg/jdom2/xpath/jaxen/JDOM2Navigator;

    .line 150
    :try_start_0
    new-instance p2, Lorg/jaxen/BaseXPath;

    iget-object p3, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->navigator:Lorg/jdom2/xpath/jaxen/JDOM2Navigator;

    invoke-direct {p2, p1, p3}, Lorg/jaxen/BaseXPath;-><init>(Ljava/lang/String;Lorg/jaxen/Navigator;)V

    iput-object p2, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->xPath:Lorg/jaxen/XPath;
    :try_end_0
    .catch Lorg/jaxen/JaxenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    iget-object p1, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->xPath:Lorg/jaxen/XPath;

    invoke-interface {p1, p0}, Lorg/jaxen/XPath;->setNamespaceContext(Lorg/jaxen/NamespaceContext;)V

    .line 156
    iget-object p1, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->xPath:Lorg/jaxen/XPath;

    invoke-interface {p1, p0}, Lorg/jaxen/XPath;->setVariableContext(Lorg/jaxen/VariableContext;)V

    return-void

    :catch_0
    move-exception p2

    .line 152
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to compile \'"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. See Cause."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method private constructor <init>(Lorg/jdom2/xpath/jaxen/JaxenCompiled;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/xpath/jaxen/JaxenCompiled<",
            "TT;>;)V"
        }
    .end annotation

    .line 166
    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getExpression()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getFilter()Lorg/jdom2/filter/Filter;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getVariables()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getNamespaces()[Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;-><init>(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)V

    return-void
.end method

.method private static final unWrap(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->unWrapNS(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final unWrapNS(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 93
    instance-of v0, p0, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-eqz v0, :cond_0

    .line 94
    check-cast p0, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p0}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 80
    invoke-virtual {p0}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->clone()Lorg/jdom2/xpath/jaxen/JaxenCompiled;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lorg/jdom2/xpath/XPathExpression;
    .locals 1

    .line 80
    invoke-virtual {p0}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->clone()Lorg/jdom2/xpath/jaxen/JaxenCompiled;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/xpath/jaxen/JaxenCompiled;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/xpath/jaxen/JaxenCompiled<",
            "TT;>;"
        }
    .end annotation

    .line 221
    new-instance v0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;

    invoke-direct {v0, p0}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;-><init>(Lorg/jdom2/xpath/jaxen/JaxenCompiled;)V

    return-object v0
.end method

.method protected evaluateRawAll(Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .line 198
    :try_start_0
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->xPath:Lorg/jaxen/XPath;

    invoke-interface {v0, p1}, Lorg/jaxen/XPath;->selectNodes(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->unWrap(Ljava/util/List;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lorg/jaxen/JaxenException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 200
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to evaluate expression. See cause"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method protected evaluateRawFirst(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 208
    :try_start_0
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->xPath:Lorg/jaxen/XPath;

    invoke-interface {v0, p1}, Lorg/jaxen/XPath;->selectSingleNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->unWrapNS(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lorg/jaxen/JaxenException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 210
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to evaluate expression. See cause"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getVariableValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jaxen/UnresolvableException;
        }
    .end annotation

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    if-nez p2, :cond_1

    const-string p2, ""

    :cond_1
    :try_start_0
    const-string v0, ""

    .line 184
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 185
    invoke-virtual {p0, p2}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p2

    invoke-virtual {p2}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p1

    .line 187
    :cond_2
    invoke-static {p1}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p2

    invoke-virtual {p0, p3, p2}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getVariable(Ljava/lang/String;Lorg/jdom2/Namespace;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 189
    :catch_0
    new-instance p2, Lorg/jaxen/UnresolvableException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to resolve variable "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " in namespace \'"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' to a vaulue."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/jaxen/UnresolvableException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public translateNamespacePrefixToUri(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 171
    invoke-virtual {p0, p1}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;->getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
