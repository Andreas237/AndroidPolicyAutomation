.class Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 744
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 747
    const-string v0, "HealthAlbumPicBrowserActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ":onItemClick position="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->g(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;I)V

    goto :goto_0

    .line 751
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$2;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->i(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lcom/huawei/health/sns/model/chat/Album;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Ljava/util/ArrayList;I)V

    .line 753
    :goto_0
    return-void
.end method
