.class Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;
.super Ljava/lang/Object;
.source "LinkPhoneNumberScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/LinkPhoneNumberScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NextButtonClickListener"
.end annotation


# instance fields
.field private linkPhoneNumberScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/LinkPhoneNumberScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V
    .locals 1

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;->linkPhoneNumberScreenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;->linkPhoneNumberScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;

    if-eqz p1, :cond_0

    .line 204
    invoke-static {p1}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->access$000(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V

    :cond_0
    return-void
.end method
