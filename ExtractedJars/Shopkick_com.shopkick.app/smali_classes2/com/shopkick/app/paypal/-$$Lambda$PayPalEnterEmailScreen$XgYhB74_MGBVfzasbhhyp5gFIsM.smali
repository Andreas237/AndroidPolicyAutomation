.class public final synthetic Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XgYhB74_MGBVfzasbhhyp5gFIsM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XgYhB74_MGBVfzasbhhyp5gFIsM;->f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    return-void
.end method


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 7

    iget-object v0, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XgYhB74_MGBVfzasbhhyp5gFIsM;->f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->lambda$getSpaceInputFilter$179(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
