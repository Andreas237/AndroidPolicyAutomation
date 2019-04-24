.class Lo/eya$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eya;->e(Lo/ekw;Lo/eic;Lo/ehe$a;)Lo/elb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eya;


# direct methods
.method constructor <init>(Lo/eya;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/eya$3;->e:Lo/eya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 1

    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public e(Z)F
    .locals 1

    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    return v0
.end method
