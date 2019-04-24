.class public Lo/dpi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;

.field protected d:Lo/dpe;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpi;->a:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpi;->d:Lo/dpe;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lo/dpi;->e:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Lo/dpi;->a:Landroid/content/Context;

    .line 55
    new-instance v0, Lo/dpe;

    invoke-direct {v0}, Lo/dpe;-><init>()V

    iput-object v0, p0, Lo/dpi;->d:Lo/dpe;

    .line 56
    const-string v0, "https://query.hicloud.com/Ring/v2/CheckEx.action?ruleAttr=true"

    iput-object v0, p0, Lo/dpi;->e:Ljava/lang/String;

    .line 57
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UpdateBase() mUpdateServerUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 217
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getScaleBandPackageInfo() type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    const/4 v0, 0x0

    return-object v0

    .line 221
    :cond_0
    new-instance v4, Landroid/content/pm/PackageInfo;

    invoke-direct {v4}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 223
    const-string v0, "34fa0346-d46c-439d-9cb0-2f696618846b"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    const-string v0, "com.huawei.ch18"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    .line 225
    :cond_1
    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 226
    const-string v0, "com.huawei.ch100"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    .line 227
    :cond_2
    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 228
    const-string v0, "com.huawei.ah100"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 230
    :cond_3
    :goto_0
    const/4 v0, 0x0

    iput v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 231
    iput-object p2, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 232
    return-object v4
.end method

.method private c()Landroid/content/pm/PackageInfo;
    .locals 6

    .line 153
    iget-object v0, p0, Lo/dpi;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 155
    :try_start_0
    iget-object v0, p0, Lo/dpi;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 156
    return-object v5

    .line 157
    :catch_0
    move-exception v5

    .line 158
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get App PackageInfo exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;Lo/dps;)V
    .locals 7

    .line 74
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkBandNewVersion() type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+macAddress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+handler = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkBandNewVersion() mUpdateServerUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkBandNewVersion() Url.CHECK_TEST_VERSION_URL=https://query.hwcloudtest.cn/ring/v2/CheckEx.action?ruleAttr=true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const-string v0, "https://query.hwcloudtest.cn/ring/v2/CheckEx.action?ruleAttr=true"

    invoke-static {v0}, Lo/dpm;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->a(Ljava/lang/String;)V

    .line 82
    :goto_0
    invoke-virtual {p0, p1, p2}, Lo/dpi;->e(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 83
    if-eqz v6, :cond_1

    .line 84
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    move-object v1, v6

    move-object v2, p3

    iget-object v3, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v4, p4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->d(Landroid/content/pm/PackageInfo;Ljava/lang/String;Landroid/content/Context;Lo/dps;Ljava/lang/Boolean;)V

    goto :goto_1

    .line 86
    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p4, v0}, Lo/dps;->a(I)V

    .line 88
    :goto_1
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lo/dps;Ljava/lang/String;)V
    .locals 7

    .line 205
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkScaleBandNewVersion() type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+handler = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkScaleBandNewVersion() mUpdateServerUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    const-string v0, "https://query.hicloud.com/accessory/v2/checkEx.action"

    invoke-static {v0}, Lo/dpm;->d(Ljava/lang/String;)V

    .line 208
    invoke-direct {p0, p1, p2}, Lo/dpi;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 209
    if-eqz v6, :cond_0

    .line 210
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    move-object v1, v6

    iget-object v2, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v3, p3

    move-object v4, p1

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->a(Landroid/content/pm/PackageInfo;Landroid/content/Context;Lo/dps;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 212
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p3, v0}, Lo/dps;->a(I)V

    .line 214
    :goto_0
    return-void
.end method

.method public a(Lo/dpq;Ljava/lang/Boolean;)V
    .locals 6

    .line 175
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->a(Landroid/content/Context;Lo/dpq;Ljava/lang/Boolean;ZZ)V

    .line 176
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 194
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "install: path = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/dpi;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 196
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "install: pkgName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, v4}, Lo/dpe;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method public b(Ljava/lang/String;Lo/dps;)V
    .locals 7

    .line 61
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkAppNewVersion() telephIMEI="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+handler = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkAppNewVersion() mUpdateServerUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lo/dpi;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->a(Ljava/lang/String;)V

    .line 64
    invoke-direct {p0}, Lo/dpi;->c()Landroid/content/pm/PackageInfo;

    move-result-object v6

    .line 65
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 66
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    move-object v1, v6

    move-object v2, p1

    iget-object v3, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v4, p2

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->d(Landroid/content/pm/PackageInfo;Ljava/lang/String;Landroid/content/Context;Lo/dps;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 68
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lo/dps;->a(I)V

    .line 70
    :goto_0
    return-void
.end method

.method public b(Lo/dpp;Ljava/lang/Boolean;)V
    .locals 6

    .line 190
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->d(Landroid/content/Context;Lo/dpp;Ljava/lang/Boolean;ZZ)V

    .line 191
    return-void
.end method

.method public b(Lo/dpq;Ljava/lang/Boolean;)V
    .locals 6

    .line 170
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->a(Landroid/content/Context;Lo/dpq;Ljava/lang/Boolean;ZZ)V

    .line 171
    return-void
.end method

.method public c(Lo/dpp;Ljava/lang/Boolean;)V
    .locals 6

    .line 185
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->d(Landroid/content/Context;Lo/dpp;Ljava/lang/Boolean;ZZ)V

    .line 186
    return-void
.end method

.method public c(Lo/dpq;Ljava/lang/Boolean;)V
    .locals 6

    .line 165
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->a(Landroid/content/Context;Lo/dpq;Ljava/lang/Boolean;ZZ)V

    .line 166
    return-void
.end method

.method public d(Lo/dpp;Ljava/lang/Boolean;)V
    .locals 6

    .line 180
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    move-object v2, p1

    move-object v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dpe;->d(Landroid/content/Context;Lo/dpp;Ljava/lang/Boolean;ZZ)V

    .line 181
    return-void
.end method

.method public e(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 91
    const-string v0, "UpdateBase"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBandPackageInfo() type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    const/4 v0, 0x0

    return-object v0

    .line 95
    :cond_0
    new-instance v4, Landroid/content/pm/PackageInfo;

    invoke-direct {v4}, Landroid/content/pm/PackageInfo;-><init>()V

    .line 97
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 99
    :pswitch_0
    const-string v0, "com.huawei.bzero.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 100
    goto/16 :goto_1

    .line 102
    :pswitch_1
    const-string v0, "com.huawei.gemini.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 103
    goto :goto_1

    .line 105
    :pswitch_2
    const-string v0, "com.huawei.btwo.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 106
    goto :goto_1

    .line 108
    :pswitch_3
    const-string v0, "com.huawei.metis.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 109
    goto :goto_1

    .line 111
    :pswitch_4
    const-string v0, "com.huawei.aonepro.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 112
    goto :goto_1

    .line 114
    :pswitch_5
    const-string v0, "com.huawei.nyx.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 115
    goto :goto_1

    .line 117
    :pswitch_6
    const-string v0, "com.huawei.Eris.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 118
    goto :goto_1

    .line 120
    :pswitch_7
    const-string v0, "com.huawei.grus.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 121
    goto :goto_1

    .line 123
    :pswitch_8
    const-string v0, "com.huawei.Janus.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 124
    goto :goto_1

    .line 126
    :pswitch_9
    const-string v0, "com.huawei.Crius.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 127
    goto :goto_1

    .line 129
    :pswitch_a
    const-string v0, "com.huawei.Terra.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 130
    goto :goto_1

    .line 132
    :pswitch_b
    const-string v0, "com.huawei.Talos.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 133
    goto :goto_1

    .line 135
    :pswitch_c
    const-string v0, "com.huawei.Fortuna.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 136
    goto :goto_1

    .line 138
    :pswitch_d
    const-string v0, "com.huawei.AW70B29.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 139
    goto :goto_1

    .line 141
    :pswitch_e
    const-string v0, "com.huawei.AW70B19.firmware"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 142
    goto :goto_1

    .line 144
    :goto_0
    :pswitch_f
    const/4 v0, 0x0

    return-object v0

    .line 147
    :goto_1
    const/4 v0, 0x0

    iput v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 148
    iput-object p2, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 149
    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_0
        :pswitch_f
        :pswitch_1
        :pswitch_3
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_f
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_f
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method

.method public e()V
    .locals 2

    .line 201
    iget-object v0, p0, Lo/dpi;->d:Lo/dpe;

    iget-object v1, p0, Lo/dpi;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dpe;->c(Landroid/content/Context;)V

    .line 202
    return-void
.end method
