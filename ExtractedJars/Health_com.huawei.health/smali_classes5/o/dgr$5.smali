.class Lo/dgr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgr;


# direct methods
.method constructor <init>(Lo/dgr;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lo/dgr$5;->a:Lo/dgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 359
    iget-object v0, p0, Lo/dgr$5;->a:Lo/dgr;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/GpsParameter;

    invoke-static {v0, v1}, Lo/dgr;->b(Lo/dgr;Lcom/huawei/datatype/GpsParameter;)Lcom/huawei/datatype/GpsParameter;

    .line 360
    iget-object v0, p0, Lo/dgr$5;->a:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 361
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bitmap"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dgr$5;->a:Lo/dgr;

    invoke-static {v3}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/datatype/GpsParameter;->getGps_info_bitmap()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",fomat="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dgr$5;->a:Lo/dgr;

    invoke-static {v3}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/datatype/GpsParameter;->getGps_para_format()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",threshold="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dgr$5;->a:Lo/dgr;

    invoke-static {v3}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/datatype/GpsParameter;->getGps_threshold()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :cond_0
    return-void
.end method
