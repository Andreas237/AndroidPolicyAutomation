.class public Lcom/huawei/hwid/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 167
    const/4 v2, 0x0

    .line 169
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 170
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, " sdk filepath not exist"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    nop

    .line 173
    .line 195
    .line 196
    .line 197
    .line 198
    return-object v5

    .line 175
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 176
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 177
    const/4 v0, 0x0

    invoke-interface {v5, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 178
    invoke-static {v5, p1, p2}, Lcom/huawei/hwid/b/a/b;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/Context;Z)Ljava/util/ArrayList;
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v6

    .line 193
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 195
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 198
    goto :goto_0

    .line 196
    :catch_0
    move-exception v7

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :cond_1
    :goto_0
    return-object v6

    .line 180
    :catch_1
    move-exception v3

    .line 181
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "XmlPullParserException read xml failed!"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 195
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 198
    goto :goto_1

    .line 196
    :catch_2
    move-exception v5

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :cond_2
    :goto_1
    return-object v4

    .line 183
    :catch_3
    move-exception v3

    .line 184
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "FileNotFoundException read xml failed!"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 193
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 195
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 198
    goto :goto_2

    .line 196
    :catch_4
    move-exception v5

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :cond_3
    :goto_2
    return-object v4

    .line 186
    :catch_5
    move-exception v3

    .line 187
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException read xml failed!"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 193
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 195
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 198
    goto :goto_3

    .line 196
    :catch_6
    move-exception v5

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_4
    :goto_3
    return-object v4

    .line 189
    :catch_7
    move-exception v3

    .line 190
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "Exception read xml failed!"

    :try_start_9
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 193
    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 195
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 198
    goto :goto_4

    .line 196
    :catch_8
    move-exception v5

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_5
    :goto_4
    return-object v4

    .line 193
    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    .line 195
    :try_start_b
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9

    .line 198
    goto :goto_5

    .line 196
    :catch_9
    move-exception v9

    .line 197
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    :cond_6
    :goto_5
    throw v8
.end method

.method private static a(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/Context;Z)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/Context;Z)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 204
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "sdkaccount xml parseAccountsFromXml Start"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    .line 206
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 207
    new-instance v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    .line 208
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v2, :cond_16

    .line 209
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 210
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 213
    :pswitch_0
    goto/16 :goto_1

    .line 215
    :pswitch_1
    const-string v0, "account"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 216
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "parseAccountsFromXml add account"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    new-instance v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    goto/16 :goto_1

    .line 222
    :pswitch_2
    const-string v0, "account"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    const-string v0, ""

    const-string v1, "appId"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 225
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "sdk authTokenType is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 229
    :cond_0
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Ljava/lang/String;)V

    .line 230
    goto/16 :goto_1

    :cond_1
    const-string v0, "accountName"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 231
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 232
    if-eqz p2, :cond_2

    .line 233
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 235
    :cond_2
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->b(Ljava/lang/String;)V

    .line 236
    goto/16 :goto_1

    :cond_3
    const-string v0, "userId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 237
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 238
    if-eqz p2, :cond_4

    .line 239
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 241
    :cond_4
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->d(Ljava/lang/String;)V

    .line 242
    goto/16 :goto_1

    :cond_5
    const-string v0, "deviceId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 243
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 244
    if-eqz p2, :cond_6

    .line 245
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 247
    :cond_6
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->h(Ljava/lang/String;)V

    .line 248
    goto/16 :goto_1

    :cond_7
    const-string v0, "subDeviceId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 249
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 250
    if-eqz p2, :cond_8

    .line 251
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 253
    :cond_8
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->i(Ljava/lang/String;)V

    .line 254
    goto/16 :goto_1

    :cond_9
    const-string v0, "deviceType"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 255
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 256
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->j(Ljava/lang/String;)V

    .line 257
    goto/16 :goto_1

    :cond_a
    const-string v0, "serviceToken"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 258
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 259
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->f(Ljava/lang/String;)V

    .line 260
    goto/16 :goto_1

    :cond_b
    const-string v0, "siteId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 262
    :try_start_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 263
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 268
    goto/16 :goto_1

    .line 264
    :catch_0
    move-exception v6

    .line 265
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "NumberFormatException: read accounts.xml parseInt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    goto/16 :goto_1

    .line 266
    :catch_1
    move-exception v6

    .line 267
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "sdk read accounts.xml parseInt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    goto/16 :goto_1

    .line 269
    :cond_c
    const-string v0, "accountType"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 270
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 271
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->g(Ljava/lang/String;)V

    .line 272
    goto/16 :goto_1

    :cond_d
    const-string v0, "loginUserName"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 273
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 274
    if-eqz p2, :cond_e

    .line 275
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 277
    :cond_e
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->k(Ljava/lang/String;)V

    .line 278
    goto :goto_1

    :cond_f
    const-string v0, "countryIsoCode"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 279
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 280
    if-eqz p2, :cond_10

    .line 281
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 283
    :cond_10
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Ljava/lang/String;)V

    .line 284
    goto :goto_1

    :cond_11
    const-string v0, "serviceCountryCode"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 285
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 286
    if-eqz p2, :cond_12

    .line 287
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 289
    :cond_12
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->m(Ljava/lang/String;)V

    .line 290
    goto :goto_1

    :cond_13
    const-string v0, "uuid"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 291
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 292
    if-eqz p2, :cond_14

    .line 293
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 295
    :cond_14
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 296
    .line 301
    :cond_15
    :goto_1
    :pswitch_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    .line 302
    goto/16 :goto_0

    .line 304
    :cond_16
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwid/core/datatype/HwAccount;>;)Ljava/util/List<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 314
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 317
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 318
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 319
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 320
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 322
    :cond_2
    goto :goto_0

    .line 324
    :cond_3
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 325
    invoke-interface {p0, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    :cond_4
    goto :goto_1

    .line 327
    :catch_0
    move-exception v3

    .line 328
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    :goto_1
    return-object p0
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;ZLorg/xmlpull/v1/XmlSerializer;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 40
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    const-string v0, ""

    const-string v1, "account"

    invoke-interface {p3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 44
    const-string v0, ""

    const-string v1, "appId"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 46
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v3

    .line 47
    if-eqz p2, :cond_1

    .line 48
    invoke-static {p0, v3}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 50
    :cond_1
    const-string v0, "accountName"

    invoke-static {p3, v0, v3}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v4

    .line 53
    if-eqz p2, :cond_2

    .line 54
    invoke-static {p0, v4}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 56
    :cond_2
    const-string v0, "userId"

    invoke-static {p3, v0, v4}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v5

    .line 59
    if-eqz p2, :cond_3

    .line 60
    invoke-static {p0, v5}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 62
    :cond_3
    const-string v0, "deviceId"

    const/4 v1, 0x0

    if-ne v1, v5, :cond_4

    const-string v1, ""

    goto :goto_0

    :cond_4
    move-object v1, v5

    :goto_0
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->j()Ljava/lang/String;

    move-result-object v6

    .line 65
    if-eqz p2, :cond_5

    .line 66
    invoke-static {p0, v6}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 68
    :cond_5
    const-string v0, "subDeviceId"

    const/4 v1, 0x0

    if-ne v1, v6, :cond_6

    const-string v1, ""

    goto :goto_1

    :cond_6
    move-object v1, v6

    :goto_1
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v7

    .line 71
    const-string v0, "deviceType"

    const/4 v1, 0x0

    if-ne v1, v7, :cond_7

    const-string v1, ""

    goto :goto_2

    :cond_7
    move-object v1, v7

    :goto_2
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v8

    .line 74
    const-string v0, "serviceToken"

    invoke-static {p0, v8}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->l()Ljava/lang/String;

    move-result-object v9

    .line 77
    const-string v0, "loginUserName"

    invoke-static {p0, v9}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->a()Ljava/lang/String;

    move-result-object v10

    .line 80
    const-string v0, "countryIsoCode"

    invoke-static {p0, v10}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/b/a/b;->b(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;ZLorg/xmlpull/v1/XmlSerializer;)V

    .line 83
    const-string v0, ""

    const-string v1, "account"

    invoke-interface {p3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 84
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwid/core/datatype/HwAccount;>;Z)V"
        }
    .end annotation

    .line 116
    invoke-static {p2}, Lcom/huawei/hwid/b/a/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 118
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    :cond_0
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "write accounts into file error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    return-void

    .line 123
    :cond_1
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    .line 124
    new-instance v6, Ljava/io/StringWriter;

    invoke-direct {v6}, Ljava/io/StringWriter;-><init>()V

    .line 126
    :try_start_0
    invoke-interface {v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/Writer;)V

    .line 127
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 128
    const-string v0, ""

    const-string v1, "accounts"

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 129
    const-string v0, ""

    const-string v1, "size"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v0, v1, v2}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 131
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 132
    invoke-static {p0, v8, p3, v5}, Lcom/huawei/hwid/b/a/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;ZLorg/xmlpull/v1/XmlSerializer;)V

    .line 133
    goto :goto_0

    .line 135
    :cond_2
    const-string v0, ""

    const-string v1, "accounts"

    invoke-interface {v5, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 136
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/hwid/core/d/b;->d(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/core/d/f;->a(Ljava/lang/String;Ljava/lang/String;[B)Z

    move-result v7

    .line 139
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "write accounts into file "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    :try_start_1
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    goto/16 :goto_2

    .line 151
    :catch_0
    move-exception v7

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    goto/16 :goto_2

    .line 140
    :catch_1
    move-exception v7

    .line 141
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IllegalArgumentException write accounts failed!"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    :try_start_3
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 153
    goto :goto_2

    .line 151
    :catch_2
    move-exception v7

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    goto :goto_2

    .line 142
    :catch_3
    move-exception v7

    .line 143
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IllegalStateException write accounts failed!"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 150
    :try_start_5
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 153
    goto :goto_2

    .line 151
    :catch_4
    move-exception v7

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    goto :goto_2

    .line 144
    :catch_5
    move-exception v7

    .line 145
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException write accounts failed!"

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 150
    :try_start_7
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 153
    goto :goto_2

    .line 151
    :catch_6
    move-exception v7

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    goto :goto_2

    .line 146
    :catch_7
    move-exception v7

    .line 147
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "Exception write accounts failed!"

    :try_start_8
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 150
    :try_start_9
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 153
    goto :goto_2

    .line 151
    :catch_8
    move-exception v7

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    goto :goto_2

    .line 149
    :catchall_0
    move-exception v9

    .line 150
    :try_start_a
    invoke-virtual {v6}, Ljava/io/StringWriter;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 153
    goto :goto_1

    .line 151
    :catch_9
    move-exception v10

    .line 152
    const-string v0, "SDKAccountXmlImpl"

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    :goto_1
    throw v9

    .line 156
    :goto_2
    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;ZLorg/xmlpull/v1/XmlSerializer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v3

    .line 90
    const-string v0, "siteId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->h()Ljava/lang/String;

    move-result-object v4

    .line 93
    const-string v0, "accountType"

    const/4 v1, 0x0

    if-ne v1, v4, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->n()Ljava/lang/String;

    move-result-object v5

    .line 96
    if-eqz p2, :cond_1

    .line 97
    invoke-static {p0, v5}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 99
    :cond_1
    const-string v0, "serviceCountryCode"

    const/4 v1, 0x0

    if-ne v1, v5, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    move-object v1, v5

    :goto_1
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->o()Ljava/lang/String;

    move-result-object v6

    .line 102
    if-eqz p2, :cond_3

    .line 103
    invoke-static {p0, v6}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 105
    :cond_3
    const-string v0, "uuid"

    const/4 v1, 0x0

    if-ne v1, v6, :cond_4

    const-string v1, ""

    goto :goto_2

    :cond_4
    move-object v1, v6

    :goto_2
    invoke-static {p3, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-void
.end method
