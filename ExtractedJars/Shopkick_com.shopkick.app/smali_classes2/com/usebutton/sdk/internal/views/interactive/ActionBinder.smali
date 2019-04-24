.class public Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;
.super Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;
.source "ActionBinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;
    }
.end annotation


# static fields
.field private static final MAX_ITEMS:I = 0x32


# instance fields
.field private final mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private mInventory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation
.end field

.field private mItemLimit:I


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/InteractiveButton;Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;-><init>(Lcom/usebutton/sdk/InteractiveButton;)V

    .line 46
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)Landroid/content/Context;
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)I
    .locals 0

    .line 38
    iget p0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mItemLimit:I

    return p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;)Lcom/usebutton/sdk/internal/ImageLoader;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    return-object p0
.end method

.method private getContext()Landroid/content/Context;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method private getInventoryLimit(Lcom/usebutton/sdk/internal/models/Configuration;)I
    .locals 1

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getInventoryButtonLimit()I

    move-result v0

    if-lez v0, :cond_0

    .line 69
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getInventoryButtonLimit()I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0x32

    return p1
.end method


# virtual methods
.method public applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V
    .locals 0

    .line 77
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V

    return-void
.end method

.method public bind(Lcom/usebutton/sdk/internal/models/AppAction;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ")V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/PreviewView;->setIsLoading(Z)V

    .line 53
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getListBody()Lcom/usebutton/sdk/models/ListBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/ListBody;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/InventoryGroup;

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/InventoryGroup;->getInventory()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mInventory:Ljava/util/List;

    .line 54
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->getInventoryLimit(Lcom/usebutton/sdk/internal/models/Configuration;)I

    move-result p3

    iput p3, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mItemLimit:I

    .line 55
    iget-object p3, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object p3

    instance-of p3, p3, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    if-nez p3, :cond_0

    .line 56
    iget-object p3, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    new-instance v0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mInventory:Ljava/util/List;

    invoke-direct {v0, p0, v1, p2}, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder$PagerAdapter;-><init>(Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;Ljava/util/List;Lcom/usebutton/sdk/internal/util/Receiver;)V

    invoke-virtual {p3, v0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 59
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getPreview()Lcom/usebutton/sdk/internal/models/Preview;

    move-result-object p1

    .line 60
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Preview;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p3

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Preview;->getText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Preview;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object p1

    invoke-virtual {p2, p3, v0, p1}, Lcom/usebutton/sdk/internal/views/PreviewView;->bind(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)V

    .line 61
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mLoadingDots:Lcom/usebutton/sdk/internal/views/LoadingDots;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    .line 62
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/ActionBinder;->mLoadingDots:Lcom/usebutton/sdk/internal/views/LoadingDots;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/LoadingDots;->setVisibility(I)V

    return-void
.end method
