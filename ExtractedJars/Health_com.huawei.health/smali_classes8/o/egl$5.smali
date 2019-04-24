.class Lo/egl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekh$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egl;->c(Lo/egl$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eih;

.field final synthetic b:Lo/egl$c;

.field final synthetic c:Lo/eih;

.field final synthetic d:J

.field final synthetic e:Lo/egl$c;

.field final synthetic h:Lo/ekh;

.field final synthetic k:Lo/egl;


# direct methods
.method constructor <init>(Lo/egl;Lo/eih;Lo/eih;JLo/egl$c;Lo/egl$c;Lo/ekh;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/egl$5;->k:Lo/egl;

    iput-object p2, p0, Lo/egl$5;->c:Lo/eih;

    iput-object p3, p0, Lo/egl$5;->a:Lo/eih;

    iput-wide p4, p0, Lo/egl$5;->d:J

    iput-object p6, p0, Lo/egl$5;->b:Lo/egl$c;

    iput-object p7, p0, Lo/egl$5;->e:Lo/egl$c;

    iput-object p8, p0, Lo/egl$5;->h:Lo/ekh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 219
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 3

    .line 225
    iget-object v0, p0, Lo/egl$5;->k:Lo/egl;

    invoke-static {v0}, Lo/egl;->b(Lo/egl;)Lo/ekj;

    move-result-object v0

    new-instance v1, Lo/egl$5$1;

    invoke-direct {v1, p0}, Lo/egl$5$1;-><init>(Lo/egl$5;)V

    const/16 v2, 0x320

    invoke-virtual {v0, v1, v2}, Lo/ekj;->d(Landroid/animation/ValueAnimator$AnimatorUpdateListener;I)V

    .line 277
    return-void
.end method
