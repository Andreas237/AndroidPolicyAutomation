.class public abstract Lcom/shopkick/app/controllers/InputPanelController;
.super Lcom/shopkick/app/controllers/BasePanelController;
.source "InputPanelController.java"


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V
    .locals 0
    .param p1    # Lcom/shopkick/app/application/ScreenGlobals;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/logging/UserEventLogger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/app/activities/BaseActivity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/shopkick/app/controllers/IPanelControllerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/shopkick/app/activities/BaseActivity;",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/controllers/IPanelControllerCallback;",
            "Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/controllers/BasePanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    return-void
.end method


# virtual methods
.method protected enableNextButton(Lcom/shopkick/app/widget/SKButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 47
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 48
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 p2, 0xff

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 50
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 51
    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 p2, 0x4c

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void
.end method

.method protected setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 57
    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 58
    invoke-virtual {p1, p3}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 60
    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method protected updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V
    .locals 0

    .line 36
    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/InputPanelController;->validateInput()Z

    move-result p1

    .line 42
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/controllers/InputPanelController;->enableNextButton(Lcom/shopkick/app/widget/SKButton;Z)V

    return-void
.end method

.method protected validateInput()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
