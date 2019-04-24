.class Lo/dge$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dge;


# direct methods
.method constructor <init>(Lo/dge;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 264
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_2

    .line 265
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 266
    const-string v0, "HWFitnessPostureManager"

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

    .line 267
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 268
    const-string v0, "HWFitnessPostureManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-void

    .line 271
    :cond_0
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_1

    .line 272
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->a(Lo/dge;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x7f

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 273
    return-void

    .line 276
    :cond_1
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 278
    :pswitch_0
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->d(Lo/dge;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 279
    goto/16 :goto_0

    .line 281
    :pswitch_1
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->e(Lo/dge;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 282
    goto/16 :goto_0

    .line 284
    :pswitch_2
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->c(Lo/dge;[B)Lo/dgm;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 285
    goto/16 :goto_0

    .line 287
    :pswitch_3
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->b(Lo/dge;[B)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x5

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 288
    goto/16 :goto_0

    .line 290
    :pswitch_4
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->i(Lo/dge;[B)Lo/dgi;

    move-result-object v1

    const/4 v2, 0x6

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 291
    goto :goto_0

    .line 293
    :pswitch_5
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->k(Lo/dge;[B)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x7

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 294
    goto :goto_0

    .line 296
    :pswitch_6
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->g(Lo/dge;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 297
    goto :goto_0

    .line 299
    :pswitch_7
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->f(Lo/dge;[B)Lo/dgl;

    move-result-object v1

    const/16 v2, 0xa

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 300
    goto :goto_0

    .line 302
    :pswitch_8
    iget-object v0, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v0}, Lo/dge;->a(Lo/dge;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dge$5;->d:Lo/dge;

    invoke-static {v1, v4}, Lo/dge;->h(Lo/dge;[B)Lo/dgj;

    move-result-object v1

    const/16 v2, 0xb

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 303
    .line 308
    :cond_2
    :goto_0
    :pswitch_9
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_9
        :pswitch_9
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_1
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
