.class Lo/div$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/div;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/div;


# direct methods
.method constructor <init>(Lo/div;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lo/div$1;->a:Lo/div;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 275
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    if-eqz p2, :cond_0

    .line 277
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 278
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse recv bt data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 281
    :pswitch_0
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->a(Lo/div;[B)V

    .line 282
    goto/16 :goto_1

    .line 284
    :pswitch_1
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->d(Lo/div;[B)V

    .line 285
    goto :goto_1

    .line 287
    :pswitch_2
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->e(Lo/div;[B)V

    .line 288
    goto :goto_1

    .line 290
    :pswitch_3
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->b(Lo/div;[B)V

    .line 291
    goto :goto_1

    .line 293
    :pswitch_4
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->c(Lo/div;[B)V

    .line 294
    goto :goto_1

    .line 296
    :pswitch_5
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->g(Lo/div;[B)V

    .line 297
    goto :goto_1

    .line 299
    :pswitch_6
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    const/4 v1, 0x7

    invoke-static {v0, v4, v1}, Lo/div;->d(Lo/div;[BI)V

    .line 300
    goto :goto_1

    .line 302
    :pswitch_7
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    const/16 v1, 0x8

    invoke-static {v0, v4, v1}, Lo/div;->d(Lo/div;[BI)V

    .line 303
    goto :goto_1

    .line 305
    :pswitch_8
    iget-object v0, p0, Lo/div$1;->a:Lo/div;

    invoke-static {v0, v4}, Lo/div;->i(Lo/div;[B)V

    .line 306
    goto :goto_1

    .line 308
    :goto_0
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unknow command id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v3, v4, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    :cond_0
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
