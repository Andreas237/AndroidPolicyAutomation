.class public Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;
.super Ljava/lang/Object;
.source "CheckoutManager.java"


# static fields
.field private static volatile sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;


# instance fields
.field private appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

.field private autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

.field private autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

.field private autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

.field private extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    if-nez v0, :cond_0

    return-void

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Use getInstance() method to get the single instance of this class."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 67
    sget-object v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    if-nez v0, :cond_1

    .line 68
    const-class v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    monitor-enter v0

    .line 69
    :try_start_0
    sget-object v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    if-nez v1, :cond_0

    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;-><init>()V

    sput-object v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->sInstance:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    .line 70
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 72
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

    .line 94
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    return-object v0
.end method

.method public getAutofillExtension()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    return-object v0
.end method

.method public getAutofillFillCardModel()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    return-object v0
.end method

.method public getAutofillSaveCardModel()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    return-object v0
.end method

.method public getExtension()Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    return-object v0
.end method

.method public hasAppInstallExtension()Z
    .locals 1

    .line 102
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

    .line 117
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

    .line 131
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasAutofillSaveCardModel()Z
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

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

    .line 87
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

    .line 221
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 222
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onClosed()V

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 226
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onClosed()V

    .line 229
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 230
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onClosed()V

    :cond_2
    return-void
.end method

.method public notifyOnInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 152
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 156
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 160
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_2
    return-void
.end method

.method public notifyOnPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 180
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 184
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 188
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V

    :cond_2
    return-void
.end method

.method public notifyOnProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 194
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 198
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    .line 201
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 202
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V

    :cond_2
    return-void
.end method

.method public notifyOnPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 208
    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 212
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 216
    invoke-virtual {v0, p1, p2}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V

    :cond_2
    return-void
.end method

.method public notifyOnStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    if-eqz v0, :cond_0

    .line 166
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;->onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 169
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    if-eqz v0, :cond_1

    .line 170
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    if-eqz v0, :cond_2

    .line 174
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

    .line 98
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->appInstallExtension:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    return-void
.end method

.method public setAutofillExtension(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 113
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillExtension:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    return-void
.end method

.method public setAutofillFillCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 127
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillFillCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    return-void
.end method

.method public setAutofillSaveCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 141
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->autofillSaveCardModel:Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$SaveCard;

    return-void
.end method

.method public setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 83
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->extension:Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;

    return-void
.end method
