.class Lo/dhq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/GpsStatus$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dhq;


# direct methods
.method constructor <init>(Lo/dhq;)V
    .locals 0

    .line 506
    iput-object p1, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGpsStatusChanged(I)V
    .locals 6

    .line 511
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 513
    :pswitch_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test GPS Signal GPS_EVENT_FIRST_FIX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    goto/16 :goto_1

    .line 516
    :pswitch_1
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->g(Lo/dhq;)Landroid/location/LocationManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 517
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->g(Lo/dhq;)Landroid/location/LocationManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    move-result-object v4

    .line 518
    invoke-static {v4}, Lo/dhm;->e(Landroid/location/GpsStatus;)Lo/dhf;

    move-result-object v5

    .line 519
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v0, v4}, Lo/dhq;->a(Lo/dhq;Landroid/location/GpsStatus;)V

    .line 520
    if-eqz v5, :cond_0

    .line 521
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v5}, Lo/dhm;->c(Lo/dhf;)I

    move-result v1

    invoke-static {v0, v1}, Lo/dhq;->d(Lo/dhq;I)V

    .line 522
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test GPS Signal GPS_EVENT_SATELLITE_STATUS "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/dhf;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 524
    :cond_0
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dhq;->d(Lo/dhq;I)V

    .line 525
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test GPS Signal GPS_EVENT_SATELLITE_STATUS GPS_STATE_OUT_OF_SERVICE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    :goto_0
    goto :goto_1

    .line 530
    :pswitch_2
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test GPS Signal GPS_EVENT_STARTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dhq;->d(Lo/dhq;I)V

    .line 532
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/dhq;->b(Lo/dhq;I)V

    .line 533
    goto :goto_1

    .line 535
    :pswitch_3
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "test GPS Signal GPS_EVENT_STOPPED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->m(Lo/dhq;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->m(Lo/dhq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 538
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dhq;->d(Lo/dhq;I)V

    .line 539
    iget-object v0, p0, Lo/dhq$1;->d:Lo/dhq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dhq;->b(Lo/dhq;I)V

    .line 546
    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
