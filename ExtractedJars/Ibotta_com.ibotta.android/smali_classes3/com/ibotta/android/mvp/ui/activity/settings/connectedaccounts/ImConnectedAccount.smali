.class public abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
.super Ljava/lang/Object;
.source "ImConnectedAccount.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;
    .locals 2

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;-><init>()V

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_ImConnectedAccount$Builder;->id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->retailerId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    .line 17
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->name(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    .line 18
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->logoResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    .line 19
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->logoUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->type(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    .line 21
    invoke-virtual {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->username(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;

    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ImConnectedAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getRetailerId()I
.end method

.method public abstract getUsername()Ljava/lang/String;
.end method
