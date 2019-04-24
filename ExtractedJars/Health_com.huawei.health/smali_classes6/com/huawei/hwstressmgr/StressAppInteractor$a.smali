.class Lcom/huawei/hwstressmgr/StressAppInteractor$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwstressmgr/StressAppInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwstressmgr/StressAppInteractor;


# direct methods
.method private constructor <init>(Lcom/huawei/hwstressmgr/StressAppInteractor;)V
    .locals 0

    .line 1077
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;->e:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwstressmgr/StressAppInteractor;Lcom/huawei/hwstressmgr/StressAppInteractor$1;)V
    .locals 0

    .line 1077
    invoke-direct {p0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor$a;-><init>(Lcom/huawei/hwstressmgr/StressAppInteractor;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1080
    if-nez p2, :cond_0

    .line 1081
    const-string v0, "Opera_StressService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "intent = null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    return-void

    .line 1085
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 1087
    const-string v0, "Opera_StressService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " action = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;->e:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->g(Lcom/huawei/hwstressmgr/StressAppInteractor;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;->e:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->g(Lcom/huawei/hwstressmgr/StressAppInteractor;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 1090
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;->e:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$a;->e:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1093
    :cond_1
    return-void
.end method
