.class public Lcom/huawei/hms/c/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/c/g$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/pm/PackageManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/c/g;->a:Landroid/content/pm/PackageManager;

    .line 44
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 6

    .line 226
    if-nez p0, :cond_0

    .line 227
    const/4 v0, 0x0

    return v0

    .line 230
    :cond_0
    const-string v0, "activity"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    .line 231
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 232
    if-nez v3, :cond_1

    .line 233
    const/4 v0, 0x0

    return v0

    .line 235
    :cond_1
    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 236
    iget-object v0, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 237
    iget v0, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_2

    .line 238
    const/4 v0, 0x1

    return v0

    .line 241
    :cond_2
    goto :goto_0

    .line 244
    :cond_3
    goto :goto_1

    .line 242
    :catch_0
    move-exception v2

    .line 243
    const-string v0, "PackageManagerHelper"

    const-string v1, "check the app isBackground"

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;)[B
    .locals 4

    .line 139
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/c/g;->a:Landroid/content/pm/PackageManager;

    const/16 v1, 0x40

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 141
    if-eqz v3, :cond_0

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v0, :cond_0

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    if-lez v0, :cond_0

    .line 142
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 146
    :cond_0
    goto :goto_0

    .line 144
    :catch_0
    move-exception v3

    .line 145
    const-string v0, "PackageManagerHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to get application signature certificate fingerprint."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    :goto_0
    const-string v0, "PackageManagerHelper"

    const-string v1, "Failed to get application signature certificate fingerprint."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/hms/c/g$a;
    .locals 3

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/c/g;->a:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 67
    iget-boolean v0, v2, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-eqz v0, :cond_0

    .line 68
    sget-object v0, Lcom/huawei/hms/c/g$a;->a:Lcom/huawei/hms/c/g$a;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 70
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/hms/c/g$a;->b:Lcom/huawei/hms/c/g$a;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 72
    :catch_0
    move-exception v2

    .line 73
    sget-object v0, Lcom/huawei/hms/c/g$a;->c:Lcom/huawei/hms/c/g$a;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 161
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/c/g;->a:Landroid/content/pm/PackageManager;

    const/16 v1, 0x8

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 163
    if-eqz v2, :cond_1

    iget-object v0, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    if-eqz v0, :cond_1

    .line 164
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 165
    iget-object v0, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    const/4 v0, 0x1

    return v0

    .line 164
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 171
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 172
    :catch_0
    move-exception v2

    .line 173
    const/4 v0, 0x0

    return v0
.end method

.method public b(Ljava/lang/String;)I
    .locals 3

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/c/g;->a:Landroid/content/pm/PackageManager;

    const/16 v1, 0x10

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 87
    if-eqz v2, :cond_0

    .line 88
    iget v0, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 90
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 92
    :catch_0
    move-exception v2

    .line 93
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 124
    invoke-direct {p0, p1}, Lcom/huawei/hms/c/g;->d(Ljava/lang/String;)[B

    move-result-object v2

    .line 125
    if-eqz v2, :cond_0

    array-length v0, v2

    if-nez v0, :cond_1

    .line 126
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 128
    :cond_1
    invoke-static {v2}, Lcom/huawei/hms/c/i;->a([B)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hms/c/d;->b([BZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
