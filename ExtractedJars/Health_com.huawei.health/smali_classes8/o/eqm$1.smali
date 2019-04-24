.class Lo/eqm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqm;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eqm;


# direct methods
.method constructor <init>(Lo/eqm;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 154
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 155
    :cond_0
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateData no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->e(Lo/eqm;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 158
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show empty view!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->e(Lo/eqm;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 160
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->e(Lo/eqm;)Lo/epx;

    move-result-object v0

    iget-object v1, p0, Lo/eqm$1;->c:Lo/eqm;

    iget-object v1, v1, Lo/eqm;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_heart_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->b(Lo/eqm;)Lo/eqm$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqm$e;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 163
    const/4 v0, 0x4

    iput v0, v5, Landroid/os/Message;->what:I

    .line 164
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->e(Lo/eqm;)Lo/epx;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    invoke-static {v0}, Lo/eqm;->b(Lo/eqm;)Lo/eqm$e;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eqm$e;->sendMessage(Landroid/os/Message;)Z

    .line 166
    goto :goto_0

    .line 168
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 169
    iget-object v0, p0, Lo/eqm$1;->c:Lo/eqm;

    const-string v1, "heart_rate_last"

    invoke-virtual {v5, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/eqm;->a(Lo/eqm;DJ)V

    .line 170
    const-string v0, "FunctionSetHeartRateReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show data view: data"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "heart_rate_last"

    invoke-virtual {v5, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :cond_2
    :goto_0
    return-void
.end method
