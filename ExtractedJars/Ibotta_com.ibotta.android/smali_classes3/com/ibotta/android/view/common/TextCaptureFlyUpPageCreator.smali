.class public Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "TextCaptureFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;,
        Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;
    }
.end annotation


# static fields
.field public static final EVENT_SUBMIT:I = 0x1

.field public static final PAGE_INPUT:I


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final instructions:Ljava/lang/CharSequence;

.field private final legal:Ljava/lang/CharSequence;

.field private numberOfLines:Ljava/lang/Integer;

.field private pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private final text:Ljava/lang/CharSequence;

.field private vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 40
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 49
    invoke-direct {p0, p2}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 51
    iput-object p3, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->instructions:Ljava/lang/CharSequence;

    .line 52
    iput-object p4, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->legal:Ljava/lang/CharSequence;

    .line 53
    iput-object p5, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->text:Ljava/lang/CharSequence;

    .line 54
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 55
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x0

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 56
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method

.method private onSendClicked()V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    if-nez v0, :cond_0

    return-void

    .line 120
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;

    invoke-direct {v0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;-><init>()V

    const/4 v1, 0x1

    .line 121
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->setEventId(I)V

    .line 122
    iget-object v1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {v1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$300(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->setInput(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    return-void
.end method


# virtual methods
.method public getFlyUpData()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    const p3, 0x7f0c00ea

    const/4 v0, 0x1

    .line 77
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 1

    .line 82
    new-instance p2, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;-><init>(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$1;)V

    iput-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    .line 83
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    const v0, 0x7f090534

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$102(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 84
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    const v0, 0x7f09053b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$202(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 85
    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    const v0, 0x7f0901cb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    invoke-static {p2, p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$302(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 87
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$100(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->instructions:Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$300(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->text:Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->legal:Ljava/lang/CharSequence;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 91
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$200(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$200(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$200(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->legal:Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->numberOfLines:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$300(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->numberOfLines:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setLines(I)V

    .line 101
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object p2, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    invoke-static {p2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;->access$300(Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;)Landroid/widget/EditText;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/util/AppHelper;->showSoftKeyboardAsyncFocus(Landroid/view/View;)V

    .line 103
    iget-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->vhTextCapture:Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCaptureViewHolder;

    return-object p1
.end method

.method public onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    iget-object v0, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    if-ne p1, v0, :cond_0

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->onSendClicked()V

    const/4 p1, 0x1

    return p1

    .line 112
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z

    move-result p1

    return p1
.end method

.method public setNumberOfLines(Ljava/lang/Integer;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->numberOfLines:Ljava/lang/Integer;

    return-void
.end method

.method public setRightControl(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;->pageDataTextCapture:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    iput-object p1, v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method
