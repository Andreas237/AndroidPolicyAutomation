.class public Lo/dpv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpv$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Lo/dpv$b;
    .locals 10

    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildChangeLogXML begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v6, 0x0

    .line 131
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v6

    .line 132
    invoke-virtual {v6}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v7

    .line 133
    if-nez v7, :cond_0

    .line 134
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parser exception,pullParser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    const/4 v0, 0x0

    return-object v0

    .line 137
    :cond_0
    const-string v0, "UTF-8"

    :try_start_1
    invoke-interface {v7, p1, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 138
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    .line 139
    invoke-static {v7, v5, p2, v8}, Lo/dpv;->c(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b;Ljava/lang/String;I)Lo/dpy$c;

    move-result-object v9

    .line 140
    iget-object v0, v9, Lo/dpy$c;->e:Lo/dpv$b;

    move-object v5, v0

    .line 141
    iget-boolean v0, v9, Lo/dpy$c;->b:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v4, v0

    .line 144
    goto :goto_0

    .line 142
    :catch_0
    move-exception v7

    .line 143
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildChangeLogXML, Exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    :goto_0
    if-nez v4, :cond_1

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_1
    return-object v5
.end method

.method private static c(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b;Ljava/lang/String;I)Lo/dpy$c;
    .locals 17

    .line 152
    new-instance v7, Lo/dpy$c;

    invoke-direct {v7}, Lo/dpy$c;-><init>()V

    .line 153
    move-object/from16 v0, p1

    iput-object v0, v7, Lo/dpy$c;->e:Lo/dpv$b;

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, v7, Lo/dpy$c;->b:Z

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v10, -0x1

    .line 158
    const/4 v11, 0x0

    .line 159
    const/4 v12, 0x0

    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const-string v15, ""

    .line 164
    :goto_0
    move/from16 v0, p3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    .line 165
    :try_start_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v16

    .line 166
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "eventType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", nodeName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    sparse-switch p3, :sswitch_data_0

    goto/16 :goto_1

    .line 169
    :sswitch_0
    const-string v0, "cleardata-flag"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 171
    const-string v0, "true"

    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    .line 172
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cleardata-flag start,cleardata-flag="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 173
    :cond_0
    const-string v0, "default-language"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default-language"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-static/range {p0 .. p0}, Lo/dpy;->d(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v8

    .line 176
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 177
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "default-language,defaultLanguageCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 178
    :cond_1
    const-string v0, "language"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "language"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v11, v1}, Lo/dpy;->b(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b$d;Lo/dpv$b;)Lo/dpv$b$d;

    move-result-object v11

    goto/16 :goto_1

    .line 181
    :cond_2
    const-string v0, "features"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 182
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 183
    const-string v15, ""

    .line 184
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v11, v13, v1}, Lo/dpy;->e(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b$d;Lo/dpv$b$c;Lo/dpv$b;)Lo/dpv$b$c;

    move-result-object v13

    goto :goto_1

    .line 185
    :cond_3
    const-string v0, "feature"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    move-object/from16 v0, p0

    invoke-static {v11, v15, v0}, Lo/dpy;->b(Lo/dpv$b$d;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    .line 188
    :cond_4
    move-object/from16 v0, v16

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/dpy;->b(Ljava/lang/String;Lo/dpv$b;)Lo/dpv$b;

    move-result-object v0

    move-object/from16 p1, v0

    .line 190
    goto :goto_1

    .line 192
    :sswitch_1
    const-string v0, "root"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 193
    move-object/from16 v0, p1

    invoke-static {v0, v12}, Lo/dpy;->d(Lo/dpv$b;Ljava/util/List;)Lo/dpv$b;

    move-result-object v0

    move-object/from16 p1, v0

    .line 194
    const/4 v0, 0x1

    iput-boolean v0, v7, Lo/dpy$c;->b:Z

    goto :goto_1

    .line 195
    :cond_5
    const-string v0, "language"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 196
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move-object v2, v8

    move v3, v10

    move-object v4, v11

    move-object v5, v12

    invoke-static/range {v0 .. v5}, Lo/dpy;->c(Ljava/lang/String;Lo/dpv$b;Ljava/lang/String;ILo/dpv$b$d;Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    goto :goto_1

    .line 198
    :cond_6
    move-object/from16 v0, p1

    move v1, v9

    move-object/from16 v2, v16

    move-object v3, v11

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Lo/dpy;->e(Lo/dpv$b;ZLjava/lang/String;Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v0

    move-object/from16 p1, v0

    .line 200
    .line 204
    :goto_1
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result p3

    .line 205
    goto/16 :goto_0

    .line 208
    :cond_7
    goto :goto_2

    .line 206
    :catch_0
    move-exception v16

    .line 207
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildChangeLogXML, Exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :goto_2
    move-object/from16 v0, p1

    iput-object v0, v7, Lo/dpy$c;->e:Lo/dpv$b;

    .line 210
    return-object v7

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private static d(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpGet;Ljava/io/OutputStream;)I
    .locals 7

    .line 108
    const/4 v4, -0x1

    .line 109
    const/4 v5, 0x0

    .line 112
    :try_start_0
    invoke-interface {p0, p1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v5

    .line 113
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    move v4, v0

    .line 114
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getXMLStreamFormServerExecute statusCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    if-eqz p2, :cond_0

    .line 116
    invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0, p2}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :cond_0
    goto :goto_0

    .line 118
    :catch_0
    move-exception v6

    .line 119
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return v4

    .line 122
    :goto_0
    return v4
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Ljava/io/OutputStream;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 92
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 93
    new-instance v5, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 94
    const/4 v6, -0x1

    .line 95
    invoke-static {v5, v4, p0}, Lo/dpm;->e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;Landroid/content/Context;)V

    .line 96
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v7

    .line 97
    const-string v0, "http.socket.timeout"

    const/16 v1, 0x4e20

    invoke-interface {v7, v0, v1}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 98
    const-string v0, "http.connection.timeout"

    const/16 v1, 0x4e20

    invoke-interface {v7, v0, v1}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 99
    invoke-static {}, Lo/dpm;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 100
    invoke-static {v4, v5, p2}, Lo/dpv;->d(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpGet;Ljava/io/OutputStream;)I

    move-result v6

    .line 101
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getXMLStreamFormServer statusCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v5}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 103
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getXMLStreamFormServer abort"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return v6
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/dpv$b;
    .locals 16

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, -0x1

    .line 59
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serverUri = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", languageName"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v5, v0

    .line 62
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v5}, Lo/dpv;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/OutputStream;)I

    move-result v0

    move v6, v0

    .line 63
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "statusCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 68
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_2

    .line 69
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 70
    const/4 v8, 0x0

    .line 71
    :goto_0
    array-length v0, v7

    if-ge v8, v0, :cond_1

    .line 72
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_0

    .line 73
    goto :goto_1

    .line 71
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 76
    :cond_1
    :goto_1
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 77
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 79
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v10, v1}, Lo/dpv;->b(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 82
    :cond_2
    :try_start_1
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    goto/16 :goto_7

    .line 83
    :catch_0
    move-exception v7

    .line 84
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeLogFromServer IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    goto/16 :goto_7

    .line 64
    :catch_1
    move-exception v7

    .line 65
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    const/4 v0, 0x0

    if-eq v0, v5, :cond_a

    .line 68
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_5

    .line 69
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 70
    const/4 v8, 0x0

    .line 71
    :goto_2
    array-length v0, v7

    if-ge v8, v0, :cond_4

    .line 72
    aget-byte v0, v7, v8

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_3

    .line 73
    goto :goto_3

    .line 71
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 76
    :cond_4
    :goto_3
    array-length v0, v7

    sub-int/2addr v0, v8

    new-array v9, v0, [B

    .line 77
    array-length v0, v7

    sub-int/2addr v0, v8

    const/4 v1, 0x0

    invoke-static {v7, v8, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 79
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v10, v1}, Lo/dpv;->b(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 82
    :cond_5
    :try_start_3
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 85
    goto/16 :goto_7

    .line 83
    :catch_2
    move-exception v7

    .line 84
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeLogFromServer IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    goto/16 :goto_7

    .line 67
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 68
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_8

    .line 69
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    .line 70
    const/4 v13, 0x0

    .line 71
    :goto_4
    array-length v0, v12

    if-ge v13, v0, :cond_7

    .line 72
    aget-byte v0, v12, v13

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_6

    .line 73
    goto :goto_5

    .line 71
    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 76
    :cond_7
    :goto_5
    array-length v0, v12

    sub-int/2addr v0, v13

    new-array v14, v0, [B

    .line 77
    array-length v0, v12

    sub-int/2addr v0, v13

    const/4 v1, 0x0

    invoke-static {v12, v13, v14, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    new-instance v0, Ljava/io/ByteArrayInputStream;

    move-object v1, v14

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v15, v0

    .line 79
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v15, v1}, Lo/dpv;->b(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 82
    :cond_8
    :try_start_4
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 85
    goto :goto_6

    .line 83
    :catch_3
    move-exception v12

    .line 84
    const-string v0, "AppPullChangeLogGetXml"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChangeLogFromServer IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    :cond_9
    :goto_6
    throw v11

    .line 88
    :cond_a
    :goto_7
    return-object v4
.end method
