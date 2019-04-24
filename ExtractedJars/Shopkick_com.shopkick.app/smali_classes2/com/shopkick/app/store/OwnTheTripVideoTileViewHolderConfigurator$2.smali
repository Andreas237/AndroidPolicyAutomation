.class Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;
.super Ljava/lang/Object;
.source "OwnTheTripVideoTileViewHolderConfigurator.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->updateVideoCountDown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/video/VideoController;->isVideoPlayCompleted(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$300(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 212
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v3}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$600(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/TextView;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v4}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$500(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0f0012

    new-array v1, v1, [Ljava/lang/Object;

    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v2

    invoke-virtual {v4, v5, v0, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 212
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$600(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$700(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/video/VideoController;->getVideoDuration()I

    move-result v0

    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v3}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/video/VideoController;->getCurrentPlaybackTime()I

    move-result v3

    sub-int/2addr v0, v3

    div-int/lit16 v0, v0, 0x3e8

    .line 219
    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v3}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v3}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 220
    :goto_1
    iget-object v4, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v4}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$500(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0f0047

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    .line 223
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    const-string v7, "%02d"

    new-array v8, v1, [Ljava/lang/Object;

    .line 224
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v8, v2

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v1

    .line 220
    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 226
    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$600(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getCurrentPlaybackTime()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v0}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$400(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator$2;->this$0:Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;

    invoke-static {v1}, Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;->access$200(Lcom/shopkick/app/store/OwnTheTripVideoTileViewHolderConfigurator;)Lcom/shopkick/app/video/VideoController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/video/VideoController;->getVideoDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method
