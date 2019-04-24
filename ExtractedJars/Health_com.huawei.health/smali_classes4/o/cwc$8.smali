.class Lo/cwc$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->a(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cwc;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cwc;Ljava/lang/String;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lo/cwc$8;->c:Lo/cwc;

    iput-object p2, p0, Lo/cwc$8;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 530
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 531
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 532
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 533
    iget-object v0, p0, Lo/cwc$8;->c:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->g(Lo/cwc;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 534
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData MotionPath success obj = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ", type = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    goto :goto_0

    .line 536
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData MotionPath fail obj = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ", type = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    :goto_0
    iget-object v0, p0, Lo/cwc$8;->c:Lo/cwc;

    const-string v1, "com.huawei.bone.action.WORKOUT_CARD_UPDATED_DATA"

    invoke-static {v0, v1}, Lo/cwc;->e(Lo/cwc;Ljava/lang/String;)V

    .line 540
    iget-object v0, p0, Lo/cwc$8;->c:Lo/cwc;

    iget-object v1, p0, Lo/cwc$8;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/cwc;->c(Lo/cwc;Ljava/lang/String;)V

    .line 541
    return-void
.end method
