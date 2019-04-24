.class final Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator;->createSpinnerPopupWindow(Landroid/content/Context;[Ljava/lang/String;IZILandroid/widget/RadioGroup$OnCheckedChangeListener;)Landroid/widget/PopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$radioGroup:Landroid/widget/RadioGroup;


# direct methods
.method constructor <init>(Landroid/widget/RadioGroup;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;->val$radioGroup:Landroid/widget/RadioGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;->val$radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 98
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;->val$radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->clearCheck()V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PopupWindowSpinnerCreator$1;->val$radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    .line 102
    :cond_0
    return-void
.end method
