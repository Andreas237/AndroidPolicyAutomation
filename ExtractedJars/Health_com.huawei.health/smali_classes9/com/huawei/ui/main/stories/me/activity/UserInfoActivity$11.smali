.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;
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
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 1517
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x42

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->A(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    goto :goto_0

    .line 1523
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    .line 1525
    :goto_0
    return-void
.end method
