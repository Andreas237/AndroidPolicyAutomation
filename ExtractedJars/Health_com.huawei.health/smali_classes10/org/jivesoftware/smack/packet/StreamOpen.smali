.class public Lorg/jivesoftware/smack/packet/StreamOpen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/Nonza;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;
    }
.end annotation


# static fields
.field public static final CLIENT_NAMESPACE:Ljava/lang/String; = "jabber:client"

.field public static final ELEMENT:Ljava/lang/String; = "stream:stream"

.field public static final SERVER_NAMESPACE:Ljava/lang/String; = "jabber:server"

.field public static final VERSION:Ljava/lang/String; = "1.0"


# instance fields
.field private final appVersion:Ljava/lang/String;

.field private final contentNamespace:Ljava/lang/String;

.field private final from:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final lang:Ljava/lang/String;

.field private final to:Ljava/lang/String;

.field private final uid:J


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 9

    .line 74
    move-object v0, p0

    move-object v1, p1

    sget-object v5, Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;->client:Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lorg/jivesoftware/smack/packet/StreamOpen;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;JLjava/lang/String;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;JLjava/lang/String;)V
    .locals 9

    .line 78
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const-string v4, "en"

    sget-object v5, Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;->client:Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;

    move-wide v6, p4

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lorg/jivesoftware/smack/packet/StreamOpen;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;JLjava/lang/String;)V

    .line 79
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;JLjava/lang/String;)V
    .locals 2

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    invoke-static {p1}, Lorg/jivesoftware/smack/util/StringUtils;->maybeToString(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->to:Ljava/lang/String;

    .line 83
    invoke-static {p2}, Lorg/jivesoftware/smack/util/StringUtils;->maybeToString(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->from:Ljava/lang/String;

    .line 84
    iput-object p3, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->id:Ljava/lang/String;

    .line 85
    iput-wide p6, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->uid:J

    .line 86
    iput-object p8, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->appVersion:Ljava/lang/String;

    .line 87
    iput-object p4, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->lang:Ljava/lang/String;

    .line 88
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamOpen$3;->d:[I

    invoke-virtual {p5}, Lorg/jivesoftware/smack/packet/StreamOpen$StreamContentNamespace;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 90
    :sswitch_0
    const-string v0, "jabber:client"

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->contentNamespace:Ljava/lang/String;

    .line 91
    goto :goto_1

    .line 93
    :sswitch_1
    const-string v0, "jabber:server"

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->contentNamespace:Ljava/lang/String;

    .line 94
    goto :goto_1

    .line 96
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 98
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 107
    const-string v0, "stream:stream"

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->contentNamespace:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/StreamOpen;->toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Lorg/jivesoftware/smack/util/XmlStringBuilder;
    .locals 5

    .line 112
    new-instance v4, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v4, p0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 113
    const-string v0, "to"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->to:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 114
    const-string v0, "xmlns:stream"

    const-string v1, "http://etherx.jabber.org/streams"

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 115
    const-string v0, "version"

    const-string v1, "1.0"

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 116
    const-string v0, "from"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->from:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 117
    const-string v0, "id"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->id:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 119
    iget-wide v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->uid:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 122
    const-string v0, "uid"

    iget-wide v1, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->uid:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 125
    :cond_0
    const-string v0, "appversion"

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->appVersion:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 127
    const-string v0, "simplify"

    const-string v1, "true"

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 128
    const-string v0, "xmppVersion"

    const-string v1, "2.0"

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->optAttribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 130
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/StreamOpen;->lang:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->xmllangAttribute(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 131
    invoke-virtual {v4}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 132
    return-object v4
.end method
