.class Lo/dlf$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lo/dlf$5;->d:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 4

    .line 491
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeUserPreference onchange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    const/16 v0, 0x66

    if-ne p1, v0, :cond_0

    .line 493
    iget-object v0, p0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->q(Lo/dlf;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/dlf$5$4;

    invoke-direct {v1, p0}, Lo/dlf$5$4;-><init>(Lo/dlf$5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 504
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

    .line 487
    return-void
.end method
