.class public Lorg/jivesoftware/smack/packet/UnparsedIQ;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# instance fields
.field private final content:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iput-object p3, p0, Lorg/jivesoftware/smack/packet/UnparsedIQ;->content:Ljava/lang/CharSequence;

    .line 27
    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/CharSequence;
    .locals 1

    .line 32
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/UnparsedIQ;->content:Ljava/lang/CharSequence;

    return-object v0
.end method

.method protected getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/UnparsedIQ;->content:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->escape(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 38
    return-object p1
.end method
