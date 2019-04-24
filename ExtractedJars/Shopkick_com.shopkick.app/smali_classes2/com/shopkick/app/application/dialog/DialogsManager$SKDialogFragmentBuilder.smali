.class Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;
.super Ljava/lang/Object;
.source "DialogsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/dialog/DialogsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SKDialogFragmentBuilder"
.end annotation


# instance fields
.field private weakRefBaseActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private weakRefDialogFragment:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/dialog/SKDialogFragment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 1
    .param p1    # Lcom/shopkick/app/activities/BaseActivity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 275
    iput-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefBaseActivity:Ljava/lang/ref/WeakReference;

    .line 276
    iput-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    .line 281
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefBaseActivity:Ljava/lang/ref/WeakReference;

    .line 282
    new-instance p1, Ljava/lang/ref/WeakReference;

    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-direct {v0}, Lcom/shopkick/app/application/dialog/SKDialogFragment;-><init>()V

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic lambda$setNegativeOnClick$3(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Landroid/view/View;)V
    .locals 0

    .line 327
    iget-object p2, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;->onBtnClickListener(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$setNeutralOnClick$4(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Landroid/view/View;)V
    .locals 0

    .line 335
    iget-object p2, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;->onBtnClickListener(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$setPositiveOnClick$2(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Landroid/view/View;)V
    .locals 0

    .line 319
    iget-object p2, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-interface {p1, p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;->onBtnClickListener(Ljava/lang/ref/WeakReference;)V

    return-void
.end method


# virtual methods
.method getFrag()Lcom/shopkick/app/application/dialog/SKDialogFragment;
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefBaseActivity:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 357
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 360
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method setBtnNegativeText(Ljava/lang/String;)V
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setBtnNegativeText(Ljava/lang/String;)V

    return-void
.end method

.method setBtnNeutralText(Ljava/lang/String;)V
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setBtnNeutralText(Ljava/lang/String;)V

    return-void
.end method

.method setBtnPositiveText(Ljava/lang/String;)V
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setBtnPositiveText(Ljava/lang/String;)V

    return-void
.end method

.method setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setDialogType(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;)V

    return-void
.end method

.method setDismissOnBgClick(Z)V
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setDismissOnBgClick(Z)V

    return-void
.end method

.method setNegativeOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    new-instance v1, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$rE7BU8SQTi9QSNqtCbtt-R0KqHU;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setOnClickListenerNegative(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method setNeutralOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 334
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    new-instance v1, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$BmDWAn5b2Ff0wBCdVhVGvpHj9y0;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$BmDWAn5b2Ff0wBCdVhVGvpHj9y0;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setOnClickListenerNeutral(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V
    .locals 1

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setOnDismissListener(Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)V

    return-void
.end method

.method setPositiveOnClick(Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    new-instance v1, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$7GB6O5CTXrXLiCOxrGEGSn-8dCc;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/application/dialog/-$$Lambda$DialogsManager$SKDialogFragmentBuilder$7GB6O5CTXrXLiCOxrGEGSn-8dCc;-><init>(Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setOnClickListenerPositive(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->setTitleAndDescText(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method show()V
    .locals 2

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefBaseActivity:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefBaseActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    iget-object v1, p0, Lcom/shopkick/app/application/dialog/DialogsManager$SKDialogFragmentBuilder;->weakRefDialogFragment:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/DialogFragment;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->showDialog(Landroid/support/v4/app/DialogFragment;)V

    return-void

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method
