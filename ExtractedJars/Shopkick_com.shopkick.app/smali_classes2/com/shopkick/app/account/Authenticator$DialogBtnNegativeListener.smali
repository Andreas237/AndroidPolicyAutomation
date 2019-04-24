.class Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;
.super Ljava/lang/Object;
.source "Authenticator.java"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/Authenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DialogBtnNegativeListener"
.end annotation


# instance fields
.field private authenticatorWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/account/Authenticator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/Authenticator;)V
    .locals 1

    .line 813
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 814
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/dialog/SKDialogFragment;",
            ">;)V"
        }
    .end annotation

    .line 820
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 821
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 822
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/account/Authenticator;

    .line 824
    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$1000(Lcom/shopkick/app/account/Authenticator;)Lcom/shopkick/app/account/Authenticator$AuthMedium;

    move-result-object v1

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$1100(Lcom/shopkick/app/account/Authenticator;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 825
    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$1200(Lcom/shopkick/app/account/Authenticator;)Lcom/shopkick/app/registration/GoogleSignInController;

    move-result-object v1

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$1100(Lcom/shopkick/app/account/Authenticator;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/registration/GoogleSignInController;->logout(Landroid/app/Activity;)V

    :cond_1
    const/4 v1, 0x0

    .line 828
    invoke-static {v0, v1}, Lcom/shopkick/app/account/Authenticator;->access$1300(Lcom/shopkick/app/account/Authenticator;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 830
    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$1400(Lcom/shopkick/app/account/Authenticator;)V

    .line 833
    :cond_2
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    return-void
.end method
