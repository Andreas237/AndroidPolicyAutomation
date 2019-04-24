.class public Lcom/huawei/hwid/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/d/d$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/pm/PackageManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/d/d;->a:Landroid/content/pm/PackageManager;

    .line 42
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/hwid/d/d$a;
    .locals 3

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/d/d;->a:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 65
    iget-boolean v0, v2, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-eqz v0, :cond_0

    .line 66
    sget-object v0, Lcom/huawei/hwid/d/d$a;->a:Lcom/huawei/hwid/d/d$a;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 68
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/hwid/d/d$a;->b:Lcom/huawei/hwid/d/d$a;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 70
    :catch_0
    move-exception v2

    .line 71
    sget-object v0, Lcom/huawei/hwid/d/d$a;->c:Lcom/huawei/hwid/d/d$a;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 177
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/d/d;->a:Landroid/content/pm/PackageManager;

    const/16 v1, 0x8

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 179
    if-eqz v2, :cond_1

    iget-object v0, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    if-eqz v0, :cond_1

    .line 180
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->providers:[Landroid/content/pm/ProviderInfo;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 181
    iget-object v0, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const/4 v0, 0x1

    return v0

    .line 180
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 187
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 188
    :catch_0
    move-exception v2

    .line 189
    const/4 v0, 0x0

    return v0
.end method

.method public b(Ljava/lang/String;)I
    .locals 3

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/d/d;->a:Landroid/content/pm/PackageManager;

    const/16 v1, 0x10

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 85
    if-eqz v2, :cond_0

    .line 86
    iget v0, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return v0

    .line 88
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 90
    :catch_0
    move-exception v2

    .line 91
    const-string v0, "PackageManagerHelper"

    const-string v1, "NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x0

    return v0

    .line 93
    :catch_1
    move-exception v2

    .line 94
    const-string v0, "PackageManagerHelper"

    const-string v1, "Exception  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const/4 v0, 0x0

    return v0
.end method
