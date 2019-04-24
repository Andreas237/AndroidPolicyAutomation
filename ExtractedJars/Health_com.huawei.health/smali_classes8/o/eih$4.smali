.class Lo/eih$4;
.super Lo/eki;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih;->a(ZLo/eih$k;Lo/eih$a;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eih;

.field final synthetic d:Lo/eih$k;


# direct methods
.method constructor <init>(Lo/eih;Landroid/os/Handler;Lo/eih$k;)V
    .locals 0

    .line 932
    iput-object p1, p0, Lo/eih$4;->b:Lo/eih;

    iput-object p3, p0, Lo/eih$4;->d:Lo/eih$k;

    invoke-direct {p0, p2}, Lo/eki;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected c()V
    .locals 1

    .line 939
    iget-object v0, p0, Lo/eih$4;->d:Lo/eih$k;

    invoke-virtual {v0}, Lo/eih$k;->e()V

    .line 940
    return-void
.end method
