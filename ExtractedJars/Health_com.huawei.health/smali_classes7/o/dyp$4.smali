.class final Lo/dyp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyp;->setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/List;

.field final synthetic e:I


# direct methods
.method constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 282
    iput p1, p0, Lo/dyp$4;->e:I

    iput-object p2, p0, Lo/dyp$4;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 285
    float-to-int v1, p1

    .line 286
    if-gez v1, :cond_0

    .line 287
    const-string v0, ""

    return-object v0

    .line 288
    :cond_0
    iget v0, p0, Lo/dyp$4;->e:I

    if-ge v1, v0, :cond_1

    .line 289
    iget-object v0, p0, Lo/dyp$4;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 291
    :cond_1
    const-string v0, ""

    return-object v0
.end method
