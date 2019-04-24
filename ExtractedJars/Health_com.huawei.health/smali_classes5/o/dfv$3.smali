.class Lo/dfv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dfv;


# direct methods
.method constructor <init>(Lo/dfv;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 403
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 405
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 406
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse recv bt data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 409
    :pswitch_0
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 410
    goto/16 :goto_0

    .line 412
    :pswitch_1
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/16 v1, 0x2712

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 413
    goto/16 :goto_0

    .line 415
    :pswitch_2
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->a(Lo/dfv;[B)V

    .line 416
    goto/16 :goto_0

    .line 418
    :pswitch_3
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->b(Lo/dfv;[B)V

    .line 419
    goto :goto_0

    .line 421
    :pswitch_4
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/4 v1, 0x7

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 422
    goto :goto_0

    .line 424
    :pswitch_5
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/16 v1, 0x2712

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 425
    goto :goto_0

    .line 427
    :pswitch_6
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->d(Lo/dfv;[B)V

    .line 428
    goto :goto_0

    .line 430
    :pswitch_7
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->e(Lo/dfv;[B)V

    .line 431
    goto :goto_0

    .line 433
    :pswitch_8
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->c(Lo/dfv;[B)V

    .line 434
    goto :goto_0

    .line 436
    :pswitch_9
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->i(Lo/dfv;[B)V

    .line 437
    goto :goto_0

    .line 439
    :pswitch_a
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/16 v1, 0xe

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 440
    goto :goto_0

    .line 442
    :pswitch_b
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->k(Lo/dfv;[B)V

    .line 443
    goto :goto_0

    .line 445
    :pswitch_c
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    const/16 v1, 0x10

    invoke-static {v0, v4, v1}, Lo/dfv;->d(Lo/dfv;[BI)V

    .line 446
    goto :goto_0

    .line 448
    :pswitch_d
    iget-object v0, p0, Lo/dfv$3;->c:Lo/dfv;

    invoke-static {v0, v4}, Lo/dfv;->g(Lo/dfv;[B)V

    .line 449
    .line 453
    :goto_0
    :pswitch_e
    goto :goto_1

    .line 454
    :cond_0
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse recv bt data ret="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_e
        :pswitch_e
        :pswitch_3
        :pswitch_4
        :pswitch_e
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method
