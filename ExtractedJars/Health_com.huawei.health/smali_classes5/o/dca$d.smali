.class Lo/dca$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:I

.field b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field c:Z

.field d:I

.field final synthetic e:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 744
    iput-object p1, p0, Lo/dca$d;->e:Lo/dca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 745
    iput-object p4, p0, Lo/dca$d;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 746
    iput p2, p0, Lo/dca$d;->a:I

    .line 747
    iput p3, p0, Lo/dca$d;->d:I

    .line 748
    iput-boolean p5, p0, Lo/dca$d;->c:Z

    .line 749
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 753
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter syncCoreSleepDetailDataRunable run !!!! mIsNormalSync:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dca$d;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lo/dca$d;->e:Lo/dca;

    iget v1, p0, Lo/dca$d;->a:I

    iget v2, p0, Lo/dca$d;->d:I

    iget-object v3, p0, Lo/dca$d;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-boolean v4, p0, Lo/dca$d;->c:Z

    invoke-static {v0, v1, v2, v3, v4}, Lo/dca;->b(Lo/dca;IILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 756
    return-void
.end method
