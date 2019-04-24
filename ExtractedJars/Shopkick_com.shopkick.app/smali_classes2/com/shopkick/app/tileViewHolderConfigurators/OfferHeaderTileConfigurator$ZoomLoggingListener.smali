.class Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;
.super Ljava/lang/Object;
.source "OfferHeaderTileConfigurator.java"

# interfaces
.implements Lcom/github/chrisbanes/photoview/OnScaleChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ZoomLoggingListener"
.end annotation


# instance fields
.field private adapter:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

.field private imageUrl:Ljava/lang/String;

.field private photoView:Lcom/github/chrisbanes/photoview/PhotoView;

.field private positionInCarousel:I

.field private productFamilyId:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;Lcom/github/chrisbanes/photoview/PhotoView;Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 214
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->positionInCarousel:I

    .line 221
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->photoView:Lcom/github/chrisbanes/photoview/PhotoView;

    .line 222
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    .line 223
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->imageUrl:Ljava/lang/String;

    .line 224
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->productFamilyId:Ljava/lang/String;

    .line 225
    iput p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->positionInCarousel:I

    return-void
.end method


# virtual methods
.method public onScaleChange(FFF)V
    .locals 0

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->photoView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {p1}, Lcom/github/chrisbanes/photoview/PhotoView;->getAttacher()Lcom/github/chrisbanes/photoview/PhotoViewAttacher;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 234
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->photoView:Lcom/github/chrisbanes/photoview/PhotoView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/github/chrisbanes/photoview/PhotoView;->setOnScaleChangeListener(Lcom/github/chrisbanes/photoview/OnScaleChangedListener;)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->getImageLogged(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 237
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$SKViewPagerAdapter;->setImageLogged(Ljava/lang/String;)V

    .line 239
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0xd2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x34

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 240
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 241
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->imageUrl:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 242
    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setImageUrl(Ljava/lang/String;)V

    .line 243
    iget p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->positionInCarousel:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPosition(Ljava/lang/Integer;)V

    .line 246
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator$ZoomLoggingListener;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;

    iget-object p2, p2, Lcom/shopkick/app/tileViewHolderConfigurators/OfferHeaderTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method
