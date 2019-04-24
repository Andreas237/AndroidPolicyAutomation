.class Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;
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
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$3;)V
    .locals 0

    .line 450
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$c;->e:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->onBackPressed()V

    .line 457
    return-void
.end method
