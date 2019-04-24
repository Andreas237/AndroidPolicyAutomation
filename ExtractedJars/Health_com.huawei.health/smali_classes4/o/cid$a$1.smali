.class Lo/cid$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cid$a;->c()Lo/cid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cid;

.field final synthetic e:Lo/cid$a;


# direct methods
.method constructor <init>(Lo/cid$a;Lo/cid;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/cid$a$1;->e:Lo/cid$a;

    iput-object p2, p0, Lo/cid$a$1;->b:Lo/cid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 99
    iget-object v0, p0, Lo/cid$a$1;->e:Lo/cid$a;

    invoke-static {v0}, Lo/cid$a;->d(Lo/cid$a;)Lo/cid$d;

    move-result-object v0

    iget-object v1, p0, Lo/cid$a$1;->b:Lo/cid;

    const/4 v2, -0x2

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cid$d;->c(Landroid/app/Dialog;II)V

    .line 101
    return-void
.end method
