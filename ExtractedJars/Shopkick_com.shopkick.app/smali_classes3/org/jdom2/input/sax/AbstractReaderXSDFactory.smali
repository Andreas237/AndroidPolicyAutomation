.class public Lorg/jdom2/input/sax/AbstractReaderXSDFactory;
.super Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;
.source "AbstractReaderXSDFactory.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;
    }
.end annotation


# static fields
.field private static final schemafactl:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljavax/xml/validation/SchemaFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 113
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->schemafactl:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public varargs constructor <init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 315
    invoke-static {p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromFile(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/io/File;)Ljavax/xml/validation/Schema;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Ljavax/xml/validation/Schema;)V

    return-void
.end method

.method public varargs constructor <init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 275
    invoke-static {p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromString(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/lang/String;)Ljavax/xml/validation/Schema;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Ljavax/xml/validation/Schema;)V

    return-void
.end method

.method public varargs constructor <init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/net/URL;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 295
    invoke-static {p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromURL(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/net/URL;)Ljavax/xml/validation/Schema;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Ljavax/xml/validation/Schema;)V

    return-void
.end method

.method public varargs constructor <init>(Ljavax/xml/parsers/SAXParserFactory;Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 335
    invoke-static {p2, p3}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromSource(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jdom2/input/sax/AbstractReaderSchemaFactory;-><init>(Ljavax/xml/parsers/SAXParserFactory;Ljavax/xml/validation/Schema;)V

    return-void
.end method

.method private static final varargs getSchemaFromFile(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/io/File;)Ljavax/xml/validation/Schema;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 159
    array-length v0, p1

    if-eqz v0, :cond_2

    .line 163
    array-length v0, p1

    new-array v0, v0, [Ljavax/xml/transform/Source;

    const/4 v1, 0x0

    .line 164
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 165
    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    .line 168
    new-instance v2, Ljavax/xml/transform/stream/StreamSource;

    aget-object v3, p1, v1

    invoke-direct {v2, v3}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/File;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 166
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null SystemID"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 170
    :cond_1
    invoke-static {p0, v0}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromSource(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;

    move-result-object p0

    return-object p0

    .line 160
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You need at least one XSD source for an XML Schema validator"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 157
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null input array"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final varargs getSchemaFromSource(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 237
    array-length v0, p1

    if-eqz v0, :cond_2

    .line 242
    :try_start_0
    sget-object v0, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->schemafactl:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/xml/validation/SchemaFactory;

    if-nez v0, :cond_0

    .line 244
    invoke-interface {p0}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;->getSchemaFactory()Ljavax/xml/validation/SchemaFactory;

    move-result-object v0

    .line 245
    sget-object p0, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->schemafactl:Ljava/lang/ThreadLocal;

    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    if-eqz v0, :cond_1

    .line 250
    invoke-virtual {v0, p1}, Ljavax/xml/validation/SchemaFactory;->newSchema([Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;

    move-result-object p0

    return-object p0

    .line 248
    :cond_1
    new-instance p0, Lorg/jdom2/JDOMException;

    const-string v0, "Unable to create XSDSchema validator."

    invoke-direct {p0, v0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 252
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 253
    new-instance v0, Lorg/jdom2/JDOMException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to create a Schema for Sources "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 238
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You need at least one XSD Source for an XML Schema validator"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 235
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null input array"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final varargs getSchemaFromString(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/lang/String;)Ljavax/xml/validation/Schema;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 130
    array-length v0, p1

    if-eqz v0, :cond_2

    .line 134
    array-length v0, p1

    new-array v0, v0, [Ljavax/xml/transform/Source;

    const/4 v1, 0x0

    .line 135
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 136
    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    .line 139
    new-instance v2, Ljavax/xml/transform/stream/StreamSource;

    aget-object v3, p1, v1

    invoke-direct {v2, v3}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/lang/String;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 137
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null SystemID"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 141
    :cond_1
    invoke-static {p0, v0}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromSource(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;

    move-result-object p0

    return-object p0

    .line 131
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You need at least one XSD source for an XML Schema validator"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 128
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null input array"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final varargs getSchemaFromURL(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljava/net/URL;)Ljavax/xml/validation/Schema;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    if-eqz p1, :cond_7

    .line 188
    array-length v0, p1

    if-eqz v0, :cond_6

    .line 192
    array-length v0, p1

    new-array v0, v0, [Ljava/io/InputStream;

    const/4 v1, 0x0

    .line 194
    :try_start_0
    array-length v2, p1

    new-array v2, v2, [Ljavax/xml/transform/Source;

    move v3, v1

    .line 195
    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_1

    .line 196
    aget-object v4, p1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    .line 201
    :try_start_1
    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    :try_start_2
    aput-object v4, v0, v3

    .line 207
    new-instance v5, Ljavax/xml/transform/stream/StreamSource;

    aget-object v6, p1, v3

    invoke-virtual {v6}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    aput-object v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    .line 203
    new-instance v2, Lorg/jdom2/JDOMException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to read Schema URL "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v3

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 197
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null SystemID"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 209
    :cond_1
    invoke-static {p0, v2}, Lorg/jdom2/input/sax/AbstractReaderXSDFactory;->getSchemaFromSource(Lorg/jdom2/input/sax/AbstractReaderXSDFactory$SchemaFactoryProvider;[Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 211
    array-length p1, v0

    :goto_1
    if-ge v1, p1, :cond_3

    aget-object v2, v0, v1

    if-eqz v2, :cond_2

    .line 214
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object p0

    :catchall_0
    move-exception p0

    .line 211
    array-length p1, v0

    :goto_2
    if-ge v1, p1, :cond_5

    aget-object v2, v0, v1

    if-eqz v2, :cond_4

    .line 214
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 211
    :cond_5
    throw p0

    .line 189
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You need at least one XSD source for an XML Schema validator"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 186
    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Cannot specify a null input array"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
