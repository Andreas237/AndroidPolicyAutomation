.class public Lhuawei/widget/NumberPickerProxy;
.super Landroid/widget/NumberPicker;
.source "SourceFile"


# instance fields
.field mBottomSelectionDividerBottom:I

.field mCurrentScrollOffset:I

.field mHasSelectorWheel:Z

.field mHideWheelUntilFocused:Z

.field mInitialScrollOffset:I

.field mInputText:Landroid/widget/EditText;

.field mMaxHeight:I

.field mMinWidth:I

.field protected mOnValueChangeListener:Landroid/widget/NumberPicker$OnValueChangeListener;

.field protected mOnValueChangeListenerInner:Landroid/widget/NumberPicker$OnValueChangeListener;

.field mSelectionDivider:Landroid/graphics/drawable/Drawable;

.field mSelectionDividerHeight:I

.field mSelectionDividersDistance:I

.field mSelectorElementHeight:I

.field mSelectorIndexToStringCache:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field mSelectorIndices:[I

.field mSelectorTextGapHeight:I

.field mSelectorWheelPaint:Landroid/graphics/Paint;

.field mTopSelectionDividerTop:I

.field mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;)V

    .line 43
    new-instance v0, Lhuawei/widget/NumberPickerProxy$1;

    invoke-direct {v0, p0}, Lhuawei/widget/NumberPickerProxy$1;-><init>(Lhuawei/widget/NumberPickerProxy;)V

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListenerInner:Landroid/widget/NumberPicker$OnValueChangeListener;

    .line 65
    invoke-direct {p0}, Lhuawei/widget/NumberPickerProxy;->init()V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    new-instance v0, Lhuawei/widget/NumberPickerProxy$1;

    invoke-direct {v0, p0}, Lhuawei/widget/NumberPickerProxy$1;-><init>(Lhuawei/widget/NumberPickerProxy;)V

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListenerInner:Landroid/widget/NumberPicker$OnValueChangeListener;

    .line 70
    invoke-direct {p0}, Lhuawei/widget/NumberPickerProxy;->init()V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/NumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    new-instance v0, Lhuawei/widget/NumberPickerProxy$1;

    invoke-direct {v0, p0}, Lhuawei/widget/NumberPickerProxy$1;-><init>(Lhuawei/widget/NumberPickerProxy;)V

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListenerInner:Landroid/widget/NumberPicker$OnValueChangeListener;

    .line 75
    invoke-direct {p0}, Lhuawei/widget/NumberPickerProxy;->init()V

    .line 76
    return-void
.end method

.method private init()V
    .locals 2

    .line 80
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListenerInner:Landroid/widget/NumberPicker$OnValueChangeListener;

    invoke-super {p0, v0}, Landroid/widget/NumberPicker;->setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V

    .line 83
    const-string v0, "mSelectorWheelPaint"

    const-class v1, Landroid/widget/NumberPicker;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Paint;

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorWheelPaint:Landroid/graphics/Paint;

    .line 84
    const-string v0, "mSelectorIndexToStringCache"

    const-class v1, Landroid/widget/NumberPicker;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorIndexToStringCache:Landroid/util/SparseArray;

    .line 85
    const-string v0, "mInputText"

    const-class v1, Landroid/widget/NumberPicker;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    .line 88
    invoke-virtual {p0}, Lhuawei/widget/NumberPickerProxy;->initialize()V

    .line 90
    const-string v0, "mSelectorIndices"

    const-class v1, Landroid/widget/NumberPicker;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    check-cast v0, [I

    iput-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorIndices:[I

    .line 92
    return-void
.end method


# virtual methods
.method protected initialize()V
    .locals 0

    .line 95
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .line 99
    invoke-super/range {p0 .. p5}, Landroid/widget/NumberPicker;->onLayout(ZIIII)V

    .line 101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhuawei/widget/NumberPickerProxy;->setHorizontalFadingEdgeEnabled(Z)V

    .line 102
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhuawei/widget/NumberPickerProxy;->setVerticalFadingEdgeEnabled(Z)V

    .line 103
    iget v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorElementHeight:I

    invoke-virtual {p0, v0}, Lhuawei/widget/NumberPickerProxy;->setFadingEdgeLength(I)V

    .line 105
    const-string v0, "mInitialScrollOffset"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mInitialScrollOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 106
    const-string v0, "mCurrentScrollOffset"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mCurrentScrollOffset:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 107
    const-string v0, "mSelectorElementHeight"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorElementHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 109
    iget v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividersDistance:I

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorElementHeight:I

    sub-int/2addr v0, v1

    iput v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorTextGapHeight:I

    .line 110
    const-string v0, "mSelectorTextGapHeight"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectorTextGapHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 112
    invoke-virtual {p0}, Lhuawei/widget/NumberPickerProxy;->getHeight()I

    move-result v0

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividersDistance:I

    sub-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividerHeight:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lhuawei/widget/NumberPickerProxy;->mTopSelectionDividerTop:I

    .line 113
    iget v0, p0, Lhuawei/widget/NumberPickerProxy;->mTopSelectionDividerTop:I

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividerHeight:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividersDistance:I

    add-int/2addr v0, v1

    iput v0, p0, Lhuawei/widget/NumberPickerProxy;->mBottomSelectionDividerBottom:I

    .line 115
    return-void
.end method

.method protected onValueChangeInner(Landroid/widget/NumberPicker;II)V
    .locals 0

    .line 61
    return-void
.end method

.method public setOnValueChangedListener(Landroid/widget/NumberPicker$OnValueChangeListener;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lhuawei/widget/NumberPickerProxy;->mOnValueChangeListener:Landroid/widget/NumberPicker$OnValueChangeListener;

    .line 58
    return-void
.end method

.method protected setStyle()V
    .locals 6

    .line 118
    const-string v0, "mSelectionDividerHeight"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividerHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 119
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 121
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setLayoutDirection(Landroid/graphics/drawable/Drawable;I)Z

    .line 122
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lhuawei/widget/NumberPickerProxy;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 126
    :cond_0
    const-string v0, "mSelectionDivider"

    iget-object v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDivider:Landroid/graphics/drawable/Drawable;

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 128
    const-string v0, "mHasSelectorWheel"

    iget-boolean v1, p0, Lhuawei/widget/NumberPickerProxy;->mHasSelectorWheel:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 129
    const-string v0, "mSelectionDividersDistance"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mSelectionDividersDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 130
    const-string v0, "mMaxHeight"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mMaxHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 131
    const-string v0, "mMinWidth"

    iget v1, p0, Lhuawei/widget/NumberPickerProxy;->mMinWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 132
    const-string v0, "mVirtualButtonPressedDrawable"

    iget-object v1, p0, Lhuawei/widget/NumberPickerProxy;->mVirtualButtonPressedDrawable:Landroid/graphics/drawable/Drawable;

    const-class v2, Landroid/widget/NumberPicker;

    invoke-static {v0, p0, v1, v2}, Lo/fkw;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;)V

    .line 134
    const/4 v3, 0x0

    invoke-virtual {p0}, Lhuawei/widget/NumberPickerProxy;->getChildCount()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    .line 135
    invoke-virtual {p0, v3}, Lhuawei/widget/NumberPickerProxy;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 136
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 134
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 139
    :cond_1
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->setSingleLine()V

    .line 140
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setGravity(I)V

    .line 141
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 143
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 144
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setClickable(Z)V

    .line 145
    iget-object v0, p0, Lhuawei/widget/NumberPickerProxy;->mInputText:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setAccessibilityLiveRegion(Landroid/view/View;I)V

    .line 146
    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityLiveRegion(Landroid/view/View;I)V

    .line 147
    new-instance v0, Lhuawei/widget/NumberPickerProxy$2;

    invoke-direct {v0, p0}, Lhuawei/widget/NumberPickerProxy$2;-><init>(Lhuawei/widget/NumberPickerProxy;)V

    invoke-virtual {p0, v0}, Lhuawei/widget/NumberPickerProxy;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 169
    iget-boolean v0, p0, Lhuawei/widget/NumberPickerProxy;->mHasSelectorWheel:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lhuawei/widget/NumberPickerProxy;->setWillNotDraw(Z)V

    .line 170
    return-void
.end method

.method protected updateValue()V
    .locals 2

    .line 174
    const-string v0, "mCurrentScrollOffset"

    const-class v1, Landroid/widget/NumberPicker;

    invoke-static {p0, v0, v1}, Lo/fkw;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lhuawei/widget/NumberPickerProxy;->mCurrentScrollOffset:I

    .line 175
    return-void
.end method
