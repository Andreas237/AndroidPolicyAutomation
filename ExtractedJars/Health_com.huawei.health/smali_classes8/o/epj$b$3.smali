.class Lo/epj$b$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epj$b;->b()Lo/epj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/epj;

.field final synthetic d:Lo/epk;

.field final synthetic e:Lo/epj$b;


# direct methods
.method constructor <init>(Lo/epj$b;Lo/epj;Lo/epk;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/epj$b$3;->e:Lo/epj$b;

    iput-object p2, p0, Lo/epj$b$3;->b:Lo/epj;

    iput-object p3, p0, Lo/epj$b$3;->d:Lo/epk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 92
    iget-object v0, p0, Lo/epj$b$3;->e:Lo/epj$b;

    invoke-static {v0}, Lo/epj$b;->d(Lo/epj$b;)Lo/epj$a;

    move-result-object v0

    iget-object v1, p0, Lo/epj$b$3;->b:Lo/epj;

    iget-object v2, p0, Lo/epj$b$3;->d:Lo/epk;

    invoke-virtual {v2}, Lo/epk;->d()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lo/epj$a;->a(Landroid/app/Dialog;ZIF)V

    .line 94
    return-void
.end method
