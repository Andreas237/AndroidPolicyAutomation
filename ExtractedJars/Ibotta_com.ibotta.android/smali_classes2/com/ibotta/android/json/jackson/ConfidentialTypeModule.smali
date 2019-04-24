.class public Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;
.super Lcom/fasterxml/jackson/databind/module/SimpleModule;
.source "ConfidentialTypeModule.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;,
        Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;
    }
.end annotation


# instance fields
.field private final cipher:Ljavax/crypto/Cipher;

.field private final json:Lcom/ibotta/android/json/IbottaJson;

.field private final key:Ljavax/crypto/spec/SecretKeySpec;

.field private final spec:Ljava/security/spec/AlgorithmParameterSpec;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljavax/crypto/NoSuchPaddingException;
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/module/SimpleModule;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 44
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "SHA-256"

    .line 49
    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 50
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/security/MessageDigest;->update([B)V

    const/16 p1, 0x20

    .line 51
    new-array p1, p1, [B

    .line 52
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    array-length v3, p1

    invoke-static {v2, v1, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const-string v2, "AES/CBC/PKCS5Padding"

    .line 54
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    .line 55
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->key:Ljavax/crypto/spec/SecretKeySpec;

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->getIV()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->spec:Ljava/security/spec/AlgorithmParameterSpec;

    .line 57
    sget-object p1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->json:Lcom/ibotta/android/json/IbottaJson;

    .line 59
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    .line 60
    new-instance v0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialSerializer;-><init>(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->addSerializer(Lcom/fasterxml/jackson/databind/JsonSerializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    .line 61
    new-instance v0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule$ConfidentialDeserializer;-><init>(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;Ljava/lang/Class;)V

    invoke-virtual {p0, p2, v0}, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/module/SimpleModule;

    goto :goto_0

    :cond_0
    return-void

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "No confidential classes set"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "JSON encryption key null or empty: %s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method static synthetic access$000(Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;)Lcom/ibotta/android/json/IbottaJson;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->json:Lcom/ibotta/android/json/IbottaJson;

    return-object p0
.end method

.method private getIV()Ljava/security/spec/AlgorithmParameterSpec;
    .locals 2

    const/16 v0, 0x10

    .line 66
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    .line 68
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v0}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    return-object v1

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public decrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    iget-object v1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->key:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->spec:Ljava/security/spec/AlgorithmParameterSpec;

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 81
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Base64;->decodeBase64([B)[B

    move-result-object p1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 83
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public encrypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    iget-object v1, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->key:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v2, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->spec:Ljava/security/spec/AlgorithmParameterSpec;

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 76
    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Base64;->encodeBase64([B)[B

    move-result-object p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method protected getCipher()Ljavax/crypto/Cipher;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/json/jackson/ConfidentialTypeModule;->cipher:Ljavax/crypto/Cipher;

    return-object v0
.end method
