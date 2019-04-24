.class public final Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;
.super Landroid/app/AlertDialog;
.source "SupportedTimePickerDialog.kt"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/widget/TimePicker$OnTimeChangedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;,
        Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002!\"B9\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010\u0011\u001a\u00020\rH\u0003J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0019H\u0016J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0016\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;",
        "Landroid/app/AlertDialog;",
        "Landroid/content/DialogInterface$OnClickListener;",
        "Landroid/widget/TimePicker$OnTimeChangedListener;",
        "context",
        "Landroid/content/Context;",
        "themeResId",
        "",
        "timeSetListener",
        "Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;",
        "mInitialHourOfDay",
        "mInitialMinute",
        "mIs24HourView",
        "",
        "(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZ)V",
        "timePicker",
        "Landroid/widget/TimePicker;",
        "isInputValid",
        "onClick",
        "",
        "dialog",
        "Landroid/content/DialogInterface;",
        "which",
        "onRestoreInstanceState",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onSaveInstanceState",
        "onTimeChanged",
        "view",
        "hourOfDay",
        "minute",
        "updateTime",
        "minuteOfHour",
        "Companion",
        "OnTimeSetListener",
        "pickerdialogs_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;

.field private static final HOUR:Ljava/lang/String; = "hour"

.field private static final IS_24_HOUR:Ljava/lang/String; = "is24hour"

.field private static final MINUTE:Ljava/lang/String; = "minute"


# instance fields
.field private final timePicker:Landroid/widget/TimePicker;

.field private final timeSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZ)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeSetListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;

    invoke-static {v0, p1, p2}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;->access$resolveDialogTheme(Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$Companion;Landroid/content/Context;I)I

    move-result p2

    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timeSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 71
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 73
    sget p3, Lcom/ibotta/android/support/pickerdialogs/R$layout;->view_time_picker_dialog:I

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Landroid/widget/TimePicker;

    iput-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    .line 74
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    .line 75
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TimePicker;->setCurrentHour(Ljava/lang/Integer;)V

    .line 76
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TimePicker;->setCurrentMinute(Ljava/lang/Integer;)V

    .line 77
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    move-object p3, p0

    check-cast p3, Landroid/widget/TimePicker$OnTimeChangedListener;

    invoke-virtual {p2, p3}, Landroid/widget/TimePicker;->setOnTimeChangedListener(Landroid/widget/TimePicker$OnTimeChangedListener;)V

    .line 78
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p2}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->setView(Landroid/view/View;)V

    const/4 p2, -0x1

    const p3, 0x104000a

    .line 80
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    move-object p4, p0

    check-cast p4, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p2, p3, p4}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 p2, -0x2

    const/high16 p3, 0x1040000

    .line 81
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p2, p1, p4}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void

    .line 73
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.widget.TimePicker"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p7, p7, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 38
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZ)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final isInputValid()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 104
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v0}, Landroid/widget/TimePicker;->validateInput()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1    # Landroid/content/DialogInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 91
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->isInputValid()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 94
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {p1}, Landroid/widget/TimePicker;->clearFocus()V

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timeSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;

    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {p2}, Landroid/widget/TimePicker;->getCurrentHour()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "timePicker.currentHour"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v1}, Landroid/widget/TimePicker;->getCurrentMinute()Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "timePicker.currentMinute"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, p2, v0, v1}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;->onTimeSet(Landroid/widget/TimePicker;II)V

    goto :goto_0

    .line 98
    :pswitch_1
    invoke-virtual {p0}, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->cancel()V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedInstanceState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    const-string v0, "hour"

    .line 127
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "minute"

    .line 128
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 129
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    const-string v3, "is24hour"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    .line 130
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TimePicker;->setCurrentHour(Ljava/lang/Integer;)V

    .line 131
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TimePicker;->setCurrentMinute(Ljava/lang/Integer;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Bundle;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 118
    invoke-super {p0}, Landroid/app/AlertDialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "hour"

    .line 119
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v2}, Landroid/widget/TimePicker;->getCurrentHour()Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "timePicker.currentHour"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "minute"

    .line 120
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v2}, Landroid/widget/TimePicker;->getCurrentMinute()Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "timePicker.currentMinute"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "is24hour"

    .line 121
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-virtual {v2}, Landroid/widget/TimePicker;->is24HourView()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "state"

    .line 122
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onTimeChanged(Landroid/widget/TimePicker;II)V
    .locals 0
    .param p1    # Landroid/widget/TimePicker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final updateTime(II)V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TimePicker;->setCurrentHour(Ljava/lang/Integer;)V

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;->timePicker:Landroid/widget/TimePicker;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TimePicker;->setCurrentMinute(Ljava/lang/Integer;)V

    return-void
.end method
