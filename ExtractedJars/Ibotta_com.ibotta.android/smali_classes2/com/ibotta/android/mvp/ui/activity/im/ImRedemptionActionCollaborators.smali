.class public Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;
.super Ljava/lang/Object;
.source "ImRedemptionActionCollaborators.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createConnectedAccountDialog(Landroid/content/Context;)Lcom/ibotta/android/view/ImConnectedAccountDialog;
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/view/ImConnectedAccountDialog;

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/ImConnectedAccountDialog;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public createNoActivatedOffersDialog(Landroid/content/Context;)Lcom/ibotta/android/view/ImNoActivatedOffersDialog;
    .locals 1

    .line 10
    new-instance v0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
