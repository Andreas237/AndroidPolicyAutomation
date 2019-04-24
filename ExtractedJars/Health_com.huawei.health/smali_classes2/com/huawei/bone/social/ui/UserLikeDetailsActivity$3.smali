.class Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/RelativeLayout$LayoutParams;

.field final synthetic e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Landroid/widget/RelativeLayout$LayoutParams;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    iput-object p2, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;->a:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;->a:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;->e:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 95
    return-void
.end method
