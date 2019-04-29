.class public Lcom/mopub/nativeads/MediaViewBinder;
.super Ljava/lang/Object;
.source "MediaViewBinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/MediaViewBinder$Builder;
    }
.end annotation


# instance fields
.field final callToActionId:I

.field final extras:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final iconImageId:I

.field final layoutId:I

.field final mediaLayoutId:I

.field final privacyInformationIconImageId:I

.field final textId:I

.field final titleId:I


# direct methods
.method private constructor <init>(Lcom/mopub/nativeads/MediaViewBinder$Builder;)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/MediaViewBinder$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$100(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->layoutId:I

    .line 91
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$200(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->mediaLayoutId:I

    .line 92
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$300(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->titleId:I

    .line 93
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$400(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->textId:I

    .line 94
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$500(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->callToActionId:I

    .line 95
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$600(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->iconImageId:I

    .line 96
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$700(Lcom/mopub/nativeads/MediaViewBinder$Builder;)I

    move-result v0

    iput v0, p0, Lcom/mopub/nativeads/MediaViewBinder;->privacyInformationIconImageId:I

    .line 97
    invoke-static {p1}, Lcom/mopub/nativeads/MediaViewBinder$Builder;->access$800(Lcom/mopub/nativeads/MediaViewBinder$Builder;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/MediaViewBinder;->extras:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/nativeads/MediaViewBinder$Builder;Lcom/mopub/nativeads/MediaViewBinder$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/MediaViewBinder;-><init>(Lcom/mopub/nativeads/MediaViewBinder$Builder;)V

    return-void
.end method
