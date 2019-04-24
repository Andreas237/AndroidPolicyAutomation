.class Lcom/huawei/bone/social/ui/LauncherActivity$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/LauncherActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/bone/social/ui/LauncherActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity$1;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$1$2;->a:Lcom/huawei/bone/social/ui/LauncherActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 293
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 296
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 297
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$1$2;->a:Lcom/huawei/bone/social/ui/LauncherActivity$1;

    iget-object v0, v0, Lcom/huawei/bone/social/ui/LauncherActivity$1;->c:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->a(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 298
    return-void
.end method

.method public b()V
    .locals 0

    .line 311
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 316
    return-void
.end method

.method public e()V
    .locals 5

    .line 302
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 304
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 305
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$1$2;->a:Lcom/huawei/bone/social/ui/LauncherActivity$1;

    iget-object v0, v0, Lcom/huawei/bone/social/ui/LauncherActivity$1;->c:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->a(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 306
    return-void
.end method
