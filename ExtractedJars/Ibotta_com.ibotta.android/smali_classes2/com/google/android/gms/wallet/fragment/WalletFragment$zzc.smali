.class final Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;
.super Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/WalletFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "zzc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/DeferredLifecycleHelper<",
        "Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final synthetic zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-direct {p0}, Lcom/google/android/gms/dynamic/DeferredLifecycleHelper;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/zzb;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragment;)V

    return-void
.end method


# virtual methods
.method protected final createDelegate(Lcom/google/android/gms/dynamic/OnDelegateCreatedListener;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/dynamic/OnDelegateCreatedListener<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzc(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzd(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/dynamic/FragmentWrapper;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v2}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zze(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzf(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zza;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/wallet/zzak;->zza(Landroid/app/Activity;Lcom/google/android/gms/dynamic/IFragmentWrapper;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/wallet/zzo;)Lcom/google/android/gms/internal/wallet/zzl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    new-instance v2, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;-><init>(Lcom/google/android/gms/internal/wallet/zzl;Lcom/google/android/gms/wallet/fragment/zzb;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    :try_end_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/dynamic/OnDelegateCreatedListener;->onDelegateCreated(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzg(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzg(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzh(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzh(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;Lcom/google/android/gms/wallet/MaskedWalletRequest;)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzi(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWallet;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzi(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWallet;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;Lcom/google/android/gms/wallet/MaskedWallet;)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzj(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzb(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zzj(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment$zzb;Z)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    nop

    :catch_0
    :cond_3
    return-void
.end method

.method protected final handleGooglePlayUnavailable(Landroid/widget/FrameLayout;)V
    .locals 6

    new-instance v0, Landroid/widget/Button;

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/google/android/gms/wallet/R$string;->wallet_buy_button_place_holder:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zze(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    move-result-object v1

    const/4 v2, -0x2

    const/4 v3, -0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zze(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getFragmentStyle()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v4, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    const-string v5, "buyButtonWidth"

    invoke-virtual {v1, v5, v4, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I

    move-result v3

    const-string v5, "buyButtonHeight"

    invoke-virtual {v1, v5, v4, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I

    move-result v2

    :cond_0
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$zzc;->zzfw:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->zza(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const v0, 0xbdfcb8

    invoke-static {p1, v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    const/4 v1, -0x1

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorDialogFragment(ILandroid/app/Activity;I)Z

    return-void
.end method
