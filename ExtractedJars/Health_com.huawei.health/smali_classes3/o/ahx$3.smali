.class Lo/ahx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahx;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/huawei/hihealth/HiHealthData;

.field final synthetic d:Lo/ahx;


# direct methods
.method constructor <init>(Lo/ahx;Lcom/huawei/hihealth/HiHealthData;I)V
    .locals 0

    .line 252
    iput-object p1, p0, Lo/ahx$3;->d:Lo/ahx;

    iput-object p2, p0, Lo/ahx$3;->c:Lcom/huawei/hihealth/HiHealthData;

    iput p3, p0, Lo/ahx$3;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 5

    .line 255
    if-eqz p1, :cond_0

    .line 256
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSingleData success start time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahx$3;->c:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 258
    :cond_0
    const-string v0, "SaveClaimWeightDataTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSingleData fail start time:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahx$3;->c:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    :goto_0
    iget v0, p0, Lo/ahx$3;->b:I

    iget-object v1, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v1}, Lo/ahx;->c(Lo/ahx;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 261
    iget-object v0, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->e(Lo/ahx;)Lo/ahx$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahx$c;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 262
    const/16 v0, 0x9

    iput v0, v4, Landroid/os/Message;->what:I

    .line 263
    iget v0, p0, Lo/ahx$3;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 264
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 265
    goto :goto_1

    .line 266
    :cond_1
    iget-object v0, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->e(Lo/ahx;)Lo/ahx$c;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lo/ahx$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 269
    :goto_1
    iget-object v0, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->b(Lo/ahx;)Lo/abz;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->c(Lo/ahx;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lo/ahx$3;->b:I

    iget-object v1, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v1}, Lo/ahx;->c(Lo/ahx;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 270
    iget-object v0, p0, Lo/ahx$3;->d:Lo/ahx;

    invoke-static {v0}, Lo/ahx;->b(Lo/ahx;)Lo/abz;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/abz;->a(Z)V

    .line 272
    :cond_2
    return-void
.end method
