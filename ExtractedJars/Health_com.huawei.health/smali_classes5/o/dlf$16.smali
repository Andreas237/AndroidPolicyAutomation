.class Lo/dlf$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lo/dlf$16;->b:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 4

    .line 430
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeWeightGoalInfo onchange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    iget-object v0, p0, Lo/dlf$16;->b:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dlf$16$1;

    invoke-direct {v1, p0}, Lo/dlf$16$1;-><init>(Lo/dlf$16;)V

    invoke-static {v0, v1}, Lo/dmn;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 468
    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 469
    iget-object v0, p0, Lo/dlf$16;->b:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->d()V

    .line 471
    :cond_0
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 426
    return-void
.end method
