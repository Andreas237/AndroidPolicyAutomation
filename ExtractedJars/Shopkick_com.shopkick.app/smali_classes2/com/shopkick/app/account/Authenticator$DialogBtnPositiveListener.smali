.class Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;
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
    name = "DialogBtnPositiveListener"
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

    .line 791
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 792
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/dialog/SKDialogFragment;",
            ">;)V"
        }
    .end annotation

    .line 798
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 799
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 800
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;->authenticatorWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/account/Authenticator;

    .line 802
    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-static {v0, v1}, Lcom/shopkick/app/account/Authenticator;->access$802(Lcom/shopkick/app/account/Authenticator;Lcom/shopkick/app/account/Authenticator$AuthAction;)Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 803
    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator;->access$900(Lcom/shopkick/app/account/Authenticator;)V

    .line 805
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/dialog/SKDialogFragment;

    invoke-virtual {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hide()V

    return-void
.end method
