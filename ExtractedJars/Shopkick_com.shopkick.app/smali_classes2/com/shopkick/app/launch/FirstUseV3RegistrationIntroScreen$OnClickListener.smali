.class Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;
.super Ljava/lang/Object;
.source "FirstUseV3RegistrationIntroScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;
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
            "Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen$OnClickListener;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;

    if-nez v0, :cond_0

    return-void

    .line 108
    :cond_0
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$000(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v1

    if-ne p1, v1, :cond_1

    .line 109
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$100(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V

    goto :goto_0

    .line 110
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$200(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object v1

    if-ne p1, v1, :cond_2

    .line 111
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$300(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V

    goto :goto_0

    .line 112
    :cond_2
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$400(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v1

    if-ne p1, v1, :cond_3

    .line 113
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;->access$500(Lcom/shopkick/app/launch/FirstUseV3RegistrationIntroScreen;)V

    :cond_3
    :goto_0
    return-void
.end method
