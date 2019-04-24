.class final Lorg/jdom2/xpath/jaxen/JDOMNavigator;
.super Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;
.source "JDOMNavigator.java"

# interfaces
.implements Lorg/jaxen/NamespaceContext;


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final nsFromContext:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nsFromUser:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;-><init>()V

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromContext:Ljava/util/HashMap;

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromUser:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method includeNamespace(Lorg/jdom2/Namespace;)V
    .locals 2

    .line 98
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromUser:Ljava/util/HashMap;

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method reset()V
    .locals 1

    .line 77
    invoke-super {p0}, Lorg/jdom2/xpath/jaxen/JDOMCoreNavigator;->reset()V

    .line 78
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromContext:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method setContext(Ljava/lang/Object;)V
    .locals 3

    .line 82
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromContext:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 85
    instance-of v0, p1, Lorg/jdom2/NamespaceAware;

    if-eqz v0, :cond_0

    .line 86
    check-cast p1, Lorg/jdom2/NamespaceAware;

    invoke-interface {p1}, Lorg/jdom2/NamespaceAware;->getNamespacesInScope()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 87
    :cond_0
    instance-of v0, p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    if-eqz v0, :cond_1

    .line 88
    check-cast p1, Lorg/jdom2/xpath/jaxen/NamespaceContainer;

    invoke-virtual {p1}, Lorg/jdom2/xpath/jaxen/NamespaceContainer;->getParentElement()Lorg/jdom2/Element;

    move-result-object p1

    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespacesInScope()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Namespace;

    .line 92
    iget-object v1, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromContext:Ljava/util/HashMap;

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public translateNamespacePrefixToUri(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 106
    :cond_0
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromUser:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    .line 110
    :cond_1
    iget-object v0, p0, Lorg/jdom2/xpath/jaxen/JDOMNavigator;->nsFromContext:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
