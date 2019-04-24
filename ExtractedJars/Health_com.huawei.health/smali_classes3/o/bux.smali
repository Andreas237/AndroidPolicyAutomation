.class public Lo/bux;
.super Lo/cah;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cah<Lo/bwa;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/bwa;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/cah;-><init>(Ljava/lang/Object;)V

    .line 34
    return-void
.end method

.method private a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 3

    .line 162
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 163
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/bwi;->b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 166
    :cond_0
    invoke-virtual {p1}, Lo/bwa;->b()V

    .line 168
    iget-object v0, p1, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->e()Lo/bvx;

    .line 170
    invoke-virtual {p1, p2}, Lo/bwa;->a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 171
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->c()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->a(I)V

    .line 173
    iget-object v0, p1, Lo/bwa;->l:Lo/bus;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/bus;->a(I)V

    .line 175
    return-void
.end method

.method private b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 7

    .line 179
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbf

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 180
    const/16 v0, 0xbf

    iput v0, p1, Lo/bwa;->u:I

    .line 186
    iget-wide v0, p1, Lo/bwa;->K:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-wide v2, p1, Lo/bwa;->j:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    iput v0, p1, Lo/bwa;->H:I

    .line 188
    iget-object v0, p1, Lo/bwa;->k:Lo/efy;

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "mm:ss"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-wide v2, p1, Lo/bwa;->A:J

    iget v4, p1, Lo/bwa;->H:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 189
    invoke-static {p1, p2}, Lo/buz;->a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)I

    move-result v6

    .line 190
    invoke-static {p1, p2, v6}, Lo/buz;->b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 191
    invoke-direct {p0, p1, p2}, Lo/bux;->d(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 192
    return-void
.end method

.method private c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 3

    .line 116
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    iget v1, p2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->a(I)V

    .line 117
    invoke-virtual {p1}, Lo/bwa;->f()V

    .line 119
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->b(I)V

    .line 120
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 121
    invoke-direct {p0, p1}, Lo/bux;->d(Lo/bwa;)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-direct {p0, p1}, Lo/bux;->e(Lo/bwa;)V

    .line 125
    :goto_0
    return-void
.end method

.method private d(Lo/bwa;)V
    .locals 6

    .line 128
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4f11\u606f\u65f6\u95f4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v4, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v4}, Lo/bwa$d;->d()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGap()I

    move-result v0

    if-lez v0, :cond_1

    .line 130
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 131
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/bwi;->b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 133
    :cond_0
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to resting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    invoke-virtual {p1}, Lo/bwa;->b()V

    .line 137
    iget-object v0, p1, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->e()Lo/bvx;

    goto :goto_0

    .line 139
    :cond_1
    invoke-virtual {p1}, Lo/bwa;->p()V

    .line 140
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 141
    iget-object v0, p1, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 143
    :cond_2
    iget-object v0, p1, Lo/bwa;->F:Lo/bvh;

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v2, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v2}, Lo/bwa$d;->d()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0, v1}, Lo/bvh;->c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    .line 147
    :goto_0
    invoke-virtual {p1}, Lo/bwa;->h()V

    .line 148
    iget-object v0, p1, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->n()Lo/bvz;

    .line 149
    return-void
.end method

.method private d(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 3

    .line 196
    invoke-static {p1, p2}, Lo/buz;->e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-wide v0, p1, Lo/bwa;->h:J

    const/16 v2, 0x99

    invoke-virtual {p0, v2, v0, v1}, Lo/bux;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 199
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bux;->h(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 201
    :goto_0
    return-void
.end method

.method private e(Lo/bwa;)V
    .locals 4

    .line 152
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bad\u7ec3\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p1, Lo/bwa;->F:Lo/bvh;

    invoke-virtual {v0}, Lo/bvh;->g()Lo/bvx;

    .line 155
    iget-object v0, p1, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->k()Lo/bvz;

    .line 156
    iget-object v0, p1, Lo/bwa;->o:Lo/bvu;

    invoke-virtual {v0}, Lo/bvu;->k()Lo/bvz;

    .line 157
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    iget-object v1, p1, Lo/bwa;->n:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->b(I)V

    .line 158
    return-void
.end method

.method private e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 4

    .line 99
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bad\u7ec3\u52a8\u4f5c\u5b8c\u6210\u4e00\u7ec4\u6216\u6574\u4e2a:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 102
    const/16 v0, 0xbe

    iput v0, p1, Lo/bwa;->u:I

    .line 104
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget v1, p2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    if-ne v0, v1, :cond_0

    .line 106
    invoke-direct {p0, p1, p2}, Lo/bux;->c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    goto :goto_0

    .line 109
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/bux;->a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 111
    :goto_0
    return-void
.end method

.method private g(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 4

    .line 219
    invoke-virtual {p1}, Lo/bwa;->o()V

    .line 220
    const-wide/16 v0, 0x0

    iput-wide v0, p1, Lo/bwa;->K:J

    .line 221
    const-string v0, "CoachHandler"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "321go\u7ed3\u675f \u5f00\u59cb\u6267\u884c\u8bad\u7ec3\u52a8\u4f5c,\u89c6\u9891\u91cd\u64ad \u52a8\u4f5c\u540d\u5b57:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\u52a8\u4f5c\u89c6\u9891\u957f\u5ea6: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p1, Lo/bwa;->c:Lo/bvu;

    invoke-virtual {v2}, Lo/bvu;->q()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "----motion \u8282\u62cd\u64ad\u653e\u65f6\u95f4\u95f4\u9694:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, 0xbf

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 224
    const/16 v0, 0xbf

    iput v0, p1, Lo/bwa;->u:I

    .line 225
    iget-boolean v0, p1, Lo/bwa;->y:Z

    if-nez v0, :cond_0

    .line 226
    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lo/buz;->e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 227
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->e()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwa$d;->d(I)V

    .line 236
    :cond_0
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/bwa;->a(I)V

    .line 239
    iget-boolean v0, p1, Lo/bwa;->z:Z

    if-nez v0, :cond_1

    .line 240
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lo/bwa;->j:J

    .line 241
    const/16 v0, 0x99

    invoke-virtual {p0, v0}, Lo/bux;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 242
    :cond_1
    iget-boolean v0, p1, Lo/bwa;->y:Z

    if-nez v0, :cond_2

    .line 243
    invoke-virtual {p1}, Lo/bwa;->n()V

    .line 244
    iget-object v0, p1, Lo/bwa;->m:Lo/bvd;

    invoke-virtual {v0}, Lo/bvd;->c()Lo/bvv;

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0xfa0

    add-long/2addr v0, v2

    iput-wide v0, p1, Lo/bwa;->j:J

    .line 246
    const/16 v0, 0x99

    const-wide/16 v1, 0xfa0

    invoke-virtual {p0, v0, v1, v2}, Lo/bux;->sendEmptyMessageDelayed(IJ)Z

    .line 248
    :cond_2
    :goto_0
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 249
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, p2, v1}, Lo/bwi;->d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 251
    :cond_3
    return-void
.end method

.method private h(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 4

    .line 204
    const-string v0, "CoachHandler"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mActionTrainTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/bwa;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " acquireDuration:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget v0, p1, Lo/bwa;->H:I

    int-to-float v0, v0

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    .line 206
    iget-boolean v0, p1, Lo/bwa;->z:Z

    if-nez v0, :cond_0

    .line 207
    iget-wide v0, p1, Lo/bwa;->h:J

    const/16 v2, 0x99

    invoke-virtual {p0, v2, v0, v1}, Lo/bux;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 208
    :cond_0
    iget v0, p1, Lo/bwa;->H:I

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v2

    mul-int/2addr v1, v2

    if-lt v0, v1, :cond_2

    .line 209
    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lo/bux;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 212
    :cond_1
    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lo/bux;->sendEmptyMessage(I)Z

    .line 214
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/bwa;

    invoke-virtual {p0, v0, p2}, Lo/bux;->d(Lo/bwa;Landroid/os/Message;)V

    return-void
.end method

.method public d(Lo/bwa;Landroid/os/Message;)V
    .locals 5

    .line 38
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x67

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    .line 39
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaWhat.AUDIO_FINISH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 41
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaWhat.AUDIO_FINISH onTrainOver(false)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bwi;->e(Z)V

    .line 46
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, -0x64

    if-ne v0, v1, :cond_2

    .line 47
    :cond_1
    return-void

    .line 50
    :cond_2
    iget-object v0, p1, Lo/bwa;->n:Ljava/util/List;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 51
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_3

    .line 52
    invoke-virtual {p1}, Lo/bwa;->c()V

    .line 53
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bwa;->a(IZ)V

    .line 54
    invoke-direct {p0, p1, v4}, Lo/bux;->g(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    goto/16 :goto_0

    .line 55
    :cond_3
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x99

    if-ne v0, v1, :cond_4

    .line 56
    invoke-direct {p0, p1, v4}, Lo/bux;->b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 57
    iget-object v0, p1, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwr;->setIsShowBottomProgress(Z)V

    goto/16 :goto_0

    .line 58
    :cond_4
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_5

    .line 59
    invoke-direct {p0, p1, v4}, Lo/bux;->e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 60
    iget-object v0, p1, Lo/bwa;->t:Lo/bwr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwr;->setIsShowBottomProgress(Z)V

    goto/16 :goto_0

    .line 61
    :cond_5
    iget v0, p2, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 62
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/bwa;->a(IZ)V

    .line 63
    const/4 v0, 0x3

    invoke-static {p1, v0}, Lo/bve;->b(Lo/bwa;I)V

    goto/16 :goto_0

    .line 64
    :cond_6
    iget v0, p2, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 65
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/bwa;->a(IZ)V

    .line 66
    const/4 v0, 0x2

    invoke-static {p1, v0}, Lo/bve;->b(Lo/bwa;I)V

    goto/16 :goto_0

    .line 67
    :cond_7
    iget v0, p2, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 68
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lo/bwa;->a(IZ)V

    .line 69
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/bve;->b(Lo/bwa;I)V

    goto/16 :goto_0

    .line 70
    :cond_8
    iget v0, p2, Landroid/os/Message;->what:I

    if-nez v0, :cond_9

    .line 71
    new-instance v0, Lo/bux$1;

    invoke-direct {v0, p0, p1}, Lo/bux$1;-><init>(Lo/bux;Lo/bwa;)V

    const-wide/16 v1, 0x1ed

    invoke-virtual {p0, v0, v1, v2}, Lo/bux;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 78
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaWhat._321GO_0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-static {p1, v4}, Lo/bve;->a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    .line 80
    iget-object v0, p1, Lo/bwa;->t:Lo/bwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwr;->setVisibility(I)V

    goto :goto_0

    .line 81
    :cond_9
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x68

    if-ne v0, v1, :cond_b

    .line 82
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaWhat.FINISH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p1, Lo/bwa;->E:Z

    .line 85
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/bwi;->e(Z)V

    .line 86
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v4, v1}, Lo/bwi;->k(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 88
    :cond_a
    iget-object v0, p1, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, -0x64

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    goto :goto_0

    .line 89
    :cond_b
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x9a

    if-ne v0, v1, :cond_c

    .line 90
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MediaWhat.MOTION_NAME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 92
    iget-object v0, p1, Lo/bwa;->q:Lo/bwi;

    iget-object v1, p1, Lo/bwa;->p:Lo/bwa$d;

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v4, v1}, Lo/bwi;->b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 95
    :cond_c
    :goto_0
    return-void
.end method
