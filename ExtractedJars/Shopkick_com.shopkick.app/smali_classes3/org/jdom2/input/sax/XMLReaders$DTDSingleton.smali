.class final enum Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;
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
    name = "DTDSingleton"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;",
        ">;",
        "Lorg/jdom2/input/sax/XMLReaders$FactorySupplier;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

.field public static final enum INSTANCE:Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;


# instance fields
.field private final factory:Ljavax/xml/parsers/SAXParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 129
    new-instance v0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    const/4 v0, 0x1

    .line 128
    new-array v0, v0, [Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    sget-object v1, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    aput-object v1, v0, v2

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 133
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 134
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    const/4 p2, 0x1

    .line 136
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    .line 138
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    .line 139
    iput-object p1, p0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;
    .locals 1

    .line 128
    const-class v0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    return-object p0
.end method

.method public static values()[Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;
    .locals 1

    .line 128
    sget-object v0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

    invoke-virtual {v0}, [Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;

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

    .line 144
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaders$DTDSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    return-object v0
.end method

.method public validates()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
