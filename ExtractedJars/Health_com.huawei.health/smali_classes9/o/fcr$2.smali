.class Lo/fcr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcr;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fcr;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/fcr;I)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/fcr$2;->d:Lo/fcr;

    iput p2, p0, Lo/fcr$2;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 77
    iget-object v0, p0, Lo/fcr$2;->d:Lo/fcr;

    invoke-static {v0}, Lo/fcr;->d(Lo/fcr;)I

    move-result v0

    iget v1, p0, Lo/fcr$2;->e:I

    if-ne v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lo/fcr$2;->d:Lo/fcr;

    iget-object v1, p0, Lo/fcr$2;->d:Lo/fcr;

    invoke-static {v1}, Lo/fcr;->e(Lo/fcr;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fcr;->c(Lo/fcr;I)I

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lo/fcr$2;->d:Lo/fcr;

    iget v1, p0, Lo/fcr$2;->e:I

    invoke-static {v0, v1}, Lo/fcr;->c(Lo/fcr;I)I

    .line 82
    :goto_0
    iget-object v0, p0, Lo/fcr$2;->d:Lo/fcr;

    invoke-virtual {v0}, Lo/fcr;->notifyDataSetChanged()V

    .line 83
    return-void
.end method
