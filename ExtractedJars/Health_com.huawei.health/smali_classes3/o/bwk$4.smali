.class Lo/bwk$4;
.super Landroid/util/Property;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/Property<Lo/bwk;Ljava/lang/Float;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/bwk;


# direct methods
.method constructor <init>(Lo/bwk;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/bwk$4;->b:Lo/bwk;

    invoke-direct {p0, p2, p3}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Lo/bwk;Ljava/lang/Float;)V
    .locals 1

    .line 46
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Lo/bwk;->setKnobExpandRate(F)V

    .line 47
    return-void
.end method

.method public d(Lo/bwk;)Ljava/lang/Float;
    .locals 1

    .line 51
    invoke-virtual {p1}, Lo/bwk;->getKnobExpandRate()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 43
    move-object v0, p1

    check-cast v0, Lo/bwk;

    invoke-virtual {p0, v0}, Lo/bwk$4;->d(Lo/bwk;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 43
    move-object v0, p1

    check-cast v0, Lo/bwk;

    move-object v1, p2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {p0, v0, v1}, Lo/bwk$4;->c(Lo/bwk;Ljava/lang/Float;)V

    return-void
.end method
