.class public final Lcom/myfitnesspal/android/sdk/MarketConstants$Uris;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/android/sdk/MarketConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Uris"
.end annotation


# static fields
.field public static final AMAZON_MARKETPLACE:Ljava/lang/String; = "http://www.amazon.com/Calorie-Counter-Diet-Tracker-MyFitnessPal/dp/B004H6WTJI"

.field public static final GOOGLE_PLAY_MARKETPLACE:Ljava/lang/String; = "market://details?id=com.myfitnesspal.android&referrer=%s"

.field public static final GOOGLE_PLAY_WEB:Ljava/lang/String; = "https://play.google.com/store/apps/details?id=com.myfitnesspal.android&referrer=%s"

.field public static final TEST_APP:Ljava/lang/String; = "market://details?id=com.myfitnesspal.marketplacetest&referrer=%s"

.field public static final TEST_APP_WEB:Ljava/lang/String; = "https://play.google.com/store/apps/details?id=com.myfitnesspal.marketplacetest&referrer=%s"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
