.class Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 252
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 254
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->k(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$e;->a()V

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->g(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->h(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    .line 259
    goto :goto_0

    .line 261
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment$2;->d:Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;->o(Lcom/huawei/ui/main/stories/configuredPage/ConfiguredPageFragment;)V

    .line 262
    .line 266
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 267
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
