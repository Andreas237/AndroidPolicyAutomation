.class Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;
.super Ljava/lang/Object;
.source "TermsOfServiceConfirmationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CheckboxClick"
.end annotation


# instance fields
.field private checkBox:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;->checkBox:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;->checkBox:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method
