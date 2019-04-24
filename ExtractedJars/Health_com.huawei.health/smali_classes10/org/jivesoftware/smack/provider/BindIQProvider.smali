.class public Lorg/jivesoftware/smack/provider/BindIQProvider;
.super Lorg/jivesoftware/smack/provider/IQProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/IQProvider<Lorg/jivesoftware/smack/packet/Bind;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/IQProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Bind;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 35
    const/4 v2, 0x0

    .line 37
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 38
    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_3

    .line 40
    :sswitch_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    .line 41
    move-object v4, v1

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v0, "resource"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    :sswitch_2
    const-string v0, "jid"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    :cond_0
    :goto_1
    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    .line 43
    :sswitch_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 44
    invoke-static {v6}, Lo/ftp;->b(Ljava/lang/String;)Lo/ftp;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/Bind;->newSet(Lo/ftp;)Lorg/jivesoftware/smack/packet/Bind;

    move-result-object v2

    .line 45
    goto :goto_2

    .line 47
    :sswitch_4
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ftj;->a(Ljava/lang/String;)Lo/fti;

    move-result-object v7

    .line 48
    invoke-static {v7}, Lorg/jivesoftware/smack/packet/Bind;->newResult(Lo/fti;)Lorg/jivesoftware/smack/packet/Bind;

    move-result-object v2

    .line 51
    :goto_2
    goto :goto_3

    .line 53
    :sswitch_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, p2, :cond_1

    .line 54
    goto :goto_4

    .line 58
    :cond_1
    :goto_3
    goto/16 :goto_0

    .line 59
    :goto_4
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x14543bf2 -> :sswitch_1
        0x19b05 -> :sswitch_2
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_3
        0x1 -> :sswitch_4
    .end sparse-switch
.end method

.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 29
    invoke-virtual {p0, p1, p2}, Lorg/jivesoftware/smack/provider/BindIQProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Bind;

    move-result-object v0

    return-object v0
.end method
