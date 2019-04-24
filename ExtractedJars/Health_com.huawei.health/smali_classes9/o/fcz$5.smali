.class Lo/fcz$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fcz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fcz;


# direct methods
.method constructor <init>(Lo/fcz;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/fcz$5;->a:Lo/fcz;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 194
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 195
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 197
    :sswitch_0
    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->a(Lo/fcz;)Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 198
    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->a(Lo/fcz;)Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d()V

    goto :goto_0

    .line 202
    :sswitch_1
    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->e(Lo/fcz;)V

    .line 203
    goto :goto_0

    .line 205
    :sswitch_2
    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    iget-object v0, v0, Lo/fcz;->e:Landroid/app/Activity;

    iget-object v1, p0, Lo/fcz$5;->a:Lo/fcz;

    iget-object v1, v1, Lo/fcz;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    invoke-static {v0, v1}, Lo/fhv;->b(Landroid/content/Context;Z)V

    .line 206
    goto :goto_0

    .line 208
    :sswitch_3
    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    invoke-static {v0}, Lo/fcz;->b(Lo/fcz;)V

    .line 209
    goto :goto_0

    .line 211
    :sswitch_4
    invoke-static {}, Lo/fhv;->d()Lo/fhv;

    iget-object v0, p0, Lo/fcz$5;->a:Lo/fcz;

    iget-object v0, v0, Lo/fcz;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/fhv;->b(Landroid/content/Context;)V

    .line 212
    .line 217
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x3 -> :sswitch_4
        0x4 -> :sswitch_3
        0x7 -> :sswitch_2
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method
