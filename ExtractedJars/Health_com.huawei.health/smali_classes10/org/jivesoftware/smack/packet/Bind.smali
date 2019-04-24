.class public final Lorg/jivesoftware/smack/packet/Bind;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/Bind$Feature;
    }
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "bind"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:ietf:params:xml:ns:xmpp-bind"


# instance fields
.field private final jid:Lo/fti;

.field private final resource:Lo/ftp;


# direct methods
.method private constructor <init>(Lo/ftp;Lo/fti;)V
    .locals 2

    .line 43
    const-string v0, "bind"

    const-string v1, "urn:ietf:params:xml:ns:xmpp-bind"

    invoke-direct {p0, v0, v1}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/Bind;->resource:Lo/ftp;

    .line 45
    iput-object p2, p0, Lorg/jivesoftware/smack/packet/Bind;->jid:Lo/fti;

    .line 46
    return-void
.end method

.method public static newResult(Lo/fti;)Lorg/jivesoftware/smack/packet/Bind;
    .locals 2

    .line 63
    new-instance v0, Lorg/jivesoftware/smack/packet/Bind;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lorg/jivesoftware/smack/packet/Bind;-><init>(Lo/ftp;Lo/fti;)V

    return-object v0
.end method

.method public static newSet(Lo/ftp;)Lorg/jivesoftware/smack/packet/Bind;
    .locals 2

    .line 57
    new-instance v1, Lorg/jivesoftware/smack/packet/Bind;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lorg/jivesoftware/smack/packet/Bind;-><init>(Lo/ftp;Lo/fti;)V

    .line 58
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->set:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-virtual {v1, v0}, Lorg/jivesoftware/smack/packet/Bind;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 59
    return-object v1
.end method


# virtual methods
.method protected getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 68
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 69
    const-string v0, "resource"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Bind;->resource:Lo/ftp;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->optElement(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 70
    const-string v0, "jid"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/Bind;->jid:Lo/fti;

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->optElement(Ljava/lang/String;Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 71
    return-object p1
.end method

.method public getJid()Lo/fti;
    .locals 1

    .line 53
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Bind;->jid:Lo/fti;

    return-object v0
.end method

.method public getResource()Lo/ftp;
    .locals 1

    .line 49
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/Bind;->resource:Lo/ftp;

    return-object v0
.end method
