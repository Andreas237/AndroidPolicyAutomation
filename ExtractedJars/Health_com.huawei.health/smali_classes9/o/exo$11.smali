.class Lo/exo$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->a(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exn$d;

.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/exn$d;Lo/egg;)V
    .locals 0

    .line 1722
    iput-object p1, p0, Lo/exo$11;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$11;->a:Lo/exn$d;

    iput-object p3, p0, Lo/exo$11;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1725
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1726
    const/4 v5, -0x1

    .line 1727
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1728
    sget-object v0, Lo/exo$25;->c:[I

    iget-object v1, p0, Lo/exo$11;->a:Lo/exn$d;

    invoke-virtual {v1}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1733
    :pswitch_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestPressureMeasureDetail err_code 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1734
    const/4 v5, 0x0

    .line 1735
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1736
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 1737
    move-object v4, v6

    .line 1738
    goto :goto_1

    .line 1741
    :goto_0
    :pswitch_1
    const/4 v5, 0x0

    .line 1742
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 1747
    :cond_0
    :goto_1
    iget-object v0, p0, Lo/exo$11;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1748
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestPressureMeasureStatistic callbackResponse.onResponse sucess resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1749
    iget-object v0, p0, Lo/exo$11;->c:Lo/egg;

    invoke-interface {v0, v5, v4}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1751
    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method