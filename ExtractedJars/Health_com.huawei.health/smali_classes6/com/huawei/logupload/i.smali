.class public Lcom/huawei/logupload/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "deviceType"

.field public static final b:Ljava/lang/String; = "sysVersion"

.field public static final c:Ljava/lang/String; = "deviceID"

.field public static final d:Ljava/lang/String; = "channelId"

.field public static final e:Ljava/lang/String; = "imsi"

.field public static final f:Ljava/lang/String; = "os"

.field public static final g:Ljava/lang/String; = "encryptType"

.field public static final h:Ljava/lang/String; = "sensitiveContain"

.field public static final i:Ljava/lang/String; = "fileName"

.field public static final j:Ljava/lang/String; = "refresh"

.field public static final k:Ljava/lang/String; = "version"

.field public static final l:Ljava/lang/String; = "logType"

.field public static final m:Ljava/lang/String; = "sysData"

.field public static final n:Ljava/lang/String; = "size"

.field public static final o:Ljava/lang/String; = "zipTime"

.field public static final p:Ljava/lang/String; = "logDetailInfo"

.field public static final q:Ljava/lang/String; = "sign"

.field public static final r:Ljava/lang/String; = "encryptKey"

.field public static final s:Ljava/lang/String; = "---------------------------40612316912668"

.field private static final t:Ljava/lang/String; = "UploadFile"

.field private static final u:Ljava/lang/String; = "--"

.field private static final v:Ljava/lang/String; = "\r\n"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/DataOutputStream;Ljava/lang/String;)I
    .locals 9

    .line 148
    const-string v0, "UploadFile"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "filePath: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    invoke-static {p1}, Lcom/huawei/logupload/c/i;->b(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v3

    .line 150
    if-nez v3, :cond_0

    .line 152
    const-string v0, "UploadFile"

    const-string v1, "fis==null"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    const/4 v0, 0x0

    return v0

    .line 157
    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/io/FileInputStream;->available()I

    move-result v0

    if-gtz v0, :cond_1

    .line 159
    const-string v0, "UploadFile"

    const-string v1, "fis.available() <= 0"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    const-string v0, "UploadFile"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    const/4 v0, 0x0

    return v0

    .line 164
    :catch_0
    move-exception v4

    .line 166
    const-string v0, "UploadFile"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 167
    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 168
    const/4 v0, 0x0

    return v0

    .line 171
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    const-string v0, "-----------------------------40612316912668\r\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    const-string v0, "sysData"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    const-string v0, "\"; filename=\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    const-string v0, "\""

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    const-string v0, "\r\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    const-string v0, "Content-Type: application/zip"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    const-string v0, "\r\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    const-string v0, "\r\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    const-string v0, "UploadFile"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sb: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    const/16 v0, 0x400

    new-array v5, v0, [B

    .line 189
    const/4 v6, -0x1

    .line 193
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 195
    goto :goto_0

    .line 197
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v5, v0, v6}, Ljava/io/DataOutputStream;->write([BII)V

    .line 195
    :goto_0
    invoke-virtual {v3, v5}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 200
    const-string v0, "\r\n"

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    goto :goto_1

    .line 202
    :catch_1
    move-exception v7

    .line 208
    const-string v0, "UploadFile"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const/16 v0, 0x3f2

    return v0

    .line 207
    :catchall_0
    move-exception v8

    .line 208
    const-string v0, "UploadFile"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 209
    throw v8

    .line 208
    :goto_1
    const-string v0, "UploadFile"

    invoke-static {v3, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 211
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(TT;)I"
        }
    .end annotation

    .line 126
    instance-of v0, p0, Ljava/io/DataOutputStream;

    if-eqz v0, :cond_0

    .line 129
    move-object v0, p0

    :try_start_0
    check-cast v0, Ljava/io/DataOutputStream;

    const-string v1, "-----------------------------40612316912668--\r\n"

    const-string v2, "utf-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 130
    goto :goto_0

    .line 131
    :cond_0
    instance-of v0, p0, Ljava/util/zip/GZIPOutputStream;

    if-eqz v0, :cond_1

    .line 134
    move-object v0, p0

    check-cast v0, Ljava/util/zip/GZIPOutputStream;

    const-string v1, "-----------------------------40612316912668--\r\n"

    const-string v2, "utf-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/zip/GZIPOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    goto :goto_0

    .line 138
    :catch_0
    move-exception v3

    .line 140
    const/16 v0, 0x3f2

    return v0

    .line 143
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/GZIPOutputStream;)I
    .locals 4

    .line 68
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    const-string v0, "-----------------------------40612316912668\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    const-string v0, "\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/zip/GZIPOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception v3

    .line 96
    const/16 v0, 0x3f2

    return v0

    .line 99
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
