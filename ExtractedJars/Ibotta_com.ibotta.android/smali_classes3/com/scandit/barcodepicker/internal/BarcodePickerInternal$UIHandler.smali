.class Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;
.super Landroid/os/Handler;
.source "BarcodePickerInternal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UIHandler"
.end annotation


# static fields
.field static final ADJUST_SUBVIEW:I


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 529
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 534
    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    goto :goto_0

    .line 536
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$1100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;II)V

    :goto_0
    return-void
.end method
