.class Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;
.super Ljava/lang/Object;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V
    .locals 0

    .line 299
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    .line 305
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    .line 306
    invoke-virtual {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 309
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, " "

    const-string v2, ""

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$100(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 315
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1, v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$202(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Z)Z

    .line 316
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    goto/16 :goto_0

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->termsText:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 318
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$400(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)I

    move-result p1

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$500(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    .line 323
    invoke-static {v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$500(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    move-result-object v0

    .line 322
    invoke-static {v0, p1}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->getTermsAndConditionsUrlForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Ljava/lang/String;

    move-result-object p1

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$600(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    goto/16 :goto_0

    .line 327
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkMarkImage:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_4

    .line 328
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-boolean p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->acceptedTerms:Z

    const v0, 0x7f06015d

    if-eqz p1, :cond_3

    .line 329
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkMarkImage:Landroid/widget/ImageView;

    const v1, 0x7f0800da

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 330
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iput-boolean v2, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->acceptedTerms:Z

    .line 331
    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setEnabled(Z)V

    .line 332
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->grayDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 333
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v1, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$700(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    .line 335
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->checkMarkImage:Landroid/widget/ImageView;

    const v2, 0x7f0800d9

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 336
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iput-boolean v1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->acceptedTerms:Z

    .line 337
    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, " "

    const-string v3, ""

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 339
    iget-object v2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v2, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$100(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->blueDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$2;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v1, v0}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$800(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    :cond_4
    :goto_0
    return-void
.end method
