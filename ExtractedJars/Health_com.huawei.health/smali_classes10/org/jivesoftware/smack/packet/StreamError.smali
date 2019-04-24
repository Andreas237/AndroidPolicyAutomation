.class public Lorg/jivesoftware/smack/packet/StreamError;
.super Lorg/jivesoftware/smack/packet/AbstractError;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/StreamError$Condition;
    }
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "stream:error"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:ietf:params:xml:ns:xmpp-streams"


# instance fields
.field private final condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

.field private final conditionText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/jivesoftware/smack/packet/StreamError$Condition;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/jivesoftware/smack/packet/StreamError$Condition;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Lorg/jivesoftware/smack/packet/ExtensionElement;>;)V"
        }
    .end annotation

    .line 109
    invoke-direct {p0, p3, p4}, Lorg/jivesoftware/smack/packet/AbstractError;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 113
    invoke-static {p2}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    const/4 p2, 0x0

    .line 127
    :cond_0
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/StreamError;->condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    .line 128
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/StreamError;->conditionText:Ljava/lang/String;

    .line 129
    return-void
.end method


# virtual methods
.method public getCondition()Lorg/jivesoftware/smack/packet/StreamError$Condition;
    .locals 1

    .line 132
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StreamError;->condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    return-object v0
.end method

.method public getConditionText()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StreamError;->conditionText:Ljava/lang/String;

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 211
    const-string v0, "stream:error"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 206
    const-string v0, "urn:ietf:params:xml:ns:xmpp-streams"

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 141
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StreamError;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 100
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StreamError;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 146
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 147
    const-string v0, "stream:error"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->openElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 148
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StreamError;->condition:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/StreamError$Condition;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-streams"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 149
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/packet/StreamError;->addDescriptiveTextsAndExtensions(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 150
    const-string v0, "stream:error"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 151
    return-object v2
.end method
