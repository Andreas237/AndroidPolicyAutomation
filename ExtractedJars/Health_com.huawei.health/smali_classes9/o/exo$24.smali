.class Lo/exo$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->e(JLo/exn$d;Lo/exn$a;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/exn$d;

.field final synthetic c:Lo/exn$a;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/exn$a;Lo/egg;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/exo$24;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$24;->b:Lo/exn$d;

    iput-object p3, p0, Lo/exo$24;->c:Lo/exn$a;

    iput-object p4, p0, Lo/exo$24;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 313
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 314
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoreSleepDetail onResponse xxxx objData != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 317
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepDetail onResponse xxxx err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    :goto_0
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$24;->b:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 328
    :pswitch_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 329
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "porcessFitnessCoreSleepStatisticData xxxx"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 332
    iget-object v0, p0, Lo/exo$24;->e:Lo/exo;

    iget-object v1, p0, Lo/exo$24;->c:Lo/exn$a;

    iget-object v2, p0, Lo/exo$24;->a:Lo/egg;

    invoke-static {v0, v1, v2, p2}, Lo/exo;->d(Lo/exo;Lo/exn$a;Lo/egg;Ljava/lang/Object;)V

    goto :goto_1

    .line 334
    :cond_1
    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 335
    iget-object v0, p0, Lo/exo$24;->e:Lo/exo;

    iget-object v1, p0, Lo/exo$24;->c:Lo/exn$a;

    iget-object v2, p0, Lo/exo$24;->a:Lo/egg;

    invoke-static {v0, v1, v2, p2}, Lo/exo;->d(Lo/exo;Lo/exn$a;Lo/egg;Ljava/lang/Object;)V

    goto :goto_1

    .line 338
    :cond_2
    iget-object v0, p0, Lo/exo$24;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 339
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "call back xxxx"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lo/exo$24;->a:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_1

    .line 349
    :pswitch_1
    iget-object v0, p0, Lo/exo$24;->a:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 350
    iget-object v0, p0, Lo/exo$24;->a:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 356
    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
