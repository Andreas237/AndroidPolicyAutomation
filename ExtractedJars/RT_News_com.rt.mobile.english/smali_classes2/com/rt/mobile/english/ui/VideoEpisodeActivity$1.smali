.class Lcom/rt/mobile/english/ui/VideoEpisodeActivity$1;
.super Ljava/lang/Object;
.source "VideoEpisodeActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/VideoEpisodeActivity;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/VideoEpisodeActivity;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity$1;->this$0:Lcom/rt/mobile/english/ui/VideoEpisodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 48
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeActivity$1;->this$0:Lcom/rt/mobile/english/ui/VideoEpisodeActivity;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/VideoEpisodeActivity;->onBackPressed()V

    return-void
.end method
