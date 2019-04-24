.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/gallery/-$$Lambda$OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask$SWv2s_r3lkukabHo3pcFL3LYJLI;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ibotta/android/view/model/GallerySection;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/OfferAnomalyDetector$OfferAnomalyTrackerAsyncTask;->lambda$doInBackground$0(Lcom/ibotta/android/view/model/GallerySection;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
