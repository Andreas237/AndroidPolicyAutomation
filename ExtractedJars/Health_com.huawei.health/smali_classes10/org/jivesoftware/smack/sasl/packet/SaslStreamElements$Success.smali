.class public Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Success;
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
    name = "Success"
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "success"


# instance fields
.field private final data:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->returnIfNotEmptyTrimmed(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Success;->data:Ljava/lang/String;

    .line 162
    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Success;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 189
    const-string v0, "success"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 184
    const-string v0, "urn:ietf:params:xml:ns:xmpp-sasl"

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 149
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Success;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 175
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 176
    const-string v0, "success"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-sasl"

    invoke-virtual {v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmlnsAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 177
    iget-object v0, p0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$Success;->data:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAppend(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 178
    const-string v0, "success"

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 179
    return-object v2
.end method
