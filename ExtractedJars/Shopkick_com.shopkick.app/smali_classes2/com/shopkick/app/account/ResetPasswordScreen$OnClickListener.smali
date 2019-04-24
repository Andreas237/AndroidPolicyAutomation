.class Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;
.super Ljava/lang/Object;
.source "ResetPasswordScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/ResetPasswordScreen;
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
            "Lcom/shopkick/app/account/ResetPasswordScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/ResetPasswordScreen;)V
    .locals 1

    .line 288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 289
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 294
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/account/ResetPasswordScreen;

    if-nez v0, :cond_0

    return-void

    .line 299
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$200(Lcom/shopkick/app/account/ResetPasswordScreen;)Landroid/widget/ImageView;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 300
    invoke-static {v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$300(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    goto :goto_0

    .line 301
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$400(Lcom/shopkick/app/account/ResetPasswordScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v1

    if-ne p1, v1, :cond_2

    .line 302
    invoke-static {v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->access$500(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    :cond_2
    :goto_0
    return-void
.end method
