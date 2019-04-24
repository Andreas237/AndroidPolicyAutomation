.class Lo/enw$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw;->a(Lo/dbb;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/enw;

.field final synthetic c:J

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/dbb;


# direct methods
.method constructor <init>(Lo/enw;Lo/dbb;Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJ)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/enw$5;->b:Lo/enw;

    iput-object p2, p0, Lo/enw$5;->e:Lo/dbb;

    iput-object p3, p0, Lo/enw$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-wide p4, p0, Lo/enw$5;->c:J

    iput-wide p6, p0, Lo/enw$5;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 141
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceListFromWear onResponse err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lo/enw$5;->e:Lo/dbb;

    iget-object v1, p0, Lo/enw$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x64

    invoke-virtual {v0, v2, v1}, Lo/dbb;->removeMessages(ILjava/lang/Object;)V

    .line 143
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/enw$5;->c:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    iget-wide v2, p0, Lo/enw$5;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 144
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceListFromWear outtime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lo/enw$5;->c:J

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lo/enw$5;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 149
    return-void
.end method
