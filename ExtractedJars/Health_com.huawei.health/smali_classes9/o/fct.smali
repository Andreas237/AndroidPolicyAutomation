.class public Lo/fct;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fct$e;
    }
.end annotation


# instance fields
.field private a:Lo/acn;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private c:J

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fda;>;"
        }
    .end annotation
.end field

.field private f:I

.field private g:J

.field private h:Z

.field private i:I

.field private k:I

.field private m:B

.field private n:I

.field private final p:Lo/acu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lo/acn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/fda;>;Lo/acn;)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fct;->e:Ljava/util/List;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fct;->b:Ljava/util/List;

    .line 63
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lo/fct;->p:Lo/acu;

    .line 66
    iput-object p1, p0, Lo/fct;->d:Landroid/content/Context;

    .line 67
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 68
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 69
    iput-object p3, p0, Lo/fct;->a:Lo/acn;

    .line 70
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->u()I

    move-result v0

    iput v0, p0, Lo/fct;->k:I

    .line 72
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iput-byte v0, p0, Lo/fct;->m:B

    .line 73
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->q()I

    move-result v0

    iput v0, p0, Lo/fct;->n:I

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lo/fct;->p:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    iput v0, p0, Lo/fct;->k:I

    .line 76
    iget-object v0, p0, Lo/fct;->p:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    iput-byte v0, p0, Lo/fct;->m:B

    .line 77
    iget-object v0, p0, Lo/fct;->p:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    iput v0, p0, Lo/fct;->n:I

    .line 79
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/fct;)Lo/acn;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    return-object v0
.end method

.method private static a(Landroid/content/Context;I)V
    .locals 4

    .line 281
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 282
    return-void

    .line 284
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 285
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->gf:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 288
    return-void
.end method

.method private a()Z
    .locals 9

    .line 291
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 292
    const/4 v0, 0x0

    return v0

    .line 294
    :cond_0
    iget-object v0, p0, Lo/fct;->p:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/fej;->c(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/fct;->b:Ljava/util/List;

    .line 295
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fct;->h:Z

    .line 296
    const/4 v0, 0x0

    iput v0, p0, Lo/fct;->i:I

    .line 297
    const/4 v0, 0x0

    iput v0, p0, Lo/fct;->f:I

    .line 299
    iget-object v0, p0, Lo/fct;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 300
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard  mBodyTypeDatas  size == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 302
    iget-boolean v0, p0, Lo/fct;->h:Z

    return v0

    .line 304
    :cond_1
    iget-object v0, p0, Lo/fct;->b:Ljava/util/List;

    iget-object v1, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 305
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 306
    iget-boolean v0, p0, Lo/fct;->h:Z

    return v0

    .line 309
    :cond_2
    iget-object v0, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v8, v0, -0x1

    :goto_0
    if-ltz v8, :cond_4

    .line 310
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fee;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    .line 311
    iget-object v0, p0, Lo/fct;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iget-object v2, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_4

    .line 312
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowBadyTypeCard, bodyType has chenged... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    invoke-virtual {v7}, Lo/acn;->t()B

    move-result v0

    invoke-virtual {v7}, Lo/acn;->b()D

    move-result-wide v1

    invoke-virtual {v7}, Lo/acn;->g()D

    move-result-wide v3

    invoke-virtual {v7}, Lo/acn;->u()I

    move-result v5

    invoke-virtual {v7}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lo/fct;->i:I

    .line 314
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->t()B

    move-result v0

    iget-object v1, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v1}, Lo/acn;->b()D

    move-result-wide v1

    iget-object v3, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v3}, Lo/acn;->g()D

    move-result-wide v3

    iget-object v5, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v5}, Lo/acn;->u()I

    move-result v5

    iget-object v6, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v6}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    iput v0, p0, Lo/fct;->f:I

    .line 315
    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fct;->c:J

    .line 316
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fct;->g:J

    goto :goto_1

    .line 309
    :cond_3
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_0

    .line 321
    :cond_4
    :goto_1
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowBadyTypeCard, mStartType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fct;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fct;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mStartTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/fct;->c:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mEndTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/fct;->g:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget v0, p0, Lo/fct;->i:I

    iget v1, p0, Lo/fct;->f:I

    if-ne v0, v1, :cond_5

    .line 323
    iget-boolean v0, p0, Lo/fct;->h:Z

    return v0

    .line 325
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fct;->h:Z

    const/4 v0, 0x1

    return v0

    .line 328
    :cond_6
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightDetail isShowBadyTypeCard mBodyTypeDatas  is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-boolean v0, p0, Lo/fct;->h:Z

    return v0
.end method

.method static synthetic b(Lo/fct;)Ljava/util/List;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 334
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightBodyTypeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 335
    iget-object v0, p0, Lo/fct;->a:Lo/acn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 336
    const-string v0, "weightBean_key"

    iget-object v1, p0, Lo/fct;->a:Lo/acn;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 337
    const-string v0, "start_time"

    iget-wide v1, p0, Lo/fct;->c:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 338
    const-string v0, "start_type"

    iget v1, p0, Lo/fct;->i:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 339
    const-string v0, "is_show_change"

    iget-boolean v1, p0, Lo/fct;->h:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 340
    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 342
    :cond_0
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoBodyTypeDetail  lastBean is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    return-void

    .line 345
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fct;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/fct;->d()V

    return-void
.end method

.method private d()V
    .locals 8

    .line 256
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v3

    .line 257
    invoke-virtual {v3}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v4

    .line 258
    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_pressure_calibrate_guide_dialog_msg:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 260
    new-instance v7, Lo/egv$b;

    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 261
    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_adjust:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 262
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fct;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_adjust:I

    .line 263
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fct$5;

    invoke-direct {v2, p0, v3}, Lo/fct$5;-><init>(Lo/fct;Lo/acu;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fct;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    .line 269
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fct$1;

    invoke-direct {v2, p0}, Lo/fct$1;-><init>(Lo/fct;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 274
    invoke-virtual {v7}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 275
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 276
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 277
    return-void
.end method

.method static synthetic d(Lo/fct;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lo/fct;->c()V

    return-void
.end method

.method static synthetic e(Lo/fct;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Landroid/content/Context;I)V
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lo/fct;->a(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fda;>;)V"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 83
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 84
    invoke-virtual {p0}, Lo/fct;->notifyDataSetChanged()V

    .line 85
    return-void
.end method

.method public getItemCount()I
    .locals 4

    .line 224
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lists.size(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 230
    int-to-long v0, p1

    return-wide v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 10

    .line 100
    move-object v6, p1

    check-cast v6, Lo/fct$e;

    .line 101
    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p2, v0, :cond_1

    .line 102
    :cond_0
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position Out of bounds exception... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void

    .line 105
    :cond_1
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/fda;

    invoke-virtual {v3}, Lo/fda;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/fda;

    invoke-virtual {v3}, Lo/fda;->a()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, v6, Lo/fct$e;->b:Landroid/view/View;

    new-instance v1, Lo/fct$4;

    invoke-direct {v1, p0, p2}, Lo/fct$4;-><init>(Lo/fct;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    iget-object v0, v6, Lo/fct$e;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fct;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fda;

    invoke-virtual {v2}, Lo/fda;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v0, v6, Lo/fct$e;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fda;

    invoke-virtual {v1}, Lo/fda;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    .line 138
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/16 v1, 0xd

    if-ne v1, v0, :cond_4

    .line 139
    :cond_3
    iget-object v0, v6, Lo/fct$e;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 140
    iget-object v0, v6, Lo/fct$e;->c:Landroid/widget/TextView;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 142
    :cond_4
    iget-object v0, v6, Lo/fct$e;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 143
    :goto_0
    iget-object v0, v6, Lo/fct$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fct;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/fda;

    invoke-virtual {v2}, Lo/fda;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 147
    :pswitch_0
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fct;->m:B

    iget v3, p0, Lo/fct;->k:I

    iget-object v4, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->b(DBILandroid/widget/TextView;)V

    .line 148
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 149
    goto/16 :goto_3

    .line 151
    :pswitch_1
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-object v2, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fek;->a(DLandroid/widget/TextView;)V

    .line 152
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 153
    goto/16 :goto_3

    .line 155
    :pswitch_2
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fct;->m:B

    iget-object v3, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3}, Lo/fek;->e(DBLandroid/widget/TextView;)V

    .line 156
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 157
    goto/16 :goto_3

    .line 159
    :pswitch_3
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget v2, p0, Lo/fct;->k:I

    iget-byte v3, p0, Lo/fct;->m:B

    iget-object v4, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->e(DIBLandroid/widget/TextView;)V

    .line 160
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 161
    goto/16 :goto_3

    .line 163
    :pswitch_4
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-object v2, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fek;->c(DLandroid/widget/TextView;)V

    .line 164
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 165
    goto/16 :goto_3

    .line 167
    :pswitch_5
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fct;->m:B

    iget v3, p0, Lo/fct;->n:I

    iget-object v4, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->d(DBILandroid/widget/TextView;)V

    .line 168
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    goto/16 :goto_3

    .line 171
    :pswitch_6
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fct;->m:B

    iget-object v3, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/fda;

    invoke-virtual {v3}, Lo/fda;->h()Lo/acn;

    move-result-object v3

    invoke-virtual {v3}, Lo/acn;->d()D

    move-result-wide v3

    double-to-float v3, v3

    iget-object v4, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->b(DBFLandroid/widget/TextView;)V

    .line 172
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    goto/16 :goto_3

    .line 175
    :pswitch_7
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-object v2, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fek;->d(DLandroid/widget/TextView;)V

    .line 176
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 177
    goto/16 :goto_3

    .line 179
    :pswitch_8
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_6

    .line 180
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    double-to-float v7, v0

    .line 181
    float-to-double v0, v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 183
    iget-object v0, p0, Lo/fct;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 184
    new-instance v9, Landroid/text/SpannableString;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    float-to-int v2, v7

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 186
    :cond_5
    new-instance v9, Landroid/text/SpannableString;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_show_bodyage_unit_years_old:I

    float-to-int v2, v7

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    float-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 188
    :goto_1
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0xc

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v9}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v9, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 189
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    const/16 v1, 0x12

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x11

    invoke-virtual {v9, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 190
    iget-object v0, v6, Lo/fct$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    goto :goto_2

    .line 192
    :cond_6
    iget-object v0, v6, Lo/fct$e;->d:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    :goto_2
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    goto :goto_3

    .line 197
    :pswitch_9
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-byte v2, p0, Lo/fct;->m:B

    iget v3, p0, Lo/fct;->n:I

    iget-object v4, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fek;->a(DBILandroid/widget/TextView;)V

    .line 198
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 199
    goto :goto_3

    .line 201
    :pswitch_a
    goto :goto_3

    .line 203
    :pswitch_b
    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->a()D

    move-result-wide v0

    iget-object v2, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    invoke-static {v0, v1, v2}, Lo/fek;->e(DLandroid/widget/TextView;)V

    .line 204
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    goto :goto_3

    .line 207
    :pswitch_c
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 208
    iget-object v0, v6, Lo/fct$e;->d:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v0, v6, Lo/fct$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fda;

    invoke-virtual {v1}, Lo/fda;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 214
    :goto_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lo/fct;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fda;

    invoke-virtual {v0}, Lo/fda;->e()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    .line 215
    iget-object v0, v6, Lo/fct$e;->e:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 217
    :cond_7
    invoke-direct {p0}, Lo/fct;->a()Z

    .line 218
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 92
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "viewType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    new-instance v0, Lo/fct$e;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$layout;->body_index_detail_recycle_items:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/fct$e;-><init>(Lo/fct;Landroid/view/View;)V

    return-object v0
.end method
