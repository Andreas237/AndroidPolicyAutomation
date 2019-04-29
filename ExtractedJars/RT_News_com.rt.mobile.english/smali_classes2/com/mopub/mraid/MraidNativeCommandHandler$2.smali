.class Lcom/mopub/mraid/MraidNativeCommandHandler$2;
.super Ljava/lang/Object;
.source "MraidNativeCommandHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mraid/MraidNativeCommandHandler;->showUserDialog(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mraid/MraidNativeCommandHandler;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$failureListener:Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;

.field final synthetic val$imageUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidNativeCommandHandler;Landroid/content/Context;Ljava/lang/String;Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->this$0:Lcom/mopub/mraid/MraidNativeCommandHandler;

    iput-object p2, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$failureListener:Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 434
    iget-object p1, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->this$0:Lcom/mopub/mraid/MraidNativeCommandHandler;

    iget-object p2, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$context:Landroid/content/Context;

    iget-object v0, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$imageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/mopub/mraid/MraidNativeCommandHandler$2;->val$failureListener:Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;

    invoke-virtual {p1, p2, v0, v1}, Lcom/mopub/mraid/MraidNativeCommandHandler;->downloadImage(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/mraid/MraidNativeCommandHandler$MraidCommandFailureListener;)V

    return-void
.end method
