.class public Lo/ccy;
.super Lo/cdc;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lo/cdk;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lo/cdc;-><init>(Lo/cdk;)V

    .line 9
    return-void
.end method


# virtual methods
.method public a(Lo/cgn;)I
    .locals 1

    .line 13
    invoke-virtual {p0}, Lo/ccy;->d()Lo/cdk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cdk;->b()Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 14
    const/4 v0, 0x0

    return v0
.end method
