.class public Lo/buz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)I
    .locals 2

    .line 68
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v1

    div-int/2addr v0, v1

    return v0

    .line 71
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static a(Lo/bwa;I)V
    .locals 4

    .line 139
    invoke-virtual {p0}, Lo/bwa;->y()I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 140
    invoke-virtual {p0, p1}, Lo/bwa;->b(I)V

    .line 142
    invoke-static {p0}, Lo/buz;->b(Lo/bwa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6839\u636e\u5f53\u524d\u7b2c\u51e0\u79d2 \u64ad\u62a5\u6307\u5bfc\u8bed\u97f3-time: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->u()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {p0, v0}, Lo/buz;->d(Lo/bwa;Landroid/media/MediaPlayer;)V

    .line 145
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->n()Lo/bvz;

    .line 148
    :cond_0
    return-void
.end method

.method private static a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 2

    .line 77
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    invoke-static {p0, p1, p2}, Lo/buz;->c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->u()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-static {p0, v0}, Lo/buz;->d(Lo/bwa;Landroid/media/MediaPlayer;)V

    .line 83
    invoke-static {p0, p2}, Lo/buz;->b(Lo/bwa;I)V

    .line 85
    :goto_0
    return-void
.end method

.method public static b(Lo/bvu;ZF)V
    .locals 1

    .line 178
    if-eqz p1, :cond_0

    .line 179
    invoke-virtual {p0, p2}, Lo/bvu;->d(F)V

    goto :goto_0

    .line 181
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bvu;->d(F)V

    .line 183
    :goto_0
    return-void
.end method

.method private static b(Lo/bwa;I)V
    .locals 1

    .line 91
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->c()V

    .line 97
    return-void
.end method

.method public static b(Lo/bwa;Landroid/os/Handler;)V
    .locals 4

    .line 190
    invoke-virtual {p0}, Lo/bwa;->N()Lo/bvu;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    .line 191
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc1

    if-ne v0, v1, :cond_0

    .line 192
    invoke-virtual {p0}, Lo/bwa;->u()Lo/bwe;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwe;->b()Lo/bwt;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwt;->d()Lo/bwt;

    .line 193
    invoke-virtual {p0}, Lo/bwa;->D()Lo/bvu;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    goto/16 :goto_1

    .line 194
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbf

    if-ne v0, v1, :cond_3

    .line 195
    invoke-virtual {p0}, Lo/bwa;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo/bwa;->L()Z

    move-result v0

    if-nez v0, :cond_1

    .line 196
    invoke-virtual {p0}, Lo/bwa;->n()V

    .line 197
    invoke-virtual {p0}, Lo/bwa;->J()Lo/bvd;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvd;->a()Lo/bvv;

    .line 198
    invoke-virtual {p0}, Lo/bwa;->J()Lo/bvd;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvd;->c()Lo/bvv;

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0xfa0

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lo/bwa;->b(J)V

    .line 201
    const/16 v0, 0x99

    const-wide/16 v1, 0xfa0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 202
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->C()Z

    move-result v0

    if-nez v0, :cond_2

    .line 203
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/bwa;->b(J)V

    .line 204
    const/16 v0, 0x99

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 206
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->f()Lo/bvy;

    .line 207
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->b()Lo/bvx;

    .line 208
    invoke-virtual {p0}, Lo/bwa;->D()Lo/bvu;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    goto :goto_1

    .line 209
    :cond_3
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbe

    if-ne v0, v1, :cond_4

    .line 210
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->b()Lo/bvx;

    .line 211
    invoke-virtual {p0}, Lo/bwa;->D()Lo/bvu;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    goto :goto_1

    .line 213
    :cond_4
    invoke-virtual {p0}, Lo/bwa;->D()Lo/bvu;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvu;->l()Lo/bvz;

    .line 215
    :goto_1
    return-void
.end method

.method public static b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 2

    .line 231
    invoke-virtual {p0}, Lo/bwa;->F()Lo/bwi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 232
    invoke-virtual {p0}, Lo/bwa;->F()Lo/bwi;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lo/bwi;->a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 234
    :cond_0
    return-void
.end method

.method public static b(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 3

    .line 53
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    if-gt p2, v0, :cond_1

    .line 54
    const-string v0, "hotbody"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v0

    div-int/lit16 v2, v0, 0x3e8

    .line 56
    invoke-static {p0, v2}, Lo/buz;->a(Lo/bwa;I)V

    .line 57
    invoke-static {p0, p1, p2}, Lo/buz;->e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 59
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bwa$d;->d(I)V

    .line 60
    invoke-static {p0, p1}, Lo/bve;->c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-ne p2, v0, :cond_2

    invoke-virtual {p0}, Lo/bwa;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bwa$d;->d(I)V

    .line 64
    :cond_2
    :goto_0
    return-void
.end method

.method private static b(Lo/bwa;)Z
    .locals 3

    .line 152
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bvh;->u()Landroid/media/MediaPlayer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    invoke-virtual {p0}, Lo/bwa;->I()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->y()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->t()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 155
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Lo/bwa;I)I
    .locals 3

    .line 238
    invoke-virtual {p0}, Lo/bwa;->M()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 239
    invoke-virtual {p0}, Lo/bwa;->M()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result p1

    .line 241
    :cond_0
    iget v0, p0, Lo/bwa;->L:I

    sub-int v2, p1, v0

    .line 242
    iput p1, p0, Lo/bwa;->L:I

    .line 243
    return v2
.end method

.method public static c(Lo/bwa;Landroid/os/Handler;)V
    .locals 3

    .line 218
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v1

    invoke-virtual {v1}, Lo/bus;->u()Landroid/media/MediaPlayer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v1

    invoke-virtual {v1}, Lo/bvh;->u()Landroid/media/MediaPlayer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbf

    if-ne v0, v1, :cond_0

    .line 221
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->r()V

    .line 222
    const/16 v0, 0x99

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 223
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xbe

    if-ne v0, v1, :cond_1

    .line 225
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bvh;->r()V

    .line 228
    :cond_1
    :goto_0
    return-void
.end method

.method private static c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 4

    .line 102
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    add-int/lit8 v0, v0, -0x7

    if-ne p2, v0, :cond_1

    .line 103
    invoke-virtual {p0}, Lo/bwa;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    return-void

    .line 106
    :cond_0
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e \u5728\u575a\u63015\u79d2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->b()Lo/bvy;

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    add-int/lit8 v0, v0, -0x6

    if-ge p2, v0, :cond_2

    .line 109
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->e()V

    goto :goto_0

    .line 110
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    if-ne p2, v0, :cond_4

    .line 111
    invoke-virtual {p0}, Lo/bwa;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 112
    return-void

    .line 114
    :cond_3
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e\u5012\u8ba1\u65f65\u79d2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->a()V

    goto :goto_0

    .line 116
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    if-le p2, v0, :cond_5

    .line 117
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->n()Lo/bvz;

    .line 119
    :cond_5
    :goto_0
    return-void
.end method

.method private static d(Lo/bwa;Landroid/media/MediaPlayer;)V
    .locals 4

    .line 33
    if-nez p1, :cond_0

    .line 34
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "player == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    iget v1, p0, Lo/bwa;->I:F

    const/4 v2, 0x0

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 40
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bwa;->setTag(Ljava/lang/Object;)V

    .line 41
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u64ad\u653e\u6307\u5bfc\u8bed\u97f3\uff0c\u8282\u62cd\u6b63\u5728\u64ad\uff0c\u8282\u62cd\u8bed\u97f3\u58f0\u97f3\u51cf\u5c0f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    iget v1, p0, Lo/bwa;->I:F

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 45
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8282\u62cd\u8bed\u97f3\u58f0\u97f3\u6062\u590d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bwa;->setTag(Ljava/lang/Object;)V

    .line 49
    :cond_2
    :goto_0
    return-void
.end method

.method public static e(Lo/bwa;II)V
    .locals 3

    .line 160
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_pb_count:I

    if-ne p2, v0, :cond_0

    .line 162
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    int-to-float v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 163
    int-to-float v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iput v0, p0, Lo/bwa;->I:F

    .line 164
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    int-to-float v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 165
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bus;->e(I)Lo/bvy;

    goto :goto_0

    .line 166
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_pb_guide:I

    if-ne p2, v0, :cond_1

    .line 168
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    int-to-float v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bvh;->d(F)V

    .line 169
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    int-to-float v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bus;->d(F)V

    .line 170
    iget-object v0, p0, Lo/bwa;->G:Lo/bus;

    const-string v1, "E071"

    invoke-virtual {v0, v1}, Lo/bus;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->D()Lo/bvu;

    move-result-object v0

    int-to-float v1, p1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/bvu;->d(F)V

    .line 175
    :goto_0
    return-void
.end method

.method public static e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 5

    .line 123
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->e()I

    move-result v0

    if-ge v0, p2, :cond_0

    .line 124
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u62a5\u8282\u62cd : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ActionTrainTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-----currbeat:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v3

    invoke-virtual {v3}, Lo/bwa$d;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---motionInverval:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 126
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireInterval()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "----clipTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/bwa;->j()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " sec:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v3

    div-int/lit16 v3, v3, 0x3e8

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 125
    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-static {p0, p1, p2}, Lo/buz;->a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V

    .line 130
    :cond_0
    return-void
.end method

.method public static e(Lo/bwa;)Z
    .locals 2

    .line 186
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lo/bwa;->N()Lo/bvu;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)Z
    .locals 2

    .line 133
    const-string v0, "hotbody"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
