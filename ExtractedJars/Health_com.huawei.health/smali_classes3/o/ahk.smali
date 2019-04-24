.class public Lo/ahk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljavax/xml/parsers/DocumentBuilderFactory;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/parsers/ParserConfigurationException;
        }
    .end annotation

    .line 20
    const-string v0, "http://xml.org/sax/features/external-general-entities"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->setFeature(Ljava/lang/String;Z)V

    .line 22
    const-string v0, "http://xml.org/sax/features/external-parameter-entities"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->setFeature(Ljava/lang/String;Z)V

    .line 24
    const-string v0, "http://javax.xml.XMLConstants/feature/secure-processing"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->setFeature(Ljava/lang/String;Z)V

    .line 25
    return-void
.end method
