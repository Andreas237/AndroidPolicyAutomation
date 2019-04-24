.class Lo/enu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enu;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lo/eaa;

.field final synthetic e:Lo/enu;


# direct methods
.method constructor <init>(Lo/enu;Lo/eaa;I)V
    .locals 0

    .line 339
    iput-object p1, p0, Lo/enu$2;->e:Lo/enu;

    iput-object p2, p0, Lo/enu$2;->c:Lo/eaa;

    iput p3, p0, Lo/enu$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 342
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 343
    const/4 v4, 0x0

    .line 346
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 349
    goto :goto_0

    .line 347
    :catch_0
    move-exception v5

    .line 348
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClassCastException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    :goto_0
    iget-object v0, p0, Lo/enu$2;->e:Lo/enu;

    invoke-static {v0, v4}, Lo/enu;->d(Lo/enu;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 351
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "has message donot makeMessage, "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    return-void

    .line 355
    :cond_0
    iget-object v0, p0, Lo/enu$2;->c:Lo/eaa;

    const-string v1, "device"

    const-string v2, "device_ota1"

    new-instance v3, Lo/enu$2$1;

    invoke-direct {v3, p0}, Lo/enu$2$1;-><init>(Lo/enu$2;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eaa;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 394
    :cond_1
    return-void
.end method
