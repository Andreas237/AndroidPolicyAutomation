.class public final Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;
.super Landroid/app/AlertDialog;
.source "SupportedDatePickerDialog.kt"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/widget/DatePicker$OnDateChangedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;,
        Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSupportedDatePickerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedDatePickerDialog.kt\ncom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog\n*L\n1#1,252:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002)*B\u000f\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tB\u001f\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eB)\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fB/\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u0013B9\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0014\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u0015BE\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0014\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0008H\u0016J(\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008H\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0016J\u0008\u0010&\u001a\u00020%H\u0016J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010(\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;",
        "Landroid/app/AlertDialog;",
        "Landroid/content/DialogInterface$OnClickListener;",
        "Landroid/widget/DatePicker$OnDateChangedListener;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "themeResId",
        "",
        "(Landroid/content/Context;I)V",
        "listener",
        "Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;",
        "calendar",
        "Ljava/util/Calendar;",
        "(Landroid/content/Context;Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;)V",
        "(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;)V",
        "year",
        "month",
        "dayOfMonth",
        "(Landroid/content/Context;Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V",
        "monthOfYear",
        "(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V",
        "dateSetListener",
        "(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;III)V",
        "datePicker",
        "Landroid/widget/DatePicker;",
        "getDatePicker",
        "()Landroid/widget/DatePicker;",
        "onClick",
        "",
        "dialog",
        "Landroid/content/DialogInterface;",
        "which",
        "onDateChanged",
        "view",
        "onRestoreInstanceState",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onSaveInstanceState",
        "setOnDateSetListener",
        "updateDate",
        "Companion",
        "OnDateSetListener",
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
.field public static final Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;

.field private static final DAY:Ljava/lang/String; = "day"

.field private static final MONTH:Ljava/lang/String; = "month"

.field private static final YEAR:Ljava/lang/String; = "year"


# instance fields
.field private final datePicker:Landroid/widget/DatePicker;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private dateSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;

.field private dayOfMonth:I

.field private monthOfYear:I

.field private year:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    const/4 v4, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v6, p4

    move v7, p5

    move v8, p6

    .line 148
    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Calendar;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendar"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 104
    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;III)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;III)V
    .locals 1
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 47
    sget-object v0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->Companion:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;

    invoke-static {v0, p1, p2}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;->access$resolveDialogTheme(Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$Companion;Landroid/content/Context;I)I

    move-result p2

    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dateSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;

    iput p5, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->year:I

    iput p6, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->monthOfYear:I

    iput p7, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dayOfMonth:I

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 152
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 154
    sget p3, Lcom/ibotta/android/support/pickerdialogs/R$layout;->view_date_picker:I

    const/4 p5, 0x0

    invoke-virtual {p2, p3, p5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Landroid/widget/DatePicker;

    iput-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    .line 156
    invoke-virtual {p4, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    iput p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->year:I

    const/4 p2, 0x2

    .line 157
    invoke-virtual {p4, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    iput p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->monthOfYear:I

    const/4 p2, 0x5

    .line 158
    invoke-virtual {p4, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    iput p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dayOfMonth:I

    .line 160
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    iget p3, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->year:I

    iget p4, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->monthOfYear:I

    iget p5, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dayOfMonth:I

    move-object p6, p0

    check-cast p6, Landroid/widget/DatePicker$OnDateChangedListener;

    invoke-virtual {p2, p3, p4, p5, p6}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    .line 161
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p2}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->setView(Landroid/view/View;)V

    const/4 p2, -0x1

    const p3, 0x104000a

    .line 163
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    move-object p4, p0

    check-cast p4, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p2, p3, p4}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 p2, -0x2

    const/high16 p3, 0x1040000

    .line 164
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p2, p1, p4}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void

    .line 154
    :cond_1
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.widget.DatePicker"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 125
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Calendar;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calendar"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, p1, v0, p2, p3}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;Ljava/util/Calendar;)V

    return-void
.end method


# virtual methods
.method public final getDatePicker()Landroid/widget/DatePicker;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    return-object v0
.end method

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

    .line 182
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dateSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;

    if-eqz p1, :cond_0

    .line 185
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {p2}, Landroid/widget/DatePicker;->clearFocus()V

    .line 186
    iget-object p2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {p2}, Landroid/widget/DatePicker;->getYear()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getMonth()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v2

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;->onDateSet(Landroid/widget/DatePicker;III)V

    goto :goto_0

    .line 188
    :pswitch_1
    invoke-virtual {p0}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->cancel()V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onDateChanged(Landroid/widget/DatePicker;III)V
    .locals 1
    .param p1    # Landroid/widget/DatePicker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    iget-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    move-object v0, p0

    check-cast v0, Landroid/widget/DatePicker$OnDateChangedListener;

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "savedInstanceState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    const-string v0, "year"

    .line 214
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "month"

    .line 215
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "day"

    .line 216
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 217
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    move-object v3, p0

    check-cast v3, Landroid/widget/DatePicker$OnDateChangedListener;

    invoke-virtual {v2, v0, v1, p1, v3}, Landroid/widget/DatePicker;->init(IIILandroid/widget/DatePicker$OnDateChangedListener;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Bundle;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 205
    invoke-super {p0}, Landroid/app/AlertDialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "year"

    .line 206
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getYear()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "month"

    .line 207
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getMonth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "day"

    .line 208
    iget-object v2, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v2}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "state"

    .line 209
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setOnDateSetListener(Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->dateSetListener:Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;

    return-void
.end method

.method public final updateDate(III)V
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v0, p1, p2, p3}, Landroid/widget/DatePicker;->updateDate(III)V

    return-void
.end method
