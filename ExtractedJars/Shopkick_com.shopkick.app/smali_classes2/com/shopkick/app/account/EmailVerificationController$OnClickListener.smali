.class Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;
.super Ljava/lang/Object;
.source "EmailVerificationController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EmailVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnClickListener"
.end annotation


# instance fields
.field private controller:Lcom/shopkick/app/account/EmailVerificationController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/EmailVerificationController;)V
    .locals 2

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Controller should not be null"

    .line 206
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 207
    iput-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 212
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/EmailVerificationController;->access$000(Lcom/shopkick/app/account/EmailVerificationController;)Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Action should not be null"

    .line 213
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/account/EmailVerificationController;->access$002(Lcom/shopkick/app/account/EmailVerificationController;Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;)Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    .line 218
    sget-object v0, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$ModalButtonAction:[I

    invoke-virtual {p1}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 223
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/EmailVerificationController;->access$200(Lcom/shopkick/app/account/EmailVerificationController;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    invoke-static {v1}, Lcom/shopkick/app/account/EmailVerificationController;->access$300(Lcom/shopkick/app/account/EmailVerificationController;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/account/EmailVerificationController;->sendEmailVerification(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 220
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/account/EmailVerificationController$OnClickListener;->controller:Lcom/shopkick/app/account/EmailVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/EmailVerificationController;->access$100(Lcom/shopkick/app/account/EmailVerificationController;)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
