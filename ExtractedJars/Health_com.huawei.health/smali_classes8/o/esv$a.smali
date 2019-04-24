.class Lo/esv$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esv;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lo/esv;)V
    .locals 1

    .line 1590
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1589
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv$a;->b:Ljava/lang/ref/WeakReference;

    .line 1591
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esv$a;->b:Ljava/lang/ref/WeakReference;

    .line 1592
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 7

    .line 1596
    iget-object v0, p0, Lo/esv$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/esv;

    .line 1597
    if-nez v5, :cond_0

    .line 1598
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepCallback mStepsCard == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1599
    return-void

    .line 1601
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "report step="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "step"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ":calories="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "carior"

    .line 1602
    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ":floor="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "floor"

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, ":distance="

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "distance"

    .line 1603
    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 1601
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1604
    const-string v0, "step"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v5, v0}, Lo/esv;->c(Lo/esv;I)I

    .line 1605
    const-string v0, "carior"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v5, v0}, Lo/esv;->f(Lo/esv;I)I

    .line 1606
    const-string v0, "floor"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v5, v0}, Lo/esv;->i(Lo/esv;I)I

    .line 1607
    const-string v0, "distance"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v5, v0}, Lo/esv;->g(Lo/esv;I)I

    .line 1610
    invoke-static {v5}, Lo/esv;->A(Lo/esv;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v5}, Lo/esv;->f(Lo/esv;)I

    move-result v0

    if-nez v0, :cond_2

    .line 1611
    :cond_1
    invoke-static {v5}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1612
    invoke-virtual {v6, p1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1613
    invoke-static {v5}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1616
    :cond_2
    return-void
.end method
