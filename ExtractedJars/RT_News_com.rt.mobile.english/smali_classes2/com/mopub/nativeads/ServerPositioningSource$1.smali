.class Lcom/mopub/nativeads/ServerPositioningSource$1;
.super Ljava/lang/Object;
.source "ServerPositioningSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/ServerPositioningSource;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/ServerPositioningSource;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ServerPositioningSource;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/mopub/nativeads/ServerPositioningSource$1;->this$0:Lcom/mopub/nativeads/ServerPositioningSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/mopub/nativeads/ServerPositioningSource$1;->this$0:Lcom/mopub/nativeads/ServerPositioningSource;

    invoke-static {v0}, Lcom/mopub/nativeads/ServerPositioningSource;->access$000(Lcom/mopub/nativeads/ServerPositioningSource;)V

    return-void
.end method
