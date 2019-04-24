.class final Lo/els$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/els;->setXAxisValueFormatter(Lo/ln;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:I


# direct methods
.method constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 202
    iput p1, p0, Lo/els$1;->b:I

    iput-object p2, p0, Lo/els$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 205
    float-to-int v1, p1

    .line 206
    if-gez v1, :cond_0

    .line 207
    const-string v0, ""

    return-object v0

    .line 208
    :cond_0
    iget v0, p0, Lo/els$1;->b:I

    if-ge v1, v0, :cond_1

    .line 209
    iget-object v0, p0, Lo/els$1;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 211
    :cond_1
    const-string v0, ""

    return-object v0
.end method
