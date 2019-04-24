.class public Lorg/jdom2/input/SAXBuilder;
.super Ljava/lang/Object;
.source "SAXBuilder.java"

# interfaces
.implements Lorg/jdom2/input/sax/SAXEngine;


# static fields
.field private static final DEFAULTJDOMFAC:Lorg/jdom2/JDOMFactory;

.field private static final DEFAULTSAXHANDLERFAC:Lorg/jdom2/input/sax/SAXHandlerFactory;


# instance fields
.field private engine:Lorg/jdom2/input/sax/SAXEngine;

.field private expand:Z

.field private final features:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

.field private ignoringBoundaryWhite:Z

.field private ignoringWhite:Z

.field private jdomfac:Lorg/jdom2/JDOMFactory;

.field private final properties:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

.field private reuseParser:Z

.field private saxDTDHandler:Lorg/xml/sax/DTDHandler;

.field private saxEntityResolver:Lorg/xml/sax/EntityResolver;

.field private saxErrorHandler:Lorg/xml/sax/ErrorHandler;

.field private saxXMLFilter:Lorg/xml/sax/XMLFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 146
    new-instance v0, Lorg/jdom2/input/sax/DefaultSAXHandlerFactory;

    invoke-direct {v0}, Lorg/jdom2/input/sax/DefaultSAXHandlerFactory;-><init>()V

    sput-object v0, Lorg/jdom2/input/SAXBuilder;->DEFAULTSAXHANDLERFAC:Lorg/jdom2/input/sax/SAXHandlerFactory;

    .line 150
    new-instance v0, Lorg/jdom2/DefaultJDOMFactory;

    invoke-direct {v0}, Lorg/jdom2/DefaultJDOMFactory;-><init>()V

    sput-object v0, Lorg/jdom2/input/SAXBuilder;->DEFAULTJDOMFAC:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 221
    invoke-direct {p0, v0, v0, v0}, Lorg/jdom2/input/SAXBuilder;-><init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;Lorg/jdom2/input/sax/SAXHandlerFactory;Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 267
    invoke-direct {p0, p1, v0}, Lorg/jdom2/input/SAXBuilder;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 289
    new-instance v0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;

    invoke-direct {v0, p2, p1}, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;-><init>(ZLjava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, p1}, Lorg/jdom2/input/SAXBuilder;-><init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;Lorg/jdom2/input/sax/SAXHandlerFactory;Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;)V
    .locals 1

    const/4 v0, 0x0

    .line 309
    invoke-direct {p0, p1, v0, v0}, Lorg/jdom2/input/SAXBuilder;-><init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;Lorg/jdom2/input/sax/SAXHandlerFactory;Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;Lorg/jdom2/input/sax/SAXHandlerFactory;Lorg/jdom2/JDOMFactory;)V
    .locals 3

    .line 337
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    .line 164
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

    .line 169
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->jdomfac:Lorg/jdom2/JDOMFactory;

    .line 178
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Lorg/jdom2/input/SAXBuilder;->features:Ljava/util/HashMap;

    .line 181
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p0, Lorg/jdom2/input/SAXBuilder;->properties:Ljava/util/HashMap;

    .line 184
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxErrorHandler:Lorg/xml/sax/ErrorHandler;

    .line 187
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxEntityResolver:Lorg/xml/sax/EntityResolver;

    .line 190
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxDTDHandler:Lorg/xml/sax/DTDHandler;

    .line 193
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxXMLFilter:Lorg/xml/sax/XMLFilter;

    const/4 v1, 0x1

    .line 196
    iput-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    const/4 v2, 0x0

    .line 199
    iput-boolean v2, p0, Lorg/jdom2/input/SAXBuilder;->ignoringWhite:Z

    .line 202
    iput-boolean v2, p0, Lorg/jdom2/input/SAXBuilder;->ignoringBoundaryWhite:Z

    .line 205
    iput-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    .line 208
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    if-nez p1, :cond_0

    .line 338
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->NONVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    if-nez p2, :cond_1

    .line 341
    sget-object p2, Lorg/jdom2/input/SAXBuilder;->DEFAULTSAXHANDLERFAC:Lorg/jdom2/input/sax/SAXHandlerFactory;

    :cond_1
    iput-object p2, p0, Lorg/jdom2/input/SAXBuilder;->handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

    if-nez p3, :cond_2

    .line 344
    sget-object p3, Lorg/jdom2/input/SAXBuilder;->DEFAULTJDOMFAC:Lorg/jdom2/JDOMFactory;

    :cond_2
    iput-object p3, p0, Lorg/jdom2/input/SAXBuilder;->jdomfac:Lorg/jdom2/JDOMFactory;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 244
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->DTDVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    goto :goto_0

    :cond_0
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->NONVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lorg/jdom2/input/SAXBuilder;-><init>(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;Lorg/jdom2/input/sax/SAXHandlerFactory;Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method private getEngine()Lorg/jdom2/input/sax/SAXEngine;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 900
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    if-eqz v0, :cond_0

    return-object v0

    .line 904
    :cond_0
    invoke-virtual {p0}, Lorg/jdom2/input/SAXBuilder;->buildEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    .line 905
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-object v0
.end method

.method private internalSetFeature(Lorg/xml/sax/XMLReader;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 1020
    :try_start_0
    invoke-interface {p1, p2, p3}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lorg/xml/sax/SAXNotSupportedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 1025
    :catch_0
    new-instance p2, Lorg/jdom2/JDOMException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " feature not recognized for SAX driver "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1022
    :catch_1
    new-instance p2, Lorg/jdom2/JDOMException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " feature not supported for SAX driver "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private internalSetProperty(Lorg/xml/sax/XMLReader;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 1039
    :try_start_0
    invoke-interface {p1, p2, p3}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXNotSupportedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 1044
    :catch_0
    new-instance p2, Lorg/jdom2/JDOMException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " property not recognized for SAX driver "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 1041
    :catch_1
    new-instance p2, Lorg/jdom2/JDOMException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " property not supported for SAX driver "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public build(Ljava/io/File;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1116
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/io/File;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1118
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1119
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1118
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_1

    .line 1119
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Ljava/io/InputStream;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1091
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/io/InputStream;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1093
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1094
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1093
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_1

    .line 1094
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Ljava/io/InputStream;Ljava/lang/String;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1168
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/io/InputStream;Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1170
    iget-boolean p2, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez p2, :cond_0

    .line 1171
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1170
    iget-boolean p2, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez p2, :cond_1

    .line 1171
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Ljava/io/Reader;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1196
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/io/Reader;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1198
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1199
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1198
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_1

    .line 1199
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Ljava/io/Reader;Ljava/lang/String;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1227
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/io/Reader;Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1229
    iget-boolean p2, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez p2, :cond_0

    .line 1230
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1229
    iget-boolean p2, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez p2, :cond_1

    .line 1230
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Ljava/lang/String;)Lorg/jdom2/Document;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    .line 1266
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/lang/String;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1299
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1300
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 1280
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 1282
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-ge v3, v2, :cond_2

    const/16 v2, 0x3c

    .line 1285
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result p1

    if-ne v2, p1, :cond_2

    .line 1287
    new-instance p1, Ljava/net/MalformedURLException;

    const-string v2, "SAXBuilder.build(String) expects the String to be a systemID, but in this instance it appears to be actual XML data."

    invoke-direct {p1, v2}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    .line 1293
    invoke-virtual {p1, v1}, Ljava/net/MalformedURLException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1294
    throw p1

    .line 1297
    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1299
    :goto_1
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_3

    .line 1300
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_3
    throw p1

    .line 1262
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Unable to build a URI from a null systemID."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build(Ljava/net/URL;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1141
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Ljava/net/URL;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1143
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1144
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1143
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_1

    .line 1144
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public build(Lorg/xml/sax/InputSource;)Lorg/jdom2/Document;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1065
    :try_start_0
    invoke-direct {p0}, Lorg/jdom2/input/SAXBuilder;->getEngine()Lorg/jdom2/input/sax/SAXEngine;

    move-result-object v1

    invoke-interface {v1, p1}, Lorg/jdom2/input/sax/SAXEngine;->build(Lorg/xml/sax/InputSource;)Lorg/jdom2/Document;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1067
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_0

    .line 1068
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    .line 1067
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez v1, :cond_1

    .line 1068
    iput-object v0, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_1
    throw p1
.end method

.method public buildEngine()Lorg/jdom2/input/sax/SAXEngine;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 848
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

    iget-object v1, p0, Lorg/jdom2/input/SAXBuilder;->jdomfac:Lorg/jdom2/JDOMFactory;

    invoke-interface {v0, v1}, Lorg/jdom2/input/sax/SAXHandlerFactory;->createSAXHandler(Lorg/jdom2/JDOMFactory;)Lorg/jdom2/input/sax/SAXHandler;

    move-result-object v0

    .line 850
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    invoke-virtual {v0, v1}, Lorg/jdom2/input/sax/SAXHandler;->setExpandEntities(Z)V

    .line 851
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->ignoringWhite:Z

    invoke-virtual {v0, v1}, Lorg/jdom2/input/sax/SAXHandler;->setIgnoringElementContentWhitespace(Z)V

    .line 852
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->ignoringBoundaryWhite:Z

    invoke-virtual {v0, v1}, Lorg/jdom2/input/sax/SAXHandler;->setIgnoringBoundaryWhitespace(Z)V

    .line 854
    invoke-virtual {p0}, Lorg/jdom2/input/SAXBuilder;->createParser()Lorg/xml/sax/XMLReader;

    move-result-object v1

    .line 856
    invoke-virtual {p0, v1, v0}, Lorg/jdom2/input/SAXBuilder;->configureParser(Lorg/xml/sax/XMLReader;Lorg/jdom2/input/sax/SAXHandler;)V

    .line 857
    iget-object v2, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    invoke-interface {v2}, Lorg/jdom2/input/sax/XMLReaderJDOMFactory;->isValidating()Z

    move-result v2

    .line 859
    new-instance v3, Lorg/jdom2/input/sax/SAXBuilderEngine;

    invoke-direct {v3, v1, v0, v2}, Lorg/jdom2/input/sax/SAXBuilderEngine;-><init>(Lorg/xml/sax/XMLReader;Lorg/jdom2/input/sax/SAXHandler;Z)V

    return-object v3
.end method

.method protected configureParser(Lorg/xml/sax/XMLReader;Lorg/jdom2/input/sax/SAXHandler;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 931
    invoke-interface {p1, p2}, Lorg/xml/sax/XMLReader;->setContentHandler(Lorg/xml/sax/ContentHandler;)V

    .line 933
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxEntityResolver:Lorg/xml/sax/EntityResolver;

    if-eqz v0, :cond_0

    .line 934
    invoke-interface {p1, v0}, Lorg/xml/sax/XMLReader;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V

    .line 937
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxDTDHandler:Lorg/xml/sax/DTDHandler;

    if-eqz v0, :cond_1

    .line 938
    invoke-interface {p1, v0}, Lorg/xml/sax/XMLReader;->setDTDHandler(Lorg/xml/sax/DTDHandler;)V

    goto :goto_0

    .line 940
    :cond_1
    invoke-interface {p1, p2}, Lorg/xml/sax/XMLReader;->setDTDHandler(Lorg/xml/sax/DTDHandler;)V

    .line 943
    :goto_0
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxErrorHandler:Lorg/xml/sax/ErrorHandler;

    if-eqz v0, :cond_2

    .line 944
    invoke-interface {p1, v0}, Lorg/xml/sax/XMLReader;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    goto :goto_1

    .line 946
    :cond_2
    new-instance v0, Lorg/jdom2/input/sax/BuilderErrorHandler;

    invoke-direct {v0}, Lorg/jdom2/input/sax/BuilderErrorHandler;-><init>()V

    invoke-interface {p1, v0}, Lorg/xml/sax/XMLReader;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V

    :goto_1
    const/4 v0, 0x0

    :try_start_0
    const-string v1, "http://xml.org/sax/properties/lexical-handler"

    .line 952
    invoke-interface {p1, v1, p2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :catch_0
    if-nez v0, :cond_3

    :try_start_1
    const-string v0, "http://xml.org/sax/handlers/LexicalHandler"

    .line 964
    invoke-interface {p1, v0, p2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/xml/sax/SAXNotSupportedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 975
    :catch_1
    :cond_3
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->features:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 976
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, p1, v2, v3, v1}, Lorg/jdom2/input/SAXBuilder;->internalSetFeature(Lorg/xml/sax/XMLReader;Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_2

    .line 980
    :cond_4
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->properties:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 981
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, p1, v2, v3, v1}, Lorg/jdom2/input/SAXBuilder;->internalSetProperty(Lorg/xml/sax/XMLReader;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    :try_start_2
    const-string v0, "http://xml.org/sax/features/external-general-entities"

    .line 992
    invoke-interface {p1, v0}, Lorg/xml/sax/XMLReader;->getFeature(Ljava/lang/String;)Z

    move-result v0

    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    if-eq v0, v1, :cond_6

    const-string v0, "http://xml.org/sax/features/external-general-entities"

    .line 993
    iget-boolean v1, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    invoke-interface {p1, v0, v1}, Lorg/xml/sax/XMLReader;->setFeature(Ljava/lang/String;Z)V
    :try_end_2
    .catch Lorg/xml/sax/SAXException; {:try_start_2 .. :try_end_2} :catch_2

    .line 999
    :catch_2
    :cond_6
    iget-boolean v0, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    if-nez v0, :cond_7

    :try_start_3
    const-string v0, "http://xml.org/sax/properties/declaration-handler"

    .line 1001
    invoke-interface {p1, v0, p2}, Lorg/xml/sax/XMLReader;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/xml/sax/SAXNotSupportedException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/xml/sax/SAXNotRecognizedException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_7
    return-void
.end method

.method protected createParser()Lorg/xml/sax/XMLReader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 871
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    invoke-interface {v0}, Lorg/jdom2/input/sax/XMLReaderJDOMFactory;->createXMLReader()Lorg/xml/sax/XMLReader;

    move-result-object v0

    .line 874
    iget-object v1, p0, Lorg/jdom2/input/SAXBuilder;->saxXMLFilter:Lorg/xml/sax/XMLFilter;

    if-eqz v1, :cond_1

    .line 877
    :goto_0
    invoke-interface {v1}, Lorg/xml/sax/XMLFilter;->getParent()Lorg/xml/sax/XMLReader;

    move-result-object v2

    instance-of v2, v2, Lorg/xml/sax/XMLFilter;

    if-eqz v2, :cond_0

    .line 878
    invoke-interface {v1}, Lorg/xml/sax/XMLFilter;->getParent()Lorg/xml/sax/XMLReader;

    move-result-object v1

    check-cast v1, Lorg/xml/sax/XMLFilter;

    goto :goto_0

    .line 880
    :cond_0
    invoke-interface {v1, v0}, Lorg/xml/sax/XMLFilter;->setParent(Lorg/xml/sax/XMLReader;)V

    .line 883
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxXMLFilter:Lorg/xml/sax/XMLFilter;

    :cond_1
    return-object v0
.end method

.method public getDTDHandler()Lorg/xml/sax/DTDHandler;
    .locals 1

    .line 577
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxDTDHandler:Lorg/xml/sax/DTDHandler;

    return-object v0
.end method

.method public getDriverClass()Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 361
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    instance-of v1, v0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;

    if-eqz v1, :cond_0

    .line 362
    check-cast v0, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;

    invoke-virtual {v0}, Lorg/jdom2/input/sax/XMLReaderSAX2Factory;->getDriverClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getEntityResolver()Lorg/xml/sax/EntityResolver;
    .locals 1

    .line 555
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxEntityResolver:Lorg/xml/sax/EntityResolver;

    return-object v0
.end method

.method public getErrorHandler()Lorg/xml/sax/ErrorHandler;
    .locals 1

    .line 533
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxErrorHandler:Lorg/xml/sax/ErrorHandler;

    return-object v0
.end method

.method public getExpandEntities()Z
    .locals 1

    .line 693
    iget-boolean v0, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    return v0
.end method

.method public getFactory()Lorg/jdom2/JDOMFactory;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 375
    invoke-virtual {p0}, Lorg/jdom2/input/SAXBuilder;->getJDOMFactory()Lorg/jdom2/JDOMFactory;

    move-result-object v0

    return-object v0
.end method

.method public getIgnoringBoundaryWhitespace()Z
    .locals 1

    .line 660
    iget-boolean v0, p0, Lorg/jdom2/input/SAXBuilder;->ignoringBoundaryWhite:Z

    return v0
.end method

.method public getIgnoringElementContentWhitespace()Z
    .locals 1

    .line 631
    iget-boolean v0, p0, Lorg/jdom2/input/SAXBuilder;->ignoringWhite:Z

    return v0
.end method

.method public getJDOMFactory()Lorg/jdom2/JDOMFactory;
    .locals 1

    .line 385
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->jdomfac:Lorg/jdom2/JDOMFactory;

    return-object v0
.end method

.method public getReuseParser()Z
    .locals 1

    .line 732
    iget-boolean v0, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    return v0
.end method

.method public getSAXHandlerFactory()Lorg/jdom2/input/sax/SAXHandlerFactory;
    .locals 1

    .line 442
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

    return-object v0
.end method

.method public getValidation()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 465
    invoke-virtual {p0}, Lorg/jdom2/input/SAXBuilder;->isValidating()Z

    move-result v0

    return v0
.end method

.method public getXMLFilter()Lorg/xml/sax/XMLFilter;
    .locals 1

    .line 599
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->saxXMLFilter:Lorg/xml/sax/XMLFilter;

    return-object v0
.end method

.method public getXMLReaderFactory()Lorg/jdom2/input/sax/XMLReaderJDOMFactory;
    .locals 1

    .line 419
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    return-object v0
.end method

.method public isValidating()Z
    .locals 1

    .line 475
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    invoke-interface {v0}, Lorg/jdom2/input/sax/XMLReaderJDOMFactory;->isValidating()Z

    move-result v0

    return v0
.end method

.method public setDTDHandler(Lorg/xml/sax/DTDHandler;)V
    .locals 0

    .line 589
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->saxDTDHandler:Lorg/xml/sax/DTDHandler;

    const/4 p1, 0x0

    .line 590
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setEntityResolver(Lorg/xml/sax/EntityResolver;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->saxEntityResolver:Lorg/xml/sax/EntityResolver;

    const/4 p1, 0x0

    .line 566
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setErrorHandler(Lorg/xml/sax/ErrorHandler;)V
    .locals 0

    .line 544
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->saxErrorHandler:Lorg/xml/sax/ErrorHandler;

    const/4 p1, 0x0

    .line 545
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setExpandEntities(Z)V
    .locals 0

    .line 720
    iput-boolean p1, p0, Lorg/jdom2/input/SAXBuilder;->expand:Z

    const/4 p1, 0x0

    .line 721
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 398
    invoke-virtual {p0, p1}, Lorg/jdom2/input/SAXBuilder;->setJDOMFactory(Lorg/jdom2/JDOMFactory;)V

    return-void
.end method

.method public setFastReconfigure(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setFeature(Ljava/lang/String;Z)V
    .locals 1

    .line 799
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->features:Ljava/util/HashMap;

    if-eqz p2, :cond_0

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 800
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setIgnoringBoundaryWhitespace(Z)V
    .locals 0

    .line 681
    iput-boolean p1, p0, Lorg/jdom2/input/SAXBuilder;->ignoringBoundaryWhite:Z

    const/4 p1, 0x0

    .line 682
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setIgnoringElementContentWhitespace(Z)V
    .locals 0

    .line 646
    iput-boolean p1, p0, Lorg/jdom2/input/SAXBuilder;->ignoringWhite:Z

    const/4 p1, 0x0

    .line 647
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setJDOMFactory(Lorg/jdom2/JDOMFactory;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->jdomfac:Lorg/jdom2/JDOMFactory;

    const/4 p1, 0x0

    .line 410
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 826
    iget-object v0, p0, Lorg/jdom2/input/SAXBuilder;->properties:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 827
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setReuseParser(Z)V
    .locals 0

    .line 749
    iput-boolean p1, p0, Lorg/jdom2/input/SAXBuilder;->reuseParser:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 751
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    :cond_0
    return-void
.end method

.method public setSAXHandlerFactory(Lorg/jdom2/input/sax/SAXHandlerFactory;)V
    .locals 0

    if-nez p1, :cond_0

    .line 453
    sget-object p1, Lorg/jdom2/input/SAXBuilder;->DEFAULTSAXHANDLERFAC:Lorg/jdom2/input/sax/SAXHandlerFactory;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->handlerfac:Lorg/jdom2/input/sax/SAXHandlerFactory;

    const/4 p1, 0x0

    .line 454
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setValidation(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 515
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->DTDVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    goto :goto_0

    :cond_0
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->NONVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    :goto_0
    invoke-virtual {p0, p1}, Lorg/jdom2/input/SAXBuilder;->setXMLReaderFactory(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;)V

    return-void
.end method

.method public setXMLFilter(Lorg/xml/sax/XMLFilter;)V
    .locals 0

    .line 618
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->saxXMLFilter:Lorg/xml/sax/XMLFilter;

    const/4 p1, 0x0

    .line 619
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method

.method public setXMLReaderFactory(Lorg/jdom2/input/sax/XMLReaderJDOMFactory;)V
    .locals 0

    if-nez p1, :cond_0

    .line 430
    sget-object p1, Lorg/jdom2/input/sax/XMLReaders;->NONVALIDATING:Lorg/jdom2/input/sax/XMLReaders;

    :cond_0
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->readerfac:Lorg/jdom2/input/sax/XMLReaderJDOMFactory;

    const/4 p1, 0x0

    .line 433
    iput-object p1, p0, Lorg/jdom2/input/SAXBuilder;->engine:Lorg/jdom2/input/sax/SAXEngine;

    return-void
.end method
