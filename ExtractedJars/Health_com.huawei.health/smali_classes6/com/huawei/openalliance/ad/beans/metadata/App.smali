.class public Lcom/huawei/openalliance/ad/beans/metadata/App;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "App"


# instance fields
.field private name__:Ljava/lang/String;

.field private pkgname__:Ljava/lang/String;

.field private version__:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->pkgname__:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->pkgname__:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->version__:Ljava/lang/String;

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v2}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->name__:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "App"

    const-string v1, "fail to get packageInfo"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getName__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->name__:Ljava/lang/String;

    return-object v0
.end method

.method public getPkgname__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->pkgname__:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion__()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->version__:Ljava/lang/String;

    return-object v0
.end method

.method public setName__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->name__:Ljava/lang/String;

    return-void
.end method

.method public setPkgname__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->pkgname__:Ljava/lang/String;

    return-void
.end method

.method public setVersion__(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/App;->version__:Ljava/lang/String;

    return-void
.end method
