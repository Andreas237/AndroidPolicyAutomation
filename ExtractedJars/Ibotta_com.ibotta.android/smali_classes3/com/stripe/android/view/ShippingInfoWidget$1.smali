.class Lcom/stripe/android/view/ShippingInfoWidget$1;
.super Ljava/lang/Object;
.source "ShippingInfoWidget.java"

# interfaces
.implements Lcom/stripe/android/view/CountryAutoCompleteTextView$CountryChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/ShippingInfoWidget;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/ShippingInfoWidget;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/ShippingInfoWidget;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget$1;->this$0:Lcom/stripe/android/view/ShippingInfoWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCountryChanged(Ljava/lang/String;)V
    .locals 1

    .line 218
    iget-object p1, p0, Lcom/stripe/android/view/ShippingInfoWidget$1;->this$0:Lcom/stripe/android/view/ShippingInfoWidget;

    invoke-static {p1}, Lcom/stripe/android/view/ShippingInfoWidget;->access$000(Lcom/stripe/android/view/ShippingInfoWidget;)Lcom/stripe/android/view/CountryAutoCompleteTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryAutoCompleteTextView;->getSelectedCountryCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/view/ShippingInfoWidget;->access$100(Lcom/stripe/android/view/ShippingInfoWidget;Ljava/lang/String;)V

    return-void
.end method
