.class public Lcom/shopkick/app/widget/SKSignalView;
.super Landroid/widget/RelativeLayout;
.source "SKSignalView.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

.field clickListener:Landroid/view/View$OnClickListener;

.field clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

.field dialog:Landroid/app/AlertDialog;

.field dialogListener:Landroid/content/DialogInterface$OnClickListener;

.field indicatorButton:Landroid/widget/ImageView;

.field indicatorImg:Landroid/widget/ImageView;

.field isShowing:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/lang/String;Lcom/shopkick/app/presence/AudioThreadController;)V
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/shopkick/app/widget/SKSignalView;->isShowing:Z

    .line 78
    new-instance v0, Lcom/shopkick/app/widget/SKSignalView$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/widget/SKSignalView$1;-><init>(Lcom/shopkick/app/widget/SKSignalView;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/SKSignalView;->clickListener:Landroid/view/View$OnClickListener;

    .line 111
    new-instance v0, Lcom/shopkick/app/widget/SKSignalView$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/widget/SKSignalView$2;-><init>(Lcom/shopkick/app/widget/SKSignalView;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/SKSignalView;->dialogListener:Landroid/content/DialogInterface$OnClickListener;

    .line 38
    iput-object p3, p0, Lcom/shopkick/app/widget/SKSignalView;->clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 39
    iput-object p5, p0, Lcom/shopkick/app/widget/SKSignalView;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    .line 40
    invoke-direct {p0, p1, p2, p4}, Lcom/shopkick/app/widget/SKSignalView;->init(Landroid/content/Context;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Ljava/lang/String;)V

    return-void
.end method

.method private init(Landroid/content/Context;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Ljava/lang/String;)V
    .locals 3

    const-string v0, "layout_inflater"

    .line 62
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f0c01b6

    const/4 v2, 0x1

    .line 65
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const v0, 0x7f0906a1

    .line 68
    invoke-virtual {p0, v0}, Lcom/shopkick/app/widget/SKSignalView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/widget/SKSignalView;->indicatorButton:Landroid/widget/ImageView;

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0802cd

    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 70
    invoke-virtual {p2, p1}, Lcom/shopkick/app/graphics/ButtonDrawableFactory;->createButtonDrawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/widget/SKSignalView;->indicatorButton:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const p1, 0x7f0906a2

    .line 72
    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/SKSignalView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/widget/SKSignalView;->indicatorImg:Landroid/widget/ImageView;

    .line 73
    invoke-direct {p0, p3}, Lcom/shopkick/app/widget/SKSignalView;->setIndicatorImage(Ljava/lang/String;)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalView;->indicatorButton:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/shopkick/app/widget/SKSignalView;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setIndicatorImage(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalView;->indicatorImg:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    const-string v1, "PresenceControllerDetectedSignal"

    if-ne p1, v1, :cond_0

    const p1, 0x7f0802d0

    .line 51
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    const-string v1, "PresenceControllerDetectedSignalLost"

    if-ne p1, v1, :cond_1

    const p1, 0x7f0802cf

    .line 53
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    const-string v1, "PresenceControllerDetectedCode"

    if-ne p1, v1, :cond_2

    const p1, 0x7f0802ce

    .line 55
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/widget/SKSignalView;->setIndicatorImage(Ljava/lang/String;)V

    return-void
.end method
