.class public final Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/util/stringencoder/StringEncoder;


# static fields
.field private static final BASE64_ENCODER_FLAGS:I = 0xa

.field private static instance:Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;

    invoke-direct {v0}, Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;-><init>()V

    sput-object v0, Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;->instance:Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method public static getInstance()Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;
    .locals 1

    .line 37
    sget-object v0, Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;->instance:Lorg/jivesoftware/smack/util/stringencoder/android/AndroidBase64UrlSafeEncoder;

    return-object v0
.end method


# virtual methods
.method public decode(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 51
    const/16 v0, 0xa

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 53
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 54
    :catch_0
    move-exception v3

    .line 55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 not supported"

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 43
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 44
    :catch_0
    move-exception v2

    .line 45
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "UTF-8 not supported"

    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
