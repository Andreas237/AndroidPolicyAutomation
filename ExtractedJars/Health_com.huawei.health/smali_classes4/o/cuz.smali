.class public Lo/cuz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 1

    .line 44
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const/4 v0, 0x1

    return v0

    .line 46
    :cond_0
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    const/4 v0, 0x2

    return v0

    .line 49
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 31
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 34
    :sswitch_0
    const-string v0, "com.huawei.health"

    return-object v0

    .line 37
    :sswitch_1
    const-string v0, "com.huawei.bone"

    return-object v0

    .line 39
    :goto_0
    const-string v0, "unknown"

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    .line 139
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 142
    :cond_1
    move-object v4, p1

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "com.huawei.bone"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "com.huawei.ah100"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x2

    :cond_2
    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 144
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 147
    :pswitch_1
    new-instance v0, Lo/cwr;

    invoke-direct {v0, p0}, Lo/cwr;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 148
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAppValid verify fail packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    return v0

    .line 151
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 153
    :goto_1
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72a4156a -> :sswitch_0
        -0x327a1682 -> :sswitch_1
        -0x1cdaeb10 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 97
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    .line 98
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    move-result-object v5

    .line 99
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 101
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, v5}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lo/cwr;

    invoke-direct {v0, p0}, Lo/cwr;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName isAppValid verify fail packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "getInsertBinderPackageName isAppValid Illegal APP"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_0
    invoke-static {v5}, Lo/cvc;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lo/cwr;

    invoke-direct {v0, p0}, Lo/cwr;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName not allow login,currentapp is whiteApp,will change packageName to health, current is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-string v0, "com.huawei.health"

    return-object v0

    .line 112
    :cond_1
    const-string v0, "android.uid.system"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    :cond_2
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const-string v0, "com.huawei.health"

    return-object v0

    .line 117
    :cond_3
    invoke-static {p0, v5}, Lo/cuz;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 119
    invoke-static {p0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v6

    .line 120
    if-gtz v6, :cond_4

    .line 121
    invoke-static {p0, v5}, Lo/cuz;->e(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v7

    .line 122
    invoke-static {p0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v7, v1}, Lo/cpu;->b(Lcom/huawei/hihealth/HiAppInfo;I)J

    move-result-wide v0

    long-to-int v6, v0

    .line 124
    :cond_4
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName() app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", packageName = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-static {p0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v7

    .line 126
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 128
    :cond_5
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName() change packageName : com.huawei.health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const-string v0, "com.huawei.health"

    return-object v0

    .line 133
    :cond_6
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInsertBinderPackageName packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object v5
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 54
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const-string v0, "\u8fd0\u52a8\u5065\u5eb7"

    return-object v0

    .line 56
    :cond_0
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    const-string v0, "\u534e\u4e3a\u7a7f\u6234"

    return-object v0

    .line 58
    :cond_1
    const-string v0, "com.huawei.ah100"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    const-string v0, "\u534e\u4e3a\u4f53\u8102\u79f0"

    return-object v0

    .line 61
    :cond_2
    const-string v0, "\u672a\u77e5APP"

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 69
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    .line 70
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    move-result-object v5

    .line 71
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 73
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 74
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, v5}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lo/cwr;

    invoke-direct {v0, p0}, Lo/cwr;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBinderPackageName isAppValid verify fail packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "getBinderPackageName isAppValid Illegal APP"

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    invoke-static {v5}, Lo/cvc;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lo/cwr;

    invoke-direct {v0, p0}, Lo/cwr;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBinderPackageName not allow login,currentapp is whiteApp,will change packageName to health, current is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const-string v0, "com.huawei.health"

    return-object v0

    .line 84
    :cond_1
    const-string v0, "android.uid.system"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBinderPackageName packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const-string v0, "com.huawei.health"

    return-object v0

    .line 89
    :cond_2
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBinderPackageName packageName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-object v5
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hihealth/HiAppInfo;
    .locals 9

    .line 158
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 159
    new-instance v5, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    .line 160
    invoke-virtual {v5, p1}, Lcom/huawei/hihealth/HiAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 162
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    .line 163
    const/4 v0, 0x0

    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    .line 164
    iget-object v0, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAppInfo;->setVersion(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v4, v6}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAppInfo;->setAppName(Ljava/lang/String;)V

    .line 166
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 167
    invoke-static {v8}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAppInfo;->setSignature(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    goto :goto_0

    .line 168
    :catch_0
    move-exception v6

    .line 169
    const-string v0, "HiH_HiAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createExplicitIntent() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_0
    return-object v5
.end method
