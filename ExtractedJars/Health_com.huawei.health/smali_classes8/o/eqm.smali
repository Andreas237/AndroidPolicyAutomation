.class public Lo/eqm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eqm$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field private final b:Lo/eqm$e;

.field private c:Lo/epx;

.field private d:Lo/epy;

.field protected e:Landroid/content/Context;

.field private f:Ljava/util/List;
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
.method public constructor <init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/epy;Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqm;->h:Ljava/util/List;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqm;->f:Ljava/util/List;

    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eqm;->e:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lo/eqm;->d:Lo/epy;

    .line 76
    iput-object p3, p0, Lo/eqm;->a:Ljava/util/List;

    .line 77
    new-instance v0, Lo/eqm$e;

    invoke-direct {v0, p0}, Lo/eqm$e;-><init>(Lo/eqm;)V

    iput-object v0, p0, Lo/eqm;->b:Lo/eqm$e;

    .line 78
    invoke-direct {p0}, Lo/eqm;->e()V

    .line 79
    return-void
.end method

.method static synthetic a(Lo/eqm;DJ)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eqm;->d(DJ)V

    return-void
.end method

.method static synthetic a(Lo/eqm;Ljava/util/List;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lo/eqm;->e(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Lo/eqa;Lo/epx;)Ljava/util/List<Lo/epx;>;"
        }
    .end annotation

    .line 191
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 192
    const/4 v2, 0x0

    .line 193
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 194
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/epx;

    .line 195
    invoke-virtual {v3}, Lo/epx;->g()Lo/eqa;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 196
    invoke-interface {p1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 198
    goto :goto_1

    .line 200
    :cond_0
    goto :goto_0

    .line 202
    :cond_1
    :goto_1
    invoke-interface {p1, v2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 203
    return-object p1
.end method

.method static synthetic b(Lo/eqm;)Lo/eqm$e;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eqm;->b:Lo/eqm$e;

    return-object v0
.end method

.method static synthetic d(Lo/eqm;)Ljava/util/List;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eqm;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/eqm;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/eqm;->b(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(DJ)V
    .locals 7

    .line 88
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshHeartRateDataAndTime called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-static {p3, p4}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 93
    invoke-virtual {v5, p3, p4}, Ljava/util/Date;->setTime(J)V

    .line 94
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 96
    goto :goto_0

    .line 98
    :cond_0
    invoke-static {p3, p4}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 102
    :goto_0
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    cmpg-double v0, p1, v0

    if-gez v0, :cond_1

    .line 103
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 105
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    .line 106
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->d:Lo/eqa;

    .line 107
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->a:Lo/epx$c;

    .line 108
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    .line 109
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 110
    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqm;->c:Lo/epx;

    goto :goto_1

    .line 113
    :cond_1
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 115
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    .line 116
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->d:Lo/eqa;

    .line 117
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->e:Lo/epx$c;

    .line 118
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->e:Landroid/content/Context;

    .line 119
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 120
    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqm;->c:Lo/epx;

    .line 123
    :goto_1
    iget-object v0, p0, Lo/eqm;->b:Lo/eqm$e;

    invoke-virtual {v0}, Lo/eqm$e;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 124
    const/4 v0, 0x4

    iput v0, v5, Landroid/os/Message;->what:I

    .line 125
    iget-object v0, p0, Lo/eqm;->c:Lo/epx;

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    iget-object v0, p0, Lo/eqm;->b:Lo/eqm$e;

    invoke-virtual {v0, v5}, Lo/eqm$e;->sendMessage(Landroid/os/Message;)Z

    .line 127
    return-void
.end method

.method static synthetic e(Lo/eqm;)Lo/epx;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/eqm;->c:Lo/epx;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 212
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHeartRateData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lo/eqm;->h:Ljava/util/List;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    iget-object v0, p0, Lo/eqm;->h:Ljava/util/List;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    iget-object v0, p0, Lo/eqm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->h:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    const-string v3, "FunctionSetHeartRateReader"

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 218
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 207
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/eqm;->d:Lo/epy;

    invoke-virtual {v0, p1}, Lo/epy;->d(Ljava/util/List;)V

    .line 209
    return-void
.end method


# virtual methods
.method public a()Lo/eqm;
    .locals 4

    .line 82
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshHeartRateCard called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-virtual {p0}, Lo/eqm;->d()V

    .line 84
    return-object p0
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 183
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHeartRateData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerHeartRateListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iput-object p1, p0, Lo/eqm;->f:Ljava/util/List;

    .line 188
    :cond_0
    return-void
.end method

.method public c()V
    .locals 5

    .line 221
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeHeartRateData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lo/eqm;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqm;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 223
    iget-object v0, p0, Lo/eqm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqm;->f:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    const-string v3, "FunctionSetHeartRateReader"

    const-string v4, "unSubscribeHeartRateData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 226
    :cond_0
    return-void
.end method

.method public d()V
    .locals 7

    .line 137
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "heart_rate_last"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 138
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 139
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 141
    const-wide/16 v0, 0x0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 142
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 143
    invoke-virtual {v4, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 144
    invoke-virtual {v4, v2}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 145
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 146
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 147
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 148
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 149
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 151
    iget-object v0, p0, Lo/eqm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/eqm$1;

    invoke-direct {v1, p0}, Lo/eqm$1;-><init>(Lo/eqm;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 179
    return-void

    :array_0
    .array-data 4
        0xb3c3
    .end array-data
.end method

.method public e(I)Z
    .locals 1

    .line 131
    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
