.class public Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "AES/CFB/NoPadding"

.field private static final b:[B

.field private static final c:Ljava/lang/String; = "AES"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->b:[B

    return-void

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 9

    .line 132
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 133
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 135
    :cond_1
    const-string v0, "AppLogApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "begin decryptFile "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const/4 v3, 0x0

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v5, 0x0

    .line 141
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 142
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 143
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 144
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 145
    :goto_0
    invoke-virtual {v3, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    if-lez v0, :cond_3

    .line 146
    invoke-static {v6, p1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->b([BLjava/lang/String;)[B

    move-result-object v7

    .line 147
    if-eqz v7, :cond_2

    .line 148
    array-length v0, v7

    const/4 v1, 0x0

    invoke-virtual {v4, v7, v1, v0}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    :cond_2
    goto :goto_0

    .line 154
    :cond_3
    const-string v0, "AES"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 155
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 156
    goto :goto_1

    .line 151
    :catch_0
    move-exception v6

    .line 152
    const-string v0, "AppLogApi"

    const-string v1, "decryptFile IOException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    const-string v0, "AES"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 155
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 156
    goto :goto_1

    .line 154
    :catchall_0
    move-exception v8

    const-string v0, "AES"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 155
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v8

    .line 157
    :goto_1
    return-object v5
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;ZLandroid/content/Context;)Ljava/io/File;
    .locals 14

    .line 42
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p3, :cond_1

    .line 43
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_1
    invoke-static {p1}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const-string v6, ""

    .line 52
    if-eqz p2, :cond_4

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Huawei/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "phoneservice/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 55
    const-string v0, "AES"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "firstfilePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v0, "AES"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "secondfilePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 59
    invoke-static {v9}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;)Z

    move-result v10

    .line 60
    if-nez v10, :cond_2

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_2
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-static {v11}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;)Z

    move-result v12

    .line 65
    if-nez v12, :cond_3

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 70
    const-string v0, "AES"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "local_file"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p3 .. p3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "feedbackuploadlogs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 73
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-static {v8}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;)Z

    move-result v9

    .line 75
    if-nez v9, :cond_5

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 80
    :goto_0
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 83
    const-string v0, "AES"

    const-string v1, "\u521b\u5efa\u6587\u4ef6\u5931\u8d25,\u9700\u8981\u521b\u5efa\u7684\u6587\u4ef6\u5df2\u5b58\u5728"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    return-object v7

    .line 88
    :cond_6
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 89
    const-string v0, "AES"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encrypfile"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 91
    const/16 v0, 0x400

    new-array v8, v0, [B

    .line 92
    const/4 v9, 0x0

    .line 93
    :goto_1
    invoke-virtual {v4, v8}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v9, v0

    if-lez v0, :cond_8

    .line 94
    const/4 v0, 0x0

    invoke-static {v8, v0, v9, v3}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a([BIILjava/lang/String;)[B

    move-result-object v10

    .line 95
    if-eqz v10, :cond_7

    .line 96
    array-length v0, v10

    const/4 v1, 0x0

    invoke-virtual {v5, v10, v1, v0}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :cond_7
    goto :goto_1

    .line 110
    :cond_8
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 111
    const-string v0, "AES"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 112
    goto :goto_2

    .line 99
    :catch_0
    move-exception v8

    .line 100
    const-string v0, "AES"

    const-string v1, "FileNotFound"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    const/4 v7, 0x0

    .line 110
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 111
    const-string v0, "AES"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 112
    goto :goto_2

    .line 104
    :catch_1
    move-exception v8

    .line 105
    const-string v0, "AES"

    const-string v1, "IOException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    const/4 v7, 0x0

    .line 110
    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 111
    const-string v0, "AES"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 112
    goto :goto_2

    .line 110
    :catchall_0
    move-exception v13

    const-string v0, "AES"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 111
    const-string v0, "AES"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v13

    .line 115
    :goto_2
    if-eqz v7, :cond_9

    .line 116
    const-string v0, "AES"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryptFile"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :cond_9
    return-object v7
.end method

.method private static a(ILjava/lang/String;)Ljavax/crypto/Cipher;
    .locals 4

    .line 227
    const-string v0, "AES/CFB/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 228
    invoke-static {p1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v2, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->b:[B

    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v3, p0, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 229
    return-object v3
.end method

.method private static a(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 5

    .line 241
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 242
    const/16 v0, 0x10

    new-array v3, v0, [B

    .line 244
    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    if-ge v4, v0, :cond_0

    array-length v0, v3

    const/16 v0, 0x10

    if-ge v4, v0, :cond_0

    .line 245
    aget-byte v0, v2, v4

    aput-byte v0, v3, v4

    .line 244
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 248
    :cond_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method private static a(Ljava/io/File;)Z
    .locals 2

    .line 252
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 253
    const-string v0, "AES"

    const-string v1, "file is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x0

    return v0

    .line 256
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 257
    const-string v0, "AES"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 259
    const-string v0, "AES"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939\u5931\u8d25"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const/4 v0, 0x0

    return v0

    .line 263
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static a([BIILjava/lang/String;)[B
    .locals 3

    .line 189
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0, p3}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(ILjava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 190
    :catch_0
    move-exception v2

    .line 192
    const-string v0, "AES"

    const-string v1, "AES:encrypt Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static a([BLjava/lang/String;)[B
    .locals 3

    .line 171
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0, p1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(ILjava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 172
    :catch_0
    move-exception v2

    .line 174
    const-string v0, "AES"

    const-string v1, "AES encrypt:encrypt Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static b([BLjava/lang/String;)[B
    .locals 3

    .line 208
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0, p1}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(ILjava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 209
    :catch_0
    move-exception v2

    .line 211
    const-string v0, "AES"

    const-string v1, "AES decrypt:decrypt Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
