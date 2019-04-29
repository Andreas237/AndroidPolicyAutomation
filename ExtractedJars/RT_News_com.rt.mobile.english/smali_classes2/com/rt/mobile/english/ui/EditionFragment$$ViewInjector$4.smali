.class final Lcom/rt/mobile/english/ui/EditionFragment$$ViewInjector$4;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "EditionFragment$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/EditionFragment$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/EditionFragment;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$target:Lcom/rt/mobile/english/ui/EditionFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/EditionFragment;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/rt/mobile/english/ui/EditionFragment$$ViewInjector$4;->val$target:Lcom/rt/mobile/english/ui/EditionFragment;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/rt/mobile/english/ui/EditionFragment$$ViewInjector$4;->val$target:Lcom/rt/mobile/english/ui/EditionFragment;

    invoke-virtual {v0, p1}, Lcom/rt/mobile/english/ui/EditionFragment;->onClick(Landroid/view/View;)V

    return-void
.end method
