.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 1209
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1212
    new-instance v6, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dcy;-><init>(I)V

    .line 1213
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_wear_time"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1214
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1213
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1215
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9$5;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9;)V

    invoke-virtual {v0, v1}, Lo/aks;->i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1221
    return-void
.end method
