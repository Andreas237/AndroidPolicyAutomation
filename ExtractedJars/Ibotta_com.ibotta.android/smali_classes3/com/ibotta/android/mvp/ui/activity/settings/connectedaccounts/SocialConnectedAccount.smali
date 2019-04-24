.class public abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;
.super Ljava/lang/Object;
.source "SocialConnectedAccount.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    }
.end annotation


# static fields
.field public static final FACEBOOK:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

.field public static final GOOGLE:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 13
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    const v1, 0x7f11015e

    const v2, 0x7f080225

    .line 14
    invoke-static {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->builder(IILcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->FACEBOOK:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    .line 15
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    const v1, 0x7f110173

    const v2, 0x7f080228

    .line 16
    invoke-static {v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->builder(IILcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->GOOGLE:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static builder(IILcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
    .locals 2
    .param p0    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    .line 19
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;-><init>()V

    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/AutoValue_SocialConnectedAccount$Builder;->id(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->nameResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    .line 22
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->logoResId(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    const-string p1, ""

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->logoUrl(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    .line 24
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->type(I)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    .line 25
    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    const-string p1, ""

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;->userName(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getAuthType()Lcom/ibotta/api/model/auth/AuthType;
.end method

.method public abstract getId()I
.end method

.method public abstract getLogoResId()I
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation
.end method

.method public abstract getLogoUrl()Ljava/lang/String;
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 40
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount;->getNameResId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getNameResId()I
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation
.end method

.method public abstract getType()I
.end method

.method public abstract getUserName()Ljava/lang/String;
.end method

.method public abstract toBuilder()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/SocialConnectedAccount$Builder;
.end method
