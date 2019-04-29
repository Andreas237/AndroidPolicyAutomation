.class public Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "InVisionViewPagerFragment.java"


# static fields
.field private static final IMAGE_DATA_EXTRA:Ljava/lang/String; = "extra_picture_data"


# instance fields
.field Bloc_description:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09002e
    .end annotation
.end field

.field RootFrame:Landroid/widget/FrameLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090132
    .end annotation
.end field

.field imageCopyView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09011b
    .end annotation
.end field

.field imageDescrView:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f09011c
    .end annotation
.end field

.field imageView:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0900aa
    .end annotation
.end field

.field private inVisionPictureItem:Lcom/rt/mobile/english/ui/InVisionPictureItem;

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;I)Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;
    .locals 3

    .line 42
    new-instance v0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;

    invoke-direct {v0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;-><init>()V

    .line 44
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "extra_picture_data"

    .line 45
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "position"

    .line 46
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 47
    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public hideDescription()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2

    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 100
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f10002a

    invoke-virtual {p0, v1}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/rt/mobile/english/Utils;->sendAnalytics(Landroid/app/Activity;Ljava/lang/String;)V

    .line 101
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->inVisionPictureItem:Lcom/rt/mobile/english/ui/InVisionPictureItem;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/InVisionPictureItem;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v0, v1}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 114
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageDescrView:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->inVisionPictureItem:Lcom/rt/mobile/english/ui/InVisionPictureItem;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/InVisionPictureItem;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageCopyView:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->inVisionPictureItem:Lcom/rt/mobile/english/ui/InVisionPictureItem;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/InVisionPictureItem;->getAuthor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->RootFrame:Landroid/widget/FrameLayout;

    new-instance v0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment$1;-><init>(Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 60
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 61
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 66
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 68
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "extra_picture_data"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 70
    :goto_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/rt/mobile/english/ui/InVisionPictureItem;->fromJSON(Lorg/json/JSONObject;)Lcom/rt/mobile/english/ui/InVisionPictureItem;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->inVisionPictureItem:Lcom/rt/mobile/english/ui/InVisionPictureItem;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 72
    invoke-static {p1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c005d

    const/4 v0, 0x0

    .line 91
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 92
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 141
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 142
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageView:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->imageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public visiblyDescription()V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/rt/mobile/english/ui/InVisionViewPagerFragment;->Bloc_description:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
