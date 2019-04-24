.class public Lo/dtj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 116
    invoke-static {p1}, Lo/dtj;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/dtj;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 45
    .line 46
    invoke-static {p1}, Lo/dtj;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {p0, v0}, Lo/dtj;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 70
    invoke-static {p1}, Lo/dtj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    :cond_0
    const-string v0, "aesKey is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->e(Ljava/lang/String;Z)V

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/wallet/utils/crypto/AES;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 130
    invoke-static {p0}, Lo/dtf;->a(Landroid/content/Context;)Lo/dtf;

    move-result-object v0

    const-string v1, "chaos_uuid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dtf;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 131
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    invoke-static {}, Lcom/huawei/wallet/utils/PhoneDeviceUtil;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-static {p0}, Lo/dtf;->a(Landroid/content/Context;)Lo/dtf;

    move-result-object v0

    const-string v1, "chaos_uuid"

    invoke-virtual {v0, v1, v3}, Lo/dtf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    :cond_0
    const/4 v0, 0x5

    invoke-static {v3, v0}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "5c"

    const/4 v2, 0x7

    invoke-static {v1, v2}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "c5"

    .line 140
    const/4 v2, 0x6

    invoke-static {v1, v2}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6A"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "58"

    .line 141
    const/4 v2, 0x4

    invoke-static {v1, v2}, Lo/dtj;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 26
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 28
    :cond_0
    const-string v0, "key is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->e(Ljava/lang/String;Z)V

    .line 29
    return-object p0

    .line 33
    :cond_1
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    .line 184
    const/4 v3, 0x0

    .line 185
    if-eqz p0, :cond_0

    const/16 v0, 0x8

    if-lt p1, v0, :cond_1

    .line 187
    :cond_0
    return-object p0

    .line 190
    :cond_1
    const/4 v4, 0x0

    .line 191
    invoke-static {p0}, Lcom/huawei/wallet/utils/crypto/AES;->e(Ljava/lang/String;)[B

    move-result-object v4

    .line 193
    array-length v5, v4

    .line 194
    new-array v6, v5, [B

    .line 195
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    .line 201
    aget-byte v0, v4, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, p1

    aget-byte v1, v4, v7

    and-int/lit16 v1, v1, 0xff

    rsub-int/lit8 v2, p1, 0x8

    ushr-int/2addr v1, v2

    or-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    .line 195
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 203
    :cond_2
    invoke-static {v6}, Lcom/huawei/wallet/utils/crypto/AES;->a([B)Ljava/lang/String;

    move-result-object v3

    .line 205
    return-object v3
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 88
    invoke-static {p1}, Lo/dtj;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    :cond_0
    const-string v0, "aesKey is illeagal"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->e(Ljava/lang/String;Z)V

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    invoke-static {p0, v2}, Lcom/huawei/wallet/utils/crypto/AES;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
