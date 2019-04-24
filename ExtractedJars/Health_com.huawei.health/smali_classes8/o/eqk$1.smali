.class Lo/eqk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqk;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic e:Lo/eqk;


# direct methods
.method constructor <init>(Lo/eqk;Ljava/lang/String;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/eqk$1;->e:Lo/eqk;

    iput-object p2, p0, Lo/eqk$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 196
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResult called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, p1}, Lo/acs;->b(Ljava/util/List;)V

    .line 200
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 201
    :cond_0
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeight no data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 203
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 204
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    iget-object v1, p0, Lo/eqk$1;->e:Lo/eqk;

    iget-object v1, v1, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->d(Lo/eqk;)Lo/eqk$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqk$b;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 207
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 208
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 209
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->d(Lo/eqk;)Lo/eqk$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eqk$b;->sendMessage(Landroid/os/Message;)Z

    .line 211
    :cond_1
    return-void

    .line 214
    :cond_2
    const-wide/16 v4, 0x0

    .line 215
    const-wide/16 v6, 0x0

    .line 217
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData datas.size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 220
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v10

    .line 221
    if-eqz v10, :cond_3

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    .line 222
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/eqk$1;->b:Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 223
    :cond_3
    new-instance v11, Lo/fdf;

    invoke-direct {v11}, Lo/fdf;-><init>()V

    .line 224
    const-string v0, "weight"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v11, Lo/fdf;->e:D

    .line 225
    const-string v0, "weight_bodyfat"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v11, Lo/fdf;->d:D

    .line 226
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iput-wide v0, v11, Lo/fdf;->a:J

    .line 228
    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-nez v0, :cond_4

    .line 229
    iget-wide v4, v11, Lo/fdf;->e:D

    .line 231
    :cond_4
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-nez v0, :cond_5

    .line 232
    iget-wide v6, v11, Lo/fdf;->a:J

    .line 235
    :cond_5
    goto/16 :goto_0

    .line 237
    :cond_6
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v6

    if-eqz v0, :cond_7

    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v4

    if-nez v0, :cond_8

    .line 239
    :cond_7
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 240
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show empty view!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v0, v1}, Lo/epx;->b(Lo/epx$c;)V

    .line 242
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    iget-object v1, p0, Lo/eqk$1;->e:Lo/eqk;

    iget-object v1, v1, Lo/eqk;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_main_home_page_weight_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/epx;->d(Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->d(Lo/eqk;)Lo/eqk$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/eqk$b;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 245
    const/4 v0, 0x2

    iput v0, v8, Landroid/os/Message;->what:I

    .line 246
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->a(Lo/eqk;)Lo/epx;

    move-result-object v0

    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 247
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0}, Lo/eqk;->d(Lo/eqk;)Lo/eqk$b;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/eqk$b;->sendMessage(Landroid/os/Message;)Z

    .line 248
    goto :goto_1

    .line 251
    :cond_8
    iget-object v0, p0, Lo/eqk$1;->e:Lo/eqk;

    invoke-static {v0, v4, v5, v6, v7}, Lo/eqk;->a(Lo/eqk;DJ)V

    .line 252
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show data view: lastWeight"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "     lastWeightTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_9
    :goto_1
    return-void
.end method
