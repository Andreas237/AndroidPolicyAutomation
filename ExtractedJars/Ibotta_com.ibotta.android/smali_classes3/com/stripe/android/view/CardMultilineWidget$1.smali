.class Lcom/stripe/android/view/CardMultilineWidget$1;
.super Ljava/lang/Object;
.source "CardMultilineWidget.java"

# interfaces
.implements Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardMultilineWidget;->initView(Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$1;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCardBrandChanged(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 352
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$1;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$000(Lcom/stripe/android/view/CardMultilineWidget;Ljava/lang/String;)V

    return-void
.end method
