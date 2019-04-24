.class public abstract Lcom/ibotta/android/di/ImModule;
.super Ljava/lang/Object;
.source "ImModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideImUtil()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtilImpl;-><init>()V

    return-object v0
.end method
