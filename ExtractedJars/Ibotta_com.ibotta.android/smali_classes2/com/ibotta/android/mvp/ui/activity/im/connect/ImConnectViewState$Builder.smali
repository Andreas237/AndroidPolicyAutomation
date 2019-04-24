.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.super Ljava/lang/Object;
.source "ImConnectViewState.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
.end method

.method public abstract buttonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method

.method public abstract buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method

.method public abstract disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method

.method public abstract imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method

.method public abstract linkAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method

.method public abstract linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
.end method
