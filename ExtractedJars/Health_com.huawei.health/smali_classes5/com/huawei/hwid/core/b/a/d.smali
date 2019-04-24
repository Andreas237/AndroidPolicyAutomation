.class public Lcom/huawei/hwid/core/b/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwid/core/b/a/d;->a:Z

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6

    .line 81
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->t()I

    move-result v2

    .line 83
    rsub-int/lit8 v3, v2, 0x3

    .line 84
    const/4 v4, 0x0

    .line 85
    invoke-static {p0, p1, p2, v3, v4}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 86
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->h()Landroid/os/Bundle;

    move-result-object v5

    .line 88
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 89
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 91
    :cond_0
    return-object v5
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;)V
    .locals 2

    .line 95
    instance-of v0, p1, Lcom/huawei/hwid/core/b/a/a/b;

    if-nez v0, :cond_0

    .line 96
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    const/16 v1, 0x3ef

    if-eq v0, v1, :cond_0

    .line 97
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->e(Ljava/lang/String;)V

    .line 98
    invoke-virtual {p1, p0}, Lcom/huawei/hwid/core/b/a/a;->b(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/huawei/hwid/core/a/c;->a(Landroid/os/Bundle;Landroid/content/Context;)V

    .line 99
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->x()V

    .line 102
    :cond_0
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V
    .locals 8

    .line 113
    const/4 v0, 0x3

    if-lt p3, v0, :cond_0

    .line 114
    const-string v0, "RequestManager"

    const-string v1, "exceed max request try time"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void

    .line 118
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 119
    add-int/lit8 p4, p4, 0x1

    .line 121
    const/4 v0, 0x1

    if-le p4, v0, :cond_1

    .line 122
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;)V

    .line 124
    const/4 p4, 0x1

    .line 126
    :cond_1
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->d(Ljava/lang/String;)V

    .line 128
    const/4 v2, -0x1

    .line 130
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 131
    const/16 v0, 0x3ef

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lcom/huawei/hwid/core/exception/TokenInvalidatedException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_7

    .line 132
    return-void

    .line 135
    :cond_2
    :try_start_1
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/core/b/a/c;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)Lorg/apache/http/HttpResponse;

    move-result-object v3

    .line 136
    const-string v0, "Set-Cookie"

    invoke-interface {v3, v0}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v4

    .line 138
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    .line 141
    invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 143
    const-string v0, "RequestManager"

    const-string v1, "response responseXMLContent  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "<html"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 151
    const/16 v0, 0x3e9

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 152
    const-string v0, "UNSUPPORTED_ENCODING_EXCEPTION"

    const/16 v1, 0x3e9

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V
    :try_end_1
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lcom/huawei/hwid/core/exception/TokenInvalidatedException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_7

    .line 153
    return-void

    .line 155
    :cond_3
    :try_start_2
    invoke-virtual {p1, v2}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 156
    const/16 v0, 0xc8

    if-ne v0, v2, :cond_8

    .line 157
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    .line 158
    const-string v0, "RequestManager"

    const-string v1, "parse response start"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->a()Lcom/huawei/hwid/core/b/a/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/b/a/a$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 160
    invoke-virtual {p1, v5}, Lcom/huawei/hwid/core/b/a/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 162
    :cond_4
    invoke-virtual {p1, v5}, Lcom/huawei/hwid/core/b/a/a;->a(Ljava/lang/String;)V

    .line 164
    :goto_0
    const-string v0, ""

    const/16 v1, 0xc8

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 165
    const-string v0, "RequestManager"

    const-string v1, "parse response end"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    array-length v6, v4

    .line 168
    if-lez v6, :cond_5

    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_5
    const-string v7, ""

    .line 169
    :goto_1
    invoke-static {p0, p1, v7}, Lcom/huawei/hwid/core/b/a/d;->b(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)V

    .line 171
    instance-of v0, p1, Lcom/huawei/hwid/core/b/a/a/d;

    if-nez v0, :cond_6

    .line 173
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->b(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    goto :goto_2

    .line 174
    :cond_6
    sget-boolean v0, Lcom/huawei/hwid/core/b/a/d;->a:Z

    if-eqz v0, :cond_7

    .line 177
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwid/core/b/a/d;->a(Z)V

    .line 178
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->b(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 180
    :cond_7
    :goto_2
    goto :goto_3

    .line 181
    :cond_8
    const/16 v0, 0x133

    if-ne v0, v2, :cond_a

    .line 183
    const-string v0, "SC_TEMPORARY_REDIRECT"

    const/16 v1, 0x133

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 184
    const-string v0, "location"

    invoke-interface {v3, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v6

    .line 185
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 186
    invoke-interface {v6}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 187
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 188
    invoke-virtual {p1, v7}, Lcom/huawei/hwid/core/b/a/a;->c(Ljava/lang/String;)V

    .line 189
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 193
    :cond_9
    goto :goto_3

    .line 194
    :cond_a
    const-string v0, "other code"

    invoke-virtual {p1, p4, v2, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 196
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V
    :try_end_2
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/huawei/hwid/core/exception/TokenInvalidatedException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_7

    .line 231
    :cond_b
    :goto_3
    goto/16 :goto_4

    .line 198
    :catch_0
    move-exception v2

    .line 199
    const-string v0, "RequestManager"

    const-string v1, "SSLPeerUnverifiedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const/16 v0, 0xbc0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 201
    invoke-virtual {v2}, Ljavax/net/ssl/SSLPeerUnverifiedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbc0

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto/16 :goto_4

    .line 202
    :catch_1
    move-exception v2

    .line 203
    const-string v0, "RequestManager"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const/16 v0, 0x3e9

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 205
    invoke-virtual {v2}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto/16 :goto_4

    .line 206
    :catch_2
    move-exception v2

    .line 207
    const-string v0, "RequestManager"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const/16 v0, 0x3ea

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 209
    invoke-virtual {v2}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ea

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto/16 :goto_4

    .line 210
    :catch_3
    move-exception v2

    .line 211
    const-string v0, "RequestManager"

    const-string v1, "IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const/16 v0, 0x3eb

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 213
    invoke-virtual {v2}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3eb

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto/16 :goto_4

    .line 214
    :catch_4
    move-exception v2

    .line 215
    const-string v0, "RequestManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    const/16 v0, 0x3ed

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 217
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ed

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 218
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 231
    goto :goto_4

    .line 219
    :catch_5
    move-exception v2

    .line 220
    const-string v0, "RequestManager"

    const-string v1, "XmlPullParserException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const/16 v0, 0x3ee

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 222
    invoke-virtual {v2}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3ee

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto :goto_4

    .line 223
    :catch_6
    move-exception v2

    .line 224
    const-string v0, "RequestManager"

    const-string v1, "TokenInvalidatedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const/16 v0, 0xbb8

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 226
    invoke-virtual {v2}, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbb8

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 231
    goto :goto_4

    .line 227
    :catch_7
    move-exception v2

    .line 228
    const-string v0, "RequestManager"

    const-string v1, "NullPointerException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const/16 v0, 0xbb9

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 230
    invoke-virtual {v2}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xbb9

    invoke-virtual {p1, p4, v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(IILjava/lang/String;)V

    .line 232
    :goto_4
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;)V

    .line 233
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 2

    .line 69
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->r()I

    move-result v1

    .line 72
    if-gtz v1, :cond_0

    .line 73
    invoke-static {p0, p2}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/core/b/a/a;->c(I)V

    .line 76
    :cond_0
    new-instance v0, Lcom/huawei/hwid/core/b/a/e;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/huawei/hwid/core/b/a/e;-><init>(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Landroid/os/Handler;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/huawei/hwid/core/b/a/e;->start()V

    .line 77
    return-void
.end method

.method private static declared-synchronized a(Z)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/core/b/a/d;

    monitor-enter v0

    .line 380
    :try_start_0
    sput-boolean p0, Lcom/huawei/hwid/core/b/a/d;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 381
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwid/core/b/a/a;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/huawei/hwid/core/exception/TokenInvalidatedException;
        }
    .end annotation

    .line 340
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v7

    .line 341
    const-string v8, ""

    .line 342
    const-string v9, ""

    .line 343
    const-string v10, ""

    .line 344
    const-string v11, ""

    .line 345
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 346
    invoke-virtual {v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v8

    .line 347
    invoke-virtual {v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v9

    .line 348
    invoke-virtual {v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v10

    .line 349
    invoke-virtual {v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v11

    .line 351
    :cond_0
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 353
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/hwid/core/b/a/d;->a(Z)V

    .line 354
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v12

    .line 356
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/d;

    move-object v1, p0

    move-object v2, v9

    move-object v3, v8

    move v4, v12

    move-object v5, v10

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwid/core/b/a/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v13, v0

    .line 357
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v13, p1, v0, v1}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 358
    invoke-virtual {v13}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 359
    invoke-virtual {v13}, Lcom/huawei/hwid/core/b/a/a;->i()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_2

    .line 360
    invoke-virtual {v13}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const v1, 0x42c2560

    if-eq v0, v1, :cond_1

    invoke-virtual {v13}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const v1, 0x42c255f

    if-ne v0, v1, :cond_2

    .line 361
    :cond_1
    move-object/from16 v0, p2

    const/16 v1, 0xbb8

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/b/a/a;->a(I)V

    .line 365
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwid/core/b/a/a;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "responseCode"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_3

    .line 366
    invoke-virtual {v13}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 367
    const/4 v0, 0x1

    return v0

    .line 370
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 372
    :cond_4
    goto :goto_0

    .line 374
    :cond_5
    new-instance v0, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;

    const-string v1, "token is null"

    invoke-direct {v0, v1}, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 376
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private static a(Lcom/huawei/hwid/core/b/a/a;)Z
    .locals 2

    .line 309
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const v1, 0x42c21cd

    if-ne v1, v0, :cond_0

    .line 310
    const/4 v0, 0x1

    return v0

    .line 312
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)V
    .locals 2

    .line 236
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    if-nez v0, :cond_1

    .line 237
    const/4 v1, 0x0

    .line 238
    instance-of v0, p1, Lcom/huawei/hwid/core/b/a/a/d;

    if-eqz v0, :cond_0

    .line 240
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/core/b/a/a/d;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/b/a/a/d;->z()Ljava/lang/String;

    move-result-object v1

    .line 242
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 243
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Lcom/huawei/hwid/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    :cond_1
    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/huawei/hwid/core/exception/TokenInvalidatedException;
        }
    .end annotation

    .line 260
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 263
    invoke-static {p1}, Lcom/huawei/hwid/core/b/a/d;->b(Lcom/huawei/hwid/core/b/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    new-instance v0, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;

    const-string v1, "token is invalidated"

    invoke-direct {v0, v1}, Lcom/huawei/hwid/core/exception/TokenInvalidatedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 293
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwid/core/b/a/d;->a(Lcom/huawei/hwid/core/b/a/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    const-string v0, "RequestManager"

    const-string v1, "user session is out of date."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->c()V

    .line 299
    invoke-static {p0, p2, p1}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwid/core/b/a/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/core/b/a/d;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;II)V

    .line 306
    :cond_1
    return-void
.end method

.method private static b(Lcom/huawei/hwid/core/b/a/a;)Z
    .locals 2

    .line 317
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const v1, 0x42c255f

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/a/a;->j()I

    move-result v0

    const v1, 0x42c2560

    if-ne v1, v0, :cond_1

    .line 318
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 320
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
