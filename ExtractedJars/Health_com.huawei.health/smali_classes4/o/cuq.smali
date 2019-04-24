.class public Lo/cuq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cuq$e;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Lo/cuq$2;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/cuq;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 6

    .line 151
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report_switch statusIsChecked() enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-static {p0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 154
    const-string v0, "true"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 155
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "report_switch status = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ", flag = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return v4
.end method

.method public static d(Landroid/content/Context;)Lo/cuq;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cuq;->e:Landroid/content/Context;

    .line 37
    sget-object v0, Lo/cuq$e;->c:Lo/cuq;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 12

    .line 131
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync saveTodaySyncData2Yesteday"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->p(Landroid/content/Context;)I

    move-result v4

    .line 133
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->m(Landroid/content/Context;)I

    move-result v5

    .line 134
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->l(Landroid/content/Context;)I

    move-result v6

    .line 135
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->t(Landroid/content/Context;)I

    move-result v7

    .line 136
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->r(Landroid/content/Context;)I

    move-result v8

    .line 137
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->q(Landroid/content/Context;)I

    move-result v9

    .line 138
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->u(Landroid/content/Context;)I

    move-result v10

    .line 139
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->s(Landroid/content/Context;)I

    move-result v11

    .line 140
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/cuy;->b(Landroid/content/Context;I)V

    .line 141
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cuy;->a(Landroid/content/Context;I)V

    .line 142
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/cuy;->k(Landroid/content/Context;I)V

    .line 143
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cuy;->g(Landroid/content/Context;I)V

    .line 144
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/cuy;->h(Landroid/content/Context;I)V

    .line 145
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v9}, Lo/cuy;->f(Landroid/content/Context;I)V

    .line 146
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/cuy;->i(Landroid/content/Context;I)V

    .line 147
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, v11}, Lo/cuy;->m(Landroid/content/Context;I)V

    .line 148
    return-void
.end method

.method public a(J)V
    .locals 6

    .line 67
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync biFirstSyncContinueTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 70
    const-string v0, "during"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lo/dae;->iT:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 72
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 73
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 75
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 42
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin biSetUserInfo newHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 46
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    .line 50
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->v(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin biAnalytics oldHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " newHuid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    new-instance v5, Landroid/util/ArrayMap;

    invoke-direct {v5}, Landroid/util/ArrayMap;-><init>()V

    .line 55
    const-string v0, "newID"

    invoke-interface {v5, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    const-string v0, "oldID"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Lo/dae;->iW:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 58
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 59
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 60
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/cuy;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 63
    :cond_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 118
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync setBiTodaySyncDataZero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const v1, 0x13268a8

    invoke-static {v0, v1}, Lo/cuy;->n(Landroid/content/Context;I)V

    .line 120
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->l(Landroid/content/Context;I)V

    .line 121
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->p(Landroid/content/Context;I)V

    .line 122
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->o(Landroid/content/Context;I)V

    .line 123
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->u(Landroid/content/Context;I)V

    .line 124
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->s(Landroid/content/Context;I)V

    .line 125
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->t(Landroid/content/Context;I)V

    .line 126
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cuy;->r(Landroid/content/Context;I)V

    .line 127
    return-void
.end method

.method public d()V
    .locals 14

    .line 91
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync biOldDaySyncStatData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 94
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->b(Landroid/content/Context;)I

    move-result v5

    .line 95
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->i(Landroid/content/Context;)I

    move-result v6

    .line 96
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->f(Landroid/content/Context;)I

    move-result v7

    .line 97
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->g(Landroid/content/Context;)I

    move-result v8

    .line 98
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->h(Landroid/content/Context;)I

    move-result v9

    .line 99
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->k(Landroid/content/Context;)I

    move-result v10

    .line 100
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->n(Landroid/content/Context;)I

    move-result v11

    .line 101
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuy;->o(Landroid/content/Context;)I

    move-result v12

    .line 102
    const-string v0, "date"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const-string v0, "totalSync"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    const-string v0, "UISync"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    const-string v0, "userinfoSync"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    const-string v0, "insertSyncDetail"

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const-string v0, "insertSyncStat"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    const-string v0, "syncFail"

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    const-string v0, "wearSync"

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lo/dae;->iU:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v13

    .line 111
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v13, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 112
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 114
    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 6

    .line 79
    sget-object v0, Lo/cuq;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const-string v0, "Debug_DataPlatFormBIAnalytics"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync biAccountDevicesNum is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 82
    const-string v0, "phoneDeviceNum"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lo/dae;->iR:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 84
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 85
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/cuq;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 87
    :cond_0
    return-void
.end method
