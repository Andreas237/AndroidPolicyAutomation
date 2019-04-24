.class Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;
.super Ljava/lang/Object;
.source "RegistrationV3Screen.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/RegistrationV3Screen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnEditorActionListener"
.end annotation


# instance fields
.field private screenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/RegistrationV3Screen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/RegistrationV3Screen;)V
    .locals 1

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    const/4 p3, 0x6

    if-ne p2, p3, :cond_1

    .line 248
    iget-object p2, p0, Lcom/shopkick/app/registration/RegistrationV3Screen$OnEditorActionListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/registration/RegistrationV3Screen;

    if-nez p2, :cond_0

    return p1

    .line 252
    :cond_0
    invoke-static {p2}, Lcom/shopkick/app/registration/RegistrationV3Screen;->access$100(Lcom/shopkick/app/registration/RegistrationV3Screen;)V

    .line 255
    invoke-static {p2}, Lcom/shopkick/app/registration/RegistrationV3Screen;->access$400(Lcom/shopkick/app/registration/RegistrationV3Screen;)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->requestFocus()Z

    .line 256
    invoke-virtual {p2}, Lcom/shopkick/app/registration/RegistrationV3Screen;->hideKeyboard()V

    :cond_1
    return p1
.end method
