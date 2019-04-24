.class public Lo/ahp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Double;

.field public e:Lo/acu;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/Double;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ahp;->b:Ljava/lang/Double;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    .line 31
    iput-boolean p1, p0, Lo/ahp;->a:Z

    .line 32
    return-void
.end method

.method public d()Lo/acu;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/ahp;->e:Lo/acu;

    return-object v0
.end method

.method public e(Ljava/lang/Double;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/ahp;->b:Ljava/lang/Double;

    .line 45
    return-void
.end method

.method public e(Lo/acu;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lo/ahp;->e:Lo/acu;

    .line 24
    return-void
.end method

.method public e()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lo/ahp;->a:Z

    return v0
.end method
