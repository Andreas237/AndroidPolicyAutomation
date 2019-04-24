.class public Lo/cbt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/cbt;->b:I

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->c:Z

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->e:Z

    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 33
    iput-object p1, p0, Lo/cbt;->d:Landroid/content/Context;

    .line 34
    iput p2, p0, Lo/cbt;->b:I

    .line 35
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/location/Location;)V
    .locals 1

    .line 59
    iget v0, p0, Lo/cbt;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 61
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lo/cbt;->d(Landroid/content/Context;Landroid/location/Location;)V

    .line 62
    goto :goto_1

    .line 64
    :pswitch_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 65
    goto :goto_1

    .line 67
    :pswitch_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 68
    goto :goto_1

    .line 70
    :goto_0
    invoke-direct {p0, p1, p2}, Lo/cbt;->d(Landroid/content/Context;Landroid/location/Location;)V

    .line 73
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Landroid/content/Context;Landroid/location/Location;)V
    .locals 4

    .line 76
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 77
    :cond_0
    return-void

    .line 79
    :cond_1
    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dhk;->e(DD)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 81
    :pswitch_0
    const-string v0, "Track_ConvertManger"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 83
    goto :goto_1

    .line 85
    :pswitch_1
    const-string v0, "Track_ConvertManger"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 87
    goto :goto_1

    .line 89
    :pswitch_2
    const-string v0, "Track_ConvertManger"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AREA 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-static {p1}, Lo/cds;->a(Landroid/content/Context;)V

    .line 91
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 92
    goto :goto_1

    .line 94
    :goto_0
    const-string v0, "Track_ConvertManger"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInChina default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbt;->a:Z

    .line 99
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public c(Landroid/location/Location;)Lo/cgk;
    .locals 6

    .line 38
    iget-boolean v0, p0, Lo/cbt;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "network"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lo/cbt;->d:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lo/cbt;->a(Landroid/content/Context;Landroid/location/Location;)V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbt;->e:Z

    .line 42
    :cond_0
    iget-boolean v0, p0, Lo/cbt;->c:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GpsMockProvider"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    :cond_1
    iget-object v0, p0, Lo/cbt;->d:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lo/cbt;->a(Landroid/content/Context;Landroid/location/Location;)V

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbt;->c:Z

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbt;->e:Z

    .line 48
    :cond_2
    iget-boolean v0, p0, Lo/cbt;->a:Z

    if-eqz v0, :cond_3

    .line 50
    iget-object v0, p0, Lo/cbt;->d:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cdr;->b(Landroid/content/Context;Landroid/location/Location;)[D

    move-result-object v5

    .line 51
    new-instance v4, Lo/cgk;

    const/4 v0, 0x0

    aget-wide v0, v5, v0

    const/4 v2, 0x1

    aget-wide v2, v5, v2

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cgk;-><init>(DD)V

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    new-instance v4, Lo/cgk;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {v4, v0, v1, v2, v3}, Lo/cgk;-><init>(DD)V

    .line 55
    :goto_0
    return-object v4
.end method
