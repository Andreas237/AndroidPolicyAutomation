.class public Lcom/huawei/phoneserviceuni/common/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "DeviceProperty"

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field private static d:Ljava/lang/String; = null

.field private static e:Ljava/lang/String; = null

.field private static f:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, ""

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    .line 23
    const-string v0, ""

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 3

    .line 39
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->g()Landroid/content/Context;

    move-result-object v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    const-string v0, ""

    return-object v0

    .line 44
    :cond_0
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    return-object v0

    .line 50
    :cond_1
    const-string v0, "phone"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 51
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 52
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    .line 56
    :cond_2
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 57
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    .line 60
    :cond_3
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 2

    .line 192
    const/4 v1, 0x0

    .line 194
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/b;->a()Lcom/huawei/phoneserviceuni/common/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/phoneserviceuni/common/a/b;->b()Lcom/huawei/phoneserviceuni/common/a/a/c;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 195
    :cond_0
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/b;->a()Lcom/huawei/phoneserviceuni/common/a/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/phoneserviceuni/common/a/b;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 197
    :cond_1
    return-object v1
.end method

.method private static a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 3

    .line 162
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->f()I

    move-result v0

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 163
    const/4 v0, 0x0

    return-object v0

    .line 166
    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    .line 167
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 170
    :cond_2
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/telephony/TelephonyManager;->getDeviceId(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 171
    :catch_0
    move-exception v2

    .line 172
    const/4 v0, 0x0

    return-object v0

    .line 173
    :catch_1
    move-exception v2

    .line 174
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 74
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    const-string v0, ""

    return-object v0

    .line 78
    :cond_0
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->g()Landroid/content/Context;

    move-result-object v1

    .line 79
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 80
    const-string v0, ""

    return-object v0

    .line 83
    :cond_1
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 85
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 86
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    return-object v0

    .line 88
    :cond_2
    const-string v0, ""

    return-object v0

    .line 91
    :cond_3
    const-string v0, "phone"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 93
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    .line 95
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 96
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    return-object v0

    .line 99
    :cond_4
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    .line 101
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 102
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    return-object v0

    .line 105
    :cond_5
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    .line 107
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 108
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    return-object v0

    .line 111
    :cond_6
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    .line 113
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 114
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->e:Ljava/lang/String;

    return-object v0

    .line 117
    :cond_7
    const-string v0, ""

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .line 329
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 330
    const/4 v0, 0x0

    return v0

    .line 332
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 334
    :try_start_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 335
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 336
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    .line 337
    iget v0, v3, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 338
    const/4 v0, 0x1

    return v0

    .line 343
    :cond_1
    goto :goto_0

    .line 341
    :catch_0
    move-exception v3

    .line 342
    const-string v0, "DeviceProperty"

    const-string v1, "isSystemApp NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 220
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->g()Landroid/content/Context;

    move-result-object v1

    .line 221
    if-nez v1, :cond_0

    .line 222
    const-string v0, ""

    return-object v0

    .line 225
    :cond_0
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 227
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    return-object v0

    .line 230
    :cond_1
    const-string v0, "phone"

    .line 231
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 232
    if-eqz v2, :cond_2

    .line 233
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    .line 236
    :cond_2
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 237
    const-string v0, ""

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    .line 240
    :cond_3
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 207
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 208
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 210
    :cond_0
    return-object p0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 355
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 356
    const/4 v0, 0x0

    return v0

    .line 358
    :cond_0
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 359
    const-string v0, "AppLogApi/FeedbackUtils"

    const-string v1, "supportNewPermission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 360
    const/4 v0, 0x1

    return v0

    .line 363
    :cond_1
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 364
    const-string v0, "AppLogApi/FeedbackUtils"

    const-string v1, "no have READ_PHONE_STATE Permission"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    const/4 v0, 0x0

    return v0

    .line 367
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static c()Ljava/lang/String;
    .locals 3

    .line 268
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a()Lcom/huawei/phoneserviceuni/common/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/phoneserviceuni/common/d/a/a;->b()Landroid/app/Application;

    move-result-object v1

    .line 271
    if-nez v1, :cond_0

    .line 272
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a()Lcom/huawei/phoneserviceuni/common/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/phoneserviceuni/common/d/a/a;->c()Landroid/content/Context;

    move-result-object v1

    .line 275
    :cond_0
    if-nez v1, :cond_1

    .line 276
    const-string v0, ""

    return-object v0

    .line 279
    :cond_1
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/a/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 280
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    return-object v0

    .line 283
    :cond_2
    const-string v0, "phone"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 284
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 285
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    .line 289
    :cond_3
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 290
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->e()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    .line 293
    :cond_4
    sget-object v0, Lcom/huawei/phoneserviceuni/common/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 2

    .line 303
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 304
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d()Z
    .locals 7

    .line 375
    const-string v0, "com.huawei.android.app.admin.DeviceRestrictionManager"

    const-string v1, "isSystemUpdateDisabled"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/content/ComponentName;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/phoneserviceuni/common/e/d;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 377
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 381
    move-object v6, v5

    :try_start_0
    check-cast v6, Ljava/lang/Boolean;

    .line 382
    const-string v0, "DeviceProperty"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "is UpgradeForbidden=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 383
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 385
    :catch_0
    move-exception v6

    .line 387
    const-string v0, "DeviceProperty"

    const-string v1, "isUpgradeForbidden ClassCastException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 390
    :cond_0
    const-string v0, "DeviceProperty"

    const-string v1, "obj is null"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 391
    const/4 v0, 0x0

    return v0
.end method

.method private static e()Ljava/lang/String;
    .locals 4

    .line 121
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/a/a;->g()Landroid/content/Context;

    move-result-object v1

    .line 123
    if-nez v1, :cond_0

    .line 124
    const-string v0, ""

    return-object v0

    .line 127
    :cond_0
    invoke-static {v1}, Lcom/huawei/phoneserviceuni/common/a/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    const-string v0, ""

    return-object v0

    .line 132
    :cond_1
    const-string v0, "phone"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 134
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 137
    return-object v3

    .line 140
    :cond_2
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 143
    return-object v3

    .line 146
    :cond_3
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 148
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 149
    return-object v3

    .line 152
    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/a/a;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 154
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 155
    return-object v3

    .line 158
    :cond_5
    const-string v0, ""

    return-object v0
.end method

.method private static f()I
    .locals 1

    .line 180
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method private static g()Landroid/content/Context;
    .locals 2

    .line 250
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a()Lcom/huawei/phoneserviceuni/common/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/phoneserviceuni/common/d/a/a;->b()Landroid/app/Application;

    move-result-object v1

    .line 253
    if-nez v1, :cond_0

    .line 254
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a()Lcom/huawei/phoneserviceuni/common/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/phoneserviceuni/common/d/a/a;->c()Landroid/content/Context;

    move-result-object v1

    .line 256
    :cond_0
    return-object v1
.end method

.method private static h()Z
    .locals 4

    .line 317
    const-string v0, "android.telephony.HwTelephonyManager"

    const-string v1, "SUPPORT_SYSTEMAPP_GET_DEVICEID"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    .line 318
    const-string v0, "DeviceProperty"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "supportNewPermissionCheck value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 319
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
