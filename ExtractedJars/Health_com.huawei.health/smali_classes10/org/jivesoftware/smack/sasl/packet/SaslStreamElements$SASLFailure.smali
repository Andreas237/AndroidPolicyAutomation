.class public Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;
.super Lorg/jivesoftware/smack/packet/AbstractError;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SASLFailure"
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "failure"


# instance fields
.field private final saslError:Lorg/jivesoftware/smack/sasl/SASLError;

.field private final saslErrorString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 204
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 205
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 208
    invoke-direct {p0, p2}, Lorg/jivesoftware/smack/packet/AbstractError;-><init>(Ljava/util/Map;)V

    .line 209
    invoke-static {p1}, Lorg/jivesoftware/smack/sasl/SASLError;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/sasl/SASLError;

    move-result-object v1

    .line 210
    if-nez v1, :cond_0

    .line 213
    sget-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->not_authorized:Lorg/jivesoftware/smack/sasl/SASLError;

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslError:Lorg/jivesoftware/smack/sasl/SASLError;

    goto :goto_0

    .line 216
    :cond_0
    iput-object v1, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslError:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 218
    :goto_0
    iput-object p1, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslErrorString:Ljava/lang/String;

    .line 219
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 260
    const-string v0, "failure"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 255
    const-string v0, "urn:ietf:params:xml:ns:xmpp-sasl"

    return-object v0
.end method

.method public getSASLError()Lorg/jivesoftware/smack/sasl/SASLError;
    .locals 1

    .line 227
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslError:Lorg/jivesoftware/smack/sasl/SASLError;

    return-object v0
.end method

.method public getSASLErrorString()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslErrorString:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 250
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 197
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 240
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 241
    const-string v0, "failure"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 242
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->saslErrorString:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->emptyElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 243
    invoke-virtual {p0, v2}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;->addDescriptiveTextsAndExtensions(Lorg/jivesoftware/smack/util/XmlStringBuilder;)V

    .line 244
    const-string v0, "failure"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 245
    return-object v2
.end method
