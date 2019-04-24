.class public Lo/evr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/evn;>;"
        }
    .end annotation

    .line 30
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xml \u5f00\u59cb\u89e3\u6790"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 32
    new-instance v5, Lo/evq;

    invoke-direct {v5}, Lo/evq;-><init>()V

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 37
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    .line 38
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "utf-8"

    invoke-direct {v0, v6, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v7, v0

    .line 39
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v8, v0

    .line 40
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    :goto_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->read()I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 43
    int-to-char v0, v10

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v11

    .line 47
    new-instance v0, Ljava/io/StringReader;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 50
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    .line 51
    :goto_1
    const/4 v0, 0x1

    if-eq v12, v0, :cond_3

    .line 52
    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_2

    .line 54
    :sswitch_0
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "basic_package"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->b(Ljava/lang/String;)V

    .line 57
    const/4 v0, 0x1

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->e(Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x2

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->a(Ljava/lang/String;)V

    .line 59
    const/4 v0, 0x3

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeType(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->d(Ljava/lang/String;)V

    .line 60
    const/4 v0, 0x4

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->c(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x5

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/evq;->b(I)V

    .line 62
    const/4 v0, 0x6

    invoke-interface {v11, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/evq;->k(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 64
    :cond_1
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    new-instance v13, Lo/evn;

    invoke-direct {v13}, Lo/evn;-><init>()V

    .line 67
    const-string v0, ""

    const-string v1, "content"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/evn;->e(Ljava/lang/String;)V

    .line 68
    const-string v0, ""

    const-string v1, "id"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/evn;->b(Ljava/lang/String;)V

    .line 69
    const-string v0, ""

    const-string v1, "url"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/evn;->d(Ljava/lang/String;)V

    .line 70
    const-string v0, ""

    const-string v1, "size"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v13, v0, v1}, Lo/evn;->b(J)V

    .line 71
    const-string v0, ""

    const-string v1, "md5"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/evn;->c(Ljava/lang/String;)V

    .line 73
    const-string v0, ""

    const-string v1, "name"

    invoke-interface {v11, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/evn;->a(Ljava/lang/String;)V

    .line 75
    invoke-interface {v4, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 81
    :cond_2
    :goto_2
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v12

    goto/16 :goto_1

    .line 89
    :cond_3
    if-eqz v6, :cond_4

    .line 90
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 92
    :cond_4
    if-eqz v7, :cond_5

    .line 93
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 95
    :cond_5
    if-eqz v8, :cond_6

    .line 96
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    :cond_6
    goto/16 :goto_4

    .line 98
    :catch_0
    move-exception v9

    .line 99
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    goto/16 :goto_4

    .line 83
    :catch_1
    move-exception v9

    .line 84
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml XmlPullParserException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    if-eqz v6, :cond_7

    .line 90
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 92
    :cond_7
    if-eqz v7, :cond_8

    .line 93
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 95
    :cond_8
    if-eqz v8, :cond_9

    .line 96
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 100
    :cond_9
    goto/16 :goto_4

    .line 98
    :catch_2
    move-exception v9

    .line 99
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    goto/16 :goto_4

    .line 85
    :catch_3
    move-exception v9

    .line 86
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml Exception : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 89
    if-eqz v6, :cond_a

    .line 90
    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 92
    :cond_a
    if-eqz v7, :cond_b

    .line 93
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 95
    :cond_b
    if-eqz v8, :cond_c

    .line 96
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 100
    :cond_c
    goto :goto_4

    .line 98
    :catch_4
    move-exception v9

    .line 99
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    goto :goto_4

    .line 88
    :catchall_0
    move-exception v14

    .line 89
    if-eqz v6, :cond_d

    .line 90
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 92
    :cond_d
    if-eqz v7, :cond_e

    .line 93
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V

    .line 95
    :cond_e
    if-eqz v8, :cond_f

    .line 96
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 100
    :cond_f
    goto :goto_3

    .line 98
    :catch_5
    move-exception v15

    .line 99
    const-string v0, "ParserHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseXml IOException : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    :goto_3
    throw v14

    .line 103
    :goto_4
    const-string v0, "ParserHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xml \u7ed3\u675f\u89e3\u6790"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
