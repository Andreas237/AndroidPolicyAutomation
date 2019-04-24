.class public Lo/cbl;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static b:Lo/cbl;


# instance fields
.field private a:Lo/cbp;

.field private c:Landroid/content/Context;

.field private d:Lo/ceu;

.field private e:Lo/cbz;

.field private f:Z

.field private g:Z

.field private h:Lo/ceu;

.field private i:J

.field private k:Ljava/util/ArrayList;

.field private n:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    const/4 v0, 0x0

    sput-object v0, Lo/cbl;->b:Lo/cbl;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 101
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbl;->a:Lo/cbp;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbl;->d:Lo/ceu;

    .line 78
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cbl;->i:J

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbl;->h:Lo/ceu;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cbl;->k:Ljava/util/ArrayList;

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbl;->f:Z

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbl;->g:Z

    .line 87
    new-instance v0, Lo/cbl$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cbl$1;-><init>(Lo/cbl;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cbl;->n:Landroid/os/Handler;

    .line 102
    new-instance v0, Lo/cbz;

    invoke-direct {v0}, Lo/cbz;-><init>()V

    iput-object v0, p0, Lo/cbl;->e:Lo/cbz;

    .line 104
    return-void
.end method

.method public static b()Lo/cbl;
    .locals 3

    .line 107
    const-class v1, Lo/cbl;

    monitor-enter v1

    .line 108
    :try_start_0
    sget-object v0, Lo/cbl;->b:Lo/cbl;

    if-nez v0, :cond_0

    .line 109
    new-instance v0, Lo/cbl;

    invoke-direct {v0}, Lo/cbl;-><init>()V

    sput-object v0, Lo/cbl;->b:Lo/cbl;

    .line 111
    :cond_0
    sget-object v0, Lo/cbl;->b:Lo/cbl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 112
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b(I)[Ljava/lang/String;
    .locals 3

    .line 312
    const/16 v0, 0x108

    if-ne p1, v0, :cond_0

    .line 313
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    goto :goto_0

    .line 315
    :cond_0
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 323
    :goto_0
    return-object v2
.end method

.method private c(II)V
    .locals 5

    .line 785
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 786
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTrackType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cbu;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    invoke-virtual {v4}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 788
    const/16 v0, 0x102

    if-eq p2, v0, :cond_0

    const/16 v0, 0x101

    if-ne p2, v0, :cond_1

    .line 789
    :cond_0
    invoke-virtual {v4, p2}, Lo/cbu;->e(I)V

    goto :goto_0

    .line 792
    :cond_1
    invoke-direct {p0}, Lo/cbl;->u()V

    .line 793
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 794
    invoke-virtual {v4, p1}, Lo/cbu;->b(I)V

    goto :goto_0

    .line 796
    :cond_2
    invoke-virtual {v4}, Lo/cbu;->a()I

    move-result v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_3

    .line 797
    const/16 v0, 0x64

    invoke-virtual {v4, v0}, Lo/cbu;->b(I)V

    goto :goto_0

    .line 800
    :cond_3
    invoke-virtual {v4, p1}, Lo/cbu;->b(I)V

    .line 802
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;I)Ljava/lang/String;
    .locals 3

    .line 1035
    .line 1036
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_type_sportting"

    .line 1035
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1037
    if-eqz v2, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1038
    return-object v2

    .line 1041
    :cond_0
    const/16 v0, 0x102

    if-ne p2, v0, :cond_1

    .line 1042
    .line 1043
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_type_outdoor_running"

    .line 1042
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1044
    :cond_1
    const/16 v0, 0x108

    if-ne p2, v0, :cond_2

    .line 1045
    .line 1046
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_type_indoor_running"

    .line 1045
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1047
    :cond_2
    const/16 v0, 0x101

    if-ne p2, v0, :cond_3

    .line 1048
    .line 1049
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_type_outdoor_walk"

    .line 1048
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1050
    :cond_3
    const/16 v0, 0x103

    if-ne p2, v0, :cond_4

    .line 1051
    .line 1052
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_type_outdoor_bike"

    .line 1051
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1054
    :cond_4
    const-string v0, ""

    return-object v0
.end method

.method private e(Landroid/content/Context;II)Ljava/lang/String;
    .locals 2

    .line 1013
    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    .line 1014
    .line 1015
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_value_sportting"

    .line 1014
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1017
    :cond_0
    const/16 v0, 0x102

    if-ne p2, v0, :cond_1

    .line 1018
    .line 1019
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_value_outdoor_running"

    .line 1018
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1020
    :cond_1
    const/16 v0, 0x108

    if-ne p2, v0, :cond_2

    .line 1021
    .line 1022
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_value_indoor_running"

    .line 1021
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1023
    :cond_2
    const/16 v0, 0x101

    if-ne p2, v0, :cond_3

    .line 1024
    .line 1025
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_value_outdoor_walk"

    .line 1024
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1026
    :cond_3
    const/16 v0, 0x103

    if-ne p2, v0, :cond_4

    .line 1027
    .line 1028
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport_target_value_outdoor_bike"

    .line 1027
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1030
    :cond_4
    const-string v0, ""

    return-object v0
.end method

.method private e(I)V
    .locals 7

    .line 364
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 365
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    const-string v0, "sportType"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/cbl;->c:Landroid/content/Context;

    sget-object v2, Lo/dae;->hR:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 368
    invoke-static {p1}, Lo/cdl;->d(I)I

    move-result v5

    .line 369
    if-eqz v5, :cond_0

    .line 370
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_RUN_START_2050005:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/huawei/operation/OpAnalyticsUtil;->setEventWithActionType(ILjava/lang/String;)V

    .line 371
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 372
    const-string v0, "actiontype"

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_PVUV_85050001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 375
    :cond_0
    return-void
.end method

.method private g(Landroid/content/Context;)I
    .locals 6

    .line 327
    if-nez p1, :cond_0

    .line 328
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const/4 v0, 0x5

    return v0

    .line 332
    :cond_0
    invoke-static {p1}, Lo/cds;->a(Landroid/content/Context;)V

    .line 334
    invoke-static {}, Lo/cds;->a()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lo/cds;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 335
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not have GooglePlayServices!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 338
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogContext is not activity context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const/4 v0, 0x6

    return v0

    .line 344
    :cond_1
    :try_start_0
    new-instance v5, Lo/egy$b;

    invoke-direct {v5, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 345
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_map_type_no_gms:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_common_ui_dialog_confirm:I

    new-instance v2, Lo/cbl$2;

    invoke-direct {v2, p0}, Lo/cbl$2;-><init>(Lo/cbl;)V

    .line 346
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 351
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 352
    invoke-virtual {v4}, Lo/egy;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    goto :goto_0

    .line 353
    :catch_0
    move-exception v4

    .line 354
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogContext cant be used to show dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x6

    return v0

    .line 357
    :goto_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogContext has no google service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const/4 v0, 0x2

    return v0

    .line 360
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private m()V
    .locals 3

    .line 147
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    const-string v2, "amap"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amap/api/maps/MapsInitializer;->sdcardDir:Ljava/lang/String;

    .line 148
    return-void
.end method

.method private r()V
    .locals 4

    .line 773
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 774
    iget-object v0, p0, Lo/cbl;->k:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    return-void
.end method

.method private u()V
    .locals 3

    .line 158
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v2

    .line 160
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 161
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/cbu;->d(Z)V

    .line 162
    invoke-virtual {v2}, Lo/cbu;->G()V

    .line 165
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "motion_path2.txt"

    invoke-static {v0, v1}, Lo/cdl;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "simplemotion.txt"

    invoke-static {v0, v1}, Lo/cdl;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 169
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 1068
    invoke-static {}, Lo/cbr;->c()Lo/cbr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbr;->e(Landroid/content/Context;)V

    .line 1069
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 496
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 497
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0xa

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 498
    const-string v0, "SPEAK_PARAMETER_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 499
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 500
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 501
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Z)V
    .locals 6

    .line 661
    if-nez p1, :cond_0

    .line 662
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap contentpath is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    return-void

    .line 664
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 665
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap contentpath is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    return-void

    .line 669
    :cond_1
    if-nez p2, :cond_2

    .line 670
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap simplifyData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 671
    return-void

    .line 673
    :cond_2
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show track map = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 676
    const-string v0, "simplifyDatakey"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 677
    const-string v0, "contentpath"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 678
    if-eqz p3, :cond_3

    .line 679
    const-string v0, "isAfterSport"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 681
    :cond_3
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 682
    invoke-virtual {v5, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 683
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 684
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 686
    return-void
.end method

.method public a()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Lo/cbl;->g:Z

    return v0
.end method

.method public b(Lo/ceu;)I
    .locals 5

    .line 419
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 421
    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 423
    :cond_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Stop Track by outter operation and sport is not running, failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    const/4 v0, 0x1

    return v0

    .line 427
    :cond_1
    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 428
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Stop Track by outter operation and SPORTS_STATUS_SPORTING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    invoke-virtual {v4}, Lo/cbu;->U()V

    .line 430
    invoke-virtual {v4}, Lo/cbu;->Z()V

    goto :goto_0

    .line 431
    :cond_2
    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 432
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Stop Track by outter operation and SPORTS_STATUS_PAUSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    invoke-virtual {v4}, Lo/cbu;->Z()V

    .line 436
    :cond_3
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/ceu;J)I
    .locals 1

    .line 746
    iput-object p1, p0, Lo/cbl;->d:Lo/ceu;

    .line 747
    iput-wide p2, p0, Lo/cbl;->i:J

    .line 748
    const/4 v0, 0x0

    return v0
.end method

.method public b(Landroid/content/Context;)Lo/cbz;
    .locals 1

    .line 706
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    if-eqz v0, :cond_0

    .line 707
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    invoke-virtual {v0, p1}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 710
    :cond_0
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    return-object v0
.end method

.method public b(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 6

    .line 641
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 642
    :cond_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTrackMap simplifyData or motionpath is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    return-void

    .line 646
    :cond_1
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show track map = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 649
    const-string v0, "simplifyDatakey"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 650
    const-string v0, "motionPath"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 651
    const-string v0, "contentpath"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 654
    invoke-virtual {v5, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 655
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 656
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 658
    return-void
.end method

.method public b([I[F[Ljava/lang/String;I)V
    .locals 1

    .line 537
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/cbu;->e([I[F[Ljava/lang/String;I)V

    .line 538
    return-void
.end method

.method public c(IIIFLo/ceu;)I
    .locals 7

    .line 183
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    iget-object v6, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public c(IIIFLo/ceu;Landroid/content/Context;)I
    .locals 14

    .line 200
    .line 201
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lo/cbl;->b(I)[Ljava/lang/String;

    move-result-object v0

    .line 200
    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lo/cdv;->d(Landroid/content/Context;[Ljava/lang/String;)I

    move-result v4

    .line 203
    if-eqz v4, :cond_0

    .line 204
    return v4

    .line 206
    :cond_0
    move-object/from16 v0, p6

    invoke-direct {p0, v0}, Lo/cbl;->g(Landroid/content/Context;)I

    move-result v5

    .line 207
    if-eqz v5, :cond_1

    .line 208
    return v5

    .line 212
    :cond_1
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 216
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v7

    .line 218
    invoke-virtual {v7}, Lo/cbu;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 220
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTrack but isStartTrackSport is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x1

    return v0

    .line 224
    :cond_2
    move/from16 v0, p2

    invoke-direct {p0, p1, v0}, Lo/cbl;->c(II)V

    .line 225
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v7

    .line 228
    invoke-virtual {v7}, Lo/cbu;->j()V

    .line 230
    invoke-virtual {v7}, Lo/cbu;->v()V

    .line 233
    const-string v0, "map_tracking_sport_type_sportting"

    move/from16 v1, p2

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 236
    new-instance v8, Landroid/content/Intent;

    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 237
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 239
    const-string v0, "sport_target_type_sportting"

    move/from16 v1, p3

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 240
    const-string v0, "origintarget"

    move/from16 v1, p3

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 241
    const-string v0, "sport_target_value_sportting"

    move/from16 v1, p4

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 242
    const-string v0, "indoor_Running_Info"

    invoke-virtual {v7}, Lo/cbu;->au()Z

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 243
    const-string v0, "sportdataparams"

    invoke-virtual {v8, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 244
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTrack: track="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", sportType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", target="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", targetValue="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    new-instance v9, Lo/dcy;

    invoke-direct {v9}, Lo/dcy;-><init>()V

    .line 248
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    .line 249
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "map_tracking_sport_type_sportting"

    .line 250
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 249
    invoke-static {v0, v10, v1, v2, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 251
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "sport_target_type_sportting"

    .line 252
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 251
    invoke-static {v0, v10, v1, v2, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 253
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "sport_target_value_sportting"

    .line 254
    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    .line 253
    invoke-static {v0, v10, v1, v2, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 256
    move/from16 v0, p3

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    invoke-virtual {v7}, Lo/cbu;->ah()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 257
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "sport_plan_target_new"

    .line 258
    invoke-static {v0, v10, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/cbl$3;

    invoke-direct {v1, p0}, Lo/cbl$3;-><init>(Lo/cbl;)V

    .line 257
    invoke-static {v0, v1}, Lo/cdl;->d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/ArrayList;

    .line 260
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 261
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recover TARGET_PLAN on error sp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    invoke-virtual {v7, v11}, Lo/cbu;->a(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 267
    :cond_3
    const/16 p3, -0x1

    .line 268
    const/high16 p4, -0x40800000    # -1.0f

    .line 269
    const-string v0, "origintarget"

    move/from16 v1, p3

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 270
    const-string v0, "sport_target_value_sportting"

    move/from16 v1, p4

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 271
    const-string v0, "sport_target_type_sportting"

    move/from16 v1, p3

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 276
    :cond_4
    :goto_0
    move/from16 v0, p3

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 277
    invoke-virtual {v7}, Lo/cbu;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 278
    invoke-virtual {v7}, Lo/cbu;->aa()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v7}, Lo/cbu;->aa()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 279
    invoke-virtual {v7}, Lo/cbu;->aa()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/cey;

    .line 280
    invoke-virtual {v11}, Lo/cey;->c()I

    move-result v12

    .line 281
    const-string v0, "sport_target_type_sportting"

    invoke-virtual {v6, v0, v12}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 282
    invoke-virtual {v11}, Lo/cey;->e()F

    move-result v13

    .line 283
    const-string v0, "sport_target_value_sportting"

    invoke-virtual {v6, v0, v13}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 286
    goto :goto_1

    .line 288
    :cond_5
    const/4 v0, 0x3

    return v0

    .line 292
    :cond_6
    :goto_1
    if-eqz p5, :cond_7

    .line 293
    move-object/from16 v0, p5

    iput-object v0, p0, Lo/cbl;->h:Lo/ceu;

    .line 294
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iget-object v1, p0, Lo/cbl;->h:Lo/ceu;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/cbu;->d(Lo/ceu;J)I

    move-result v11

    .line 295
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register ISportDataCallback for suggestion ret = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    :cond_7
    iget-object v0, p0, Lo/cbl;->d:Lo/ceu;

    if-eqz v0, :cond_8

    .line 300
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iget-object v1, p0, Lo/cbl;->d:Lo/ceu;

    iget-wide v2, p0, Lo/cbl;->i:J

    invoke-virtual {v0, v1, v2, v3}, Lo/cbu;->d(Lo/ceu;J)I

    .line 302
    :cond_8
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 303
    move/from16 v0, p2

    invoke-direct {p0, v0}, Lo/cbl;->e(I)V

    .line 304
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lo/cbp;
    .locals 1

    .line 116
    invoke-virtual {p0}, Lo/cbl;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/cbp;

    iput-object v0, p0, Lo/cbl;->a:Lo/cbp;

    .line 117
    iget-object v0, p0, Lo/cbl;->a:Lo/cbp;

    return-object v0
.end method

.method public c(I)V
    .locals 3

    .line 471
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 472
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0xa

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 473
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 474
    const-string v0, "SPEAK_PARAMETER_TYPE"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 475
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 477
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    .line 735
    invoke-static {p1}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v2

    .line 737
    if-eqz v2, :cond_1

    .line 738
    invoke-virtual {v2}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 739
    return-void

    .line 741
    :cond_0
    invoke-virtual {v2}, Lo/cbu;->ad()V

    .line 743
    :cond_1
    return-void
.end method

.method public c([I)V
    .locals 3

    .line 484
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 485
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0xa

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 486
    const-string v0, "SPEAK_PARAMETER_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 487
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 488
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 489
    return-void
.end method

.method public c([Ljava/lang/String;)V
    .locals 3

    .line 504
    new-instance v2, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 505
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0xa

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 506
    const-string v0, "SPEAK_PARAMETER_TYPE"

    const/4 v1, 0x3

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 507
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 508
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 509
    return-void
.end method

.method public d()I
    .locals 5

    .line 382
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 384
    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 386
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pause Track by outter operation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    invoke-virtual {v4}, Lo/cbu;->U()V

    .line 388
    const/4 v0, 0x0

    return v0

    .line 390
    :cond_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "You can pauseTrack just when sporting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    const/4 v0, 0x1

    return v0
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;)I
    .locals 4

    .line 457
    iget-object v0, p0, Lo/cbl;->a:Lo/cbp;

    if-eqz v0, :cond_0

    .line 458
    iget-object v0, p0, Lo/cbl;->a:Lo/cbp;

    invoke-interface {v0, p1, p2}, Lo/cbp;->a(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;)I

    .line 459
    const/4 v0, 0x0

    return v0

    .line 461
    :cond_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackAdapter == NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    const/4 v0, 0x5

    return v0
.end method

.method public d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 1

    .line 701
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lo/cbl;->a(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Z)V

    .line 702
    return-void
.end method

.method public d(Landroid/content/Context;)Z
    .locals 8

    .line 714
    invoke-static {p1}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->ah()Z

    move-result v4

    .line 715
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iscrash == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    if-eqz v4, :cond_3

    .line 718
    new-instance v5, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "motion_path2.txt"

    invoke-direct {v5, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 719
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 720
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v7

    .line 721
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    if-nez v7, :cond_2

    .line 723
    :cond_1
    invoke-virtual {p0}, Lo/cbl;->g()V

    .line 724
    const/4 v0, 0x0

    return v0

    .line 726
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 728
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 1

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbl;->g:Z

    .line 142
    invoke-direct {p0}, Lo/cbl;->m()V

    .line 143
    return-void
.end method

.method public e(IFLjava/lang/String;)V
    .locals 4

    .line 518
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/cbl;->b([I[F[Ljava/lang/String;I)V

    .line 519
    return-void
.end method

.method public e(IZ)V
    .locals 6

    .line 555
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginSportTrack startAutoTrack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 557
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAutoTrack mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    return-void

    .line 560
    :cond_0
    const/4 v0, 0x4

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 566
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 567
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAutoTrack not permissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    return-void

    .line 571
    :cond_1
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    if-nez v0, :cond_2

    .line 572
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto track config not avaliable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    return-void

    .line 575
    :cond_2
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v5

    .line 577
    invoke-virtual {v5}, Lo/cbu;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/cbl;->a:Lo/cbp;

    if-nez v0, :cond_4

    .line 578
    :cond_3
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Tracking Running, exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    return-void

    .line 582
    :cond_4
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    iget-object v1, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 585
    invoke-virtual {v5}, Lo/cbu;->j()V

    .line 586
    iget-object v0, p0, Lo/cbl;->e:Lo/cbz;

    invoke-virtual {v5, p1, v0, p2}, Lo/cbu;->d(ILo/cbz;Z)V

    .line 587
    invoke-virtual {v5}, Lo/cbu;->v()V

    .line 588
    invoke-virtual {v5}, Lo/cbu;->ab()V

    .line 590
    iget-object v0, p0, Lo/cbl;->n:Landroid/os/Handler;

    if-eqz v0, :cond_5

    .line 591
    invoke-direct {p0}, Lo/cbl;->r()V

    .line 592
    iget-object v0, p0, Lo/cbl;->n:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 594
    :cond_5
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 17

    .line 961
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 962
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    .line 963
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "map_tracking_sport_type_sportting"

    invoke-static {v0, v8, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 968
    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 970
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "map_tracking_sport_type_sportting"

    .line 971
    const/16 v2, 0x102

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 970
    invoke-static {v0, v8, v1, v2, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 972
    const/16 v10, 0x102

    goto :goto_0

    .line 974
    :cond_0
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 976
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v10}, Lo/cbl;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v13

    .line 982
    const-string v0, ""

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 983
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "sport_target_type_sportting"

    .line 984
    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 983
    invoke-static {v0, v8, v1, v2, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 985
    const/4 v11, -0x1

    goto :goto_1

    .line 987
    :cond_1
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 989
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v10, v11}, Lo/cbl;->e(Landroid/content/Context;II)Ljava/lang/String;

    move-result-object v14

    .line 990
    const-string v0, ""

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 991
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbl;->c:Landroid/content/Context;

    const-string v1, "sport_target_value_sportting"

    const-string v2, "-1"

    invoke-static {v0, v8, v1, v2, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 992
    const/high16 v12, -0x40800000    # -1.0f

    goto :goto_2

    .line 994
    :cond_2
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v12

    .line 997
    :goto_2
    sget-object v0, Lo/dae;->hs:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v15

    .line 998
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 999
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    const-string v0, "sportType"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1001
    const-string v0, "goalType"

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1003
    const-string v0, "goalValue"

    float-to-int v1, v12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1005
    :cond_3
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cbl;->c:Landroid/content/Context;

    move-object/from16 v2, v16

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v15, v2, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1007
    move-object/from16 v0, p0

    move v2, v10

    move v3, v11

    move v4, v12

    move-object/from16 v6, p1

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/cbl;->c(IIIFLo/ceu;Landroid/content/Context;)I

    .line 1008
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    .line 547
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbu;->e(Landroid/os/Bundle;)V

    .line 548
    return-void
.end method

.method public e([I[F[Ljava/lang/String;)V
    .locals 1

    .line 528
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 529
    array-length v0, p1

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/cbl;->b([I[F[Ljava/lang/String;I)V

    .line 535
    :cond_0
    return-void
.end method

.method public f()V
    .locals 3

    .line 689
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cea;->a(Landroid/content/Context;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v2

    .line 691
    const-string v0, "motion_path2.txt"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lo/cbl;->a(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Z)V

    .line 693
    :cond_0
    return-void
.end method

.method public finish()V
    .locals 0

    .line 154
    return-void
.end method

.method public g()V
    .locals 3

    .line 443
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v2

    .line 444
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/cbu;->a(Z)Lo/cew;

    .line 446
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/cbu;->f(Z)V

    .line 447
    invoke-virtual {v2}, Lo/cbu;->g()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 448
    invoke-virtual {v2}, Lo/cbu;->z()V

    goto :goto_0

    .line 450
    :cond_0
    invoke-virtual {v2}, Lo/cbu;->G()V

    .line 453
    :goto_0
    const/4 v2, 0x0

    .line 454
    return-void
.end method

.method public h()I
    .locals 5

    .line 400
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 402
    invoke-virtual {v4}, Lo/cbu;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 404
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Resume Track by outter operation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    invoke-virtual {v4}, Lo/cbu;->ac()V

    .line 406
    const/4 v0, 0x0

    return v0

    .line 408
    :cond_0
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "You can resumeTrack just when pause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    const/4 v0, 0x1

    return v0
.end method

.method public i()Z
    .locals 3

    .line 764
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v2

    .line 766
    invoke-virtual {v2}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 767
    const/4 v0, 0x1

    return v0

    .line 769
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public init(Landroid/content/Context;)V
    .locals 1

    .line 122
    if-nez p1, :cond_0

    .line 123
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object p1

    .line 125
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    .line 126
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ceq;->a(Landroid/content/Context;)V

    .line 127
    invoke-virtual {p0}, Lo/cbl;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/cbp;

    iput-object v0, p0, Lo/cbl;->a:Lo/cbp;

    .line 128
    return-void
.end method

.method public k()V
    .locals 5

    .line 600
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 601
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAutoTrack HealthApplication.getContext() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    return-void

    .line 605
    :cond_0
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 609
    if-eqz v4, :cond_1

    .line 611
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isStartTrackSport "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/cbu;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "acquireTrackType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/cbu;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    invoke-virtual {v4}, Lo/cbu;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 615
    invoke-virtual {v4}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 617
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAutoTrack close track"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-virtual {v4}, Lo/cbu;->w()V

    .line 619
    const/4 v4, 0x0

    goto :goto_0

    .line 622
    :cond_1
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopAutoTrack mSportManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :cond_2
    :goto_0
    return-void
.end method

.method public l()I
    .locals 13

    .line 854
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v6

    .line 856
    invoke-virtual {v6}, Lo/cbu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 857
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "launchTrackSportStateBroadcast: sport is not started, failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 858
    const/4 v0, 0x1

    return v0

    .line 861
    :cond_0
    invoke-virtual {v6}, Lo/cbu;->p()F

    move-result v7

    .line 862
    invoke-virtual {v6}, Lo/cbu;->n()J

    move-result-wide v8

    .line 863
    invoke-virtual {v6}, Lo/cbu;->c()I

    move-result v10

    .line 865
    const-string v0, "Track_PluginSportTrack"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "launchTrackSportStateBroadcast distance="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " duration="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " heartrate="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "***"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 868
    new-instance v0, Lo/cem;

    invoke-virtual {v6}, Lo/cbu;->u()I

    move-result v1

    move v2, v7

    move-wide v3, v8

    move v5, v10

    invoke-direct/range {v0 .. v5}, Lo/cem;-><init>(IFJI)V

    move-object v11, v0

    .line 870
    new-instance v12, Landroid/content/Intent;

    const-string v0, "action_play_voice"

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 871
    const-string v0, "SPEAK_TYPE"

    const/16 v1, 0xb

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 872
    const-string v0, "SPEAK_PARAMETER"

    invoke-virtual {v12, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 873
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0, v12}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 875
    const/4 v0, 0x0

    return v0
.end method

.method public n()V
    .locals 2

    .line 1060
    invoke-static {}, Lo/cbr;->c()Lo/cbr;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1061
    invoke-static {}, Lo/cbr;->c()Lo/cbr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbr;->b(Z)V

    .line 1062
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbl;->g:Z

    .line 1063
    iget-object v0, p0, Lo/cbl;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cbr;->b(Landroid/content/Context;)V

    .line 1065
    :cond_0
    return-void
.end method

.method public o()I
    .locals 1

    .line 1073
    invoke-static {}, Lo/ceq;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->i()I

    move-result v0

    return v0
.end method

.method public p()Ljava/util/ArrayList;
    .locals 1

    .line 779
    iget-object v0, p0, Lo/cbl;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setAdapter(Lo/eab;)V
    .locals 1

    .line 132
    invoke-super {p0, p1}, Lo/eac;->setAdapter(Lo/eab;)V

    .line 133
    move-object v0, p1

    check-cast v0, Lo/cbp;

    iput-object v0, p0, Lo/cbl;->a:Lo/cbp;

    .line 134
    return-void
.end method
