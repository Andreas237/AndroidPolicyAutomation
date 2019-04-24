.class public final Lorg/jivesoftware/smack/packet/StandardExtensionElement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    }
.end annotation


# instance fields
.field private final attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final elements:Lorg/jivesoftware/smack/util/MultiMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jivesoftware/smack/util/MultiMap<Ljava/lang/String;Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final namespace:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private xmlCache:Lorg/jivesoftware/smack/util/XmlStringBuilder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 63
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap;)V

    .line 64
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap<Ljava/lang/String;Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;)V"
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const-string v0, "Name must not be null or empty"

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->name:Ljava/lang/String;

    .line 69
    const-string v0, "Namespace must not be null or empty"

    invoke-static {p2, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->namespace:Ljava/lang/String;

    .line 70
    if-nez p3, :cond_0

    .line 71
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->attributes:Ljava/util/Map;

    goto :goto_0

    .line 74
    :cond_0
    iput-object p3, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->attributes:Ljava/util/Map;

    .line 76
    :goto_0
    iput-object p4, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->text:Ljava/lang/String;

    .line 77
    iput-object p5, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    .line 78
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap;Lorg/jivesoftware/smack/packet/StandardExtensionElement$1;)V
    .locals 0

    .line 43
    invoke-direct/range {p0 .. p5}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lorg/jivesoftware/smack/util/MultiMap;)V

    return-void
.end method

.method public static builder(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;
    .locals 2

    .line 162
    new-instance v0, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/StandardExtensionElement$1;)V

    return-object v0
.end method


# virtual methods
.method public getAttributeValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->attributes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->attributes:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    if-nez v0, :cond_0

    .line 124
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 126
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/MultiMap;->values()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getElements(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->namespace:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->getElements(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getElements(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    if-nez v0, :cond_0

    .line 112
    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_0
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 115
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->getAll(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getFirstElement(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement;
    .locals 1

    .line 107
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->namespace:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->getFirstElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    move-result-object v0

    return-object v0
.end method

.method public getFirstElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement;
    .locals 2

    .line 99
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    if-nez v0, :cond_0

    .line 100
    const/4 v0, 0x0

    return-object v0

    .line 102
    :cond_0
    invoke-static {p1, p2}, Lo/fua;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 103
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/MultiMap;->getFirst(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->namespace:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->text:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 1

    .line 135
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->toXML(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 5

    .line 139
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->xmlCache:Lorg/jivesoftware/smack/util/XmlStringBuilder;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->xmlCache:Lorg/jivesoftware/smack/util/XmlStringBuilder;

    return-object v0

    .line 142
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2, p0, p1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>(Lorg/jivesoftware/smack/packet/ExtensionElement;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->attributes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 144
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 148
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->text:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optEscape(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 150
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    if-eqz v0, :cond_2

    .line 151
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->elements:Lorg/jivesoftware/smack/util/MultiMap;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/MultiMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 152
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->toXML(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Lorg/jivesoftware/smack/util/XmlStringBuilder;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 153
    goto :goto_1

    .line 156
    :cond_2
    invoke-virtual {v2, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Lorg/jivesoftware/smack/packet/NamedElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 157
    iput-object v2, p0, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->xmlCache:Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 158
    return-object v2
.end method
