.class Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;->c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 211
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick multisim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 214
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iO:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 215
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;->c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 218
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    new-instance v6, Landroid/content/ComponentName;

    const-string v0, "com.huawei.hwmultisim"

    const-string v1, "com.huawei.hwmultisim.views.IntroduceActivity"

    invoke-direct {v6, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 221
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;->c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 225
    goto :goto_0

    .line 222
    :catch_0
    move-exception v5

    .line 223
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not start multisim apk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;->c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->c(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V

    .line 225
    goto :goto_0

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;->c:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->c(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V

    .line 229
    :goto_0
    return-void
.end method
