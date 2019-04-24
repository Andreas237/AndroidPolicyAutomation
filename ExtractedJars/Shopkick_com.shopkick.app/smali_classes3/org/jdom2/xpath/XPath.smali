.class public abstract Lorg/jdom2/xpath/XPath;
.super Ljava/lang/Object;
.source "XPath.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/xpath/XPath$XPathString;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final DEFAULT_XPATH_CLASS:Ljava/lang/String; = "org.jdom2.xpath.jaxen.JDOMXPath"

.field public static final JDOM_OBJECT_MODEL_URI:Ljava/lang/String; = "http://jdom.org/jaxp/xpath/jdom"

.field private static final XPATH_CLASS_PROPERTY:Ljava/lang/String; = "org.jdom2.xpath.class"

.field private static constructor:Ljava/lang/reflect/Constructor; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lorg/jdom2/xpath/XPath;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0xc8L


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lorg/jdom2/xpath/XPath;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 126
    :try_start_0
    sget-object v0, Lorg/jdom2/xpath/XPath;->constructor:Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Lorg/jdom2/JDOMException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_1

    :try_start_1
    const-string v0, "org.jdom2.xpath.class"

    const-string v1, "org.jdom2.xpath.jaxen.JDOMXPath"

    .line 130
    invoke-static {v0, v1}, Lorg/jdom2/internal/SystemProperty;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/jdom2/JDOMException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v0, "org.jdom2.xpath.jaxen.JDOMXPath"

    .line 138
    :goto_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 139
    const-class v2, Lorg/jdom2/xpath/XPath;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 142
    invoke-static {v1}, Lorg/jdom2/xpath/XPath;->setXPathClass(Ljava/lang/Class;)V

    goto :goto_1

    .line 140
    :cond_0
    new-instance p0, Lorg/jdom2/JDOMException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to create a JDOMXPath from class \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 145
    :cond_1
    :goto_1
    sget-object v0, Lorg/jdom2/xpath/XPath;->constructor:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/jdom2/xpath/XPath;
    :try_end_2
    .catch Lorg/jdom2/JDOMException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 159
    new-instance v0, Lorg/jdom2/JDOMException;

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p0

    .line 154
    instance-of v0, p0, Lorg/jdom2/JDOMException;

    if-eqz v0, :cond_2

    check-cast p0, Lorg/jdom2/JDOMException;

    goto :goto_2

    :cond_2
    new-instance v0, Lorg/jdom2/JDOMException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p0, v0

    :goto_2
    throw p0

    :catch_3
    move-exception p0

    .line 148
    throw p0
.end method

.method public static selectNodes(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 353
    invoke-static {p1}, Lorg/jdom2/xpath/XPath;->newInstance(Ljava/lang/String;)Lorg/jdom2/xpath/XPath;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/jdom2/xpath/XPath;->selectNodes(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static selectSingleNode(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 384
    invoke-static {p1}, Lorg/jdom2/xpath/XPath;->newInstance(Ljava/lang/String;)Lorg/jdom2/xpath/XPath;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/jdom2/xpath/XPath;->selectSingleNode(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static setXPathClass(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/jdom2/xpath/XPath;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 181
    :try_start_0
    const-class v0, Lorg/jdom2/xpath/XPath;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 184
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    sput-object p0, Lorg/jdom2/xpath/XPath;->constructor:Ljava/lang/reflect/Constructor;

    return-void

    .line 187
    :cond_0
    new-instance v0, Lorg/jdom2/JDOMException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not a concrete JDOM XPath implementation"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lorg/jdom2/JDOMException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 196
    new-instance v0, Lorg/jdom2/JDOMException;

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    .line 192
    throw p0

    .line 177
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "aClass"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addNamespace(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 314
    invoke-static {p1, p2}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/jdom2/xpath/XPath;->addNamespace(Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public abstract addNamespace(Lorg/jdom2/Namespace;)V
.end method

.method public abstract getXPath()Ljava/lang/String;
.end method

.method public abstract numberValueOf(Ljava/lang/Object;)Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract selectNodes(Ljava/lang/Object;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract selectSingleNode(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method public abstract setVariable(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract valueOf(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation
.end method

.method protected final writeReplace()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 409
    new-instance v0, Lorg/jdom2/xpath/XPath$XPathString;

    invoke-virtual {p0}, Lorg/jdom2/xpath/XPath;->getXPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jdom2/xpath/XPath$XPathString;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
