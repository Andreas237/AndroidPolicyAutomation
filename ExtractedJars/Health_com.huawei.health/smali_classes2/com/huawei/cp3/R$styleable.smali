.class public final Lcom/huawei/cp3/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/cp3/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final AlertDialog:[I

.field public static final AlertDialog_android_layout:I = 0x0

.field public static final AlertDialog_buttonPanelSideLayout:I = 0x1

.field public static final AlertDialog_listItemLayout:I = 0x5

.field public static final AlertDialog_listLayout:I = 0x2

.field public static final AlertDialog_multiChoiceItemLayout:I = 0x3

.field public static final AlertDialog_popupAnimation:I = 0x7

.field public static final AlertDialog_popupAnimationnotitle:I = 0x8

.field public static final AlertDialog_showTitle:I = 0x6

.field public static final AlertDialog_singleChoiceItemLayout:I = 0x4

.field public static final BackgroundWallPager:[I

.field public static final BackgroundWallPager_isNeedSetWallPager:I = 0x0

.field public static final EditTextWithRightText:[I

.field public static final EditTextWithRightText_rightText:I = 0x1

.field public static final EditTextWithRightText_rightTextColor:I = 0x3

.field public static final EditTextWithRightText_rightTextHint:I = 0x0

.field public static final EditTextWithRightText_rightTextHintColor:I = 0x2

.field public static final PopupWindow:[I

.field public static final PopupWindow_android_popupAnimationStyle:I = 0x1

.field public static final PopupWindow_android_popupBackground:I = 0x0

.field public static final PopupWindow_overlapAnchor:I = 0x2

.field public static final PopupWindow_popupAnimationStyle:I = 0x4

.field public static final PopupWindow_popupBackground:I = 0x3

.field public static final SubTab:[I

.field public static final SubTab_hwSubTabBarStyle:I = 0x0

.field public static final SubTab_hwSubTabViewStyle:I = 0x1

.field public static final SubTab_subTabBarStyle:I = 0x2

.field public static final SubTab_subTabViewStyle:I = 0x3

.field public static final Theme:[I

.field public static final Theme_chatPopImageViewStyle:I = 0x2

.field public static final Theme_indeterminateDrawable:I = 0x1

.field public static final Theme_progressDrawable:I = 0x0


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 378
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/cp3/R$styleable;->AlertDialog:[I

    .line 388
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/huawei/cp3/R$styleable;->BackgroundWallPager:[I

    .line 390
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/huawei/cp3/R$styleable;->EditTextWithRightText:[I

    .line 395
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/huawei/cp3/R$styleable;->PopupWindow:[I

    .line 401
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lcom/huawei/cp3/R$styleable;->SubTab:[I

    .line 406
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    sput-object v0, Lcom/huawei/cp3/R$styleable;->Theme:[I

    return-void

    :array_0
    .array-data 4
        0x10100f2
        0x7f01002b
        0x7f01002c
        0x7f01002d
        0x7f01002e
        0x7f01002f
        0x7f010030
        0x7f010031
        0x7f010032
    .end array-data

    :array_1
    .array-data 4
        0x7f0100b4
    .end array-data

    :array_2
    .array-data 4
        0x7f010122
        0x7f010123
        0x7f010124
        0x7f010125
    .end array-data

    :array_3
    .array-data 4
        0x1010176
        0x10102c9
        0x7f0101b1
        0x7f0101b2
        0x7f0101b3
    .end array-data

    :array_4
    .array-data 4
        0x7f0101f6
        0x7f0101f7
        0x7f0101f8
        0x7f0101f9
    .end array-data

    :array_5
    .array-data 4
        0x7f01022c
        0x7f01022d
        0x7f01022e
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
