.class public Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;
.source "ActivityHelpOptionsDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;,
        Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;
    }
.end annotation


# instance fields
.field private helpOptionOrdinals:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance([Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;Ljava/lang/String;)Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;
    .locals 6

    .line 56
    new-instance v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;-><init>()V

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    .line 61
    array-length v2, p0

    new-array v2, v2, [I

    .line 62
    array-length v3, p0

    new-array v3, v3, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;

    .line 64
    :goto_0
    array-length v4, p0

    if-ge v1, v4, :cond_1

    .line 65
    new-instance v4, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;

    aget-object v5, p0, v1

    invoke-direct {v4, v5, p1}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;-><init>(Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;Ljava/lang/String;)V

    aput-object v4, v3, v1

    .line 66
    aget-object v4, p0, v1

    invoke-virtual {v4}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->ordinal()I

    move-result v4

    aput v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 69
    :cond_0
    new-array v2, v1, [I

    .line 70
    new-array v3, v1, [Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;

    .line 73
    :cond_1
    invoke-static {v3}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->newArgs([Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;)Landroid/os/Bundle;

    move-result-object p0

    const-string p1, "help_option_ordinals"

    .line 75
    invoke-virtual {p0, p1, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    .line 76
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public fromIndex(I)Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;
    .locals 2

    if-ltz p1, :cond_0

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->options:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->helpOptionOrdinals:[I

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    const/4 v0, 0x0

    if-ltz p1, :cond_1

    .line 90
    invoke-static {}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->values()[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    move-result-object v1

    array-length v1, v1

    if-ge p1, v1, :cond_1

    .line 91
    invoke-static {}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->values()[Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    move-result-object v0

    aget-object v0, v0, p1

    :cond_1
    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 99
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    if-eqz p3, :cond_0

    const-string p2, "help_option_ordinals"

    .line 102
    invoke-virtual {p3, p2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->helpOptionOrdinals:[I

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "help_option_ordinals"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->helpOptionOrdinals:[I

    :cond_1
    :goto_0
    return-object p1
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "help_option_ordinals"

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;->helpOptionOrdinals:[I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    return-void
.end method
