.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-string v0, ""

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-void
.end method

.method private static a()I
    .locals 1

    .line 170
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 2

    .line 182
    const/4 v1, 0x0

    .line 184
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->b()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/c;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 185
    :cond_0
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a/e;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 187
    :cond_1
    return-object v1
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 37
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 38
    const-string v0, ""

    return-object v0

    .line 42
    :cond_0
    invoke-static {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    return-object v0

    .line 48
    :cond_1
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 49
    const/4 v0, 0x0

    if-eq v0, v1, :cond_2

    .line 50
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    .line 54
    :cond_2
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 55
    invoke-static {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    .line 58
    :cond_3
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method private static a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 3

    .line 152
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a()I

    move-result v0

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 153
    const/4 v0, 0x0

    return-object v0

    .line 156
    :cond_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    .line 157
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 160
    :cond_2
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/telephony/TelephonyManager;->getDeviceId(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 161
    :catch_0
    move-exception v2

    .line 162
    const/4 v0, 0x0

    return-object v0

    .line 163
    :catch_1
    move-exception v2

    .line 164
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 75
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 76
    :cond_0
    const-string v0, ""

    return-object v0

    .line 79
    :cond_1
    invoke-static {p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 82
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-object v0

    .line 84
    :cond_2
    const-string v0, ""

    return-object v0

    .line 87
    :cond_3
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 89
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    .line 91
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 92
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-object v0

    .line 95
    :cond_4
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    .line 97
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 98
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-object v0

    .line 101
    :cond_5
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    .line 103
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 104
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-object v0

    .line 107
    :cond_6
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    .line 109
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 110
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->b:Ljava/lang/String;

    return-object v0

    .line 113
    :cond_7
    const-string v0, ""

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 117
    invoke-static {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    const-string v0, ""

    return-object v0

    .line 122
    :cond_0
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 124
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v2

    .line 126
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 127
    return-object v2

    .line 130
    :cond_1
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v2

    .line 132
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 133
    return-object v2

    .line 136
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 139
    return-object v2

    .line 142
    :cond_3
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/b/a;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 145
    return-object v2

    .line 148
    :cond_4
    const-string v0, ""

    return-object v0
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 2

    .line 211
    invoke-static {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    const/4 v0, 0x0

    return v0

    .line 214
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_1

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 215
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
