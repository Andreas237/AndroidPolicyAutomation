.class synthetic Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;
.super Ljava/lang/Object;
.source "DebugMenuPresenterImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->values()[Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_GENERAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_LOADING:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_ROUTES:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_GEOFENCE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->FIND_ENGAGEMENTS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->TEST_SEMI_MODAL:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_FEATURE_FLAGS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_IMAGE_TRANSPARENCY:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_SPOTLIGHT_OFFER_TITLE:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PWI_CLEAR_ONBOARDING_FLAG:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :try_start_a
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$debug$DebugMenuAdapter$DebugMenuItem:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->DEBUG_PERMISSION_PRIMERS:Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/DebugMenuAdapter$DebugMenuItem;->ordinal()I

    move-result v1

    const/16 v2, 0xb

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    return-void
.end method
