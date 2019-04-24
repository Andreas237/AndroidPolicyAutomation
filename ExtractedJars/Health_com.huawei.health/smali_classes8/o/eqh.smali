.class public Lo/eqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eqh$e;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:Lo/epy;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field private final d:Lo/eqh$e;

.field protected e:Landroid/content/Context;

.field private f:Lo/epx;

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

    .line 37
    const-string v0, "FunctionSetBloodPressureReader"

    sput-object v0, Lo/eqh;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/epy;Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqh;->g:Ljava/util/List;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqh;->h:Ljava/util/List;

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eqh;->e:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lo/eqh;->a:Lo/epy;

    .line 77
    iput-object p3, p0, Lo/eqh;->b:Ljava/util/List;

    .line 78
    new-instance v0, Lo/eqh$e;

    invoke-direct {v0, p0}, Lo/eqh$e;-><init>(Lo/eqh;)V

    iput-object v0, p0, Lo/eqh;->d:Lo/eqh$e;

    .line 79
    invoke-direct {p0}, Lo/eqh;->c()V

    .line 80
    return-void
.end method

.method private a(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Lo/eqa;Lo/epx;)Ljava/util/List<Lo/epx;>;"
        }
    .end annotation

    .line 181
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 182
    const/4 v2, 0x0

    .line 183
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/epx;

    .line 185
    invoke-virtual {v3}, Lo/epx;->g()Lo/eqa;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 186
    invoke-interface {p1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 187
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 188
    goto :goto_1

    .line 190
    :cond_0
    goto :goto_0

    .line 192
    :cond_1
    :goto_1
    invoke-interface {p1, v2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 193
    return-object p1
.end method

.method static synthetic a(Lo/eqh;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2, p3}, Lo/eqh;->a(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/eqh;DDJ)V
    .locals 0

    .line 35
    invoke-direct/range {p0 .. p6}, Lo/eqh;->b(DDJ)V

    return-void
.end method

.method static synthetic b(Lo/eqh;)Lo/epx;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/eqh;->f:Lo/epx;

    return-object v0
.end method

.method private b(DDJ)V
    .locals 9

    .line 88
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshBloodPressureDataAndTime called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const-string v4, ""

    .line 91
    invoke-static {p5, p6}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 93
    invoke-virtual {v5, p5, p6}, Ljava/util/Date;->setTime(J)V

    .line 94
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lo/eqh;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v7

    .line 96
    invoke-virtual {v7, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 99
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "shortDate"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {p5, p6}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 103
    :goto_0
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqh;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p3, p4, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, p2, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqh;->e:Landroid/content/Context;

    .line 106
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_mmhg_str:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->h:Lo/eqa;

    .line 107
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->e:Lo/epx$c;

    .line 108
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqh;->e:Landroid/content/Context;

    .line 109
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 110
    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqh;->f:Lo/epx;

    .line 112
    iget-object v0, p0, Lo/eqh;->d:Lo/eqh$e;

    invoke-virtual {v0}, Lo/eqh$e;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 113
    const/4 v0, 0x5

    iput v0, v5, Landroid/os/Message;->what:I

    .line 114
    iget-object v0, p0, Lo/eqh;->f:Lo/epx;

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 115
    iget-object v0, p0, Lo/eqh;->d:Lo/eqh$e;

    invoke-virtual {v0, v5}, Lo/eqh$e;->sendMessage(Landroid/os/Message;)Z

    .line 116
    return-void
.end method

.method private c()V
    .locals 4

    .line 202
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeBloodPressureData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lo/eqh;->g:Ljava/util/List;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    iget-object v0, p0, Lo/eqh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqh;->g:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    sget-object v3, Lo/eqh;->c:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 207
    return-void
.end method

.method static synthetic d(Lo/eqh;)Ljava/util/List;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/eqh;->b:Ljava/util/List;

    return-object v0
.end method

.method private d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 197
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lo/eqh;->a:Lo/epy;

    invoke-virtual {v0, p1}, Lo/epy;->d(Ljava/util/List;)V

    .line 199
    return-void
.end method

.method static synthetic d(Lo/eqh;Ljava/util/List;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lo/eqh;->d(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 35
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/eqh;)Lo/eqh$e;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/eqh;->d:Lo/eqh$e;

    return-object v0
.end method


# virtual methods
.method public a()Lo/eqh;
    .locals 0

    .line 83
    invoke-virtual {p0}, Lo/eqh;->d()V

    .line 84
    return-object p0
.end method

.method public b()V
    .locals 5

    .line 210
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeBloodPressureData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lo/eqh;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqh;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/eqh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqh;->h:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    sget-object v3, Lo/eqh;->c:Ljava/lang/String;

    const-string v4, "unSubscribeBloodPressureData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 215
    :cond_0
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 173
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeBloodPressureData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeBloodPressureData success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iput-object p1, p0, Lo/eqh;->h:Ljava/util/List;

    .line 178
    :cond_0
    return-void
.end method

.method public d()V
    .locals 7

    .line 125
    sget-object v0, Lo/eqh;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readCardData called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 127
    const/4 v5, 0x2

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 128
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 130
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 131
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 132
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 133
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 135
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 137
    const-wide/16 v0, 0x0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 140
    iget-object v0, p0, Lo/eqh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/eqh$1;

    invoke-direct {v1, p0}, Lo/eqh$1;-><init>(Lo/eqh;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 169
    return-void

    :array_0
    .array-data 4
        0x7d6
        0x7d7
    .end array-data
.end method

.method public e(I)Z
    .locals 1

    .line 120
    const/16 v0, 0x9

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
