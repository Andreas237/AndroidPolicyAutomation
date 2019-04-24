.class public final Lcom/tencent/map/b/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/map/b/b$a;
.implements Lcom/tencent/map/b/d$c;
.implements Lcom/tencent/map/b/e$c;
.implements Lcom/tencent/map/b/g$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/f$a;,
        Lcom/tencent/map/b/f$b;,
        Lcom/tencent/map/b/f$c;
    }
.end annotation


# static fields
.field private static t:Z

.field private static u:Lcom/tencent/map/b/f;


# instance fields
.field private A:Lcom/tencent/map/a/a/d;

.field private B:I

.field private C:I

.field private D:I

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private K:Z

.field private L:Z

.field private M:J

.field private N:Landroid/os/Handler;

.field private O:Ljava/lang/Runnable;

.field private final P:Landroid/content/BroadcastReceiver;

.field private a:J

.field private b:Landroid/content/Context;

.field private c:Lcom/tencent/map/b/e;

.field private d:Lcom/tencent/map/b/d;

.field private e:Lcom/tencent/map/b/g;

.field private f:I

.field private g:I

.field private h:Lcom/tencent/map/b/c;

.field private i:Lcom/tencent/map/b/b;

.field private j:Lcom/tencent/map/a/a/b;

.field private k:I

.field private l:I

.field private m:I

.field private n:[B

.field private o:[B

.field private p:Z

.field private q:Lcom/tencent/map/b/f$c;

.field private r:Lcom/tencent/map/b/f$b;

.field private s:Lcom/tencent/map/b/f$a;

.field private v:J

.field private w:Lcom/tencent/map/b/e$b;

.field private x:Lcom/tencent/map/b/d$b;

.field private y:Lcom/tencent/map/b/g$b;

.field private z:Lcom/tencent/map/a/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/map/b/f;->t:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/map/b/f;->u:Lcom/tencent/map/b/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/tencent/map/b/f;->a:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->c:Lcom/tencent/map/b/e;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->d:Lcom/tencent/map/b/d;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    const/16 v0, 0x400

    iput v0, p0, Lcom/tencent/map/b/f;->f:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/tencent/map/b/f;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->i:Lcom/tencent/map/b/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/map/b/f;->n:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/map/b/f;->o:[B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/f;->p:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->s:Lcom/tencent/map/b/f$a;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/tencent/map/b/f;->v:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/f;->C:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/f;->D:I

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->E:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->F:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->G:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->H:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->I:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/map/b/f;->J:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/f;->K:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/f;->L:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/map/b/f;->M:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->N:Landroid/os/Handler;

    new-instance v0, Lcom/tencent/map/b/f$1;

    invoke-direct {v0, p0}, Lcom/tencent/map/b/f$1;-><init>(Lcom/tencent/map/b/f;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->O:Ljava/lang/Runnable;

    new-instance v0, Lcom/tencent/map/b/f$2;

    invoke-direct {v0, p0}, Lcom/tencent/map/b/f$2;-><init>(Lcom/tencent/map/b/f;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->P:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/tencent/map/b/e;

    invoke-direct {v0}, Lcom/tencent/map/b/e;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->c:Lcom/tencent/map/b/e;

    new-instance v0, Lcom/tencent/map/b/d;

    invoke-direct {v0}, Lcom/tencent/map/b/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->d:Lcom/tencent/map/b/d;

    new-instance v0, Lcom/tencent/map/b/g;

    invoke-direct {v0}, Lcom/tencent/map/b/g;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;)J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/map/b/f;->M:J

    return-wide v0
.end method

.method static synthetic a(Lcom/tencent/map/b/f;J)J
    .locals 0

    iput-wide p1, p0, Lcom/tencent/map/b/f;->M:J

    return-wide p1
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Lcom/tencent/map/b/f$a;)Lcom/tencent/map/b/f$a;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->s:Lcom/tencent/map/b/f$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public static declared-synchronized a()Lcom/tencent/map/b/f;
    .locals 3

    const-class v1, Lcom/tencent/map/b/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/tencent/map/b/f;->u:Lcom/tencent/map/b/f;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/map/b/f;

    invoke-direct {v0}, Lcom/tencent/map/b/f;-><init>()V

    sput-object v0, Lcom/tencent/map/b/f;->u:Lcom/tencent/map/b/f;

    :cond_0
    sget-object v0, Lcom/tencent/map/b/f;->u:Lcom/tencent/map/b/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static a(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/ArrayList<Lcom/tencent/map/a/a/c;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lorg/json/JSONArray;->length()I

    move-result v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v11, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    const-string v0, "name"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v0, "addr"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "catalog"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v0, "dist"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v17

    const-string v0, "latitude"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v19

    const-string v0, "longitude"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v21

    new-instance v0, Lcom/tencent/map/a/a/c;

    move-object v1, v14

    move-object v2, v15

    move-object/from16 v3, v16

    move-wide/from16 v4, v17

    move-wide/from16 v6, v19

    move-wide/from16 v8, v21

    invoke-direct/range {v0 .. v9}, Lcom/tencent/map/a/a/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_0
    return-object v12
.end method

.method static synthetic a(Lcom/tencent/map/b/f;I)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    iput v0, p0, Lcom/tencent/map/b/f;->f:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget v1, p0, Lcom/tencent/map/b/f;->f:I

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(I)V

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Landroid/location/Location;)V
    .locals 5

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    const-wide v2, 0x4076700000000000L    # 359.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    const-wide v2, 0x4076700000000000L    # 359.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/tencent/map/b/f;->b(Z)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/tencent/map/b/f;->e()V

    :cond_2
    :goto_0
    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->b:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->c:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v1}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->e:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v1}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->d:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v1}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->f:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v1}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->g:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->a:I

    :cond_3
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/tencent/map/a/a/d;->x:Z

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    if-eqz v0, :cond_9

    iget v0, p0, Lcom/tencent/map/b/f;->B:I

    if-nez v0, :cond_9

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    :cond_4
    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget v1, v1, Lcom/tencent/map/a/a/d;->z:I

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->i:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->j:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->k:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->k:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->l:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->l:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x3

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    :cond_5
    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget v1, v1, Lcom/tencent/map/a/a/d;->z:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v0, v0, Lcom/tencent/map/a/a/d;->w:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->w:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v0, v0, Lcom/tencent/map/a/a/d;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/tencent/map/a/a/c;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v0, v0, Lcom/tencent/map/a/a/d;->w:Ljava/util/ArrayList;

    new-instance v1, Lcom/tencent/map/a/a/c;

    invoke-direct {v1, v4}, Lcom/tencent/map/a/a/c;-><init>(Lcom/tencent/map/a/a/c;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x4

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    :cond_7
    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_9

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget v1, v1, Lcom/tencent/map/a/a/d;->z:I

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x7

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget v1, v1, Lcom/tencent/map/a/a/d;->h:I

    iput v1, v0, Lcom/tencent/map/a/a/d;->h:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->i:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget v0, v0, Lcom/tencent/map/a/a/d;->h:I

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->j:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->k:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->k:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->l:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->l:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->q:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->q:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->r:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->s:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->s:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->t:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->u:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->u:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    iget-object v1, v1, Lcom/tencent/map/a/a/d;->v:Ljava/lang/String;

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->v:Ljava/lang/String;

    :cond_9
    :goto_2
    iget v0, p0, Lcom/tencent/map/b/f;->B:I

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    if-eqz v0, :cond_c

    :cond_a
    iget v0, p0, Lcom/tencent/map/b/f;->B:I

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget v1, p0, Lcom/tencent/map/b/f;->B:I

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/map/b/f;->v:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/tencent/map/b/f;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_c

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(Lcom/tencent/map/a/a/d;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/map/b/f;->v:J

    :cond_c
    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Lcom/tencent/map/b/d$b;)V
    .locals 5

    iput-object p1, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    invoke-virtual {v0}, Lcom/tencent/map/b/g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    invoke-virtual {v0}, Lcom/tencent/map/b/g;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/tencent/map/b/g;->a(J)V

    return-void

    :cond_0
    iget v0, p0, Lcom/tencent/map/b/f;->C:I

    if-lez v0, :cond_1

    iget v0, p1, Lcom/tencent/map/b/d$b;->a:I

    iget v1, p1, Lcom/tencent/map/b/d$b;->b:I

    iget v2, p1, Lcom/tencent/map/b/d$b;->c:I

    iget v3, p1, Lcom/tencent/map/b/d$b;->d:I

    iget v4, p1, Lcom/tencent/map/b/d$b;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/tencent/map/b/i;->a(IIIII)Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/tencent/map/b/f;->C:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/f;->C:I

    :cond_1
    invoke-direct {p0}, Lcom/tencent/map/b/f;->d()V

    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Lcom/tencent/map/b/e$b;)V
    .locals 6

    if-eqz p1, :cond_3

    iput-object p1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/tencent/map/b/f;->b(Z)V

    return-void

    :cond_2
    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/f;->i:Lcom/tencent/map/b/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tencent/map/b/f;->i:Lcom/tencent/map/b/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v1}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iget-object v3, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v3}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iget-object v5, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/map/b/b;->a(DDLcom/tencent/map/b/b$a;)V

    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Lcom/tencent/map/b/g$b;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    invoke-direct {p0}, Lcom/tencent/map/b/f;->d()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Ljava/lang/String;)V
    .locals 8

    invoke-static {p1}, Lcom/tencent/map/b/i;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/tencent/map/b/f;->C:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/tencent/map/b/f;->C:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/tencent/map/b/f;->C:I

    return-void

    :cond_0
    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/tencent/map/a/a/b;->a([BI)V

    goto/16 :goto_1

    :cond_1
    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x3

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x3

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, -0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(Lcom/tencent/map/a/a/d;)V

    :cond_2
    return-void

    :cond_3
    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_4

    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    nop

    :catch_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lcom/tencent/map/a/a/b;->a([BI)V

    return-void

    :cond_4
    move-object v6, p0

    iget-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    if-nez v0, :cond_5

    const/4 v6, 0x0

    goto :goto_0

    :cond_5
    const/4 v7, 0x0

    iget-object v0, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    if-eqz v0, :cond_6

    iget-object v0, v6, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    if-eqz v0, :cond_6

    iget-object v0, v6, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    iget-object v1, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v1, v1, Lcom/tencent/map/b/d$b;->b:I

    iget-object v2, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v2, v2, Lcom/tencent/map/b/d$b;->c:I

    iget-object v3, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v3, v3, Lcom/tencent/map/b/d$b;->d:I

    iget-object v4, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v4, v4, Lcom/tencent/map/b/d$b;->e:I

    iget-object v5, v6, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    invoke-virtual {v5}, Lcom/tencent/map/b/g$b;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/map/b/c;->b(IIIILjava/util/List;)Ljava/lang/String;

    move-result-object v7

    :cond_6
    move-object v6, v7

    :goto_0
    if-eqz v6, :cond_7

    invoke-direct {p0, v6}, Lcom/tencent/map/b/f;->a(Ljava/lang/String;)V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    iget-object v1, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v1, v1, Lcom/tencent/map/b/d$b;->b:I

    iget-object v2, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v2, v2, Lcom/tencent/map/b/d$b;->c:I

    iget-object v3, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v3, v3, Lcom/tencent/map/b/d$b;->d:I

    iget-object v4, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v4, v4, Lcom/tencent/map/b/d$b;->e:I

    iget-object v5, p0, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    invoke-virtual {v5}, Lcom/tencent/map/b/g$b;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/map/b/c;->a(IIIILjava/util/List;)V

    :cond_8
    iget-boolean v0, p0, Lcom/tencent/map/b/f;->p:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/f$b;->interrupt()V

    :cond_9
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    new-instance v0, Lcom/tencent/map/b/f$b;

    invoke-direct {v0, p0, p1}, Lcom/tencent/map/b/f$b;-><init>(Lcom/tencent/map/b/f;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    iget-object v0, p0, Lcom/tencent/map/b/f;->r:Lcom/tencent/map/b/f$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/f$b;->start()V

    :cond_a
    :goto_1
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 14

    :try_start_0
    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "location"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->a:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "latitude"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->b:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "longitude"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->c:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "altitude"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->d:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "accuracy"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->e:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget v1, p0, Lcom/tencent/map/b/f;->m:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/tencent/map/a/a/d;->x:Z

    const-string v0, "bearing"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, -0x64

    if-eqz v6, :cond_1

    const-string v0, ","

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const-string v0, ","

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    :cond_1
    iget-object v0, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget v8, v0, Lcom/tencent/map/b/d$b;->f:I

    :cond_2
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-wide v12, v1, Lcom/tencent/map/a/a/d;->e:D

    move v6, v7

    move v7, v8

    const/4 v1, 0x6

    if-lt v6, v1, :cond_3

    const-wide/high16 v1, 0x4044000000000000L    # 40.0

    goto/16 :goto_2

    :cond_3
    const/4 v1, 0x5

    if-ne v6, v1, :cond_4

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    goto/16 :goto_2

    :cond_4
    const/4 v1, 0x4

    if-ne v6, v1, :cond_5

    const-wide v1, 0x4051800000000000L    # 70.0

    goto/16 :goto_2

    :cond_5
    const/4 v1, 0x3

    if-ne v6, v1, :cond_6

    const-wide v1, 0x4056800000000000L    # 90.0

    goto :goto_2

    :cond_6
    const/4 v1, 0x2

    if-ne v6, v1, :cond_7

    const-wide v1, 0x405b800000000000L    # 110.0

    goto :goto_2

    :cond_7
    const/16 v1, -0x48

    if-lt v7, v1, :cond_8

    if-nez v6, :cond_8

    const-wide v1, 0x3fdccccccccccccdL    # 0.45

    mul-double/2addr v1, v12

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double/2addr v1, v3

    double-to-int v1, v1

    mul-int/lit8 v6, v1, 0xa

    goto :goto_1

    :cond_8
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    cmpg-double v1, v12, v1

    if-gtz v1, :cond_9

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    sub-double v1, v12, v1

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double/2addr v1, v3

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    double-to-int v1, v1

    mul-int/lit8 v6, v1, 0xa

    goto :goto_1

    :cond_9
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    cmpl-double v1, v12, v1

    if-lez v1, :cond_a

    const-wide/high16 v1, 0x4089000000000000L    # 800.0

    cmpg-double v1, v12, v1

    if-gtz v1, :cond_a

    const-wide v1, 0x3feb333333333333L    # 0.85

    mul-double/2addr v1, v12

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double/2addr v1, v3

    double-to-int v1, v1

    mul-int/lit8 v6, v1, 0xa

    goto :goto_1

    :cond_a
    const-wide v1, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v1, v12

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    div-double/2addr v1, v3

    double-to-int v1, v1

    mul-int/lit8 v6, v1, 0xa

    :goto_1
    int-to-double v1, v6

    :goto_2
    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->e:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_b

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_c

    :cond_b
    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    const-string v0, "details"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "subnation"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "name"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/d;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "town"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "village"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "street"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "street_no"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x3

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->h:I

    :cond_c
    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_d

    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    const-string v0, "details"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "poilist"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-static {v6}, Lcom/tencent/map/b/f;->a(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->w:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x4

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    :cond_d
    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_10

    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    const-string v0, "details"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v0, "stat"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v0, "subnation"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v5, :cond_e

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "name"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/d;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "town"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "village"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->n:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "street"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->o:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "street_no"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->p:Ljava/lang/String;

    goto :goto_3

    :cond_e
    const/4 v0, 0x1

    if-ne v5, v0, :cond_f

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "nation"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "admin_level_1"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->q:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "admin_level_2"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "admin_level_3"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->s:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "locality"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "sublocality"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->u:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const-string v1, "route"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/map/a/a/d;->v:Ljava/lang/String;

    :cond_f
    :goto_3
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iput v5, v0, Lcom/tencent/map/a/a/d;->h:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x7

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    :cond_10
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    new-instance v0, Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-direct {v0, v1}, Lcom/tencent/map/a/a/d;-><init>(Lcom/tencent/map/a/a/d;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_11
    goto :goto_4

    :catch_0
    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, -0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x2

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    :goto_4
    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_13

    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_13

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-nez v0, :cond_13

    :cond_12
    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(Lcom/tencent/map/a/a/d;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/map/b/f;->v:J

    :cond_13
    return-void
.end method

.method static synthetic a(Lcom/tencent/map/b/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/tencent/map/b/f;->p:Z

    return p1
.end method

.method static synthetic a(Z)Z
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/map/b/f;->t:Z

    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/g;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    return-object v0
.end method

.method static synthetic b(Lcom/tencent/map/b/f;I)V
    .locals 2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    iput v0, p0, Lcom/tencent/map/b/f;->g:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget v1, p0, Lcom/tencent/map/b/f;->g:I

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(I)V

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/tencent/map/b/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tencent/map/b/f;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Z)V
    .locals 5

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    invoke-virtual {v0}, Lcom/tencent/map/b/e$b;->b()Landroid/location/Location;

    move-result-object v4

    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->b:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->c:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getAltitude()D

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->d:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->e:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getSpeed()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->f:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v4}, Landroid/location/Location;->getBearing()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/tencent/map/b/i;->a(DI)D

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/map/a/a/d;->g:D

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->a:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/tencent/map/a/a/d;->x:Z

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    :goto_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x0

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    new-instance v0, Lcom/tencent/map/a/a/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-direct {v0, v1}, Lcom/tencent/map/a/a/d;-><init>(Lcom/tencent/map/a/a/d;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/map/b/f;->v:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/tencent/map/b/f;->a:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(Lcom/tencent/map/a/a/d;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/map/b/f;->v:J

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/f;->E:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/tencent/map/b/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/map/b/f;->d()V

    return-void
.end method

.method static synthetic c()Z
    .locals 1

    sget-boolean v0, Lcom/tencent/map/b/f;->t:Z

    return v0
.end method

.method static synthetic d(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/f$c;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    return-object v0
.end method

.method static synthetic d(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/f;->F:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/tencent/map/b/f;->s:Lcom/tencent/map/b/f$a;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/tencent/map/b/f$a;

    iget-object v1, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    iget-object v2, p0, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    iget-object v3, p0, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/tencent/map/b/f$a;-><init>(Lcom/tencent/map/b/f;Lcom/tencent/map/b/e$b;Lcom/tencent/map/b/d$b;Lcom/tencent/map/b/g$b;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->s:Lcom/tencent/map/b/f$a;

    iget-object v0, p0, Lcom/tencent/map/b/f;->s:Lcom/tencent/map/b/f$a;

    invoke-virtual {v0}, Lcom/tencent/map/b/f$a;->start()V

    return-void
.end method

.method static synthetic e(Lcom/tencent/map/b/f;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/f;->B:I

    return v0
.end method

.method static synthetic e(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/f;->G:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 2

    new-instance v0, Lcom/tencent/map/a/a/d;

    invoke-direct {v0}, Lcom/tencent/map/a/a/d;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/f;->B:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->y:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, -0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->z:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v1, 0x1

    iput v1, v0, Lcom/tencent/map/a/a/d;->a:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/tencent/map/b/f;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v1, p0, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    invoke-virtual {v0, v1}, Lcom/tencent/map/a/a/b;->a(Lcom/tencent/map/a/a/d;)V

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/e$b;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    return-object v0
.end method

.method static synthetic f(Lcom/tencent/map/b/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/f;->I:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/tencent/map/b/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/map/b/f;->e()V

    return-void
.end method

.method static synthetic h(Lcom/tencent/map/b/f;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/f;->D:I

    return v0
.end method

.method static synthetic i(Lcom/tencent/map/b/f;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/f;->m:I

    return v0
.end method

.method static synthetic j(Lcom/tencent/map/b/f;)V
    .locals 0

    return-void
.end method

.method static synthetic k(Lcom/tencent/map/b/f;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic l(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->E:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->F:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->G:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/tencent/map/b/f;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/f;->g:I

    return v0
.end method

.method static synthetic p(Lcom/tencent/map/b/f;)Lcom/tencent/map/b/d;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->d:Lcom/tencent/map/b/d;

    return-object v0
.end method

.method static synthetic q(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->H:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/tencent/map/b/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/tencent/map/b/f;->K:Z

    return v0
.end method

.method static synthetic s(Lcom/tencent/map/b/f;)I
    .locals 1

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    return v0
.end method

.method static synthetic t(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->I:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic u(Lcom/tencent/map/b/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/f;->J:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(DD)V
    .locals 5

    iget-object v2, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/tencent/map/b/f$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    new-instance v4, Landroid/location/Location;

    const-string v0, "Deflect"

    invoke-direct {v4, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1, p2}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {v4, p3, p4}, Landroid/location/Location;->setLongitude(D)V

    iput-object v4, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, v3}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final a(I)V
    .locals 4

    iget-object v3, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/map/b/f$c;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1
.end method

.method public final a(Lcom/tencent/map/b/d$b;)V
    .locals 3

    iget-object v2, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lcom/tencent/map/b/f$c;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final a(Lcom/tencent/map/b/e$b;)V
    .locals 3

    iget-object v2, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/tencent/map/b/f$c;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final a(Lcom/tencent/map/b/g$b;)V
    .locals 3

    iget-object v2, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lcom/tencent/map/b/f$c;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public final a(Landroid/content/Context;Lcom/tencent/map/a/a/b;)Z
    .locals 7

    iget-object v4, p0, Lcom/tencent/map/b/f;->n:[B

    monitor-enter v4

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->J:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/map/b/i;->a(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    monitor-exit v4

    const/4 v0, 0x0

    return v0

    :cond_2
    :try_start_1
    new-instance v0, Lcom/tencent/map/b/f$c;

    invoke-direct {v0, p0}, Lcom/tencent/map/b/f$c;-><init>(Lcom/tencent/map/b/f;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/map/b/f;->N:Landroid/os/Handler;

    iput-object p1, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    invoke-static {}, Lcom/tencent/map/b/l;->a()Lcom/tencent/map/b/l;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/map/b/l;->a(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "connectivity"

    :try_start_2
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Landroid/net/ConnectivityManager;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v0

    iput-boolean v0, p0, Lcom/tencent/map/b/f;->K:Z

    :cond_3
    iget-object v0, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/map/b/f;->P:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    nop

    :catch_0
    :try_start_3
    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    invoke-virtual {v0}, Lcom/tencent/map/a/a/b;->a()I

    move-result v0

    iput v0, p0, Lcom/tencent/map/b/f;->k:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    invoke-virtual {v0}, Lcom/tencent/map/a/a/b;->b()I

    move-result v0

    iput v0, p0, Lcom/tencent/map/b/f;->l:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    invoke-virtual {v0}, Lcom/tencent/map/a/a/b;->c()I

    move-result v0

    iput v0, p0, Lcom/tencent/map/b/f;->m:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/tencent/map/b/f;->v:J

    const/4 p1, 0x0

    iget v0, p0, Lcom/tencent/map/b/f;->l:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/map/b/f;->l:I

    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/f;->L:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/f;->D:I

    iget-object v0, p0, Lcom/tencent/map/b/f;->c:Lcom/tencent/map/b/e;

    iget-object v1, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    invoke-virtual {v0, p0, v1}, Lcom/tencent/map/b/e;->a(Lcom/tencent/map/b/e$c;Landroid/content/Context;)Z

    move-result p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->d:Lcom/tencent/map/b/d;

    iget-object v1, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p0}, Lcom/tencent/map/b/d;->a(Landroid/content/Context;Lcom/tencent/map/b/d$c;)Z

    move-result p2

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    iget-object v1, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/tencent/map/b/g;->a(Landroid/content/Context;Lcom/tencent/map/b/g$c;I)Z

    move-result v5

    invoke-static {}, Lcom/tencent/map/b/c;->a()Lcom/tencent/map/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    invoke-static {}, Lcom/tencent/map/b/b;->a()Lcom/tencent/map/b/b;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/map/b/f;->i:Lcom/tencent/map/b/b;

    move-object v6, p0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->w:Lcom/tencent/map/b/e$b;

    const/4 v0, 0x0

    iput-object v0, v6, Lcom/tencent/map/b/f;->x:Lcom/tencent/map/b/d$b;

    const/4 v0, 0x0

    iput-object v0, v6, Lcom/tencent/map/b/f;->y:Lcom/tencent/map/b/g$b;

    const/4 v0, 0x0

    iput-object v0, v6, Lcom/tencent/map/b/f;->z:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput-object v0, v6, Lcom/tencent/map/b/f;->A:Lcom/tencent/map/a/a/d;

    const/4 v0, 0x0

    iput v0, v6, Lcom/tencent/map/b/f;->B:I

    iget-object v0, v6, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    if-eqz v0, :cond_5

    iget-object v0, v6, Lcom/tencent/map/b/f;->h:Lcom/tencent/map/b/c;

    invoke-virtual {v0}, Lcom/tencent/map/b/c;->b()V

    :cond_5
    move-object v6, p0

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/map/b/f;->C:I

    if-eqz p1, :cond_6

    iget v0, p0, Lcom/tencent/map/b/f;->m:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_6

    monitor-exit v4

    const/4 v0, 0x1

    return v0

    :cond_6
    if-nez p2, :cond_7

    if-eqz v5, :cond_8

    :cond_7
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    :cond_8
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    iget-object v1, p0, Lcom/tencent/map/b/f;->n:[B

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/tencent/map/b/a;->a()Lcom/tencent/map/b/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/tencent/map/b/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/tencent/map/b/f;->J:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    const/4 v0, 0x1

    return v0

    :cond_0
    monitor-exit v1

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method

.method public final b()V
    .locals 4

    iget-object v2, p0, Lcom/tencent/map/b/f;->n:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/f;->j:Lcom/tencent/map/a/a/b;

    iget-object v0, p0, Lcom/tencent/map/b/f;->N:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/map/b/f;->O:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/tencent/map/b/f;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/map/b/f;->P:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/tencent/map/b/f;->c:Lcom/tencent/map/b/e;

    invoke-virtual {v0}, Lcom/tencent/map/b/e;->a()V

    iget-object v0, p0, Lcom/tencent/map/b/f;->d:Lcom/tencent/map/b/d;

    invoke-virtual {v0}, Lcom/tencent/map/b/d;->a()V

    iget-object v0, p0, Lcom/tencent/map/b/f;->e:Lcom/tencent/map/b/g;

    invoke-virtual {v0}, Lcom/tencent/map/b/g;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    nop

    :catch_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public final b(I)V
    .locals 4

    iget-object v3, p0, Lcom/tencent/map/b/f;->o:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/tencent/map/b/f$c;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lcom/tencent/map/b/f;->q:Lcom/tencent/map/b/f$c;

    invoke-virtual {v0, p1}, Lcom/tencent/map/b/f$c;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1
.end method
