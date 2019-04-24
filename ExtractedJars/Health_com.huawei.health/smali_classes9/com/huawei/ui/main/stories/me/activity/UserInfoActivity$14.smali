.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 1504
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "gender"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 1509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "birthday"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 1510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "height"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 1511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    .line 1512
    return-void
.end method
