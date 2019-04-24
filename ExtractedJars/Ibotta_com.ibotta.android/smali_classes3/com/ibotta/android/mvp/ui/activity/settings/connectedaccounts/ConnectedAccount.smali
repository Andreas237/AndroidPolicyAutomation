.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;
.super Ljava/lang/Object;
.source "ConnectedAccount.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount$Type;
    }
.end annotation


# static fields
.field public static final IM:I = 0x1

.field public static final SOCIAL:I


# virtual methods
.method public abstract getId()I
.end method

.method public abstract getLogoResId()I
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation
.end method

.method public abstract getLogoUrl()Ljava/lang/String;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getType()I
.end method
