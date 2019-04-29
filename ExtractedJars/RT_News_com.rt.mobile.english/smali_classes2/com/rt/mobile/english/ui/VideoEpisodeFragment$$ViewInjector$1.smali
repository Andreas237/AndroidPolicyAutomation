.class final Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "VideoEpisodeFragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/VideoEpisodeFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$target:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/VideoEpisodeFragment;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector$1;->val$target:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 24
    iget-object p1, p0, Lcom/rt/mobile/english/ui/VideoEpisodeFragment$$ViewInjector$1;->val$target:Lcom/rt/mobile/english/ui/VideoEpisodeFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/VideoEpisodeFragment;->onPlayButtonClick()V

    return-void
.end method
