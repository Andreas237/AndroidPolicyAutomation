.class public Lorg/jivesoftware/smack/packet/AbstractError;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/AbstractError$Builder;
    }
.end annotation


# instance fields
.field protected final descriptiveTexts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field protected final extensions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;"
        }
    .end annotation
.end field

.field protected final textNamespace:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/packet/AbstractError;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 38
    return-void
.end method

.method protected constructor <init>(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    if-eqz p1, :cond_0

    .line 46
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/AbstractError;->descriptiveTexts:Ljava/util/Map;

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->descriptiveTexts:Ljava/util/Map;

    .line 50
    :goto_0
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/AbstractError;->textNamespace:Ljava/lang/String;

    .line 51
    if-eqz p3, :cond_1

    .line 52
    iput-object p3, p0, Lorg/jivesoftware/smack/packet/AbstractError;->extensions:Ljava/util/List;

    goto :goto_1

    .line 54
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->extensions:Ljava/util/List;

    .line 56
    :goto_1
    return-void
.end method

.method protected constructor <init>(Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lorg/jivesoftware/smack/packet/AbstractError;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 42
    return-void
.end method


# virtual methods
.method protected addDescriptiveTextsAndExtensions(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V
    .locals 6

    .line 101
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->descriptiveTexts:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 102
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 103
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 104
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/AbstractError;->textNamespace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    .line 105
    invoke-virtual {v0, v4}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 106
    invoke-virtual {p1, v5}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 107
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->extensions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/jivesoftware/smack/packet/ExtensionElement;

    .line 110
    invoke-interface {v3}, Lorg/jivesoftware/smack/packet/ExtensionElement;->toXML()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    return-void
.end method

.method public getDescriptiveText()Ljava/lang/String;
    .locals 3

    .line 67
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-virtual {p0, v1}, Lorg/jivesoftware/smack/packet/AbstractError;->getDescriptiveText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 69
    if-nez v2, :cond_0

    .line 70
    const-string v0, ""

    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/AbstractError;->getDescriptiveText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 72
    :cond_0
    return-object v2
.end method

.method public getDescriptiveText(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->descriptiveTexts:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<PE::Lorg/jivesoftware/smack/packet/ExtensionElement;>(Ljava/lang/String;Ljava/lang/String;)TPE;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AbstractError;->extensions:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lorg/jivesoftware/smack/util/PacketUtil;->extensionElementFrom(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    return-object v0
.end method
