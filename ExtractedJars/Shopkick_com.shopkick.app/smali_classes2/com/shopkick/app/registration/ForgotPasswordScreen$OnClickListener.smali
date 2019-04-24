.class Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;
.super Ljava/lang/Object;
.source "ForgotPasswordScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/ForgotPasswordScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnClickListener"
.end annotation


# instance fields
.field private screenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/ForgotPasswordScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/ForgotPasswordScreen;)V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 153
    iget-object p1, p0, Lcom/shopkick/app/registration/ForgotPasswordScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/registration/ForgotPasswordScreen;

    if-nez p1, :cond_0

    return-void

    .line 158
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/registration/ForgotPasswordScreen;->access$000(Lcom/shopkick/app/registration/ForgotPasswordScreen;)V

    return-void
.end method
