.class Lo/fcn$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcn;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fcn;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/fcn;I)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/fcn$2;->a:Lo/fcn;

    iput p2, p0, Lo/fcn$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 118
    iget-object v0, p0, Lo/fcn$2;->a:Lo/fcn;

    invoke-static {v0}, Lo/fcn;->a(Lo/fcn;)Lo/fdw;

    move-result-object v0

    iget v1, p0, Lo/fcn$2;->c:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Lo/fdw;->d(I)V

    .line 119
    return-void
.end method
