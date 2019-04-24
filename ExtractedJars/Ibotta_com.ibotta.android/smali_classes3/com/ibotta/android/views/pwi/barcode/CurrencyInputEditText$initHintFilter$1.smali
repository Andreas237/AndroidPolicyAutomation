.class final Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;
.super Ljava/lang/Object;
.source "CurrencyInputEditText.kt"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->initHintFilter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<anonymous parameter 0>",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "<anonymous parameter 1>",
        "",
        "onFocusChange"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 35
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$initFilter(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V

    .line 36
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    const/4 p2, 0x0

    check-cast p2, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method
