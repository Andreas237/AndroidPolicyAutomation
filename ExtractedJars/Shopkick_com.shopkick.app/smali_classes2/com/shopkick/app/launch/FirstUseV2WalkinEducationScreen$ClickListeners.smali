.class Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;
.super Ljava/lang/Object;
.source "FirstUseV2WalkinEducationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ClickListeners"
.end annotation


# instance fields
.field private screenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;->screenWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;

    .line 98
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen$ClickListeners;->screenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f0904a8

    if-ne v1, v2, :cond_0

    .line 100
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->access$000(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x7f09040a

    if-ne p1, v1, :cond_1

    .line 102
    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;->access$100(Lcom/shopkick/app/launch/FirstUseV2WalkinEducationScreen;)V

    :cond_1
    :goto_0
    return-void
.end method
