.class public Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;
.super Ljava/lang/Object;
.source "CheckoutManager.java"


# static fields
.field private static volatile sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;


# instance fields
.field private appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

.field private autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

.field private autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

.field private extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

.field private isAutofillPage:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    return-void
.end method

.method public static getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 53
    sget-object v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    if-nez v0, :cond_1

    .line 54
    const-class v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    monitor-enter v0

    .line 55
    :try_start_0
    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;-><init>()V

    sput-object v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    .line 56
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 58
    :cond_1
    :goto_0
    sget-object v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    return-object v0
.end method


# virtual methods
.method public getAppInstallExtension()Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    return-object v0
.end method

.method public getAutofillExtension()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    return-object v0
.end method

.method public getAutofillFillCardModel()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    return-object v0
.end method

.method public getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    return-object v0
.end method

.method public hasAppInstallExtension()Z
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasAutofillExtension()Z
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasAutofillFillCardModel()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasExtension()Z
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public notifyOnClosed()V
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 202
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onClosed()V

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 206
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onClosed()V

    .line 209
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 210
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onClosed()V

    :cond_2
    return-void
.end method

.method public notifyOnInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 124
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 127
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 132
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_2
    return-void
.end method

.method public notifyOnPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 1

    .line 153
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 155
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 159
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 164
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    :cond_2
    return-void
.end method

.method public notifyOnProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 1

    .line 169
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    if-nez v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 171
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 175
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 180
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    :cond_2
    return-void
.end method

.method public notifyOnPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 1

    .line 185
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    if-nez v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 187
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 191
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    .line 195
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 196
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    :cond_2
    return-void
.end method

.method public notifyOnStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 137
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    if-nez v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 139
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 148
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_2
    return-void
.end method

.method public setAppInstallExtension(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    return-void
.end method

.method public setAutofillExtension(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 99
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    return-void
.end method

.method public setAutofillFillCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 113
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    return-void
.end method

.method public setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    return-void
.end method

.method public setIsAutofillPage(Z)V
    .locals 0

    .line 215
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->isAutofillPage:Z

    return-void
.end method
