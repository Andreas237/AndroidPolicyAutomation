.class public Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "OptionsDialogFragment.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;,
        Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;
    }
.end annotation


# static fields
.field private static final KEY_FULLSCREEN:Ljava/lang/String; = "fullscreen"

.field private static final KEY_OPTIONS:Ljava/lang/String; = "options"


# instance fields
.field private dialog:Landroid/app/Dialog;

.field private fullscreen:Z

.field private llAllOptions:Landroid/widget/LinearLayout;

.field protected options:[Ljava/lang/String;

.field private vRoot:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)Landroid/app/Dialog;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    return-object p0
.end method

.method public static synthetic lambda$onCreateDialog$2(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    .line 151
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 152
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onTrapClose()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onOptionClicked(I)V

    return-void
.end method

.method public static synthetic lambda$onCreateView$1(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onTrapClose()V

    return-void
.end method

.method protected static newArgs([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;)Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-static {p0, v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->newArgs([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;Z)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method protected static newArgs([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;Z)Landroid/os/Bundle;
    .locals 4

    .line 61
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 62
    array-length v2, p0

    new-array v2, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-array v2, v1, [Ljava/lang/String;

    :goto_0
    if-eqz p0, :cond_1

    .line 64
    :goto_1
    array-length v3, p0

    if-ge v1, v3, :cond_1

    .line 65
    aget-object v3, p0, v1

    invoke-interface {v3}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const-string p0, "options"

    .line 69
    invoke-virtual {v0, p0, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string p0, "fullscreen"

    .line 70
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static newInstance([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;)Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-static {p0, v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->newInstance([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;Z)Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;Z)Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;
    .locals 1

    .line 50
    new-instance v0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;-><init>()V

    .line 51
    invoke-static {p0, p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->newArgs([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;Z)Landroid/os/Bundle;

    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private onClose()V
    .locals 4

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f01001e

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const/4 v1, 0x1

    .line 179
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 180
    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->llAllOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 182
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v2, 0x7f01000f

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const-wide/16 v2, 0xfa

    .line 183
    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 184
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 185
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 187
    new-instance v1, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$1;-><init>(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private onOptionClicked(I)V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;->onOptionSelected(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;I)V

    .line 163
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onClose()V

    :cond_0
    return-void
.end method

.method private onTrapClose()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$OptionsDialogListener;->onOptionsCancel()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_1

    .line 173
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onClose()V

    :cond_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 76
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x7f120283

    .line 78
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 134
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f120185

    invoke-virtual {v0, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 138
    iput-boolean v2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->fullscreen:Z

    if-eqz p1, :cond_0

    const-string v0, "fullscreen"

    .line 140
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->fullscreen:Z

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 142
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "fullscreen"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->fullscreen:Z

    .line 145
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->fullscreen:Z

    if-eqz p1, :cond_2

    .line 146
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 150
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    new-instance v0, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$t-m67xV0iNysWwUVLZ3cvinITaw;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$t-m67xV0iNysWwUVLZ3cvinITaw;-><init>(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 157
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dialog:Landroid/app/Dialog;

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->setCancelable(Z)V

    if-eqz p3, :cond_0

    const-string v1, "options"

    .line 86
    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->options:[Ljava/lang/String;

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    const-string v1, "options"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->options:[Ljava/lang/String;

    :cond_1
    :goto_0
    const p3, 0x7f0c00f1

    .line 91
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup;

    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    .line 92
    iget-object p2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    const p3, 0x7f0902fb

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->llAllOptions:Landroid/widget/LinearLayout;

    .line 93
    iget-object p2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    const p3, 0x7f09031b

    invoke-virtual {p2, p3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const/4 p3, 0x0

    .line 95
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->options:[Ljava/lang/String;

    array-length v2, v1

    if-ge p3, v2, :cond_4

    .line 96
    aget-object v1, v1, p3

    const v2, 0x7f0c014f

    const/4 v3, 0x1

    .line 97
    invoke-virtual {p1, v2, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 99
    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 100
    invoke-virtual {v2, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 101
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 102
    new-instance v1, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$XWdr9j2C5JbSEN1d9gr_dfDptWQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$XWdr9j2C5JbSEN1d9gr_dfDptWQ;-><init>(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)V

    instance-of v4, v2, Landroid/view/View;

    if-nez v4, :cond_2

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    move-object v4, v2

    check-cast v4, Landroid/view/View;

    invoke-static {v4, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 104
    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->options:[Ljava/lang/String;

    array-length v1, v1

    sub-int/2addr v1, v3

    if-lt p3, v1, :cond_3

    .line 105
    invoke-virtual {v2}, Landroid/widget/Button;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 106
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 107
    invoke-virtual {v2, v1}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 111
    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->llAllOptions:Landroid/widget/LinearLayout;

    const p2, 0x7f09007f

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 112
    new-instance p2, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$1zCFpUNbgUVYNp-D0QhYh4U8IZc;

    invoke-direct {p2, p0}, Lcom/ibotta/android/fragment/dialog/options/-$$Lambda$OptionsDialogFragment$1zCFpUNbgUVYNp-D0QhYh4U8IZc;-><init>(Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;)V

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_5

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_5
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 114
    :goto_3
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    const p3, 0x7f01000c

    invoke-static {p2, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const p2, 0x7f01001b

    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    const-wide/16 p2, 0xfa

    .line 117
    invoke-virtual {p1, p2, p3}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 118
    iget-object p2, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->llAllOptions:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->vRoot:Landroid/view/ViewGroup;

    return-object p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->dismissAllowingStateLoss()V

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    .line 127
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "options"

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->options:[Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v0, "fullscreen"

    .line 129
    iget-boolean v1, p0, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->fullscreen:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
