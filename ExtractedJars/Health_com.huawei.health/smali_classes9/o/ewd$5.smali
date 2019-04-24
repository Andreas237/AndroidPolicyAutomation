.class Lo/ewd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 328
    if-nez p2, :cond_0

    .line 329
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 331
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 333
    :try_start_0
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    new-instance v1, Lorg/json/JSONObject;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/ewd;->a(Lo/ewd;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 334
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Message is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-static {v3}, Lo/ewd;->c(Lo/ewd;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    invoke-static {}, Lo/ewd;->u()J

    move-result-wide v4

    .line 336
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v0}, Lo/ewd;->b()J

    move-result-wide v0

    sub-long v6, v4, v0

    .line 337
    const-wide/32 v0, 0xea60

    cmp-long v0, v6, v0

    if-gtz v0, :cond_1

    .line 339
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    iget-object v0, v0, Lo/ewd;->b:Ljava/util/List;

    iget-object v1, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->c(Lo/ewd;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BackList Add  jsonObject!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    :cond_1
    goto/16 :goto_0

    .line 342
    :catch_0
    move-exception v4

    .line 343
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objData change to json not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    goto/16 :goto_0

    .line 345
    :cond_2
    const v0, 0x1e84a

    if-eq v0, p1, :cond_3

    const v0, 0x1e849

    if-ne v0, p1, :cond_6

    .line 346
    :cond_3
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code is bad = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIsPressureMeasureActivity() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v3}, Lo/ewd;->n()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIsPressureCalibrateActivity() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v3}, Lo/ewd;->o()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v0}, Lo/ewd;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 350
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-static {}, Lo/ewd;->y()I

    move-result v1

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;I)V

    .line 352
    :cond_4
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v0}, Lo/ewd;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 353
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-static {}, Lo/ewd;->A()I

    move-result v1

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;I)V

    .line 355
    :cond_5
    iget-object v0, p0, Lo/ewd$5;->a:Lo/ewd;

    invoke-virtual {v0}, Lo/ewd;->q()V

    .line 358
    :cond_6
    :goto_0
    return-void
.end method
