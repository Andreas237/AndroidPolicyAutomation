.class Lo/agl$5$5;
.super Lo/acl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agl$5;->onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/device/open/HealthDevice;

.field final synthetic b:Lo/agl$5;


# direct methods
.method constructor <init>(Lo/agl$5;Lcom/huawei/hihealth/device/open/HealthDevice;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lo/agl$5$5;->b:Lo/agl$5;

    iput-object p2, p0, Lo/agl$5$5;->a:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-direct {p0}, Lo/acl;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lo/agl$5$5;->a:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 284
    iget-object v0, p0, Lo/agl$5$5;->a:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 294
    iget-object v0, p0, Lo/agl$5$5;->a:Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/open/HealthDevice;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
