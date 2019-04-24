.class public Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;
.super Landroid/widget/FrameLayout;
.source "ReceiptCaptureButtonsView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;,
        Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;,
        Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;
    }
.end annotation


# instance fields
.field protected bLeft:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090090
    .end annotation
.end field

.field protected bRight:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a2
    .end annotation
.end field

.field protected ibCenter:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09022e
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;

.field protected llButtons:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090300
    .end annotation
.end field

.field protected llCenter:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090302
    .end annotation
.end field

.field protected llProgress:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090321
    .end annotation
.end field

.field private mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

.field protected tvCenterText:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090508
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 68
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 82
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initLayout()V

    return-void
.end method

.method private initCenter()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01ab

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 112
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 114
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060022

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setBackgroundColor(I)V

    .line 118
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initLeftButton()V

    .line 119
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initCenter()V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->initRightButton()V

    .line 122
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->setCanSubmit(Z)V

    return-void
.end method

.method private initLeftButton()V
    .locals 2

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initRightButton()V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bRight:Landroid/widget/Button;

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private updateUI()V
    .locals 4

    const-string v0, "updateUI"

    const/4 v1, 0x0

    .line 139
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bRight:Landroid/widget/Button;

    sget-object v2, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    sget-object v2, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PROCESSING:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    const/4 v3, 0x4

    if-ne v0, v2, :cond_0

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llProgress:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llButtons:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llButtons:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llProgress:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 150
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    if-ne v0, v1, :cond_1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->ibCenter:Landroid/widget/ImageButton;

    const v1, 0x7f080043

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CANCEL:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    const v1, 0x7f110142

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->tvCenterText:Landroid/widget/TextView;

    const v1, 0x7f11056f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 158
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->POST_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    if-ne v0, v1, :cond_2

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->ibCenter:Landroid/widget/ImageButton;

    const v1, 0x7f080042

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    const v1, 0x7f1101e3

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->tvCenterText:Landroid/widget/TextView;

    const v1, 0x7f110564

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public getMode()Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->listener:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-interface {v0, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;->onReceiptCaptureButtonClicked(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;)V

    :cond_0
    return-void
.end method

.method public setCanSubmit(Z)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bRight:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setCaptureAllowed(Z)V
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;->PRE_CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    if-ne v0, v1, :cond_0

    const-string v0, "setCaptureAllowed: %1$b"

    const/4 v1, 0x1

    .line 105
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->listener:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButtonsListener;

    return-void
.end method

.method public setMode(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->mode:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureMode;

    .line 92
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->updateUI()V

    return-void
.end method
