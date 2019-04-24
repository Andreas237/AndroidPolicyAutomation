.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->k(Lcom/huawei/health/sns/model/user/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

.field final synthetic c:Lcom/huawei/health/sns/model/user/User;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 1263
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->a:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->a:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->h(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->a:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V

    .line 1276
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->a:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$4;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lcom/huawei/health/sns/model/user/User;)V

    .line 1277
    return-void
.end method

.method public d()V
    .locals 0

    .line 1283
    return-void
.end method
