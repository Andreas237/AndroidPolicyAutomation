.class Lo/egz$d$2;
.super Lo/enk$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egz$d;->e()Lo/egz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egz$d;


# direct methods
.method constructor <init>(Lo/egz$d;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/egz$d$2;->c:Lo/egz$d;

    invoke-direct {p0}, Lo/enk$c;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/String;)V
    .locals 1

    .line 89
    invoke-static {p1}, Lo/egz;->b(I)I

    .line 90
    invoke-static {p2}, Lo/egz;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    return-void
.end method
