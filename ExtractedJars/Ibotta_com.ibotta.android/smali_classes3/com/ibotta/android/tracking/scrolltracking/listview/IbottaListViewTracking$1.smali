.class synthetic Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;
.super Ljava/lang/Object;
.source "IbottaListViewTracking.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 143
    invoke-static {}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->values()[Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->OFFER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
