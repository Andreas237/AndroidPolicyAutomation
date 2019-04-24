.class public Lorg/jivesoftware/smack/packet/StartTls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "starttls"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:ietf:params:xml:ns:xmpp-tls"


# instance fields
.field private final required:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/StartTls;-><init>(Z)V

    .line 30
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-boolean p1, p0, Lorg/jivesoftware/smack/packet/StartTls;->required:Z

    .line 34
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 42
    const-string v0, "starttls"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 47
    const-string v0, "urn:ietf:params:xml:ns:xmpp-tls"

    return-object v0
.end method

.method public required()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lorg/jivesoftware/smack/packet/StartTls;->required:Z

    return v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StartTls;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 52
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 53
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 54
    iget-boolean v0, p0, Lorg/jivesoftware/smack/packet/StartTls;->required:Z

    const-string v1, "required"

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->condEmptyElement(ZLjava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 55
    invoke-virtual {v2, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Lorg/jivesoftware/smack/packet/NamedElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 56
    return-object v2
.end method
