.class Lo/dkl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dkl;


# direct methods
.method constructor <init>(Lo/dkl;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/location/Location;)V
    .locals 6

    .line 604
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ILocationResultCallback onLocationChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 606
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->c(Lo/dkl;Z)Z

    .line 607
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get hwLocationCallback,GpsRegiste is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v3}, Lo/dkl;->i(Lo/dkl;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    if-eqz p1, :cond_2

    .line 609
    invoke-static {p1}, Lo/dkl;->a(Landroid/location/Location;)Landroid/location/Location;

    .line 610
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleWhenGetLocationSuccess() getLocationObj Success getLatitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 611
    invoke-static {}, Lo/dkl;->a()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", getLongitude="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 612
    invoke-static {}, Lo/dkl;->a()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 610
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->t(Lo/dkl;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 614
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0, p1}, Lo/dkl;->e(Lo/dkl;Landroid/location/Location;)V

    .line 616
    :cond_0
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->u(Lo/dkl;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 617
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->r(Lo/dkl;)V

    .line 618
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;Z)Z

    .line 620
    :cond_1
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->d(Lo/dkl;I)I

    .line 622
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->n(Lo/dkl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "WEATHER_LATITUDE_KEY"

    .line 623
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 622
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 624
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->n(Lo/dkl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "WEATHER_LONGITUDE_KEY"

    .line 625
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 624
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 627
    :cond_2
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->t(Lo/dkl;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 628
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get gps location fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->s(Lo/dkl;)V

    .line 631
    :cond_3
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->b(Lo/dkl;Z)Z

    .line 633
    :goto_0
    iget-object v0, p0, Lo/dkl$3;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->g(Lo/dkl;)V

    .line 634
    return-void
.end method
