.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$1;
.super Ljava/lang/Object;
.source "OfferHeaderTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter$1;->this$1:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 331
    move-object v0, p1

    check-cast v0, Lcom/github/chrisbanes/photoview/PhotoView;

    .line 332
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/github/chrisbanes/photoview/PhotoView;->setAllowParentInterceptOnEdge(Z)V

    .line 333
    invoke-virtual {v0}, Lcom/github/chrisbanes/photoview/PhotoView;->getAttacher()Lcom/github/chrisbanes/photoview/PhotoViewAttacher;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/github/chrisbanes/photoview/PhotoViewAttacher;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
