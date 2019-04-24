.class final Lo/avs$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/avs;->d(Ljava/lang/String;)Lo/brd;
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
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/avs$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 71
    invoke-virtual {p0, p1}, Lo/avs$1;->d(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 75
    invoke-static {}, Lo/awc;->a()Lo/awc;

    move-result-object v0

    iget-object v1, p0, Lo/avs$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/awc;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
