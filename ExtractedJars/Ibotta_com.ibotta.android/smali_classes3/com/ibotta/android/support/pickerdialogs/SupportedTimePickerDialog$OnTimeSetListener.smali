.class public interface abstract Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;
.super Ljava/lang/Object;
.source "SupportedTimePickerDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnTimeSetListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/support/pickerdialogs/SupportedTimePickerDialog$OnTimeSetListener;",
        "",
        "onTimeSet",
        "",
        "view",
        "Landroid/widget/TimePicker;",
        "hourOfDay",
        "",
        "minute",
        "pickerdialogs_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract onTimeSet(Landroid/widget/TimePicker;II)V
    .param p1    # Landroid/widget/TimePicker;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
