.class Lo/cfe$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfe;->d(Lo/elb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cfe;

.field final synthetic e:Lo/elb;


# direct methods
.method constructor <init>(Lo/cfe;Lo/elb;)V
    .locals 0

    .line 950
    iput-object p1, p0, Lo/cfe$4;->c:Lo/cfe;

    iput-object p2, p0, Lo/cfe$4;->e:Lo/elb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 0

    .line 952
    return p1
.end method

.method public e(Z)F
    .locals 1

    .line 956
    if-eqz p1, :cond_0

    .line 958
    iget-object v0, p0, Lo/cfe$4;->e:Lo/elb;

    invoke-virtual {v0}, Lo/elb;->X()F

    move-result v0

    return v0

    .line 961
    :cond_0
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0
.end method
