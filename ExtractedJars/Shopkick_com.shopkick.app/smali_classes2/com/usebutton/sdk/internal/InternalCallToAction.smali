.class public Lcom/usebutton/sdk/internal/InternalCallToAction;
.super Lcom/usebutton/sdk/purchasepath/CallToAction;
.source "InternalCallToAction.java"


# instance fields
.field private final iconUrl:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;I)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, v0, p2, p3}, Lcom/usebutton/sdk/purchasepath/CallToAction;-><init>(ILjava/lang/String;I)V

    .line 21
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InternalCallToAction;->iconUrl:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public getIconUrl()Landroid/net/Uri;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalCallToAction;->iconUrl:Landroid/net/Uri;

    return-object v0
.end method
