.class public Lo/fgn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fgn$e;
    }
.end annotation


# static fields
.field private static final c:[B


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lo/fgn$e;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 38
    const/16 v0, 0x100

    new-array v0, v0, [B

    sput-object v0, Lo/fgn;->c:[B

    .line 41
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x100

    if-ge v3, v0, :cond_0

    .line 42
    sget-object v0, Lo/fgn;->c:[B

    const/4 v1, -0x1

    aput-byte v1, v0, v3

    .line 41
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 43
    :cond_0
    const/16 v3, 0x41

    :goto_1
    const/16 v0, 0x5a

    if-gt v3, v0, :cond_1

    .line 44
    sget-object v0, Lo/fgn;->c:[B

    add-int/lit8 v1, v3, -0x41

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 43
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 45
    :cond_1
    const/16 v3, 0x61

    :goto_2
    const/16 v0, 0x7a

    if-gt v3, v0, :cond_2

    .line 46
    sget-object v0, Lo/fgn;->c:[B

    add-int/lit8 v1, v3, 0x1a

    add-int/lit8 v1, v1, -0x61

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 45
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x30

    :goto_3
    const/16 v0, 0x39

    if-gt v3, v0, :cond_3

    .line 48
    sget-object v0, Lo/fgn;->c:[B

    add-int/lit8 v1, v3, 0x34

    add-int/lit8 v1, v1, -0x30

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 47
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 49
    :cond_3
    sget-object v0, Lo/fgn;->c:[B

    const/16 v1, 0x3e

    const/16 v2, 0x2b

    aput-byte v1, v0, v2

    .line 50
    sget-object v0, Lo/fgn;->c:[B

    const/16 v1, 0x3f

    const/16 v2, 0x2f

    aput-byte v1, v0, v2

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const-string v0, "GetAgreementPacker"

    iput-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fgn;->e:Lo/fgn$e;

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lo/fgn;->d:Ljava/lang/String;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fgn;->g:Ljava/lang/String;

    .line 72
    iput-object p1, p0, Lo/fgn;->a:Landroid/content/Context;

    .line 73
    new-instance v0, Lo/fgn$e;

    invoke-direct {v0, p2}, Lo/fgn$e;-><init>(I)V

    iput-object v0, p0, Lo/fgn;->e:Lo/fgn$e;

    .line 74
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 2

    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/fgn;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/privaces/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 78
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v1

    .line 79
    const-string v0, "UTF-8"

    invoke-interface {v1, p0, v0}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 80
    return-object v1
.end method

.method public static b([B)Lorg/xmlpull/v1/XmlPullParser;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 85
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    .line 86
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "UTF-8"

    invoke-interface {v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 87
    return-object v2
.end method

.method public static c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 93
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 94
    :cond_0
    return-void

    .line 96
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v0

    invoke-interface {v0, p2}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 97
    return-void
.end method

.method private e([B)[B
    .locals 10

    .line 211
    array-length v0, p1

    add-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x4

    mul-int/lit8 v3, v0, 0x3

    .line 212
    array-length v0, p1

    if-lez v0, :cond_0

    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p1, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_0

    .line 214
    add-int/lit8 v3, v3, -0x1

    .line 216
    :cond_0
    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    array-length v0, p1

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, p1, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_1

    .line 218
    add-int/lit8 v3, v3, -0x1

    .line 220
    :cond_1
    new-array v4, v3, [B

    .line 221
    const/4 v5, 0x0

    .line 222
    const/4 v6, 0x0

    .line 223
    const/4 v7, 0x0

    .line 224
    const/4 v8, 0x0

    :goto_0
    array-length v0, p1

    if-ge v8, v0, :cond_3

    .line 226
    sget-object v0, Lo/fgn;->c:[B

    aget-byte v1, p1, v8

    and-int/lit16 v1, v1, 0xff

    aget-byte v9, v0, v1

    .line 227
    if-ltz v9, :cond_2

    .line 229
    shl-int/lit8 v6, v6, 0x6

    .line 230
    add-int/lit8 v5, v5, 0x6

    .line 231
    or-int/2addr v6, v9

    .line 232
    const/16 v0, 0x8

    if-lt v5, v0, :cond_2

    .line 234
    add-int/lit8 v5, v5, -0x8

    .line 235
    move v0, v7

    add-int/lit8 v7, v7, 0x1

    shr-int v1, v6, v5

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v4, v0

    .line 224
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 239
    :cond_3
    array-length v0, v4

    if-eq v7, v0, :cond_4

    .line 241
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 245
    :cond_4
    return-object v4
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 293
    iget-object v0, p0, Lo/fgn;->g:Ljava/lang/String;

    return-object v0
.end method

.method protected b(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 153
    const/4 v4, 0x0

    .line 156
    :try_start_0
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0}, Lo/fgn;->b([B)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v5

    .line 157
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v6

    .line 158
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v6, :cond_4

    .line 160
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 161
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 164
    :pswitch_0
    goto/16 :goto_1

    .line 167
    :pswitch_1
    const-string v0, "result"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const-string v0, "resultCode"

    const/4 v1, 0x0

    invoke-interface {v5, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 172
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 174
    const-string v0, "agreementContent"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 176
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v8

    .line 179
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fgn;->e([B)[B

    move-result-object v9

    .line 182
    iget-object v0, p0, Lo/fgn;->e:Lo/fgn$e;

    iget-object v10, v0, Lo/fgn$e;->a:Ljava/lang/String;

    .line 183
    invoke-direct {p0}, Lo/fgn;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, v9}, Lo/fgn;->d(Ljava/lang/String;Ljava/lang/String;[B)Z

    .line 185
    :cond_1
    goto :goto_1

    .line 186
    :cond_2
    const-string v0, "agreementVer"

    invoke-virtual {v0, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 188
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fgn;->g:Ljava/lang/String;

    .line 195
    :cond_3
    :goto_1
    :pswitch_2
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v6

    .line 196
    goto/16 :goto_0

    .line 205
    :cond_4
    goto :goto_2

    .line 198
    :catch_0
    move-exception v5

    .line 200
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RuntimeException unPack error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    goto :goto_2

    .line 202
    :catch_1
    move-exception v5

    .line 204
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unPack error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :goto_2
    iget-object v0, p0, Lo/fgn;->d:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected c(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 101
    const/4 v4, 0x0

    .line 102
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 105
    :try_start_0
    invoke-static {v5}, Lo/fgn;->a(Ljava/io/OutputStream;)Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v6

    .line 106
    const-string v0, "UTF-8"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 107
    const-string v0, "GetAgreementReq"

    const/4 v1, 0x0

    invoke-interface {v6, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 108
    const-string v0, "version"

    iget-object v1, p0, Lo/fgn;->e:Lo/fgn$e;

    iget-object v1, v1, Lo/fgn$e;->e:Ljava/lang/String;

    invoke-static {v6, v0, v1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "agreementID"

    iget-object v1, p0, Lo/fgn;->e:Lo/fgn$e;

    invoke-virtual {v1}, Lo/fgn$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v0, v1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "reqClientType"

    iget-object v1, p0, Lo/fgn;->e:Lo/fgn$e;

    invoke-virtual {v1}, Lo/fgn$e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v0, v1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "languageCode"

    iget-object v1, p0, Lo/fgn;->e:Lo/fgn$e;

    iget-object v1, v1, Lo/fgn$e;->a:Ljava/lang/String;

    invoke-static {v6, v0, v1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v0, "countryCode"

    iget-object v1, p0, Lo/fgn;->e:Lo/fgn$e;

    iget-object v1, v1, Lo/fgn$e;->c:Ljava/lang/String;

    invoke-static {v6, v0, v1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    const-string v0, "agreementOldVer"

    invoke-static {v6, v0, p1}, Lo/fgn;->c(Lorg/xmlpull/v1/XmlSerializer;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_0
    const-string v0, "GetAgreementReq"

    const/4 v1, 0x0

    invoke-interface {v6, v1, v0}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 119
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 120
    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 135
    :try_start_1
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 140
    goto/16 :goto_1

    .line 137
    :catch_0
    move-exception v6

    .line 139
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    goto/16 :goto_1

    .line 123
    :catch_1
    move-exception v6

    .line 125
    :try_start_2
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :try_start_3
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 140
    goto :goto_1

    .line 137
    :catch_2
    move-exception v6

    .line 139
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    goto :goto_1

    .line 127
    :catch_3
    move-exception v6

    .line 129
    :try_start_4
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 135
    :try_start_5
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 140
    goto :goto_1

    .line 137
    :catch_4
    move-exception v6

    .line 139
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    goto :goto_1

    .line 133
    :catchall_0
    move-exception v7

    .line 135
    :try_start_6
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 140
    goto :goto_0

    .line 137
    :catch_5
    move-exception v8

    .line 139
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pack error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    throw v7

    .line 142
    :goto_1
    return-object v4
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;[B)Z
    .locals 10

    .line 251
    const/4 v4, 0x0

    .line 255
    :try_start_0
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 256
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 258
    const/4 v6, 0x0

    .line 274
    nop

    .line 258
    .line 276
    .line 277
    .line 278
    .line 279
    return v6

    .line 262
    :cond_0
    :try_start_1
    new-instance v6, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 263
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 264
    invoke-virtual {v4, p3}, Ljava/io/FileOutputStream;->write([B)V

    .line 265
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 266
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fgn;->d:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    if-eqz v4, :cond_4

    .line 276
    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 279
    goto/16 :goto_3

    .line 277
    :catch_0
    move-exception v5

    .line 278
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    goto/16 :goto_3

    .line 267
    :catch_1
    move-exception v5

    .line 268
    :try_start_3
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement writeAgreement FileNotFoundException:!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 269
    const/4 v6, 0x0

    .line 274
    if-eqz v4, :cond_1

    .line 276
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 279
    goto :goto_0

    .line 277
    :catch_2
    move-exception v7

    .line 278
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    :cond_1
    :goto_0
    return v6

    .line 270
    :catch_3
    move-exception v5

    .line 271
    :try_start_5
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement writeAgreement IOException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 272
    const/4 v6, 0x0

    .line 274
    if-eqz v4, :cond_2

    .line 276
    :try_start_6
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 279
    goto :goto_1

    .line 277
    :catch_4
    move-exception v7

    .line 278
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :cond_2
    :goto_1
    return v6

    .line 274
    :catchall_0
    move-exception v8

    if-eqz v4, :cond_3

    .line 276
    :try_start_7
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 279
    goto :goto_2

    .line 277
    :catch_5
    move-exception v9

    .line 278
    iget-object v0, p0, Lo/fgn;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAgreement Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    :cond_3
    :goto_2
    throw v8

    .line 282
    :cond_4
    :goto_3
    const/4 v0, 0x1

    return v0
.end method
