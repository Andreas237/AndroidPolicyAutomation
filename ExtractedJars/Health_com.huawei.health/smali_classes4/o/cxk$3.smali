.class Lo/cxk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cxk;->a(Ljava/util/List;ILo/cya;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cxk;

.field final synthetic b:I

.field final synthetic c:Lo/cya;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/cxk;ILjava/util/List;Lo/cya;)V
    .locals 0

    .line 528
    iput-object p1, p0, Lo/cxk$3;->a:Lo/cxk;

    iput p2, p0, Lo/cxk$3;->b:I

    iput-object p3, p0, Lo/cxk$3;->d:Ljava/util/List;

    iput-object p4, p0, Lo/cxk$3;->c:Lo/cya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 531
    iget v0, p0, Lo/cxk$3;->b:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 534
    :pswitch_0
    iget-object v0, p0, Lo/cxk$3;->a:Lo/cxk;

    iget-object v1, p0, Lo/cxk$3;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lo/cxk;->e(Lo/cxk;Ljava/util/List;)V

    .line 537
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 540
    goto :goto_0

    .line 538
    :catch_0
    move-exception v6

    .line 539
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "unPair device and sleep occur exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 542
    :goto_0
    iget-object v0, p0, Lo/cxk$3;->a:Lo/cxk;

    iget-object v1, p0, Lo/cxk$3;->c:Lo/cya;

    invoke-static {v0, v1}, Lo/cxk;->e(Lo/cxk;Lo/cya;)V

    .line 543
    goto :goto_1

    .line 545
    :pswitch_1
    const/4 v6, 0x0

    .line 546
    iget-object v0, p0, Lo/cxk$3;->a:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->f(Lo/cxk;)Z

    move-result v6

    .line 547
    invoke-static {}, Lo/cxk;->g()I

    move-result v0

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    if-eqz v6, :cond_0

    .line 549
    iget-object v0, p0, Lo/cxk$3;->a:Lo/cxk;

    iget-object v1, p0, Lo/cxk$3;->c:Lo/cya;

    invoke-static {v0, v1}, Lo/cxk;->a(Lo/cxk;Lo/cya;)V

    goto :goto_1

    .line 551
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Android version less than JELLY_BEAN_MR2."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 553
    goto :goto_1

    .line 556
    :pswitch_2
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BT Type is BT_DUAL and not support."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 557
    .line 561
    :goto_1
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
