.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V
    .locals 0

    .line 1075
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;->e:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$4;)V
    .locals 0

    .line 1075
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)V

    return-void
.end method


# virtual methods
.method public c(II)V
    .locals 2

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;->e:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1079
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$c;->e:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->m(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bdx;->c(I)V

    .line 1081
    :cond_0
    return-void
.end method
