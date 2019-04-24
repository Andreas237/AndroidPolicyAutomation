.class Lo/dlf$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 337
    iput-object p1, p0, Lo/dlf$12;->a:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 4

    .line 345
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onChange, type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    .line 347
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lo/dlf$12;->a:Lo/dlf;

    invoke-static {v2}, Lo/dlf;->i(Lo/dlf;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 348
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange Weight execute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lo/dlf$12;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->m(Lo/dlf;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/dlf$12$2;

    invoke-direct {v1, p0}, Lo/dlf$12$2;-><init>(Lo/dlf$12;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 356
    :cond_0
    iget-object v0, p0, Lo/dlf$12;->a:Lo/dlf;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/dlf;->b(Lo/dlf;J)J

    .line 358
    :cond_1
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 340
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeWeightData, onResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    return-void
.end method
