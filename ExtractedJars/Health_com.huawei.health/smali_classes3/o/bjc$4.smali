.class final Lo/bjc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjc;->b(Ljava/lang/String;J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/bjc$4;->e:Ljava/lang/String;

    iput-wide p2, p0, Lo/bjc$4;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 71
    invoke-virtual {p0, p1}, Lo/bjc$4;->d(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 75
    new-instance v3, Lo/bja;

    invoke-direct {v3}, Lo/bja;-><init>()V

    .line 76
    iget-object v0, p0, Lo/bjc$4;->e:Ljava/lang/String;

    iget-wide v1, p0, Lo/bjc$4;->a:J

    invoke-virtual {v3, v0, v1, v2}, Lo/bja;->d(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
