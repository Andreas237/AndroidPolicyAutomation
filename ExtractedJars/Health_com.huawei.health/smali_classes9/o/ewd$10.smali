.class Lo/ewd$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ewq$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ewd;->e(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic e:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;II)V
    .locals 0

    .line 663
    iput-object p1, p0, Lo/ewd$10;->e:Lo/ewd;

    iput p2, p0, Lo/ewd$10;->c:I

    iput p3, p0, Lo/ewd$10;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 666
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTimer closeMeasureOrCalibrate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    iget-object v0, p0, Lo/ewd$10;->e:Lo/ewd;

    iget v1, p0, Lo/ewd$10;->c:I

    iget v2, p0, Lo/ewd$10;->b:I

    invoke-virtual {v0, v1, v2}, Lo/ewd;->d(II)V

    .line 668
    iget-object v0, p0, Lo/ewd$10;->e:Lo/ewd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ewd;->f(Z)V

    .line 669
    return-void
.end method
