.class synthetic Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;
.super Ljava/lang/Object;
.source "BonusPickerViewHolderFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->values()[Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/holder/BonusPickerViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$bonus$picker$BonusPickerRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-void
.end method
