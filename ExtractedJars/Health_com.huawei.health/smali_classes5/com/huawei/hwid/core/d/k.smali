.class public Lcom/huawei/hwid/core/d/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/16 v0, 0x14

    sput v0, Lcom/huawei/hwid/core/d/k;->a:I

    .line 47
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    .line 48
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 4

    .line 54
    const-string v2, ""

    .line 55
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 57
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    const-string v2, "unknown"

    .line 62
    :cond_0
    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {v2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 63
    :catch_0
    move-exception v3

    .line 64
    const-string v0, "TerminalInfo"

    const-string v1, "in getTerminalType Unsupported encoding exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-object v2
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 87
    invoke-static {p0}, Lcom/huawei/hwid/core/d/k;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 88
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    const-string v0, "NULL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    .line 91
    :cond_1
    return-object v1
.end method

.method public static a(Landroid/content/Context;I)Ljava/lang/String;
    .locals 4

    .line 150
    const/4 v0, 0x2

    if-lt p1, v0, :cond_0

    .line 151
    const-string v0, "NULL"

    return-object v0

    .line 153
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 155
    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 156
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "UUID"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/k;->b(Ljava/lang/String;)V

    .line 158
    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    .line 160
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/k;->b(Ljava/lang/String;)V

    .line 162
    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    const-string v0, "NULL"

    return-object v0

    .line 165
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "UUID"

    sget-object v2, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_2
    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x28

    if-gt v0, v1, :cond_3

    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 171
    :cond_3
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    .line 172
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "UUID"

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 173
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    .line 176
    :cond_4
    sget-object v0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;

    return-object v0
.end method

.method private static declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    const-class v1, Lcom/huawei/hwid/core/d/k;

    monitor-enter v1

    .line 142
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 143
    const-string v0, ""

    :try_start_0
    sput-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    goto :goto_0

    .line 145
    :cond_0
    sput-object p0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :goto_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    .line 76
    const-string v1, ""

    .line 77
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 79
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const-string v1, "unknown"

    .line 83
    :cond_0
    return-object v1
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 101
    invoke-static {p0}, Lcom/huawei/hwid/core/d/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 102
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/hwid/core/d/b;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "NULL"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwid/core/d/b;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 105
    :cond_0
    return-object v2
.end method

.method private static declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/core/d/k;

    monitor-enter v0

    .line 180
    :try_start_0
    sput-object p0, Lcom/huawei/hwid/core/d/k;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 184
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 116
    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sget v1, Lcom/huawei/hwid/core/d/k;->a:I

    if-le v0, v1, :cond_4

    .line 118
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "DEVID_1"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 120
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 122
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sget v1, Lcom/huawei/hwid/core/d/k;->a:I

    if-gt v0, v1, :cond_1

    .line 123
    invoke-static {v3}, Lcom/huawei/hwid/core/d/k;->a(Ljava/lang/String;)V

    .line 124
    return-object v3

    .line 126
    :cond_1
    const-string v0, "TerminalInfo"

    const-string v1, "cbcDecrypter devid failed!!!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "DEVID_1"

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 130
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    .line 134
    :cond_2
    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "unknown"

    sget-object v1, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 135
    :cond_3
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 138
    :cond_4
    sget-object v0, Lcom/huawei/hwid/core/d/k;->b:Ljava/lang/String;

    return-object v0
.end method
