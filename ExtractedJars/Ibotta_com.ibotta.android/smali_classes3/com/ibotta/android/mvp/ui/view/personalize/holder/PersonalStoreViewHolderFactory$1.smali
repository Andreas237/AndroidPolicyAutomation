.class synthetic Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory$1;
.super Ljava/lang/Object;
.source "PersonalStoreViewHolderFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$mvp$ui$view$personalize$PersonalStoreRowType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 17
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->values()[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$personalize$PersonalStoreRowType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$personalize$PersonalStoreRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$personalize$PersonalStoreRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
