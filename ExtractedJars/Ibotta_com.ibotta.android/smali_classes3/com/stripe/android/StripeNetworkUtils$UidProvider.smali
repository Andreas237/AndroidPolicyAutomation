.class interface abstract Lcom/stripe/android/StripeNetworkUtils$UidProvider;
.super Ljava/lang/Object;
.source "StripeNetworkUtils.java"


# annotations
.annotation build Landroid/support/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/StripeNetworkUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "UidProvider"
.end annotation


# virtual methods
.method public abstract getPackageName()Ljava/lang/String;
.end method

.method public abstract getUid()Ljava/lang/String;
.end method
