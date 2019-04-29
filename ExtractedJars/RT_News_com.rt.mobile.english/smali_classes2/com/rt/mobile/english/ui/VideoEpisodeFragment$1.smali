.class Lcom/rt/mobile/english/ui/VideoEpisodeFragment$1;
.super Lcom/nostra13/universalimageloader/core/listener/SimpleImageLoadingListener;
.source "VideoEpisodeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/VideoEpisodeFragment;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$1;->this$0:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;

    invoke-direct {p0}, Lcom/nostra13/universalimageloader/core/listener/SimpleImageLoadingListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadingComplete(Ljava/lang/String;Landroid/view/View;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 99
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$1;->this$0:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->networkImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method
