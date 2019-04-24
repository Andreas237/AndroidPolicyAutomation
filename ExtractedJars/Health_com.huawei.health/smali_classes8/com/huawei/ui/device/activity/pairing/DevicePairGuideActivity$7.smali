.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

.field final synthetic c:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/util/Map;)V
    .locals 0

    .line 1230
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->b:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1233
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 1235
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->b:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->b:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 1236
    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_1

    .line 1237
    :cond_0
    move-object v5, p2

    check-cast v5, Lcom/huawei/datatype/DataDeviceInfo;

    .line 1246
    :cond_1
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->J:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1247
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    const-string v1, "devicename"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 1248
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 1251
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    const-string v1, "device_name"

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    const-string v1, "device_type"

    const-string v2, "HDK_WEAR"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1254
    sget-object v0, Lo/dae;->fI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 1255
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;->c:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v6, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1258
    :cond_2
    return-void
.end method
