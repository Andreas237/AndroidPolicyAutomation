.class public Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;
.super Ljava/lang/Object;
.source "PasswordPrompterImpl.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

.field private final dialogFragmentHelper:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

.field private final email:Ljava/lang/String;

.field private final passwordCache:Lcom/ibotta/android/security/PasswordCache;

.field private final passwordListener:Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;

.field private final tag:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/android/security/PasswordCache;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->dialogFragmentHelper:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->passwordListener:Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->email:Ljava/lang/String;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    return-void
.end method

.method private handleCapturedPassword(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {v0, p2}, Lcom/ibotta/android/security/PasswordCache;->put(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->passwordListener:Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;->onPasswordCaptured(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private validatePassword(Ljava/lang/String;)Z
    .locals 4

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1101d0

    new-array v2, v0, [Ljava/lang/Object;

    invoke-interface {p1, v1, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->dialogFragmentHelper:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    invoke-static {p1}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object p1

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    invoke-virtual {v1, v2, p1, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method


# virtual methods
.method public capturePassword()V
    .locals 6

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {v0}, Lcom/ibotta/android/security/PasswordCache;->get()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->handleCapturedPassword(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1101cf

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    .line 66
    invoke-interface {v0, v1, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v3, 0x7f1101ce

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->email:Ljava/lang/String;

    aput-object v5, v4, v2

    .line 67
    invoke-interface {v1, v3, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x81

    const/4 v3, 0x2

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 65
    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInputInstance(Ljava/lang/String;Ljava/lang/String;I[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 71
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 72
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->dialogFragmentHelper:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x7f110142
        0x7f1101f2
    .end array-data
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1101f2

    if-ne p2, p1, :cond_0

    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->validatePassword(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->tag:Ljava/lang/String;

    invoke-direct {p0, p1, p3}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterImpl;->handleCapturedPassword(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
