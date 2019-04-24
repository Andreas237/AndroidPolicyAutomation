.class public Lcom/shopkick/app/overlays/OverlayInfo;
.super Ljava/lang/Object;
.source "OverlayInfo.java"


# static fields
.field public static final OverlayEnumOfflineScanFailure:I = 0x15

.field public static final OverlayEnumPostVideo:I = 0x1d

.field public static final OverlayEnumProcessingSurvey:I = 0x20

.field public static final OverlayEnumReceiptScanReminderV2:I = 0x10

.field public static final OverlayEnumRedeemMarketingPromoCode:I = 0x23

.field public static final OverlayEnumRedeemPromoCode:I = 0x1b

.field public static final OverlayReasonUserDidNotAllowMicPerm:I = 0x10

.field private static instance:Lcom/shopkick/app/overlays/OverlayInfo;


# instance fields
.field private keysByOverlay:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private overlayEnumsByKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private overlaysByKey:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;>;"
        }
    .end annotation
.end field

.field private serverSupportedKeys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 5

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    .line 78
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ftue_discover_tab_overlay_2"

    const-class v2, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    const-string v2, "ftue_discover_tab_overlay_2"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ftue_discover_tab_overlay_2"

    const/16 v2, 0x27

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "active_user_engagement"

    const-class v2, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/ActiveUserEngagementOverlay;

    const-string v2, "active_user_engagement"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "active_user_engagement"

    const/16 v2, 0x1c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "active_user_engagement"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "layered"

    const-class v2, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    const-string v2, "layered"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "layered"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "layered"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "mika_receiver"

    const-class v2, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;

    const-string v2, "mika_receiver"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "mika_receiver"

    const/16 v2, 0x11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "mika_receiver"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "processing_survey"

    const-class v2, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;

    const-string v2, "processing_survey"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "processing_survey"

    const/16 v2, 0x20

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "webview"

    const-class v2, Lcom/shopkick/app/overlays/base/WebviewOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/base/WebviewOverlay;

    const-string/jumbo v2, "webview"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "webview"

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string/jumbo v1, "webview"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "post_scan_notification"

    const-class v2, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/PostScanNotificationOverlay;

    const-string v2, "post_scan_notification"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "post_scan_notification"

    const/16 v2, 0x1e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ball"

    const-class v2, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    const-string v2, "ball"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ball"

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "ball"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "batch"

    const-class v2, Lcom/shopkick/app/overlays/common/BatchSKOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/BatchSKOverlay;

    const-string v2, "batch"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "batch"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "save_product_family"

    const-class v3, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;

    const-string v3, "save_product_family"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "save_product_family"

    const/16 v3, 0x17

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "save_product_family"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "walkin_button_error"

    const-class v3, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/WalkinButtonErrorOverlay;

    const-string/jumbo v3, "walkin_button_error"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "walkin_button_error"

    const/16 v3, 0x16

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ftue_earn_tab_overlay_2"

    const-class v3, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;

    const-string v3, "ftue_earn_tab_overlay_2"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ftue_earn_tab_overlay_2"

    const/16 v3, 0x25

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "paypal_redemption_confirmation"

    const-class v3, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;

    const-string v3, "paypal_redemption_confirmation"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "paypal_redemption_confirmation"

    const/16 v3, 0x22

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "rate_the_app"

    const-class v3, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/RateTheAppOverlay;

    const-string v3, "rate_the_app"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "rate_the_app"

    const/16 v3, 0x18

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "rate_the_app"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ftue_earn_tab_overlay_1"

    const-class v3, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay1;

    const-string v3, "ftue_earn_tab_overlay_1"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ftue_earn_tab_overlay_1"

    const/16 v3, 0x24

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ftue_store_details_lesson_overlay_1"

    const-class v3, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/ftue/FTUEStoreDetailsLessonOverlay;

    const-string v3, "ftue_store_details_lesson_overlay_1"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ftue_store_details_lesson_overlay_1"

    const/16 v3, 0x28

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "celebratory_kicks"

    const-class v3, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    const-string v3, "celebratory_kicks"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "celebratory_kicks"

    const/16 v3, 0xd

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "celebratory_kicks"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "reminder"

    const-class v3, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/ReminderSKOverlay;

    const-string v3, "reminder"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "reminder"

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "online_store_landing"

    const-class v4, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;

    const-string v4, "online_store_landing"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "online_store_landing"

    const/16 v4, 0x19

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "online_store_landing"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "scan_mission_completed"

    const-class v4, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/ScanMissionCompletedOverlay;

    const-string v4, "scan_mission_completed"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "scan_mission_completed"

    const/4 v4, 0x7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "scan_mission_completed"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "rejected_kicks"

    const-class v4, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/RejectedKicksOverlay;

    const-string v4, "rejected_kicks"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "rejected_kicks"

    const/16 v4, 0x14

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "rejected_kicks"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "save_product"

    const-class v4, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;

    const-string v4, "save_product"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "save_product"

    const/16 v4, 0x12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "save_product"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "toast"

    const-class v4, Lcom/shopkick/app/overlays/common/ToastSKOverlay;

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/common/ToastSKOverlay;

    const-string/jumbo v4, "toast"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string/jumbo v1, "toast"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "post_scan"

    const-class v3, Lcom/shopkick/app/overlays/scans/PostScanOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/PostScanOverlay;

    const-string v3, "post_scan"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "post_scan"

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "post_scan"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "offline_scan_failure"

    const-class v3, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/OfflineScanFailureOverlay;

    const-string v3, "offline_scan_failure"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "offline_scan_failure"

    const/16 v3, 0x15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "ftue_discover_tab_overlay_1"

    const-class v3, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;

    const-string v3, "ftue_discover_tab_overlay_1"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "ftue_discover_tab_overlay_1"

    const/16 v3, 0x26

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "instant"

    const-class v3, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/InstantWalkinSKOverlay;

    const-string v3, "instant"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "instant"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "offline_scan"

    const-class v2, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;

    const-string v2, "offline_scan"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "offline_scan"

    const/16 v2, 0x13

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "online_store_loading"

    const-class v2, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;

    const-string v2, "online_store_loading"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "online_store_loading"

    const/16 v2, 0x1a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "post_video"

    const-class v2, Lcom/shopkick/app/overlays/video/PostVideoOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/video/PostVideoOverlay;

    const-string v2, "post_video"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "post_video"

    const/16 v2, 0x1d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "post_video"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "receipt_scan_reminder_v2"

    const-class v2, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/receipt/ReceiptScanReminderV2Overlay;

    const-string v2, "receipt_scan_reminder_v2"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "receipt_scan_reminder_v2"

    const/16 v2, 0x10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "receipt_scan_reminder_v2"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "kicks_on_the_way"

    const-class v2, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    const-string v2, "kicks_on_the_way"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "kicks_on_the_way"

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    const-string v1, "kicks_on_the_way"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    const-string v1, "receipt_product_selector_header"

    const-class v2, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    const-class v1, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    const-string v2, "receipt_product_selector_header"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    const-string v1, "receipt_product_selector_header"

    const/16 v2, 0x1f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/app/overlays/OverlayInfo;
    .locals 2

    .line 264
    sget-object v0, Lcom/shopkick/app/overlays/OverlayInfo;->instance:Lcom/shopkick/app/overlays/OverlayInfo;

    if-nez v0, :cond_1

    .line 265
    const-class v0, Lcom/shopkick/app/overlays/OverlayInfo;

    monitor-enter v0

    .line 266
    :try_start_0
    sget-object v1, Lcom/shopkick/app/overlays/OverlayInfo;->instance:Lcom/shopkick/app/overlays/OverlayInfo;

    if-nez v1, :cond_0

    .line 267
    new-instance v1, Lcom/shopkick/app/overlays/OverlayInfo;

    invoke-direct {v1}, Lcom/shopkick/app/overlays/OverlayInfo;-><init>()V

    sput-object v1, Lcom/shopkick/app/overlays/OverlayInfo;->instance:Lcom/shopkick/app/overlays/OverlayInfo;

    .line 269
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 271
    :cond_1
    :goto_0
    sget-object v0, Lcom/shopkick/app/overlays/OverlayInfo;->instance:Lcom/shopkick/app/overlays/OverlayInfo;

    return-object v0
.end method


# virtual methods
.method public classForKey(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;"
        }
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlaysByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    return-object p1
.end method

.method public enumForKey(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->overlayEnumsByKey:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public isServerSupportedKey(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->serverSupportedKeys:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public keyForClass(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/overlays/OverlayInfo;->keysByOverlay:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
