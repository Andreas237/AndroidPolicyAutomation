.class final enum Lorg/jdom2/input/sax/XMLReaders$NONSingleton;
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
    name = "NONSingleton"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jdom2/input/sax/XMLReaders$NONSingleton;",
        ">;",
        "Lorg/jdom2/input/sax/XMLReaders$FactorySupplier;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

.field public static final enum INSTANCE:Lorg/jdom2/input/sax/XMLReaders$NONSingleton;


# instance fields
.field private final factory:Ljavax/xml/parsers/SAXParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 104
    new-instance v0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    const/4 v0, 0x1

    .line 103
    new-array v0, v0, [Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    sget-object v1, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->INSTANCE:Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    aput-object v1, v0, v2

    sput-object v0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 108
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 109
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object p1

    const/4 p2, 0x1

    .line 111
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setNamespaceAware(Z)V

    const/4 p2, 0x0

    .line 112
    invoke-virtual {p1, p2}, Ljavax/xml/parsers/SAXParserFactory;->setValidating(Z)V

    .line 113
    iput-object p1, p0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jdom2/input/sax/XMLReaders$NONSingleton;
    .locals 1

    .line 103
    const-class v0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    return-object p0
.end method

.method public static values()[Lorg/jdom2/input/sax/XMLReaders$NONSingleton;
    .locals 1

    .line 103
    sget-object v0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->$VALUES:[Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

    invoke-virtual {v0}, [Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jdom2/input/sax/XMLReaders$NONSingleton;

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

    .line 118
    iget-object v0, p0, Lorg/jdom2/input/sax/XMLReaders$NONSingleton;->factory:Ljavax/xml/parsers/SAXParserFactory;

    return-object v0
.end method

.method public validates()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
