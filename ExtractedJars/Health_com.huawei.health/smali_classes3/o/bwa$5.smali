.class Lo/bwa$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bwf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 650
    iput-object p1, p0, Lo/bwa$5;->e:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 653
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 658
    if-eqz p1, :cond_0

    .line 659
    iget-object v0, p0, Lo/bwa$5;->e:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->D:Lo/bwp;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwp;->setVisibility(I)V

    .line 660
    iget-object v0, p0, Lo/bwa$5;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->d(Lo/bwa;)V

    .line 663
    :cond_0
    return-void
.end method
