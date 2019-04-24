.class Lo/cgr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgr;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgr;

.field final synthetic e:Landroid/view/View;


# direct methods
.method constructor <init>(Lo/cgr;Landroid/view/View;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lo/cgr$2;->c:Lo/cgr;

    iput-object p2, p0, Lo/cgr$2;->e:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 312
    iget-object v0, p0, Lo/cgr$2;->c:Lo/cgr;

    iget-object v1, p0, Lo/cgr$2;->e:Landroid/view/View;

    invoke-static {v0, v1}, Lo/cgr;->c(Lo/cgr;Landroid/view/View;)V

    .line 313
    return-void
.end method
