.class Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 271
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 266
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 255
    const-string v0, "PhotoPagerActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":onPageSelected mPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    iget v2, v2, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->e(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    .line 260
    return-void
.end method
