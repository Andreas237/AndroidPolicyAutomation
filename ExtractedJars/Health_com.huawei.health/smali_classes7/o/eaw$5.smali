.class Lo/eaw$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eaw;->a(Ljava/lang/String;Lo/eaz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eaz;

.field final synthetic b:Lo/eaw;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/eaw;Ljava/lang/String;Lo/eaz;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lo/eaw$5;->b:Lo/eaw;

    iput-object p2, p0, Lo/eaw$5;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/eaw$5;->a:Lo/eaz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 11

    .line 249
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 251
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    invoke-static {v0}, Lo/eaw;->e(Lo/eaw;)Ljava/lang/String;

    move-result-object v6

    .line 252
    const-string v0, "EzPlugin_EzPluginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "savePathIndex is ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    iget-object v1, p0, Lo/eaw$5;->b:Lo/eaw;

    invoke-static {v1}, Lo/eaw;->a(Lo/eaw;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lo/eaw;->a(Lo/eaw;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 255
    const-string v0, "EzPlugin_EzPluginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "indexJson = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    invoke-static {v7}, Lo/eao;->a(Ljava/lang/String;)Lo/eat;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eaw;->a(Lo/eaw;Lo/eat;)Lo/eat;

    .line 259
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 260
    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    .line 261
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    invoke-static {v0}, Lo/eaw;->a(Lo/eaw;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/eaw$5;->b:Lo/eaw;

    invoke-virtual {v1}, Lo/eaw;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "updateTime"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v9, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 262
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    iget-object v1, p0, Lo/eaw$5;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eaw;->e(Ljava/lang/String;)Lo/ear;

    move-result-object v10

    .line 263
    iget-object v0, p0, Lo/eaw$5;->b:Lo/eaw;

    move-object v1, v10

    iget-object v2, p0, Lo/eaw$5;->e:Ljava/lang/String;

    iget-object v3, p0, Lo/eaw$5;->a:Lo/eaz;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lo/eaw;->c(Lo/eaw;Lo/ear;Ljava/lang/String;Lo/eaz;Lo/eay;Lo/eba;)V

    .line 264
    goto :goto_0

    :cond_0
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    goto :goto_0

    .line 267
    :cond_1
    iget-object v0, p0, Lo/eaw$5;->a:Lo/eaz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 268
    iget-object v0, p0, Lo/eaw$5;->a:Lo/eaz;

    invoke-interface {v0, p1, p2}, Lo/eaz;->onPullingChange(Lo/eay;Lo/eba;)V

    .line 271
    :cond_2
    :goto_0
    return-void
.end method
