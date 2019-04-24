.class Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bwi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 5

    .line 265
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u52a8\u4f5c\u5207\u6362\u4e86\uff0c\u5f53\u524d\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J

    .line 267
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;JJ)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 274
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 4

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 290
    const-string v0, "CoachActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u9884\u5907\u5f00\u59cb\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3, p2}, Lo/dge;->d(Ljava/lang/String;Ljava/lang/String;II)V

    .line 293
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 5

    .line 297
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J

    .line 299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 300
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMotionPause mPlayStartTime != 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;JJ)V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 304
    :cond_0
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMotionPause\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_1

    .line 306
    const-string v0, "CoachActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6682\u505c\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3, p2}, Lo/dge;->d(Ljava/lang/String;Ljava/lang/String;II)V

    .line 309
    :cond_1
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 4

    .line 278
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J

    .line 279
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMotionStart\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 281
    const-string v0, "CoachActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f00\u59cb\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lo/dge;->d(Ljava/lang/String;Ljava/lang/String;II)V

    .line 285
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;II)V
    .locals 4

    .line 324
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6267\u884c\u5b8c\u4e00\u7ec4\u52a8\u4f5c\uff0c\u4e00\u5171\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    return-void
.end method

.method public e()V
    .locals 1

    .line 350
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 351
    return-void
.end method

.method public e(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 4

    .line 313
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J

    .line 315
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMotionContinue\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 317
    const-string v0, "CoachActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7ee7\u7eed\u52a8\u4f5c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3, p2}, Lo/dge;->d(Ljava/lang/String;Ljava/lang/String;II)V

    .line 320
    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 338
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8bad\u7ec3\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    if-nez p1, :cond_1

    .line 340
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->finish()V

    .line 343
    :cond_0
    return-void

    .line 345
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 346
    return-void
.end method

.method public k(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 4

    .line 329
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onMotionOver\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;

    move-result-object v0

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 331
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u52a8\u4f5c\u8bad\u7ec3\u7ed3\u675f\uff0c\u5f53\u524d\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3, p2}, Lo/dge;->d(Ljava/lang/String;Ljava/lang/String;II)V

    .line 334
    :cond_0
    return-void
.end method
