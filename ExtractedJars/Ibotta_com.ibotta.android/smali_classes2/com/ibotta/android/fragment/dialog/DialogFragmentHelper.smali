.class public final enum Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;
.super Ljava/lang/Enum;
.source "DialogFragmentHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

.field public static final enum INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const/4 v0, 0x1

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->$VALUES:[Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->$VALUES:[Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    return-object v0
.end method


# virtual methods
.method public hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V
    .locals 2

    .line 65
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$2;-><init>(Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public hideSync(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 86
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/activity/CompatSupplier;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    const-string p1, "hideSync called on dialog, but FragmentManager is null. tag=%1$s"

    .line 88
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 92
    :cond_1
    invoke-virtual {p1, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string p1, "Hiding dialog fragment: %1$s"

    .line 94
    new-array v3, v1, [Ljava/lang/Object;

    aput-object p2, v3, v0

    invoke-static {p1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    :try_start_0
    check-cast v2, Landroid/support/v4/app/DialogFragment;

    invoke-virtual {v2}, Landroid/support/v4/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to dismiss a dialog: tag=%1$s"

    .line 98
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    invoke-static {p1, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const-string v2, "Dialog fragment not found: tag=%1$s, fm=%2$s"

    const/4 v3, 0x2

    .line 102
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v0

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public isShowing(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 110
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/activity/CompatSupplier;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    .line 114
    :cond_1
    invoke-virtual {p1, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 115
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;)V
    .locals 1

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 2

    .line 21
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper$1;-><init>(Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public showSync(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 5

    if-eqz p1, :cond_3

    .line 29
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->isShowing(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 34
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/android/activity/CompatSupplier;->getCompatFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 40
    :try_start_0
    invoke-virtual {p1, p3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 41
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    if-eqz v1, :cond_2

    .line 43
    instance-of v3, v1, Landroid/support/v4/app/DialogFragment;

    if-eqz v3, :cond_2

    .line 44
    check-cast v1, Landroid/support/v4/app/DialogFragment;

    invoke-virtual {v1}, Landroid/support/v4/app/DialogFragment;->dismissAllowingStateLoss()V

    :cond_2
    const-string v1, "Showing fragment: tag=%1$s, fm=%2$s"

    const/4 v3, 0x2

    .line 48
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p3, v3, v0

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;

    .line 51
    invoke-virtual {p2, p1, p3}, Landroid/support/v4/app/DialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    const-string p2, "In fragment manager: d=%1$s"

    .line 54
    new-array v1, v4, [Ljava/lang/Object;

    invoke-virtual {p1, p3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-static {p2, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to show DialogFragment."

    .line 60
    new-array p3, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method
