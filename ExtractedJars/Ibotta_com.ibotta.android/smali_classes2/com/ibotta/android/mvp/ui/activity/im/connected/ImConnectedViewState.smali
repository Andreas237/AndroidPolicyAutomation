.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;
.super Ljava/lang/Object;
.source "ImConnectedViewState.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 10
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->EMPTY:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 11
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object v0

    const-string v1, ""

    .line 12
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->buttonText(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/base/text/LinkTextViewState;->EMPTY:Lcom/ibotta/android/views/base/text/LinkTextViewState;

    .line 13
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->linkTextViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/connected/ImConnectedViewState$Builder;
    .locals 1

    .line 21
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/connected/AutoValue_ImConnectedViewState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getButtonText()Ljava/lang/String;
.end method

.method public abstract getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
.end method

.method public abstract getLinkTextViewState()Lcom/ibotta/android/views/base/text/LinkTextViewState;
.end method
