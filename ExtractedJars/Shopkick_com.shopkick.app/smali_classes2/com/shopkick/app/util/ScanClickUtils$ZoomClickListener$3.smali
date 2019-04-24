.class Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Lcom/github/chrisbanes/photoview/OnScaleChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->setImagePostDelayed(Lcom/github/chrisbanes/photoview/PhotoView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

.field final synthetic val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;Lcom/github/chrisbanes/photoview/PhotoView;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScaleChange(FFF)V
    .locals 0

    .line 391
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {p1}, Lcom/github/chrisbanes/photoview/PhotoView;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_0

    .line 392
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    invoke-virtual {p2}, Lcom/github/chrisbanes/photoview/PhotoView;->getScale()F

    move-result p2

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_0

    .line 393
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0xb5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x34

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 394
    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$100(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 396
    iget-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->this$0:Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    invoke-static {p2}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;->access$400(Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 397
    iget-object p1, p0, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener$3;->val$imageView:Lcom/github/chrisbanes/photoview/PhotoView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/github/chrisbanes/photoview/PhotoView;->setTag(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
