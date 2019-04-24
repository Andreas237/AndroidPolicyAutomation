.class Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;
.super Landroid/text/style/ClickableSpan;
.source "RegistrationPickerPanelController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/controllers/RegistrationPickerPanelController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WebviewClickableSpan"
.end annotation


# instance fields
.field baseActivityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private mNormalTextColor:I

.field private mWebviewIdentifier:I

.field final synthetic this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/controllers/RegistrationPickerPanelController;Lcom/shopkick/app/activities/BaseActivity;II)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 236
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    .line 237
    iput p3, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->mNormalTextColor:I

    .line 238
    iput p4, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->mWebviewIdentifier:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    .line 246
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/4 v2, 0x7

    .line 247
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 248
    iget v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->mWebviewIdentifier:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/16 v2, 0x13b

    .line 249
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    const/16 v2, 0x13c

    .line 251
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    const-string v3, "Unsupported TOSWebviewType"

    .line 253
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 255
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    if-eqz v0, :cond_2

    .line 258
    new-instance v1, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;

    iget v2, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->mWebviewIdentifier:I

    iget-object v3, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    iget-object v3, v3, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {v1, v0, v2, v3}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;-><init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V

    .line 260
    invoke-virtual {v1, p1}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->onClick(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 267
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 268
    iget v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$WebviewClickableSpan;->mNormalTextColor:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    const/4 v0, 0x1

    .line 269
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    const/16 v0, 0xcc

    .line 270
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setAlpha(I)V

    return-void
.end method
