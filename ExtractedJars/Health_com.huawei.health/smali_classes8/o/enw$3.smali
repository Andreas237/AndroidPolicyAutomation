.class Lo/enw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/enw;


# direct methods
.method constructor <init>(Lo/enw;JLcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;)V
    .locals 0

    .line 323
    iput-object p1, p0, Lo/enw$3;->d:Lo/enw;

    iput-wide p2, p0, Lo/enw$3;->a:J

    iput-object p4, p0, Lo/enw$3;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p5, p0, Lo/enw$3;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 326
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_SUPPORT_IN_WEAR"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 327
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 329
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    new-instance v1, Lo/enw$3$5;

    invoke-direct {v1, p0}, Lo/enw$3$5;-><init>(Lo/enw$3;)V

    invoke-virtual {v0, v1}, Lo/aks;->g(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 361
    return-void
.end method
