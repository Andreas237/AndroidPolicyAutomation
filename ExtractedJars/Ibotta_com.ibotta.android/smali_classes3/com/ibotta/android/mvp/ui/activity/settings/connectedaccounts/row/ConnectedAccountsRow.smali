.class public Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;
.super Ljava/lang/Object;
.source "ConnectedAccountsRow.java"


# instance fields
.field private connected:Z

.field private connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;Z)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    .line 16
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->connected:Z

    return-void
.end method


# virtual methods
.method public getConnectedAccount()Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->connectedAccount:Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccount;

    return-object v0
.end method

.method public isConnected()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;->connected:Z

    return v0
.end method
