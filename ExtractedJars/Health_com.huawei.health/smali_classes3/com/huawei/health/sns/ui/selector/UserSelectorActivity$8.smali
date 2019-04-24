.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lcom/huawei/health/sns/model/user/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

.field final synthetic d:Lcom/huawei/health/sns/model/user/User;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 1225
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;->c:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 3

    .line 1230
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1231
    const-string v0, "user"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;->d:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1232
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;->c:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 1233
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$8;->c:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 1234
    return-void
.end method

.method public d()V
    .locals 0

    .line 1240
    return-void
.end method
