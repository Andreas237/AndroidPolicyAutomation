.class Lo/esv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv;->k(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/esv;


# direct methods
.method constructor <init>(Lo/esv;)V
    .locals 0

    .line 1930
    iput-object p1, p0, Lo/esv$5;->e:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1933
    iget-object v0, p0, Lo/esv$5;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->p(Lo/esv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1934
    iget-object v0, p0, Lo/esv$5;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->D(Lo/esv;)V

    .line 1935
    iget-object v0, p0, Lo/esv$5;->e:Lo/esv;

    invoke-static {v0}, Lo/esv;->r(Lo/esv;)V

    .line 1937
    :cond_0
    return-void
.end method
