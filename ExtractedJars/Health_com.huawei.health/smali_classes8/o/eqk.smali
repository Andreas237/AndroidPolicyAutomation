.class public Lo/eqk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eqk$b;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field private final b:Lo/eqk$b;

.field private d:Lo/epy;

.field protected e:Landroid/content/Context;

.field private f:Lo/epx;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const-string v0, "FunctionSetWeightCardReader"

    sput-object v0, Lo/eqk;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/epy;Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqk;->g:Ljava/util/List;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqk;->i:Ljava/util/List;

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    .line 92
    iput-object p2, p0, Lo/eqk;->d:Lo/epy;

    .line 93
    iput-object p3, p0, Lo/eqk;->a:Ljava/util/List;

    .line 94
    new-instance v0, Lo/eqk$b;

    invoke-direct {v0, p0}, Lo/eqk$b;-><init>(Lo/eqk;)V

    iput-object v0, p0, Lo/eqk;->b:Lo/eqk$b;

    .line 105
    invoke-direct {p0}, Lo/eqk;->c()V

    .line 106
    return-void
.end method

.method static synthetic a(Lo/eqk;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 1

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lo/eqk;->e(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/eqk;)Lo/epx;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eqk;->f:Lo/epx;

    return-object v0
.end method

.method private a(DJ)V
    .locals 9

    .line 117
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWeightData called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-static {p3, p4}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 122
    invoke-virtual {v5, p3, p4}, Ljava/util/Date;->setTime(J)V

    .line 123
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v7

    .line 125
    invoke-virtual {v7, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 126
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

    .line 127
    goto :goto_0

    .line 129
    :cond_0
    invoke-static {p3, p4}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 132
    :goto_0
    const-string v5, ""

    .line 135
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_lbs:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 137
    invoke-static {p1, p2}, Lo/cxh;->e(D)D

    move-result-wide v6

    goto :goto_1

    .line 140
    :cond_1
    iget-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 141
    move-wide v6, p1

    .line 143
    :goto_1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    cmpg-double v0, v6, v0

    if-gez v0, :cond_2

    .line 144
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 146
    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v6, v7, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 147
    invoke-virtual {v0, v5}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    .line 148
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->a:Lo/epx$c;

    .line 149
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqk;->e:Landroid/content/Context;

    .line 150
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 151
    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqk;->f:Lo/epx;

    goto :goto_2

    .line 154
    :cond_2
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 156
    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v6, v7, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 157
    invoke-virtual {v0, v5}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    .line 158
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->e:Lo/epx$c;

    .line 159
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqk;->e:Landroid/content/Context;

    .line 160
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 161
    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqk;->f:Lo/epx;

    .line 164
    :goto_2
    iget-object v0, p0, Lo/eqk;->b:Lo/eqk$b;

    invoke-virtual {v0}, Lo/eqk$b;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 165
    const/4 v0, 0x2

    iput v0, v8, Landroid/os/Message;->what:I

    .line 166
    iget-object v0, p0, Lo/eqk;->f:Lo/epx;

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 167
    iget-object v0, p0, Lo/eqk;->b:Lo/eqk$b;

    invoke-virtual {v0, v8}, Lo/eqk$b;->sendMessage(Landroid/os/Message;)Z

    .line 168
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 289
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iget-object v0, p0, Lo/eqk;->d:Lo/epy;

    invoke-virtual {v0, p1}, Lo/epy;->d(Ljava/util/List;)V

    .line 291
    return-void
.end method

.method static synthetic a(Lo/eqk;DJ)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eqk;->a(DJ)V

    return-void
.end method

.method static synthetic a(Lo/eqk;Ljava/util/List;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lo/eqk;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic c(Lo/eqk;)Ljava/util/List;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eqk;->a:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 294
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeWeightData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lo/eqk;->g:Ljava/util/List;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    iget-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqk;->g:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    sget-object v3, Lo/eqk;->c:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 299
    return-void
.end method

.method static synthetic d(Lo/eqk;)Lo/eqk$b;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eqk;->b:Lo/eqk$b;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 40
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Lo/eqa;Lo/epx;)Ljava/util/List<Lo/epx;>;"
        }
    .end annotation

    .line 273
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 274
    const/4 v2, 0x0

    .line 275
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/epx;

    .line 277
    invoke-virtual {v3}, Lo/epx;->g()Lo/eqa;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 278
    invoke-interface {p1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 279
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 280
    goto :goto_1

    .line 282
    :cond_0
    goto :goto_0

    .line 284
    :cond_1
    :goto_1
    invoke-interface {p1, v2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 285
    return-object p1
.end method

.method static synthetic e(Lo/eqk;)Lo/epy;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eqk;->d:Lo/epy;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 302
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeWeightData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lo/eqk;->i:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqk;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    iget-object v0, p0, Lo/eqk;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqk;->i:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    sget-object v3, Lo/eqk;->c:Ljava/lang/String;

    const-string v4, "unSubscribeWeightData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 307
    :cond_0
    return-void
.end method

.method public b()Lo/eqk;
    .locals 0

    .line 109
    invoke-virtual {p0}, Lo/eqk;->d()V

    .line 113
    return-object p0
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 265
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeWeightData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 267
    sget-object v0, Lo/eqk;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWeightListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iput-object p1, p0, Lo/eqk;->i:Ljava/util/List;

    .line 270
    :cond_0
    return-void
.end method

.method public d()V
    .locals 8

    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 178
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 180
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 182
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 183
    new-instance v7, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 184
    const-wide/16 v0, 0x0

    invoke-virtual {v7, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 185
    invoke-virtual {v7, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 188
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 189
    const-string v0, ""

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 190
    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 192
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/eqk$1;

    invoke-direct {v1, p0, v4}, Lo/eqk$1;-><init>(Lo/eqk;Ljava/lang/String;)V

    invoke-interface {v0, v7, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 261
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method public e(I)Z
    .locals 1

    .line 172
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
