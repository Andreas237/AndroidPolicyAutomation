.class Lo/dxo$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->c(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dxo;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 510
    iput-object p1, p0, Lo/dxo$6;->d:Lo/dxo;

    iput p2, p0, Lo/dxo$6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 3

    .line 512
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 513
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getWeightData is null,return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    return-void

    .line 517
    :cond_0
    move-object v2, p2

    :try_start_0
    check-cast v2, Ljava/util/List;

    .line 518
    iget-object v0, p0, Lo/dxo$6;->d:Lo/dxo;

    iget v1, p0, Lo/dxo$6;->e:I

    invoke-virtual {v0, v2, v1}, Lo/dxo;->d(Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 521
    goto :goto_0

    .line 519
    :catch_0
    move-exception v2

    .line 520
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getWeightData data ClassCastException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 522
    :goto_0
    return-void
.end method
