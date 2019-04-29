.class public Lcom/rt/mobile/english/ui/BookmarkActivity$$ViewInjector;
.super Ljava/lang/Object;
.source "BookmarkActivity$$ViewInjector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static inject(Lbutterknife/ButterKnife$Finder;Lcom/rt/mobile/english/ui/BookmarkActivity;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field \'toolbar\'"

    const v1, 0x7f090196

    .line 10
    invoke-virtual {p0, p2, v1, v0}, Lbutterknife/ButterKnife$Finder;->findRequiredView(Ljava/lang/Object;ILjava/lang/String;)Landroid/view/View;

    move-result-object p0

    .line 11
    check-cast p0, Landroid/support/v7/widget/Toolbar;

    iput-object p0, p1, Lcom/rt/mobile/english/ui/BookmarkActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void
.end method

.method public static reset(Lcom/rt/mobile/english/ui/BookmarkActivity;)V
    .locals 1

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/rt/mobile/english/ui/BookmarkActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void
.end method
