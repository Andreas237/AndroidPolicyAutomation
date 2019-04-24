.class Lo/exp$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->d(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/exn$d;

.field final synthetic d:Lo/exp;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/exp;Lo/exn$d;Lo/egg;J)V
    .locals 0

    .line 2504
    iput-object p1, p0, Lo/exp$8;->d:Lo/exp;

    iput-object p2, p0, Lo/exp$8;->b:Lo/exn$d;

    iput-object p3, p0, Lo/exp$8;->a:Lo/egg;

    iput-wide p4, p0, Lo/exp$8;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 7

    .line 2507
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGetCoreSleepDetailData response back."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2509
    sget-object v0, Lo/exp$9;->a:[I

    iget-object v1, p0, Lo/exp$8;->b:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2511
    :pswitch_0
    iget-object v0, p0, Lo/exp$8;->d:Lo/exp;

    move v1, p1

    move-object v2, p2

    iget-object v3, p0, Lo/exp$8;->a:Lo/egg;

    iget-wide v4, p0, Lo/exp$8;->e:J

    iget-object v6, p0, Lo/exp$8;->b:Lo/exn$d;

    invoke-static/range {v0 .. v6}, Lo/exp;->e(Lo/exp;ILjava/lang/Object;Lo/egg;JLo/exn$d;)V

    .line 2512
    goto :goto_1

    .line 2515
    :pswitch_1
    iget-object v0, p0, Lo/exp$8;->d:Lo/exp;

    iget-object v1, p0, Lo/exp$8;->a:Lo/egg;

    invoke-static {v0, p1, p2, v1}, Lo/exp;->d(Lo/exp;ILjava/lang/Object;Lo/egg;)V

    .line 2516
    goto :goto_1

    .line 2518
    :pswitch_2
    iget-object v0, p0, Lo/exp$8;->d:Lo/exp;

    iget-object v1, p0, Lo/exp$8;->a:Lo/egg;

    invoke-static {v0, p1, p2, v1}, Lo/exp;->e(Lo/exp;ILjava/lang/Object;Lo/egg;)V

    .line 2519
    goto :goto_1

    .line 2521
    :goto_0
    iget-object v0, p0, Lo/exp$8;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2522
    iget-object v0, p0, Lo/exp$8;->a:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 2526
    :cond_0
    :goto_1
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepDetailHistogramData requestGetSleepDetailData 0001 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2527
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
