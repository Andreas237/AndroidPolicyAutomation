.class public Lcom/shopkick/app/util/SKMediaScannerConnectionClient;
.super Ljava/lang/Object;
.source "SKMediaScannerConnectionClient.java"

# interfaces
.implements Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# instance fields
.field connectionClientListener:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMediaScannerConnected()V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;->connectionClientListener:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    if-eqz v0, :cond_0

    .line 23
    invoke-interface {v0}, Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;->onMediaScannerConnected()V

    :cond_0
    return-void
.end method

.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;->connectionClientListener:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, p1, p2}, Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;->onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public registerListener(Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/util/SKMediaScannerConnectionClient;->connectionClientListener:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    return-void
.end method
