.class Lcom/usebutton/sdk/internal/views/AssetImageView$2;
.super Ljava/lang/Object;
.source "AssetImageView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/AssetImageView;->invalidateDrawable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/AssetImageView;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/AssetImageView;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/AssetImageView$2;->this$0:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/AssetImageView$2;->this$0:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/AssetImageView;->access$000(Lcom/usebutton/sdk/internal/views/AssetImageView;)V

    return-void
.end method
