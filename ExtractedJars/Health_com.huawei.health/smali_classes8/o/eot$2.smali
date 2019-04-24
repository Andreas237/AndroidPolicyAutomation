.class Lo/eot$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eot;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eot;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lo/eot;I)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/eot$2;->a:Lo/eot;

    iput p2, p0, Lo/eot$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/eot$2;->a:Lo/eot;

    iget-object v0, v0, Lo/eot;->d:Ljava/util/List;

    iget v1, p0, Lo/eot$2;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 113
    iget-object v0, p0, Lo/eot$2;->a:Lo/eot;

    invoke-virtual {v0}, Lo/eot;->notifyDataSetChanged()V

    .line 115
    iget-object v0, p0, Lo/eot$2;->a:Lo/eot;

    invoke-static {v0}, Lo/eot;->d(Lo/eot;)Lo/eoy;

    move-result-object v0

    invoke-interface {v0}, Lo/eoy;->e()V

    .line 117
    return-void
.end method
