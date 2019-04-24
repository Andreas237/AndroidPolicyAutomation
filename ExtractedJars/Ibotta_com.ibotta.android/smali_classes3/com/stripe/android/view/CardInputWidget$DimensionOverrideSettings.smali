.class interface abstract Lcom/stripe/android/view/CardInputWidget$DimensionOverrideSettings;
.super Ljava/lang/Object;
.source "CardInputWidget.java"


# annotations
.annotation build Landroid/support/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardInputWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "DimensionOverrideSettings"
.end annotation


# virtual methods
.method public abstract getFrameWidth()I
.end method

.method public abstract getPixelWidth(Ljava/lang/String;Landroid/widget/EditText;)I
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/widget/EditText;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
