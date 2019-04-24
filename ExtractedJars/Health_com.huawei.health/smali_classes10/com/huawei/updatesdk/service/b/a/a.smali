.class public Lcom/huawei/updatesdk/service/b/a/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/service/b/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/service/b/a/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 2

    const-string v0, "client.front2"

    const-class v1, Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse;

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/storekit/a;->a(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v0, "client.diffUpgrade2"

    const-class v1, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/service/storekit/a;->a(Ljava/lang/String;Ljava/lang/Class;)V

    return-void
.end method
