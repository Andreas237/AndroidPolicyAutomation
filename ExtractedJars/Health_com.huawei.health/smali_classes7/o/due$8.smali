.class Lo/due$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/due;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwr;

.field final synthetic d:Lo/due;


# direct methods
.method constructor <init>(Lo/due;Lo/dwr;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lo/due$8;->d:Lo/due;

    iput-object p2, p0, Lo/due$8;->b:Lo/dwr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 347
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 348
    iget-object v0, p0, Lo/due$8;->b:Lo/dwr;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 349
    iget-object v0, p0, Lo/due$8;->b:Lo/dwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v5

    .line 350
    iget-object v0, p0, Lo/due$8;->b:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v6

    .line 351
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 352
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "getData data is null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lo/due$8;->d:Lo/due;

    invoke-static {v0}, Lo/due;->e(Lo/due;)V

    .line 354
    return-void

    .line 356
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    .line 358
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const/16 v0, 0x13

    if-ge v7, v0, :cond_1

    .line 359
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "get medal"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    invoke-static {}, Lo/due;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "medalIsException"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 362
    iget-object v0, p0, Lo/due$8;->b:Lo/dwr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v8}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 364
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData data size is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    iget-object v0, p0, Lo/due$8;->d:Lo/due;

    invoke-static {v0, v5, v6}, Lo/due;->e(Lo/due;Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v8

    .line 366
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_2

    .line 367
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dvt;

    .line 368
    iget-object v0, p0, Lo/due$8;->d:Lo/due;

    invoke-static {v0, v10, v8}, Lo/due;->c(Lo/due;Lo/dvt;Ljava/util/ArrayList;)V

    .line 366
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 370
    :cond_2
    iget-object v0, p0, Lo/due$8;->d:Lo/due;

    const-string v1, "success"

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lo/due;->e(Lo/due;ILjava/lang/Object;)V

    .line 372
    return-void
.end method
