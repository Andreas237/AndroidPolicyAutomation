.class Lo/few$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/few;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/few;


# direct methods
.method private constructor <init>(Lo/few;)V
    .locals 0

    .line 701
    iput-object p1, p0, Lo/few$b;->d:Lo/few;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/few;Lo/few$1;)V
    .locals 0

    .line 701
    invoke-direct {p0, p1}, Lo/few$b;-><init>(Lo/few;)V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 2

    .line 705
    iget-object v0, p0, Lo/few$b;->d:Lo/few;

    invoke-static {v0}, Lo/few;->h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isRefreshing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 707
    iget-object v0, p0, Lo/few$b;->d:Lo/few;

    invoke-static {v0}, Lo/few;->h(Lo/few;)Landroid/support/v4/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 709
    :cond_0
    return-void
.end method
