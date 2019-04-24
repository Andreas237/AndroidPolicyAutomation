.class public Lo/eqj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eqj$d;
    }
.end annotation


# static fields
.field private static e:Ljava/lang/String;


# instance fields
.field private final a:Lo/eqj$d;

.field private b:Lo/epy;

.field protected c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-string v0, "FunctionSetSleepCardReader"

    sput-object v0, Lo/eqj;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/epy;Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqj;->g:Ljava/util/List;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqj;->h:Ljava/util/List;

    .line 63
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eqj;->c:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lo/eqj;->b:Lo/epy;

    .line 65
    iput-object p3, p0, Lo/eqj;->d:Ljava/util/List;

    .line 66
    new-instance v0, Lo/eqj$d;

    invoke-direct {v0, p0}, Lo/eqj$d;-><init>(Lo/eqj;)V

    iput-object v0, p0, Lo/eqj;->a:Lo/eqj$d;

    .line 67
    invoke-direct {p0}, Lo/eqj;->c()V

    .line 68
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 34
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/eqj;)Lo/eqj$d;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eqj;->a:Lo/eqj$d;

    return-object v0
.end method

.method static synthetic b(Lo/eqj;)Ljava/util/List;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eqj;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/eqj;Ljava/util/List;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/eqj;->d(Ljava/util/List;)V

    return-void
.end method

.method private c()V
    .locals 4

    .line 79
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeWeightData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/eqj;->g:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    iget-object v0, p0, Lo/eqj;->g:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lo/eqj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqj;->g:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    sget-object v3, Lo/eqj;->e:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 85
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 320
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lo/eqj;->b:Lo/epy;

    invoke-virtual {v0, p1}, Lo/epy;->d(Ljava/util/List;)V

    .line 322
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Lo/eqa;Lo/epx;)Ljava/util/List<Lo/epx;>;"
        }
    .end annotation

    .line 301
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 302
    const/4 v2, 0x0

    .line 303
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/epx;

    .line 305
    invoke-virtual {v3}, Lo/epx;->g()Lo/eqa;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 306
    invoke-interface {p1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 307
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 309
    :cond_0
    goto :goto_0

    .line 311
    :cond_1
    invoke-interface {p1, v2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 312
    return-object p1
.end method

.method public b()Lo/eqj;
    .locals 0

    .line 71
    invoke-virtual {p0}, Lo/eqj;->d()V

    .line 72
    return-object p0
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 262
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeSleepData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerSleepListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iput-object p1, p0, Lo/eqj;->h:Ljava/util/List;

    .line 267
    :cond_0
    return-void
.end method

.method public d()V
    .locals 11

    .line 106
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start readCardData() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v4

    .line 109
    const/4 v6, 0x3

    .line 110
    const/4 v7, 0x1

    .line 111
    new-instance v8, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 112
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 113
    invoke-virtual {v8, v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 114
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 116
    const/4 v9, 0x7

    new-array v9, v9, [I

    fill-array-data v9, :array_0

    .line 126
    const/4 v0, 0x7

    new-array v10, v0, [Ljava/lang/String;

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v10, v1

    const-string v0, "core_sleep_shallow_key"

    const/4 v1, 0x1

    aput-object v0, v10, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v10, v1

    const-string v0, "core_sleep_total_sleep_time_key"

    const/4 v1, 0x3

    aput-object v0, v10, v1

    const-string v0, "sleep_deep_key"

    const/4 v1, 0x4

    aput-object v0, v10, v1

    const-string v0, "sleep_shallow_key"

    const/4 v1, 0x5

    aput-object v0, v10, v1

    const-string v0, "sleep_core_sleep_noon_duration_key"

    const/4 v1, 0x6

    aput-object v0, v10, v1

    .line 136
    invoke-virtual {v8, v10}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 137
    invoke-virtual {v8, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 138
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 140
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 141
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 144
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 146
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 147
    iget-object v0, p0, Lo/eqj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/eqj$3;

    invoke-direct {v1, p0}, Lo/eqj$3;-><init>(Lo/eqj;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 258
    return-void

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xac49
        0xabe1
        0xabe2
        0xac4c
    .end array-data
.end method

.method public e()V
    .locals 5

    .line 88
    sget-object v0, Lo/eqj;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeSleepData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/eqj;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqj;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/eqj;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqj;->h:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    sget-object v3, Lo/eqj;->e:Ljava/lang/String;

    const-string v4, "unSubscribeSleepData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 94
    :cond_0
    return-void
.end method

.method public e(I)Z
    .locals 1

    .line 98
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
