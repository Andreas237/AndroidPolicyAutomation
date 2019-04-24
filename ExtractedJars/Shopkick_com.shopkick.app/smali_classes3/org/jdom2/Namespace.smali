.class public final Lorg/jdom2/Namespace;
.super Ljava/lang/Object;
.source "Namespace.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/Namespace$NamespaceSerializationProxy;
    }
.end annotation


# static fields
.field public static final NO_NAMESPACE:Lorg/jdom2/Namespace;

.field private static final XMLNS_NAMESPACE:Lorg/jdom2/Namespace;

.field public static final XML_NAMESPACE:Lorg/jdom2/Namespace;

.field private static final namespacemap:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lorg/jdom2/Namespace;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final transient prefix:Ljava/lang/String;

.field private final transient uri:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 90
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x200

    const/high16 v2, 0x3f400000    # 0.75f

    const/16 v3, 0x40

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    sput-object v0, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    .line 94
    new-instance v0, Lorg/jdom2/Namespace;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lorg/jdom2/Namespace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    .line 98
    new-instance v0, Lorg/jdom2/Namespace;

    const-string v1, "xml"

    const-string v2, "http://www.w3.org/XML/1998/namespace"

    invoke-direct {v0, v1, v2}, Lorg/jdom2/Namespace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    .line 101
    new-instance v0, Lorg/jdom2/Namespace;

    const-string v1, "xmlns"

    const-string v2, "http://www.w3.org/2000/xmlns/"

    invoke-direct {v0, v1, v2}, Lorg/jdom2/Namespace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lorg/jdom2/Namespace;->XMLNS_NAMESPACE:Lorg/jdom2/Namespace;

    .line 107
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 109
    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v1, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    sget-object v2, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 114
    sget-object v1, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    sget-object v1, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    sget-object v2, Lorg/jdom2/Namespace;->XML_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 119
    sget-object v1, Lorg/jdom2/Namespace;->XMLNS_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/jdom2/Namespace;->XMLNS_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    sget-object v1, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    sget-object v2, Lorg/jdom2/Namespace;->XMLNS_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v2}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 280
    iput-object p1, p0, Lorg/jdom2/Namespace;->prefix:Ljava/lang/String;

    .line 281
    iput-object p2, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    return-void
.end method

.method public static getNamespace(Ljava/lang/String;)Lorg/jdom2/Namespace;
    .locals 1

    const-string v0, ""

    .line 268
    invoke-static {v0, p0}, Lorg/jdom2/Namespace;->getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;

    move-result-object p0

    return-object p0
.end method

.method public static getNamespace(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/Namespace;
    .locals 2

    if-nez p1, :cond_2

    if-eqz p0, :cond_1

    const-string p1, ""

    .line 147
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 152
    :cond_0
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string p1, ""

    const-string v0, "namespace"

    const-string v1, "Namespace URIs must be non-null and non-empty Strings"

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    .line 148
    :cond_1
    :goto_0
    sget-object p0, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    return-object p0

    .line 158
    :cond_2
    sget-object v0, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    if-nez v0, :cond_4

    .line 163
    invoke-static {p1}, Lorg/jdom2/Verifier;->checkNamespaceURI(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 167
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 168
    sget-object v1, Lorg/jdom2/Namespace;->namespacemap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_1

    .line 164
    :cond_3
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string v1, "Namespace URI"

    invoke-direct {p0, p1, v1, v0}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_1
    if-nez p0, :cond_5

    const-string v1, ""

    goto :goto_2

    :cond_5
    move-object v1, p0

    .line 181
    :goto_2
    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jdom2/Namespace;

    if-eqz v1, :cond_6

    return-object v1

    :cond_6
    const-string v1, ""

    .line 190
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "http://www.w3.org/XML/1998/namespace"

    .line 201
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "http://www.w3.org/2000/xmlns/"

    .line 208
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    if-nez p0, :cond_7

    const-string p0, ""

    :cond_7
    const-string v1, "xml"

    .line 221
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "xmlns"

    .line 230
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 237
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkNamespacePrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    .line 242
    new-instance v1, Lorg/jdom2/Namespace;

    invoke-direct {v1, p0, p1}, Lorg/jdom2/Namespace;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    invoke-interface {v0, p0, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/jdom2/Namespace;

    if-eqz p0, :cond_8

    goto :goto_3

    :cond_8
    move-object p0, v1

    :goto_3
    return-object p0

    .line 238
    :cond_9
    new-instance p1, Lorg/jdom2/IllegalNameException;

    const-string v0, "Namespace prefix"

    invoke-direct {p1, p0, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    .line 232
    :cond_a
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string v0, "Namespace prefix"

    const-string v1, "The prefix xmlns (any case) can only be bound to only the \'http://www.w3.org/2000/xmlns/\' uri."

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    .line 223
    :cond_b
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string v0, "Namespace prefix"

    const-string v1, "The prefix xml (any case) can only be bound to only the \'http://www.w3.org/XML/1998/namespace\' uri."

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    .line 209
    :cond_c
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string v0, "Namespace URI"

    const-string v1, "The http://www.w3.org/2000/xmlns/ must be bound to only the \'xmlns\' prefix."

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    .line 202
    :cond_d
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string v0, "Namespace URI"

    const-string v1, "The http://www.w3.org/XML/1998/namespace must be bound to only the \'xml\' prefix."

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    .line 194
    :cond_e
    new-instance p0, Lorg/jdom2/IllegalNameException;

    const-string p1, ""

    const-string v0, "namespace"

    const-string v1, "Namespace URIs must be non-null and non-empty Strings"

    invoke-direct {p0, p1, v0, v1}, Lorg/jdom2/IllegalNameException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    throw p0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidObjectException;
        }
    .end annotation

    .line 389
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Namespace is serialized through a proxy"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 3

    .line 379
    new-instance v0, Lorg/jdom2/Namespace$NamespaceSerializationProxy;

    iget-object v1, p0, Lorg/jdom2/Namespace;->prefix:Ljava/lang/String;

    iget-object v2, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lorg/jdom2/Namespace$NamespaceSerializationProxy;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 315
    :cond_0
    instance-of v0, p1, Lorg/jdom2/Namespace;

    if-eqz v0, :cond_1

    .line 316
    iget-object v0, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    check-cast p1, Lorg/jdom2/Namespace;

    iget-object p1, p1, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 290
    iget-object v0, p0, Lorg/jdom2/Namespace;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getURI()Ljava/lang/String;
    .locals 1

    .line 299
    iget-object v0, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 344
    iget-object v0, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Namespace: prefix \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/Namespace;->prefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" is mapped to URI \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/Namespace;->uri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
