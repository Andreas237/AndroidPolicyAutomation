.class Lcom/rt/mobile/english/ui/ArticlesFragment$1;
.super Ljava/lang/Object;
.source "ArticlesFragment.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/widget/SlidingTabLayout$TabColorizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticlesFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticlesFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticlesFragment;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDividerColor(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getIndicatorColor(I)I
    .locals 1

    .line 71
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticlesFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesFragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060018

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    return p1
.end method
