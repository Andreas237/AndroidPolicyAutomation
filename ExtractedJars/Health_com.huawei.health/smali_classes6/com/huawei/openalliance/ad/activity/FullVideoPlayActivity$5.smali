.class Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$5;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity$5;->a:Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;->d(Lcom/huawei/openalliance/ad/activity/FullVideoPlayActivity;)Lcom/huawei/openalliance/ad/views/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/i;->b(I)V

    return-void
.end method
