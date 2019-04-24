.class interface abstract Lorg/jdom2/input/sax/XMLReaders$FactorySupplier;
.super Ljava/lang/Object;
.source "XMLReaders.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/input/sax/XMLReaders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "FactorySupplier"
.end annotation


# virtual methods
.method public abstract supply()Ljavax/xml/parsers/SAXParserFactory;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract validates()Z
.end method
