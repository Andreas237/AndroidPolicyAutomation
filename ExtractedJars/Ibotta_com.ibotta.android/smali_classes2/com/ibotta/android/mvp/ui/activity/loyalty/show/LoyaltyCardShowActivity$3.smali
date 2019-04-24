.class synthetic Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;
.super Ljava/lang/Object;
.source "LoyaltyCardShowActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 168
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->values()[Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;->$SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;->$SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NOT_CONNECTED:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;->$SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NUMERIC_CARD:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity$3;->$SwitchMap$com$ibotta$android$mvp$ui$activity$loyalty$show$Presentation$State:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->BARCODE_CARD:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
