.class final Lcom/usebutton/sdk/internal/views/AssetImageView$1;
.super Ljava/lang/Object;
.source "AssetImageView.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/views/AssetImageView$Decoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/AssetImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public decodeImageWithin([BII)Landroid/graphics/Bitmap;
    .locals 0

    .line 23
    invoke-static {p1, p2, p3}, Lcom/usebutton/sdk/internal/util/ViewUtils;->decodeImageWithin([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
