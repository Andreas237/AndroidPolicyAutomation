.class Lo/cbv$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lo/cbv;

.field private e:J


# direct methods
.method constructor <init>(Lo/cbv;)V
    .locals 4

    .line 199
    iput-object p1, p0, Lo/cbv$b;->c:Lo/cbv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    iput-wide v0, p0, Lo/cbv$b;->e:J

    .line 202
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long v4, v0, v2

    .line 208
    iget-wide v0, p0, Lo/cbv$b;->e:J

    cmp-long v0, v0, v4

    if-eqz v0, :cond_1

    .line 211
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Time Changed old "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cbv$b;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " new "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lo/cbv$b;->c:Lo/cbv;

    iget-object v0, v0, Lo/cbv;->b:Lo/ccs;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lo/cbv$b;->c:Lo/cbv;

    iget-object v0, v0, Lo/cbv;->b:Lo/ccs;

    invoke-interface {v0}, Lo/ccs;->ao()F

    move-result v6

    .line 215
    iget-object v0, p0, Lo/cbv$b;->c:Lo/cbv;

    iget-object v0, v0, Lo/cbv;->b:Lo/ccs;

    invoke-interface {v0}, Lo/ccs;->ar()F

    move-result v7

    .line 216
    iget-object v0, p0, Lo/cbv$b;->c:Lo/cbv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v6, v7, v1, v2}, Lo/cbv;->a(FFJ)V

    .line 217
    goto :goto_0

    .line 218
    :cond_0
    const-string v0, "Track_TrackPointDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdater is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    :goto_0
    iput-wide v4, p0, Lo/cbv$b;->e:J

    .line 222
    :cond_1
    return-void
.end method
