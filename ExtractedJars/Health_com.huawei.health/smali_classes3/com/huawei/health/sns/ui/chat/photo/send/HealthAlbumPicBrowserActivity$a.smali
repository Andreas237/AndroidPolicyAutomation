.class Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V
    .locals 0

    .line 1036
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$1;)V
    .locals 0

    .line 1036
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)V

    return-void
.end method


# virtual methods
.method public c(II)V
    .locals 2

    .line 1039
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1040
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity$a;->e:Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;)Lo/bdx;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bdx;->c(I)V

    .line 1042
    :cond_0
    return-void
.end method
