.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

.field private final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;->f$0:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;->f$0:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/-$$Lambda$BaseScanActivity$AI7P5iyWymD4IN4AeZwz9qU15Ww;->f$1:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->lambda$didScan$0(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Ljava/util/List;)V

    return-void
.end method
