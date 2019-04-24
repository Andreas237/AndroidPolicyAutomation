.class final Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Landroid/os/Handler;Landroid/content/Context;)Lo/brd;
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
.field final synthetic a:Landroid/os/Handler;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 726
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 726
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 730
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/bcc;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 733
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 735
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
