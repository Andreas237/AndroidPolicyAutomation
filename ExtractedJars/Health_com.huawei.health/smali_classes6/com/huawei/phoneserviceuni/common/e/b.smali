.class public Lcom/huawei/phoneserviceuni/common/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "IoUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 9

    .line 105
    const/4 v2, 0x0

    .line 107
    if-nez p0, :cond_0

    .line 108
    return-object v2

    .line 110
    :cond_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 111
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 112
    const/4 v5, -0x1

    .line 114
    :goto_0
    :try_start_0
    invoke-virtual {p0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 115
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 118
    :cond_1
    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 124
    :try_start_1
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 127
    goto :goto_2

    .line 125
    :catch_0
    move-exception v6

    .line 126
    const-string v0, "IoUtils"

    const-string v1, "close io error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    goto :goto_2

    .line 119
    :catch_1
    move-exception v6

    .line 120
    const-string v0, "IoUtils"

    const-string v1, "readStream io error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 127
    goto :goto_2

    .line 125
    :catch_2
    move-exception v6

    .line 126
    const-string v0, "IoUtils"

    const-string v1, "close io error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v7

    .line 124
    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 127
    goto :goto_1

    .line 125
    :catch_3
    move-exception v8

    .line 126
    const-string v0, "IoUtils"

    const-string v1, "close io error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_1
    throw v7

    .line 131
    :goto_2
    return-object v2
.end method

.method public static a(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 3

    .line 54
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 55
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :cond_0
    goto :goto_0

    .line 57
    :catch_0
    move-exception v2

    .line 58
    const-string v0, "IoUtils"

    const-string v1, "closeDataOutputStream IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/FileInputStream;Ljava/lang/String;)V
    .locals 3

    .line 65
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 66
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :cond_0
    goto :goto_0

    .line 68
    :catch_0
    move-exception v2

    .line 69
    const-string v0, "IoUtils"

    const-string v1, "closeFileInputStream IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/FileOutputStream;Ljava/lang/String;)V
    .locals 3

    .line 76
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 77
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :cond_0
    goto :goto_0

    .line 79
    :catch_0
    move-exception v2

    .line 80
    const-string v0, "IoUtils"

    const-string v1, "closeFileOutputStream IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 31
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 32
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :cond_0
    goto :goto_0

    .line 34
    :catch_0
    move-exception v2

    .line 35
    const-string v0, "IoUtils"

    const-string v1, "closeInputStream IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3

    .line 42
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 43
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    :cond_0
    goto :goto_0

    .line 45
    :catch_0
    move-exception v2

    .line 46
    const-string v0, "IoUtils"

    const-string v1, "closeOutputStream IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V
    .locals 3

    .line 87
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 88
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :cond_0
    goto :goto_0

    .line 90
    :catch_0
    move-exception v2

    .line 91
    const-string v0, "IoUtils"

    const-string v1, "closeOutputStreamWriter IOException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 143
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v0

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 4

    .line 165
    new-instance v2, Ljava/io/PushbackInputStream;

    invoke-direct {v2, p0}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;)V

    .line 166
    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v3

    .line 167
    const/16 v0, 0xef

    if-eq v3, v0, :cond_0

    .line 168
    invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 169
    return-object v2

    .line 171
    :cond_0
    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v3

    .line 172
    const/16 v0, 0xbb

    if-eq v3, v0, :cond_1

    .line 173
    invoke-virtual {v2, v3}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 174
    const/16 v0, 0xef

    invoke-virtual {v2, v0}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 175
    return-object v2

    .line 177
    :cond_1
    invoke-virtual {v2}, Ljava/io/PushbackInputStream;->read()I

    move-result v3

    .line 178
    const/16 v0, 0xbf

    if-eq v3, v0, :cond_2

    .line 179
    new-instance v0, Ljava/io/IOException;

    const-string v1, "error file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_2
    return-object v2
.end method
