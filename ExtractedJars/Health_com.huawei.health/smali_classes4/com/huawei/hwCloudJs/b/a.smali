.class public Lcom/huawei/hwCloudJs/b/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/content/Context;

.field private static b:Z

.field private static c:Landroid/support/v4/content/LocalBroadcastManager;

.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hwCloudJs/b/a;->b:Z

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v0

    sput v0, Lcom/huawei/hwCloudJs/b/a;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/b/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwCloudJs/b/a;->a:Landroid/content/Context;

    sget-object v0, Lcom/huawei/hwCloudJs/b/a;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwCloudJs/b/a;->c:Landroid/support/v4/content/LocalBroadcastManager;

    return-void
.end method

.method public static a(ZI)V
    .locals 0

    sput-boolean p0, Lcom/huawei/hwCloudJs/b/a;->b:Z

    sput p1, Lcom/huawei/hwCloudJs/b/a;->d:I

    return-void
.end method

.method public static b()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/hwCloudJs/b/a;->b:Z

    return v0
.end method

.method public static c()I
    .locals 1

    sget v0, Lcom/huawei/hwCloudJs/b/a;->d:I

    return v0
.end method

.method public static d()Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/b/a;->c:Landroid/support/v4/content/LocalBroadcastManager;

    return-object v0
.end method
