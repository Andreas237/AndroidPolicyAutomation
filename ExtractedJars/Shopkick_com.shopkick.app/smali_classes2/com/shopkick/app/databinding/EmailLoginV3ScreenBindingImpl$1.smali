.class Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;
.super Ljava/lang/Object;
.source "EmailLoginV3ScreenBindingImpl.java"

# interfaces
.implements Landroid/databinding/InverseBindingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;


# direct methods
.method constructor <init>(Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;->this$0:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange()V
    .locals 5

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;->this$0:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;

    iget-object v0, v0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-static {v0}, Landroid/databinding/adapters/TextViewBindingAdapter;->getTextString(Landroid/widget/TextView;)Ljava/lang/String;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl$1;->this$0:Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;

    iget-object v1, v1, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBindingImpl;->mEmailViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_2

    .line 52
    invoke-virtual {v1}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->getEmailLoginModel()Lcom/shopkick/app/model/EmailLoginModel;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v2, :cond_2

    .line 60
    invoke-virtual {v1, v0}, Lcom/shopkick/app/model/EmailLoginModel;->setEmail(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
