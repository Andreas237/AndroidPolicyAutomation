.class public Lcom/huawei/hwid/core/b/a/a/f;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/f$a;
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/huawei/hwid/core/datatype/UserInfo;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 79
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 61
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->h:Ljava/lang/String;

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/updateUserInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->m:Ljava/lang/String;

    .line 80
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(Z)V

    .line 81
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwid/core/datatype/UserInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 251
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 61
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->h:Ljava/lang/String;

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/updateUserInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->m:Ljava/lang/String;

    .line 252
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(Z)V

    .line 253
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/b/a/a/f;->g(Ljava/lang/String;)V

    .line 260
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 261
    invoke-direct {p0, p5}, Lcom/huawei/hwid/core/b/a/a/f;->h(Ljava/lang/String;)V

    .line 263
    :cond_0
    invoke-direct {p0, p4}, Lcom/huawei/hwid/core/b/a/a/f;->a(Lcom/huawei/hwid/core/datatype/UserInfo;)V

    .line 264
    const v0, 0x42c310a

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 265
    const v0, 0x42c34f7

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 266
    const v0, 0x42c310b

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 267
    const v0, 0x42c310d

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 268
    const v0, 0x42c2231

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 269
    const v0, 0x42c38dd

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->b(I)V

    .line 271
    return-void
.end method

.method private a(Lcom/huawei/hwid/core/datatype/UserInfo;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/f;->j:Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 198
    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/f;->l:Ljava/lang/String;

    .line 85
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/f;->i:Ljava/lang/String;

    .line 190
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/f;->k:Ljava/lang/String;

    .line 243
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 275
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/f;->f(Ljava/lang/String;)V

    .line 276
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/f$a;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hwid/core/b/a/a/f$a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwid/core/b/a/a/f;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 277
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/m;->a([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 150
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 151
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v3, :cond_3

    .line 152
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 153
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_1

    .line 156
    :pswitch_0
    goto :goto_1

    .line 158
    :pswitch_1
    goto :goto_1

    .line 161
    :pswitch_2
    const-string v0, "result"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->b:I

    .line 164
    :cond_0
    const-string v0, "UpdateUserInfoRequest"

    const-string v1, "result:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->b:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 168
    const-string v0, "errorCode"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->c:I

    goto :goto_1

    .line 170
    :cond_1
    const-string v0, "errorDesc"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 171
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->d:Ljava/lang/String;

    .line 179
    :cond_2
    :goto_1
    :pswitch_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 180
    goto/16 :goto_0

    .line 181
    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 91
    :try_start_0
    invoke-static {v2}, Lcom/huawei/hwid/core/d/m;->b(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v3

    .line 92
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 94
    const-string v0, "UpdateUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 95
    const-string v0, "version"

    const-string v1, "12000"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "userID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/f;->i:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "reqClientType"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/f;->h:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "password"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/f;->k:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->j:Lcom/huawei/hwid/core/datatype/UserInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 102
    const-string v0, "userInfo"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->l:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->j:Lcom/huawei/hwid/core/datatype/UserInfo;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/f;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->setLanguageCode(Ljava/lang/String;)V

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->j:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-static {v3, v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->setUserInfoIntag(Lorg/xmlpull/v1/XmlSerializer;Lcom/huawei/hwid/core/datatype/UserInfo;)V

    .line 107
    const-string v0, "userInfo"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 131
    :cond_1
    const-string v0, "UpdateUserInfoReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 133
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 135
    const-string v0, "UTF-8"

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 137
    move-object v5, v4

    .line 140
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    goto :goto_0

    .line 141
    :catch_0
    move-exception v6

    .line 142
    const-string v0, "UpdateUserInfoRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :goto_0
    return-object v5

    .line 139
    :catchall_0
    move-exception v7

    .line 140
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 143
    goto :goto_1

    .line 141
    :catch_1
    move-exception v8

    .line 142
    const-string v0, "UpdateUserInfoRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :goto_1
    throw v7
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/f;->m:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    .line 248
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
