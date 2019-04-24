.class public Lo/cgt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Z

.field private b:Lo/cex;

.field private c:Lo/cew;

.field private d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private e:[Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgt;->b:Lo/cex;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgt;->c:Lo/cew;

    .line 35
    const/4 v0, 0x4

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/cgt;->e:[Z

    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->a:Z

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->h:Z

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->f:Z

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->g:Z

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->i:Z

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->k:Z

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->m:Z

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->l:Z

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->o:Z

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->n:Z

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method private C()Z
    .locals 1

    .line 306
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(J)J
    .locals 8

    .line 295
    const-wide/16 v0, 0x1388

    rem-long v4, p1, v0

    .line 296
    const-wide/16 v0, 0x1388

    div-long v6, p1, v0

    .line 298
    const-wide/16 v0, 0x9c4

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 299
    const-wide/16 v0, 0x1

    add-long/2addr v0, v6

    const-wide/16 v2, 0x5

    mul-long/2addr v0, v2

    return-wide v0

    .line 301
    :cond_0
    const-wide/16 v0, 0x5

    mul-long/2addr v0, v6

    return-wide v0
.end method

.method private j()Z
    .locals 4

    .line 230
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    const/4 v0, 0x1

    return v0

    .line 233
    :cond_0
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 234
    const/4 v0, 0x1

    return v0

    .line 235
    :cond_1
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 236
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->c(Ljava/util/List;)I

    move-result v2

    .line 237
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v3

    .line 239
    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    if-le v3, v2, :cond_3

    .line 240
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 245
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private v()Z
    .locals 2

    .line 192
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    const/4 v0, 0x1

    return v0

    .line 196
    :cond_0
    invoke-virtual {p0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/cgt;->a(I)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 197
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private w()Z
    .locals 4

    .line 201
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    const/4 v0, 0x1

    return v0

    .line 205
    :cond_0
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_1

    .line 206
    const/4 v0, 0x1

    return v0

    .line 208
    :cond_1
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->n()Z

    move-result v0

    if-nez v0, :cond_2

    .line 209
    const/4 v0, 0x1

    return v0

    .line 210
    :cond_2
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 211
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lo/cgt$4;

    invoke-direct {v1, p0}, Lo/cgt$4;-><init>(Lo/cgt;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-static {v0}, Lo/cgm;->a(Lo/cfd;)I

    move-result v2

    .line 218
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgStepRate()I

    move-result v3

    .line 220
    if-eqz v2, :cond_3

    const/16 v0, 0x12c

    if-gt v2, v0, :cond_3

    if-eqz v3, :cond_3

    if-le v3, v2, :cond_4

    .line 221
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 223
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 226
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method private y()Z
    .locals 2

    .line 180
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    const/4 v0, 0x1

    return v0

    .line 183
    :cond_0
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestHasTrackPoint()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 184
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 186
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(I)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 83
    const/16 v0, 0x108

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 85
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->localePaceMap()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 86
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->localePaceMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->localePaceMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 90
    :cond_0
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 93
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public a()Lo/cex;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    return-object v0
.end method

.method public b()Lo/cew;
    .locals 1

    .line 78
    iget-object v0, p0, Lo/cgt;->c:Lo/cew;

    return-object v0
.end method

.method public b(Lo/cex;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/cgt;->b:Lo/cex;

    .line 67
    return-void
.end method

.method public b(I)Z
    .locals 2

    .line 102
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 104
    :pswitch_0
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    return v0

    .line 106
    :pswitch_1
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    return v0

    .line 108
    :pswitch_2
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x2

    aget-boolean v0, v0, v1

    return v0

    .line 110
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 116
    invoke-direct {p0}, Lo/cgt;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-boolean v1, v0, v2

    .line 119
    :cond_0
    invoke-direct {p0}, Lo/cgt;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/cgt;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x1

    const/4 v2, 0x1

    aput-boolean v1, v0, v2

    .line 122
    :cond_1
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 123
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->y()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->h:Z

    goto :goto_0

    .line 125
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgt;->h:Z

    .line 128
    :goto_0
    invoke-direct {p0}, Lo/cgt;->j()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->f:Z

    .line 129
    invoke-direct {p0}, Lo/cgt;->w()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->g:Z

    .line 130
    invoke-virtual {p0}, Lo/cgt;->i()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->i:Z

    .line 131
    invoke-virtual {p0}, Lo/cgt;->f()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->k:Z

    .line 133
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 134
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->m:Z

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->l:Z

    .line 136
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->o:Z

    goto :goto_5

    .line 139
    :cond_3
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x109

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 140
    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x117

    if-ne v0, v1, :cond_5

    .line 141
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgt;->o:Z

    goto :goto_2

    .line 143
    :cond_5
    iget-boolean v0, p0, Lo/cgt;->h:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lo/cgt;->s()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/cgt;->o:Z

    .line 146
    :goto_2
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->w()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 v0, 0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/cgt;->m:Z

    .line 147
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->z()Z

    move-result v0

    if-nez v0, :cond_9

    const/4 v0, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lo/cgt;->l:Z

    .line 150
    :goto_5
    invoke-virtual {p0}, Lo/cgt;->g()Z

    move-result v0

    iput-boolean v0, p0, Lo/cgt;->n:Z

    .line 154
    iget-boolean v0, p0, Lo/cgt;->i:Z

    iget-boolean v1, p0, Lo/cgt;->f:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->g:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->k:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->l:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->m:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->o:Z

    and-int/2addr v0, v1

    iget-boolean v1, p0, Lo/cgt;->n:Z

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    .line 156
    iget-object v0, p0, Lo/cgt;->e:[Z

    const/4 v1, 0x1

    const/4 v2, 0x2

    aput-boolean v1, v0, v2

    .line 159
    :cond_a
    const-string v0, "Track_TrackDetailDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hideRadioView() hideRadioList is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cgt;->e:[Z

    invoke-static {v2}, Ljava/util/Arrays;->toString([Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_b

    .line 162
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    iget-object v1, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-static {v0, v1}, Lo/cdp;->b(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lo/cew;

    move-result-object v0

    iput-object v0, p0, Lo/cgt;->c:Lo/cew;

    .line 165
    :cond_b
    return-void
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 64
    return-void
.end method

.method public d(Ljava/util/Map;)[Ljava/lang/Float;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)[Ljava/lang/Float;"
        }
    .end annotation

    .line 397
    if-eqz p1, :cond_1

    .line 398
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 399
    const/4 v0, 0x0

    return-object v0

    .line 401
    :cond_0
    invoke-static {p1}, Lo/cdl;->c(Ljava/util/Map;)[Ljava/lang/Float;

    move-result-object v2

    .line 402
    return-object v2

    .line 405
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()I
    .locals 3

    .line 168
    const/4 v1, 0x0

    .line 169
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/cgt;->e:[Z

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 170
    iget-object v0, p0, Lo/cgt;->e:[Z

    aget-boolean v0, v0, v2

    if-nez v0, :cond_0

    .line 171
    move v1, v2

    .line 172
    goto :goto_1

    .line 169
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 175
    :cond_1
    :goto_1
    return v1
.end method

.method public f()Z
    .locals 1

    .line 266
    iget-boolean v0, p0, Lo/cgt;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/cgt;->s()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Z
    .locals 10

    .line 272
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    const/4 v0, 0x1

    return v0

    .line 275
    :cond_0
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 276
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 278
    :cond_2
    const-wide/16 v4, 0x0

    .line 279
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 280
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cvv;

    .line 281
    if-eqz v7, :cond_4

    .line 282
    invoke-virtual {v7}, Lo/cvv;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/cgt;->d(J)J

    move-result-wide v8

    .line 283
    invoke-direct {p0, v4, v5}, Lo/cgt;->d(J)J

    move-result-wide v0

    cmp-long v0, v8, v0

    if-gez v0, :cond_3

    .line 284
    const-string v0, "Track_TrackDetailDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hideRunningPostureView time is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const/4 v0, 0x1

    return v0

    .line 287
    :cond_3
    move-wide v4, v8

    .line 279
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 291
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public h()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 391
    invoke-virtual {p0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/cgt;->a(I)Ljava/util/Map;

    move-result-object v1

    .line 392
    invoke-static {v1}, Lo/cdl;->e(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 393
    return-object v1
.end method

.method public i()Z
    .locals 2

    .line 249
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    const/4 v0, 0x1

    return v0

    .line 252
    :cond_0
    iget-object v0, p0, Lo/cgt;->b:Lo/cex;

    invoke-virtual {v0}, Lo/cex;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 253
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_1
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 258
    const/4 v0, 0x1

    return v0

    .line 260
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public k()I
    .locals 2

    .line 322
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v1

    .line 323
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 328
    :pswitch_0
    const/16 v0, 0xc7

    return v0

    .line 334
    :pswitch_1
    const/4 v0, 0x0

    return v0

    .line 358
    :pswitch_2
    const/4 v0, 0x4

    return v0

    .line 376
    :pswitch_3
    const/4 v0, 0x5

    return v0

    .line 382
    :pswitch_4
    const/4 v0, 0x6

    return v0

    .line 385
    :goto_0
    :pswitch_5
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method public l()Z
    .locals 1

    .line 428
    iget-boolean v0, p0, Lo/cgt;->f:Z

    return v0
.end method

.method public m()Z
    .locals 2

    .line 418
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    const/4 v0, 0x0

    return v0

    .line 421
    :cond_0
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmDuplicated()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 422
    const/4 v0, 0x1

    return v0

    .line 424
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 1

    .line 408
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    const/4 v0, 0x0

    return v0

    .line 411
    :cond_0
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v0

    if-eqz v0, :cond_1

    .line 412
    const/4 v0, 0x1

    return v0

    .line 414
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 1

    .line 436
    iget-boolean v0, p0, Lo/cgt;->i:Z

    return v0
.end method

.method public p()Z
    .locals 1

    .line 432
    iget-boolean v0, p0, Lo/cgt;->g:Z

    return v0
.end method

.method public q()Z
    .locals 1

    .line 475
    iget-boolean v0, p0, Lo/cgt;->m:Z

    return v0
.end method

.method public r()Z
    .locals 1

    .line 479
    iget-boolean v0, p0, Lo/cgt;->l:Z

    return v0
.end method

.method public s()Z
    .locals 1

    .line 444
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    const/4 v0, 0x1

    return v0

    .line 447
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public t()Z
    .locals 1

    .line 455
    invoke-direct {p0}, Lo/cgt;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 456
    const/4 v0, 0x1

    return v0

    .line 459
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBritishSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 461
    const/4 v0, 0x0

    return v0

    .line 464
    :cond_1
    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwimSegments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cgt;->d:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSwimSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 465
    const/4 v0, 0x0

    return v0

    .line 470
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public u()Z
    .locals 1

    .line 440
    iget-boolean v0, p0, Lo/cgt;->k:Z

    return v0
.end method

.method public x()Z
    .locals 1

    .line 483
    iget-boolean v0, p0, Lo/cgt;->o:Z

    return v0
.end method

.method public z()Z
    .locals 1

    .line 487
    iget-boolean v0, p0, Lo/cgt;->n:Z

    return v0
.end method
