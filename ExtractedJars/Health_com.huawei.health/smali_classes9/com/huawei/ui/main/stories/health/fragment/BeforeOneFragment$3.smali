.class Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;)V
    .locals 0

    .line 691
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;->e:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 695
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;->e:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 696
    const-string v0, "url"

    const-string v1, "https://mp.weixin.qq.com/s?__biz=MzA5ODY0ODgzMA==&mid=515318421&idx=1&sn=f5817b9bbabb4b1f40c8926011bac4cd&scene=19#wechat_redirect"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment$3;->e:Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->b:Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 698
    return-void
.end method
