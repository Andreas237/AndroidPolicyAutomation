.class public Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;
    }
.end annotation


# static fields
.field private static f:Z

.field private static i:Z

.field private static k:Z


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private c:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

.field private d:Landroid/net/Uri;

.field private e:Landroid/content/Context;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 88
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->i:Z

    .line 92
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->f:Z

    .line 97
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d:Landroid/net/Uri;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->h:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a()Z
    .locals 1

    .line 65
    sget-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->i:Z

    return v0
.end method

.method static synthetic a(Z)Z
    .locals 0

    .line 65
    sput-boolean p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k:Z

    return p0
.end method

.method static synthetic b(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b()Z
    .locals 1

    .line 65
    sget-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k:Z

    return v0
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 65
    sput-boolean p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->f:Z

    return p0
.end method

.method static synthetic c(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 7

    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d:Landroid/net/Uri;

    const-string v1, "healthType"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 172
    goto :goto_0

    .line 166
    :catch_0
    move-exception v5

    .line 167
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goBasicHealthPage IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 169
    :catch_1
    move-exception v5

    .line 170
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goBasicHealthPage Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-void

    .line 173
    :goto_0
    invoke-static {v4}, Lo/ene;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 175
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    .line 178
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->k()V

    .line 179
    goto :goto_2

    .line 182
    :pswitch_1
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BaseHealthDataActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 186
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 187
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->finish()V

    .line 188
    goto :goto_2

    .line 191
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->i()V

    .line 192
    goto :goto_2

    .line 194
    :goto_1
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "healthType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :goto_2
    goto :goto_3

    .line 198
    :cond_0
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parameter not is a number"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Landroid/content/Context;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    .line 65
    sget-boolean v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->f:Z

    return v0
.end method

.method static synthetic d(Z)Z
    .locals 0

    .line 65
    sput-boolean p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->i:Z

    return p0
.end method

.method static synthetic e(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    return-object v0
.end method

.method private i()V
    .locals 1

    .line 212
    new-instance v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;-><init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 225
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->g:Ljava/util/List;

    return-object v0
.end method

.method private k()V
    .locals 0

    .line 206
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e()V

    .line 207
    return-void
.end method


# virtual methods
.method public final c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 233
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 234
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 236
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 237
    const v0, 0xad12

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 238
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 240
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 242
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;-><init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 275
    return-void
.end method

.method public e()V
    .locals 13

    .line 281
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestCoreSleepSummary !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const/4 v4, 0x7

    .line 283
    const/16 v5, 0x5a0

    .line 284
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v6

    .line 285
    const/4 v8, 0x3

    .line 286
    const/4 v9, 0x1

    .line 288
    new-instance v10, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 290
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 291
    invoke-virtual {v10, v6, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 292
    invoke-virtual {v10, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 294
    const/4 v11, 0x6

    new-array v11, v11, [I

    fill-array-data v11, :array_0

    .line 301
    const/4 v0, 0x6

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v12, v1

    const-string v0, "core_sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v12, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v12, v1

    const-string v0, "sleep_deep_key"

    const/4 v1, 0x3

    aput-object v0, v12, v1

    const-string v0, "sleep_shallow_key"

    const/4 v1, 0x4

    aput-object v0, v12, v1

    const-string v0, "sleep_core_sleep_noon_duration_key"

    const/4 v1, 0x5

    aput-object v0, v12, v1

    .line 308
    invoke-virtual {v10, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 309
    invoke-virtual {v10, v11}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 310
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 311
    const/4 v0, 0x3

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 312
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 314
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;

    invoke-direct {v1, p0, v6, v7}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$5;-><init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;J)V

    invoke-interface {v0, v10, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 430
    return-void

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xabe1
        0xabe2
        0xac4c
    .end array-data
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 114
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 115
    iput-object p0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    .line 116
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 117
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 118
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void

    .line 121
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d:Landroid/net/Uri;

    .line 122
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d:Landroid/net/Uri;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 123
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    return-void

    .line 126
    :cond_1
    new-instance v0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;-><init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)V

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$c;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->b:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->a:Ljava/util/List;

    .line 129
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->h:Ljava/util/List;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->g:Ljava/util/List;

    .line 131
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 132
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 133
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 136
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_3

    .line 137
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path length is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_3
    const-string v0, "/basicHealth"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 141
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/basicHealth"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    return-void

    .line 145
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v6

    .line 146
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginit_isLogined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-static {}, Lo/ale;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v6}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_6

    .line 149
    :cond_5
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartHealth to MainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    .line 151
    invoke-virtual {p0, v7}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->startActivity(Landroid/content/Intent;)V

    .line 152
    invoke-virtual {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->finish()V

    .line 154
    goto :goto_0

    .line 155
    :cond_6
    invoke-direct {p0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c()V

    .line 157
    :goto_0
    return-void
.end method
