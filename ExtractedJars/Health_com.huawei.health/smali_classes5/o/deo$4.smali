.class Lo/deo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/deo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/deo;


# direct methods
.method constructor <init>(Lo/deo;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/deo$4;->a:Lo/deo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 104
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    if-eqz p2, :cond_1

    .line 105
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 106
    const-string v0, "HWExerciseAdviceManager"

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

    .line 107
    iget-object v0, p0, Lo/deo$4;->a:Lo/deo;

    invoke-static {v0}, Lo/deo;->c(Lo/deo;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 108
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 117
    :cond_0
    const/4 v0, 0x1

    aget-byte v0, v4, v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 119
    :sswitch_0
    iget-object v0, p0, Lo/deo$4;->a:Lo/deo;

    invoke-static {v0}, Lo/deo;->c(Lo/deo;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/deo$4;->a:Lo/deo;

    invoke-static {v1, v4}, Lo/deo;->b(Lo/deo;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 120
    goto :goto_0

    .line 122
    :sswitch_1
    iget-object v0, p0, Lo/deo$4;->a:Lo/deo;

    invoke-static {v0}, Lo/deo;->c(Lo/deo;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/deo$4;->a:Lo/deo;

    invoke-static {v1, v4}, Lo/deo;->c(Lo/deo;[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xd

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 123
    .line 128
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_0
        0xd -> :sswitch_1
    .end sparse-switch
.end method
