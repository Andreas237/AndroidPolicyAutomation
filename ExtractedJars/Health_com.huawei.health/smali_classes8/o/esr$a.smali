.class public Lo/esr$a;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/esr;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/esr;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 77
    return-void
.end method


# virtual methods
.method public b(Lo/esr;Landroid/os/Message;)V
    .locals 5

    .line 80
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 82
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull obj == null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return-void

    .line 85
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 87
    :sswitch_0
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetWeightCardReaderHandler()  handleMessageWhenReferenceNotNull :  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshData"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;

    .line 90
    invoke-static {p1}, Lo/esr;->d(Lo/esr;)Lo/esp;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 91
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 92
    invoke-static {p1}, Lo/esr;->d(Lo/esr;)Lo/esp;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/esp;->a(Lcom/huawei/ui/homehealth/sportsrecordingcard/SportsRecordingBean;)V

    goto :goto_0

    .line 94
    :cond_1
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportsRecordingBean  = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 74
    move-object v0, p1

    check-cast v0, Lo/esr;

    invoke-virtual {p0, v0, p2}, Lo/esr$a;->b(Lo/esr;Landroid/os/Message;)V

    return-void
.end method
