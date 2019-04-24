.class final Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity;->b(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 149
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 153
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/bml$b;->e:Lo/bml$b;

    .line 153
    invoke-static {v0, v1}, Lo/bml;->b(Landroid/content/Context;Lo/bml$b;)Z

    move-result v2

    .line 155
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/bml$b;->c:Lo/bml$b;

    .line 155
    invoke-static {v0, v1}, Lo/bml;->b(Landroid/content/Context;Lo/bml$b;)Z

    move-result v3

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;->e:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 159
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 160
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 161
    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 162
    if-eqz v3, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput v0, v4, Landroid/os/Message;->arg2:I

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/ShortCutSettingActivity$2;->e:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 165
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
