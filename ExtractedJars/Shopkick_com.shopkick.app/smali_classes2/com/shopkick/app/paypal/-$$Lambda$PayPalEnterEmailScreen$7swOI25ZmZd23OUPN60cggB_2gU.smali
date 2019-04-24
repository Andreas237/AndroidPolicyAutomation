.class public final synthetic Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

.field private final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;->f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    iput-boolean p2, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;->f$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    iget-boolean v1, p0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;->f$1:Z

    invoke-static {v0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->lambda$hideOrShowSubmitButton$178(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V

    return-void
.end method
