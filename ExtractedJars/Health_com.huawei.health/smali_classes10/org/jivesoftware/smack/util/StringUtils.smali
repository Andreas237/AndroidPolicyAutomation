.class public Lorg/jivesoftware/smack/util/StringUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/util/StringUtils$c;
    }
.end annotation


# static fields
.field public static final AMP_ENCODE:Ljava/lang/String; = "&amp;"

.field public static final APOS_ENCODE:Ljava/lang/String; = "&apos;"

.field public static final GT_ENCODE:Ljava/lang/String; = "&gt;"

.field public static final HEX_CHARS:[C

.field public static final LT_ENCODE:Ljava/lang/String; = "&lt;"

.field public static final MD5:Ljava/lang/String; = "MD5"

.field public static final QUOTE_ENCODE:Ljava/lang/String; = "&quot;"

.field private static final SECURE_RANDOM:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<Ljava/security/SecureRandom;>;"
        }
    .end annotation
.end field

.field public static final SHA1:Ljava/lang/String; = "SHA-1"

.field public static final USASCII:Ljava/lang/String; = "US-ASCII"

.field public static final UTF8:Ljava/lang/String; = "UTF-8"

.field private static final numbersAndLetters:[C

.field private static final randGen:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<Ljava/security/SecureRandom;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "0123456789abcdef"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils;->HEX_CHARS:[C

    .line 224
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$5;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/StringUtils$5;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils;->randGen:Ljava/lang/ThreadLocal;

    .line 231
    const-string v0, "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils;->numbersAndLetters:[C

    .line 247
    new-instance v0, Lorg/jivesoftware/smack/util/StringUtils$4;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/StringUtils$4;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/util/StringUtils;->SECURE_RANDOM:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static collectionToString(Ljava/util/Collection;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+Ljava/lang/Object;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 350
    const-string v0, " "

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/StringUtils;->toStringBuilder(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static encodeHex([B)Ljava/lang/String;
    .locals 6

    .line 206
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [C

    .line 207
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_0

    .line 208
    aget-byte v0, p0, v4

    and-int/lit16 v5, v0, 0xff

    .line 209
    mul-int/lit8 v0, v4, 0x2

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils;->HEX_CHARS:[C

    ushr-int/lit8 v2, v5, 0x4

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 210
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils;->HEX_CHARS:[C

    and-int/lit8 v2, v5, 0xf

    aget-char v1, v1, v2

    aput-char v1, v3, v0

    .line 207
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 212
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static escapeForXML(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 36
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static escapeForXml(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 46
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->e:Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;Lorg/jivesoftware/smack/util/StringUtils$c;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private static escapeForXml(Ljava/lang/CharSequence;Lorg/jivesoftware/smack/util/StringUtils$c;)Ljava/lang/CharSequence;
    .locals 10

    .line 98
    if-nez p0, :cond_0

    .line 99
    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 102
    new-instance v5, Ljava/lang/StringBuilder;

    int-to-double v0, v4

    const-wide v2, 0x3ff4cccccccccccdL    # 1.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    :goto_0
    if-ge v9, v4, :cond_3

    .line 108
    const/4 v6, 0x0

    .line 109
    invoke-interface {p0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    .line 110
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$2;->b:[I

    invoke-virtual {p1}, Lorg/jivesoftware/smack/util/StringUtils$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 112
    :pswitch_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 114
    :sswitch_0
    const-string v6, "&lt;"

    .line 115
    goto/16 :goto_4

    .line 117
    :sswitch_1
    const-string v6, "&gt;"

    .line 118
    goto/16 :goto_4

    .line 120
    :sswitch_2
    const-string v6, "&amp;"

    .line 121
    goto/16 :goto_4

    .line 123
    :sswitch_3
    const-string v6, "&quot;"

    .line 124
    goto/16 :goto_4

    .line 126
    :sswitch_4
    const-string v6, "&apos;"

    .line 127
    goto/16 :goto_4

    .line 129
    :goto_1
    goto/16 :goto_4

    .line 133
    :pswitch_1
    sparse-switch v7, :sswitch_data_1

    goto :goto_2

    .line 135
    :sswitch_5
    const-string v6, "&lt;"

    .line 136
    goto/16 :goto_4

    .line 138
    :sswitch_6
    const-string v6, "&amp;"

    .line 139
    goto :goto_4

    .line 141
    :sswitch_7
    const-string v6, "&quot;"

    .line 142
    goto :goto_4

    .line 144
    :sswitch_8
    const-string v6, "&apos;"

    .line 145
    goto :goto_4

    .line 147
    :goto_2
    goto :goto_4

    .line 151
    :pswitch_2
    sparse-switch v7, :sswitch_data_2

    goto :goto_3

    .line 153
    :sswitch_9
    const-string v6, "&lt;"

    .line 154
    goto :goto_4

    .line 156
    :sswitch_a
    const-string v6, "&amp;"

    .line 157
    goto :goto_4

    .line 159
    :sswitch_b
    const-string v6, "&apos;"

    .line 160
    goto :goto_4

    .line 162
    :goto_3
    goto :goto_4

    .line 166
    :pswitch_3
    sparse-switch v7, :sswitch_data_3

    goto :goto_4

    .line 168
    :sswitch_c
    const-string v6, "&lt;"

    .line 169
    goto :goto_4

    .line 171
    :sswitch_d
    const-string v6, "&amp;"

    .line 172
    .line 178
    :goto_4
    if-eqz v6, :cond_2

    .line 179
    if-gt v8, v9, :cond_1

    .line 180
    invoke-virtual {v5, p0, v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 182
    :cond_1
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 183
    add-int/lit8 v9, v9, 0x1

    move v8, v9

    goto/16 :goto_0

    .line 185
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 188
    :cond_3
    if-nez v8, :cond_4

    .line 189
    return-object p0

    .line 191
    :cond_4
    if-gt v8, v9, :cond_5

    .line 192
    invoke-virtual {v5, p0, v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 194
    :cond_5
    return-object v5

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_3
        0x26 -> :sswitch_2
        0x27 -> :sswitch_4
        0x3c -> :sswitch_0
        0x3e -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x22 -> :sswitch_7
        0x26 -> :sswitch_6
        0x27 -> :sswitch_8
        0x3c -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x26 -> :sswitch_a
        0x27 -> :sswitch_b
        0x3c -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x26 -> :sswitch_d
        0x3c -> :sswitch_c
    .end sparse-switch
.end method

.method public static escapeForXmlAttribute(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 57
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->c:Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;Lorg/jivesoftware/smack/util/StringUtils$c;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static escapeForXmlAttributeApos(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 72
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->a:Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;Lorg/jivesoftware/smack/util/StringUtils$c;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static escapeForXmlText(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1

    .line 83
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils$c;->d:Lorg/jivesoftware/smack/util/StringUtils$c;

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/StringUtils;->escapeForXml(Ljava/lang/CharSequence;Lorg/jivesoftware/smack/util/StringUtils$c;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method private static getPrintableChar(B)C
    .locals 3

    .line 274
    and-int/lit16 v2, p0, 0xff

    .line 275
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils;->numbersAndLetters:[C

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils;->numbersAndLetters:[C

    array-length v1, v1

    rem-int v1, v2, v1

    aget-char v0, v0, v1

    return v0
.end method

.method public static declared-synchronized hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v1, Lorg/jivesoftware/smack/util/StringUtils;

    monitor-enter v1

    .line 199
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smack/util/SHA1;->hex(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static insecureRandomString(I)Ljava/lang/String;
    .locals 5

    .line 235
    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    .line 236
    const/4 v0, 0x0

    return-object v0

    .line 239
    :cond_0
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils;->randGen:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/security/SecureRandom;

    .line 240
    new-array v3, p0, [C

    .line 241
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_1

    .line 242
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils;->numbersAndLetters:[C

    sget-object v1, Lorg/jivesoftware/smack/util/StringUtils;->numbersAndLetters:[C

    array-length v1, v1

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    aget-char v0, v0, v1

    aput-char v0, v3, v4

    .line 241
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 244
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static isEmpty(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 340
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isNotEmpty(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 290
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs isNotEmpty([Ljava/lang/CharSequence;)Z
    .locals 5

    .line 310
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 311
    invoke-static {v4}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    const/4 v0, 0x0

    return v0

    .line 310
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 315
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static isNullOrEmpty(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 300
    if-eqz p0, :cond_0

    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs isNullOrEmpty([Ljava/lang/CharSequence;)Z
    .locals 5

    .line 325
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 326
    invoke-static {v4}, Lorg/jivesoftware/smack/util/StringUtils;->isNotEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 327
    const/4 v0, 0x0

    return v0

    .line 325
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 330
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static maybeToString(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .line 411
    if-nez p0, :cond_0

    .line 412
    const/4 v0, 0x0

    return-object v0

    .line 414
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomString(I)Ljava/lang/String;
    .locals 4

    .line 255
    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    .line 256
    const/4 v0, 0x0

    return-object v0

    .line 259
    :cond_0
    new-array v1, p0, [B

    .line 260
    sget-object v0, Lorg/jivesoftware/smack/util/StringUtils;->SECURE_RANDOM:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/SecureRandom;

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 261
    new-array v2, p0, [C

    .line 262
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_1

    .line 263
    aget-byte v0, v1, v3

    invoke-static {v0}, Lorg/jivesoftware/smack/util/StringUtils;->getPrintableChar(B)C

    move-result v0

    aput-char v0, v2, v3

    .line 262
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 265
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static requireNotNullOrEmpty(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<CS::Ljava/lang/CharSequence;>(TCS;Ljava/lang/String;)TCS;"
        }
    .end annotation

    .line 398
    invoke-static {p0}, Lorg/jivesoftware/smack/util/StringUtils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 399
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 401
    :cond_0
    return-object p0
.end method

.method public static returnIfNotEmptyTrimmed(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 373
    if-nez p0, :cond_0

    .line 374
    const/4 v0, 0x0

    return-object v0

    .line 375
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 376
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 377
    return-object v1

    .line 379
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static toBytes(Ljava/lang/String;)[B
    .locals 3

    .line 217
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 219
    :catch_0
    move-exception v2

    .line 220
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 encoding not supported by platform"

    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static toStringBuilder(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<+Ljava/lang/Object;>;Ljava/lang/String;)Ljava/lang/StringBuilder;"
        }
    .end annotation

    .line 361
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x14

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 362
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 363
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 364
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    :cond_0
    goto :goto_0

    .line 369
    :cond_1
    return-object v2
.end method
