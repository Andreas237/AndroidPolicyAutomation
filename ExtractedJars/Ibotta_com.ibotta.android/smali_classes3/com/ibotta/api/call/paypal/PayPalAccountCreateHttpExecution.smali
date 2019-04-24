.class public Lcom/ibotta/api/call/paypal/PayPalAccountCreateHttpExecution;
.super Lcom/ibotta/api/execution/ApiOkHttpExecution;
.source "PayPalAccountCreateHttpExecution.java"


# instance fields
.field private final payPalCallbackUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/execution/ApiOkHttpExecution;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalAccountCreateHttpExecution;->payPalCallbackUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    .line 19
    iget-object p1, p0, Lcom/ibotta/api/call/paypal/PayPalAccountCreateHttpExecution;->payPalCallbackUrl:Ljava/lang/String;

    return-object p1
.end method
