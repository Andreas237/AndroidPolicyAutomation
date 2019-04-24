.class Lo/eqh$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqh;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eqh;


# direct methods
.method constructor <init>(Lo/eqh;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 143
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResult called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 145
    :cond_0
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBloodPressureData no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->b(Lo/eqh;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 147
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->b(Lo/eqh;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 148
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->b(Lo/eqh;)Lo/epx;

    move-result-object v0

    iget-object v1, p0, Lo/eqh$1;->b:Lo/eqh;

    iget-object v1, v1, Lo/eqh;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_bloodpressure_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->e(Lo/eqh;)Lo/eqh$e;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqh$e;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 151
    const/4 v0, 0x5

    iput v0, v7, Landroid/os/Message;->what:I

    .line 152
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->b(Lo/eqh;)Lo/epx;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 153
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    invoke-static {v0}, Lo/eqh;->e(Lo/eqh;)Lo/eqh$e;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eqh$e;->sendMessage(Landroid/os/Message;)Z

    .line 154
    goto :goto_0

    .line 156
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 157
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 158
    const-string v0, "bloodpressure_diastolic"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 159
    const-string v0, "bloodpressure_systolic"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 160
    iget-object v0, p0, Lo/eqh$1;->b:Lo/eqh;

    move-wide v1, v10

    move-wide v3, v12

    move-wide v5, v8

    invoke-static/range {v0 .. v6}, Lo/eqh;->a(Lo/eqh;DDJ)V

    .line 161
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show data view: lowData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "          highData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :cond_2
    :goto_0
    return-void
.end method
