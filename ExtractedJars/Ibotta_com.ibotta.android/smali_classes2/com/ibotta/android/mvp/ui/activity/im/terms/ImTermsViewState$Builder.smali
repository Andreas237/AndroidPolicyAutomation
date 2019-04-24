.class public abstract Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
.super Ljava/lang/Object;
.source "ImTermsViewState.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;
.end method

.method public abstract imDetailHeaderViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
.end method

.method public abstract shareInfo(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState$Builder;
.end method
