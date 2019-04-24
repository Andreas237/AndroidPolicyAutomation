.class Lo/cir$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->e(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/util/SparseArray;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Landroid/util/SparseArray;

.field final synthetic h:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;Landroid/util/SparseArray;Landroid/util/SparseArray;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1419
    iput-object p1, p0, Lo/cir$23;->h:Lo/cir;

    iput-object p2, p0, Lo/cir$23;->c:Landroid/util/SparseArray;

    iput-object p3, p0, Lo/cir$23;->e:Landroid/util/SparseArray;

    iput-object p4, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    iput-object p5, p0, Lo/cir$23;->d:Ljava/lang/String;

    iput-object p6, p0, Lo/cir$23;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1422
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->c:Landroid/util/SparseArray;

    iget-object v2, p0, Lo/cir$23;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, v1, v2}, Lo/ciq;->e(Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    .line 1423
    iget-object v0, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v1, "progreeRate"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 1424
    if-gez v4, :cond_0

    .line 1425
    const/4 v4, 0x0

    goto :goto_0

    .line 1426
    :cond_0
    const/16 v0, 0x64

    if-le v4, v0, :cond_1

    .line 1427
    const/16 v4, 0x64

    .line 1430
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v1, "distance"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 1431
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->n()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1432
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->l()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v2, "duration"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1433
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->y(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->D()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1434
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->D()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v2, "indoor_run_step"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1435
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->C()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v2, "indoor_run_distance"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1436
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->j()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v2, "indoor_run_normal_distance"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1437
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->B()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v2, "indoor_running_number_data"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1440
    :cond_2
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->x(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->F()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1441
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->F()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "3D:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v3, "climb_3d_dis"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", 2D:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v3, "climb_2d_dis"

    .line 1442
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", \u6d77\u62d4:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v3, "climb_3d_pressure"

    .line 1443
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1441
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1446
    :cond_3
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->z(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1447
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->H()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1448
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->z()Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_1

    .line 1449
    :cond_4
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->B(Lo/cir;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1450
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->H()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v1}, Lo/cir;->A(Lo/cir;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1451
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->z()Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1454
    :cond_5
    :goto_1
    iget-object v0, p0, Lo/cir$23;->b:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/cir$23;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1455
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->I()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1456
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->I()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/cir$23;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 1458
    :cond_6
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->I()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1460
    :goto_2
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->D(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 1462
    iget-object v0, p0, Lo/cir$23;->a:Landroid/os/Bundle;

    const-string v1, "ihealth_free_indoor_running_style"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 1463
    const/4 v0, 0x1

    if-ne v6, v0, :cond_7

    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->D(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    .line 1464
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->D(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 1465
    :cond_7
    const/4 v0, 0x2

    if-ne v6, v0, :cond_8

    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->D(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_8

    .line 1466
    iget-object v0, p0, Lo/cir$23;->h:Lo/cir;

    invoke-static {v0}, Lo/cir;->D(Lo/cir;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1469
    :cond_8
    :goto_3
    return-void
.end method
