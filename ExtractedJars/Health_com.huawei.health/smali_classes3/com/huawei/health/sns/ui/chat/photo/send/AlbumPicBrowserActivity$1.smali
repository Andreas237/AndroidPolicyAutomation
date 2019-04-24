.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;
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
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 768
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

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

    .line 771
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdt;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bdt;->b(I)Lcom/huawei/health/sns/model/chat/Album;

    move-result-object v2

    .line 772
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 773
    const-string v0, "AlbumPicBrowserActivity"

    const-string v1, "you click album is null "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 775
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0, v2}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/model/chat/Album;)V

    .line 776
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    .line 778
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0, p3}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)I

    .line 779
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$1;->a:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->g(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    .line 780
    return-void
.end method
