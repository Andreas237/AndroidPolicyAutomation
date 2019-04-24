.class Lo/cys$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cys;


# direct methods
.method constructor <init>(Lo/cys;)V
    .locals 0

    .line 1404
    iput-object p1, p0, Lo/cys$4;->a:Lo/cys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 5

    .line 1407
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "During add device then receive BT Switch state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1408
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1411
    :pswitch_0
    iget-object v0, p0, Lo/cys$4;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->c(Lo/cys;)Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cys$4;->a:Lo/cys;

    iget-object v1, v1, Lo/cys;->e:Lo/cyf;

    invoke-virtual {v0, v1}, Lo/cxk;->e(Lo/cyf;)V

    .line 1413
    iget-object v0, p0, Lo/cys$4;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1415
    iget-object v0, p0, Lo/cys$4;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lo/cxs;->e(I)V

    goto :goto_0

    .line 1419
    :pswitch_1
    goto :goto_0

    .line 1422
    :pswitch_2
    iget-object v0, p0, Lo/cys$4;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->c(Lo/cys;)Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cys$4;->a:Lo/cys;

    iget-object v1, v1, Lo/cys;->e:Lo/cyf;

    invoke-virtual {v0, v1}, Lo/cxk;->e(Lo/cyf;)V

    .line 1433
    iget-object v0, p0, Lo/cys$4;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->g(Lo/cys;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1435
    invoke-static {}, Lo/cys;->q()Lo/cys$a;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/cys$a;->sendEmptyMessage(I)Z

    nop

    .line 1439
    .line 1442
    :cond_0
    :goto_0
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
