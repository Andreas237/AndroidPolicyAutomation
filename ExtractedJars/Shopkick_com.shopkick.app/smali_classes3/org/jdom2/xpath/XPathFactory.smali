.class public abstract Lorg/jdom2/xpath/XPathFactory;
.super Ljava/lang/Object;
.source "XPathFactory.java"


# static fields
.field private static final DEFAULTFACTORY:Ljava/lang/String;

.field private static final EMPTYNS:[Lorg/jdom2/Namespace;

.field private static final defaultreference:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lorg/jdom2/xpath/XPathFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 95
    new-array v0, v0, [Lorg/jdom2/Namespace;

    sput-object v0, Lorg/jdom2/xpath/XPathFactory;->EMPTYNS:[Lorg/jdom2/Namespace;

    .line 100
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lorg/jdom2/xpath/XPathFactory;->defaultreference:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v0, "org.jdom2.xpath.XPathFactory"

    const/4 v1, 0x0

    .line 102
    invoke-static {v0, v1}, Lorg/jdom2/internal/SystemProperty;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/jdom2/xpath/XPathFactory;->DEFAULTFACTORY:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final instance()Lorg/jdom2/xpath/XPathFactory;
    .locals 3

    .line 119
    sget-object v0, Lorg/jdom2/xpath/XPathFactory;->defaultreference:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/xpath/XPathFactory;

    if-eqz v0, :cond_0

    return-object v0

    .line 123
    :cond_0
    sget-object v0, Lorg/jdom2/xpath/XPathFactory;->DEFAULTFACTORY:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lorg/jdom2/xpath/jaxen/JaxenXPathFactory;

    invoke-direct {v0}, Lorg/jdom2/xpath/jaxen/JaxenXPathFactory;-><init>()V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lorg/jdom2/xpath/XPathFactory;->newInstance(Ljava/lang/String;)Lorg/jdom2/xpath/XPathFactory;

    move-result-object v0

    .line 125
    :goto_0
    sget-object v1, Lorg/jdom2/xpath/XPathFactory;->defaultreference:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 130
    :cond_2
    sget-object v0, Lorg/jdom2/xpath/XPathFactory;->defaultreference:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/xpath/XPathFactory;

    return-object v0
.end method

.method public static final newInstance(Ljava/lang/String;)Lorg/jdom2/xpath/XPathFactory;
    .locals 1

    .line 147
    const-class v0, Lorg/jdom2/xpath/XPathFactory;

    invoke-static {p0, v0}, Lorg/jdom2/internal/ReflectionConstructor;->construct(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/jdom2/xpath/XPathFactory;

    return-object p0
.end method


# virtual methods
.method public compile(Ljava/lang/String;)Lorg/jdom2/xpath/XPathExpression;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/jdom2/xpath/XPathExpression<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 297
    invoke-static {}, Lorg/jdom2/filter/Filters;->fpassthrough()Lorg/jdom2/filter/Filter;

    move-result-object v0

    sget-object v1, Lorg/jdom2/xpath/XPathFactory;->EMPTYNS:[Lorg/jdom2/Namespace;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v2, v1}, Lorg/jdom2/xpath/XPathFactory;->compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;

    move-result-object p1

    return-object p1
.end method

.method public compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;)Lorg/jdom2/xpath/XPathExpression;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;)",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation

    .line 282
    sget-object v0, Lorg/jdom2/xpath/XPathFactory;->EMPTYNS:[Lorg/jdom2/Namespace;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v1, v0}, Lorg/jdom2/xpath/XPathFactory;->compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;

    move-result-object p1

    return-object p1
.end method

.method public compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;Ljava/util/Collection;)Lorg/jdom2/xpath/XPathExpression;
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
            ">;",
            "Ljava/util/Collection<",
            "Lorg/jdom2/Namespace;",
            ">;)",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation

    .line 261
    sget-object v0, Lorg/jdom2/xpath/XPathFactory;->EMPTYNS:[Lorg/jdom2/Namespace;

    invoke-interface {p4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/jdom2/xpath/XPathFactory;->compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;

    move-result-object p1

    return-object p1
.end method

.method public varargs abstract compile(Ljava/lang/String;Lorg/jdom2/filter/Filter;Ljava/util/Map;[Lorg/jdom2/Namespace;)Lorg/jdom2/xpath/XPathExpression;
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
.end method
