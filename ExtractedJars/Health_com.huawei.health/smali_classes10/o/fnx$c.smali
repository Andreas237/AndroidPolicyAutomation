.class Lo/fnx$c;
.super Lo/flv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final b:Lo/fmb;


# direct methods
.method constructor <init>(Lo/fmb;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lo/flv;-><init>()V

    .line 52
    iput-object p1, p0, Lo/fnx$c;->b:Lo/fmb;

    .line 53
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 58
    iget-object v0, p0, Lo/fnx$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    invoke-static {}, Lo/fnx;->d()Lo/fty;

    move-result-object v0

    const-string v1, "completing canceled request [MID={}, token={}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fnx$c;->b:Lo/fmb;

    invoke-virtual {v3}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    invoke-virtual {v3}, Lo/fma;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/fnx$c;->b:Lo/fmb;

    invoke-virtual {v3}, Lo/fmb;->c()Lo/fma;

    move-result-object v3

    invoke-virtual {v3}, Lo/fma;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lo/fnx$c;->b:Lo/fmb;

    invoke-virtual {v0}, Lo/fmb;->l()V

    .line 63
    :cond_0
    return-void
.end method
