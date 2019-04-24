.class public Lcom/ibotta/android/AppRater;
.super Ljava/lang/Object;
.source "AppRater.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;


# static fields
.field public static final DAYS_UNTIL_PROMPT:I = 0x7

.field public static final LAUNCHES_UNTIL_PROMPT:I = 0x5

.field public static final MIN_LENGTH:I = 0x3

.field public static final TAG_DO_YOU_LOVE_IBOTTA:Ljava/lang/String; = "do_you_love_ibotta"

.field public static final TAG_ERROR_TOO_SHORT:Ljava/lang/String; = "error_too_short"

.field public static final TAG_FEEDBACK_FAILED:Ljava/lang/String; = "feedback_failed"

.field public static final TAG_FEEDBACK_SUCCESS:Ljava/lang/String; = "feedback_success"

.field public static final TAG_FLY_UP_FEEDBACK:Ljava/lang/String; = "fly_up_feedback"

.field public static final TAG_RATE_YES_CHOICES:Ljava/lang/String; = "rate_yes_choices"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appboy:Lcom/appboy/Appboy;

.field private final compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

.field private final context:Landroid/content/Context;

.field private customerEmail:Ljava/lang/String;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/activity/CompatSupplier;Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    .line 56
    iput-object p3, p0, Lcom/ibotta/android/AppRater;->appboy:Lcom/appboy/Appboy;

    .line 57
    iput-object p4, p0, Lcom/ibotta/android/AppRater;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 58
    iput-object p5, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 59
    iput-object p6, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    return-void
.end method

.method private notifyTooShort()V
    .locals 4

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f1100a9

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 198
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    .line 199
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "error_too_short"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method private onFeedbackSuccess()V
    .locals 4

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "feedback_presented"

    const-string v2, "sent"

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const-wide/32 v1, 0x7f11055b

    .line 212
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    .line 213
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 214
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "feedback_success"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method private showDoYouLoveIbotta()V
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const v1, 0x7f11055f

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 92
    iget-object v1, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const v2, 0x7f11055e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 94
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 96
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 98
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "do_you_love_ibotta"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f1101b9
        0x7f11020d
    .end array-data
.end method

.method private showFeedbackFlyUp()V
    .locals 4

    .line 113
    invoke-static {}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 114
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 115
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "fly_up_feedback"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method private showRateYesChoices()V
    .locals 4

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const v1, 0x7f11055d

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const v2, 0x7f11055c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    .line 105
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 107
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 109
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "rate_yes_choices"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f1101bf
        0x7f1101b6
        0x7f1101da
    .end array-data
.end method


# virtual methods
.method public check(Ljava/lang/String;)Z
    .locals 8

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->isHideRateApp()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 67
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/AppRater;->customerEmail:Ljava/lang/String;

    .line 70
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->incrementLaunchCount()J

    move-result-wide v2

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->getRateAppDate()J

    move-result-wide v4

    const-wide/16 v6, 0x5

    cmp-long p1, v2, v6

    if-ltz p1, :cond_1

    .line 78
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x7

    invoke-virtual {p1, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    add-long/2addr v4, v6

    cmp-long p1, v2, v4

    if-ltz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-eqz v1, :cond_2

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->showDoYouLoveIbotta()V

    :cond_2
    return v1
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 3

    const-string v0, "fly_up_feedback"

    .line 171
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 172
    new-instance p1, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;

    iget-object v0, p0, Lcom/ibotta/android/AppRater;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const v2, 0x7f11055a

    .line 173
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-direct {p1, v0, p2, v1, v2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string p3, "do_you_love_ibotta"

    .line 132
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const v0, 0x7f11020d

    if-eqz p3, :cond_1

    if-ne v0, p2, :cond_0

    .line 134
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "do_you_love_presented"

    const-string p3, "yes"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->showRateYesChoices()V

    goto/16 :goto_0

    :cond_0
    const p1, 0x7f1101b9

    if-ne p1, p2, :cond_5

    .line 137
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "do_you_love_presented"

    const-string p3, "no"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->neverShowRateApp()V

    .line 139
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->showFeedbackFlyUp()V

    goto :goto_0

    :cond_1
    const-string p3, "rate_yes_choices"

    .line 141
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const p1, 0x7f1101da

    if-ne p1, p2, :cond_2

    .line 143
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "rate_app"

    const-string p3, "rate"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 146
    iget-object p2, p0, Lcom/ibotta/android/AppRater;->context:Landroid/content/Context;

    const p3, 0x7f1101ad

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 147
    iget-object p2, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    invoke-interface {p2, p1}, Lcom/ibotta/android/activity/CompatSupplier;->startActivity(Landroid/content/Intent;)V

    .line 150
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->neverShowRateApp()V

    goto :goto_0

    :cond_2
    const p1, 0x7f1101bf

    if-ne p1, p2, :cond_3

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "rate_app"

    const-string p3, "later"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->resetRateApp()V

    goto :goto_0

    :cond_3
    const p1, 0x7f1101b6

    if-ne p1, p2, :cond_5

    .line 157
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "rate_app"

    const-string p3, "never"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->neverShowRateApp()V

    goto :goto_0

    :cond_4
    const-string p3, "feedback_failed"

    .line 162
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-ne v0, p2, :cond_5

    .line 163
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->showFeedbackFlyUp()V

    :cond_5
    :goto_0
    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 2

    const-string v0, "do_you_love_ibotta"

    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 125
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v0, "do_you_love_presented"

    const-string v1, "no"

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p1}, Lcom/ibotta/android/state/user/UserState;->resetRateApp()V

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 1

    const-string p2, "fly_up_feedback"

    .line 204
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/AppRater;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "feedback_presented"

    const-string v0, "cancel"

    invoke-interface {p1, p2, v0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 3

    const-string v0, "fly_up_feedback"

    .line 181
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->getEventId()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 182
    check-cast p2, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;

    invoke-virtual {p2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->getInput()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    .line 184
    invoke-virtual {p2}, Lcom/ibotta/android/view/common/TextCaptureFlyUpPageCreator$TextCapturePageEvent;->getInput()Ljava/lang/String;

    move-result-object p2

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/AppRater;->appboy:Lcom/appboy/Appboy;

    iget-object v1, p0, Lcom/ibotta/android/AppRater;->customerEmail:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lcom/appboy/Appboy;->submitFeedback(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 187
    sget-object p2, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v0, p0, Lcom/ibotta/android/AppRater;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->hide(Lcom/ibotta/android/activity/CompatSupplier;Ljava/lang/String;)V

    .line 189
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->onFeedbackSuccess()V

    goto :goto_0

    .line 191
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/AppRater;->notifyTooShort()V

    :cond_1
    :goto_0
    return-void
.end method
