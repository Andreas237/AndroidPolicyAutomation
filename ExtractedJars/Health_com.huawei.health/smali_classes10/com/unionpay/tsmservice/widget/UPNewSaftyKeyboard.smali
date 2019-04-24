.class public Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;,
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;,
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;,
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;,
        Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;
    }
.end annotation


# static fields
.field private static final KEYBOARD_COLOR_INITVALUE:I = -0x1

.field private static final MSG_ONSHOWLISTENER_ONEDITORCHANGED:I = 0x2

.field private static final MSG_ONSHOWLISTENER_ONHIDE:I = 0x1

.field private static final MSG_ONSHOWLISTENER_ONSHHOW:I = 0x0

.field private static final TYPE_DRAWABLE_BITMAP:I = 0x0

.field private static final TYPE_DRAWABLE_COLOR:I = 0x1

.field private static final TYPE_DRAWABLE_ERROR:I = -0x1

.field private static final TYPE_DRAWABLE_NINE_PATCH:I = 0x2


# instance fields
.field private mCallback:Landroid/os/Handler$Callback;

.field private mConfirmBtnHeight:I

.field private mConfirmBtnOutRight:I

.field private mConfirmBtnWidth:I

.field private mConnectionListener:Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;

.field private mContext:Landroid/content/Context;

.field private mEnable:Z

.field private mEnableLightStatusBar:Z

.field private mFont:Landroid/graphics/Typeface;

.field private final mHandler:Landroid/os/Handler;

.field private mInnerBottom:I

.field private mInnerLeft:I

.field private mInnerRight:I

.field private mInnerTop:I

.field private mIsDefaultPosition:I

.field private mIsKeyAudio:Z

.field private mKeyboardHeight:I

.field private mKeyboardWidth:I

.field private mMarginCol:I

.field private mMarginRow:I

.field private mMode:Z

.field private mNumSize:I

.field private mNumberKeyColor:I

.field private mOnEditorListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

.field private mOnHideListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;

.field private mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

.field private mOnShowListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;

.field private mOutBottom:I

.field private mOutLeft:I

.field private mOutRight:I

.field private mOutTop:I

.field private mPwdSize:I

.field private mSecureHeight:I

.field private mSecureWidth:I

.field private mStartX:I

.field private mStartY:I

.field private mTitle:Ljava/lang/String;

.field private mTitleColor:I

.field private mTitleDrawablePadding:I

.field private mTitleHeight:I

.field private mTitleSize:I

.field private mType:I

.field private mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

.field private mVibrate:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 150
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;-><init>(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)V

    .line 151
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mContext:Landroid/content/Context;

    .line 55
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardWidth:I

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardHeight:I

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnWidth:I

    .line 58
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnHeight:I

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleHeight:I

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginRow:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginCol:I

    .line 62
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutLeft:I

    .line 63
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutTop:I

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutRight:I

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutBottom:I

    .line 66
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerLeft:I

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerTop:I

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerRight:I

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerBottom:I

    .line 70
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumSize:I

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnOutRight:I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartX:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartY:I

    .line 74
    const/4 v0, 0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsDefaultPosition:I

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsKeyAudio:Z

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMode:Z

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnable:Z

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mVibrate:Z

    .line 79
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureWidth:I

    .line 80
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureHeight:I

    .line 81
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleDrawablePadding:I

    .line 82
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleColor:I

    .line 83
    const/4 v0, -0x1

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleSize:I

    .line 84
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumberKeyColor:I

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnableLightStatusBar:Z

    .line 95
    new-instance v0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mCallback:Landroid/os/Handler$Callback;

    .line 125
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mCallback:Landroid/os/Handler$Callback;

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mHandler:Landroid/os/Handler;

    .line 155
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mContext:Landroid/content/Context;

    .line 156
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    .line 157
    const/16 v0, 0x7d0

    if-lt p2, v0, :cond_0

    const/16 v0, 0x7d1

    if-le p2, v0, :cond_1

    .line 158
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Type is error"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_1
    invoke-direct {p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->initUPTsmAddon()V

    .line 162
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 164
    :try_start_0
    invoke-virtual {p0, p3}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setKeyboardBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    goto :goto_0

    .line 165
    :catch_0
    move-exception v3

    .line 166
    invoke-virtual {v3}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;->printStackTrace()V

    .line 169
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnShowListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;

    return-object v0
.end method

.method static synthetic access$100(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnHideListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/UPTsmAddon;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    return-object v0
.end method

.method static synthetic access$202(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;)Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

    return-object p1
.end method

.method static synthetic access$300(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnEditorListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    return-object v0
.end method

.method static synthetic access$400(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)I
    .locals 1

    .line 37
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mPwdSize:I

    return v0
.end method

.method static synthetic access$402(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;I)I
    .locals 0

    .line 37
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mPwdSize:I

    return p1
.end method

.method static synthetic access$500(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Landroid/os/Handler;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$600(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)I
    .locals 1

    .line 37
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    return v0
.end method

.method static synthetic access$700(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->clearPwd(I)V

    return-void
.end method

.method private checkDrawable(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    .line 631
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 632
    const/4 v0, -0x1

    return v0

    .line 634
    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 635
    const/4 v0, 0x0

    return v0

    .line 637
    :cond_1
    instance-of v0, p1, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_2

    .line 638
    const/4 v0, 0x1

    return v0

    .line 640
    :cond_2
    instance-of v0, p1, Landroid/graphics/drawable/NinePatchDrawable;

    if-eqz v0, :cond_3

    .line 641
    const/4 v0, 0x2

    return v0

    .line 643
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method private checkDrawables([Landroid/graphics/drawable/Drawable;)I
    .locals 5

    .line 619
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 620
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 622
    :cond_1
    move-object v1, p1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 623
    instance-of v0, v4, Landroid/graphics/drawable/BitmapDrawable;

    if-nez v0, :cond_2

    .line 624
    const/4 v0, -0x1

    return v0

    .line 622
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 627
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private clearPwd(I)V
    .locals 3

    .line 194
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 196
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->clearEncryptData(I)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    goto :goto_0

    .line 197
    :catch_0
    move-exception v2

    .line 198
    invoke-virtual {v2}, Landroid/os/RemoteException;->printStackTrace()V

    .line 201
    :cond_0
    :goto_0
    return-void
.end method

.method private drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 2

    .line 657
    move-object v1, p1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 658
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private drawableToColor(Landroid/graphics/drawable/Drawable;)I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 663
    move-object v1, p1

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    .line 664
    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    return v0
.end method

.method private drawablesToBitmaps([Landroid/graphics/drawable/Drawable;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Landroid/graphics/drawable/Drawable;)Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;"
        }
    .end annotation

    .line 647
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 648
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 649
    invoke-direct {p0, v5}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 650
    invoke-direct {p0, v5}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 653
    :cond_1
    return-object v1
.end method

.method private execTask(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 694
    new-instance v3, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;

    invoke-direct {v3, p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V

    .line 695
    invoke-static {v3, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->access$800(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/String;)V

    .line 696
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7d0

    invoke-static {v3, v1, v2, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->access$900(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;JLjava/util/concurrent/TimeUnit;)Ljava/lang/String;

    move-result-object v4

    .line 697
    return-object v4
.end method

.method private initUPTsmAddon()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getInstance(Landroid/content/Context;)Lcom/unionpay/tsmservice/UPTsmAddon;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 173
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 174
    new-instance v0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConnectionListener:Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;

    .line 186
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConnectionListener:Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->addConnectionListener(Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;)V

    .line 187
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->bind()Z

    goto :goto_0

    .line 189
    :cond_0
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    invoke-direct {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->clearPwd(I)V

    .line 191
    :goto_0
    return-void
.end method

.method private obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;
    .locals 12

    .line 768
    move-object v2, p1

    check-cast v2, Landroid/graphics/drawable/NinePatchDrawable;

    .line 769
    new-instance v3, Lcom/unionpay/tsmservice/data/NinePatchInfo;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/data/NinePatchInfo;-><init>()V

    .line 770
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 771
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/NinePatchDrawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 772
    invoke-virtual {v3, v4}, Lcom/unionpay/tsmservice/data/NinePatchInfo;->setPadding(Landroid/graphics/Rect;)V

    .line 773
    invoke-virtual {v2}, Landroid/graphics/drawable/NinePatchDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v5

    .line 775
    const-string v0, "android.graphics.drawable.NinePatchDrawable$NinePatchState"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 777
    const-string v0, "mNinePatch"

    invoke-virtual {v6, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    .line 778
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 779
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    .line 780
    const-string v0, "android.graphics.NinePatch"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    .line 781
    const-string v0, "getBitmap"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v9, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    .line 782
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v10, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/graphics/Bitmap;

    .line 783
    invoke-virtual {v3, v11}, Lcom/unionpay/tsmservice/data/NinePatchInfo;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 784
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/data/NinePatchInfo;->setChunk([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 787
    goto :goto_0

    .line 785
    :catch_0
    move-exception v6

    .line 786
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V

    .line 788
    :goto_0
    return-object v3
.end method

.method private setDelKeyBg(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 405
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 406
    const/4 v0, -0x1

    if-eq v1, v0, :cond_3

    .line 407
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 408
    if-nez v1, :cond_0

    .line 409
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDelBgBitmap(Landroid/graphics/Bitmap;)V

    .line 410
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDelBgColor(I)V

    goto :goto_0

    .line 411
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 412
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToColor(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDelBgColor(I)V

    goto :goto_0

    .line 413
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 414
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;

    move-result-object v3

    .line 415
    invoke-virtual {v2, v3}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDelKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V

    .line 417
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 418
    goto :goto_1

    .line 419
    :cond_3
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 421
    :goto_1
    return-void
.end method

.method private setDelKeyFore(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 389
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 390
    const/4 v0, -0x1

    if-eq v1, v0, :cond_2

    .line 391
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 392
    if-nez v1, :cond_0

    .line 393
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDelForeBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 394
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 395
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 397
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 398
    goto :goto_1

    .line 399
    :cond_2
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 401
    :goto_1
    return-void
.end method

.method private setDoneKeyBg(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 352
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 353
    const/4 v0, -0x1

    if-eq v1, v0, :cond_3

    .line 354
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 355
    if-nez v1, :cond_0

    .line 356
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneBgBitmap(Landroid/graphics/Bitmap;)V

    .line 357
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneBgColor(I)V

    goto :goto_0

    .line 358
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 359
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToColor(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneBgColor(I)V

    goto :goto_0

    .line 360
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 361
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;

    move-result-object v3

    .line 362
    invoke-virtual {v2, v3}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V

    .line 364
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 365
    goto :goto_1

    .line 366
    :cond_3
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 368
    :goto_1
    return-void
.end method

.method private setDoneKeyFore(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 336
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 337
    const/4 v0, -0x1

    if-eq v1, v0, :cond_2

    .line 338
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 339
    if-nez v1, :cond_0

    .line 340
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneForeBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 341
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 342
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 344
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 345
    goto :goto_1

    .line 346
    :cond_2
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 348
    :goto_1
    return-void
.end method

.method private setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 475
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I

    .line 476
    return-void
.end method


# virtual methods
.method public declared-synchronized clearPwd()Z
    .locals 4

    monitor-enter p0

    .line 668
    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mPwdSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 669
    const/4 v2, -0x5

    .line 671
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    invoke-virtual {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->clearEncryptData(I)I
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v2, v0

    .line 674
    goto :goto_0

    .line 672
    :catch_0
    move-exception v3

    .line 673
    :try_start_2
    invoke-virtual {v3}, Landroid/os/RemoteException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 675
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public enableLightStatusBar(Z)V
    .locals 0

    .line 520
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnableLightStatusBar:Z

    .line 521
    return-void
.end method

.method public getCurrentPinLength()I
    .locals 1

    .line 679
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mPwdSize:I

    return v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 1

    .line 683
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->execTask(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getInput(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 687
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    const/16 v1, 0x7d0

    if-eq v0, v1, :cond_0

    .line 688
    const-string v0, ""

    return-object v0

    .line 690
    :cond_0
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->execTask(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hide()Z
    .locals 3

    .line 585
    const/4 v1, -0x5

    .line 587
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->hideKeyboard()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 590
    goto :goto_0

    .line 588
    :catch_0
    move-exception v2

    .line 589
    invoke-virtual {v2}, Landroid/os/RemoteException;->printStackTrace()V

    .line 591
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public setConfirmBtnOutPaddingRight(I)V
    .locals 0

    .line 247
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnOutRight:I

    .line 248
    return-void
.end method

.method public setConfirmBtnSize(II)V
    .locals 0

    .line 213
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnWidth:I

    .line 214
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnHeight:I

    .line 215
    return-void
.end method

.method public setDelKeyDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 425
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 426
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDelKeyFore(Landroid/graphics/drawable/Drawable;)V

    .line 428
    :cond_0
    return-void
.end method

.method public setDelKeyDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 432
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 433
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDelKeyFore(Landroid/graphics/drawable/Drawable;)V

    .line 435
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 436
    invoke-direct {p0, p2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDelKeyBg(Landroid/graphics/drawable/Drawable;)V

    .line 438
    :cond_1
    return-void
.end method

.method public setDoneKeyDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 372
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 373
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDoneKeyFore(Landroid/graphics/drawable/Drawable;)V

    .line 375
    :cond_0
    return-void
.end method

.method public setDoneKeyDrawable(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 379
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 380
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDoneKeyFore(Landroid/graphics/drawable/Drawable;)V

    .line 382
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 383
    invoke-direct {p0, p2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setDoneKeyBg(Landroid/graphics/drawable/Drawable;)V

    .line 385
    :cond_1
    return-void
.end method

.method public setDoneKeyEnable(Z)V
    .locals 0

    .line 487
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnable:Z

    .line 488
    return-void
.end method

.method public setDoneKeyRightMode(Z)V
    .locals 0

    .line 483
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMode:Z

    .line 484
    return-void
.end method

.method public setKeyAreaPadding(IIII)V
    .locals 0

    .line 236
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerLeft:I

    .line 237
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerTop:I

    .line 238
    iput p3, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerRight:I

    .line 239
    iput p4, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerBottom:I

    .line 240
    return-void
.end method

.method public setKeyBoardSize(II)V
    .locals 0

    .line 208
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardWidth:I

    .line 209
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardHeight:I

    .line 210
    return-void
.end method

.method public setKeyboardAudio(Z)V
    .locals 0

    .line 479
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsKeyAudio:Z

    .line 480
    return-void
.end method

.method public setKeyboardBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 258
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 259
    const/4 v0, -0x1

    if-eq v1, v0, :cond_3

    .line 260
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 261
    if-nez v1, :cond_0

    .line 262
    .line 263
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 262
    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardBgBitmap(Landroid/graphics/Bitmap;)V

    .line 264
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardBgColor(I)V

    goto :goto_0

    .line 265
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 266
    .line 267
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToColor(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    .line 266
    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardBgColor(I)V

    goto :goto_0

    .line 268
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 269
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;

    move-result-object v3

    .line 271
    invoke-virtual {v2, v3}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V

    .line 273
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 274
    goto :goto_1

    .line 275
    :cond_3
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 277
    :goto_1
    return-void
.end method

.method public setKeyboardPadding(IIII)V
    .locals 0

    .line 228
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutLeft:I

    .line 229
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutTop:I

    .line 230
    iput p3, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutRight:I

    .line 231
    iput p4, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutBottom:I

    .line 232
    return-void
.end method

.method public setKeyboardStartPosition(II)V
    .locals 1

    .line 251
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartX:I

    .line 252
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartY:I

    .line 253
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsDefaultPosition:I

    .line 254
    return-void
.end method

.method public setKeyboardVibrate(Z)V
    .locals 0

    .line 491
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mVibrate:Z

    .line 492
    return-void
.end method

.method public setNumKeyBackgroud(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 454
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 455
    const/4 v0, -0x1

    if-eq v1, v0, :cond_3

    .line 456
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 457
    if-nez v1, :cond_0

    .line 458
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumBgBitmap(Landroid/graphics/Bitmap;)V

    .line 459
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumBgColor(I)V

    goto :goto_0

    .line 460
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 461
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToColor(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumBgColor(I)V

    goto :goto_0

    .line 462
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 463
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;

    move-result-object v3

    .line 465
    invoke-virtual {v2, v3}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumKeyBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V

    .line 467
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 468
    goto :goto_1

    .line 469
    :cond_3
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 471
    :goto_1
    return-void
.end method

.method public setNumKeyMargin(II)V
    .locals 0

    .line 222
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginRow:I

    .line 223
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginCol:I

    .line 224
    return-void
.end method

.method public setNumberKeyColor(I)V
    .locals 0

    .line 512
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumberKeyColor:I

    .line 513
    return-void
.end method

.method public setNumberKeyDrawable([Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 442
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawables([Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 443
    if-nez v1, :cond_0

    .line 444
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 445
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawablesToBitmaps([Landroid/graphics/drawable/Drawable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumForeBitmaps(Ljava/util/ArrayList;)V

    .line 446
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 447
    goto :goto_0

    .line 448
    :cond_0
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 450
    :goto_0
    return-void
.end method

.method public setNumberKeySize(I)V
    .locals 0

    .line 243
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumSize:I

    .line 244
    return-void
.end method

.method public setOnEditorListener(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnEditorListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    .line 604
    return-void
.end method

.method public setOnHideListener(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;)V
    .locals 0

    .line 599
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnHideListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;

    .line 600
    return-void
.end method

.method public setOnShowListener(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;)V
    .locals 0

    .line 595
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnShowListener:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;

    .line 596
    return-void
.end method

.method public setTitleBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 281
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 282
    const/4 v0, -0x1

    if-eq v1, v0, :cond_3

    .line 283
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 284
    if-nez v1, :cond_0

    .line 285
    .line 286
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleBgBitmap(Landroid/graphics/Bitmap;)V

    .line 287
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleBgColor(I)V

    goto :goto_0

    .line 288
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 289
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToColor(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleBgColor(I)V

    goto :goto_0

    .line 290
    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    .line 291
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->obtainNinePatchInfo(Landroid/graphics/drawable/Drawable;)Lcom/unionpay/tsmservice/data/NinePatchInfo;

    move-result-object v3

    .line 293
    invoke-virtual {v2, v3}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleBgNinePatch(Lcom/unionpay/tsmservice/data/NinePatchInfo;)V

    .line 295
    :cond_2
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 296
    goto :goto_1

    .line 297
    :cond_3
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 299
    :goto_1
    return-void
.end method

.method public setTitleColor(I)V
    .locals 0

    .line 504
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleColor:I

    .line 505
    return-void
.end method

.method public setTitleConfirmDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 320
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 321
    const/4 v0, -0x1

    if-eq v1, v0, :cond_2

    .line 322
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 323
    if-nez v1, :cond_0

    .line 324
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleDropBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 325
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 326
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 328
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 329
    goto :goto_1

    .line 330
    :cond_2
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 332
    :goto_1
    return-void
.end method

.method public setTitleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 303
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->checkDrawable(Landroid/graphics/drawable/Drawable;)I

    move-result v1

    .line 304
    const/4 v0, -0x1

    if-eq v1, v0, :cond_2

    .line 305
    new-instance v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 306
    if-nez v1, :cond_0

    .line 307
    .line 308
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->drawableToBitamp(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleIconBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 309
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 310
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 312
    :cond_1
    :goto_0
    invoke-direct {p0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)V

    .line 313
    goto :goto_1

    .line 314
    :cond_2
    new-instance v0, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/widget/KeyboardDrawableErrorException;-><init>()V

    throw v0

    .line 316
    :goto_1
    return-void
.end method

.method public setTitleDrawablePadding(I)V
    .locals 0

    .line 500
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleDrawablePadding:I

    .line 501
    return-void
.end method

.method public setTitleDrawableSize(II)V
    .locals 0

    .line 495
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureWidth:I

    .line 496
    iput p2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureHeight:I

    .line 497
    return-void
.end method

.method public setTitleFont(Landroid/graphics/Typeface;)V
    .locals 0

    .line 516
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mFont:Landroid/graphics/Typeface;

    .line 517
    return-void
.end method

.method public setTitleHeight(I)V
    .locals 0

    .line 218
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleHeight:I

    .line 219
    return-void
.end method

.method public setTitleSize(I)V
    .locals 0

    .line 508
    iput p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleSize:I

    .line 509
    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitle:Ljava/lang/String;

    .line 205
    return-void
.end method

.method public declared-synchronized show()Z
    .locals 6

    monitor-enter p0

    .line 524
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 525
    new-instance v0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 527
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 529
    :goto_0
    const/4 v4, 0x0

    .line 531
    :try_start_1
    new-instance v5, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    invoke-direct {v5}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;-><init>()V

    .line 532
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitle:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitle(Ljava/lang/String;)V

    .line 533
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardWidth:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardWidth(I)V

    .line 534
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mKeyboardHeight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setKeyboardHeight(I)V

    .line 535
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnWidth:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setConfirmBtnWidth(I)V

    .line 536
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnHeight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setConfirmBtnHeight(I)V

    .line 537
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleHeight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleHeight(I)V

    .line 538
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginRow:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setMarginRow(I)V

    .line 539
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMarginCol:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setMarginCol(I)V

    .line 540
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutLeft:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setOutPaddingLeft(I)V

    .line 541
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutRight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setOutPaddingRight(I)V

    .line 542
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutTop:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setOutPaddingTop(I)V

    .line 543
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOutBottom:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setOutPaddingBottom(I)V

    .line 544
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerLeft:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setInnerPaddingLeft(I)V

    .line 545
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerRight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setInnerPaddingRight(I)V

    .line 546
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerTop:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setInnerPaddingTop(I)V

    .line 547
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mInnerBottom:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setInnerPaddingBottom(I)V

    .line 548
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumSize:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumSize(I)V

    .line 549
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mConfirmBtnOutRight:I

    .line 550
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setConfirmBtnOutPaddingRight(I)V

    .line 551
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartX:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setStartX(I)V

    .line 552
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mStartY:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setStartY(I)V

    .line 553
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsDefaultPosition:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDefaultPosition(I)V

    .line 554
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mIsKeyAudio:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setIsAudio(I)V

    .line 555
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mMode:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setDoneRight(I)V

    .line 556
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnable:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setEnableOKBtn(I)V

    .line 557
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mVibrate:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setIsVibrate(I)V

    .line 558
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureWidth:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setSecureWidth(I)V

    .line 559
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mSecureHeight:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setSecureHeight(I)V

    .line 560
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleDrawablePadding:I

    .line 561
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleDrawablePadding(I)V

    .line 562
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleColor:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleColor(I)V

    .line 563
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mTitleSize:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleSize(I)V

    .line 564
    iget v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mNumberKeyColor:I

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setNumberKeyColor(I)V

    .line 565
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mFont:Landroid/graphics/Typeface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 566
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mFont:Landroid/graphics/Typeface;

    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setTitleFont(I)V

    .line 568
    :cond_5
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mEnableLightStatusBar:Z

    .line 569
    invoke-virtual {v5, v0}, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->setEnableLightStatusBar(Z)V

    .line 570
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mType:I

    iget-object v2, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

    iget-object v3, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v5, v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)I
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    .line 576
    goto :goto_5

    .line 572
    :catch_0
    move-exception v5

    .line 573
    :try_start_2
    invoke-virtual {v5}, Landroid/os/RemoteException;->printStackTrace()V

    .line 574
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

    .line 575
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 577
    :goto_5
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 578
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->mOnSafetyKeyboardCallback:Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 579
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 581
    :cond_6
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method
