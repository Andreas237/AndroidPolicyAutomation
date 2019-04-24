.class public Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;
.super Ljava/lang/Object;
.source "BgcPaymentAccountsPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private sourceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSourceToken()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;->sourceToken:Ljava/lang/String;

    return-object v0
.end method

.method public setSourceToken(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsPutCall$CallParams;->sourceToken:Ljava/lang/String;

    return-void
.end method
