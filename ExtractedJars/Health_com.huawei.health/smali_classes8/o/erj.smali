.class public Lo/erj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/erj$c;,
        Lo/erj$d;,
        Lo/erj$e;
    }
.end annotation


# instance fields
.field private a:Lo/erj$c;

.field private b:Lcom/huawei/up/model/UserInfomation;

.field private c:Lo/dcy;

.field private d:Ljava/lang/String;

.field private e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

.field private h:Landroid/os/Handler;

.field private k:Lo/erj$e;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/erj;->c:Lo/dcy;

    .line 57
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/erj;->d:Ljava/lang/String;

    .line 136
    new-instance v0, Lo/erj$2;

    invoke-direct {v0, p0}, Lo/erj$2;-><init>(Lo/erj;)V

    iput-object v0, p0, Lo/erj;->h:Landroid/os/Handler;

    .line 65
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/erj;->d:Ljava/lang/String;

    const-string v2, "LAST_SPORT_LEVEL"

    .line 64
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 68
    if-eqz v4, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    :cond_0
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    iput-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    goto :goto_0

    .line 73
    :cond_1
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    iput-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 74
    :catch_0
    move-exception v5

    .line 75
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 78
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    iput-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    goto :goto_0

    .line 79
    :catch_1
    move-exception v6

    .line 80
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastSportLevel e1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    iput-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    .line 87
    :goto_0
    new-instance v0, Lo/erj$e;

    iget-object v1, p0, Lo/erj;->h:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/erj$e;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/erj;->k:Lo/erj$e;

    .line 88
    return-void
.end method

.method static synthetic a(Lo/erj;)Landroid/os/Handler;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/erj;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private a(Landroid/os/Message;)V
    .locals 7

    .line 169
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleVo2MaxMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    new-instance v4, Lo/erw;

    invoke-direct {v4}, Lo/erw;-><init>()V

    .line 172
    new-instance v5, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    .line 174
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lo/erj;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v4, v0, v1}, Lo/erw;->b(Ljava/util/List;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 177
    goto :goto_0

    .line 175
    :catch_0
    move-exception v6

    .line 176
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_0
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 179
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleVo2MaxMsg sportLevel is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lo/erj;->a:Lo/erj$c;

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lo/erj;->a:Lo/erj$c;

    invoke-virtual {p0, v5}, Lo/erj;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/erj$c;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    goto :goto_1

    .line 185
    :cond_0
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleVo2MaxMsg no Vo2Max ,get Run data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    invoke-direct {p0}, Lo/erj;->c()V

    .line 188
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/erj;Landroid/os/Message;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/erj;->a(Landroid/os/Message;)V

    return-void
.end method

.method private c()V
    .locals 11

    .line 259
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readRunData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 261
    const-wide v0, 0x9a7ec800L

    sub-long v9, v7, v0

    .line 263
    invoke-static {}, Lo/dgy;->d()Lo/dgy;

    move-result-object v0

    move-wide v1, v9

    move-wide v3, v7

    new-instance v6, Lo/erj$d;

    invoke-direct {v6, p0}, Lo/erj$d;-><init>(Lo/erj;)V

    const/16 v5, 0x102

    invoke-virtual/range {v0 .. v6}, Lo/dgy;->c(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 266
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 6

    .line 154
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleRunHistoryMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    new-instance v4, Lo/erk;

    invoke-direct {v4}, Lo/erk;-><init>()V

    .line 156
    iget-object v0, p0, Lo/erj;->a:Lo/erj$c;

    if-eqz v0, :cond_0

    .line 158
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lo/erj;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v4, v0, v1}, Lo/erk;->a(Ljava/util/List;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v5

    .line 160
    iget-object v0, p0, Lo/erj;->a:Lo/erj$c;

    invoke-virtual {p0, v5}, Lo/erj;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/erj$c;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    goto :goto_0

    .line 161
    :catch_0
    move-exception v5

    .line 162
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lo/erj;->a:Lo/erj$c;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    invoke-virtual {p0, v1}, Lo/erj;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/erj$c;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    .line 166
    :cond_0
    :goto_0
    return-void
.end method

.method private e()V
    .locals 9

    .line 192
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readVo2Max"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 195
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 196
    const-wide v0, 0x9a7ec800L

    sub-long v0, v4, v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 197
    invoke-virtual {v6, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 198
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 199
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 201
    const/4 v7, 0x1

    new-array v7, v7, [I

    fill-array-data v7, :array_0

    .line 202
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "key"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 204
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 205
    invoke-virtual {v6, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/erj;->k:Lo/erj$e;

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 209
    return-void

    nop

    :array_0
    .array-data 4
        0xa416
    .end array-data
.end method

.method static synthetic e(Lo/erj;Landroid/os/Message;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/erj;->c(Landroid/os/Message;)V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 5

    .line 339
    if-nez p1, :cond_0

    .line 340
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportLevel curLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    new-instance p1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    .line 343
    :cond_0
    iget-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    if-nez v0, :cond_1

    .line 344
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportLevel mLastSportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-object p1

    .line 348
    :cond_1
    iget-object v0, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 349
    invoke-static {}, Lo/erh;->e()V

    .line 359
    :cond_2
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iput-object p1, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    .line 362
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/erj;->d:Ljava/lang/String;

    const-string v2, "LAST_SPORT_LEVEL"

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    iget-object v4, p0, Lo/erj;->e:Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    .line 365
    invoke-virtual {v3, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/erj;->c:Lo/dcy;

    .line 361
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 367
    return-object p1
.end method

.method public d(Lcom/huawei/up/model/UserInfomation;Lo/erj$c;)V
    .locals 4

    .line 111
    if-nez p2, :cond_0

    .line 112
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calSportLevel callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 116
    :cond_0
    if-nez p1, :cond_1

    .line 117
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    invoke-virtual {p0, v0}, Lo/erj;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    invoke-interface {p2, v0}, Lo/erj$c;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    .line 118
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calSportLevel userInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void

    .line 120
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 121
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    invoke-virtual {p0, v0}, Lo/erj;->c(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    invoke-interface {p2, v0}, Lo/erj$c;->b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    .line 122
    const-string v0, "Track_SportLevelManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calSportLevel unkown gender is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return-void

    .line 126
    :cond_2
    iput-object p2, p0, Lo/erj;->a:Lo/erj$c;

    .line 127
    iput-object p1, p0, Lo/erj;->b:Lcom/huawei/up/model/UserInfomation;

    .line 130
    invoke-direct {p0}, Lo/erj;->e()V

    .line 134
    return-void
.end method
