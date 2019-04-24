.class final Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;
.super Lorg/jdom2/output/support/AbstractXMLOutputProcessor;
.source "XMLOutputter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/output/XMLOutputter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DefaultXMLProcessor"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 181
    invoke-direct {p0}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/jdom2/output/XMLOutputter$1;)V
    .locals 0

    .line 181
    invoke-direct {p0}, Lorg/jdom2/output/XMLOutputter$DefaultXMLProcessor;-><init>()V

    return-void
.end method


# virtual methods
.method public escapeAttributeEntities(Ljava/lang/String;Lorg/jdom2/output/Format;)Ljava/lang/String;
    .locals 2

    .line 195
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 197
    :try_start_0
    new-instance v1, Lorg/jdom2/output/support/FormatStack;

    invoke-direct {v1, p2}, Lorg/jdom2/output/support/FormatStack;-><init>(Lorg/jdom2/output/Format;)V

    invoke-super {p0, v0, v1, p1}, Lorg/jdom2/output/support/AbstractXMLOutputProcessor;->attributeEscapedEntitiesFilter(Ljava/io/Writer;Lorg/jdom2/output/support/FormatStack;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :catch_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final escapeElementEntities(Ljava/lang/String;Lorg/jdom2/output/Format;)Ljava/lang/String;
    .locals 1

    .line 216
    invoke-virtual {p2}, Lorg/jdom2/output/Format;->getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    invoke-virtual {p2}, Lorg/jdom2/output/Format;->getLineSeparator()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Lorg/jdom2/output/Format;->escapeText(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
