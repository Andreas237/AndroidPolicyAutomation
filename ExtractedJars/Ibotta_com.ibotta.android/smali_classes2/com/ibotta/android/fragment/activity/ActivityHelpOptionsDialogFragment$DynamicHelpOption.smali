.class Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;
.super Ljava/lang/Object;
.source "ActivityHelpOptionsDialogFragment.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/options/OptionsDialogFragment$Option;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DynamicHelpOption"
.end annotation


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;Ljava/lang/String;)V
    .locals 3

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    sget-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    if-ne p1, v0, :cond_0

    .line 43
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->VIEW_RECEIPT:Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->getButtonId()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;->name:Ljava/lang/String;

    goto :goto_0

    .line 45
    :cond_0
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p2

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$HelpOption;->getButtonId()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;->name:Ljava/lang/String;

    :goto_0
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/ActivityHelpOptionsDialogFragment$DynamicHelpOption;->name:Ljava/lang/String;

    return-object v0
.end method
