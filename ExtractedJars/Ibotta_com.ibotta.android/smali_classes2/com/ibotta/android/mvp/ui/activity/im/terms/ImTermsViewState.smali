.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
.super Ljava/lang/Object;
.source "ImTermsViewState.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewState;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
    }
.end annotation


# static fields
.field public static EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->builder()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->EMPTY:Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 10
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object v0

    const-string v1, ""

    .line 11
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->shareInfo(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
    .locals 1

    .line 18
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/terms/AutoValue_ImTermsViewState$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getImDetailHeaderViewState()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
.end method

.method public abstract getShareInfo()Ljava/lang/String;
.end method
