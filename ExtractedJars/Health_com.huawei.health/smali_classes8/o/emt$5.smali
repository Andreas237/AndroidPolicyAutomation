.class Lo/emt$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emt;->setXAxisValueFormatter(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Lo/emt;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/emt;ILjava/util/List;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/emt$5;->c:Lo/emt;

    iput p2, p0, Lo/emt$5;->e:I

    iput-object p3, p0, Lo/emt$5;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 136
    float-to-int v1, p1

    .line 137
    if-gez v1, :cond_0

    .line 138
    const-string v0, ""

    return-object v0

    .line 139
    :cond_0
    iget v0, p0, Lo/emt$5;->e:I

    if-ge v1, v0, :cond_1

    .line 140
    iget-object v0, p0, Lo/emt$5;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 142
    :cond_1
    const-string v0, ""

    return-object v0
.end method
