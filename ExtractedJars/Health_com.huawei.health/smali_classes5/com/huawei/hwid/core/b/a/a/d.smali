.class public Lcom/huawei/hwid/core/b/a/a/d;
.super Lcom/huawei/hwid/core/b/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/b/a/a/d$a;
    }
.end annotation


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 255
    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a;-><init>()V

    .line 48
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->i:Ljava/lang/String;

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    .line 51
    const-string v0, "7"

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->l:Ljava/lang/String;

    .line 58
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/d;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/IUserInfoMng/stAuth"

    goto :goto_0

    :cond_0
    const-string v0, "/IUserInfoMng/serviceTokenAuth"

    :goto_0
    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->r:Ljava/lang/String;

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a/d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->s:Ljava/lang/String;

    .line 62
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->t:I

    .line 256
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    :cond_1
    const-string p2, "com.huawei.hwid"

    .line 259
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->g:I

    .line 260
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->a(Lcom/huawei/hwid/core/b/a/a$c;)V

    .line 261
    invoke-static {p3}, Lcom/huawei/hwid/core/encrypt/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->h(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->f(Ljava/lang/String;)V

    .line 264
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 265
    invoke-direct {p0, p5}, Lcom/huawei/hwid/core/b/a/a/d;->i(Ljava/lang/String;)V

    goto :goto_1

    .line 267
    :cond_3
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->i(Ljava/lang/String;)V

    .line 269
    :goto_1
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 270
    invoke-direct {p0, p6}, Lcom/huawei/hwid/core/b/a/a/d;->g(Ljava/lang/String;)V

    goto :goto_2

    .line 272
    :cond_4
    const-string v0, "6"

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->g(Ljava/lang/String;)V

    .line 274
    :goto_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->j(Ljava/lang/String;)V

    .line 275
    invoke-virtual {p0, p4}, Lcom/huawei/hwid/core/b/a/a/d;->c(I)V

    .line 276
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->t:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->d(I)V

    .line 277
    invoke-static {p1, p2}, Lcom/huawei/hwid/core/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->k(Ljava/lang/String;)V

    .line 278
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/core/b/a/a/d;->a(Z)V

    .line 279
    return-void
.end method

.method private A()Ljava/lang/String;
    .locals 3

    .line 246
    const-string v2, ""

    .line 247
    const-string v0, "NULL"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    iget-object v2, p0, Lcom/huawei/hwid/core/b/a/a/d;->n:Ljava/lang/String;

    goto :goto_0

    .line 249
    :cond_0
    const-string v0, "NULL"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    iget-object v2, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    .line 252
    :cond_1
    :goto_0
    return-object v2
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    .line 208
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/d;->m:Ljava/lang/String;

    .line 216
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/d;->j:Ljava/lang/String;

    .line 220
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/d;->n:Ljava/lang/String;

    .line 224
    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 1

    .line 227
    invoke-static {p1}, Lcom/huawei/hwid/core/encrypt/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    .line 228
    return-void
.end method

.method private k(Ljava/lang/String;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/d;->p:Ljava/lang/String;

    .line 232
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 283
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/d$a;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hwid/core/b/a/a/d$a;-><init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/hwid/core/b/a/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Lcom/huawei/hwid/core/helper/handler/a;)Lcom/huawei/hwid/core/b/a/a$b;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V

    .line 284
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

    .line 109
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/m;->a([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 110
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    .line 111
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v3, :cond_3

    .line 112
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 113
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 116
    :pswitch_0
    goto :goto_1

    .line 118
    :pswitch_1
    goto :goto_1

    .line 121
    :pswitch_2
    const-string v0, "result"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v2, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->b:I

    .line 125
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->b:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 126
    const-string v0, "errorCode"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->c:I

    goto :goto_1

    .line 128
    :cond_1
    const-string v0, "errorDesc"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->d:Ljava/lang/String;

    .line 138
    :cond_2
    :goto_1
    :pswitch_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 139
    goto/16 :goto_0

    .line 141
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

.method public b(Ljava/lang/String;)V
    .locals 10

    .line 170
    const/4 v2, 0x0

    .line 171
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 174
    :cond_0
    return-void

    .line 176
    :goto_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 177
    const/4 v4, 0x0

    .line 178
    const-string v5, ""

    .line 179
    move-object v6, v2

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 181
    const-string v0, "="

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 182
    const/4 v0, 0x0

    aget-object v0, v4, v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const/4 v0, 0x0

    aget-object v5, v4, v0

    .line 179
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 185
    :cond_1
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    const-string v0, "resultCode"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->b:I

    .line 188
    :cond_2
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 189
    const-string v0, "userID"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->q:Ljava/lang/String;

    .line 191
    const-string v0, "agrFlags"

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->h:Ljava/lang/String;

    goto :goto_2

    .line 193
    :cond_3
    iget v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->b:I

    iput v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->c:I

    .line 194
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->d:Ljava/lang/String;

    .line 196
    :goto_2
    return-void
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

    .line 68
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 70
    :try_start_0
    invoke-static {v2}, Lcom/huawei/hwid/core/d/m;->a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v3

    .line 71
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 72
    const-string v0, "ServiceTokenAuthReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 74
    const-string v0, "version"

    const-string v1, "12000"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "serviceToken"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->j:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "appID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.huawei.hwid"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    :goto_0
    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "deviceInfo"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 79
    const-string v0, "deviceID"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->n:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, "deviceType"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->m:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, "terminalType"

    invoke-static {}, Lcom/huawei/hwid/core/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, "deviceInfo"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 84
    const-string v0, "reqClientType"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->l:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "clientIP"

    const-string v1, ""

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "loginChannel"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->p:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "uuid"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "chkAcctChange"

    const-string v1, "0"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "isGetAccount"

    const-string v1, "0"

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "isGetAgrVers"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->i:Ljava/lang/String;

    invoke-static {v3, v0, v1}, Lcom/huawei/hwid/core/d/m;->a(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "ServiceTokenAuthReq"

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 94
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 96
    const-string v0, "UTF-8"

    invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 98
    move-object v5, v4

    .line 101
    :try_start_1
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    goto :goto_1

    .line 102
    :catch_0
    move-exception v6

    .line 103
    const-string v0, "ServiceTokenAuthRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    :goto_1
    return-object v5

    .line 100
    :catchall_0
    move-exception v7

    .line 101
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 104
    goto :goto_2

    .line 102
    :catch_1
    move-exception v8

    .line 103
    const-string v0, "ServiceTokenAuthRequest"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_2
    throw v7
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 154
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 155
    const-string v0, "ver="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "st="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "app="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    .line 156
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.huawei.hwid"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->k:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "dvT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "dvID="

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/hwid/core/b/a/a/d;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "tmT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwid/core/d/k;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "clT="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->l:Ljava/lang/String;

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "cn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "chg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "gAc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "0"

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "uuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "agr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->s:Ljava/lang/String;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 3

    .line 240
    invoke-super {p0}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v2

    .line 241
    const-string v0, "agrFlags"

    iget-object v1, p0, Lcom/huawei/hwid/core/b/a/a/d;->h:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    return-object v2
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/d;->q:Ljava/lang/String;

    return-object v0
.end method
