.class interface abstract Lcom/stripe/android/StripeApiHandler$LoggingResponseListener;
.super Ljava/lang/Object;
.source "StripeApiHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/StripeApiHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "LoggingResponseListener"
.end annotation


# virtual methods
.method public abstract onLoggingResponse(Lcom/stripe/android/StripeResponse;)V
.end method

.method public abstract onStripeException(Lcom/stripe/android/exception/StripeException;)V
.end method

.method public abstract shouldLogTest()Z
.end method
