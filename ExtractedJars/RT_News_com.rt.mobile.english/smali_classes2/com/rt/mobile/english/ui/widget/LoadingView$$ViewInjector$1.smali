.class final Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "LoadingView$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/widget/LoadingView;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$target:Lcom/rt/mobile/english/ui/widget/LoadingView;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/LoadingView;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector$1;->val$target:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 19
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView$$ViewInjector$1;->val$target:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/LoadingView;->retry()V

    return-void
.end method
