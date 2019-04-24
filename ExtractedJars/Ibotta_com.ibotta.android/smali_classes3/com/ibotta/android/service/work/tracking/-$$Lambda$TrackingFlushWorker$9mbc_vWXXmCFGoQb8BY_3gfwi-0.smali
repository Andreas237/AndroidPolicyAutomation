.class public final synthetic Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntFunction;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

.field private final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    iput-object p2, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;->f$0:Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;

    iget-object v1, p0, Lcom/ibotta/android/service/work/tracking/-$$Lambda$TrackingFlushWorker$9mbc_vWXXmCFGoQb8BY_3gfwi-0;->f$1:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;->lambda$eventsMapValuesToStringParts$4(Lcom/ibotta/android/service/work/tracking/TrackingFlushWorker;Ljava/util/List;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
