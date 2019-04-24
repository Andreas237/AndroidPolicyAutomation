.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 939
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 955
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)Z

    .line 956
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->i(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bdx;->setBlurredView(Landroid/view/View;)V

    .line 957
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->o(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdu;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 958
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 959
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 951
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 943
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Z)Z

    .line 944
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->i(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdz;->setVisibility(I)V

    .line 945
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$7;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 946
    return-void
.end method
