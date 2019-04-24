.class public Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;
.super Landroid/app/Activity;
.source "CampaignOverlayActivity.java"


# static fields
.field public static final EXTRA_BLE_ID:Ljava/lang/String; = "com.shopkick.sdk.BLE_ID"

.field public static final EXTRA_BLE_PROXIMITY:Ljava/lang/String; = "com.shopkick.sdk.BLE_PROXIMITY"

.field public static final EXTRA_CAMPAIGN_ID:Ljava/lang/String; = "com.shopkick.sdk.CAMPAIGN_ID"

.field public static final EXTRA_CHAIN_ID:Ljava/lang/String; = "com.shopkick.sdk.CHAIN_ID"

.field public static final EXTRA_IS_BLE:Ljava/lang/String; = "com.shopkick.skd.IS_BLE"

.field public static final EXTRA_LOGGING_ENABLED:Ljava/lang/String; = "com.shopkick.sdk.LOGGING_ENABLED"

.field public static final EXTRA_LOGO_BITMAP:Ljava/lang/String; = "com.shopkick.sdk.LOGO_BITMAP"

.field public static final EXTRA_MESSAGE_ID:Ljava/lang/String; = "com.shopkick.sdk.MESSAGE_ID"

.field public static final EXTRA_OVERLAY_BITMAP:Ljava/lang/String; = "com.shopkick.sdk.OVERLAY_BITMAP"

.field public static final EXTRA_OVERLAY_TEXT:Ljava/lang/String; = "com.shopkick.sdk.OVERLAY_TEXT"

.field public static final EXTRA_OVERLAY_URL:Ljava/lang/String; = "com.shopkick.sdk.OVERLAY_URL"

.field public static final EXTRA_STORE_ID:Ljava/lang/String; = "com.shopkick.sdk.STORE_ID"

.field private static final TAG:Ljava/lang/String; = "CampaignOverlayActivity"


# instance fields
.field private bleAnalyticsLogger:Lcom/shopkick/sdk/core/EventLogger;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private bleId:I

.field private campaignId:Ljava/lang/String;

.field private chainId:Ljava/lang/String;

.field private geoAnalyticsLogger:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

.field private isBleCampaign:Z

.field private isLoggingEnabled:Z

.field private messageId:Ljava/lang/String;

.field private noButton:Landroid/widget/Button;

.field private overlayTitle:Landroid/widget/TextView;

.field private proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

.field private storeId:Ljava/lang/String;

.field private yesButton:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->dismissActivity()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;Landroid/content/Intent;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->userClickThrough(Landroid/content/Intent;)V

    return-void
.end method

.method private dismissActivity()V
    .locals 2

    .line 192
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isBleCampaign:Z

    const/4 v1, 0x6

    if-eqz v0, :cond_0

    .line 193
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logBleEvent(I)V

    goto :goto_0

    .line 195
    :cond_0
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logGeoEvent(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    const/4 v0, 0x0

    .line 200
    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->setResult(I)V

    .line 201
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->finish()V

    return-void
.end method

.method private initOverlay(Landroid/content/Intent;)V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->noButton:Landroid/widget/Button;

    new-instance v1, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$1;

    invoke-direct {v1, p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$1;-><init>(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->yesButton:Landroid/widget/Button;

    new-instance v1, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity$2;-><init>(Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->overlayTitle:Landroid/widget/TextView;

    const-string v1, "com.shopkick.sdk.OVERLAY_TEXT"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    sget v0, Lcom/shopkick/sdk/R$id;->logo:I

    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "com.shopkick.sdk.LOGO_BITMAP"

    .line 157
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 156
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 158
    sget v0, Lcom/shopkick/sdk/R$id;->overlay_image:I

    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "com.shopkick.sdk.OVERLAY_BITMAP"

    .line 159
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    .line 158
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 161
    invoke-direct {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->overlayDisplayedEvent()V

    return-void
.end method

.method private logBleEvent(I)V
    .locals 7

    .line 205
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isLoggingEnabled:Z

    if-nez v0, :cond_0

    .line 206
    sget-object p1, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->TAG:Ljava/lang/String;

    const-string v0, "Logging disabled"

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 210
    :cond_0
    iget v3, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->bleId:I

    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    iget-object v4, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    if-eqz v4, :cond_1

    iget-object v1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->bleAnalyticsLogger:Lcom/shopkick/sdk/core/EventLogger;

    if-eqz v1, :cond_1

    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/sdk/core/EventLogger;->logEvent(IILcom/shopkick/sdk/zone/ble/Proximity;J)V

    goto :goto_0

    .line 213
    :cond_1
    sget-object p1, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->TAG:Ljava/lang/String;

    const-string v0, "Cannot log BLE event"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private logGeoEvent(I)V
    .locals 10

    .line 218
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isLoggingEnabled:Z

    if-nez v0, :cond_0

    .line 219
    sget-object p1, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->TAG:Ljava/lang/String;

    const-string v0, "Logging disabled"

    invoke-static {p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 223
    :cond_0
    iget-object v1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->geoAnalyticsLogger:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/4 v5, 0x1

    iget-object v6, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->chainId:Ljava/lang/String;

    iget-object v7, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->storeId:Ljava/lang/String;

    iget-object v8, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->campaignId:Ljava/lang/String;

    iget-object v9, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->messageId:Ljava/lang/String;

    move v2, p1

    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->logBasicEvent(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private overlayDisplayedEvent()V
    .locals 2

    .line 165
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isBleCampaign:Z

    const/4 v1, 0x5

    if-eqz v0, :cond_0

    .line 166
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logBleEvent(I)V

    goto :goto_0

    .line 168
    :cond_0
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logGeoEvent(I)V

    :goto_0
    return-void
.end method

.method private userClickThrough(Landroid/content/Intent;)V
    .locals 3

    .line 174
    :try_start_0
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isBleCampaign:Z

    const/4 v1, 0x7

    if-eqz v0, :cond_0

    .line 175
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logBleEvent(I)V

    goto :goto_0

    .line 177
    :cond_0
    invoke-direct {p0, v1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->logGeoEvent(I)V

    .line 179
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.shopkick.sdk.OVERLAY_URL"

    const-string v2, "com.shopkick.sdk.OVERLAY_URL"

    .line 180
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v0, -0x1

    .line 181
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->setResult(ILandroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 186
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->finish()V

    throw p1

    :catch_0
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->finish()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 137
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 138
    invoke-direct {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->dismissActivity()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 94
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 96
    sget p1, Lcom/shopkick/sdk/R$layout;->overlay:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->setContentView(I)V

    .line 99
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "com.shopkick.sdk.LOGGING_ENABLED"

    const/4 v1, 0x0

    .line 100
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isLoggingEnabled:Z

    .line 101
    invoke-static {}, Lcom/shopkick/sdk/analytics/AnalyticsLogger;->getInstance()Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->geoAnalyticsLogger:Lcom/shopkick/sdk/analytics/AnalyticsLogger;

    .line 102
    invoke-static {}, Lcom/shopkick/sdk/core/EventLogger;->getInstance()Lcom/shopkick/sdk/core/EventLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->bleAnalyticsLogger:Lcom/shopkick/sdk/core/EventLogger;

    const-string v0, "com.shopkick.skd.IS_BLE"

    .line 103
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isBleCampaign:Z

    .line 104
    iget-boolean v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->isBleCampaign:Z

    if-eqz v0, :cond_0

    const-string v0, "com.shopkick.sdk.BLE_ID"

    const/4 v1, -0x1

    .line 105
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->bleId:I

    const-string v0, "com.shopkick.sdk.BLE_PROXIMITY"

    .line 106
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    :cond_0
    const-string v0, "com.shopkick.sdk.CHAIN_ID"

    .line 108
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->chainId:Ljava/lang/String;

    const-string v0, "com.shopkick.sdk.STORE_ID"

    .line 109
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->storeId:Ljava/lang/String;

    const-string v0, "com.shopkick.sdk.CAMPAIGN_ID"

    .line 110
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->campaignId:Ljava/lang/String;

    const-string v0, "com.shopkick.sdk.MESSAGE_ID"

    .line 111
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->messageId:Ljava/lang/String;

    .line 113
    sget p1, Lcom/shopkick/sdk/R$id;->no:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->noButton:Landroid/widget/Button;

    .line 114
    sget p1, Lcom/shopkick/sdk/R$id;->yes:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->yesButton:Landroid/widget/Button;

    .line 116
    sget p1, Lcom/shopkick/sdk/R$id;->overlay_text:I

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->overlayTitle:Landroid/widget/TextView;

    .line 118
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->initOverlay(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 121
    :catch_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->finish()V

    :goto_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 128
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 129
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->setIntent(Landroid/content/Intent;)V

    .line 131
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/campaign/CampaignOverlayActivity;->initOverlay(Landroid/content/Intent;)V

    return-void
.end method
