.class final enum Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;
.super Ljava/lang/Enum;
.source "XMLReaders.java"

# interfaces
.implements Lorg/jdom2/input/sax/XMLReaders$FactorySupplier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/input/sax/XMLReaders;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "XSDSingleton"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;",
        ">;",
        "Lorg/jdom2/input/sax/XMLReaders$FactorySupplier;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

.field public static final enum INSTANCE:Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;


# instance fields
.field private final factory:Ljavax/xml/parsers/SAXParserFactory;

.field private final failcause:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 155
    new-instance v0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    const/4 v0, 0x1

    .line 154
    new-array v0, v0, [Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    sget-object v1, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    aput-object v1, v0, v2

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 160
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 162
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    const/4 p2, 0x1

    .line 165
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    const/4 p2, 0x0

    .line 168
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    const/4 p2, 0x0

    :try_start_0
    const-string v0, "http://www.w3.org/2001/XMLSchema"

    .line 171
    invoke-static {v0}, Ljavax/xml/validation/SchemaFactory;->newInstance(Ljava/lang/String;)Ljavax/xml/validation/SchemaFactory;

    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljavax/xml/validation/SchemaFactory;->newSchema()Ljavax/xml/validation/Schema;

    move-result-object v0

    .line 173
    invoke-virtual {p1, v0}, Ljavax/xml/parsers/SAXParserFactory;->setSchema(Ljavax/xml/validation/Schema;)V
    :try_end_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p2

    move-object p2, p1

    move-object p1, v1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 195
    :goto_0
    iput-object p2, p0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    .line 196
    iput-object p1, p0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->failcause:Ljava/lang/Exception;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;
    .locals 1

    .line 154
    const-class v0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    return-object p0
.end method

.method public static values()[Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;
    .locals 1

    .line 154
    sget-object v0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    invoke-virtual {v0}, [Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;

    return-object v0
.end method


# virtual methods
.method public supply()Ljavax/xml/parsers/SAXParserFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    if-eqz v0, :cond_0

    return-object v0

    .line 203
    :cond_0
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaders$XSDSingleton;->failcause:Ljava/lang/Exception;

    throw v0
.end method

.method public validates()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
