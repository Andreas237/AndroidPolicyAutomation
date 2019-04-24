.class Lo/fbi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbi;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fbi;


# direct methods
.method constructor <init>(Lo/fbi;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/fbi$3;->e:Lo/fbi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 196
    iget-object v0, p0, Lo/fbi$3;->e:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbd;->d()V

    .line 197
    iget-object v0, p0, Lo/fbi$3;->e:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->a(Lo/fbi;)Landroid/widget/BaseExpandableListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V

    .line 198
    iget-object v0, p0, Lo/fbi$3;->e:Lo/fbi;

    invoke-virtual {v0}, Lo/fbi;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 199
    if-eqz v4, :cond_1

    instance-of v0, v4, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 200
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v5

    .line 201
    const/4 v0, 0x1

    if-eq v5, v0, :cond_0

    .line 202
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "refresh aync needs no brother view"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 205
    move-object v0, v4

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fbi$3;->e:Lo/fbi;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 209
    :cond_1
    iget-object v0, p0, Lo/fbi$3;->e:Lo/fbi;

    invoke-virtual {v0}, Lo/fbi;->invalidate()V

    .line 210
    return-void
.end method
