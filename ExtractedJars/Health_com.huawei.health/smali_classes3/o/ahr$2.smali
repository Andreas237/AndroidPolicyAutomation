.class Lo/ahr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aby;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahr;->e(Lo/afj;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

.field final synthetic e:Lo/ahr;


# direct methods
.method constructor <init>(Lo/ahr;Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lo/ahr$2;->e:Lo/ahr;

    iput-object p2, p0, Lo/ahr$2;->d:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lo/acl;)V
    .locals 0

    .line 316
    return-void
.end method

.method public onScanFailed(I)V
    .locals 0

    .line 318
    return-void
.end method

.method public onStateChanged(I)V
    .locals 4

    .line 321
    const-string v0, "UpdataDeviceControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindWiFiUpdateDevice onStateChanged code "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 323
    iget-object v0, p0, Lo/ahr$2;->e:Lo/ahr;

    iget-object v1, p0, Lo/ahr$2;->d:Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/DeviceDetailInfo;->getDevId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahr;->d(Lo/ahr;Ljava/lang/String;)V

    .line 324
    return-void
.end method
