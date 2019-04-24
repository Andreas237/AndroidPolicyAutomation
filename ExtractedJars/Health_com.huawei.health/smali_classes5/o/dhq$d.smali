.class Lo/dhq$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Z

.field final synthetic c:Lo/dhq;


# direct methods
.method private constructor <init>(Lo/dhq;)V
    .locals 1

    .line 326
    iput-object p1, p0, Lo/dhq$d;->c:Lo/dhq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dhq$d;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/dhq;Lo/dhq$1;)V
    .locals 0

    .line 326
    invoke-direct {p0, p1}, Lo/dhq$d;-><init>(Lo/dhq;)V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4

    .line 332
    iget-object v0, p0, Lo/dhq$d;->c:Lo/dhq;

    invoke-static {v0, p1}, Lo/dhq;->e(Lo/dhq;Landroid/location/Location;)V

    .line 333
    iget-object v0, p0, Lo/dhq$d;->c:Lo/dhq;

    invoke-static {v0, p1}, Lo/dhq;->c(Lo/dhq;Landroid/location/Location;)Landroid/location/Location;

    .line 334
    iget-object v0, p0, Lo/dhq$d;->c:Lo/dhq;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/dhq;->b(Lo/dhq;J)J

    .line 337
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lo/dhq$d;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    const/high16 v1, 0x420c0000    # 35.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 339
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " stop network location!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/dhq$d;->c:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->i(Lo/dhq;)V

    .line 341
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dhq$d;->a:Z

    .line 342
    iget-object v0, p0, Lo/dhq$d;->c:Lo/dhq;

    iget-boolean v1, p0, Lo/dhq$d;->a:Z

    invoke-static {v0, v1}, Lo/dhq;->e(Lo/dhq;Z)Z

    .line 344
    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 349
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 354
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 358
    return-void
.end method
