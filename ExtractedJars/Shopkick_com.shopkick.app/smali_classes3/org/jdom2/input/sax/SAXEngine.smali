.class public interface abstract Lorg/jdom2/input/sax/SAXEngine;
.super Ljava/lang/Object;
.source "SAXEngine.java"


# virtual methods
.method public abstract build(Ljava/io/File;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/io/InputStream;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/io/InputStream;Ljava/lang/String;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/io/Reader;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/io/Reader;Ljava/lang/String;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/lang/String;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Ljava/net/URL;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract build(Lorg/xml/sax/InputSource;)Lorg/jdom2/Document;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getDTDHandler()Lorg/xml/sax/DTDHandler;
.end method

.method public abstract getEntityResolver()Lorg/xml/sax/EntityResolver;
.end method

.method public abstract getErrorHandler()Lorg/xml/sax/ErrorHandler;
.end method

.method public abstract getExpandEntities()Z
.end method

.method public abstract getIgnoringBoundaryWhitespace()Z
.end method

.method public abstract getIgnoringElementContentWhitespace()Z
.end method

.method public abstract getJDOMFactory()Lorg/jdom2/JDOMFactory;
.end method

.method public abstract isValidating()Z
.end method
