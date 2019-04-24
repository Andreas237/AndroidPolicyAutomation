.class public Lorg/jivesoftware/smack/util/stringencoder/Base64;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;
    }
.end annotation


# static fields
.field private static base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final decode(Ljava/lang/String;)[B
    .locals 1

    .line 86
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base64;->base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;

    invoke-interface {v0, p0}, Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;->decode(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static final decode([B)[B
    .locals 3

    .line 90
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base64;->base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;

    array-length v1, p0

    const/4 v2, 0x0

    invoke-interface {v0, p0, v2, v1}, Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;->decode([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static final decode([BII)[B
    .locals 1

    .line 94
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base64;->base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;

    invoke-interface {v0, p0, p1, p2}, Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;->decode([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static final decodeToString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 68
    invoke-static {p0}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v2

    .line 70
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 71
    :catch_0
    move-exception v3

    .line 72
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 not supported"

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final decodeToString([BII)Ljava/lang/String;
    .locals 4

    .line 77
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->decode([BII)[B

    move-result-object v2

    .line 79
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 80
    :catch_0
    move-exception v3

    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 not supported"

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 35
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encodeToString([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 36
    :catch_0
    move-exception v2

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 not supported"

    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final encode([B)[B
    .locals 2

    .line 60
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encode([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static final encode([BII)[B
    .locals 1

    .line 64
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/Base64;->base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;

    invoke-interface {v0, p0, p1, p2}, Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;->encode([BII)[B

    move-result-object v0

    return-object v0
.end method

.method public static final encodeToString([B)Ljava/lang/String;
    .locals 4

    .line 42
    invoke-static {p0}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encode([B)[B

    move-result-object v2

    .line 44
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 45
    :catch_0
    move-exception v3

    .line 46
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static final encodeToString([BII)Ljava/lang/String;
    .locals 4

    .line 51
    invoke-static {p0, p1, p2}, Lorg/jivesoftware/smack/util/stringencoder/Base64;->encode([BII)[B

    move-result-object v2

    .line 53
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 54
    :catch_0
    move-exception v3

    .line 55
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static setEncoder(Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;)V
    .locals 1

    .line 29
    const-string v0, "encoder must no be null"

    invoke-static {p0, v0}, Lorg/jivesoftware/smack/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    sput-object p0, Lorg/jivesoftware/smack/util/stringencoder/Base64;->base64encoder:Lorg/jivesoftware/smack/util/stringencoder/Base64$Encoder;

    .line 31
    return-void
.end method
