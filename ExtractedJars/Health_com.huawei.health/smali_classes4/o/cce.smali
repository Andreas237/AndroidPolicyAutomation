.class public Lo/cce;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private g:Landroid/content/SharedPreferences;

.field private h:Lo/dcy;

.field private i:Landroid/content/Context;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cce;->e:Z

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cce;->c:Z

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cce;->a:Z

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cce;->b:Z

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cce;->d:Z

    .line 55
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cce;->k:Ljava/lang/String;

    .line 56
    iput-object p1, p0, Lo/cce;->i:Landroid/content/Context;

    .line 57
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    const-string v1, "TrackDevelopConfig"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    .line 58
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/cce;->h:Lo/dcy;

    .line 59
    iget-object v0, p0, Lo/cce;->h:Lo/dcy;

    const/4 v1, 0x0

    iput v1, v0, Lo/dcy;->c:I

    .line 60
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    .line 74
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 75
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 76
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 79
    :cond_0
    return v2
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)F
    .locals 4

    .line 83
    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 84
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 85
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 86
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 88
    :cond_0
    return v2
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 1

    .line 96
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 179
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 181
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    :cond_0
    move-object v2, p2

    .line 184
    :cond_1
    return-object v2
.end method

.method public a()V
    .locals 5

    .line 100
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 101
    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 104
    if-nez v4, :cond_1

    .line 105
    return-void

    .line 107
    :cond_1
    const-string v0, "StepEstimatedDitance"

    iget-boolean v1, p0, Lo/cce;->e:Z

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 108
    const-string v0, "StaticDropGps"

    iget-boolean v1, p0, Lo/cce;->c:Z

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 109
    const-string v0, "LogConvert"

    iget-boolean v1, p0, Lo/cce;->a:Z

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 110
    const-string v0, "TrackSmooth"

    iget-boolean v1, p0, Lo/cce;->b:Z

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 111
    const-string v0, "NeedStartFinding"

    iget-boolean v1, p0, Lo/cce;->d:Z

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_2

    .line 113
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 115
    :cond_2
    const-string v0, "Track_TrackDevelopConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveConfig success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 119
    iput-boolean p1, p0, Lo/cce;->c:Z

    .line 120
    return-void
.end method

.method public a(ZLjava/lang/String;)V
    .locals 4

    .line 226
    if-eqz p1, :cond_0

    const-string v3, "1"

    goto :goto_0

    :cond_0
    const-string v3, "0"

    .line 227
    :goto_0
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/cce;->h:Lo/dcy;

    invoke-static {v0, v1, p2, v3, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 229
    return-void
.end method

.method public a(Ljava/lang/String;Z)Z
    .locals 3

    .line 217
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 218
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    :cond_0
    return p2

    .line 221
    :cond_1
    const-string v0, "1"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 197
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 198
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    move-object v3, p3

    goto :goto_0

    .line 200
    :cond_0
    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 203
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/cce;->h:Lo/dcy;

    invoke-static {v0, v1, p2, v3, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 205
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 143
    iput-boolean p1, p0, Lo/cce;->b:Z

    .line 144
    return-void
.end method

.method public b()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Lo/cce;->c:Z

    return v0
.end method

.method public c()V
    .locals 3

    .line 63
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "StepEstimatedDitance"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cce;->e:Z

    .line 65
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "StaticDropGps"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cce;->c:Z

    .line 66
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "LogConvert"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cce;->a:Z

    .line 67
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "TrackSmooth"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cce;->b:Z

    .line 68
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "NeedStartFinding"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lo/cce;->d:Z

    .line 71
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 208
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 209
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    move-object v3, p3

    .line 212
    :cond_0
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/cce;->h:Lo/dcy;

    invoke-static {v0, v1, p2, v3, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 214
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Lo/cce;->a:Z

    .line 136
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 151
    iput-boolean p1, p0, Lo/cce;->d:Z

    .line 152
    return-void
.end method

.method public d()Z
    .locals 1

    .line 131
    iget-boolean v0, p0, Lo/cce;->e:Z

    return v0
.end method

.method public e(Ljava/lang/String;J)J
    .locals 3

    .line 188
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 190
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    :cond_0
    return-wide p2

    .line 193
    :cond_1
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 232
    iget-object v0, p0, Lo/cce;->i:Landroid/content/Context;

    iget-object v1, p0, Lo/cce;->k:Ljava/lang/String;

    iget-object v2, p0, Lo/cce;->h:Lo/dcy;

    invoke-static {v0, v1, p2, p1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 234
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 127
    iput-boolean p1, p0, Lo/cce;->e:Z

    .line 128
    return-void
.end method

.method public e()Z
    .locals 1

    .line 139
    iget-boolean v0, p0, Lo/cce;->a:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .line 155
    iget-boolean v0, p0, Lo/cce;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .line 147
    iget-boolean v0, p0, Lo/cce;->b:Z

    return v0
.end method

.method public i()Lo/cde;
    .locals 5

    .line 159
    new-instance v4, Lo/cde;

    invoke-direct {v4}, Lo/cde;-><init>()V

    .line 160
    const-string v0, "filter_distance"

    const-string v1, "3"

    invoke-direct {p0, v0, v1}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->c(F)V

    .line 161
    const-string v0, "min_satellite_threshold_speed"

    const-string v1, "0.3"

    invoke-direct {p0, v0, v1}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->e(F)V

    .line 162
    const-string v0, "max_satellite_speed_multiple"

    const-string v1, "2.8"

    invoke-direct {p0, v0, v1}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->d(F)V

    .line 163
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "TrackSmooth"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->a(Z)V

    .line 164
    iget-object v0, p0, Lo/cce;->g:Landroid/content/SharedPreferences;

    const-string v1, "NeedStartFinding"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->b(Z)V

    .line 165
    const-string v0, "min_dis_acc"

    const-string v1, "100"

    invoke-direct {p0, v0, v1}, Lo/cce;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->e(I)V

    .line 166
    const-string v0, "min_time_interval"

    const-string v1, "1.5"

    invoke-direct {p0, v0, v1}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/cde;->b(F)V

    .line 167
    const/4 v0, 0x3

    new-array v0, v0, [F

    const-string v1, "max_speed_dis_walk"

    const-string v2, "12"

    invoke-direct {p0, v1, v2}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-string v1, "max_speed_dis_run"

    const-string v2, "12"

    .line 168
    invoke-direct {p0, v1, v2}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "max_speed_dis_bike"

    const-string v2, "33.3"

    .line 169
    invoke-direct {p0, v1, v2}, Lo/cce;->c(Ljava/lang/String;Ljava/lang/String;)F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 167
    invoke-virtual {v4, v0}, Lo/cde;->e([F)V

    .line 170
    const-string v0, "Track_TrackDevelopConfig"

    const/16 v1, 0x14

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MIN_DIS_REDUNDANCY :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cde;->e()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " -- MIN_GPS_SPEED :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cde;->k()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " -- FILTER_TIMES_OF_GPS_SPEED :"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 171
    invoke-virtual {v4}, Lo/cde;->i()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " -- NEED_SMOOTH :"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cde;->f()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " -- NEED_START_FINDING :"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 172
    invoke-virtual {v4}, Lo/cde;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " -- MIN_GPS_ACC :"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/cde;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " -- MIN_TIME_INTERVAL :"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    .line 173
    invoke-virtual {v4}, Lo/cde;->a()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " -- MAX_SPEED_DIS_WALK :"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lo/cde;->b(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, " -- DEF_MAX_SPEED_DIS_RUN :"

    const/16 v3, 0x10

    aput-object v2, v1, v3

    .line 174
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Lo/cde;->b(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const-string v2, " -- MAX_SPEED_DIS_BIKE :"

    const/16 v3, 0x12

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-virtual {v4, v2}, Lo/cde;->b(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x13

    aput-object v2, v1, v3

    .line 170
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    return-object v4
.end method
