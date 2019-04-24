.class public Lo/dzl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static e:Lo/dzl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dzl;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method

.method public static b()Lo/dzl;
    .locals 4

    .line 28
    sget-object v2, Lo/dzl;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 29
    :try_start_0
    sget-object v0, Lo/dzl;->e:Lo/dzl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lo/dzl;

    invoke-direct {v0}, Lo/dzl;-><init>()V

    sput-object v0, Lo/dzl;->e:Lo/dzl;

    .line 32
    :cond_0
    sget-object v0, Lo/dzl;->e:Lo/dzl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 33
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private c(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;I)Lo/dvx;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;Ljava/lang/String;I)Lo/dvx;"
        }
    .end annotation

    .line 187
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    int-to-double v0, p4

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v6

    .line 189
    const-string v0, "PLGACHIEVE_CombinationOldMyMedals"

    const-string v1, "buildCycleMedalInfo"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_cycle_imperial:I

    invoke-static {v6}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 192
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_cycle_distance_imperial:I

    invoke-static {v6}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 193
    new-instance v0, Lo/dvx;

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object v1, p3

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 195
    :cond_0
    int-to-double v0, p4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 196
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run:I

    invoke-static {v6}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 197
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_cycle_distance:I

    invoke-static {v6}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 198
    new-instance v0, Lo/dvx;

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object v1, p3

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Z)Ljava/util/Map;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/Map<Ljava/lang/String;Lo/dvx;>;"
        }
    .end annotation

    .line 37
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 39
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 40
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 42
    invoke-static {v14}, Lo/dzs;->d(Ljava/util/Map;)V

    .line 44
    if-eqz p1, :cond_0

    .line 45
    invoke-static {v15}, Lo/dzs;->b(Ljava/util/Map;)V

    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v15}, Lo/dzs;->a(Ljava/util/Map;)V

    .line 49
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v16

    .line 51
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_challenge_distance_imperial:I

    .line 52
    invoke-static/range {v16 .. v16}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v16, v3, v4

    .line 51
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 53
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run_distance_imperial:I

    .line 54
    invoke-static/range {v16 .. v16}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v16, v3, v4

    .line 53
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 55
    const-string v0, "A_5"

    new-instance v1, Lo/dvx;

    const-string v2, "A5"

    const-string v3, "A5"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A5"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v19

    .line 59
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_challenge_distance_imperial:I

    .line 60
    invoke-static/range {v19 .. v19}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v19, v3, v4

    .line 59
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 61
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run_distance_imperial:I

    .line 62
    invoke-static/range {v19 .. v19}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v19, v3, v4

    .line 61
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    .line 63
    const-string v0, "A_10"

    new-instance v1, Lo/dvx;

    const-string v2, "A10"

    const-string v3, "A10"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A10"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v22

    .line 67
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run_distance_imperial:I

    .line 68
    invoke-static/range {v22 .. v22}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v22, v3, v4

    .line 67
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    .line 69
    const-string v0, "A_20"

    new-instance v1, Lo/dvx;

    const-string v2, "A20"

    const-string v3, "A20"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A20"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 70
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_challenge_half_marathon:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v23

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v24

    .line 74
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run_distance_imperial:I

    .line 75
    invoke-static/range {v24 .. v24}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v24, v3, v4

    .line 74
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v25

    .line 76
    const-string v0, "A_40"

    new-instance v1, Lo/dvx;

    const-string v2, "A40"

    const-string v3, "A40"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A40"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 77
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_full_marathon_challenge:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v25

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dzs;->d(DI)Ljava/lang/String;

    move-result-object v26

    .line 81
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_single_run_distance_maxinum_imperial:I

    .line 82
    invoke-static/range {v26 .. v26}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v26, v3, v4

    .line 81
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v27

    .line 83
    const-string v0, "A_100"

    new-instance v1, Lo/dvx;

    const-string v2, "A100"

    const-string v3, "A100"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A100"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 84
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_ultra_marathon_challenge:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v27

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    goto/16 :goto_1

    .line 87
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 88
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    .line 89
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_single_run_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v17, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 90
    const-string v0, "A_5"

    new-instance v1, Lo/dvx;

    const-string v2, "A5"

    const-string v3, "A5"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A5"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 91
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_challenge_distance:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v16, v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 95
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 96
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_single_run_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v20, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    .line 97
    const-string v0, "A_10"

    new-instance v1, Lo/dvx;

    const-string v2, "A10"

    const-string v3, "A10"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A10"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 98
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_challenge_distance:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v19, v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v21

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x403518f5c28f5c29L    # 21.0975

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    .line 102
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_single_run_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v22, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    .line 103
    const-string v0, "A_20"

    new-instance v1, Lo/dvx;

    const-string v2, "A20"

    const-string v3, "A20"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A20"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 104
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_challenge_half_marathon:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v23

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 103
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x404518f5c28f5c29L    # 42.195

    const/4 v5, 0x1

    const/4 v6, 0x3

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v24

    .line 108
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_single_run_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v24, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v25

    .line 109
    const-string v0, "A_40"

    new-instance v1, Lo/dvx;

    const-string v2, "A40"

    const-string v3, "A40"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A40"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 110
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_full_marathon_challenge:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v25

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_single_run_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v26, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v27

    .line 115
    const-string v0, "A_100"

    new-instance v1, Lo/dvx;

    const-string v2, "A100"

    const-string v3, "A100"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "A100"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 116
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_ultra_marathon_challenge:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v27

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    :goto_1
    const-string v0, "B_7"

    new-instance v1, Lo/dvx;

    const-string v2, "B7"

    const-string v3, "B7"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "B7"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 120
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_adhere_to_exercise_100_days_new:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const-wide/high16 v8, 0x401c000000000000L    # 7.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 121
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_insit_steps_7days_movement_new:I

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    .line 123
    const-wide/high16 v9, 0x401c000000000000L    # 7.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 124
    const-wide v9, 0x40c3880000000000L    # 10000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v8, v10

    .line 121
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    const-string v0, "B_21"

    new-instance v1, Lo/dvx;

    const-string v2, "B21"

    const-string v3, "B21"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "B21"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 126
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_adhere_to_exercise_100_days_new:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const-wide/high16 v8, 0x4035000000000000L    # 21.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 127
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_insit_steps_21days_movement_new:I

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    .line 129
    const-wide/high16 v9, 0x4035000000000000L    # 21.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 130
    const-wide v9, 0x40c3880000000000L    # 10000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v8, v10

    .line 127
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v0, "B_100"

    new-instance v1, Lo/dvx;

    const-string v2, "B100"

    const-string v3, "B100"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "B100"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 132
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_adhere_to_exercise_100_days_new:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 133
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_insit_steps_100days_movement_new:I

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    .line 135
    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 136
    const-wide v9, 0x40c3880000000000L    # 10000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    aput-object v9, v8, v10

    .line 133
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    const-string v0, "A2_10"

    const-string v1, "A2_10"

    move-object/from16 v2, p0

    const/16 v3, 0xa

    invoke-direct {v2, v14, v15, v1, v3}, Lo/dzl;->c(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;I)Lo/dvx;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    const-string v0, "A2_50"

    const-string v1, "A2_50"

    move-object/from16 v2, p0

    const/16 v3, 0x32

    invoke-direct {v2, v14, v15, v1, v3}, Lo/dzl;->c(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;I)Lo/dvx;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    const-string v0, "A2_100"

    const-string v1, "A2_100"

    move-object/from16 v2, p0

    const/16 v3, 0x64

    invoke-direct {v2, v14, v15, v1, v3}, Lo/dzl;->c(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;I)Lo/dvx;

    move-result-object v1

    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v0, "C_10000"

    new-instance v1, Lo/dvx;

    const-string v2, "C10000"

    const-string v3, "C10000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C10000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 143
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 144
    const-wide v8, 0x40c3880000000000L    # 10000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 143
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_1wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 146
    const-wide v9, 0x40c3880000000000L    # 10000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 145
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-string v0, "C_100000"

    new-instance v1, Lo/dvx;

    const-string v2, "C100000"

    const-string v3, "C100000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C100000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 148
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 149
    const-wide v8, 0x40f86a0000000000L    # 100000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 148
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 150
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_10wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 151
    const-wide v9, 0x40f86a0000000000L    # 100000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 150
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    const-string v0, "C_300000"

    new-instance v1, Lo/dvx;

    const-string v2, "C300000"

    const-string v3, "C300000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C300000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 153
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 154
    const-wide v8, 0x41124f8000000000L    # 300000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 153
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 155
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_30wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 156
    const-wide v9, 0x41124f8000000000L    # 300000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 155
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 152
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    const-string v0, "C_1000000"

    new-instance v1, Lo/dvx;

    const-string v2, "C1000000"

    const-string v3, "C1000000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C1000000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 158
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 159
    const-wide v8, 0x412e848000000000L    # 1000000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 158
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_100wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 161
    const-wide v9, 0x412e848000000000L    # 1000000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 160
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 157
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "C_3000000"

    new-instance v1, Lo/dvx;

    const-string v2, "C3000000"

    const-string v3, "C3000000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C3000000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 163
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 164
    const-wide v8, 0x4146e36000000000L    # 3000000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 163
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 165
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_300wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 166
    const-wide v9, 0x4146e36000000000L    # 3000000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 165
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "C_5000000"

    new-instance v1, Lo/dvx;

    const-string v2, "C5000000"

    const-string v3, "C5000000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C5000000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 168
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 169
    const-wide v8, 0x415312d000000000L    # 5000000.0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 168
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 170
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_500wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 171
    const-wide v9, 0x415312d000000000L    # 5000000.0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 170
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 167
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "C_10000000"

    new-instance v1, Lo/dvx;

    const-string v2, "C10000000"

    const-string v3, "C10000000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C10000000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 173
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 174
    const-wide v8, 0x416312d000000000L    # 1.0E7

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 173
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 175
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_1000wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 176
    const-wide v9, 0x416312d000000000L    # 1.0E7

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 175
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "C_15000000"

    new-instance v1, Lo/dvx;

    const-string v2, "C15000000"

    const-string v3, "C15000000"

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "C15000000"

    invoke-interface {v15, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 178
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_steps:I

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    .line 179
    const-wide v8, 0x416c9c3800000000L    # 1.5E7

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v8, v9, v10, v11}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    .line 178
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 180
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_cumulative_movement_1500wsteps_new:I

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    .line 181
    const-wide v9, 0x416c9c3800000000L    # 1.5E7

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v9, v10, v11, v12}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    .line 180
    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lo/dvx;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-interface {v13, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    return-object v13
.end method
