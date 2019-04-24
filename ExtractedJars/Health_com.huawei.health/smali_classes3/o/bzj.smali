.class public Lo/bzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzq;


# static fields
.field private static volatile b:Lo/bzj;


# instance fields
.field private a:[I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private t:I

.field private u:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/16 v0, 0xa

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b173f:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b001f:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b002f:I

    const/4 v2, 0x2

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b003f:I

    const/4 v2, 0x3

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b004f:I

    const/4 v2, 0x4

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b005f:I

    const/4 v2, 0x5

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b006f:I

    const/4 v2, 0x6

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b007f:I

    const/4 v2, 0x7

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b008f:I

    const/16 v2, 0x8

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$raw;->sug_b009f:I

    const/16 v2, 0x9

    aput v1, v0, v2

    iput-object v0, p0, Lo/bzj;->a:[I

    .line 43
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_b168f:I

    iput v0, p0, Lo/bzj;->c:I

    .line 44
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_c007f:I

    iput v0, p0, Lo/bzj;->d:I

    .line 45
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_c009f:I

    iput v0, p0, Lo/bzj;->e:I

    .line 46
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_c006f:I

    iput v0, p0, Lo/bzj;->k:I

    .line 47
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_c003f:I

    iput v0, p0, Lo/bzj;->f:I

    .line 48
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_c010f:I

    iput v0, p0, Lo/bzj;->i:I

    .line 49
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_girl_dingdong:I

    iput v0, p0, Lo/bzj;->g:I

    .line 51
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e102f:I

    iput v0, p0, Lo/bzj;->h:I

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e036f:I

    iput v0, p0, Lo/bzj;->p:I

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e050f:I

    iput v0, p0, Lo/bzj;->l:I

    .line 54
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e049f:I

    iput v0, p0, Lo/bzj;->o:I

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e046f:I

    iput v0, p0, Lo/bzj;->n:I

    .line 56
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e047f:I

    iput v0, p0, Lo/bzj;->m:I

    .line 57
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e048f:I

    iput v0, p0, Lo/bzj;->u:I

    .line 58
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e101f:I

    iput v0, p0, Lo/bzj;->t:I

    .line 59
    sget v0, Lcom/huawei/health/suggestion/R$raw;->sug_e031f:I

    iput v0, p0, Lo/bzj;->q:I

    .line 17
    return-void
.end method

.method public static b()Lo/bzj;
    .locals 4

    .line 20
    sget-object v0, Lo/bzj;->b:Lo/bzj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 21
    const-class v2, Lo/bzj;

    monitor-enter v2

    .line 22
    :try_start_0
    sget-object v0, Lo/bzj;->b:Lo/bzj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 23
    new-instance v0, Lo/bzj;

    invoke-direct {v0}, Lo/bzj;-><init>()V

    sput-object v0, Lo/bzj;->b:Lo/bzj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 27
    :cond_1
    :goto_0
    sget-object v0, Lo/bzj;->b:Lo/bzj;

    return-object v0
.end method

.method private c(I)Ljava/lang/Integer;
    .locals 2

    .line 219
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 222
    :pswitch_0
    iget v0, p0, Lo/bzj;->l:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 223
    goto :goto_1

    .line 226
    :pswitch_1
    iget v0, p0, Lo/bzj;->o:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 227
    goto :goto_1

    .line 230
    :pswitch_2
    iget v0, p0, Lo/bzj;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 231
    goto :goto_1

    .line 234
    :pswitch_3
    iget v0, p0, Lo/bzj;->m:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 235
    goto :goto_1

    .line 238
    :pswitch_4
    iget v0, p0, Lo/bzj;->u:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 239
    goto :goto_1

    .line 242
    :goto_0
    const/4 v1, 0x0

    .line 245
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private e(F)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 191
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 192
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, p1

    float-to-int v3, v0

    .line 194
    div-int/lit8 v0, v3, 0x64

    rem-int/lit8 v4, v0, 0xa

    .line 195
    if-eqz v4, :cond_1

    .line 196
    const/4 v0, 0x1

    if-eq v4, v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/bzj;->a:[I

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    :cond_0
    iget v0, p0, Lo/bzj;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    :cond_1
    div-int/lit8 v0, v3, 0xa

    rem-int/lit8 v4, v0, 0xa

    .line 203
    if-nez v4, :cond_2

    const/16 v0, 0x64

    if-ge v3, v0, :cond_3

    .line 204
    :cond_2
    iget-object v0, p0, Lo/bzj;->a:[I

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_3
    rem-int/lit8 v4, v3, 0xa

    .line 208
    if-eqz v4, :cond_4

    .line 209
    iget v0, p0, Lo/bzj;->i:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    iget-object v0, p0, Lo/bzj;->a:[I

    aget v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    :cond_4
    return-object v2
.end method

.method private e(ILcom/huawei/health/suggestion/model/SportInfo;)[I
    .locals 11

    .line 124
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v2

    .line 125
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/SportInfo;->getPace()I

    move-result v3

    .line 126
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireDistance()F

    move-result v4

    .line 128
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 129
    iget v0, p0, Lo/bzj;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    iget v0, p0, Lo/bzj;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    invoke-direct {p0, v4}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    iget v0, p0, Lo/bzj;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    div-int/lit16 v0, v2, 0xe10

    rem-int/lit8 v6, v0, 0x64

    .line 138
    div-int/lit8 v0, v2, 0x3c

    rem-int/lit8 v7, v0, 0x3c

    .line 139
    rem-int/lit8 v8, v2, 0x3c

    .line 140
    iget v0, p0, Lo/bzj;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    if-eqz v6, :cond_0

    .line 142
    int-to-float v0, v6

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 143
    iget v0, p0, Lo/bzj;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_0
    if-nez v6, :cond_1

    if-eqz v7, :cond_2

    .line 147
    :cond_1
    int-to-float v0, v7

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 148
    iget v0, p0, Lo/bzj;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    :cond_2
    int-to-float v0, v8

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 152
    iget v0, p0, Lo/bzj;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    if-lez v3, :cond_6

    .line 156
    div-int/lit16 v0, v3, 0xe10

    rem-int/lit8 v6, v0, 0x64

    .line 157
    div-int/lit8 v0, v3, 0x3c

    rem-int/lit8 v7, v0, 0x3c

    .line 158
    rem-int/lit8 v8, v3, 0x3c

    .line 159
    iget v0, p0, Lo/bzj;->q:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    if-eqz v6, :cond_3

    .line 161
    int-to-float v0, v6

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 162
    iget v0, p0, Lo/bzj;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    :cond_3
    if-nez v6, :cond_4

    if-eqz v7, :cond_5

    .line 166
    :cond_4
    int-to-float v0, v7

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 167
    iget v0, p0, Lo/bzj;->k:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    :cond_5
    int-to-float v0, v8

    invoke-direct {p0, v0}, Lo/bzj;->e(F)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 171
    iget v0, p0, Lo/bzj;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    :cond_6
    invoke-direct {p0, p1}, Lo/bzj;->c(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    new-array v9, v0, [I

    .line 177
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_7

    .line 178
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v9, v10

    .line 177
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 181
    :cond_7
    return-object v9
.end method


# virtual methods
.method public b(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 251
    const/4 v2, 0x0

    .line 253
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 257
    :pswitch_0
    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 258
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/bzj;->c(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    .line 264
    :pswitch_1
    instance-of v0, p2, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 265
    move-object v0, p2

    check-cast v0, [Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, [Ljava/lang/Object;

    .line 266
    array-length v0, v3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 267
    const/4 v0, 0x0

    aget-object v0, v3, v0

    instance-of v0, v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    aget-object v0, v3, v0

    instance-of v0, v0, Lcom/huawei/health/suggestion/model/SportInfo;

    if-eqz v0, :cond_0

    .line 268
    const/4 v0, 0x0

    aget-object v0, v3, v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 269
    const/4 v0, 0x1

    aget-object v0, v3, v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/SportInfo;

    .line 270
    invoke-direct {p0, v4, v5}, Lo/bzj;->e(ILcom/huawei/health/suggestion/model/SportInfo;)[I

    move-result-object v2

    .line 273
    :cond_0
    goto :goto_0

    .line 285
    :pswitch_2
    iget v0, p0, Lo/bzj;->t:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 286
    .line 291
    :cond_1
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
