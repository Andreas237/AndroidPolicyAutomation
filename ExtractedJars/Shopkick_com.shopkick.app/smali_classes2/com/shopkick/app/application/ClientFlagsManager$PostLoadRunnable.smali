.class Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;
.super Ljava/lang/Object;
.source "ClientFlagsManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/ClientFlagsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PostLoadRunnable"
.end annotation


# instance fields
.field private clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V
    .locals 0

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 280
    iput-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/ClientFlagsManager;->setClientFlagsFromLoad(Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V

    return-void
.end method
