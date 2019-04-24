.class Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;
.super Landroid/text/style/ClickableSpan;
.source "RegistrationV3Screen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/RegistrationV3Screen;
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

.field final synthetic this$0:Lcom/shopkick/app/registration/RegistrationV3Screen;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/RegistrationV3Screen;Lcom/shopkick/app/activities/BaseActivity;II)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->this$0:Lcom/shopkick/app/registration/RegistrationV3Screen;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 297
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    .line 298
    iput p3, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->mNormalTextColor:I

    .line 299
    iput p4, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->mWebviewIdentifier:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 304
    iget-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->baseActivityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 305
    new-instance v0, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;

    iget-object v1, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->this$0:Lcom/shopkick/app/registration/RegistrationV3Screen;

    invoke-virtual {v1}, Lcom/shopkick/app/registration/RegistrationV3Screen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    iget v2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->mWebviewIdentifier:I

    iget-object v3, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->this$0:Lcom/shopkick/app/registration/RegistrationV3Screen;

    .line 307
    invoke-static {v3}, Lcom/shopkick/app/registration/RegistrationV3Screen;->access$500(Lcom/shopkick/app/registration/RegistrationV3Screen;)Lcom/shopkick/app/application/ScreenGlobals;

    move-result-object v3

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;-><init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 313
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 314
    iget v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$WebviewClickableSpan;->mNormalTextColor:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    const/4 v0, 0x0

    .line 315
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    return-void
.end method
