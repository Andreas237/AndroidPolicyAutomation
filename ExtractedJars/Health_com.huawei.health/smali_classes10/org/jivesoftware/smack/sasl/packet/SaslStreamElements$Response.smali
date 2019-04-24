.class public Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;
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
    name = "Response"
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "response"


# instance fields
.field private final authenticationText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;->authenticationText:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->returnIfNotEmptyTrimmed(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;->authenticationText:Ljava/lang/String;

    .line 120
    return-void
.end method


# virtual methods
.method public getAuthenticationText()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;->authenticationText:Ljava/lang/String;

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 142
    const-string v0, "response"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 137
    const-string v0, "urn:ietf:params:xml:ns:xmpp-sasl"

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 109
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 124
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 125
    const-string v0, "response"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 126
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Response;->authenticationText:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAppend(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 127
    const-string v0, "response"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 128
    return-object v2
.end method
