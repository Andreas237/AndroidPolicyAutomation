.class Lcom/mopub/nativeads/MediaViewHolder;
.super Ljava/lang/Object;
.source "MediaViewHolder.java"


# static fields
.field static final EMPTY_MEDIA_VIEW_HOLDER:Lcom/mopub/nativeads/MediaViewHolder;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field callToActionView:Landroid/widget/TextView;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field iconImageView:Landroid/widget/ImageView;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field mainView:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field mediaLayout:Lcom/mopub/nativeads/MediaLayout;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field privacyInformationIconImageView:Landroid/widget/ImageView;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field textView:Landroid/widget/TextView;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field titleView:Landroid/widget/TextView;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/mopub/nativeads/MediaViewHolder;

    invoke-direct {v0}, Lcom/mopub/nativeads/MediaViewHolder;-><init>()V

    sput-object v0, Lcom/mopub/nativeads/MediaViewHolder;->EMPTY_MEDIA_VIEW_HOLDER:Lcom/mopub/nativeads/MediaViewHolder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static fromViewBinder(Landroid/view/View;Lcom/mopub/nativeads/MediaViewBinder;)Lcom/mopub/nativeads/MediaViewHolder;
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/mopub/nativeads/MediaViewBinder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 30
    new-instance v0, Lcom/mopub/nativeads/MediaViewHolder;

    invoke-direct {v0}, Lcom/mopub/nativeads/MediaViewHolder;-><init>()V

    .line 31
    iput-object p0, v0, Lcom/mopub/nativeads/MediaViewHolder;->mainView:Landroid/view/View;

    .line 33
    :try_start_0
    iget v1, p1, Lcom/mopub/nativeads/MediaViewBinder;->titleId:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->titleView:Landroid/widget/TextView;

    .line 34
    iget v1, p1, Lcom/mopub/nativeads/MediaViewBinder;->textId:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->textView:Landroid/widget/TextView;

    .line 35
    iget v1, p1, Lcom/mopub/nativeads/MediaViewBinder;->callToActionId:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->callToActionView:Landroid/widget/TextView;

    .line 37
    iget v1, p1, Lcom/mopub/nativeads/MediaViewBinder;->mediaLayoutId:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/mopub/nativeads/MediaLayout;

    iput-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->mediaLayout:Lcom/mopub/nativeads/MediaLayout;

    .line 38
    iget v1, p1, Lcom/mopub/nativeads/MediaViewBinder;->iconImageId:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lcom/mopub/nativeads/MediaViewHolder;->iconImageView:Landroid/widget/ImageView;

    .line 40
    iget p1, p1, Lcom/mopub/nativeads/MediaViewBinder;->privacyInformationIconImageId:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    iput-object p0, v0, Lcom/mopub/nativeads/MediaViewHolder;->privacyInformationIconImageView:Landroid/widget/ImageView;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    const-string p1, "Could not cast from id in MediaViewBinder to expected View type"

    .line 44
    invoke-static {p1, p0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    sget-object p0, Lcom/mopub/nativeads/MediaViewHolder;->EMPTY_MEDIA_VIEW_HOLDER:Lcom/mopub/nativeads/MediaViewHolder;

    return-object p0
.end method
