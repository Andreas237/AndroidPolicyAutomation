.class public Lcom/unionpay/tsmservice/TsmActivityListener;
.super Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/unionpay/tsmservice/TsmActivityListener;->mContext:Landroid/content/Context;

    .line 14
    return-void
.end method


# virtual methods
.method public StartActivity(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 20
    new-instance v1, Landroid/content/ComponentName;

    invoke-direct {v1, p1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 22
    invoke-virtual {v2, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 23
    invoke-virtual {v2, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 24
    iget-object v0, p0, Lcom/unionpay/tsmservice/TsmActivityListener;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 25
    return-void
.end method
