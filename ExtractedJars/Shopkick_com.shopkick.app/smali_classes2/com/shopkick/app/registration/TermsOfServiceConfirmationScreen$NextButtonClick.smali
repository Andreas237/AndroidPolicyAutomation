.class Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;
.super Ljava/lang/Object;
.source "TermsOfServiceConfirmationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NextButtonClick"
.end annotation


# instance fields
.field private confirmationScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;)V
    .locals 1

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;

    if-eqz p1, :cond_0

    .line 126
    invoke-static {p1}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->access$000(Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;)V

    :cond_0
    return-void
.end method