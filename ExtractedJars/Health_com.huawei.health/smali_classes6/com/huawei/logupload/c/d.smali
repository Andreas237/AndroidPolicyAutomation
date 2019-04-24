.class public final Lcom/huawei/logupload/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "CommonUtils"

.field private static final b:Ljava/lang/String; = "7OEaK"

.field private static c:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-string v0, "+D7q5IfIpbIvYFUVbw+tB3dtcY81vpSR/tPgx9Ocklk1oos9Wur5ZG3Ww+NcD/LJT7vFlAgMBAAECggEAa8WE7OGf8NeJcj/DEDsYEuclYn0DKLTET8dNvP+ZiZ9bNHOWBa1yCjQ7xGDWQHmjcenk1EjpZhdE7cvWh5oVVkqUwZw641Bb5w6wK3H/ZapHgtRmfWHtidz1qeHLYRX05bw6WhXh+vylhYLuy4Dx0E8DEhkOl3QNyPAr/0P/Z7ZHhbp2VCxTmWmIciidvtDO91tmXc316cQck9lTYOoyZFpdIlwI3nsGYPOZnbuEJi29p2RhupbYVTEKOwNk"

    sput-object v0, Lcom/huawei/logupload/c/d;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 29
    sget-object v0, Lcom/huawei/logupload/c/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 3

    .line 86
    if-eqz p0, :cond_1

    .line 88
    :try_start_0
    invoke-virtual {p0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_0

    .line 91
    :catch_0
    move-exception v2

    .line 93
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    const-string v0, "CommonUtils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    goto :goto_0

    .line 102
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 57
    if-eqz p0, :cond_1

    .line 59
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception v2

    .line 64
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    const-string v0, "CommonUtils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    goto :goto_0

    .line 73
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3

    .line 160
    if-eqz p0, :cond_1

    .line 162
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_0

    .line 165
    :catch_0
    move-exception v2

    .line 167
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    const-string v0, "CommonUtils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    goto :goto_0

    .line 176
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    .line 146
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 33
    sput-object p0, Lcom/huawei/logupload/c/d;->c:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 4

    .line 191
    const/4 v2, 0x0

    .line 195
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 196
    goto :goto_0

    .line 197
    :catch_0
    move-exception v3

    .line 200
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    const-string v0, "CommonUtils"

    invoke-virtual {v3}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    :cond_0
    :goto_0
    return-object v2
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 38
    const-string v0, "7OEaK"

    return-object v0
.end method

.method public static b(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 115
    if-eqz p0, :cond_1

    .line 117
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    goto :goto_0

    .line 120
    :catch_0
    move-exception v2

    .line 122
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    const-string v0, "CommonUtils"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    goto :goto_0

    .line 131
    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    :cond_1
    :goto_0
    return-void
.end method
