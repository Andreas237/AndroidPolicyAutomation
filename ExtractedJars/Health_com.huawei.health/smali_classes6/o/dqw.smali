.class public Lo/dqw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Landroid/telephony/TelephonyManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/dqw;->d:Landroid/telephony/TelephonyManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Lo/dqp;
    .locals 7

    .line 60
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 61
    const-string v0, "CarrierConfigResolveXml"

    const-string v1, "Get carrier config info from XML failed, context is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 66
    invoke-static {p0}, Lo/dqw;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 68
    :cond_1
    move-object v3, p1

    .line 70
    :goto_0
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    const-string v0, "CarrierConfigResolveXml"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CarrierConfigInfo resolveXML simoperator:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    :cond_2
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 75
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v4

    .line 76
    invoke-virtual {v4}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 77
    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "carrier_config_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ".xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    .line 78
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 81
    :cond_3
    invoke-static {v5}, Lo/dqw;->e(Lorg/xmlpull/v1/XmlPullParser;)Lo/dqp;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 82
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "CarrierConfigResolveXml"

    const-string v1, "Get carrier config info from XML failed, an exception occured, maybe the card is not support multi-sim"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_4
    const-string v0, "CarrierConfigResolveXml"

    const-string v1, "SimOperator is empty , card is missing or the context is null..."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 42
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 43
    sget-object v0, Lo/dqw;->d:Landroid/telephony/TelephonyManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 44
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    sput-object v0, Lo/dqw;->d:Landroid/telephony/TelephonyManager;

    .line 46
    :cond_0
    sget-object v0, Lo/dqw;->d:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_1

    .line 47
    const-string v0, "CarrierConfigResolveXml"

    const-string v1, "SimState is ready."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    sget-object v0, Lo/dqw;->d:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Lorg/xmlpull/v1/XmlPullParser;)Lo/dqp;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 97
    const/4 v0, 0x0

    if-eq v0, p0, :cond_a

    .line 98
    new-instance v2, Lo/dqp;

    invoke-direct {v2}, Lo/dqp;-><init>()V

    .line 99
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 100
    :goto_0
    const/4 v0, 0x1

    if-eq v3, v0, :cond_9

    .line 101
    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_1

    .line 103
    :sswitch_0
    goto/16 :goto_1

    .line 105
    :sswitch_1
    const-string v0, "carrier_config"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    goto/16 :goto_1

    .line 107
    :cond_0
    const-string v0, "BindDevicesAndCardState"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->f(Ljava/lang/String;)V

    .line 109
    goto/16 :goto_1

    .line 110
    :cond_1
    const-string v0, "SignTimes"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->h(Ljava/lang/String;)V

    .line 112
    goto/16 :goto_1

    .line 113
    :cond_2
    const-string v0, "CDMURL"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->c(Ljava/lang/String;)V

    .line 115
    goto/16 :goto_1

    .line 116
    :cond_3
    const-string v0, "ESURL"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->e(Ljava/lang/String;)V

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    const-string v0, "BSFURL"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 120
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->b(Ljava/lang/String;)V

    .line 121
    goto :goto_1

    .line 122
    :cond_5
    const-string v0, "DeleteProfile"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 123
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->g(Ljava/lang/String;)V

    .line 124
    goto :goto_1

    .line 125
    :cond_6
    const-string v0, "AuthenType"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 126
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->d(Ljava/lang/String;)V

    .line 127
    goto :goto_1

    .line 128
    :cond_7
    const-string v0, "SMDPURL"

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 129
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/dqp;->a(Ljava/lang/String;)V

    .line 130
    .line 137
    :cond_8
    :goto_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto/16 :goto_0

    .line 139
    :cond_9
    return-object v2

    .line 141
    :cond_a
    const-string v0, "CarrierConfigResolveXml"

    const-string v1, "parser or config message is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
