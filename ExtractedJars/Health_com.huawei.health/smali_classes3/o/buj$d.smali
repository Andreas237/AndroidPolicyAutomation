.class public Lo/buj$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/buj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/buj;

.field private d:J


# direct methods
.method public constructor <init>(Lo/buj;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lo/buj$d;->c:Lo/buj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 3

    .line 204
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->c(Lo/buj;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 205
    iput-wide p1, p0, Lo/buj$d;->d:J

    .line 206
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->c(Lo/buj;)Landroid/os/Handler;

    move-result-object v0

    iget-wide v1, p0, Lo/buj$d;->d:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 207
    return-void
.end method

.method public e()V
    .locals 1

    .line 210
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->c(Lo/buj;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 211
    return-void
.end method

.method public run()V
    .locals 4

    .line 215
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->a(Lo/buj;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    .line 216
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->a(Lo/buj;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 217
    iget-object v0, p0, Lo/buj$d;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->c(Lo/buj;)Landroid/os/Handler;

    move-result-object v0

    iget-wide v1, p0, Lo/buj$d;->d:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 218
    return-void
.end method
