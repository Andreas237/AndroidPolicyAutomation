.class Lcom/shopkick/app/account/EditProfileScreen$3;
.super Ljava/lang/Object;
.source "EditProfileScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EditProfileScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/EditProfileScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/EditProfileScreen;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v1, v1, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->firstName:Ljava/lang/String;

    .line 277
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-nez p1, :cond_1

    .line 278
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->firstNameText:Landroid/widget/EditText;

    const v0, 0x7f110182

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setHint(I)V

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/EditProfileScreen;->updateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v1, v1, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->lastName:Ljava/lang/String;

    .line 282
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-nez p1, :cond_1

    .line 283
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/EditProfileScreen;->lastNameText:Landroid/widget/EditText;

    const v0, 0x7f110184

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setHint(I)V

    .line 286
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/EditProfileScreen$3;->this$0:Lcom/shopkick/app/account/EditProfileScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/EditProfileScreen;->access$200(Lcom/shopkick/app/account/EditProfileScreen;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
