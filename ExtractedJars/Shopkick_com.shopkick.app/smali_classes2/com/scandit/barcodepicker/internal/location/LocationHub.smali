.class public Lcom/scandit/barcodepicker/internal/location/LocationHub;
.super Ljava/lang/Object;
.source "LocationHub.java"


# static fields
.field private static final DESIRED_ACCURACY:I = 0x32


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLastKnownLocation(Landroid/content/Context;)Landroid/location/Location;
    .locals 10

    const-string v0, "location"

    .line 40
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    .line 43
    new-instance v0, Landroid/location/Criteria;

    invoke-direct {v0}, Landroid/location/Criteria;-><init>()V

    const/4 v1, 0x1

    .line 44
    invoke-virtual {v0, v1}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 45
    invoke-virtual {p0, v1}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 48
    :try_start_0
    invoke-virtual {p0, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_0

    .line 53
    invoke-virtual {v2}, Landroid/location/Location;->hasAccuracy()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Landroid/location/Location;->hasAccuracy()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 54
    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    invoke-virtual {v3}, Landroid/location/Location;->getAccuracy()F

    move-result v6

    sub-float/2addr v4, v6

    .line 57
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const/high16 v7, 0x42480000    # 50.0f

    cmpg-float v6, v6, v7

    if-gez v6, :cond_3

    move v4, v5

    goto :goto_1

    :cond_2
    move v4, v5

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_0

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_0

    :goto_2
    move-object v2, v3

    goto :goto_0

    :catch_0
    return-object v1

    :cond_4
    return-object v2
.end method
