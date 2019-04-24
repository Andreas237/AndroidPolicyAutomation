.class public Lcom/huawei/hwid/core/d/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/core/d/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation

    .line 130
    const/4 v2, 0x0

    .line 132
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

    .line 133
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    const-string v0, "XmlFileGrade"

    const-string v1, "xmlfilegradle sdk filepath not exist"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    nop

    .line 136
    .line 158
    .line 159
    .line 160
    .line 161
    return-object v5

    .line 138
    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 139
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 140
    const/4 v0, 0x0

    invoke-interface {v5, v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 141
    invoke-static {v5, p1, p2}, Lcom/huawei/hwid/core/d/a/d;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/Context;Z)Ljava/util/ArrayList;
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v6

    .line 156
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 158
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 161
    goto :goto_0

    .line 159
    :catch_0
    move-exception v7

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    :cond_1
    :goto_0
    return-object v6

    .line 143
    :catch_1
    move-exception v3

    .line 144
    const-string v0, "XmlFileGrade"

    const-string v1, "XmlPullParserException readAccountsFromXmlfailed!"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 156
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 158
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 161
    goto :goto_1

    .line 159
    :catch_2
    move-exception v5

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    :cond_2
    :goto_1
    return-object v4

    .line 146
    :catch_3
    move-exception v3

    .line 147
    const-string v0, "XmlFileGrade"

    const-string v1, "FileNotFoundException read xml failed!"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 156
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 158
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 161
    goto :goto_2

    .line 159
    :catch_4
    move-exception v5

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :cond_3
    :goto_2
    return-object v4

    .line 149
    :catch_5
    move-exception v3

    .line 150
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException read xml failed!"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 156
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 158
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 161
    goto :goto_3

    .line 159
    :catch_6
    move-exception v5

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_4
    :goto_3
    return-object v4

    .line 152
    :catch_7
    move-exception v3

    .line 153
    const-string v0, "XmlFileGrade"

    const-string v1, "Exception read xml failed!"

    :try_start_9
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 156
    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    .line 158
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 161
    goto :goto_4

    .line 159
    :catch_8
    move-exception v5

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :cond_5
    :goto_4
    return-object v4

    .line 156
    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    .line 158
    :try_start_b
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9

    .line 161
    goto :goto_5

    .line 159
    :catch_9
    move-exception v9

    .line 160
    const-string v0, "XmlFileGrade"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
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

    .line 167
    const-string v0, "XmlFileGrade"

    const-string v1, "parseAccountsFromXml Start"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    .line 169
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 170
    new-instance v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    .line 171
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v2, :cond_10

    .line 172
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 173
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 176
    :pswitch_0
    goto/16 :goto_2

    .line 179
    :pswitch_1
    const-string v0, "account"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 180
    const-string v0, ""

    const-string v1, "appId"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 182
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    const-string v0, "XmlFileGrade"

    const-string v1, "authTokenType is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 186
    :cond_0
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Ljava/lang/String;)V

    .line 187
    goto/16 :goto_2

    :cond_1
    const-string v0, "accountName"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 189
    if-eqz p2, :cond_2

    .line 190
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 192
    :cond_2
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->b(Ljava/lang/String;)V

    .line 193
    goto/16 :goto_2

    :cond_3
    const-string v0, "userId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 194
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 195
    if-eqz p2, :cond_4

    .line 196
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 198
    :cond_4
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->d(Ljava/lang/String;)V

    .line 199
    goto/16 :goto_2

    :cond_5
    const-string v0, "deviceId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 200
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 201
    if-eqz p2, :cond_6

    .line 202
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 204
    :cond_6
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->h(Ljava/lang/String;)V

    .line 205
    goto/16 :goto_2

    :cond_7
    const-string v0, "subDeviceId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 206
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 207
    if-eqz p2, :cond_8

    .line 208
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 210
    :cond_8
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->i(Ljava/lang/String;)V

    .line 211
    goto/16 :goto_2

    :cond_9
    const-string v0, "deviceType"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 212
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 213
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->j(Ljava/lang/String;)V

    .line 214
    goto/16 :goto_2

    :cond_a
    const-string v0, "serviceToken"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 215
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 216
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->f(Ljava/lang/String;)V

    .line 217
    goto/16 :goto_2

    :cond_b
    const-string v0, "siteId"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 219
    :try_start_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 220
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 225
    goto/16 :goto_2

    .line 221
    :catch_0
    move-exception v6

    .line 222
    const-string v0, "XmlFileGrade"

    const-string v1, "NumberFormatException: read accounts.xml parseInt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    goto/16 :goto_2

    .line 223
    :catch_1
    move-exception v6

    .line 224
    const-string v0, "XmlFileGrade"

    const-string v1, "read accounts.xml parseInt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    goto/16 :goto_2

    .line 226
    :cond_c
    const-string v0, "accountType"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 227
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 228
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->g(Ljava/lang/String;)V

    .line 229
    goto :goto_2

    :cond_d
    const-string v0, "loginUserName"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 230
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 231
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 232
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->k(Ljava/lang/String;)V

    .line 233
    goto :goto_2

    :cond_e
    const-string v0, "countryIsoCode"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 234
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v6

    .line 235
    invoke-static {p1, v6}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 236
    invoke-virtual {v4, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Ljava/lang/String;)V

    .line 237
    goto :goto_2

    .line 241
    :pswitch_2
    const-string v0, "account"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 242
    const-string v0, "XmlFileGrade"

    const-string v1, "parseAccountsFromXml account add "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    new-instance v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    goto :goto_2

    .line 249
    :goto_1
    :pswitch_3
    const-string v0, "XmlFileGrade"

    const-string v1, "default"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    :cond_f
    :goto_2
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    .line 253
    goto/16 :goto_0

    .line 255
    :cond_10
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    .line 59
    const-string v0, "XmlFileGrade"

    const-string v1, "update HwAccounts.xml when version update"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-static {p1}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v2

    .line 61
    const-string v0, "last_head_picture_url"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 62
    const-string v0, "XmlFileGrade"

    const-string v1, "delete last_head_picture_url in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "DEVID_1"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 65
    const-string v0, "XmlFileGrade"

    const-string v1, "delete DEVID in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "SUBDEVID"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 68
    const-string v0, "XmlFileGrade"

    const-string v1, "delete SUBDEVID in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, "hasEncryptHeadPictureUrl"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 71
    const-string v0, "XmlFileGrade"

    const-string v1, "delete hasEncryptHeadPictureUrl in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "accessToken"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    invoke-static {p1, v3}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    const-string v0, "XmlFileGrade"

    const-string v1, "update accessToken in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "accessToken"

    invoke-virtual {v2, v0, v3}, Lcom/huawei/hwid/core/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :cond_0
    const-string v0, "accessToken"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 81
    const-string v0, "XmlFileGrade"

    const-string v1, "accessToken ecb decrypt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :cond_1
    :goto_0
    const-string v0, "UUID"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 86
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 87
    const-string v0, "XmlFileGrade"

    const-string v1, "update uuid in HwAccount.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "UUID"

    invoke-virtual {v2, v0, v4}, Lcom/huawei/hwid/core/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 90
    :cond_2
    const-string v0, "UUID"

    invoke-virtual {v2, v0}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 91
    const-string v0, "XmlFileGrade"

    const-string v1, "uuid ecb decrypt error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_1
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    .line 101
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    return-void

    .line 104
    :cond_0
    const/4 v2, 0x0

    .line 105
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/a/d;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    const-string v0, "accounts.xml"

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/core/d/a/d;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    .line 108
    :cond_1
    const-string v0, "accounts.xml"

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/core/d/a/d;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v2

    .line 110
    :goto_0
    const-string v0, "accounts.xml"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 112
    const-string v0, "accounts.xml"

    const/4 v1, 0x1

    invoke-static {p1, v0, v2, v1}, Lcom/huawei/hwid/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z)V

    .line 113
    return-void
.end method

.method private c(Landroid/content/Context;)Z
    .locals 5

    .line 116
    const/4 v2, 0x0

    .line 117
    const-string v0, "encryptversion"

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 119
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const-string v0, "isSDKAccountDataEncrypted"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v4

    .line 122
    if-nez v4, :cond_0

    .line 123
    const/4 v2, 0x1

    .line 126
    :cond_0
    return v2
.end method


# virtual methods
.method public a(Landroid/content/Context;II)V
    .locals 2

    .line 34
    if-lt p2, p3, :cond_0

    .line 35
    const-string v0, "XmlFileGrade"

    const-string v1, "newVersion is less then oldVersion, onUpgrade error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-void

    .line 40
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/a/d;->a(Landroid/content/Context;)V

    .line 43
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/d/a/d;->b(Landroid/content/Context;)V

    .line 44
    return-void
.end method
