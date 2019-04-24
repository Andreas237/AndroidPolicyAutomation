.class Lo/exo$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->b(Lo/exn$a;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exo;

.field final synthetic d:Lo/exn$a;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$a;Lo/egg;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lo/exo$13;->b:Lo/exo;

    iput-object p2, p0, Lo/exo$13;->d:Lo/exn$a;

    iput-object p3, p0, Lo/exo$13;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 187
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTodaySleepTotalData onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v4, 0x0

    .line 189
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    if-eqz v0, :cond_0

    .line 190
    move-object v5, p2

    check-cast v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 191
    sget-object v0, Lo/exo$25;->b:[I

    iget-object v1, p0, Lo/exo$13;->d:Lo/exn$a;

    invoke-virtual {v1}, Lo/exn$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 193
    :pswitch_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v4

    .line 194
    iget-object v0, p0, Lo/exo$13;->b:Lo/exo;

    invoke-static {v0, v4}, Lo/exo;->b(Lo/exo;I)I

    .line 195
    goto :goto_0

    .line 197
    :pswitch_1
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v4

    .line 198
    iget-object v0, p0, Lo/exo$13;->b:Lo/exo;

    invoke-static {v0, v4}, Lo/exo;->e(Lo/exo;I)I

    .line 199
    goto :goto_0

    .line 201
    :pswitch_2
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v4

    .line 202
    iget-object v0, p0, Lo/exo$13;->b:Lo/exo;

    invoke-static {v0, v4}, Lo/exo;->c(Lo/exo;I)I

    .line 203
    goto :goto_0

    .line 205
    :pswitch_3
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupDuration()I

    move-result v4

    .line 206
    iget-object v0, p0, Lo/exo$13;->b:Lo/exo;

    invoke-static {v0, v4}, Lo/exo;->a(Lo/exo;I)I

    .line 207
    .line 212
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTodaySleepTotalData onResponse sleepDataID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$13;->d:Lo/exn$a;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ,  mTotalSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$13;->b:Lo/exo;

    .line 213
    invoke-static {v3}, Lo/exo;->c(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ,  mDeepSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$13;->b:Lo/exo;

    .line 214
    invoke-static {v3}, Lo/exo;->a(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ,  mShallowSleepTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$13;->b:Lo/exo;

    .line 215
    invoke-static {v3}, Lo/exo;->e(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ,  mWakeupTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$13;->b:Lo/exo;

    .line 216
    invoke-static {v3}, Lo/exo;->b(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 212
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    :cond_0
    iget-object v0, p0, Lo/exo$13;->e:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 220
    iget-object v0, p0, Lo/exo$13;->e:Lo/egg;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 222
    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
