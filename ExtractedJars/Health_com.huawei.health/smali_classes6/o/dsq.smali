.class public Lo/dsq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dsq;

.field private static final b:Ljava/lang/String;

.field private static final d:Ljava/lang/Object;


# instance fields
.field private c:Ljava/lang/String;

.field private e:Lo/dso;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Lo/dsq;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsq;->b:Ljava/lang/String;

    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dsq;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 107
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "Gba auth step 2."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    const-string v0, "%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 109
    invoke-static {}, Lo/drx;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 110
    const-string v0, "bsf.mnc%1$s.mcc%2$s.pub.3gppnetwork.org"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Digest nonce=\"\",uri=\"/\",username=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",realm=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",response=\"\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 113
    invoke-direct {p0, v7, v9}, Lo/dsq;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dsp;

    move-result-object v10

    .line 114
    invoke-virtual {v10}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x191

    if-ne v1, v0, :cond_0

    .line 115
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual {v10}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/dsq;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 116
    :cond_0
    invoke-virtual {v10}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x62

    if-ne v1, v0, :cond_1

    .line 117
    const/16 v0, 0x62

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_1
    invoke-virtual {v10}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x193

    if-ne v1, v0, :cond_2

    .line 119
    const/16 v0, 0x193

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 121
    :cond_2
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/Closeable;)V
    .locals 3

    .line 403
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 404
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 408
    :cond_0
    goto :goto_0

    .line 406
    :catch_0
    move-exception v2

    .line 407
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "closeStream->close error"

    invoke-static {v0, v1}, Lo/dsc;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 409
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/dsp;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 207
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGBAContentFromPost->start.urlParams="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", authorization="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", sip="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    :cond_0
    new-instance v3, Lo/dsp;

    invoke-direct {v3}, Lo/dsp;-><init>()V

    .line 211
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 212
    :cond_1
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "sip or urlAddress is null."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    const/16 v0, 0x63

    invoke-virtual {v3, v0}, Lo/dsp;->e(I)V

    .line 214
    return-object v3

    .line 216
    :cond_2
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "sip and address ok."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    const/4 v4, 0x0

    .line 218
    const/4 v5, 0x0

    .line 221
    :try_start_0
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, p3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 222
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v4, v0

    .line 223
    invoke-direct {p0, p1, v4}, Lo/dsq;->c(Landroid/content/Context;Ljavax/net/ssl/HttpsURLConnection;)V

    .line 225
    const/16 v0, 0x7530

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 226
    const/16 v0, 0x7530

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 227
    const-string v0, "POST"

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 229
    const-string v0, "User-Agent"

    const-string v1, "3gpp-gba"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    const-string v0, "ES-Version"

    const-string v1, "1.0.7"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v0, "ES-APP-ID"

    const-string v1, "00104605"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const-string v0, "ES-APP-Key"

    const-string v1, "0C22D5E56878F9D3"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const-string v0, "Accept"

    const-string v1, "application/json"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    const-string v0, "X-3GPP-Intended-IDENTITY"

    invoke-virtual {v4, v0, p2}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 238
    const-string v0, "Authorization"

    move-object/from16 v1, p5

    invoke-virtual {v4, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    :cond_3
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 241
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object v7

    .line 242
    invoke-static {v7}, Lo/dso;->a(Ljava/lang/String;)Lo/dso;

    move-result-object v0

    iput-object v0, p0, Lo/dsq;->e:Lo/dso;

    .line 243
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v5, v0

    .line 244
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 245
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write([B)V

    .line 247
    :cond_4
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V

    .line 248
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v8

    .line 249
    const-string v9, ""

    .line 250
    const/16 v0, 0x191

    if-ne v8, v0, :cond_6

    .line 251
    const-string v0, "www-Authenticate"

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 252
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 253
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 255
    :cond_5
    goto :goto_0

    :cond_6
    const/16 v0, 0xc8

    if-ne v8, v0, :cond_7

    .line 256
    invoke-static {v4}, Lo/dsq;->d(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 258
    :cond_7
    :goto_0
    invoke-virtual {v3, v8}, Lo/dsp;->e(I)V

    .line 259
    invoke-virtual {v3, v9}, Lo/dsp;->a(Ljava/lang/String;)V

    .line 260
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 261
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/dsp;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    :cond_8
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->success."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    move-object v10, v3

    .line 269
    if-eqz v4, :cond_9

    .line 270
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 272
    :cond_9
    invoke-static {v5}, Lo/dsq;->a(Ljava/io/Closeable;)V

    return-object v10

    .line 265
    :catch_0
    move-exception v7

    .line 266
    :try_start_1
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "getGBAContentFromPost->IOException."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    const/16 v0, 0x62

    invoke-virtual {v3, v0}, Lo/dsp;->e(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    if-eqz v4, :cond_a

    .line 270
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 272
    :cond_a
    invoke-static {v5}, Lo/dsq;->a(Ljava/io/Closeable;)V

    .line 273
    goto :goto_1

    .line 269
    :catchall_0
    move-exception v11

    if-eqz v4, :cond_b

    .line 270
    invoke-virtual {v4}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 272
    :cond_b
    invoke-static {v5}, Lo/dsq;->a(Ljava/io/Closeable;)V

    throw v11

    .line 274
    :goto_1
    return-object v3
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 44
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Lo/dsp;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 278
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGBAContentFromGet urlAddress = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", authorization = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 281
    :cond_0
    new-instance v3, Lo/dsp;

    invoke-direct {v3}, Lo/dsp;-><init>()V

    .line 282
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    :cond_1
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "authorization or urlAddress is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    const/16 v0, 0x63

    invoke-virtual {v3, v0}, Lo/dsp;->e(I)V

    .line 285
    return-object v3

    .line 287
    :cond_2
    const/4 v4, 0x0

    .line 290
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 291
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    .line 292
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 293
    const/16 v0, 0x7530

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 294
    const/16 v0, 0x7530

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 295
    const-string v0, "GET"

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 296
    const-string v0, "User-Agent"

    const-string v1, "Bootstrapping Client Agent"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v0, "Accept-Encoding"

    const-string v1, "identity"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "Accept"

    const-string v1, "*/*"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v0, "Authorization"

    invoke-virtual {v4, v0, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->connect()V

    .line 303
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    .line 304
    const-string v7, ""

    .line 305
    const/16 v0, 0x191

    if-ne v6, v0, :cond_4

    .line 306
    const-string v0, "www-Authenticate"

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 307
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 308
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 310
    :cond_3
    goto :goto_0

    :cond_4
    const/16 v0, 0xc8

    if-ne v6, v0, :cond_5

    .line 311
    invoke-static {v4}, Lo/dsq;->d(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 313
    :cond_5
    :goto_0
    invoke-virtual {v3, v6}, Lo/dsp;->e(I)V

    .line 314
    invoke-virtual {v3, v7}, Lo/dsp;->a(Ljava/lang/String;)V

    .line 316
    :cond_6
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 317
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lo/dsp;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    :cond_7
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->success."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    move-object v6, v3

    .line 325
    if-eqz v4, :cond_8

    .line 326
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    return-object v6

    .line 321
    :catch_0
    move-exception v6

    .line 322
    :try_start_1
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "getGBAContentFromGet->IOException."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 323
    const/16 v0, 0x62

    invoke-virtual {v3, v0}, Lo/dsp;->e(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    if-eqz v4, :cond_a

    .line 326
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_1

    .line 325
    :catchall_0
    move-exception v9

    if-eqz v4, :cond_9

    .line 326
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_9
    throw v9

    .line 329
    :cond_a
    :goto_1
    return-object v3
.end method

.method private c(Landroid/content/Context;Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 11

    .line 335
    const/4 v4, 0x0

    .line 336
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v4

    .line 337
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$raw;->hpe_cert:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v5

    .line 339
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v3

    .line 340
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 341
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ca="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object v2, v3

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 342
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "castr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object v2, v3

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Principal;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    :cond_0
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 346
    goto :goto_0

    .line 345
    :catchall_0
    move-exception v6

    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    throw v6

    .line 348
    :goto_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v6

    .line 349
    invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v7

    .line 350
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 351
    const-string v0, "ca"

    invoke-virtual {v7, v0, v3}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    .line 353
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v8

    .line 354
    invoke-static {v8}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v9

    .line 355
    invoke-virtual {v9, v7}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 357
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v10

    .line 358
    invoke-virtual {v9}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v10, v1, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 359
    new-instance v0, Lo/dsj;

    invoke-virtual {v10}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dsj;-><init>(Ljavax/net/ssl/SSLSocketFactory;)V

    invoke-virtual {p2, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_3
    .catch Ljava/security/cert/CertificateException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 370
    goto :goto_1

    .line 360
    :catch_0
    move-exception v3

    .line 361
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->CertificateException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    goto :goto_1

    .line 362
    :catch_1
    move-exception v3

    .line 363
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    goto :goto_1

    .line 364
    :catch_2
    move-exception v3

    .line 365
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->KeyStoreException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    goto :goto_1

    .line 366
    :catch_3
    move-exception v3

    .line 367
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->KeyManagementException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    goto :goto_1

    .line 368
    :catch_4
    move-exception v3

    .line 369
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "doPostRequest->IOException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 371
    :goto_1
    new-instance v0, Lo/dsq$4;

    invoke-direct {v0, p0}, Lo/dsq$4;-><init>(Lo/dsq;)V

    invoke-virtual {p2, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 382
    return-void
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 126
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "Gba auth step 3."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    const-string v0, "%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static/range {p2 .. p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 128
    invoke-static {}, Lo/drx;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 129
    const-string v0, "bsf.mnc%1$s.mcc%2$s.pub.3gppnetwork.org"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 130
    const-string v0, "Digest "

    const-string v1, " "

    move-object/from16 v2, p5

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsm;->a(Ljava/lang/String;)V

    .line 131
    const-string v0, "nonce"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 132
    const-string v0, "opaque"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 133
    const-string v0, "qop"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 134
    const-string v0, "algorithm"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 135
    move-object/from16 v0, p1

    invoke-static {v0, v10}, Lo/dsm;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dsm$e;

    move-result-object v14

    .line 137
    const/4 v15, 0x0

    .line 138
    if-eqz v14, :cond_0

    .line 139
    iget-object v0, v14, Lo/dsm$e;->a:[B

    invoke-static {v0}, Lo/dsm;->d([B)Ljava/lang/String;

    move-result-object v15

    .line 141
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dsq;->c:Ljava/lang/String;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dsq;->e:Lo/dso;

    move-object/from16 v2, p2

    invoke-static {v14, v2, v0, v1}, Lo/dsm;->c(Lo/dsm$e;Ljava/lang/String;Ljava/lang/String;Lo/dso;)[B

    move-result-object v16

    .line 142
    const-string v0, "GET"

    invoke-static {v7, v9, v15, v0}, Lo/dsm;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 143
    const-string v18, "GET:/"

    .line 144
    invoke-static {}, Lo/dsm;->c()Ljava/lang/String;

    move-result-object v19

    .line 145
    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-static {v10, v0, v12, v1}, Lo/dsm;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 146
    move-object/from16 v0, v17

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lo/dsm;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Digest username=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",realm=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",nonce=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",response=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",uri=\"/\",opaque=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",qop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",nc=00000001,algorithm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",cnonce=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 151
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    invoke-direct {v0, v8, v1}, Lo/dsq;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dsp;

    move-result-object v23

    .line 152
    invoke-virtual/range {v23 .. v23}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_1

    .line 153
    invoke-static/range {v16 .. v16}, Lo/dsm;->d([B)Ljava/lang/String;

    move-result-object v15

    .line 154
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v15

    invoke-virtual/range {v23 .. v23}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lo/dsq;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 155
    :cond_1
    invoke-virtual/range {v23 .. v23}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x62

    if-ne v1, v0, :cond_2

    .line 156
    const/16 v0, 0x62

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 158
    :cond_2
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 163
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "Gba auth step 4."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    const/4 v6, 0x0

    .line 166
    const-string v0, "sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static/range {p2 .. p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 167
    invoke-static {}, Lo/drx;->d()Ljava/lang/String;

    move-result-object v8

    .line 168
    const-string v9, ""

    .line 169
    const-string v0, "Digest "

    const-string v1, " "

    move-object/from16 v2, p4

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsm;->a(Ljava/lang/String;)V

    .line 170
    const-string v0, "[\\S\\s]*(<btid>[\\s\\S]*</btid>)[\\s\\S]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    .line 171
    move-object/from16 v0, p6

    invoke-virtual {v10, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    .line 172
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<btid>"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "</btid>"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 175
    :cond_0
    const-string v0, "realm"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 176
    const-string v0, "nonce"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 177
    invoke-static {}, Lo/dsm;->c()Ljava/lang/String;

    move-result-object v14

    .line 178
    const-string v0, "opaque"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 179
    const-string v0, "algorithm"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 180
    const-string v0, "qop"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 181
    if-nez p5, :cond_1

    .line 182
    const/4 v0, 0x0

    return-object v0

    .line 183
    :cond_1
    const-string v0, "POST"

    move-object/from16 v1, p5

    invoke-static {v9, v12, v1, v0}, Lo/dsm;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 184
    const-string v19, "POST:/"

    .line 185
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-static {v13, v14, v0, v1}, Lo/dsm;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 186
    move-object/from16 v0, v18

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lo/dsm;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Digest username=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",realm=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",nonce=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",response=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",uri=\"/\",opaque=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",qop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",nc=00000001,algorithm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",cnonce=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 191
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v7

    move-object v3, v8

    move-object/from16 v4, p3

    move-object/from16 v5, v22

    invoke-direct/range {v0 .. v5}, Lo/dsq;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/dsp;

    move-result-object v23

    .line 192
    invoke-virtual/range {v23 .. v23}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_3

    .line 193
    if-eqz p2, :cond_2

    .line 194
    const-string v0, "authorization"

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v22

    invoke-static {v1, v2, v0, v3}, Lo/dsh;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 196
    :cond_2
    invoke-virtual/range {v23 .. v23}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 197
    :cond_3
    invoke-virtual/range {v23 .. v23}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x62

    if-ne v1, v0, :cond_4

    .line 198
    const/16 v0, 0x62

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 200
    :cond_4
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 385
    const/4 v2, 0x0

    .line 386
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 388
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 389
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 391
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 392
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 394
    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 396
    invoke-static {v2}, Lo/dsq;->a(Ljava/io/Closeable;)V

    .line 397
    invoke-static {v3}, Lo/dsq;->a(Ljava/io/Closeable;)V

    return-object v6

    .line 396
    :catchall_0
    move-exception v7

    invoke-static {v2}, Lo/dsq;->a(Ljava/io/Closeable;)V

    .line 397
    invoke-static {v3}, Lo/dsq;->a(Ljava/io/Closeable;)V

    throw v7
.end method

.method public static e()Lo/dsq;
    .locals 4

    .line 68
    sget-object v2, Lo/dsq;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 69
    :try_start_0
    sget-object v0, Lo/dsq;->a:Lo/dsq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 70
    new-instance v0, Lo/dsq;

    invoke-direct {v0}, Lo/dsq;-><init>()V

    sput-object v0, Lo/dsq;->a:Lo/dsq;

    .line 72
    :cond_0
    sget-object v0, Lo/dsq;->a:Lo/dsq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 73
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 77
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    const-string v1, "Gba auth step 1."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    const/4 v6, 0x0

    .line 80
    const-string v0, "sip:%1$s@ims.mnc%2$s.mcc%3$s.3gppnetwork.org"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {p2}, Lo/dsh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/dsh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 81
    invoke-static {}, Lo/drx;->d()Ljava/lang/String;

    move-result-object v8

    .line 82
    move-object v0, p0

    move-object v1, p1

    move-object v2, v7

    move-object v3, v8

    move-object v4, p3

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/dsq;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/dsp;

    move-result-object v9

    .line 83
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    sget-object v0, Lo/dsq;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Gba auth step 1. resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lo/dsp;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    :cond_0
    invoke-virtual {v9}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_1

    .line 87
    invoke-virtual {v9}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 88
    :cond_1
    invoke-virtual {v9}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x191

    if-ne v1, v0, :cond_5

    .line 89
    invoke-virtual {v9}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Digest "

    const-string v2, " "

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dsm;->a(Ljava/lang/String;)V

    .line 90
    const-string v0, "realm"

    invoke-static {v0}, Lo/dsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 91
    if-eqz v10, :cond_2

    const-string v0, "@"

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    .line 92
    :goto_0
    if-eqz v11, :cond_3

    array-length v0, v11

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 93
    const/4 v0, 0x1

    aget-object v0, v11, v0

    iput-object v0, p0, Lo/dsq;->c:Ljava/lang/String;

    .line 94
    const-string v0, "3GPP-bootstrapping"

    const/4 v1, 0x0

    aget-object v1, v11, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 95
    invoke-virtual {v9}, Lo/dsp;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lo/dsq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 98
    :cond_3
    const-string v0, ""

    iput-object v0, p0, Lo/dsq;->c:Ljava/lang/String;

    .line 100
    :cond_4
    goto :goto_1

    :cond_5
    invoke-virtual {v9}, Lo/dsp;->a()I

    move-result v0

    const/16 v1, 0x62

    if-ne v1, v0, :cond_6

    .line 101
    const/16 v0, 0x62

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 103
    :cond_6
    :goto_1
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
