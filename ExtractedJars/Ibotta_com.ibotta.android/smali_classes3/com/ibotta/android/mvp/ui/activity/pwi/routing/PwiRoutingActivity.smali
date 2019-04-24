.class public Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PwiRoutingActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;"
    }
.end annotation


# instance fields
.field private intentBundle:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v0, "activity"

    .line 49
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    const-string v1, "retailer"

    .line 50
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v2, "gallery_extras_bundle"

    .line 51
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->intentBundle:Landroid/os/Bundle;

    move-object p1, v1

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "retailer"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->intentBundle:Landroid/os/Bundle;

    goto :goto_0

    :cond_1
    move-object p1, v0

    .line 58
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;

    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 59
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;->setParentActivityClass(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;
    .locals 1

    .line 27
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;

    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;)V

    .line 29
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;->pwiRoutingModule(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingModule;)Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/DaggerPwiRoutingComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;)V
    .locals 0

    .line 35
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->loadState(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "gallery_extras_bundle"

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->intentBundle:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;->getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "activity"

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;->getParentActivityClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method public showPwiHome(I)V
    .locals 1

    .line 72
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->startActivity(Landroid/content/Intent;)V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->finish()V

    return-void
.end method

.method public showRetailerGallery(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 78
    new-instance v0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->intentBundle:Landroid/os/Bundle;

    .line 79
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->galleryIntentCreatorBundle(Landroid/os/Bundle;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    const/4 v0, 0x1

    .line 80
    invoke-virtual {p1, v0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRouteToGallery(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;

    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->startActivity(Landroid/content/Intent;)V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;->finish()V

    return-void
.end method
