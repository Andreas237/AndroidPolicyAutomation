.class public Lo/crh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crh$c;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# instance fields
.field private a:Lo/cqy;

.field private c:Lo/crg;

.field private d:Lo/crq;

.field private e:Lo/crj;

.field private f:Lo/crw;

.field private g:Lo/crp;

.field private h:Lo/crk;

.field private i:Lo/cro;

.field private k:Lo/crs;

.field private m:Lo/cqz;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crh;->a:Lo/cqy;

    .line 53
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crh;->m:Lo/cqz;

    .line 54
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/crj;->c(Landroid/content/Context;)Lo/crj;

    move-result-object v0

    iput-object v0, p0, Lo/crh;->e:Lo/crj;

    .line 55
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/crg;->b(Landroid/content/Context;)Lo/crg;

    move-result-object v0

    iput-object v0, p0, Lo/crh;->c:Lo/crg;

    .line 56
    new-instance v0, Lo/crq;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->d:Lo/crq;

    .line 57
    new-instance v0, Lo/crk;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->h:Lo/crk;

    .line 58
    new-instance v0, Lo/cro;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cro;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->i:Lo/cro;

    .line 59
    new-instance v0, Lo/crw;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->f:Lo/crw;

    .line 60
    new-instance v0, Lo/crs;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crs;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->k:Lo/crs;

    .line 61
    new-instance v0, Lo/crp;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crh;->g:Lo/crp;

    .line 62
    return-void
.end method

.method synthetic constructor <init>(Lo/crh$4;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lo/crh;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/crh;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crh;->b:Landroid/content/Context;

    .line 74
    sget-object v0, Lo/crh$c;->a:Lo/crh;

    return-object v0
.end method

.method private declared-synchronized b(Ljava/util/List;Ljava/util/List;II)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Ljava/lang/Integer;>;II)Z"
        }
    .end annotation

    monitor-enter p0

    .line 147
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    .line 151
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 152
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 153
    const/4 v12, 0x0

    .line 154
    invoke-static {v7}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v13

    .line 155
    sget-object v0, Lo/crh$4;->c:[I

    invoke-virtual {v13}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 158
    :sswitch_0
    const/16 v0, 0x7e3

    if-lt v7, v0, :cond_1

    const/16 v0, 0x7e6

    if-gt v0, v7, :cond_2

    const/16 v0, 0x7f1

    if-lt v0, v7, :cond_2

    .line 160
    :cond_1
    iget-object v0, p0, Lo/crh;->d:Lo/crq;

    move-object v1, p1

    move-wide v2, v8

    move-wide v4, v10

    move-object/from16 v6, p2

    invoke-virtual/range {v0 .. v6}, Lo/crq;->a(Ljava/util/List;JJLjava/util/List;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v12

    goto :goto_1

    .line 164
    :goto_0
    const/4 v12, 0x0

    .line 168
    :cond_2
    :goto_1
    monitor-exit p0

    return v12

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c(Ljava/util/List;ILjava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;ILjava/lang/String;)V"
        }
    .end annotation

    .line 299
    const/16 v0, 0x20

    if-eq p2, v0, :cond_0

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/16 v0, 0x1e

    if-ne p2, v0, :cond_1

    .line 301
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doExerciseIntensitySync do not need exercise intensity sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    return-void

    .line 304
    :cond_1
    const/4 v4, 0x0

    .line 305
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 306
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/crh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    .line 307
    :cond_2
    goto :goto_0

    .line 308
    :cond_3
    if-eqz v4, :cond_4

    .line 309
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    const/16 v1, 0x8

    invoke-static {v0, v1, p3}, Lo/cnt;->e(Landroid/content/Context;ILjava/lang/String;)V

    .line 311
    :cond_4
    return-void
.end method

.method private c(ILcom/huawei/hihealth/HiHealthData;Ljava/util/List;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiHealthData;Ljava/util/List<Ljava/lang/Integer;>;I)Z"
        }
    .end annotation

    .line 237
    const/16 v0, 0x5208

    if-gt p4, v0, :cond_0

    .line 238
    iget-object v0, p0, Lo/crh;->i:Lo/cro;

    invoke-virtual {v0, p2, p1, p3}, Lo/cro;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v1

    goto :goto_0

    .line 239
    :cond_0
    const/16 v0, 0x5653

    if-gt p4, v0, :cond_1

    .line 240
    iget-object v0, p0, Lo/crh;->f:Lo/crw;

    invoke-virtual {v0, p2, p1, p3}, Lo/crw;->a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v1

    goto :goto_0

    .line 242
    :cond_1
    iget-object v0, p0, Lo/crh;->h:Lo/crk;

    invoke-virtual {v0, p2, p1, p3}, Lo/crk;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v1

    .line 244
    :goto_0
    return v1
.end method

.method private c(Ljava/util/List;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Z"
        }
    .end annotation

    .line 139
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p2, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;I)Z"
        }
    .end annotation

    .line 217
    const/4 v2, 0x0

    .line 218
    const/16 v0, 0x7d0

    if-ge p4, v0, :cond_1

    .line 219
    const/16 v0, 0x385

    if-ne p4, v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/crh;->k:Lo/crs;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/crs;->b(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v2

    goto :goto_0

    .line 222
    :cond_0
    iget-object v0, p0, Lo/crh;->k:Lo/crs;

    invoke-virtual {v0, p1, p2, p3}, Lo/crs;->c(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v2

    goto :goto_0

    .line 224
    :cond_1
    const/16 v0, 0x7e3

    if-lt p4, v0, :cond_3

    const/16 v0, 0x7e6

    if-gt v0, p4, :cond_2

    const/16 v0, 0x7f1

    if-ge v0, p4, :cond_3

    :cond_2
    const/16 v0, 0x802

    if-ge v0, p4, :cond_4

    const/16 v0, 0x834

    if-le v0, p4, :cond_4

    .line 226
    :cond_3
    iget-object v0, p0, Lo/crh;->d:Lo/crq;

    invoke-virtual {v0, p1, p2, p3}, Lo/crq;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v2

    goto :goto_0

    .line 227
    :cond_4
    const/16 v0, 0x802

    if-ge p4, v0, :cond_5

    .line 228
    iget-object v0, p0, Lo/crh;->g:Lo/crp;

    invoke-virtual {v0, p1, p2, p3}, Lo/crp;->a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v2

    goto :goto_0

    .line 229
    :cond_5
    const/16 v0, 0x835

    if-ne p4, v0, :cond_6

    .line 230
    iget-object v0, p0, Lo/crh;->d:Lo/crq;

    invoke-virtual {v0, p1, p2, p3}, Lo/crq;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v2

    .line 232
    :cond_6
    :goto_0
    return v2
.end method

.method private declared-synchronized d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;II)Z"
        }
    .end annotation

    monitor-enter p0

    .line 179
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v6

    .line 180
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v7

    .line 182
    sget-object v0, Lo/crh$4;->c:[I

    invoke-virtual {v7}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 185
    :pswitch_0
    invoke-direct {p0, p2, p1, p3, v6}, Lo/crh;->c(ILcom/huawei/hihealth/HiHealthData;Ljava/util/List;I)Z

    move-result v8

    .line 186
    goto :goto_1

    .line 188
    :pswitch_1
    invoke-direct {p0, p1, p2, p3, v6}, Lo/crh;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;I)Z

    move-result v8

    .line 189
    goto :goto_1

    .line 191
    :pswitch_2
    iget-object v0, p0, Lo/crh;->e:Lo/crj;

    invoke-virtual {v0, p1, p2, p3}, Lo/crj;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v8

    .line 192
    goto :goto_1

    .line 194
    :pswitch_3
    iget-object v0, p0, Lo/crh;->e:Lo/crj;

    move v1, v6

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    iget-object v5, p0, Lo/crh;->d:Lo/crq;

    invoke-virtual/range {v0 .. v5}, Lo/crj;->a(ILcom/huawei/hihealth/HiHealthData;ILjava/util/List;Lo/crq;)Z

    move-result v8

    .line 195
    goto :goto_1

    .line 198
    :pswitch_4
    const/4 v8, 0x1

    .line 199
    goto :goto_1

    .line 201
    :pswitch_5
    iget-object v0, p0, Lo/crh;->e:Lo/crj;

    invoke-virtual {v0, p1, p5, p4}, Lo/crj;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v8

    .line 202
    goto :goto_1

    .line 204
    :pswitch_6
    iget-object v0, p0, Lo/crh;->c:Lo/crg;

    invoke-virtual {v0, p1, p2, p3}, Lo/crg;->a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v8

    .line 205
    goto :goto_1

    .line 207
    :pswitch_7
    iget-object v0, p0, Lo/crh;->c:Lo/crg;

    invoke-virtual {v0, p1, p5, p4}, Lo/crg;->e(Lcom/huawei/hihealth/HiHealthData;II)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    .line 208
    goto :goto_1

    .line 210
    :goto_0
    const/4 v8, 0x0

    .line 213
    :goto_1
    monitor-exit p0

    return v8

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(I)Z
    .locals 1

    .line 314
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 315
    :cond_0
    const/16 v0, 0x4e21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x5653

    if-ge p1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 135
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7d2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Ljava/util/List;II)I
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)I"
        }
    .end annotation

    .line 251
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 253
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x385

    if-ne v1, v0, :cond_0

    .line 254
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->m:Lo/cqz;

    sget-object v1, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v1}, Lo/cnw;->a(Landroid/content/Context;)Lo/cnw;

    move-result-object v1

    invoke-virtual {v1}, Lo/cnw;->p()I

    move-result v1

    .line 255
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getOwnerID()I

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v3

    .line 254
    invoke-virtual {v0, v1, v2, v3}, Lo/cqz;->a(IILjava/lang/String;)Lo/crd;

    move-result-object v7

    goto :goto_0

    .line 257
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->m:Lo/cqz;

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getOwnerID()I

    move-result v1

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v0, v3, v1, v2}, Lo/cqz;->a(IILjava/lang/String;)Lo/crd;

    move-result-object v7

    .line 259
    :goto_0
    if-nez v7, :cond_1

    .line 260
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHealthDetailData fail hiHealthContext = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/16 v0, 0xa

    return v0

    .line 263
    :cond_1
    invoke-virtual {v7}, Lo/crd;->f()I

    move-result v8

    .line 264
    invoke-virtual {v7}, Lo/crd;->c()I

    move-result v9

    .line 265
    invoke-virtual {v7}, Lo/crd;->a()I

    move-result v10

    .line 266
    const/4 v11, 0x0

    .line 267
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/cqa;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v12

    .line 268
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    .line 269
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v11

    .line 271
    :cond_2
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHealthDetailData() deviceID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",clientID="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",id="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",deviceType="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->a:Lo/cqy;

    invoke-virtual {v0, v8}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v13

    .line 273
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 274
    :cond_3
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHealthDetailData() fail null == clients ||clients.isEmpty ()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    const/16 v0, 0xa

    return v0

    .line 277
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->m:Lo/cqz;

    move/from16 v1, p3

    move/from16 v2, p2

    invoke-static {v0, v1, v2, v8, v9}, Lo/cqz;->d(Lo/cqz;IIII)I

    move-result v14

    .line 278
    const/4 v15, 0x0

    .line 280
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->e:Lo/crj;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/crj;->c(Ljava/util/List;)V

    .line 281
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/hihealth/HiHealthData;

    .line 282
    move-object/from16 v0, v18

    invoke-virtual {v0, v8}, Lcom/huawei/hihealth/HiHealthData;->setUserID(I)V

    .line 283
    move-object/from16 v0, v18

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setAppID(I)V

    .line 284
    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Lcom/huawei/hihealth/HiHealthData;->setDeviceID(I)V

    .line 285
    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 286
    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move v2, v10

    move-object v3, v13

    move v4, v8

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lo/crh;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z

    move-result v16

    .line 287
    if-nez v16, :cond_5

    .line 288
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveHealthDetailData() saveOneDetailData fail hiHealthData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",type = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    const/4 v15, 0x4

    .line 291
    :cond_5
    goto :goto_1

    .line 292
    :cond_6
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/crd;->f(I)V

    .line 293
    if-nez v15, :cond_7

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v11, v0}, Lo/crh;->c(Ljava/util/List;ILjava/lang/String;)V

    .line 294
    :cond_7
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/cpw;->c(Lo/crd;)J

    .line 295
    return v15
.end method

.method public b(Ljava/util/List;I)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)I"
        }
    .end annotation

    .line 78
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lo/crh;->c(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBackgroudSyncHealthDetailData datas is null or who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, 0x7

    return v0

    .line 82
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBackgroudSyncHealthDetailData() datas size is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 84
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crh;->a:Lo/cqy;

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v8

    .line 85
    invoke-static {v8}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBackgroudSyncHealthDetailData() null == clients ||clients.isEmpty ()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/16 v0, 0xa

    return v0

    .line 89
    :cond_1
    const/4 v9, 0x0

    .line 93
    :try_start_0
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 94
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/crh;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 95
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 96
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 98
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 99
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7d2

    if-ne v0, v1, :cond_2

    .line 100
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 102
    :cond_2
    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :goto_1
    goto :goto_0

    .line 105
    :cond_3
    move-object/from16 v0, p0

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v11, v8, v1, v2}, Lo/crh;->c(Ljava/util/List;Ljava/util/List;II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 106
    const/4 v9, 0x4

    .line 108
    :cond_4
    move-object/from16 v0, p0

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v12, v8, v1, v2}, Lo/crh;->c(Ljava/util/List;Ljava/util/List;II)Z

    move-result v0

    if-nez v0, :cond_5

    .line 109
    const/4 v9, 0x4

    .line 111
    :cond_5
    goto :goto_3

    .line 112
    :cond_6
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 114
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v10

    .line 115
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 116
    move-object/from16 v0, p0

    move-object v1, v12

    move v2, v10

    move-object v3, v8

    move/from16 v4, p2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/crh;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_7

    .line 117
    const/4 v9, 0x4

    .line 119
    :cond_7
    goto :goto_2

    .line 128
    :cond_8
    :goto_3
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 129
    goto :goto_4

    .line 122
    :catch_0
    move-exception v10

    .line 124
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBackgroudSyncHealthDetailData e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    const/16 v9, 0xb

    .line 128
    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 129
    goto :goto_4

    .line 128
    :catchall_0
    move-exception v15

    sget-object v0, Lo/crh;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 129
    throw v15

    .line 130
    :goto_4
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBackgroudSyncHealthDetailData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    return v9
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;II)Z"
        }
    .end annotation

    .line 175
    invoke-direct/range {p0 .. p5}, Lo/crh;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z

    move-result v0

    return v0
.end method

.method public c(Ljava/util/List;Ljava/util/List;II)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Ljava/lang/Integer;>;II)Z"
        }
    .end annotation

    .line 143
    invoke-direct {p0, p1, p2, p3, p4}, Lo/crh;->b(Ljava/util/List;Ljava/util/List;II)Z

    move-result v0

    return v0
.end method
