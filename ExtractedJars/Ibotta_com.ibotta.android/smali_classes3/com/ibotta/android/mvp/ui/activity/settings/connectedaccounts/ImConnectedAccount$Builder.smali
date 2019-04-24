.class public abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.super Ljava/lang/Object;
.source "ImConnectedAccount.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
.end method

.method public abstract id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method

.method public abstract logoResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param
.end method

.method public abstract logoUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method

.method public abstract name(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method

.method public abstract retailerId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method

.method public abstract type(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method

.method public abstract username(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
.end method
