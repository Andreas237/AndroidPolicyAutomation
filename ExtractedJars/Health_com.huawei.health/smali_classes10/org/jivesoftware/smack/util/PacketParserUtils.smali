.class public Lorg/jivesoftware/smack/util/PacketParserUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final FEATURE_XML_ROUNDTRIP:Ljava/lang/String; = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip"

.field private static final TAG:Ljava/lang/String; = "PacketParserUtils"

.field private static final XML_PULL_PARSER_FACTORY:Lorg/xmlpull/v1/XmlPullParserFactory;

.field public static final XML_PULL_PARSER_SUPPORTS_ROUNDTRIP:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 67
    const-class v0, Lorg/jivesoftware/smack/util/PacketParserUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    .line 85
    const/4 v3, 0x0

    .line 87
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->XML_PULL_PARSER_FACTORY:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 88
    sget-object v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->XML_PULL_PARSER_FACTORY:Lorg/xmlpull/v1/XmlPullParserFactory;

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 90
    const-string v0, "http://xmlpull.org/v1/doc/features.html#xml-roundtrip"

    const/4 v1, 0x1

    :try_start_1
    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0

    .line 92
    const/4 v3, 0x1

    .line 96
    goto :goto_1

    .line 93
    :catch_0
    move-exception v4

    .line 95
    const-string v0, "PacketParserUtils"

    const-string v1, "XmlPullParser does not support XML_ROUNDTRIP"

    :try_start_2
    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1

    .line 101
    :goto_1
    goto :goto_2

    .line 98
    :catch_1
    move-exception v4

    .line 100
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v4}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 102
    :goto_2
    sput-boolean v3, Lorg/jivesoftware/smack/util/PacketParserUtils;->XML_PULL_PARSER_SUPPORTS_ROUNDTRIP:Z

    .line 103
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Lorg/xmlpull/v1/XmlPullParser;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1091
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v0, v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 1092
    return-void
.end method

.method public static addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1097
    invoke-static {p2, p3, p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseExtensionElement(Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v1

    .line 1098
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1099
    return-void
.end method

.method public static addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1079
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 1080
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v0, v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    return-void
.end method

.method public static addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1085
    invoke-static {p2, p3, p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseExtensionElement(Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    .line 1086
    invoke-virtual {p0, v0}, Lorg/jivesoftware/smack/packet/Stanza;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 1087
    return-void
.end method

.method public static addPacketExtension(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Lorg/xmlpull/v1/XmlPullParser;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1067
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v0, v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 1068
    return-void
.end method

.method public static addPacketExtension(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lorg/jivesoftware/smack/packet/ExtensionElement;>;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1073
    invoke-static {p0, p1, p2, p3}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 1074
    return-void
.end method

.method public static addPacketExtension(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1055
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 1056
    return-void
.end method

.method public static addPacketExtension(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1061
    invoke-static {p0, p1, p2, p3}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 1062
    return-void
.end method

.method private static getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 4

    .line 1039
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 1040
    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    .line 1041
    const-string v0, "xml:lang"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lang"

    .line 1043
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "xml"

    .line 1044
    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1046
    :cond_0
    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1039
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1049
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getParserFor(Ljava/io/Reader;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 110
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->newXmppParser(Ljava/io/Reader;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 112
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 113
    :goto_0
    const/4 v0, 0x2

    if-eq v3, v0, :cond_1

    .line 114
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 115
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Document contains no start tag"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :cond_0
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_0

    .line 119
    :cond_1
    return-object v2
.end method

.method public static getParserFor(Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 106
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getParserFor(Ljava/io/Reader;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    return-object v0
.end method

.method public static getParserFor(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 124
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getParserFor(Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v3

    .line 127
    :goto_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    .line 128
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 129
    const/4 v0, 0x2

    if-ne v4, v0, :cond_0

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    goto :goto_1

    .line 132
    :cond_0
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 133
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find start tag \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' in stanza: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_1
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 137
    goto :goto_0

    .line 139
    :goto_1
    return-object v3
.end method

.method public static newXmppParser()Lorg/xmlpull/v1/XmlPullParser;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 184
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 185
    const-string v0, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 186
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->XML_PULL_PARSER_SUPPORTS_ROUNDTRIP:Z

    if-eqz v0, :cond_0

    .line 188
    const-string v0, "http://xmlpull.org/v1/doc/features.html#xml-roundtrip"

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    goto :goto_0

    .line 190
    :catch_0
    move-exception v3

    .line 191
    const-string v0, "PacketParserUtils"

    const-string v1, "XmlPullParser does not support XML_ROUNDTRIP, although it was first determined to be supported"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static newXmppParser(Ljava/io/Reader;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 212
    invoke-static {}, Lorg/jivesoftware/smack/util/PacketParserUtils;->newXmppParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    .line 213
    invoke-interface {v0, p0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 214
    return-object v0
.end method

.method public static parseAnReport(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/AnReport;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1226
    new-instance v2, Lorg/jivesoftware/smack/packet/AnReport;

    invoke-direct {v2}, Lorg/jivesoftware/smack/packet/AnReport;-><init>()V

    .line 1228
    sget-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setReportType(Lorg/jivesoftware/smack/packet/AnReport$ReportType;)V

    .line 1229
    const-string v0, ""

    const-string v1, "id"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setStanzaId(Ljava/lang/String;)V

    .line 1230
    const-string v0, "from"

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setFrom(Lo/fte;)V

    .line 1231
    const-string v0, "to"

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setTo(Lo/fte;)V

    .line 1232
    const-string v0, ""

    const-string v1, "seq"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setSeq(Ljava/lang/String;)V

    .line 1235
    const-string v0, ""

    const-string v1, "errcode"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1236
    invoke-static {v3}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setErrCode(I)V

    .line 1238
    return-object v2
.end method

.method public static parseCompressionFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/compress/packet/Compress$Feature;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 750
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 752
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 753
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 755
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    .line 756
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_4

    .line 758
    :sswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 759
    move-object v6, v2

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "method"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x0

    :cond_1
    :goto_1
    sparse-switch v7, :sswitch_data_2

    goto :goto_2

    .line 761
    :sswitch_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 764
    :goto_2
    goto :goto_4

    .line 766
    :sswitch_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 767
    move-object v6, v2

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_4
    const-string v0, "compression"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v7, 0x0

    :cond_2
    :goto_3
    sparse-switch v7, :sswitch_data_4

    goto :goto_4

    .line 769
    :sswitch_5
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_3

    .line 770
    goto :goto_5

    .line 774
    :cond_3
    :goto_4
    goto/16 :goto_0

    .line 775
    :goto_5
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_4

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 776
    :cond_4
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_5

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-eq v0, v3, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 777
    :cond_5
    new-instance v0, Lorg/jivesoftware/smack/compress/packet/Compress$Feature;

    invoke-direct {v0, v4}, Lorg/jivesoftware/smack/compress/packet/Compress$Feature;-><init>(Ljava/util/List;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x403a2f1f -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x555a5966 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x0 -> :sswitch_5
    .end sparse-switch
.end method

.method public static parseContent(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/CharSequence;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 426
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 427
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 428
    const-string v0, ""

    return-object v0

    .line 431
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 432
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;I)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 437
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 464
    const-string v0, "http://xmlpull.org/v1/doc/features.html#xml-roundtrip"

    invoke-interface {p0, v0}, Lorg/xmlpull/v1/XmlPullParser;->getFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepthWithRoundtrip(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    .line 467
    :cond_0
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepthWithoutRoundtrip(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private static parseContentDepthWithRoundtrip(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 530
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 531
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    .line 535
    :goto_0
    const/4 v0, 0x2

    if-ne v2, v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-nez v0, :cond_2

    .line 536
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v3

    .line 537
    const/4 v0, 0x4

    if-ne v2, v0, :cond_1

    .line 539
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXmlText(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 541
    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 543
    :cond_2
    const/4 v0, 0x3

    if-ne v2, v0, :cond_3

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-gt v0, p1, :cond_3

    .line 544
    goto :goto_1

    .line 546
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    goto :goto_0

    .line 548
    :goto_1
    return-object v1
.end method

.method private static parseContentDepthWithoutRoundtrip(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 473
    new-instance v2, Lorg/jivesoftware/smack/util/XmlStringBuilder;

    invoke-direct {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;-><init>()V

    .line 474
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 475
    const/4 v4, 0x0

    .line 479
    const/4 v5, 0x0

    .line 481
    :goto_0
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    .line 483
    :pswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->halfOpenElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 484
    if-eqz v5, :cond_0

    if-eqz p2, :cond_1

    .line 485
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v6

    .line 486
    invoke-static {v6}, Lorg/jivesoftware/smack/util/StringUtils;->isNotEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    const-string v0, "xmlns"

    invoke-virtual {v2, v0, v6}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 488
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 491
    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 492
    invoke-interface {p0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 491
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 494
    :cond_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 495
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeEmptyElement()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 496
    const/4 v4, 0x1

    goto :goto_3

    .line 499
    :cond_3
    invoke-virtual {v2}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->rightAngleBracket()Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 501
    goto :goto_3

    .line 503
    :pswitch_1
    if-eqz v4, :cond_4

    .line 505
    const/4 v4, 0x0

    goto :goto_2

    .line 508
    :cond_4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->closeElement(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 510
    :goto_2
    if-eqz v5, :cond_5

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 512
    const/4 v5, 0x0

    .line 514
    :cond_5
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-gt v0, p1, :cond_6

    .line 516
    goto :goto_4

    .line 520
    :pswitch_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/util/XmlStringBuilder;->escape(Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 523
    :cond_6
    :goto_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto/16 :goto_0

    .line 525
    :goto_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static parseDescriptiveTexts(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 782
    if-nez p1, :cond_0

    .line 783
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 785
    :cond_0
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    .line 786
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v2

    .line 787
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 788
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    if-eqz v3, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 789
    :cond_1
    return-object p1
.end method

.method public static parseElement(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 398
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseElement(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static parseElement(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/lang/CharSequence;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 404
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 405
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    invoke-static {p0, v0, p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseContentDepth(Lorg/xmlpull/v1/XmlPullParser;IZ)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static parseElementText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 354
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 356
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 357
    const-string v2, ""

    goto :goto_0

    .line 361
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 362
    const/4 v0, 0x4

    if-eq v3, v0, :cond_3

    .line 363
    const/4 v0, 0x3

    if-ne v3, v0, :cond_2

    .line 369
    const-string v0, ""

    return-object v0

    .line 371
    :cond_2
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Non-empty element tag not followed by text, while Mixed Content (XML 3.2.2) is disallowed"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 375
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    .line 376
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 377
    const/4 v0, 0x3

    if-eq v3, v0, :cond_4

    .line 378
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "Non-empty element tag contains child-elements, while Mixed Content (XML 3.2.2) is disallowed"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 382
    :cond_4
    :goto_0
    return-object v2
.end method

.method public static parseError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 910
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    .line 911
    const/4 v3, 0x0

    .line 912
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 913
    invoke-static {}, Lorg/jivesoftware/smack/packet/XMPPError;->getBuilder()Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v5

    .line 916
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/XMPPError$Type;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Type;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setType(Lorg/jivesoftware/smack/packet/XMPPError$Type;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 917
    const-string v0, ""

    const-string v1, "by"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setErrorGenerator(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 920
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    .line 921
    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_7

    .line 923
    :sswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 924
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v8

    .line 925
    move-object v9, v8

    const/4 v10, -0x1

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "urn:ietf:params:xml:ns:xmpp-stanzas"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v10, 0x0

    :cond_0
    :goto_1
    sparse-switch v10, :sswitch_data_2

    goto :goto_5

    .line 927
    :sswitch_2
    move-object v11, v7

    const/4 v12, -0x1

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_2

    :sswitch_3
    const-string v0, "text"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v12, 0x0

    :cond_1
    :goto_2
    sparse-switch v12, :sswitch_data_4

    goto :goto_3

    .line 929
    :sswitch_4
    invoke-static {p0, v3}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseDescriptiveTexts(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    .line 930
    goto :goto_4

    .line 932
    :goto_3
    invoke-static {v7}, Lorg/jivesoftware/smack/packet/XMPPError$Condition;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Condition;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setCondition(Lorg/jivesoftware/smack/packet/XMPPError$Condition;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 933
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-nez v0, :cond_2

    .line 934
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setConditionText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    .line 938
    :cond_2
    :goto_4
    goto :goto_6

    .line 940
    :goto_5
    invoke-static {v4, p0, v7, v8}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 942
    :goto_6
    goto :goto_7

    .line 944
    :sswitch_5
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 945
    goto :goto_8

    .line 948
    :cond_3
    :goto_7
    goto/16 :goto_0

    .line 949
    :goto_8
    invoke-virtual {v5, v4}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setExtensions(Ljava/util/List;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    invoke-virtual {v0, v3}, Lorg/jivesoftware/smack/packet/XMPPError$Builder;->setDescriptiveTexts(Ljava/util/Map;)Lorg/jivesoftware/smack/packet/AbstractError$Builder;

    .line 950
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x34f9b5a7 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x36452d -> :sswitch_3
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x0 -> :sswitch_4
    .end sparse-switch
.end method

.method public static parseExtensionElement(Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 973
    invoke-static {p2}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 975
    invoke-static {p0, p1}, Lorg/jivesoftware/smack/provider/ProviderManager;->getExtensionProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/ExtensionElementProvider;

    move-result-object v1

    .line 976
    if-eqz v1, :cond_0

    .line 977
    invoke-virtual {v1, p2}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Element;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/ExtensionElement;

    return-object v0

    .line 981
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->INSTANCE:Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;

    invoke-virtual {v0, p2}, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Element;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/packet/ExtensionElement;

    return-object v0
.end method

.method public static parseIQ(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/IQ;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 640
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 641
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 642
    const/4 v4, 0x0

    .line 643
    const/4 v5, 0x0

    .line 645
    const-string v0, ""

    const-string v1, "id"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 646
    const-string v0, "to"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v7

    .line 647
    const-string v0, "from"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v8

    .line 648
    const-string v0, ""

    const-string v1, "type"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/IQ$Type;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/IQ$Type;

    move-result-object v9

    .line 651
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v10

    .line 653
    sparse-switch v10, :sswitch_data_0

    goto/16 :goto_4

    .line 655
    :sswitch_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v11

    .line 656
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v12

    .line 657
    move-object v13, v11

    const/4 v14, -0x1

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "error"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v14, 0x0

    :cond_0
    :goto_1
    sparse-switch v14, :sswitch_data_2

    goto :goto_2

    .line 659
    :sswitch_2
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v5

    .line 660
    goto :goto_3

    .line 664
    :goto_2
    invoke-static {v11, v12}, Lorg/jivesoftware/smack/provider/ProviderManager;->getIQProvider(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/provider/IQProvider;

    move-result-object v15

    .line 665
    if-eqz v15, :cond_1

    .line 666
    move-object/from16 v0, p0

    invoke-virtual {v15, v0}, Lorg/jivesoftware/smack/provider/IQProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Element;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/jivesoftware/smack/packet/IQ;

    goto :goto_3

    .line 673
    :cond_1
    new-instance v4, Lorg/jivesoftware/smack/packet/UnparsedIQ;

    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseElement(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {v4, v11, v12, v0}, Lorg/jivesoftware/smack/packet/UnparsedIQ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 677
    :goto_3
    goto :goto_4

    .line 679
    :sswitch_3
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 680
    goto :goto_5

    .line 684
    :cond_2
    :goto_4
    goto/16 :goto_0

    .line 686
    :goto_5
    if-nez v4, :cond_3

    .line 687
    sget-object v0, Lorg/jivesoftware/smack/util/PacketParserUtils$4;->d:[I

    invoke-virtual {v9}, Lorg/jivesoftware/smack/packet/IQ$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_6

    .line 690
    :sswitch_4
    new-instance v4, Lorg/jivesoftware/smack/packet/ErrorIQ;

    invoke-direct {v4, v5}, Lorg/jivesoftware/smack/packet/ErrorIQ;-><init>(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V

    .line 691
    goto :goto_6

    .line 693
    :sswitch_5
    new-instance v4, Lorg/jivesoftware/smack/packet/EmptyResultIQ;

    invoke-direct {v4}, Lorg/jivesoftware/smack/packet/EmptyResultIQ;-><init>()V

    .line 694
    .line 701
    :cond_3
    :goto_6
    if-eqz v4, :cond_4

    .line 702
    invoke-virtual {v4, v6}, Lorg/jivesoftware/smack/packet/IQ;->setStanzaId(Ljava/lang/String;)V

    .line 703
    invoke-virtual {v4, v7}, Lorg/jivesoftware/smack/packet/IQ;->setTo(Lo/fte;)V

    .line 704
    invoke-virtual {v4, v8}, Lorg/jivesoftware/smack/packet/IQ;->setFrom(Lo/fte;)V

    .line 705
    invoke-virtual {v4, v9}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 706
    invoke-virtual {v4, v5}, Lorg/jivesoftware/smack/packet/IQ;->setError(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V

    .line 708
    :cond_4
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x5c4d208 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x1 -> :sswitch_4
        0x2 -> :sswitch_5
    .end sparse-switch
.end method

.method private static parseInt(Ljava/lang/String;)I
    .locals 4

    .line 1206
    const/4 v2, 0x0

    .line 1207
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1208
    return v2

    .line 1211
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 1214
    goto :goto_0

    .line 1212
    :catch_0
    move-exception v3

    .line 1213
    const-string v0, "PacketParserUtils"

    const-string v1, "parseInt meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1215
    :goto_0
    return v2
.end method

.method public static parseMechanisms(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Collection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Collection<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 721
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 722
    const/4 v3, 0x0

    .line 723
    :goto_0
    if-nez v3, :cond_3

    .line 724
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 726
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 727
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 728
    const-string v0, "mechanism"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 729
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    :cond_0
    goto :goto_1

    .line 732
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 733
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mechanisms"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 734
    const/4 v3, 0x1

    .line 737
    :cond_2
    :goto_1
    goto :goto_0

    .line 738
    :cond_3
    return-object v2
.end method

.method public static parseMessage(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Message;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 226
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 227
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 229
    :cond_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 230
    new-instance v4, Lorg/jivesoftware/smack/packet/Message;

    invoke-direct {v4}, Lorg/jivesoftware/smack/packet/Message;-><init>()V

    .line 231
    const-string v0, ""

    const-string v1, "id"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setStanzaId(Ljava/lang/String;)V

    .line 232
    const-string v0, "to"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setTo(Lo/fte;)V

    .line 233
    const-string v0, "from"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setFrom(Lo/fte;)V

    .line 234
    const-string v0, ""

    const-string v1, "type"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 238
    const-string v0, ""

    const-string v1, "ts"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 239
    invoke-static {v6}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parserLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->setTs(J)V

    .line 242
    const-string v0, ""

    const-string v1, "seq"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 243
    invoke-static {v7}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parserLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->setSeq(J)V

    .line 246
    const-string v0, ""

    const-string v1, "preseq"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 247
    invoke-static {v8}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parserLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->setPreSeq(J)V

    .line 250
    const-string v0, ""

    const-string v1, "channel"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 251
    if-eqz v9, :cond_1

    .line 252
    invoke-virtual {v4, v9}, Lorg/jivesoftware/smack/packet/Message;->setChannel(Ljava/lang/String;)V

    .line 255
    :cond_1
    const-string v0, ""

    const-string v1, "refer"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 256
    invoke-virtual {v4, v10}, Lorg/jivesoftware/smack/packet/Message;->setRefer(Ljava/lang/String;)V

    .line 259
    const-string v0, ""

    const-string v1, "notify"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 260
    invoke-static {v11}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parserNotify(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setNotify(I)V

    .line 263
    if-eqz v5, :cond_2

    .line 264
    invoke-static {v5}, Lorg/jivesoftware/smack/packet/Message$Type;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 266
    :cond_2
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v12

    .line 269
    const/4 v13, 0x0

    .line 270
    if-eqz v12, :cond_3

    const-string v0, ""

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 271
    invoke-virtual {v4, v12}, Lorg/jivesoftware/smack/packet/Message;->setLanguage(Ljava/lang/String;)V

    .line 272
    move-object v13, v12

    goto :goto_0

    .line 275
    :cond_3
    invoke-static {}, Lorg/jivesoftware/smack/packet/Stanza;->getDefaultLanguage()Ljava/lang/String;

    move-result-object v13

    .line 281
    :goto_0
    const/4 v14, 0x0

    .line 283
    :goto_1
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v15

    .line 284
    sparse-switch v15, :sswitch_data_0

    goto/16 :goto_5

    .line 286
    :sswitch_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v16

    .line 287
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v17

    .line 288
    move-object/from16 v18, v16

    const/16 v19, -0x1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_1
    const-string v0, "subject"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v19, 0x0

    goto :goto_2

    :sswitch_2
    const-string v0, "body"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v19, 0x1

    goto :goto_2

    :sswitch_3
    const-string v0, "thread"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v19, 0x2

    goto :goto_2

    :sswitch_4
    const-string v0, "error"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v19, 0x3

    :cond_4
    :goto_2
    packed-switch v19, :pswitch_data_0

    goto/16 :goto_3

    .line 290
    :pswitch_0
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v20

    .line 291
    if-nez v20, :cond_5

    .line 292
    move-object/from16 v20, v13

    .line 295
    :cond_5
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseElementText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v21

    .line 297
    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->getSubject(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    .line 298
    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->addSubject(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Subject;

    goto :goto_4

    .line 302
    :pswitch_1
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v22

    .line 303
    if-nez v22, :cond_6

    .line 304
    move-object/from16 v22, v13

    .line 307
    :cond_6
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseElementText(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v23

    .line 309
    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->getBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    .line 310
    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v4, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->addBody(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Body;

    goto :goto_4

    .line 314
    :pswitch_2
    if-nez v14, :cond_7

    .line 315
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    .line 319
    :pswitch_3
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/Message;->setError(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V

    .line 320
    goto :goto_4

    .line 322
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-static {v4, v0, v1, v2}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    :cond_7
    :goto_4
    goto :goto_5

    .line 327
    :sswitch_5
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_8

    .line 328
    goto :goto_6

    .line 332
    :cond_8
    :goto_5
    goto/16 :goto_1

    .line 334
    :goto_6
    invoke-virtual {v4, v14}, Lorg/jivesoftware/smack/packet/Message;->setThread(Ljava/lang/String;)V

    .line 335
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6f55aad4 -> :sswitch_1
        -0x341ef1f6 -> :sswitch_3
        0x2e39a2 -> :sswitch_2
        0x5c4d208 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static parsePacketExtension(Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/ExtensionElement;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 960
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseExtensionElement(Ljava/lang/String;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    return-object v0
.end method

.method public static parsePresence(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Presence;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 560
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 561
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 563
    sget-object v4, Lorg/jivesoftware/smack/packet/Presence$Type;->available:Lorg/jivesoftware/smack/packet/Presence$Type;

    .line 564
    const-string v0, ""

    const-string v1, "type"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 565
    if-eqz v5, :cond_0

    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 566
    invoke-static {v5}, Lorg/jivesoftware/smack/packet/Presence$Type;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Type;

    move-result-object v4

    .line 568
    :cond_0
    new-instance v6, Lorg/jivesoftware/smack/packet/Presence;

    invoke-direct {v6, v4}, Lorg/jivesoftware/smack/packet/Presence;-><init>(Lorg/jivesoftware/smack/packet/Presence$Type;)V

    .line 569
    const-string v0, "to"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setTo(Lo/fte;)V

    .line 570
    const-string v0, "from"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lorg/jivesoftware/smack/util/ParserUtils;->getJidAttribute(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lo/fte;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setFrom(Lo/fte;)V

    .line 571
    const-string v0, ""

    const-string v1, "id"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setStanzaId(Ljava/lang/String;)V

    .line 573
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getLanguageAttribute(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v7

    .line 574
    if-eqz v7, :cond_1

    const-string v0, ""

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 576
    invoke-virtual {v6, v7}, Lorg/jivesoftware/smack/packet/Presence;->setLanguage(Ljava/lang/String;)V

    .line 582
    :cond_1
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    .line 583
    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_4

    .line 585
    :sswitch_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v9

    .line 586
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v10

    .line 587
    move-object v11, v9

    const/4 v12, -0x1

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "status"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v12, 0x0

    goto :goto_1

    :sswitch_2
    const-string v0, "priority"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v12, 0x1

    goto :goto_1

    :sswitch_3
    const-string v0, "show"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v12, 0x2

    goto :goto_1

    :sswitch_4
    const-string v0, "error"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v12, 0x3

    :cond_2
    :goto_1
    packed-switch v12, :pswitch_data_0

    goto :goto_2

    .line 589
    :pswitch_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setStatus(Ljava/lang/String;)V

    .line 590
    goto :goto_3

    .line 592
    :pswitch_1
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    .line 593
    invoke-virtual {v6, v13}, Lorg/jivesoftware/smack/packet/Presence;->setPriority(I)V

    .line 594
    goto :goto_3

    .line 596
    :pswitch_2
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v14

    .line 597
    invoke-static {v14}, Lorg/jivesoftware/smack/util/StringUtils;->isNotEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 598
    invoke-static {v14}, Lorg/jivesoftware/smack/packet/Presence$Mode;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Presence$Mode;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setMode(Lorg/jivesoftware/smack/packet/Presence$Mode;)V

    goto :goto_3

    .line 603
    :cond_3
    const-string v0, "PacketParserUtils"

    const-string v1, "Empty or null mode text in presence show element with id \'\' which is invalid according to RFC6121 4.7.2.1"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    goto :goto_3

    .line 608
    :pswitch_3
    invoke-static/range {p0 .. p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/XMPPError$Builder;

    move-result-object v0

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Presence;->setError(Lorg/jivesoftware/smack/packet/XMPPError$Builder;)V

    .line 609
    goto :goto_3

    .line 615
    :goto_2
    move-object/from16 v0, p0

    :try_start_0
    invoke-static {v6, v0, v9, v10}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Lorg/jivesoftware/smack/packet/Stanza;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 618
    goto :goto_3

    .line 616
    :catch_0
    move-exception v15

    .line 617
    const-string v0, "PacketParserUtils"

    const-string v1, "Failed to parse extension element in Presence stanza id"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    :goto_3
    goto :goto_4

    .line 623
    :sswitch_5
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_4

    .line 624
    goto :goto_5

    .line 628
    :cond_4
    :goto_4
    goto/16 :goto_0

    .line 629
    :goto_5
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x4577865c -> :sswitch_2
        -0x3532300e -> :sswitch_1
        0x35dafd -> :sswitch_3
        0x5c4d208 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static parseSASLFailure(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 801
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    .line 802
    const/4 v2, 0x0

    .line 803
    const/4 v3, 0x0

    .line 805
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 806
    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    .line 808
    :sswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 809
    const-string v0, "text"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    invoke-static {p0, v3}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseDescriptiveTexts(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    goto :goto_1

    .line 813
    :cond_0
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 814
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 816
    goto :goto_1

    .line 818
    :sswitch_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 819
    goto :goto_2

    .line 823
    :cond_2
    :goto_1
    goto :goto_0

    .line 824
    :goto_2
    new-instance v0, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;

    invoke-direct {v0, v2, v3}, Lorg/jivesoftware/smack/sasl/packet/SaslStreamElements$SASLFailure;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public static parseSASLServiceTokenFailure(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1110
    const/4 v2, 0x0

    .line 1111
    const/4 v3, 0x0

    .line 1112
    :goto_0
    if-nez v3, :cond_2

    .line 1113
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 1114
    const/4 v0, 0x2

    if-ne v4, v0, :cond_0

    .line 1115
    const-string v0, "failure"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1116
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 1118
    :cond_0
    const/4 v0, 0x3

    if-ne v4, v0, :cond_1

    .line 1119
    const-string v0, "failure"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1120
    const/4 v3, 0x1

    .line 1123
    :cond_1
    :goto_1
    goto :goto_0

    .line 1124
    :cond_2
    new-instance v0, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;

    invoke-direct {v0, v2}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$SASLServiceTokenFailure;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static parseSessionFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Session$Feature;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1012
    invoke-static {p0}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 1013
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    .line 1014
    const/4 v2, 0x0

    .line 1015
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1017
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 1018
    sparse-switch v3, :sswitch_data_0

    goto :goto_3

    .line 1020
    :sswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 1021
    move-object v5, v4

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "optional"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x0

    :cond_0
    :goto_1
    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    .line 1023
    :sswitch_2
    const/4 v2, 0x1

    .line 1026
    :goto_2
    goto :goto_3

    .line 1028
    :sswitch_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 1029
    goto :goto_4

    .line 1032
    :cond_1
    :goto_3
    goto :goto_0

    .line 1034
    :cond_2
    :goto_4
    new-instance v0, Lorg/jivesoftware/smack/packet/Session$Feature;

    invoke-direct {v0, v2}, Lorg/jivesoftware/smack/packet/Session$Feature;-><init>(Z)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x4b5b4a0 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_2
    .end sparse-switch
.end method

.method public static parseStanza(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Stanza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:Lorg/jivesoftware/smack/packet/Stanza;>(Ljava/lang/String;)TS;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 144
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->getParserFor(Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseStanza(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Stanza;

    move-result-object v0

    return-object v0
.end method

.method public static parseStanza(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Stanza;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 157
    invoke-static {p0}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 158
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 159
    move-object v4, v3

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "message"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "iq"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "presence"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x2

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 161
    :pswitch_0
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseMessage(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Message;

    move-result-object v0

    return-object v0

    .line 163
    :pswitch_1
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseIQ(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/IQ;

    move-result-object v0

    return-object v0

    .line 165
    :pswitch_2
    invoke-static {p0}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parsePresence(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Presence;

    move-result-object v0

    return-object v0

    .line 167
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can only parse message, iq or presence, not "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x4c186305 -> :sswitch_2
        0xd28 -> :sswitch_1
        0x38eb0007 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static parseStartTlsFeature(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/StartTls;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 986
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 987
    :cond_0
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v0

    const-string v1, "urn:ietf:params:xml:ns:xmpp-tls"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 988
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    .line 989
    const/4 v3, 0x0

    .line 991
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 992
    sparse-switch v4, :sswitch_data_0

    goto :goto_3

    .line 994
    :sswitch_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 995
    move-object v6, v5

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "required"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v7, 0x0

    :cond_2
    :goto_1
    sparse-switch v7, :sswitch_data_2

    goto :goto_2

    .line 997
    :sswitch_2
    const/4 v3, 0x1

    .line 1000
    :goto_2
    goto :goto_3

    .line 1002
    :sswitch_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 1003
    goto :goto_4

    .line 1006
    :cond_3
    :goto_3
    goto :goto_0

    .line 1007
    :goto_4
    sget-boolean v0, Lorg/jivesoftware/smack/util/PacketParserUtils;->$assertionsDisabled:Z

    if-nez v0, :cond_4

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1008
    :cond_4
    new-instance v0, Lorg/jivesoftware/smack/packet/StartTls;

    invoke-direct {v0, v3}, Lorg/jivesoftware/smack/packet/StartTls;-><init>(Z)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x176ed461 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_2
    .end sparse-switch
.end method

.method public static parseStreamError(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/StreamError;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 835
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 836
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 837
    const/4 v5, 0x0

    .line 838
    const/4 v6, 0x0

    .line 839
    const/4 v7, 0x0

    .line 840
    const/4 v8, 0x0

    .line 842
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    .line 843
    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_8

    .line 845
    :sswitch_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    .line 846
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v11

    .line 847
    move-object v12, v11

    const/4 v13, -0x1

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "urn:ietf:params:xml:ns:xmpp-streams"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x0

    goto :goto_1

    :sswitch_2
    const-string v0, "jabber:client"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v13, 0x1

    :cond_0
    :goto_1
    sparse-switch v13, :sswitch_data_2

    goto/16 :goto_6

    .line 849
    :sswitch_3
    move-object v14, v10

    const/4 v15, -0x1

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto :goto_2

    :sswitch_4
    const-string v0, "text"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v15, 0x0

    :cond_1
    :goto_2
    sparse-switch v15, :sswitch_data_4

    goto :goto_3

    .line 851
    :sswitch_5
    move-object/from16 v0, p0

    invoke-static {v0, v5}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseDescriptiveTexts(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .line 852
    goto :goto_4

    .line 856
    :goto_3
    invoke-static {v10}, Lorg/jivesoftware/smack/packet/StreamError$Condition;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StreamError$Condition;

    move-result-object v6

    .line 857
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->isEmptyElementTag()Z

    move-result v0

    if-nez v0, :cond_2

    .line 858
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v7

    .line 862
    :cond_2
    :goto_4
    goto :goto_7

    .line 865
    :sswitch_6
    const-string v0, "peer"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 867
    const-string v0, ""

    const-string v1, "phonetype"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 868
    const-string v0, ""

    const-string v1, "ts"

    move-object/from16 v2, p0

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 869
    new-instance v16, Lorg/json/JSONObject;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONObject;-><init>()V

    .line 871
    const-string v0, "phonetype"

    move-object/from16 v1, v16

    :try_start_0
    invoke-virtual {v1, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 872
    const-string v0, "ts"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 875
    goto :goto_5

    .line 873
    :catch_0
    move-exception v17

    .line 874
    const-string v0, "PacketParserUtils"

    const-string v1, "json.put() meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 876
    :goto_5
    invoke-virtual/range {v16 .. v16}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    .line 877
    goto :goto_7

    .line 881
    :goto_6
    move-object/from16 v0, p0

    invoke-static {v4, v0, v10, v11}, Lorg/jivesoftware/smack/util/PacketParserUtils;->addExtensionElement(Ljava/util/Collection;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    :cond_3
    :goto_7
    goto :goto_8

    .line 886
    :sswitch_7
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_4

    .line 887
    goto :goto_9

    .line 891
    :cond_4
    :goto_8
    goto/16 :goto_0

    .line 893
    :goto_9
    sget-object v0, Lorg/jivesoftware/smack/packet/StreamError$Condition;->conflict:Lorg/jivesoftware/smack/packet/StreamError$Condition;

    if-ne v6, v0, :cond_5

    .line 895
    move-object v7, v8

    .line 898
    :cond_5
    new-instance v0, Lorg/jivesoftware/smack/packet/StreamError;

    invoke-direct {v0, v6, v7, v5, v4}, Lorg/jivesoftware/smack/packet/StreamError;-><init>(Lorg/jivesoftware/smack/packet/StreamError$Condition;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6343c29f -> :sswitch_2
        0x35e4d17c -> :sswitch_1
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x36452d -> :sswitch_4
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x0 -> :sswitch_5
    .end sparse-switch
.end method

.method public static parseSuccess(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1135
    const/4 v2, 0x0

    .line 1136
    const/4 v3, 0x0

    .line 1137
    const/4 v4, 0x0

    .line 1139
    :goto_0
    if-nez v2, :cond_3

    .line 1140
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    .line 1141
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 1142
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "jid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1143
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1144
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1145
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    goto :goto_1

    .line 1147
    :cond_1
    const/4 v0, 0x3

    if-ne v5, v0, :cond_2

    .line 1148
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1149
    const/4 v2, 0x1

    .line 1150
    new-instance v4, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;

    invoke-direct {v4, v3}, Lorg/jivesoftware/smack/sasl/core/SASLServiceTokenMechanism$Success;-><init>(Ljava/lang/String;)V

    .line 1153
    :cond_2
    :goto_1
    goto :goto_0

    .line 1154
    :cond_3
    return-object v4
.end method

.method private static parserLong(Ljava/lang/String;)J
    .locals 5

    .line 1186
    const-wide/16 v2, 0x0

    .line 1187
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1188
    return-wide v2

    .line 1192
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 1195
    goto :goto_0

    .line 1193
    :catch_0
    move-exception v4

    .line 1194
    const-string v0, "PacketParserUtils"

    const-string v1, "parseLong meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1196
    :goto_0
    return-wide v2
.end method

.method private static parserNotify(Ljava/lang/String;)I
    .locals 4

    .line 1165
    const/4 v2, 0x1

    .line 1166
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1167
    return v2

    .line 1171
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 1174
    goto :goto_0

    .line 1172
    :catch_0
    move-exception v3

    .line 1173
    const-string v0, "PacketParserUtils"

    const-string v1, "parseInt meet exception."

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1175
    :goto_0
    return v2
.end method
