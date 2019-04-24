.class synthetic Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;
.super Ljava/lang/Object;
.source "FlyUpPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$fragment$dialog$flyup$LeftControl:[I

.field static final synthetic $SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 162
    invoke-static {}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->values()[Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NONE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v1, 0x2

    :try_start_1
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->NEXT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SUBMIT:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    const/4 v4, 0x4

    aput v4, v2, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    const/4 v4, 0x5

    aput v4, v2, v3
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    const/4 v4, 0x6

    aput v4, v2, v3
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$RightControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->CLOSE_WHITE:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->ordinal()I

    move-result v3

    const/4 v4, 0x7

    aput v4, v2, v3
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 140
    :catch_6
    invoke-static {}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->values()[Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$LeftControl:[I

    :try_start_7
    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$LeftControl:[I

    sget-object v3, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->PREVIOUS:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerAdapter$1;->$SwitchMap$com$ibotta$android$fragment$dialog$flyup$LeftControl:[I

    sget-object v2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method
