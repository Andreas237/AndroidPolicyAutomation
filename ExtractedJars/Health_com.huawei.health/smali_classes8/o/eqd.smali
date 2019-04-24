.class public Lo/eqd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eqf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eqd$e;
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

.field private final d:Lo/eqd$e;

.field protected e:Landroid/content/Context;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private i:Lo/epx;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const-string v0, "FunctionSetBloodSugarCardReader"

    sput-object v0, Lo/eqd;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lo/epy;Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqd;->k:Ljava/util/List;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqd;->f:Ljava/util/List;

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eqd;->e:Landroid/content/Context;

    .line 73
    iput-object p2, p0, Lo/eqd;->a:Lo/epy;

    .line 74
    iput-object p3, p0, Lo/eqd;->b:Ljava/util/List;

    .line 75
    new-instance v0, Lo/eqd$e;

    invoke-direct {v0, p0}, Lo/eqd$e;-><init>(Lo/eqd;)V

    iput-object v0, p0, Lo/eqd;->d:Lo/eqd$e;

    .line 76
    invoke-direct {p0}, Lo/eqd;->a()V

    .line 77
    return-void
.end method

.method static synthetic a(Lo/eqd;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 1

    .line 32
    invoke-direct {p0, p1, p2, p3}, Lo/eqd;->c(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/eqd;)Lo/eqd$e;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqd;->d:Lo/eqd$e;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 323
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeBloodSugarData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    iget-object v0, p0, Lo/eqd;->k:Ljava/util/List;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    iget-object v0, p0, Lo/eqd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqd;->k:Ljava/util/List;

    new-instance v2, Lo/eqf$e;

    sget-object v3, Lo/eqd;->c:Ljava/lang/String;

    invoke-direct {v2, v3, p0}, Lo/eqf$e;-><init>(Ljava/lang/String;Lo/eqf;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 327
    return-void
.end method

.method static synthetic b(Lo/eqd;)Ljava/util/List;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqd;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/eqd;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 32
    iput-object p1, p0, Lo/eqd;->g:Ljava/lang/String;

    return-object p1
.end method

.method private c(Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Lo/eqa;Lo/epx;)Ljava/util/List<Lo/epx;>;"
        }
    .end annotation

    .line 302
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 303
    const/4 v2, 0x0

    .line 304
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/epx;

    .line 306
    invoke-virtual {v3}, Lo/epx;->g()Lo/eqa;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 307
    invoke-interface {p1, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 308
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 309
    goto :goto_1

    .line 311
    :cond_0
    goto :goto_0

    .line 313
    :cond_1
    :goto_1
    invoke-interface {p1, v2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 314
    return-object p1
.end method

.method static synthetic c(Lo/eqd;DJ)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lo/eqd;->d(DJ)V

    return-void
.end method

.method static synthetic c(Lo/eqd;Ljava/util/List;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lo/eqd;->e(Ljava/util/List;)V

    return-void
.end method

.method static synthetic d(Lo/eqd;)Lo/epx;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqd;->i:Lo/epx;

    return-object v0
.end method

.method private d(DJ)V
    .locals 7

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/eqd;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-refreshBloodSugarDataAndTime enter"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 86
    const-string v4, ""

    .line 87
    invoke-static {p3, p4}, Lo/cxh;->b(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 89
    invoke-virtual {v5, p3, p4}, Ljava/util/Date;->setTime(J)V

    .line 90
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eqd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 92
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

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

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-static {p3, p4}, Lo/fee;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 96
    :goto_0
    new-instance v0, Lo/epx$d;

    iget-object v1, p0, Lo/eqd;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodsugar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epx$d;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0, v4}, Lo/epx$d;->a(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    .line 98
    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->b(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqd;->e:Landroid/content/Context;

    .line 99
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_home_page_healthdata_bloodsugar_mmol:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx$d;->e(Ljava/lang/String;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/eqa;->i:Lo/eqa;

    .line 100
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Lo/eqa;)Lo/epx$d;

    move-result-object v0

    sget-object v1, Lo/epx$c;->e:Lo/epx$c;

    .line 101
    invoke-virtual {v0, v1}, Lo/epx$d;->c(Lo/epx$c;)Lo/epx$d;

    move-result-object v0

    iget-object v1, p0, Lo/eqd;->e:Landroid/content/Context;

    .line 102
    invoke-virtual {v0, v1}, Lo/epx$d;->b(Landroid/content/Context;)Lo/epx$d;

    move-result-object v0

    .line 103
    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Lo/epx$d;->a(I)Lo/epx$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/epx$d;->d()Lo/epx;

    move-result-object v0

    iput-object v0, p0, Lo/eqd;->i:Lo/epx;

    .line 105
    iget-object v0, p0, Lo/eqd;->d:Lo/eqd$e;

    invoke-virtual {v0}, Lo/eqd$e;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 106
    const/4 v0, 0x6

    iput v0, v5, Landroid/os/Message;->what:I

    .line 107
    iget-object v0, p0, Lo/eqd;->i:Lo/epx;

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 108
    iget-object v0, p0, Lo/eqd;->d:Lo/eqd$e;

    invoke-virtual {v0, v5}, Lo/eqd$e;->sendMessage(Landroid/os/Message;)Z

    .line 109
    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 32
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 318
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lo/eqd;->a:Lo/epy;

    invoke-virtual {v0, p1}, Lo/epy;->d(Ljava/util/List;)V

    .line 320
    return-void
.end method


# virtual methods
.method public b()Lo/eqd;
    .locals 0

    .line 80
    invoke-virtual {p0}, Lo/eqd;->d()V

    .line 81
    return-object p0
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 294
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeBloodSugarData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBloodSugarListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    iput-object p1, p0, Lo/eqd;->f:Ljava/util/List;

    .line 299
    :cond_0
    return-void
.end method

.method public c()V
    .locals 5

    .line 330
    sget-object v0, Lo/eqd;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeBloodSugarData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iget-object v0, p0, Lo/eqd;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqd;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 332
    iget-object v0, p0, Lo/eqd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/eqd;->f:Ljava/util/List;

    new-instance v2, Lo/eqf$d;

    sget-object v3, Lo/eqd;->c:Ljava/lang/String;

    const-string v4, "unSubscribeBloodSugarData, isSuccess:"

    invoke-direct {v2, v3, v4}, Lo/eqf$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 335
    :cond_0
    return-void
.end method

.method public d()V
    .locals 6

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/eqd;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-readCardData enter"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 119
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-virtual {v4, v2, v3, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 121
    const/16 v5, 0x8

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 130
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 132
    iget-object v0, p0, Lo/eqd;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/eqd$1;

    invoke-direct {v1, p0}, Lo/eqd$1;-><init>(Lo/eqd;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 290
    return-void

    nop

    :array_0
    .array-data 4
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7df
    .end array-data
.end method

.method public e(I)Z
    .locals 1

    .line 113
    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
