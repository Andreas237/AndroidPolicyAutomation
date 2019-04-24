.class public Lcom/huawei/wallet/utils/log/LogUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    invoke-static {}, Lcom/huawei/wallet/utils/log/LogUtil;->d()Z

    move-result v0

    sput-boolean v0, Lcom/huawei/wallet/utils/log/LogUtil;->a:Z

    .line 43
    sget-boolean v0, Lcom/huawei/wallet/utils/log/LogUtil;->a:Z

    if-nez v0, :cond_0

    const-string v0, "wallet"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    sput-boolean v0, Lcom/huawei/wallet/utils/log/LogUtil;->e:Z

    .line 92
    const-string v0, "[0-9]*[a-z|A-Z]*[\u4e00-\u9fa5]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/utils/log/LogUtil;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Lcom/huawei/feedback/bean/MetadataBundle;
    .locals 3

    .line 133
    new-instance v0, Lcom/huawei/feedback/bean/MetadataBundle;

    sget-object v1, Lcom/huawei/wallet/utils/log/LogUtil;->b:Ljava/lang/String;

    sget-object v2, Lcom/huawei/wallet/utils/log/LogUtil;->c:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/feedback/bean/MetadataBundle;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 352
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    return-object p0

    .line 356
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 357
    const/4 v0, 0x1

    if-ne v0, v1, :cond_1

    .line 359
    const/16 v0, 0x2a

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 362
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 363
    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_0
    if-ge v3, v1, :cond_4

    .line 365
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 366
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    .line 367
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/huawei/wallet/utils/log/LogUtil;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 369
    rem-int/lit8 v0, v4, 0x2

    if-nez v0, :cond_2

    .line 371
    const/16 v5, 0x2a

    .line 373
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 376
    :cond_3
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 363
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 379
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)Ljava/lang/String;
    .locals 3

    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x100

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 149
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 155
    if-eqz p3, :cond_1

    .line 158
    invoke-static {p1}, Lcom/huawei/wallet/utils/log/LogUtil;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 162
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 168
    const-string v0, "    "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lcom/huawei/wallet/utils/log/LogUtil;->c(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    .line 312
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILcom/huawei/feedback/bean/MetadataBundle;ZZ)V
    .locals 0

    .line 302
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 182
    sget-boolean v0, Lcom/huawei/wallet/utils/log/LogUtil;->e:Z

    if-nez v0, :cond_0

    .line 184
    return-void

    .line 187
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    return-void

    .line 191
    :cond_1
    const-string v0, "wallet"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 2

    .line 262
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 264
    return-void

    .line 266
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/wallet/utils/log/LogUtil;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)Ljava/lang/String;

    move-result-object v1

    .line 267
    const-string v0, "wallet"

    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 268
    return-void
.end method

.method private static d()Z
    .locals 6

    .line 64
    const/4 v3, 0x0

    .line 65
    const/4 v4, 0x1

    .line 68
    :try_start_0
    const-class v0, Landroid/util/Log;

    const-string v1, "HWLog"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 69
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result v4

    .line 70
    return v4

    .line 72
    :catch_0
    move-exception v5

    .line 74
    const-string v0, "wallet"

    const-string v1, "[getHWLog]:  can not find HwLog!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    goto :goto_0

    .line 76
    :catch_1
    move-exception v5

    .line 78
    const-string v0, "wallet"

    const-string v1, "getHWLog is IllegalArgumentException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    goto :goto_0

    .line 80
    :catch_2
    move-exception v5

    .line 82
    const-string v0, "wallet"

    const-string v1, "getHWLog is IllegalAccessException"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    goto :goto_0

    .line 84
    :catch_3
    move-exception v5

    .line 86
    const-string v0, "wallet"

    const-string v1, "getHWLog is Exception"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 88
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 225
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    return-void

    .line 229
    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2}, Lcom/huawei/wallet/utils/log/LogUtil;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)Ljava/lang/String;

    move-result-object v1

    .line 231
    const-string v0, "wallet"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    return-void
.end method
