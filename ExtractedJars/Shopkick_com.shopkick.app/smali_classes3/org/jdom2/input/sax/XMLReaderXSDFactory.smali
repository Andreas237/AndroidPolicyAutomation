.class public Lorg/jdom2/input/sax/XMLReaderXSDFactory;
.super Lorg/jdom2/input/sax/AbstractReaderXSDFactory;
.source "XMLReaderXSDFactory.java"


# static fields
.field private static final xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 89
    new-instance v0, Lorg/jdom2/input/sax/XMLReaderXSDFactory$1;

    invoke-direct {v0}, Lorg/jdom2/input/sax/XMLReaderXSDFactory$1;-><init>()V

    sput-object v0, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 198
    invoke-static {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->newInstance(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    sget-object p2, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/io/File;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 130
    invoke-static {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->newInstance(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    sget-object p2, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljava/net/URL;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 164
    invoke-static {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->newInstance(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    sget-object p2, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/net/URL;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;[Ljavax/xml/transform/Source;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 232
    invoke-static {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->newInstance(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    sget-object p2, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, p1, p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/io/File;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 179
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    sget-object v1, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, v0, v1, p1}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/io/File;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 111
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    sget-object v1, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, v0, v1, p1}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/net/URL;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 145
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    sget-object v1, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, v0, v1, p1}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/net/URL;)V

    return-void
.end method

.method public varargs constructor <init>([Ljavax/xml/transform/Source;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 213
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v0

    sget-object v1, Lorg/jdom2/input/sax/XMLReaderXSDFactory;->xsdschemas:Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;

    invoke-direct {p0, v0, v1, p1}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)V

    return-void
.end method
