.class Lo/dxo$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->f(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic d:Lo/dxo;


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 543
    iput-object p1, p0, Lo/dxo$7;->d:Lo/dxo;

    iput p2, p0, Lo/dxo$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 3

    .line 545
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 546
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getFitnessListData is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    return-void

    .line 550
    :cond_0
    move-object v2, p2

    :try_start_0
    check-cast v2, Ljava/util/List;

    .line 551
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 552
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getFitnessListData is empty,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 553
    return-void

    .line 555
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/dxo$7;->d:Lo/dxo;

    iget v1, p0, Lo/dxo$7;->a:I

    invoke-virtual {v0, v2, v1}, Lo/dxo;->c(Ljava/util/List;I)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 558
    goto :goto_0

    .line 556
    :catch_0
    move-exception v2

    .line 557
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getAnnualFitnessReport data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    :goto_0
    return-void
.end method
