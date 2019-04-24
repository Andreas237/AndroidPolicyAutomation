.class Lo/dkl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkl;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dkl;


# direct methods
.method constructor <init>(Lo/dkl;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 262
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WEATHER_SWITCH_STATUS err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    const/4 v4, 0x1

    .line 264
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 265
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 266
    const-string v0, "false"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    const/4 v4, 0x0

    .line 268
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dkl;->a(Z)V

    .line 270
    :cond_0
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WEATHER_SWITCH_STATUS enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    :cond_1
    if-eqz v4, :cond_4

    .line 274
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->b(Lo/dkl;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 276
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->e(Lo/dkl;)Lo/czo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 277
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    iget-object v1, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->e(Lo/dkl;)Lo/czo;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkl;->a(Lo/dkl;Lo/czo;)V

    goto :goto_0

    .line 280
    :cond_2
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->d(Lo/dkl;)V

    goto :goto_0

    .line 282
    :cond_3
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->b(Lo/dkl;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 284
    iget-object v0, p0, Lo/dkl$5;->d:Lo/dkl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dkl;->a(Z)V

    .line 287
    :cond_4
    :goto_0
    return-void
.end method
