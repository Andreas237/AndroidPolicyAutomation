.class public Lcom/shopkick/sdk/webviewsdk/WebviewAction;
.super Ljava/lang/Object;
.source "WebviewAction.java"


# instance fields
.field activityIntent:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invokeAction(Landroid/content/Context;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewAction;->activityIntent:Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public setActionIntent(Landroid/content/Intent;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewAction;->activityIntent:Landroid/content/Intent;

    return-void
.end method
