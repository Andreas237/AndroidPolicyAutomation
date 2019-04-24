.class public abstract Lcom/shopkick/app/shoppinglists/SLNamingDialog;
.super Landroid/app/Dialog;
.source "SLNamingDialog.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;
.implements Landroid/animation/Animator$AnimatorListener;


# static fields
.field public static final EVENT_DISMISS_HANDLE_DIALOG:Ljava/lang/String; = "eventDismissHandleDialog"


# instance fields
.field private final CANCEL_BUTTON_MIN_WIDTH_DP:I

.field private final CANCEL_BUTTON_PADDING_DP:I

.field private final CONFIRM_BUTTON_WEIGHT:F

.field private final SHOW_BUTTONSET_ANIMATION_DURATION_MS:I

.field private final SHOW_BUTTONSET_DELAY_DURATION_MS:I

.field private final SHOW_BUTTON_ANIMATION_DURATION_MS:I

.field protected cancelButton:Landroid/view/View;

.field protected cancelButtonMinWidth:I

.field protected confirmButton:Landroid/view/View;

.field protected contentView:Landroid/view/View;

.field protected isConfirmButtonShown:Z

.field protected isCreateDialog:Z

.field protected lastConfirmButtonWeight:F

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field protected originalTitle:Ljava/lang/String;

.field protected textTitle:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V
    .locals 2

    .line 57
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f120215

    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0xc8

    .line 34
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTONSET_DELAY_DURATION_MS:I

    const/16 v0, 0x12c

    .line 35
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTONSET_ANIMATION_DURATION_MS:I

    .line 36
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTON_ANIMATION_DURATION_MS:I

    const v0, 0x3f4ccccd    # 0.8f

    .line 37
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CONFIRM_BUTTON_WEIGHT:F

    const/16 v1, 0x46

    .line 38
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CANCEL_BUTTON_MIN_WIDTH_DP:I

    const/16 v1, 0xa

    .line 39
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CANCEL_BUTTON_PADDING_DP:I

    .line 49
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->lastConfirmButtonWeight:F

    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    .line 58
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->setupDialog(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    .line 65
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f120215

    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/16 v0, 0xc8

    .line 34
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTONSET_DELAY_DURATION_MS:I

    const/16 v0, 0x12c

    .line 35
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTONSET_ANIMATION_DURATION_MS:I

    .line 36
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->SHOW_BUTTON_ANIMATION_DURATION_MS:I

    const v0, 0x3f4ccccd    # 0.8f

    .line 37
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CONFIRM_BUTTON_WEIGHT:F

    const/16 v1, 0x46

    .line 38
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CANCEL_BUTTON_MIN_WIDTH_DP:I

    const/16 v1, 0xa

    .line 39
    iput v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->CANCEL_BUTTON_PADDING_DP:I

    .line 49
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->lastConfirmButtonWeight:F

    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    const/4 v1, 0x1

    .line 51
    iput-boolean v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    .line 67
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->originalTitle:Ljava/lang/String;

    .line 69
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->setupDialog(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p1, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->selectAll()V

    return-void
.end method

.method private hideConfirmButton()V
    .locals 3

    .line 184
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 185
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    const/4 v1, 0x2

    .line 187
    new-array v1, v1, [F

    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->lastConfirmButtonWeight:F

    aput v2, v1, v0

    const/4 v0, 0x1

    const/4 v2, 0x0

    aput v2, v1, v0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 188
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 189
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 190
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 191
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private setupDialog(Lcom/shopkick/app/util/NotificationCenter;Landroid/view/View;)V
    .locals 4

    const/4 v0, 0x1

    .line 77
    invoke-virtual {p0, v0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->setCanceledOnTouchOutside(Z)V

    .line 79
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 82
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v1, 0x7f0c01bd

    const/4 v2, 0x0

    .line 83
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    const v1, 0x7f09022b

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    const v1, 0x7f0900c6

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    const v1, 0x7f090192

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getHintTextResId()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getConfirmButtonTextResId()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    const/16 v1, 0x46

    invoke-static {v1, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButtonMinWidth:I

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    const v1, 0x7f0900c2

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x2

    if-eqz p1, :cond_0

    .line 104
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKTextView;->getTextWidth(Ljava/lang/String;)I

    move-result p1

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    .line 105
    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    mul-int/2addr v2, v1

    add-int/2addr p1, v2

    iget v2, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButtonMinWidth:I

    .line 104
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButtonMinWidth:I

    .line 110
    :cond_0
    new-array p1, v1, [I

    .line 111
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/FrameConfigurator;->getStatusBarHeight(Landroid/content/res/Resources;)I

    move-result v1

    .line 112
    invoke-virtual {p2, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 114
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 115
    aget p1, p1, v0

    sub-int/2addr p1, v1

    iput p1, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method private showConfirmButton()V
    .locals 3

    .line 173
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 174
    iput-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    const/4 v0, 0x2

    .line 176
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 177
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 178
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 179
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 180
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f4ccccd    # 0.8f
    .end array-data
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 217
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->originalTitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 218
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->hideConfirmButton()V

    return-void

    .line 222
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->showConfirmButton()V

    goto :goto_0

    .line 224
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->hideConfirmButton()V

    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public dismiss()V
    .locals 3

    .line 142
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz v0, :cond_0

    const-string v1, "eventDismissHandleDialog"

    const/4 v2, 0x0

    .line 146
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method protected getConfirmButtonTextResId()I
    .locals 1

    .line 164
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    if-eqz v0, :cond_0

    const v0, 0x7f1106ac

    goto :goto_0

    :cond_0
    const v0, 0x7f1106b2

    :goto_0
    return v0
.end method

.method public getCurrentText()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getHintTextResId()I
    .locals 1

    .line 159
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isCreateDialog:Z

    if-eqz v0, :cond_0

    const v0, 0x7f1106ac

    goto :goto_0

    :cond_0
    const v0, 0x7f1106b2

    :goto_0
    return v0
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 276
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 277
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 270
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 271
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 253
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButtonMinWidth:I

    if-gt v0, v1, :cond_0

    return-void

    .line 255
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 257
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 258
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    iget-boolean v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-eqz v0, :cond_1

    iput p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->lastConfirmButtonWeight:F

    :cond_1
    return-void
.end method

.method public abstract onClick(Landroid/view/View;)V
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 124
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 235
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x42

    if-ne p2, p1, :cond_1

    .line 236
    iget-boolean p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->isConfirmButtonShown:Z

    if-eqz p1, :cond_0

    .line 237
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->confirmButton:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 239
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->cancelButton:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->onClick(Landroid/view/View;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 3

    .line 130
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->textTitle:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 134
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010027

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    .line 135
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    const-wide/16 v1, 0xc8

    .line 136
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setStartTime(J)V

    .line 137
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLNamingDialog;->contentView:Landroid/view/View;

    const v2, 0x7f0900c3

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
