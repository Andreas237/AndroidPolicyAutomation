.class public Lcom/sina/weibo/sdk/ApiUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final BUILD_INT:I = 0x286e

.field public static final BUILD_INT_440:I = 0x2873

.field public static final BUILD_INT_VER_2_2:I = 0x286f

.field public static final BUILD_INT_VER_2_3:I = 0x2870

.field public static final BUILD_INT_VER_2_5:I = 0x2871

.field public static final STORY_INT_VER:I = 0x2a14

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lcom/sina/weibo/sdk/ApiUtils;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/ApiUtils;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static containSign([Landroid/content/pm/Signature;Ljava/lang/String;)Z
    .locals 7

    .line 85
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 86
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_1
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 89
    invoke-virtual {v5}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest([B)Ljava/lang/String;

    move-result-object v6

    .line 90
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    sget-object v0, Lcom/sina/weibo/sdk/ApiUtils;->TAG:Ljava/lang/String;

    const-string v1, "check pass"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static validateWeiboSign(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 62
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 71
    goto :goto_0

    .line 69
    :catch_0
    move-exception v3

    .line 70
    const/4 v0, 0x0

    return v0

    .line 73
    :goto_0
    iget-object v0, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const-string v1, "18da2bf10352443a00a5e046d9fca6bd"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/ApiUtils;->containSign([Landroid/content/pm/Signature;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
