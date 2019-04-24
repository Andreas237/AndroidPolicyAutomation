.class Lo/evt$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evt;->a(Lo/ehe$a;)Lo/elb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evt;


# direct methods
.method constructor <init>(Lo/evt;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/evt$2;->a:Lo/evt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 1

    .line 112
    const/4 v0, 0x0

    return v0
.end method

.method public e(Z)F
    .locals 1

    .line 116
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0
.end method
