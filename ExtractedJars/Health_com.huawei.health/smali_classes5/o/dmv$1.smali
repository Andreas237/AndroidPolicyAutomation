.class Lo/dmv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmv;->b(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/dmv;


# direct methods
.method constructor <init>(Lo/dmv;I)V
    .locals 0

    .line 638
    iput-object p1, p0, Lo/dmv$1;->d:Lo/dmv;

    iput p2, p0, Lo/dmv$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 641
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 642
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 644
    :cond_0
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 645
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "breatheOpen()===="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dmv$1;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    iget-object v0, p0, Lo/dmv$1;->d:Lo/dmv;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dmv;->e(Lo/dmv;Z)Z

    .line 647
    iget-object v0, p0, Lo/dmv$1;->d:Lo/dmv;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/dmv;->b(Lo/dmv;J)J

    .line 648
    iget-object v0, p0, Lo/dmv$1;->d:Lo/dmv;

    invoke-static {v0}, Lo/dmv;->i(Lo/dmv;)Lo/flc;

    move-result-object v0

    iget-object v1, p0, Lo/dmv$1;->d:Lo/dmv;

    invoke-static {v1}, Lo/dmv;->d(Lo/dmv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/flc;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 650
    :cond_1
    sget-object v0, Lo/dmv;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is not right!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    :goto_0
    return-void
.end method
