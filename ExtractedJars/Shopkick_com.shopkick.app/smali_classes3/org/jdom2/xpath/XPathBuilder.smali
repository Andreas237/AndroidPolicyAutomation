.class public Lorg/jdom2/xpath/XPathBuilder;
.super Ljava/lang/Object;
.source "XPathBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final expression:Ljava/lang/String;

.field private final filter:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation
.end field

.field private namespaces:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/jdom2/Namespace;",
            ">;"
        }
    .end annotation
.end field

.field private variables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/jdom2/filter/Filter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;)V"
        }
    .end annotation

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 94
    iput-object p2, p0, Lorg/jdom2/xpath/XPathBuilder;->filter:Lorg/jdom2/filter/Filter;

    .line 95
    iput-object p1, p0, Lorg/jdom2/xpath/XPathBuilder;->expression:Ljava/lang/String;

    return-void

    .line 92
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null filter"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null expression"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compileWith(Lorg/jdom2/xpath/XPathFactory;)Lorg/jdom2/xpath/XPathExpression;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/xpath/XPathFactory;",
            ")",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation

    .line 293
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 294
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->expression:Ljava/lang/String;

    iget-object v1, p0, Lorg/jdom2/xpath/XPathBuilder;->filter:Lorg/jdom2/filter/Filter;

    iget-object v2, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    const/4 v3, 0x0

    new-array v3, v3, [Lorg/jdom2/Namespace;

    invoke-virtual {p1, v0, v1, v2, v3}, Lorg/jdom2/xpath/XPathFactory;->compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;

    move-result-object p1

    return-object p1

    .line 296
    :cond_0
    iget-object v1, p0, Lorg/jdom2/xpath/XPathBuilder;->expression:Ljava/lang/String;

    iget-object v2, p0, Lorg/jdom2/xpath/XPathBuilder;->filter:Lorg/jdom2/filter/Filter;

    iget-object v3, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v4, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v4

    new-array v4, v4, [Lorg/jdom2/Namespace;

    invoke-interface {v0, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/Namespace;

    invoke-virtual {p1, v1, v2, v3, v0}, Lorg/jdom2/xpath/XPathFactory;->compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;

    move-result-object p1

    return-object p1
.end method

.method public getExpression()Ljava/lang/String;
    .locals 1

    .line 279
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->expression:Ljava/lang/String;

    return-object v0
.end method

.method public getFilter()Lorg/jdom2/filter/Filter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation

    .line 270
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->filter:Lorg/jdom2/filter/Filter;

    return-object v0
.end method

.method public getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;
    .locals 1

    if-eqz p1, :cond_2

    const-string v0, ""

    .line 255
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    sget-object p1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    return-object p1

    .line 258
    :cond_0
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 261
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/jdom2/Namespace;

    return-object p1

    .line 253
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null prefix"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getVariable(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    if-eqz p1, :cond_1

    .line 237
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 240
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 235
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null qname"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNamespace(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 166
    invoke-static {p1, p2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/jdom2/xpath/XPathBuilder;->setNamespace(Lorg/jdom2/Namespace;)Z

    move-result p1

    return p1

    .line 164
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null URI"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 161
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null prefix"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNamespace(Lorg/jdom2/Namespace;)Z
    .locals 3

    if-eqz p1, :cond_4

    const-string v0, ""

    .line 183
    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 184
    sget-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    if-ne v0, p1, :cond_0

    return v1

    .line 185
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot set a Namespace URI in XPath for the \"\" prefix."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 192
    :cond_1
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    if-nez v0, :cond_2

    .line 193
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    .line 195
    :cond_2
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->namespaces:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1

    .line 181
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null Namespace"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNamespaces(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/jdom2/Namespace;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 212
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Namespace;

    .line 213
    invoke-virtual {p0, v1}, Lorg/jdom2/xpath/XPathBuilder;->setNamespace(Lorg/jdom2/Namespace;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    return v0

    .line 209
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null namespaces Collection"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setVariable(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_2

    .line 141
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    .line 144
    :cond_0
    iget-object v0, p0, Lorg/jdom2/xpath/XPathBuilder;->variables:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1

    .line 139
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null variable name"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
