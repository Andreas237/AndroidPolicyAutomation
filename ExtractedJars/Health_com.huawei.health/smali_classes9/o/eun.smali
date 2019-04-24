.class public Lo/eun;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eun$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Lo/eun;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eun;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 145
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 147
    const/4 v0, 0x0

    return-object v0

    .line 153
    :cond_0
    :try_start_0
    new-instance v0, Lo/eun$a;

    invoke-direct {v0, p0}, Lo/eun$a;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/huawei/hihealthservice/old/db/util/EncryptUtil;->decrypter(Ljava/lang/String;Lcom/huawei/hihealthservice/old/util/IEncryptManager;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 158
    goto :goto_0

    .line 155
    :catch_0
    move-exception v5

    .line 156
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "desEncrypt(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 162
    :goto_0
    return-object v4
.end method

.method private static a(Landroid/content/Context;)[B
    .locals 10

    .line 77
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3f1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v5

    .line 79
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7d9

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v6

    .line 80
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v7

    .line 81
    const/4 v8, 0x0

    .line 83
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v9

    .line 85
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    :goto_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "lgi"

    .line 88
    invoke-static {p0, v1}, Lo/eun;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v8, v0, v1

    .line 87
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/util/RootKeyUtil;->genRootKey([Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 92
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 96
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 97
    if-eqz v5, :cond_0

    .line 98
    invoke-static {v5}, Lcom/huawei/hihealthservice/old/db/util/Utils;->inputStream(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 103
    :cond_0
    if-eqz v5, :cond_2

    .line 105
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    goto/16 :goto_1

    .line 106
    :catch_0
    move-exception v6

    .line 107
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSecretKeyS(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto :goto_1

    .line 100
    :catch_1
    move-exception v6

    .line 101
    :try_start_2
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSecretKeyS(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    if-eqz v5, :cond_2

    .line 105
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 108
    goto :goto_1

    .line 106
    :catch_2
    move-exception v6

    .line 107
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSecretKeyS(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_1

    .line 105
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 108
    goto :goto_0

    .line 106
    :catch_3
    move-exception v8

    .line 107
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSecretKeyS(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    :cond_1
    :goto_0
    throw v7

    .line 111
    :cond_2
    :goto_1
    return-object v4
.end method

.method public static c(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 166
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 167
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 168
    const-string v0, "aiq"

    invoke-static {p0, v0}, Lo/eun;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 169
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 170
    const-string v0, "aiw"

    invoke-static {p0, v0}, Lo/eun;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 171
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p1, :cond_2

    .line 172
    const-string v0, "sew"

    invoke-static {p0, v0}, Lo/eun;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 174
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 178
    const/4 v4, 0x0

    .line 179
    new-instance v5, Ljava/util/Properties;

    invoke-direct {v5}, Ljava/util/Properties;-><init>()V

    .line 180
    const/4 v6, 0x0

    .line 182
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "configl.properties"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 183
    invoke-virtual {v5, v6}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 184
    invoke-virtual {v5, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 188
    if-eqz v6, :cond_1

    .line 190
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    goto/16 :goto_1

    .line 191
    :catch_0
    move-exception v7

    .line 192
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPropertiesURL(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    goto :goto_1

    .line 185
    :catch_1
    move-exception v7

    .line 186
    :try_start_2
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPropertiesURL(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 188
    if-eqz v6, :cond_1

    .line 190
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 193
    goto :goto_1

    .line 191
    :catch_2
    move-exception v7

    .line 192
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPropertiesURL(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    goto :goto_1

    .line 188
    :catchall_0
    move-exception v8

    if-eqz v6, :cond_0

    .line 190
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 193
    goto :goto_0

    .line 191
    :catch_3
    move-exception v9

    .line 192
    sget-object v0, Lo/eun;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPropertiesURL(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :cond_0
    :goto_0
    throw v8

    .line 196
    :cond_1
    :goto_1
    return-object v4
.end method

.method static synthetic d(Landroid/content/Context;)[B
    .locals 1

    .line 19
    invoke-static {p0}, Lo/eun;->a(Landroid/content/Context;)[B

    move-result-object v0

    return-object v0
.end method
