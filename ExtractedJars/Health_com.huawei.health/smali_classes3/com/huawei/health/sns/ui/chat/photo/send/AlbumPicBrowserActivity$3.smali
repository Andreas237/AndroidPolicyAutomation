.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 783
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

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

    .line 786
    const-string v0, "AlbumPicBrowserActivity"

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

    .line 787
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->f(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)V

    goto :goto_0

    .line 790
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$3;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lcom/huawei/health/sns/model/chat/Album;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Ljava/util/ArrayList;I)V

    .line 792
    :goto_0
    return-void
.end method
