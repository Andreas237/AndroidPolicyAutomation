.class Lo/cbu$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ccq;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbu;->bw()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cbu;


# direct methods
.method constructor <init>(Lo/cbu;)V
    .locals 0

    .line 4956
    iput-object p1, p0, Lo/cbu$7;->c:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(IJ)V
    .locals 4

    .line 4960
    const-string v0, "Track_SportManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onTreadmillStyleChange style is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , time is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4961
    iget-object v0, p0, Lo/cbu$7;->c:Lo/cbu;

    invoke-static {v0, p1}, Lo/cbu;->h(Lo/cbu;I)I

    .line 4962
    return-void
.end method
