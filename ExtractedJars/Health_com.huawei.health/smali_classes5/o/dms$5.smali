.class Lo/dms$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dms;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dms;


# direct methods
.method constructor <init>(Lo/dms;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lo/dms$5;->d:Lo/dms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 271
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 272
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 273
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStressDataCallBack receive data : "

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

    .line 275
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 277
    :pswitch_0
    iget-object v0, p0, Lo/dms$5;->d:Lo/dms;

    invoke-static {v0, v4}, Lo/dms;->b(Lo/dms;[B)V

    .line 278
    goto :goto_0

    .line 280
    :pswitch_1
    iget-object v0, p0, Lo/dms$5;->d:Lo/dms;

    invoke-static {v0, v4}, Lo/dms;->c(Lo/dms;[B)V

    .line 281
    goto :goto_0

    .line 283
    :pswitch_2
    iget-object v0, p0, Lo/dms$5;->d:Lo/dms;

    invoke-static {v0, v4}, Lo/dms;->e(Lo/dms;[B)V

    .line 284
    goto :goto_0

    .line 286
    :pswitch_3
    iget-object v0, p0, Lo/dms$5;->d:Lo/dms;

    invoke-static {v0, v4}, Lo/dms;->d(Lo/dms;[B)V

    .line 287
    .line 292
    :goto_0
    goto :goto_1

    .line 293
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse receive stress data error_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", obj = null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
