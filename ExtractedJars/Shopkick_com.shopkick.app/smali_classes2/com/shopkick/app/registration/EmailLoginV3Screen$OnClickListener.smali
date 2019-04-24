.class Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;
.super Ljava/lang/Object;
.source "EmailLoginV3Screen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/EmailLoginV3Screen;
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
            "Lcom/shopkick/app/registration/EmailLoginV3Screen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/registration/EmailLoginV3Screen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/registration/EmailLoginV3Screen;

    if-nez v0, :cond_0

    return-void

    .line 207
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->access$000(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 208
    invoke-static {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->access$100(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V

    goto :goto_0

    .line 209
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->access$200(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v1

    if-ne p1, v1, :cond_2

    .line 210
    invoke-static {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->access$300(Lcom/shopkick/app/registration/EmailLoginV3Screen;)V

    goto :goto_0

    .line 211
    :cond_2
    invoke-static {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->access$400(Lcom/shopkick/app/registration/EmailLoginV3Screen;)Landroid/view/View;

    move-result-object v1

    if-ne p1, v1, :cond_3

    .line 212
    invoke-virtual {v0}, Lcom/shopkick/app/registration/EmailLoginV3Screen;->hideKeyboard()V

    :cond_3
    :goto_0
    return-void
.end method
