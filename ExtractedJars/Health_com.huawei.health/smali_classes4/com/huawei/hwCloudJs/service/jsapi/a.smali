.class public final Lcom/huawei/hwCloudJs/service/jsapi/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "JsCoreHelper"

.field private static b:Lcom/huawei/hwCloudJs/service/jsapi/a; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/service/jsapi/a;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/jsapi/a;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/jsapi/a;->b:Lcom/huawei/hwCloudJs/service/jsapi/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/service/jsapi/a;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/service/jsapi/a;->b:Lcom/huawei/hwCloudJs/service/jsapi/a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;
    .locals 6

    new-instance v2, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;

    invoke-direct {v2}, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->setBrowserType(Ljava/lang/String;)V

    invoke-static {p1, v3}, Lcom/huawei/hwCloudJs/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->setClientVersion(Ljava/lang/String;)V

    invoke-static {p1, v3}, Lcom/huawei/hwCloudJs/d/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->setClientVersionCode(Ljava/lang/String;)V

    return-object v2
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v2, ""

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    return-object v2

    :cond_0
    const/16 v0, 0x40

    :try_start_0
    invoke-virtual {v3, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v5, v4, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v5, :cond_1

    array-length v0, v5

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "JsCoreHelper"

    const-string v1, "getSign PackageManager.NameNotFoundException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-object v2
.end method
