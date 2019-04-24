.class public Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;
.super Lcom/unionpay/tsmservice/request/RequestParams;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private mConfirmBtnHeight:I

.field private mConfirmBtnOutPaddingRight:I

.field private mConfirmBtnWidth:I

.field private mDelBgBitmap:Landroid/graphics/Bitmap;

.field private mDelBgColor:I

.field private mDelForeBitmap:Landroid/graphics/Bitmap;

.field private mDoneBgBitmap:Landroid/graphics/Bitmap;

.field private mDoneBgColor:I

.field private mDoneForeBitmap:Landroid/graphics/Bitmap;

.field private mDoneRight:I

.field private mEnableLightStatusBar:Z

.field private mEnableOKBtn:I

.field private mInnerPaddingBottom:I

.field private mInnerPaddingLeft:I

.field private mInnerPaddingRight:I

.field private mInnerPaddingTop:I

.field private mIsAudio:I

.field private mIsDefaultPosition:I

.field private mIsVibrate:I

.field private mKeyboardBgBitmap:Landroid/graphics/Bitmap;

.field private mKeyboardBgColor:I

.field private mKeyboardHeight:I

.field private mKeyboardWidth:I

.field private mMarginCol:I

.field private mMarginRow:I

.field private mNinePatchBackground:Lcom/unionpay/tsmservice/data/NinePatchInfo;

.field private mNinePatchDelKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

.field private mNinePatchDoneKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

.field private mNinePatchNumKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

.field private mNinePatchTitleBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

.field private mNumBgBitmap:Landroid/graphics/Bitmap;

.field private mNumBgColor:I

.field private mNumForeBitmaps:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private mNumSize:I

.field private mNumberKeyColor:I

.field private mOutPaddingBottom:I

.field private mOutPaddingLeft:I

.field private mOutPaddingRight:I

.field private mOutPaddingTop:I

.field private mSecureHeight:I

.field private mSecureWidth:I

.field private mStartX:I

.field private mStartY:I

.field private mTitle:Ljava/lang/String;

.field private mTitleBgBitmap:Landroid/graphics/Bitmap;

.field private mTitleBgColor:I

.field private mTitleColor:I

.field private mTitleDrawablePadding:I

.field private mTitleDropBitmap:Landroid/graphics/Bitmap;

.field private mTitleFont:I

.field private mTitleHeight:I

.field private mTitleIconBitmap:Landroid/graphics/Bitmap;

.field private mTitleSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    new-instance v0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 98
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    .line 16
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    .line 21
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    .line 22
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    .line 58
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    .line 64
    const/4 v0, 0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    .line 70
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    .line 72
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    .line 73
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    .line 100
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 102
    invoke-direct {p0}, Lcom/unionpay/tsmservice/request/RequestParams;-><init>()V

    .line 13
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    .line 16
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    .line 18
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    .line 21
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    .line 22
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    .line 58
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    .line 64
    const/4 v0, 0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    .line 70
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    .line 72
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    .line 73
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitle:Ljava/lang/String;

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    .line 129
    const-class v0, Landroid/graphics/Bitmap;

    .line 130
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgBitmap:Landroid/graphics/Bitmap;

    .line 132
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgBitmap:Landroid/graphics/Bitmap;

    .line 133
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleIconBitmap:Landroid/graphics/Bitmap;

    .line 134
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDropBitmap:Landroid/graphics/Bitmap;

    .line 136
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneForeBitmap:Landroid/graphics/Bitmap;

    .line 137
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgBitmap:Landroid/graphics/Bitmap;

    .line 139
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelForeBitmap:Landroid/graphics/Bitmap;

    .line 140
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgBitmap:Landroid/graphics/Bitmap;

    .line 142
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgBitmap:Landroid/graphics/Bitmap;

    .line 143
    const-class v0, Ljava/util/ArrayList;

    .line 144
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumForeBitmaps:Ljava/util/ArrayList;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    .line 163
    const-class v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 164
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchBackground:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 165
    const-class v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 166
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDelKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 167
    const-class v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 168
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDoneKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 169
    const-class v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 170
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchNumKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 171
    const-class v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 172
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    iput-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchTitleBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    .line 174
    return-void
.end method


# virtual methods
.method public getConfirmBtnHeight()I
    .locals 1

    .line 278
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    return v0
.end method

.method public getConfirmBtnOutPaddingRight()I
    .locals 1

    .line 374
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    return v0
.end method

.method public getConfirmBtnWidth()I
    .locals 1

    .line 270
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    return v0
.end method

.method public getDefaultPosition()I
    .locals 1

    .line 622
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    return v0
.end method

.method public getDelBgBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 446
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getDelBgColor()I
    .locals 1

    .line 494
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    return v0
.end method

.method public getDelForeBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 438
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelForeBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getDelKeyBgNinePatch()Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDelKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    return-object v0
.end method

.method public getDoneBgBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 430
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getDoneBgColor()I
    .locals 1

    .line 486
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    return v0
.end method

.method public getDoneForeBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 422
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneForeBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getDoneKeyBgNinePatch()Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 1

    .line 646
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDoneKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    return-object v0
.end method

.method public getDoneRight()I
    .locals 1

    .line 534
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    return v0
.end method

.method public getEnableOKBtn()I
    .locals 1

    .line 526
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    return v0
.end method

.method public getInnerPaddingBottom()I
    .locals 1

    .line 366
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    return v0
.end method

.method public getInnerPaddingLeft()I
    .locals 1

    .line 342
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    return v0
.end method

.method public getInnerPaddingRight()I
    .locals 1

    .line 358
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    return v0
.end method

.method public getInnerPaddingTop()I
    .locals 1

    .line 350
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    return v0
.end method

.method public getIsAudio()I
    .locals 1

    .line 510
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    return v0
.end method

.method public getIsVibrate()I
    .locals 1

    .line 518
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    return v0
.end method

.method public getKeyboardBgBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getKeyboardBgColor()I
    .locals 1

    .line 470
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    return v0
.end method

.method public getKeyboardBgNinePatch()Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 1

    .line 598
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchBackground:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    return-object v0
.end method

.method public getKeyboardHeight()I
    .locals 1

    .line 262
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    return v0
.end method

.method public getKeyboardWidth()I
    .locals 1

    .line 254
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    return v0
.end method

.method public getMarginCol()I
    .locals 1

    .line 302
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    return v0
.end method

.method public getMarginRow()I
    .locals 1

    .line 294
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    return v0
.end method

.method public getNumBgBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getNumBgColor()I
    .locals 1

    .line 502
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    return v0
.end method

.method public getNumForeBitmaps()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;"
        }
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumForeBitmaps:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getNumKeyBgNinePatch()Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 1

    .line 654
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchNumKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    return-object v0
.end method

.method public getNumSize()I
    .locals 1

    .line 382
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    return v0
.end method

.method public getNumberKeyColor()I
    .locals 1

    .line 582
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    return v0
.end method

.method public getOutPaddingBottom()I
    .locals 1

    .line 334
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    return v0
.end method

.method public getOutPaddingLeft()I
    .locals 1

    .line 310
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    return v0
.end method

.method public getOutPaddingRight()I
    .locals 1

    .line 326
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    return v0
.end method

.method public getOutPaddingTop()I
    .locals 1

    .line 318
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    return v0
.end method

.method public getSecureHeight()I
    .locals 1

    .line 550
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    return v0
.end method

.method public getSecureWidth()I
    .locals 1

    .line 542
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    return v0
.end method

.method public getStartX()I
    .locals 1

    .line 606
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    return v0
.end method

.method public getStartY()I
    .locals 1

    .line 614
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleBgBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTitleBgColor()I
    .locals 1

    .line 478
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    return v0
.end method

.method public getTitleBgNinePatch()Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 1

    .line 662
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchTitleBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    return-object v0
.end method

.method public getTitleColor()I
    .locals 1

    .line 566
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    return v0
.end method

.method public getTitleDrawablePadding()I
    .locals 1

    .line 558
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    return v0
.end method

.method public getTitleDropBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 414
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDropBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTitleFont()I
    .locals 1

    .line 590
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleFont:I

    return v0
.end method

.method public getTitleHeight()I
    .locals 1

    .line 286
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    return v0
.end method

.method public getTitleIconBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleIconBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getTitleSize()I
    .locals 1

    .line 574
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    return v0
.end method

.method public isEnableLightStatusBar()Z
    .locals 1

    .line 630
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    return v0
.end method

.method public setConfirmBtnHeight(I)V
    .locals 0

    .line 282
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    .line 283
    return-void
.end method

.method public setConfirmBtnOutPaddingRight(I)V
    .locals 0

    .line 378
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    .line 379
    return-void
.end method

.method public setConfirmBtnWidth(I)V
    .locals 0

    .line 274
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    .line 275
    return-void
.end method

.method public setDefaultPosition(I)V
    .locals 0

    .line 626
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    .line 627
    return-void
.end method

.method public setDelBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgBitmap:Landroid/graphics/Bitmap;

    .line 451
    return-void
.end method

.method public setDelBgColor(I)V
    .locals 0

    .line 498
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    .line 499
    return-void
.end method

.method public setDelForeBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 442
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelForeBitmap:Landroid/graphics/Bitmap;

    .line 443
    return-void
.end method

.method public setDelKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V
    .locals 0

    .line 642
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDelKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 643
    return-void
.end method

.method public setDoneBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgBitmap:Landroid/graphics/Bitmap;

    .line 435
    return-void
.end method

.method public setDoneBgColor(I)V
    .locals 0

    .line 490
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    .line 491
    return-void
.end method

.method public setDoneForeBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 426
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneForeBitmap:Landroid/graphics/Bitmap;

    .line 427
    return-void
.end method

.method public setDoneKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V
    .locals 0

    .line 650
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDoneKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 651
    return-void
.end method

.method public setDoneRight(I)V
    .locals 0

    .line 538
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    .line 539
    return-void
.end method

.method public setEnableLightStatusBar(Z)V
    .locals 0

    .line 634
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    .line 635
    return-void
.end method

.method public setEnableOKBtn(I)V
    .locals 0

    .line 530
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    .line 531
    return-void
.end method

.method public setInnerPaddingBottom(I)V
    .locals 0

    .line 370
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    .line 371
    return-void
.end method

.method public setInnerPaddingLeft(I)V
    .locals 0

    .line 346
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    .line 347
    return-void
.end method

.method public setInnerPaddingRight(I)V
    .locals 0

    .line 362
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    .line 363
    return-void
.end method

.method public setInnerPaddingTop(I)V
    .locals 0

    .line 354
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    .line 355
    return-void
.end method

.method public setIsAudio(I)V
    .locals 0

    .line 514
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    .line 515
    return-void
.end method

.method public setIsVibrate(I)V
    .locals 0

    .line 522
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    .line 523
    return-void
.end method

.method public setKeyboardBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 394
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgBitmap:Landroid/graphics/Bitmap;

    .line 395
    return-void
.end method

.method public setKeyboardBgColor(I)V
    .locals 0

    .line 474
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    .line 475
    return-void
.end method

.method public setKeyboardBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V
    .locals 0

    .line 602
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchBackground:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 603
    return-void
.end method

.method public setKeyboardHeight(I)V
    .locals 0

    .line 266
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    .line 267
    return-void
.end method

.method public setKeyboardWidth(I)V
    .locals 0

    .line 258
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    .line 259
    return-void
.end method

.method public setMarginCol(I)V
    .locals 0

    .line 306
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    .line 307
    return-void
.end method

.method public setMarginRow(I)V
    .locals 0

    .line 298
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    .line 299
    return-void
.end method

.method public setNumBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgBitmap:Landroid/graphics/Bitmap;

    .line 459
    return-void
.end method

.method public setNumBgColor(I)V
    .locals 0

    .line 506
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    .line 507
    return-void
.end method

.method public setNumForeBitmaps(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;)V"
        }
    .end annotation

    .line 466
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumForeBitmaps:Ljava/util/ArrayList;

    .line 467
    return-void
.end method

.method public setNumKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V
    .locals 0

    .line 658
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchNumKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 659
    return-void
.end method

.method public setNumSize(I)V
    .locals 0

    .line 386
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    .line 387
    return-void
.end method

.method public setNumberKeyColor(I)V
    .locals 0

    .line 586
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    .line 587
    return-void
.end method

.method public setOutPaddingBottom(I)V
    .locals 0

    .line 338
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    .line 339
    return-void
.end method

.method public setOutPaddingLeft(I)V
    .locals 0

    .line 314
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    .line 315
    return-void
.end method

.method public setOutPaddingRight(I)V
    .locals 0

    .line 330
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    .line 331
    return-void
.end method

.method public setOutPaddingTop(I)V
    .locals 0

    .line 322
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    .line 323
    return-void
.end method

.method public setSecureHeight(I)V
    .locals 0

    .line 554
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    .line 555
    return-void
.end method

.method public setSecureWidth(I)V
    .locals 0

    .line 546
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    .line 547
    return-void
.end method

.method public setStartX(I)V
    .locals 0

    .line 610
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    .line 611
    return-void
.end method

.method public setStartY(I)V
    .locals 0

    .line 618
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    .line 619
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitle:Ljava/lang/String;

    .line 251
    return-void
.end method

.method public setTitleBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgBitmap:Landroid/graphics/Bitmap;

    .line 403
    return-void
.end method

.method public setTitleBgColor(I)V
    .locals 0

    .line 482
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    .line 483
    return-void
.end method

.method public setTitleBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V
    .locals 0

    .line 666
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchTitleBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    .line 667
    return-void
.end method

.method public setTitleColor(I)V
    .locals 0

    .line 570
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    .line 571
    return-void
.end method

.method public setTitleDrawablePadding(I)V
    .locals 0

    .line 562
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    .line 563
    return-void
.end method

.method public setTitleDropBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDropBitmap:Landroid/graphics/Bitmap;

    .line 419
    return-void
.end method

.method public setTitleFont(I)V
    .locals 0

    .line 594
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleFont:I

    .line 595
    return-void
.end method

.method public setTitleHeight(I)V
    .locals 0

    .line 290
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    .line 291
    return-void
.end method

.method public setTitleIconBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleIconBitmap:Landroid/graphics/Bitmap;

    .line 411
    return-void
.end method

.method public setTitleSize(I)V
    .locals 0

    .line 578
    iput p1, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    .line 579
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 178
    invoke-super {p0, p1, p2}, Lcom/unionpay/tsmservice/request/RequestParams;->writeToParcel(Landroid/os/Parcel;I)V

    .line 179
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 180
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardWidth:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 181
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardHeight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 182
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleHeight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 183
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginRow:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 184
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mMarginCol:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingLeft:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingTop:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 188
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingRight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mOutPaddingBottom:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 190
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingLeft:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 191
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingTop:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 192
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingRight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mInnerPaddingBottom:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnOutPaddingRight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 196
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnWidth:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 197
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mConfirmBtnHeight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 199
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartX:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mStartY:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 201
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsDefaultPosition:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 203
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumSize:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 207
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 208
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleIconBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 209
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDropBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 211
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneForeBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 212
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 214
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelForeBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 215
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 217
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 218
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumForeBitmaps:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 220
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mKeyboardBgColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleBgColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 222
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneBgColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 223
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDelBgColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 224
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumBgColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsAudio:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 227
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableOKBtn:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 228
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mDoneRight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 229
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mIsVibrate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 231
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureWidth:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 232
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mSecureHeight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 233
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleDrawablePadding:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 234
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 235
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mTitleSize:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    iget v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNumberKeyColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 237
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchBackground:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 238
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDelKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 239
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchDoneKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 240
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchNumKeyBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 241
    iget-object v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mNinePatchTitleBg:Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 242
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->mEnableLightStatusBar:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    return-void
.end method
