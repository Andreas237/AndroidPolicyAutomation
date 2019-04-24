.class Lo/epn$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epn$a;->b()Lo/epn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/epn;

.field final synthetic e:Lo/epn$a;


# direct methods
.method constructor <init>(Lo/epn$a;Lo/epn;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lo/epn$a$1;->e:Lo/epn$a;

    iput-object p2, p0, Lo/epn$a$1;->b:Lo/epn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 98
    iget-object v0, p0, Lo/epn$a$1;->e:Lo/epn$a;

    invoke-static {v0}, Lo/epn$a;->b(Lo/epn$a;)Lo/epn$d;

    move-result-object v0

    iget-object v1, p0, Lo/epn$a$1;->b:Lo/epn;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/epn$d;->c(Landroid/app/Dialog;II)V

    .line 102
    return-void
.end method
