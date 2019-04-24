.class public Lo/cqf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IILandroid/content/Context;)Z
    .locals 5

    .line 49
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    if-gtz p0, :cond_1

    .line 50
    :cond_0
    const-string v0, "hfssdk"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUserId context is null or userID <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_1
    invoke-static {p2}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 54
    if-eqz v4, :cond_2

    invoke-static {p2}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    .line 113
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqa;->d(Ljava/lang/String;)I

    move-result v4

    .line 114
    if-lez v4, :cond_0

    .line 115
    return v4

    .line 117
    :cond_0
    invoke-static {p0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    const-string v0, "hfssdk"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID deviceUUID = android_ "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    new-instance v5, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 120
    invoke-virtual {v5, p1}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 121
    const/16 v0, 0x20

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 122
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 123
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setSoftwareVersion(Ljava/lang/String;)V

    .line 124
    invoke-static {p0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cqa;->b(Lcom/huawei/hihealth/HiDeviceInfo;)J

    move-result-wide v0

    long-to-int v4, v0

    .line 125
    const-string v0, "hfssdk"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID deviceUUID = android_ device = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :cond_1
    return v4
.end method

.method public static b(Landroid/content/Context;I)Z
    .locals 5

    .line 70
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    if-gez p1, :cond_1

    .line 71
    :cond_0
    const-string v0, "hfssdk"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUserLogin appid or context error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 75
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    const-string v0, "com."

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 76
    :cond_2
    const-string v0, "hfssdk"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUserLogin such appId is not login app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x0

    return v0

    .line 79
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    .line 131
    invoke-static {p0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v2

    .line 132
    invoke-static {p0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    invoke-static {p0}, Lo/cuz;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v3

    .line 133
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 134
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 135
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(Landroid/content/Context;I)I
    .locals 3

    .line 20
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-static {p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;II)I
    .locals 7

    .line 88
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    if-gez p1, :cond_1

    .line 89
    :cond_0
    const-string v0, "hfssdk"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCheckAppUserId appid or context error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_1
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v4

    .line 94
    invoke-static {p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v5

    .line 95
    if-gtz p2, :cond_2

    .line 96
    const-string v0, "hfssdk"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCheckAppUserId get main userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-virtual {v4, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 98
    const/4 v0, 0x0

    invoke-virtual {v5, v6, v0}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result p2

    .line 99
    return p2

    .line 102
    :cond_2
    invoke-virtual {v5, p2}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, p1, v0}, Lo/cpr;->b(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    return p2

    .line 106
    :cond_3
    const-string v0, "hfssdk"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCheckAppUserId no such owner from accountInfo, app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " owner is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v0, 0x0

    return v0
.end method

.method public static d(IILandroid/content/Context;)Z
    .locals 2

    .line 61
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    if-gez p1, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 65
    :cond_1
    invoke-static {p2}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 66
    invoke-static {p2}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lo/cpr;->b(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static e(Landroid/content/Context;II)I
    .locals 6

    .line 26
    invoke-static {p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v4

    .line 27
    if-lez p2, :cond_1

    .line 28
    invoke-virtual {v4, p2}, Lo/cqs;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 29
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1, v5}, Lo/cpr;->b(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    const-string v0, "hfssdk"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCheckUserID error account app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " owner is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    const/4 v0, 0x0

    return v0

    .line 33
    :cond_0
    return p2

    .line 36
    :cond_1
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 37
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 38
    const-string v0, "hfssdk"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCheckUserID error huid is null app is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " owner is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_2
    invoke-static {p0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result p2

    .line 42
    return p2
.end method
