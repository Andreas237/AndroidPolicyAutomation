.class public Lorg/jdom2/xpath/jaxen/JaxenXPathFactory;
.super Lorg/jdom2/xpath/XPathFactory;
.source "JaxenXPathFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Lorg/jdom2/xpath/XPathFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[",
            "Lorg/jdom2/Namespace;",
            ")",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation

    .line 82
    new-instance v0, Lorg/jdom2/xpath/jaxen/JaxenCompiled;

    invoke-direct {v0, p1, p2, p3, p4}, Lorg/jdom2/xpath/jaxen/JaxenCompiled;-><init>(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)V

    return-object v0
.end method
