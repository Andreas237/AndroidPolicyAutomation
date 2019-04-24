.class public Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AuthMechanism"
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "auth"


# instance fields
.field private final authenticationText:Ljava/lang/String;

.field private final mechanism:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-string v0, "SASL mechanism shouldn\'t be null."

    invoke-static {p1, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->mechanism:Ljava/lang/String;

    .line 42
    const-string v0, "SASL authenticationText must not be null or empty (RFC6120 6.4.2)"

    invoke-static {p2, v0}, Lorg/jivesoftware/smack/util/StringUtils;->requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->authenticationText:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
.method public getAuthenticationText()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->authenticationText:Ljava/lang/String;

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 70
    const-string v0, "auth"

    return-object v0
.end method

.method public getMechanism()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->mechanism:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 65
    const-string v0, "urn:ietf:params:xml:ns:xmpp-sasl"

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 4

    .line 48
    new-instance v3, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v3}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 49
    const-string v0, "auth"

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "mechanism"

    iget-object v2, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->mechanism:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 50
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$AuthMechanism;->authenticationText:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAppend(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 51
    const-string v0, "auth"

    invoke-virtual {v3, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 52
    return-object v3
.end method
