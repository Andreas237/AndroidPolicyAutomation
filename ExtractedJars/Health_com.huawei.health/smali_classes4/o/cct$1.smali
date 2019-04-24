.class Lo/cct$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cct;


# direct methods
.method constructor <init>(Lo/cct;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/cct$1;->b:Lo/cct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4

    .line 119
    iget-object v0, p0, Lo/cct$1;->b:Lo/cct;

    invoke-static {v0}, Lo/cct;->e(Lo/cct;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const/4 v0, 0x1

    return v0

    .line 122
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 125
    :sswitch_0
    iget-object v0, p0, Lo/cct$1;->b:Lo/cct;

    iget-object v0, v0, Lo/cct;->e:Landroid/os/Handler;

    invoke-static {}, Lo/cct;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lo/cct$1;->b:Lo/cct;

    invoke-static {v0}, Lo/cct;->c(Lo/cct;)V

    .line 127
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage is  ENTER_STATE_STILL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x1

    return v0

    .line 130
    :sswitch_1
    iget-object v0, p0, Lo/cct$1;->b:Lo/cct;

    iget-object v0, v0, Lo/cct;->e:Landroid/os/Handler;

    invoke-static {}, Lo/cct;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 131
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage is  registerGps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lo/cct$1;->b:Lo/cct;

    invoke-static {v0}, Lo/cct;->d(Lo/cct;)V

    .line 133
    const/4 v0, 0x1

    return v0

    .line 135
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x64 -> :sswitch_1
        0x66 -> :sswitch_0
    .end sparse-switch
.end method
