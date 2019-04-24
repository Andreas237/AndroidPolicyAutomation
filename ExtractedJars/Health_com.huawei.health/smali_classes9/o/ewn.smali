.class public Lo/ewn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/ewn;

.field private static final i:[B


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Z

.field private I:I

.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewk;>;"
        }
    .end annotation
.end field

.field public b:J

.field public c:J

.field public d:Z

.field private f:Z

.field private g:Landroid/content/Context;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private j:Z

.field private k:I

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private v:Lo/ewi;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ewi;>;"
        }
    .end annotation
.end field

.field private y:Lo/ewk;

.field private z:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/ewn;->i:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->f:Z

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ewn;->z:Ljava/util/Map;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->d:Z

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->A:Z

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ewn;->C:Z

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->B:Z

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->D:Z

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->j:Z

    .line 44
    const/4 v0, 0x1

    iput v0, p0, Lo/ewn;->I:I

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ewn;->H:Z

    .line 46
    const-string v0, "unknown"

    iput-object v0, p0, Lo/ewn;->G:Ljava/lang/String;

    .line 112
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ewn;->g:Landroid/content/Context;

    .line 113
    return-void
.end method

.method private b(Ljava/util/List;)F
    .locals 6

    .line 376
    const/4 v4, 0x0

    .line 377
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 378
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v4, v0

    .line 377
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 380
    :cond_0
    int-to-double v0, v4

    const-wide v2, 0x4005c6a7ef9db22dL    # 2.722

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private b(Ljava/util/Map;I)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation

    .line 338
    invoke-direct {p0, p1, p2}, Lo/ewn;->c(Ljava/util/Map;I)Ljava/util/Map;

    move-result-object p1

    .line 339
    return-object p1
.end method

.method private b(Ljava/util/Map;)V
    .locals 1

    .line 324
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 325
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 327
    :cond_0
    return-void
.end method

.method private c(Ljava/util/Map;I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation

    .line 343
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 344
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeMap() value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const-string v0, "A"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "D"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 347
    :cond_0
    const-string v0, "B"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 348
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "C"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 349
    :cond_1
    const-string v0, "C"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 350
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "B"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 351
    :cond_2
    const-string v0, "D"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 352
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "A"

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    :cond_3
    :goto_0
    return-object p1
.end method

.method private c(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/ewn;->I:I

    .line 58
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 1

    .line 319
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 320
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 322
    :cond_0
    return-void
.end method

.method public static i()Lo/ewn;
    .locals 4

    .line 103
    sget-object v2, Lo/ewn;->i:[B

    monitor-enter v2

    .line 104
    :try_start_0
    sget-object v0, Lo/ewn;->e:Lo/ewn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 105
    new-instance v0, Lo/ewn;

    invoke-direct {v0}, Lo/ewn;-><init>()V

    sput-object v0, Lo/ewn;->e:Lo/ewn;

    .line 107
    :cond_0
    sget-object v0, Lo/ewn;->e:Lo/ewn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 108
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private r()V
    .locals 8

    .line 179
    iget-object v0, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_item_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 180
    iget-object v0, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_item_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 181
    iget-object v0, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_item_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 182
    iget-object v0, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_item_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 184
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 185
    iget-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 187
    iget-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 189
    iget-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 191
    iget-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->h:Ljava/util/List;

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 193
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 196
    iget-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 198
    iget-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 200
    iget-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 202
    iget-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->m:Ljava/util/List;

    const/4 v3, 0x2

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 204
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 207
    iget-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 209
    iget-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 211
    iget-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 213
    iget-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->o:Ljava/util/List;

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 215
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 218
    iget-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 220
    iget-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 222
    iget-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 224
    iget-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->l:Ljava/util/List;

    const/4 v3, 0x4

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 226
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 229
    iget-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 231
    iget-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 233
    iget-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 235
    iget-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_5:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->p:Ljava/util/List;

    const/4 v3, 0x5

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 237
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 240
    iget-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 242
    iget-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 244
    iget-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 246
    iget-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_6:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->n:Ljava/util/List;

    const/4 v3, 0x6

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 248
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 251
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 252
    iget-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 253
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 254
    iget-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 256
    iget-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 258
    iget-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_7:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->u:Ljava/util/List;

    const/4 v3, 0x7

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 260
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 263
    iget-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 265
    iget-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 267
    iget-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 269
    iget-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_8:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->q:Ljava/util/List;

    const/16 v3, 0x8

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 271
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 274
    iget-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 275
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 276
    iget-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 278
    iget-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 280
    iget-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_9:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->r:Ljava/util/List;

    const/16 v3, 0x9

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 282
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 285
    iget-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 287
    iget-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 289
    iget-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 291
    iget-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_10:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->t:Ljava/util/List;

    const/16 v3, 0xa

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 293
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 296
    iget-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 298
    iget-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 299
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 300
    iget-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 302
    iget-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->s:Ljava/util/List;

    const/16 v3, 0xb

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 304
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 306
    new-instance v0, Lo/ewi;

    const-string v1, "A"

    invoke-direct {v0, v1, v4}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 307
    iget-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    new-instance v0, Lo/ewi;

    const-string v1, "B"

    invoke-direct {v0, v1, v5}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 309
    iget-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    new-instance v0, Lo/ewi;

    const-string v1, "C"

    invoke-direct {v0, v1, v6}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 311
    iget-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    new-instance v0, Lo/ewi;

    const-string v1, "D"

    invoke-direct {v0, v1, v7}, Lo/ewi;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/ewn;->v:Lo/ewi;

    .line 313
    iget-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->v:Lo/ewi;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 314
    new-instance v0, Lo/ewk;

    iget-object v1, p0, Lo/ewn;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_question_text_12:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ewn;->x:Ljava/util/List;

    const/16 v3, 0xc

    invoke-direct {v0, v3, v1, v2}, Lo/ewk;-><init>(ILjava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lo/ewn;->y:Lo/ewk;

    .line 315
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    iget-object v1, p0, Lo/ewn;->y:Lo/ewk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    return-void
.end method

.method private t()I
    .locals 1

    .line 60
    iget v0, p0, Lo/ewn;->I:I

    return v0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 125
    iput-wide p1, p0, Lo/ewn;->c:J

    .line 126
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/ewn;->F:Ljava/lang/String;

    .line 156
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 70
    iput-boolean p1, p0, Lo/ewn;->j:Z

    .line 71
    return-void
.end method

.method public a()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lo/ewn;->C:Z

    return v0
.end method

.method public b(ILjava/lang/String;)V
    .locals 4

    .line 330
    iget-object v0, p0, Lo/ewn;->z:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setAnswerMap() questionID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",===checkedItem = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/4 v0, 0x5

    if-eq v0, p1, :cond_0

    const/4 v0, 0x7

    if-eq v0, p1, :cond_0

    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    .line 333
    :cond_0
    iget-object v0, p0, Lo/ewn;->z:Ljava/util/Map;

    invoke-direct {p0, v0, p1}, Lo/ewn;->b(Ljava/util/Map;I)Ljava/util/Map;

    .line 335
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/ewn;->d:Z

    .line 64
    return-void
.end method

.method public b()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lo/ewn;->d:Z

    return v0
.end method

.method public c(J)V
    .locals 0

    .line 118
    iput-wide p1, p0, Lo/ewn;->b:J

    .line 119
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/ewn;->G:Ljava/lang/String;

    .line 135
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 51
    iput-boolean p1, p0, Lo/ewn;->f:Z

    .line 52
    return-void
.end method

.method public c()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lo/ewn;->j:Z

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 383
    iput p1, p0, Lo/ewn;->k:I

    .line 384
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lo/ewn;->E:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 76
    iput-boolean p1, p0, Lo/ewn;->A:Z

    .line 77
    return-void
.end method

.method public d()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lo/ewn;->f:Z

    return v0
.end method

.method public e(Z)V
    .locals 0

    .line 82
    iput-boolean p1, p0, Lo/ewn;->C:Z

    .line 83
    return-void
.end method

.method public e()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lo/ewn;->A:Z

    return v0
.end method

.method public f()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lo/ewn;->b:J

    return-wide v0
.end method

.method public g(Z)V
    .locals 0

    .line 416
    iput-boolean p1, p0, Lo/ewn;->H:Z

    .line 417
    return-void
.end method

.method public g()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lo/ewn;->B:Z

    return v0
.end method

.method public h()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lo/ewn;->D:Z

    return v0
.end method

.method public i(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lo/ewn;->D:Z

    .line 97
    return-void
.end method

.method public k()J
    .locals 2

    .line 128
    iget-wide v0, p0, Lo/ewn;->c:J

    return-wide v0
.end method

.method public k(Z)V
    .locals 0

    .line 89
    iput-boolean p1, p0, Lo/ewn;->B:Z

    .line 90
    return-void
.end method

.method public l()V
    .locals 4

    .line 159
    invoke-direct {p0}, Lo/ewn;->t()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 160
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ewn;->c(I)V

    .line 161
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initList() success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    .line 163
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    .line 174
    invoke-direct {p0}, Lo/ewn;->r()V

    .line 176
    :cond_0
    return-void
.end method

.method public m()F
    .locals 7

    .line 357
    iget-object v0, p0, Lo/ewn;->z:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 358
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 359
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 360
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 361
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLastScore() value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const-string v0, "A"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 363
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 364
    :cond_0
    const-string v0, "B"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 366
    :cond_1
    const-string v0, "C"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 367
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 368
    :cond_2
    const-string v0, "D"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 369
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 372
    :cond_4
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->b(Ljava/util/List;)F

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lo/ewn;->G:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lo/ewn;->F:Ljava/lang/String;

    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lo/ewn;->E:Ljava/lang/String;

    return-object v0
.end method

.method public q()V
    .locals 4

    .line 391
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " AnswerQuestionUtil reset()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    iget-object v0, p0, Lo/ewn;->h:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 393
    iget-object v0, p0, Lo/ewn;->m:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 394
    iget-object v0, p0, Lo/ewn;->o:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 395
    iget-object v0, p0, Lo/ewn;->l:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 396
    iget-object v0, p0, Lo/ewn;->p:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 397
    iget-object v0, p0, Lo/ewn;->n:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 398
    iget-object v0, p0, Lo/ewn;->u:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 399
    iget-object v0, p0, Lo/ewn;->q:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 400
    iget-object v0, p0, Lo/ewn;->r:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 401
    iget-object v0, p0, Lo/ewn;->t:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 402
    iget-object v0, p0, Lo/ewn;->s:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 403
    iget-object v0, p0, Lo/ewn;->x:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 404
    iget-object v0, p0, Lo/ewn;->w:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 405
    iget-object v0, p0, Lo/ewn;->z:Ljava/util/Map;

    invoke-direct {p0, v0}, Lo/ewn;->b(Ljava/util/Map;)V

    .line 406
    iget-object v0, p0, Lo/ewn;->a:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/ewn;->e(Ljava/util/List;)V

    .line 407
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ewn;->c(I)V

    .line 408
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewn;->b(Z)V

    .line 409
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewn;->c(Z)V

    .line 410
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ewn;->e(Z)V

    .line 411
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewn;->k(Z)V

    .line 412
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ewn;->i(Z)V

    .line 413
    return-void
.end method

.method public s()Z
    .locals 1

    .line 419
    iget-boolean v0, p0, Lo/ewn;->H:Z

    return v0
.end method

.method public u()I
    .locals 1

    .line 387
    iget v0, p0, Lo/ewn;->k:I

    return v0
.end method
