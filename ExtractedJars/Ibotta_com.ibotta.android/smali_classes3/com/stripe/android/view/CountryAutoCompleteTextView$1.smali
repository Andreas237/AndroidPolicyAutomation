.class Lcom/stripe/android/view/CountryAutoCompleteTextView$1;
.super Ljava/lang/Object;
.source "CountryAutoCompleteTextView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CountryAutoCompleteTextView;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CountryAutoCompleteTextView;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/CountryAutoCompleteTextView;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView$1;->this$0:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 72
    iget-object p1, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView$1;->this$0:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-static {p1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->access$000(Lcom/stripe/android/view/CountryAutoCompleteTextView;)Landroid/widget/AutoCompleteTextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 73
    iget-object p2, p0, Lcom/stripe/android/view/CountryAutoCompleteTextView$1;->this$0:Lcom/stripe/android/view/CountryAutoCompleteTextView;

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->updateUIForCountryEntered(Ljava/lang/String;)V

    return-void
.end method
