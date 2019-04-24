.class public interface abstract Lcom/ibotta/android/tracking/sdk/LifecycleTracker;
.super Ljava/lang/Object;
.source "LifecycleTracker.java"


# virtual methods
.method public abstract init()V
.end method

.method public abstract trackAppBecameForeground(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppCreate(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppPause(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppResume(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppStart(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppStop(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackAppWentBackground(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V
.end method

.method public abstract trackOpenReferrer(Landroid/support/v4/app/FragmentActivity;)V
.end method

.method public abstract trackRegistration()V
.end method
