.class public Lorg/jivesoftware/smack/compress/packet/Compress;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/compress/packet/Compress$Feature;
    }
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "compress"

.field public static final NAMESPACE:Ljava/lang/String; = "http://jabber.org/protocol/compress"


# instance fields
.field public final method:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lorg/jivesoftware/smack/compress/packet/Compress;->method:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 39
    const-string v0, "compress"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 44
    const-string v0, "http://jabber.org/protocol/compress"

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lorg/jivesoftware/smack/compress/packet/Compress;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 3

    .line 49
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 50
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 51
    const-string v0, "method"

    iget-object v1, p0, Lorg/jivesoftware/smack/compress/packet/Compress;->method:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->element(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 52
    invoke-virtual {v2, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Lorg/jivesoftware/smack/packet/NamedElement;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 53
    return-object v2
.end method
