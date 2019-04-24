.class Lo/dgr$3;
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
.field final synthetic b:Lo/dgr;


# direct methods
.method constructor <init>(Lo/dgr;)V
    .locals 0

    .line 375
    iput-object p1, p0, Lo/dgr$3;->b:Lo/dgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 378
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lo/dgr;->a(Lo/dgr;Z)Z

    .line 379
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->e(Lo/dgr;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 381
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lo/dgr;->a(Lo/dgr;J)J

    .line 382
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 384
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->b(Lo/dgr;)Lcom/huawei/datatype/GpsParameter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/datatype/GpsParameter;->getGps_info_bitmap()I

    move-result v0

    const/16 v1, 0xf

    if-le v0, v1, :cond_0

    .line 385
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bitmap not support lat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-nez v0, :cond_0

    .line 387
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not emui5.0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const v1, 0x1e464

    invoke-virtual {v0, v1}, Lo/dgr;->d(I)V

    .line 389
    return-void

    .line 394
    :cond_0
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    invoke-static {v0}, Lo/dgr;->d(Lo/dgr;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dgo;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 395
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device enable set gps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const v1, 0x186a0

    invoke-virtual {v0, v1}, Lo/dgr;->d(I)V

    .line 397
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v0

    iget-object v1, p0, Lo/dgr$3;->b:Lo/dgr;

    iget-object v1, v1, Lo/dgr;->d:Lo/dhj;

    const-string v2, "wearSportTrackLocation"

    invoke-virtual {v0, v1, v2}, Lo/dhg;->e(Lo/dhj;Ljava/lang/String;)V

    .line 398
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dgr;->b(Lo/dgr;Landroid/location/Location;)Landroid/location/Location;

    .line 399
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dgr;->c(Lo/dgr;Z)V

    goto :goto_0

    .line 402
    :cond_1
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gps not open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const v1, 0x1e463

    invoke-virtual {v0, v1}, Lo/dgr;->d(I)V

    .line 405
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dgr;->c(Lo/dgr;Z)V

    goto :goto_0

    .line 410
    :cond_2
    const-string v0, "HWGPSLocationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device disenable set gps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lo/dgr$3;->b:Lo/dgr;

    const v1, 0x186a0

    invoke-virtual {v0, v1}, Lo/dgr;->d(I)V

    .line 412
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v0

    const-string v1, "wearSportTrackLocation"

    invoke-virtual {v0, v1}, Lo/dhg;->d(Ljava/lang/String;)V

    .line 414
    :cond_3
    :goto_0
    return-void
.end method
