.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 427
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 430
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fit;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 433
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 436
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "alisport_red_dot_show"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 439
    const-string v0, "true"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 440
    const-string v3, "false"

    .line 442
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    const/16 v1, 0x1f5

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 443
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;->a:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 446
    :cond_2
    return-void
.end method
