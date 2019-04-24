.class public Lcom/stripe/android/PaymentConfiguration;
.super Ljava/lang/Object;
.source "PaymentConfiguration.java"


# static fields
.field private static mInstance:Lcom/stripe/android/PaymentConfiguration;


# instance fields
.field private mPublishableKey:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public static getInstance()Lcom/stripe/android/PaymentConfiguration;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 28
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->mInstance:Lcom/stripe/android/PaymentConfiguration;

    if-eqz v0, :cond_0

    return-object v0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempted to get instance of PaymentConfiguration without initialization."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public getPublishableKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/stripe/android/PaymentConfiguration;->mPublishableKey:Ljava/lang/String;

    return-object v0
.end method
