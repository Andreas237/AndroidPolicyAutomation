.class public interface abstract Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;
.super Ljava/lang/Object;
.source "AutofillExtension.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onAutofillFillAccepted(Lorg/json/JSONObject;)V
.end method

.method public abstract onAutofillFillDeclined()V
.end method

.method public abstract onAutofillFillDisplayed()V
.end method
