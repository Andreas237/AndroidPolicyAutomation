.class public Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;
.super Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lorg/jivesoftware/smack/packet/StandardExtensionElement;>;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final INSTANCE:Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->$assertionsDisabled:Z

    .line 39
    new-instance v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;

    invoke-direct {v0}, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->INSTANCE:Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 37
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    move-result-object v0

    return-object v0
.end method

.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/StandardExtensionElement;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 47
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v3

    .line 48
    invoke-static {v2, v3}, Lorg/jivesoftware/smack/packet/StandardExtensionElement;->builder(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    move-result-object v4

    .line 49
    invoke-interface {p1, p2}, Lorg/xmlpull/v1/XmlPullParser;->getNamespaceCount(I)I

    move-result v5

    .line 50
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v6

    .line 51
    new-instance v7, Ljava/util/LinkedHashMap;

    add-int v0, v5, v6

    invoke-direct {v7, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 52
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_2

    .line 53
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getNamespacePrefix(I)Ljava/lang/String;

    move-result-object v9

    .line 54
    if-nez v9, :cond_0

    .line 56
    goto :goto_1

    .line 59
    :cond_0
    sget-boolean v0, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-static {v9}, Lorg/jivesoftware/smack/util/StringUtils;->isNotEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 60
    :cond_1
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getNamespaceUri(I)Ljava/lang/String;

    move-result-object v10

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "xmlns:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 63
    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_4

    .line 64
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v9

    .line 65
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v10

    .line 66
    invoke-interface {p1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v11

    .line 68
    invoke-static {v9}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    move-object v12, v10

    goto :goto_3

    .line 72
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 74
    :goto_3
    invoke-interface {v7, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {v4, v7}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->addAttributes(Ljava/util/Map;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    .line 79
    :goto_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    .line 80
    packed-switch v8, :pswitch_data_0

    goto :goto_5

    .line 82
    :pswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lorg/jivesoftware/smack/parsing/StandardExtensionElementProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->addElement(Lorg/jivesoftware/smack/packet/StandardExtensionElement;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    .line 83
    goto :goto_5

    .line 85
    :pswitch_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->setText(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;

    .line 86
    goto :goto_5

    .line 88
    :pswitch_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne p2, v0, :cond_5

    .line 89
    goto :goto_6

    .line 93
    :cond_5
    :goto_5
    goto :goto_4

    .line 95
    :goto_6
    invoke-static {p1}, Lorg/jivesoftware/smack/util/ParserUtils;->assertAtEndTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 96
    invoke-virtual {v4}, Lorg/jivesoftware/smack/packet/StandardExtensionElement$Builder;->build()Lorg/jivesoftware/smack/packet/StandardExtensionElement;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
