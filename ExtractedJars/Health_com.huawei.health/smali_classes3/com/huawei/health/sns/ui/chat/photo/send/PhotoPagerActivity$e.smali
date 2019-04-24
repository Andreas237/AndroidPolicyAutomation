.class Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;)V
    .locals 0

    .line 431
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 442
    if-nez v2, :cond_0

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->b(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$e;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->e(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Z)V

    .line 447
    return-void
.end method
