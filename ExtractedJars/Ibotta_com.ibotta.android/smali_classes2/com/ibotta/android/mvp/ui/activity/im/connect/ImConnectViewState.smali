.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;
.super Ljava/lang/Object;
.source "ImConnectViewState.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;,
        Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 10
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->EMPTY:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 11
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    const-string v1, ""

    .line 12
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/base/text/LinkTextViewState;->EMPTY:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 13
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    const-string v1, ""

    .line 14
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->disclaimer(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->CREATE:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 15
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->buttonAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;->LOGIN:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;

    .line 16
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->linkAction(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Builder;
    .locals 1

    .line 27
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/AutoValue_ImConnectViewState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getButtonAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
.end method

.method public abstract getButtonText()Ljava/lang/String;
.end method

.method public abstract getDisclaimer()Ljava/lang/String;
.end method

.method public abstract getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
.end method

.method public abstract getLinkAction()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectViewState$Action;
.end method

.method public abstract getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
.end method
