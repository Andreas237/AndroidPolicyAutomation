.class Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 900
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 916
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)Z

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bdx;->setBlurredView(Landroid/view/View;)V

    .line 918
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->f(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdu;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 919
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 920
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 912
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 904
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Z)Z

    .line 905
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->h(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdz;->setVisibility(I)V

    .line 906
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$10;->b:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 907
    return-void
.end method
