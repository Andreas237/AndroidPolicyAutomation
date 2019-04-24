.class Lo/ccu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ccu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ccu;


# direct methods
.method constructor <init>(Lo/ccu;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4

    .line 103
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 106
    :sswitch_0
    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-static {v0}, Lo/ccu;->b(Lo/ccu;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {}, Lo/ccu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 107
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->o()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-static {v0}, Lo/ccu;->d(Lo/ccu;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion =ENTER_STATE_STILL "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-static {v0}, Lo/ccu;->e(Lo/ccu;)V

    .line 111
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 113
    :sswitch_1
    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-static {v0}, Lo/ccu;->b(Lo/ccu;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {}, Lo/ccu;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 114
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->o()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    .line 115
    invoke-static {v0}, Lo/ccu;->a(Lo/ccu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion = TrackConstants.EXIT_STATE_STILL AND AUTO_RESUME_SPORT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lo/ccu$2;->a:Lo/ccu;

    invoke-static {v0}, Lo/ccu;->c(Lo/ccu;)V

    .line 119
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 121
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x64 -> :sswitch_1
        0x66 -> :sswitch_0
    .end sparse-switch
.end method
