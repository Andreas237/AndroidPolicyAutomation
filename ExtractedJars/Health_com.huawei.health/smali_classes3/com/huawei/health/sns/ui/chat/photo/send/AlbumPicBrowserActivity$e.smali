.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 1062
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;)V
    .locals 0

    .line 1062
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 2

    .line 1065
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1066
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$e;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 1068
    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 1072
    return-void
.end method
