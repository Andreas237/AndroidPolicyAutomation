.class public Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ScanMissionCompletedOverlay.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;
    }
.end annotation


# instance fields
.field private logoImageView:Landroid/widget/ImageView;

.field private mainView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;)Landroid/view/View;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    return-object p0
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .line 45
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f090767

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f090708

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 49
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f09044e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->logoImageView:Landroid/widget/ImageView;

    .line 53
    new-instance p1, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$DismissCallback;-><init>(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$1;)V

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f09045c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 55
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0900c6

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 56
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    new-instance p1, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay$1;-><init>(Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;)V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->logoImageView:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->logoImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->logoImageView:Landroid/widget/ImageView;

    invoke-static {v0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    .line 40
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022f

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0196

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 31
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->scanMissionId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->scanMissionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
