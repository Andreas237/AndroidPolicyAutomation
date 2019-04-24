.class Lo/byn$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byn;->a(Landroid/content/Context;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lo/byn;


# direct methods
.method constructor <init>(Lo/byn;Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/byn$3;->c:Lo/byn;

    iput-object p2, p0, Lo/byn$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lo/byn$3;->c:Lo/byn;

    invoke-static {v0}, Lo/byn;->e(Lo/byn;)Lo/byn$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 179
    iget-object v0, p0, Lo/byn$3;->c:Lo/byn;

    invoke-static {v0}, Lo/byn;->e(Lo/byn;)Lo/byn$d;

    move-result-object v0

    iget-object v1, p0, Lo/byn$3;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/byn$d;->e(Ljava/lang/String;)V

    .line 181
    :cond_0
    return-void
.end method
