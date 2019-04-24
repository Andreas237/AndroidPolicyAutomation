.class public Lcom/huawei/logupload/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "AES/CFB/NoPadding"

.field private static final b:[B

.field private static final c:Ljava/lang/String; = "LogUpload Service"

.field private static d:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/logupload/c/a;->b:[B

    .line 27
    const-string v0, "+kTSSQbOlEBvQA3jZLxRfydVaWGS5AoGADS0p/+hWnuXHS78YJOX47VRNq86bU6CAR4q3jv7ihMkEJvtQQxA0/eLwILKBNBA1ar1bkDxsoZCTJE7zM3II2DbiaWQOvPZ1p+VPRJ3vnpnP14JbRr7glCV1ZjU6gL55EGb6v+Oid+xmg9QSkrJzCaByOEaCZ24Izxjg80HhrRY="

    sput-object v0, Lcom/huawei/logupload/c/a;->d:Ljava/lang/String;

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

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 12

    .line 46
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/phoneservice/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 54
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "filePath"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 58
    const-string v0, "LogUpload Service"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 60
    const-string v0, "LogUpload Service"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939\u5931\u8d25"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 66
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "local_file"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    const-string v0, "LogUpload Service"

    const-string v1, "\u521b\u5efa\u6587\u4ef6\u5931\u8d25\uff0c\u9700\u8981\u521b\u5efa\u7684\u6587\u4ef6\u5df2\u5b58\u5728"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    const-string v0, "LogUpload Service"

    const-string v1, "encrypfile is deleted successfully!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const-string v0, "LogUpload Service"

    const-string v1, "encrypfile is deleted failed!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    :cond_4
    :goto_0
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 83
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "encrypfile"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 85
    const/16 v0, 0x400

    new-array v9, v0, [B

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    invoke-static {v9, p1}, Lcom/huawei/logupload/c/a;->a([BLjava/lang/String;)[B

    move-result-object v10

    .line 88
    if-eqz v10, :cond_6

    .line 89
    array-length v0, v10

    const/4 v1, 0x0

    invoke-virtual {v4, v10, v1, v0}, Ljava/io/FileOutputStream;->write([BII)V

    .line 86
    :cond_6
    :goto_1
    invoke-virtual {v3, v9}, Ljava/io/FileInputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-gtz v0, :cond_5

    .line 92
    goto :goto_2

    :catch_0
    move-exception v9

    .line 93
    const-string v0, "LogUpload Service"

    const-string v1, "FileNotFound"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    const/4 v8, 0x0

    .line 103
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 104
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_3

    .line 97
    :catch_1
    move-exception v9

    .line 98
    const-string v0, "LogUpload Service"

    const-string v1, "IOException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    const/4 v8, 0x0

    .line 103
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 104
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_3

    .line 102
    :catchall_0
    move-exception v11

    .line 103
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 104
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 105
    throw v11

    .line 103
    :goto_2
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 104
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 108
    :goto_3
    if-eqz v8, :cond_7

    .line 109
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "encryptFile"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    :cond_7
    return-object v8
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 30
    sget-object v0, Lcom/huawei/logupload/c/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private static a(ILjava/lang/String;)Ljavax/crypto/Cipher;
    .locals 4

    .line 190
    const-string v0, "AES/CFB/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 191
    invoke-static {p1}, Lcom/huawei/logupload/c/a;->b(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v2, Lcom/huawei/logupload/c/a;->b:[B

    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v3, p0, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 192
    return-object v3
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 34
    sput-object p0, Lcom/huawei/logupload/c/a;->d:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public static a([BLjava/lang/String;)[B
    .locals 3

    .line 158
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0, p1}, Lcom/huawei/logupload/c/a;->a(ILjava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 159
    :catch_0
    move-exception v2

    .line 161
    const-string v0, "LogUpload Service"

    const-string v1, "AES:encrypt Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static b(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 9

    .line 122
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 123
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_1
    const/4 v3, 0x0

    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 130
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 131
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "/phoneservice/2/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 133
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 134
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 135
    goto :goto_0

    .line 136
    :cond_2
    invoke-static {v6, p1}, Lcom/huawei/logupload/c/a;->b([BLjava/lang/String;)[B

    move-result-object v7

    .line 137
    if-eqz v7, :cond_3

    .line 138
    array-length v0, v7

    const/4 v1, 0x0

    invoke-virtual {v4, v7, v1, v0}, Ljava/io/FileOutputStream;->write([BII)V

    .line 135
    :cond_3
    :goto_0
    invoke-virtual {v3, v6}, Ljava/io/FileInputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-gtz v0, :cond_2

    .line 141
    goto :goto_1

    :catch_0
    move-exception v6

    .line 142
    const-string v0, "LogUpload Service"

    const-string v1, "IOException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 145
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    goto :goto_2

    .line 143
    :catchall_0
    move-exception v8

    .line 144
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 145
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 146
    throw v8

    .line 144
    :goto_1
    const-string v0, "LogUpload Service"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 145
    const-string v0, "LogUpload Service"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 147
    :goto_2
    return-object v5
.end method

.method private static b(Ljava/lang/String;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 5

    .line 205
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 206
    const/16 v0, 0x10

    new-array v3, v0, [B

    .line 208
    const/4 v4, 0x0

    goto :goto_0

    .line 209
    :cond_0
    aget-byte v0, v2, v4

    aput-byte v0, v3, v4

    .line 208
    add-int/lit8 v4, v4, 0x1

    :goto_0
    array-length v0, v2

    if-ge v4, v0, :cond_1

    array-length v0, v3

    const/16 v0, 0x10

    if-lt v4, v0, :cond_0

    .line 212
    :cond_1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, v3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public static b([BLjava/lang/String;)[B
    .locals 3

    .line 174
    const/4 v0, 0x2

    :try_start_0
    invoke-static {v0, p1}, Lcom/huawei/logupload/c/a;->a(ILjava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 175
    :catch_0
    move-exception v2

    .line 177
    const-string v0, "LogUpload Service"

    const-string v1, "AES:decrypt Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
